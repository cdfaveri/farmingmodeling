/*
* generated by Xtext
*/
package org.gemoc.agro.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.gemoc.agro.services.ActivitiesDSLGrammarAccess;

public class ActivitiesDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private ActivitiesDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.gemoc.agro.ui.contentassist.antlr.internal.InternalActivitiesDSLParser createParser() {
		org.gemoc.agro.ui.contentassist.antlr.internal.InternalActivitiesDSLParser result = new org.gemoc.agro.ui.contentassist.antlr.internal.InternalActivitiesDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPredicateAccess().getAlternatives(), "rule__Predicate__Alternatives");
					put(grammarAccess.getMonthAccess().getAlternatives(), "rule__Month__Alternatives");
					put(grammarAccess.getCompAccess().getAlternatives(), "rule__Comp__Alternatives");
					put(grammarAccess.getTempUnitAccess().getAlternatives(), "rule__TempUnit__Alternatives");
					put(grammarAccess.getFrequencyAccess().getAlternatives(), "rule__Frequency__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getResourceKindAccess().getGroup(), "rule__ResourceKind__Group__0");
					put(grammarAccess.getCultureAccess().getGroup(), "rule__Culture__Group__0");
					put(grammarAccess.getExploitationActivityAccess().getGroup(), "rule__ExploitationActivity__Group__0");
					put(grammarAccess.getExploitationActivityAccess().getGroup_3(), "rule__ExploitationActivity__Group_3__0");
					put(grammarAccess.getExploitationActivityAccess().getGroup_4(), "rule__ExploitationActivity__Group_4__0");
					put(grammarAccess.getExploitationActivityAccess().getGroup_4_2(), "rule__ExploitationActivity__Group_4_2__0");
					put(grammarAccess.getExploitationActivityAccess().getGroup_5(), "rule__ExploitationActivity__Group_5__0");
					put(grammarAccess.getExploitationActivityAccess().getGroup_5_2(), "rule__ExploitationActivity__Group_5_2__0");
					put(grammarAccess.getActivityResourceAccess().getGroup(), "rule__ActivityResource__Group__0");
					put(grammarAccess.getNoRainAccess().getGroup(), "rule__NoRain__Group__0");
					put(grammarAccess.getTempOfTheDayAccess().getGroup(), "rule__TempOfTheDay__Group__0");
					put(grammarAccess.getDelaySinceActivyAccess().getGroup(), "rule__DelaySinceActivy__Group__0");
					put(grammarAccess.getDelaySinceActivyAccess().getGroup_2(), "rule__DelaySinceActivy__Group_2__0");
					put(grammarAccess.getGrainIsAccess().getGroup(), "rule__GrainIs__Group__0");
					put(grammarAccess.getDateAccess().getGroup(), "rule__Date__Group__0");
					put(grammarAccess.getModelAccess().getCulturesAssignment_0(), "rule__Model__CulturesAssignment_0");
					put(grammarAccess.getModelAccess().getResourceKindsAssignment_1(), "rule__Model__ResourceKindsAssignment_1");
					put(grammarAccess.getResourceKindAccess().getNameAssignment_1(), "rule__ResourceKind__NameAssignment_1");
					put(grammarAccess.getCultureAccess().getNameAssignment_1(), "rule__Culture__NameAssignment_1");
					put(grammarAccess.getCultureAccess().getActivitiesAssignment_3(), "rule__Culture__ActivitiesAssignment_3");
					put(grammarAccess.getExploitationActivityAccess().getNameAssignment_1(), "rule__ExploitationActivity__NameAssignment_1");
					put(grammarAccess.getExploitationActivityAccess().getFrequencyAssignment_2(), "rule__ExploitationActivity__FrequencyAssignment_2");
					put(grammarAccess.getExploitationActivityAccess().getStartDateAssignment_3_1(), "rule__ExploitationActivity__StartDateAssignment_3_1");
					put(grammarAccess.getExploitationActivityAccess().getEndDateAssignment_3_3(), "rule__ExploitationActivity__EndDateAssignment_3_3");
					put(grammarAccess.getExploitationActivityAccess().getPredicatesAssignment_4_1(), "rule__ExploitationActivity__PredicatesAssignment_4_1");
					put(grammarAccess.getExploitationActivityAccess().getPredicatesAssignment_4_2_1(), "rule__ExploitationActivity__PredicatesAssignment_4_2_1");
					put(grammarAccess.getExploitationActivityAccess().getUsesAssignment_5_1(), "rule__ExploitationActivity__UsesAssignment_5_1");
					put(grammarAccess.getExploitationActivityAccess().getUsesAssignment_5_2_1(), "rule__ExploitationActivity__UsesAssignment_5_2_1");
					put(grammarAccess.getActivityResourceAccess().getQuantityAssignment_0(), "rule__ActivityResource__QuantityAssignment_0");
					put(grammarAccess.getActivityResourceAccess().getResourceKindAssignment_1(), "rule__ActivityResource__ResourceKindAssignment_1");
					put(grammarAccess.getNoRainAccess().getDaysAssignment_1(), "rule__NoRain__DaysAssignment_1");
					put(grammarAccess.getTempOfTheDayAccess().getComparisonAssignment_1(), "rule__TempOfTheDay__ComparisonAssignment_1");
					put(grammarAccess.getTempOfTheDayAccess().getLowerTempBoundAssignment_2(), "rule__TempOfTheDay__LowerTempBoundAssignment_2");
					put(grammarAccess.getTempOfTheDayAccess().getUnitAssignment_3(), "rule__TempOfTheDay__UnitAssignment_3");
					put(grammarAccess.getDelaySinceActivyAccess().getPrerequisiteAssignment_1(), "rule__DelaySinceActivy__PrerequisiteAssignment_1");
					put(grammarAccess.getDelaySinceActivyAccess().getDaysAssignment_2_1(), "rule__DelaySinceActivy__DaysAssignment_2_1");
					put(grammarAccess.getGrainIsAccess().getStateAssignment_1(), "rule__GrainIs__StateAssignment_1");
					put(grammarAccess.getDateAccess().getDayAssignment_0(), "rule__Date__DayAssignment_0");
					put(grammarAccess.getDateAccess().getMonthAssignment_1(), "rule__Date__MonthAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.gemoc.agro.ui.contentassist.antlr.internal.InternalActivitiesDSLParser typedParser = (org.gemoc.agro.ui.contentassist.antlr.internal.InternalActivitiesDSLParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ActivitiesDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ActivitiesDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
