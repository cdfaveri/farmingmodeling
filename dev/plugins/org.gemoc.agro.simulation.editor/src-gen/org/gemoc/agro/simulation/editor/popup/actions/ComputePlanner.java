package org.gemoc.agro.simulation.editor.popup.actions;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.gemoc.agro.simulation.Simulation;
import org.gemoc.agro.simulation.solver.PlanAgro;

import com.google.common.collect.Lists;

public class ComputePlanner implements IObjectActionDelegate {

	private Shell shell;

	private Collection<Simulation> selected = Lists.newArrayList();

	/**
	 * Constructor for Action1.
	 */
	public ComputePlanner() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (selected.size() > 0) {
			for (Simulation simulation : selected) {
				Session s = SessionManager.INSTANCE.getSession(simulation);
				if (s != null) {
					s.getTransactionalEditingDomain()
							.getCommandStack()
							.execute(
									new RecordingCommand(s
											.getTransactionalEditingDomain()) {

										@Override
										protected void doExecute() {
											PlanAgro planner = new PlanAgro();
											planner.createSchedule(simulation);
										}
									});
				}
			}

		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		selected.clear();
		if (selection instanceof StructuredSelection) {
			Iterator<Object> it = ((StructuredSelection) selection).iterator();
			while (it.hasNext()) {
				Object n = it.next();
				if (n instanceof Simulation) {
					this.selected.add((Simulation) n);
				}

			}
		}
	}

}
