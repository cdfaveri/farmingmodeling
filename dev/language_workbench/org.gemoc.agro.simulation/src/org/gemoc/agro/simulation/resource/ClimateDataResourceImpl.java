package org.gemoc.agro.simulation.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.gemoc.agro.activitiesDSL.Month;
import org.gemoc.agro.simulation.ClimateData;
import org.gemoc.agro.simulation.Day;
import org.gemoc.agro.simulation.SimulationFactory;

import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.io.CharStreams;

public class ClimateDataResourceImpl extends ResourceImpl {

  public ClimateDataResourceImpl(URI uri) {
    super(uri);
  }

  @Override
  protected void doLoad(InputStream inputStream, Map<?, ?> options)
      throws IOException {
    getContents().clear();
    ClimateData climate = SimulationFactory.eINSTANCE.createClimateData();
    String content = CharStreams.toString(new InputStreamReader(inputStream,
        Charsets.US_ASCII));

    List<String> lines = Lists.newArrayList(Splitter.on('\n')
        .omitEmptyStrings().split(content));

    try {
      Splitter dotSplitter = Splitter.on(':');
      Splitter quoteSplitter = Splitter.on(';');
      for (String line : lines) {
        List<String> fields = Lists.newArrayList(quoteSplitter.split(line));
        if (fields.size() >= 8) {
          if (fields.get(0).startsWith("Station")) {
            Iterator<String> iterator = dotSplitter.split(fields.get(0))
                .iterator();
            iterator.next();
            climate.setName(iterator.next());
          }
          try {
            Day day = SimulationFactory.eINSTANCE.createDay();
            day.setDay(Integer.valueOf(fields.get(3)));
            day.setMonth(Month.get(Integer.valueOf(fields.get(2)) - 1));
            day.setRain(Float.valueOf(fields.get(5)));
            day.setTemperature(Float.valueOf(fields.get(6)));
            day.setRay(Float.valueOf(fields.get(7)));
            ((BasicEList<Day>) climate.getDays()).addUnique(day);
          } catch (NumberFormatException e) {
            /*
             * Might happen if we are on the header line and have no data yet.
             */
          }
        }
      }

      getContents().add(climate);
    } finally {

    }
  }

  @Override
  public void save(Map<?, ?> options) throws IOException {
    /*
     * We don't want the save to have any effect on the underlying file.
     */
  }

  @Override
  protected void doSave(OutputStream outputStream, Map<?, ?> options)
      throws IOException {
    /*
     * might be called by the saving policy to decide wether or not to save.
     */
  }

}
