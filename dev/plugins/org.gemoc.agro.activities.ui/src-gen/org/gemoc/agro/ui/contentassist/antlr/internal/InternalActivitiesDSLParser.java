package org.gemoc.agro.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.gemoc.agro.services.ActivitiesDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivitiesDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'jan'", "'feb'", "'mar'", "'apr'", "'may'", "'jun'", "'jul'", "'aug'", "'sept'", "'oct'", "'nov'", "'dec'", "'>'", "'<'", "'\\u00B0C'", "'\\u00B0F'", "'once'", "'daily'", "'weekly'", "'monthly'", "'quaterly'", "'yearly'", "'resource'", "'culture'", "'{'", "'}'", "'activity'", "'from '", "'to'", "'['", "']'", "'&&'", "'no rain since'", "'days'", "'temperature'", "'after'", "'is done since'", "'grain is'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalActivitiesDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActivitiesDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActivitiesDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g"; }


     
     	private ActivitiesDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ActivitiesDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:61:1: ( ruleModel EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:76:1: ( rule__Model__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleResourceKind"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:88:1: entryRuleResourceKind : ruleResourceKind EOF ;
    public final void entryRuleResourceKind() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:89:1: ( ruleResourceKind EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:90:1: ruleResourceKind EOF
            {
             before(grammarAccess.getResourceKindRule()); 
            pushFollow(FOLLOW_ruleResourceKind_in_entryRuleResourceKind121);
            ruleResourceKind();

            state._fsp--;

             after(grammarAccess.getResourceKindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceKind128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResourceKind"


    // $ANTLR start "ruleResourceKind"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:97:1: ruleResourceKind : ( ( rule__ResourceKind__Group__0 ) ) ;
    public final void ruleResourceKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:101:2: ( ( ( rule__ResourceKind__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:102:1: ( ( rule__ResourceKind__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:102:1: ( ( rule__ResourceKind__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:103:1: ( rule__ResourceKind__Group__0 )
            {
             before(grammarAccess.getResourceKindAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:104:1: ( rule__ResourceKind__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:104:2: rule__ResourceKind__Group__0
            {
            pushFollow(FOLLOW_rule__ResourceKind__Group__0_in_ruleResourceKind154);
            rule__ResourceKind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceKindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResourceKind"


    // $ANTLR start "entryRuleCulture"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:116:1: entryRuleCulture : ruleCulture EOF ;
    public final void entryRuleCulture() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:117:1: ( ruleCulture EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:118:1: ruleCulture EOF
            {
             before(grammarAccess.getCultureRule()); 
            pushFollow(FOLLOW_ruleCulture_in_entryRuleCulture181);
            ruleCulture();

            state._fsp--;

             after(grammarAccess.getCultureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCulture188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCulture"


    // $ANTLR start "ruleCulture"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:125:1: ruleCulture : ( ( rule__Culture__Group__0 ) ) ;
    public final void ruleCulture() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:129:2: ( ( ( rule__Culture__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:130:1: ( ( rule__Culture__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:130:1: ( ( rule__Culture__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:131:1: ( rule__Culture__Group__0 )
            {
             before(grammarAccess.getCultureAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:132:1: ( rule__Culture__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:132:2: rule__Culture__Group__0
            {
            pushFollow(FOLLOW_rule__Culture__Group__0_in_ruleCulture214);
            rule__Culture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCultureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCulture"


    // $ANTLR start "entryRuleExploitationActivity"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:144:1: entryRuleExploitationActivity : ruleExploitationActivity EOF ;
    public final void entryRuleExploitationActivity() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:145:1: ( ruleExploitationActivity EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:146:1: ruleExploitationActivity EOF
            {
             before(grammarAccess.getExploitationActivityRule()); 
            pushFollow(FOLLOW_ruleExploitationActivity_in_entryRuleExploitationActivity241);
            ruleExploitationActivity();

            state._fsp--;

             after(grammarAccess.getExploitationActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExploitationActivity248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExploitationActivity"


    // $ANTLR start "ruleExploitationActivity"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:153:1: ruleExploitationActivity : ( ( rule__ExploitationActivity__Group__0 ) ) ;
    public final void ruleExploitationActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:157:2: ( ( ( rule__ExploitationActivity__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:158:1: ( ( rule__ExploitationActivity__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:158:1: ( ( rule__ExploitationActivity__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:159:1: ( rule__ExploitationActivity__Group__0 )
            {
             before(grammarAccess.getExploitationActivityAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:160:1: ( rule__ExploitationActivity__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:160:2: rule__ExploitationActivity__Group__0
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group__0_in_ruleExploitationActivity274);
            rule__ExploitationActivity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExploitationActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExploitationActivity"


    // $ANTLR start "entryRulePredicate"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:172:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:173:1: ( rulePredicate EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:174:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate301);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:181:1: rulePredicate : ( ( rule__Predicate__Alternatives ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:185:2: ( ( ( rule__Predicate__Alternatives ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:186:1: ( ( rule__Predicate__Alternatives ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:186:1: ( ( rule__Predicate__Alternatives ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:187:1: ( rule__Predicate__Alternatives )
            {
             before(grammarAccess.getPredicateAccess().getAlternatives()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:188:1: ( rule__Predicate__Alternatives )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:188:2: rule__Predicate__Alternatives
            {
            pushFollow(FOLLOW_rule__Predicate__Alternatives_in_rulePredicate334);
            rule__Predicate__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleNoRain"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:200:1: entryRuleNoRain : ruleNoRain EOF ;
    public final void entryRuleNoRain() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:201:1: ( ruleNoRain EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:202:1: ruleNoRain EOF
            {
             before(grammarAccess.getNoRainRule()); 
            pushFollow(FOLLOW_ruleNoRain_in_entryRuleNoRain361);
            ruleNoRain();

            state._fsp--;

             after(grammarAccess.getNoRainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoRain368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoRain"


    // $ANTLR start "ruleNoRain"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:209:1: ruleNoRain : ( ( rule__NoRain__Group__0 ) ) ;
    public final void ruleNoRain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:213:2: ( ( ( rule__NoRain__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:214:1: ( ( rule__NoRain__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:214:1: ( ( rule__NoRain__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:215:1: ( rule__NoRain__Group__0 )
            {
             before(grammarAccess.getNoRainAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:216:1: ( rule__NoRain__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:216:2: rule__NoRain__Group__0
            {
            pushFollow(FOLLOW_rule__NoRain__Group__0_in_ruleNoRain394);
            rule__NoRain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoRainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoRain"


    // $ANTLR start "entryRuleTempOfTheDay"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:228:1: entryRuleTempOfTheDay : ruleTempOfTheDay EOF ;
    public final void entryRuleTempOfTheDay() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:229:1: ( ruleTempOfTheDay EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:230:1: ruleTempOfTheDay EOF
            {
             before(grammarAccess.getTempOfTheDayRule()); 
            pushFollow(FOLLOW_ruleTempOfTheDay_in_entryRuleTempOfTheDay421);
            ruleTempOfTheDay();

            state._fsp--;

             after(grammarAccess.getTempOfTheDayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTempOfTheDay428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTempOfTheDay"


    // $ANTLR start "ruleTempOfTheDay"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:237:1: ruleTempOfTheDay : ( ( rule__TempOfTheDay__Group__0 ) ) ;
    public final void ruleTempOfTheDay() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:241:2: ( ( ( rule__TempOfTheDay__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:242:1: ( ( rule__TempOfTheDay__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:242:1: ( ( rule__TempOfTheDay__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:243:1: ( rule__TempOfTheDay__Group__0 )
            {
             before(grammarAccess.getTempOfTheDayAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:244:1: ( rule__TempOfTheDay__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:244:2: rule__TempOfTheDay__Group__0
            {
            pushFollow(FOLLOW_rule__TempOfTheDay__Group__0_in_ruleTempOfTheDay454);
            rule__TempOfTheDay__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTempOfTheDayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTempOfTheDay"


    // $ANTLR start "entryRuleDelaySinceActivy"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:256:1: entryRuleDelaySinceActivy : ruleDelaySinceActivy EOF ;
    public final void entryRuleDelaySinceActivy() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:257:1: ( ruleDelaySinceActivy EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:258:1: ruleDelaySinceActivy EOF
            {
             before(grammarAccess.getDelaySinceActivyRule()); 
            pushFollow(FOLLOW_ruleDelaySinceActivy_in_entryRuleDelaySinceActivy481);
            ruleDelaySinceActivy();

            state._fsp--;

             after(grammarAccess.getDelaySinceActivyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelaySinceActivy488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDelaySinceActivy"


    // $ANTLR start "ruleDelaySinceActivy"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:265:1: ruleDelaySinceActivy : ( ( rule__DelaySinceActivy__Group__0 ) ) ;
    public final void ruleDelaySinceActivy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:269:2: ( ( ( rule__DelaySinceActivy__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:270:1: ( ( rule__DelaySinceActivy__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:270:1: ( ( rule__DelaySinceActivy__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:271:1: ( rule__DelaySinceActivy__Group__0 )
            {
             before(grammarAccess.getDelaySinceActivyAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:272:1: ( rule__DelaySinceActivy__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:272:2: rule__DelaySinceActivy__Group__0
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__Group__0_in_ruleDelaySinceActivy514);
            rule__DelaySinceActivy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelaySinceActivyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelaySinceActivy"


    // $ANTLR start "entryRuleGrainIs"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:284:1: entryRuleGrainIs : ruleGrainIs EOF ;
    public final void entryRuleGrainIs() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:285:1: ( ruleGrainIs EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:286:1: ruleGrainIs EOF
            {
             before(grammarAccess.getGrainIsRule()); 
            pushFollow(FOLLOW_ruleGrainIs_in_entryRuleGrainIs541);
            ruleGrainIs();

            state._fsp--;

             after(grammarAccess.getGrainIsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrainIs548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrainIs"


    // $ANTLR start "ruleGrainIs"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:293:1: ruleGrainIs : ( ( rule__GrainIs__Group__0 ) ) ;
    public final void ruleGrainIs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:297:2: ( ( ( rule__GrainIs__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:298:1: ( ( rule__GrainIs__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:298:1: ( ( rule__GrainIs__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:299:1: ( rule__GrainIs__Group__0 )
            {
             before(grammarAccess.getGrainIsAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:300:1: ( rule__GrainIs__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:300:2: rule__GrainIs__Group__0
            {
            pushFollow(FOLLOW_rule__GrainIs__Group__0_in_ruleGrainIs574);
            rule__GrainIs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrainIsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrainIs"


    // $ANTLR start "entryRuleDate"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:312:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:313:1: ( ruleDate EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:314:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate601);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:321:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:325:2: ( ( ( rule__Date__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:326:1: ( ( rule__Date__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:326:1: ( ( rule__Date__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:327:1: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:328:1: ( rule__Date__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:328:2: rule__Date__Group__0
            {
            pushFollow(FOLLOW_rule__Date__Group__0_in_ruleDate634);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "ruleMonth"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:341:1: ruleMonth : ( ( rule__Month__Alternatives ) ) ;
    public final void ruleMonth() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:345:1: ( ( ( rule__Month__Alternatives ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:346:1: ( ( rule__Month__Alternatives ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:346:1: ( ( rule__Month__Alternatives ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:347:1: ( rule__Month__Alternatives )
            {
             before(grammarAccess.getMonthAccess().getAlternatives()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:348:1: ( rule__Month__Alternatives )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:348:2: rule__Month__Alternatives
            {
            pushFollow(FOLLOW_rule__Month__Alternatives_in_ruleMonth671);
            rule__Month__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMonthAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMonth"


    // $ANTLR start "ruleComp"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:360:1: ruleComp : ( ( rule__Comp__Alternatives ) ) ;
    public final void ruleComp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:364:1: ( ( ( rule__Comp__Alternatives ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:365:1: ( ( rule__Comp__Alternatives ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:365:1: ( ( rule__Comp__Alternatives ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:366:1: ( rule__Comp__Alternatives )
            {
             before(grammarAccess.getCompAccess().getAlternatives()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:367:1: ( rule__Comp__Alternatives )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:367:2: rule__Comp__Alternatives
            {
            pushFollow(FOLLOW_rule__Comp__Alternatives_in_ruleComp707);
            rule__Comp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComp"


    // $ANTLR start "ruleTempUnit"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:379:1: ruleTempUnit : ( ( rule__TempUnit__Alternatives ) ) ;
    public final void ruleTempUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:383:1: ( ( ( rule__TempUnit__Alternatives ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:384:1: ( ( rule__TempUnit__Alternatives ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:384:1: ( ( rule__TempUnit__Alternatives ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:385:1: ( rule__TempUnit__Alternatives )
            {
             before(grammarAccess.getTempUnitAccess().getAlternatives()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:386:1: ( rule__TempUnit__Alternatives )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:386:2: rule__TempUnit__Alternatives
            {
            pushFollow(FOLLOW_rule__TempUnit__Alternatives_in_ruleTempUnit743);
            rule__TempUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTempUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTempUnit"


    // $ANTLR start "ruleFrequency"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:398:1: ruleFrequency : ( ( rule__Frequency__Alternatives ) ) ;
    public final void ruleFrequency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:402:1: ( ( ( rule__Frequency__Alternatives ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:403:1: ( ( rule__Frequency__Alternatives ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:403:1: ( ( rule__Frequency__Alternatives ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:404:1: ( rule__Frequency__Alternatives )
            {
             before(grammarAccess.getFrequencyAccess().getAlternatives()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:405:1: ( rule__Frequency__Alternatives )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:405:2: rule__Frequency__Alternatives
            {
            pushFollow(FOLLOW_rule__Frequency__Alternatives_in_ruleFrequency779);
            rule__Frequency__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFrequencyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrequency"


    // $ANTLR start "rule__Predicate__Alternatives"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:416:1: rule__Predicate__Alternatives : ( ( ruleNoRain ) | ( ruleTempOfTheDay ) | ( ruleDelaySinceActivy ) | ( ruleGrainIs ) );
    public final void rule__Predicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:420:1: ( ( ruleNoRain ) | ( ruleTempOfTheDay ) | ( ruleDelaySinceActivy ) | ( ruleGrainIs ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt1=1;
                }
                break;
            case 45:
                {
                alt1=2;
                }
                break;
            case 46:
                {
                alt1=3;
                }
                break;
            case 48:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:421:1: ( ruleNoRain )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:421:1: ( ruleNoRain )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:422:1: ruleNoRain
                    {
                     before(grammarAccess.getPredicateAccess().getNoRainParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNoRain_in_rule__Predicate__Alternatives814);
                    ruleNoRain();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getNoRainParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:427:6: ( ruleTempOfTheDay )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:427:6: ( ruleTempOfTheDay )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:428:1: ruleTempOfTheDay
                    {
                     before(grammarAccess.getPredicateAccess().getTempOfTheDayParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTempOfTheDay_in_rule__Predicate__Alternatives831);
                    ruleTempOfTheDay();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getTempOfTheDayParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:433:6: ( ruleDelaySinceActivy )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:433:6: ( ruleDelaySinceActivy )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:434:1: ruleDelaySinceActivy
                    {
                     before(grammarAccess.getPredicateAccess().getDelaySinceActivyParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDelaySinceActivy_in_rule__Predicate__Alternatives848);
                    ruleDelaySinceActivy();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getDelaySinceActivyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:439:6: ( ruleGrainIs )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:439:6: ( ruleGrainIs )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:440:1: ruleGrainIs
                    {
                     before(grammarAccess.getPredicateAccess().getGrainIsParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleGrainIs_in_rule__Predicate__Alternatives865);
                    ruleGrainIs();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getGrainIsParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Alternatives"


    // $ANTLR start "rule__Month__Alternatives"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:450:1: rule__Month__Alternatives : ( ( ( 'jan' ) ) | ( ( 'feb' ) ) | ( ( 'mar' ) ) | ( ( 'apr' ) ) | ( ( 'may' ) ) | ( ( 'jun' ) ) | ( ( 'jul' ) ) | ( ( 'aug' ) ) | ( ( 'sept' ) ) | ( ( 'oct' ) ) | ( ( 'nov' ) ) | ( ( 'dec' ) ) );
    public final void rule__Month__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:454:1: ( ( ( 'jan' ) ) | ( ( 'feb' ) ) | ( ( 'mar' ) ) | ( ( 'apr' ) ) | ( ( 'may' ) ) | ( ( 'jun' ) ) | ( ( 'jul' ) ) | ( ( 'aug' ) ) | ( ( 'sept' ) ) | ( ( 'oct' ) ) | ( ( 'nov' ) ) | ( ( 'dec' ) ) )
            int alt2=12;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            case 20:
                {
                alt2=10;
                }
                break;
            case 21:
                {
                alt2=11;
                }
                break;
            case 22:
                {
                alt2=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:455:1: ( ( 'jan' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:455:1: ( ( 'jan' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:456:1: ( 'jan' )
                    {
                     before(grammarAccess.getMonthAccess().getJanEnumLiteralDeclaration_0()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:457:1: ( 'jan' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:457:3: 'jan'
                    {
                    match(input,11,FOLLOW_11_in_rule__Month__Alternatives898); 

                    }

                     after(grammarAccess.getMonthAccess().getJanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:462:6: ( ( 'feb' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:462:6: ( ( 'feb' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:463:1: ( 'feb' )
                    {
                     before(grammarAccess.getMonthAccess().getFebEnumLiteralDeclaration_1()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:464:1: ( 'feb' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:464:3: 'feb'
                    {
                    match(input,12,FOLLOW_12_in_rule__Month__Alternatives919); 

                    }

                     after(grammarAccess.getMonthAccess().getFebEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:469:6: ( ( 'mar' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:469:6: ( ( 'mar' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:470:1: ( 'mar' )
                    {
                     before(grammarAccess.getMonthAccess().getMarEnumLiteralDeclaration_2()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:471:1: ( 'mar' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:471:3: 'mar'
                    {
                    match(input,13,FOLLOW_13_in_rule__Month__Alternatives940); 

                    }

                     after(grammarAccess.getMonthAccess().getMarEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:476:6: ( ( 'apr' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:476:6: ( ( 'apr' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:477:1: ( 'apr' )
                    {
                     before(grammarAccess.getMonthAccess().getAprEnumLiteralDeclaration_3()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:478:1: ( 'apr' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:478:3: 'apr'
                    {
                    match(input,14,FOLLOW_14_in_rule__Month__Alternatives961); 

                    }

                     after(grammarAccess.getMonthAccess().getAprEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:483:6: ( ( 'may' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:483:6: ( ( 'may' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:484:1: ( 'may' )
                    {
                     before(grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:485:1: ( 'may' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:485:3: 'may'
                    {
                    match(input,15,FOLLOW_15_in_rule__Month__Alternatives982); 

                    }

                     after(grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:490:6: ( ( 'jun' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:490:6: ( ( 'jun' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:491:1: ( 'jun' )
                    {
                     before(grammarAccess.getMonthAccess().getJunEnumLiteralDeclaration_5()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:492:1: ( 'jun' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:492:3: 'jun'
                    {
                    match(input,16,FOLLOW_16_in_rule__Month__Alternatives1003); 

                    }

                     after(grammarAccess.getMonthAccess().getJunEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:497:6: ( ( 'jul' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:497:6: ( ( 'jul' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:498:1: ( 'jul' )
                    {
                     before(grammarAccess.getMonthAccess().getJulEnumLiteralDeclaration_6()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:499:1: ( 'jul' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:499:3: 'jul'
                    {
                    match(input,17,FOLLOW_17_in_rule__Month__Alternatives1024); 

                    }

                     after(grammarAccess.getMonthAccess().getJulEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:504:6: ( ( 'aug' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:504:6: ( ( 'aug' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:505:1: ( 'aug' )
                    {
                     before(grammarAccess.getMonthAccess().getAugEnumLiteralDeclaration_7()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:506:1: ( 'aug' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:506:3: 'aug'
                    {
                    match(input,18,FOLLOW_18_in_rule__Month__Alternatives1045); 

                    }

                     after(grammarAccess.getMonthAccess().getAugEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:511:6: ( ( 'sept' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:511:6: ( ( 'sept' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:512:1: ( 'sept' )
                    {
                     before(grammarAccess.getMonthAccess().getSeptEnumLiteralDeclaration_8()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:513:1: ( 'sept' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:513:3: 'sept'
                    {
                    match(input,19,FOLLOW_19_in_rule__Month__Alternatives1066); 

                    }

                     after(grammarAccess.getMonthAccess().getSeptEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:518:6: ( ( 'oct' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:518:6: ( ( 'oct' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:519:1: ( 'oct' )
                    {
                     before(grammarAccess.getMonthAccess().getOctEnumLiteralDeclaration_9()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:520:1: ( 'oct' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:520:3: 'oct'
                    {
                    match(input,20,FOLLOW_20_in_rule__Month__Alternatives1087); 

                    }

                     after(grammarAccess.getMonthAccess().getOctEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:525:6: ( ( 'nov' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:525:6: ( ( 'nov' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:526:1: ( 'nov' )
                    {
                     before(grammarAccess.getMonthAccess().getNovEnumLiteralDeclaration_10()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:527:1: ( 'nov' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:527:3: 'nov'
                    {
                    match(input,21,FOLLOW_21_in_rule__Month__Alternatives1108); 

                    }

                     after(grammarAccess.getMonthAccess().getNovEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:532:6: ( ( 'dec' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:532:6: ( ( 'dec' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:533:1: ( 'dec' )
                    {
                     before(grammarAccess.getMonthAccess().getDecEnumLiteralDeclaration_11()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:534:1: ( 'dec' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:534:3: 'dec'
                    {
                    match(input,22,FOLLOW_22_in_rule__Month__Alternatives1129); 

                    }

                     after(grammarAccess.getMonthAccess().getDecEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Alternatives"


    // $ANTLR start "rule__Comp__Alternatives"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:544:1: rule__Comp__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) );
    public final void rule__Comp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:548:1: ( ( ( '>' ) ) | ( ( '<' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:549:1: ( ( '>' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:549:1: ( ( '>' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:550:1: ( '>' )
                    {
                     before(grammarAccess.getCompAccess().getMoreThanEnumLiteralDeclaration_0()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:551:1: ( '>' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:551:3: '>'
                    {
                    match(input,23,FOLLOW_23_in_rule__Comp__Alternatives1165); 

                    }

                     after(grammarAccess.getCompAccess().getMoreThanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:556:6: ( ( '<' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:556:6: ( ( '<' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:557:1: ( '<' )
                    {
                     before(grammarAccess.getCompAccess().getLessThanEnumLiteralDeclaration_1()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:558:1: ( '<' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:558:3: '<'
                    {
                    match(input,24,FOLLOW_24_in_rule__Comp__Alternatives1186); 

                    }

                     after(grammarAccess.getCompAccess().getLessThanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Alternatives"


    // $ANTLR start "rule__TempUnit__Alternatives"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:568:1: rule__TempUnit__Alternatives : ( ( ( '\\u00B0C' ) ) | ( ( '\\u00B0F' ) ) );
    public final void rule__TempUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:572:1: ( ( ( '\\u00B0C' ) ) | ( ( '\\u00B0F' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:573:1: ( ( '\\u00B0C' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:573:1: ( ( '\\u00B0C' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:574:1: ( '\\u00B0C' )
                    {
                     before(grammarAccess.getTempUnitAccess().getCelsiusEnumLiteralDeclaration_0()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:575:1: ( '\\u00B0C' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:575:3: '\\u00B0C'
                    {
                    match(input,25,FOLLOW_25_in_rule__TempUnit__Alternatives1222); 

                    }

                     after(grammarAccess.getTempUnitAccess().getCelsiusEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:580:6: ( ( '\\u00B0F' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:580:6: ( ( '\\u00B0F' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:581:1: ( '\\u00B0F' )
                    {
                     before(grammarAccess.getTempUnitAccess().getFarenheitEnumLiteralDeclaration_1()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:582:1: ( '\\u00B0F' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:582:3: '\\u00B0F'
                    {
                    match(input,26,FOLLOW_26_in_rule__TempUnit__Alternatives1243); 

                    }

                     after(grammarAccess.getTempUnitAccess().getFarenheitEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempUnit__Alternatives"


    // $ANTLR start "rule__Frequency__Alternatives"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:592:1: rule__Frequency__Alternatives : ( ( ( 'once' ) ) | ( ( 'daily' ) ) | ( ( 'weekly' ) ) | ( ( 'monthly' ) ) | ( ( 'quaterly' ) ) | ( ( 'yearly' ) ) );
    public final void rule__Frequency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:596:1: ( ( ( 'once' ) ) | ( ( 'daily' ) ) | ( ( 'weekly' ) ) | ( ( 'monthly' ) ) | ( ( 'quaterly' ) ) | ( ( 'yearly' ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt5=1;
                }
                break;
            case 28:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            case 30:
                {
                alt5=4;
                }
                break;
            case 31:
                {
                alt5=5;
                }
                break;
            case 32:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:597:1: ( ( 'once' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:597:1: ( ( 'once' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:598:1: ( 'once' )
                    {
                     before(grammarAccess.getFrequencyAccess().getOnceEnumLiteralDeclaration_0()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:599:1: ( 'once' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:599:3: 'once'
                    {
                    match(input,27,FOLLOW_27_in_rule__Frequency__Alternatives1279); 

                    }

                     after(grammarAccess.getFrequencyAccess().getOnceEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:604:6: ( ( 'daily' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:604:6: ( ( 'daily' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:605:1: ( 'daily' )
                    {
                     before(grammarAccess.getFrequencyAccess().getDailyEnumLiteralDeclaration_1()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:606:1: ( 'daily' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:606:3: 'daily'
                    {
                    match(input,28,FOLLOW_28_in_rule__Frequency__Alternatives1300); 

                    }

                     after(grammarAccess.getFrequencyAccess().getDailyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:611:6: ( ( 'weekly' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:611:6: ( ( 'weekly' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:612:1: ( 'weekly' )
                    {
                     before(grammarAccess.getFrequencyAccess().getWeeklyEnumLiteralDeclaration_2()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:613:1: ( 'weekly' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:613:3: 'weekly'
                    {
                    match(input,29,FOLLOW_29_in_rule__Frequency__Alternatives1321); 

                    }

                     after(grammarAccess.getFrequencyAccess().getWeeklyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:618:6: ( ( 'monthly' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:618:6: ( ( 'monthly' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:619:1: ( 'monthly' )
                    {
                     before(grammarAccess.getFrequencyAccess().getMonthlyEnumLiteralDeclaration_3()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:620:1: ( 'monthly' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:620:3: 'monthly'
                    {
                    match(input,30,FOLLOW_30_in_rule__Frequency__Alternatives1342); 

                    }

                     after(grammarAccess.getFrequencyAccess().getMonthlyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:625:6: ( ( 'quaterly' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:625:6: ( ( 'quaterly' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:626:1: ( 'quaterly' )
                    {
                     before(grammarAccess.getFrequencyAccess().getQuaterlyEnumLiteralDeclaration_4()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:627:1: ( 'quaterly' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:627:3: 'quaterly'
                    {
                    match(input,31,FOLLOW_31_in_rule__Frequency__Alternatives1363); 

                    }

                     after(grammarAccess.getFrequencyAccess().getQuaterlyEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:632:6: ( ( 'yearly' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:632:6: ( ( 'yearly' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:633:1: ( 'yearly' )
                    {
                     before(grammarAccess.getFrequencyAccess().getYearlyEnumLiteralDeclaration_5()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:634:1: ( 'yearly' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:634:3: 'yearly'
                    {
                    match(input,32,FOLLOW_32_in_rule__Frequency__Alternatives1384); 

                    }

                     after(grammarAccess.getFrequencyAccess().getYearlyEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:646:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:650:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:651:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01417);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01420);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:658:1: rule__Model__Group__0__Impl : ( ( rule__Model__CulturesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:662:1: ( ( ( rule__Model__CulturesAssignment_0 )* ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:663:1: ( ( rule__Model__CulturesAssignment_0 )* )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:663:1: ( ( rule__Model__CulturesAssignment_0 )* )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:664:1: ( rule__Model__CulturesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getCulturesAssignment_0()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:665:1: ( rule__Model__CulturesAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:665:2: rule__Model__CulturesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__CulturesAssignment_0_in_rule__Model__Group__0__Impl1447);
            	    rule__Model__CulturesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCulturesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:675:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:679:1: ( rule__Model__Group__1__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:680:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11478);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:686:1: rule__Model__Group__1__Impl : ( ( rule__Model__ResourceKindsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:690:1: ( ( ( rule__Model__ResourceKindsAssignment_1 )* ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:691:1: ( ( rule__Model__ResourceKindsAssignment_1 )* )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:691:1: ( ( rule__Model__ResourceKindsAssignment_1 )* )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:692:1: ( rule__Model__ResourceKindsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getResourceKindsAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:693:1: ( rule__Model__ResourceKindsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:693:2: rule__Model__ResourceKindsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ResourceKindsAssignment_1_in_rule__Model__Group__1__Impl1505);
            	    rule__Model__ResourceKindsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getResourceKindsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__ResourceKind__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:707:1: rule__ResourceKind__Group__0 : rule__ResourceKind__Group__0__Impl rule__ResourceKind__Group__1 ;
    public final void rule__ResourceKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:711:1: ( rule__ResourceKind__Group__0__Impl rule__ResourceKind__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:712:2: rule__ResourceKind__Group__0__Impl rule__ResourceKind__Group__1
            {
            pushFollow(FOLLOW_rule__ResourceKind__Group__0__Impl_in_rule__ResourceKind__Group__01540);
            rule__ResourceKind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceKind__Group__1_in_rule__ResourceKind__Group__01543);
            rule__ResourceKind__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceKind__Group__0"


    // $ANTLR start "rule__ResourceKind__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:719:1: rule__ResourceKind__Group__0__Impl : ( 'resource' ) ;
    public final void rule__ResourceKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:723:1: ( ( 'resource' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:724:1: ( 'resource' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:724:1: ( 'resource' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:725:1: 'resource'
            {
             before(grammarAccess.getResourceKindAccess().getResourceKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__ResourceKind__Group__0__Impl1571); 
             after(grammarAccess.getResourceKindAccess().getResourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceKind__Group__0__Impl"


    // $ANTLR start "rule__ResourceKind__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:738:1: rule__ResourceKind__Group__1 : rule__ResourceKind__Group__1__Impl ;
    public final void rule__ResourceKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:742:1: ( rule__ResourceKind__Group__1__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:743:2: rule__ResourceKind__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ResourceKind__Group__1__Impl_in_rule__ResourceKind__Group__11602);
            rule__ResourceKind__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceKind__Group__1"


    // $ANTLR start "rule__ResourceKind__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:749:1: rule__ResourceKind__Group__1__Impl : ( ( rule__ResourceKind__NameAssignment_1 ) ) ;
    public final void rule__ResourceKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:753:1: ( ( ( rule__ResourceKind__NameAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:754:1: ( ( rule__ResourceKind__NameAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:754:1: ( ( rule__ResourceKind__NameAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:755:1: ( rule__ResourceKind__NameAssignment_1 )
            {
             before(grammarAccess.getResourceKindAccess().getNameAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:756:1: ( rule__ResourceKind__NameAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:756:2: rule__ResourceKind__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ResourceKind__NameAssignment_1_in_rule__ResourceKind__Group__1__Impl1629);
            rule__ResourceKind__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceKindAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceKind__Group__1__Impl"


    // $ANTLR start "rule__Culture__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:770:1: rule__Culture__Group__0 : rule__Culture__Group__0__Impl rule__Culture__Group__1 ;
    public final void rule__Culture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:774:1: ( rule__Culture__Group__0__Impl rule__Culture__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:775:2: rule__Culture__Group__0__Impl rule__Culture__Group__1
            {
            pushFollow(FOLLOW_rule__Culture__Group__0__Impl_in_rule__Culture__Group__01663);
            rule__Culture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Culture__Group__1_in_rule__Culture__Group__01666);
            rule__Culture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__0"


    // $ANTLR start "rule__Culture__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:782:1: rule__Culture__Group__0__Impl : ( 'culture' ) ;
    public final void rule__Culture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:786:1: ( ( 'culture' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:787:1: ( 'culture' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:787:1: ( 'culture' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:788:1: 'culture'
            {
             before(grammarAccess.getCultureAccess().getCultureKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Culture__Group__0__Impl1694); 
             after(grammarAccess.getCultureAccess().getCultureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__0__Impl"


    // $ANTLR start "rule__Culture__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:801:1: rule__Culture__Group__1 : rule__Culture__Group__1__Impl rule__Culture__Group__2 ;
    public final void rule__Culture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:805:1: ( rule__Culture__Group__1__Impl rule__Culture__Group__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:806:2: rule__Culture__Group__1__Impl rule__Culture__Group__2
            {
            pushFollow(FOLLOW_rule__Culture__Group__1__Impl_in_rule__Culture__Group__11725);
            rule__Culture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Culture__Group__2_in_rule__Culture__Group__11728);
            rule__Culture__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__1"


    // $ANTLR start "rule__Culture__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:813:1: rule__Culture__Group__1__Impl : ( ( rule__Culture__NameAssignment_1 ) ) ;
    public final void rule__Culture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:817:1: ( ( ( rule__Culture__NameAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:818:1: ( ( rule__Culture__NameAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:818:1: ( ( rule__Culture__NameAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:819:1: ( rule__Culture__NameAssignment_1 )
            {
             before(grammarAccess.getCultureAccess().getNameAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:820:1: ( rule__Culture__NameAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:820:2: rule__Culture__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Culture__NameAssignment_1_in_rule__Culture__Group__1__Impl1755);
            rule__Culture__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCultureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__1__Impl"


    // $ANTLR start "rule__Culture__Group__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:830:1: rule__Culture__Group__2 : rule__Culture__Group__2__Impl rule__Culture__Group__3 ;
    public final void rule__Culture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:834:1: ( rule__Culture__Group__2__Impl rule__Culture__Group__3 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:835:2: rule__Culture__Group__2__Impl rule__Culture__Group__3
            {
            pushFollow(FOLLOW_rule__Culture__Group__2__Impl_in_rule__Culture__Group__21785);
            rule__Culture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Culture__Group__3_in_rule__Culture__Group__21788);
            rule__Culture__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__2"


    // $ANTLR start "rule__Culture__Group__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:842:1: rule__Culture__Group__2__Impl : ( '{' ) ;
    public final void rule__Culture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:846:1: ( ( '{' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:847:1: ( '{' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:847:1: ( '{' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:848:1: '{'
            {
             before(grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__Culture__Group__2__Impl1816); 
             after(grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__2__Impl"


    // $ANTLR start "rule__Culture__Group__3"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:861:1: rule__Culture__Group__3 : rule__Culture__Group__3__Impl rule__Culture__Group__4 ;
    public final void rule__Culture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:865:1: ( rule__Culture__Group__3__Impl rule__Culture__Group__4 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:866:2: rule__Culture__Group__3__Impl rule__Culture__Group__4
            {
            pushFollow(FOLLOW_rule__Culture__Group__3__Impl_in_rule__Culture__Group__31847);
            rule__Culture__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Culture__Group__4_in_rule__Culture__Group__31850);
            rule__Culture__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__3"


    // $ANTLR start "rule__Culture__Group__3__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:873:1: rule__Culture__Group__3__Impl : ( ( rule__Culture__ActivitiesAssignment_3 )* ) ;
    public final void rule__Culture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:877:1: ( ( ( rule__Culture__ActivitiesAssignment_3 )* ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:878:1: ( ( rule__Culture__ActivitiesAssignment_3 )* )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:878:1: ( ( rule__Culture__ActivitiesAssignment_3 )* )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:879:1: ( rule__Culture__ActivitiesAssignment_3 )*
            {
             before(grammarAccess.getCultureAccess().getActivitiesAssignment_3()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:880:1: ( rule__Culture__ActivitiesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:880:2: rule__Culture__ActivitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Culture__ActivitiesAssignment_3_in_rule__Culture__Group__3__Impl1877);
            	    rule__Culture__ActivitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCultureAccess().getActivitiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__3__Impl"


    // $ANTLR start "rule__Culture__Group__4"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:890:1: rule__Culture__Group__4 : rule__Culture__Group__4__Impl ;
    public final void rule__Culture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:894:1: ( rule__Culture__Group__4__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:895:2: rule__Culture__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Culture__Group__4__Impl_in_rule__Culture__Group__41908);
            rule__Culture__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__4"


    // $ANTLR start "rule__Culture__Group__4__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:901:1: rule__Culture__Group__4__Impl : ( '}' ) ;
    public final void rule__Culture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:905:1: ( ( '}' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:906:1: ( '}' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:906:1: ( '}' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:907:1: '}'
            {
             before(grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_36_in_rule__Culture__Group__4__Impl1936); 
             after(grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__4__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:930:1: rule__ExploitationActivity__Group__0 : rule__ExploitationActivity__Group__0__Impl rule__ExploitationActivity__Group__1 ;
    public final void rule__ExploitationActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:934:1: ( rule__ExploitationActivity__Group__0__Impl rule__ExploitationActivity__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:935:2: rule__ExploitationActivity__Group__0__Impl rule__ExploitationActivity__Group__1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group__0__Impl_in_rule__ExploitationActivity__Group__01977);
            rule__ExploitationActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group__1_in_rule__ExploitationActivity__Group__01980);
            rule__ExploitationActivity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__0"


    // $ANTLR start "rule__ExploitationActivity__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:942:1: rule__ExploitationActivity__Group__0__Impl : ( 'activity' ) ;
    public final void rule__ExploitationActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:946:1: ( ( 'activity' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:947:1: ( 'activity' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:947:1: ( 'activity' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:948:1: 'activity'
            {
             before(grammarAccess.getExploitationActivityAccess().getActivityKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__ExploitationActivity__Group__0__Impl2008); 
             after(grammarAccess.getExploitationActivityAccess().getActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__0__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:961:1: rule__ExploitationActivity__Group__1 : rule__ExploitationActivity__Group__1__Impl rule__ExploitationActivity__Group__2 ;
    public final void rule__ExploitationActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:965:1: ( rule__ExploitationActivity__Group__1__Impl rule__ExploitationActivity__Group__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:966:2: rule__ExploitationActivity__Group__1__Impl rule__ExploitationActivity__Group__2
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group__1__Impl_in_rule__ExploitationActivity__Group__12039);
            rule__ExploitationActivity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group__2_in_rule__ExploitationActivity__Group__12042);
            rule__ExploitationActivity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__1"


    // $ANTLR start "rule__ExploitationActivity__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:973:1: rule__ExploitationActivity__Group__1__Impl : ( ( rule__ExploitationActivity__NameAssignment_1 ) ) ;
    public final void rule__ExploitationActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:977:1: ( ( ( rule__ExploitationActivity__NameAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:978:1: ( ( rule__ExploitationActivity__NameAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:978:1: ( ( rule__ExploitationActivity__NameAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:979:1: ( rule__ExploitationActivity__NameAssignment_1 )
            {
             before(grammarAccess.getExploitationActivityAccess().getNameAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:980:1: ( rule__ExploitationActivity__NameAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:980:2: rule__ExploitationActivity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__NameAssignment_1_in_rule__ExploitationActivity__Group__1__Impl2069);
            rule__ExploitationActivity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExploitationActivityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__1__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:990:1: rule__ExploitationActivity__Group__2 : rule__ExploitationActivity__Group__2__Impl rule__ExploitationActivity__Group__3 ;
    public final void rule__ExploitationActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:994:1: ( rule__ExploitationActivity__Group__2__Impl rule__ExploitationActivity__Group__3 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:995:2: rule__ExploitationActivity__Group__2__Impl rule__ExploitationActivity__Group__3
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group__2__Impl_in_rule__ExploitationActivity__Group__22099);
            rule__ExploitationActivity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group__3_in_rule__ExploitationActivity__Group__22102);
            rule__ExploitationActivity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__2"


    // $ANTLR start "rule__ExploitationActivity__Group__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1002:1: rule__ExploitationActivity__Group__2__Impl : ( ( rule__ExploitationActivity__FrequencyAssignment_2 )? ) ;
    public final void rule__ExploitationActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1006:1: ( ( ( rule__ExploitationActivity__FrequencyAssignment_2 )? ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1007:1: ( ( rule__ExploitationActivity__FrequencyAssignment_2 )? )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1007:1: ( ( rule__ExploitationActivity__FrequencyAssignment_2 )? )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1008:1: ( rule__ExploitationActivity__FrequencyAssignment_2 )?
            {
             before(grammarAccess.getExploitationActivityAccess().getFrequencyAssignment_2()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1009:1: ( rule__ExploitationActivity__FrequencyAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=27 && LA9_0<=32)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1009:2: rule__ExploitationActivity__FrequencyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ExploitationActivity__FrequencyAssignment_2_in_rule__ExploitationActivity__Group__2__Impl2129);
                    rule__ExploitationActivity__FrequencyAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExploitationActivityAccess().getFrequencyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__2__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group__3"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1019:1: rule__ExploitationActivity__Group__3 : rule__ExploitationActivity__Group__3__Impl rule__ExploitationActivity__Group__4 ;
    public final void rule__ExploitationActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1023:1: ( rule__ExploitationActivity__Group__3__Impl rule__ExploitationActivity__Group__4 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1024:2: rule__ExploitationActivity__Group__3__Impl rule__ExploitationActivity__Group__4
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group__3__Impl_in_rule__ExploitationActivity__Group__32160);
            rule__ExploitationActivity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group__4_in_rule__ExploitationActivity__Group__32163);
            rule__ExploitationActivity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__3"


    // $ANTLR start "rule__ExploitationActivity__Group__3__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1031:1: rule__ExploitationActivity__Group__3__Impl : ( ( rule__ExploitationActivity__Group_3__0 )? ) ;
    public final void rule__ExploitationActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1035:1: ( ( ( rule__ExploitationActivity__Group_3__0 )? ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1036:1: ( ( rule__ExploitationActivity__Group_3__0 )? )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1036:1: ( ( rule__ExploitationActivity__Group_3__0 )? )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1037:1: ( rule__ExploitationActivity__Group_3__0 )?
            {
             before(grammarAccess.getExploitationActivityAccess().getGroup_3()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1038:1: ( rule__ExploitationActivity__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1038:2: rule__ExploitationActivity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ExploitationActivity__Group_3__0_in_rule__ExploitationActivity__Group__3__Impl2190);
                    rule__ExploitationActivity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExploitationActivityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__3__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group__4"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1048:1: rule__ExploitationActivity__Group__4 : rule__ExploitationActivity__Group__4__Impl ;
    public final void rule__ExploitationActivity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1052:1: ( rule__ExploitationActivity__Group__4__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1053:2: rule__ExploitationActivity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group__4__Impl_in_rule__ExploitationActivity__Group__42221);
            rule__ExploitationActivity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__4"


    // $ANTLR start "rule__ExploitationActivity__Group__4__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1059:1: rule__ExploitationActivity__Group__4__Impl : ( ( rule__ExploitationActivity__Group_4__0 )? ) ;
    public final void rule__ExploitationActivity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1063:1: ( ( ( rule__ExploitationActivity__Group_4__0 )? ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1064:1: ( ( rule__ExploitationActivity__Group_4__0 )? )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1064:1: ( ( rule__ExploitationActivity__Group_4__0 )? )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1065:1: ( rule__ExploitationActivity__Group_4__0 )?
            {
             before(grammarAccess.getExploitationActivityAccess().getGroup_4()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1066:1: ( rule__ExploitationActivity__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1066:2: rule__ExploitationActivity__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ExploitationActivity__Group_4__0_in_rule__ExploitationActivity__Group__4__Impl2248);
                    rule__ExploitationActivity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExploitationActivityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__4__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_3__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1086:1: rule__ExploitationActivity__Group_3__0 : rule__ExploitationActivity__Group_3__0__Impl rule__ExploitationActivity__Group_3__1 ;
    public final void rule__ExploitationActivity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1090:1: ( rule__ExploitationActivity__Group_3__0__Impl rule__ExploitationActivity__Group_3__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1091:2: rule__ExploitationActivity__Group_3__0__Impl rule__ExploitationActivity__Group_3__1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_3__0__Impl_in_rule__ExploitationActivity__Group_3__02289);
            rule__ExploitationActivity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_3__1_in_rule__ExploitationActivity__Group_3__02292);
            rule__ExploitationActivity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_3__0"


    // $ANTLR start "rule__ExploitationActivity__Group_3__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1098:1: rule__ExploitationActivity__Group_3__0__Impl : ( 'from ' ) ;
    public final void rule__ExploitationActivity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1102:1: ( ( 'from ' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1103:1: ( 'from ' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1103:1: ( 'from ' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1104:1: 'from '
            {
             before(grammarAccess.getExploitationActivityAccess().getFromKeyword_3_0()); 
            match(input,38,FOLLOW_38_in_rule__ExploitationActivity__Group_3__0__Impl2320); 
             after(grammarAccess.getExploitationActivityAccess().getFromKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_3__0__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_3__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1117:1: rule__ExploitationActivity__Group_3__1 : rule__ExploitationActivity__Group_3__1__Impl rule__ExploitationActivity__Group_3__2 ;
    public final void rule__ExploitationActivity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1121:1: ( rule__ExploitationActivity__Group_3__1__Impl rule__ExploitationActivity__Group_3__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1122:2: rule__ExploitationActivity__Group_3__1__Impl rule__ExploitationActivity__Group_3__2
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_3__1__Impl_in_rule__ExploitationActivity__Group_3__12351);
            rule__ExploitationActivity__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_3__2_in_rule__ExploitationActivity__Group_3__12354);
            rule__ExploitationActivity__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_3__1"


    // $ANTLR start "rule__ExploitationActivity__Group_3__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1129:1: rule__ExploitationActivity__Group_3__1__Impl : ( ( rule__ExploitationActivity__StartDateAssignment_3_1 ) ) ;
    public final void rule__ExploitationActivity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1133:1: ( ( ( rule__ExploitationActivity__StartDateAssignment_3_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1134:1: ( ( rule__ExploitationActivity__StartDateAssignment_3_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1134:1: ( ( rule__ExploitationActivity__StartDateAssignment_3_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1135:1: ( rule__ExploitationActivity__StartDateAssignment_3_1 )
            {
             before(grammarAccess.getExploitationActivityAccess().getStartDateAssignment_3_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1136:1: ( rule__ExploitationActivity__StartDateAssignment_3_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1136:2: rule__ExploitationActivity__StartDateAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__StartDateAssignment_3_1_in_rule__ExploitationActivity__Group_3__1__Impl2381);
            rule__ExploitationActivity__StartDateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExploitationActivityAccess().getStartDateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_3__1__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_3__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1146:1: rule__ExploitationActivity__Group_3__2 : rule__ExploitationActivity__Group_3__2__Impl rule__ExploitationActivity__Group_3__3 ;
    public final void rule__ExploitationActivity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1150:1: ( rule__ExploitationActivity__Group_3__2__Impl rule__ExploitationActivity__Group_3__3 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1151:2: rule__ExploitationActivity__Group_3__2__Impl rule__ExploitationActivity__Group_3__3
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_3__2__Impl_in_rule__ExploitationActivity__Group_3__22411);
            rule__ExploitationActivity__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_3__3_in_rule__ExploitationActivity__Group_3__22414);
            rule__ExploitationActivity__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_3__2"


    // $ANTLR start "rule__ExploitationActivity__Group_3__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1158:1: rule__ExploitationActivity__Group_3__2__Impl : ( 'to' ) ;
    public final void rule__ExploitationActivity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1162:1: ( ( 'to' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1163:1: ( 'to' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1163:1: ( 'to' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1164:1: 'to'
            {
             before(grammarAccess.getExploitationActivityAccess().getToKeyword_3_2()); 
            match(input,39,FOLLOW_39_in_rule__ExploitationActivity__Group_3__2__Impl2442); 
             after(grammarAccess.getExploitationActivityAccess().getToKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_3__2__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_3__3"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1177:1: rule__ExploitationActivity__Group_3__3 : rule__ExploitationActivity__Group_3__3__Impl ;
    public final void rule__ExploitationActivity__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1181:1: ( rule__ExploitationActivity__Group_3__3__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1182:2: rule__ExploitationActivity__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_3__3__Impl_in_rule__ExploitationActivity__Group_3__32473);
            rule__ExploitationActivity__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_3__3"


    // $ANTLR start "rule__ExploitationActivity__Group_3__3__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1188:1: rule__ExploitationActivity__Group_3__3__Impl : ( ( rule__ExploitationActivity__EndDateAssignment_3_3 ) ) ;
    public final void rule__ExploitationActivity__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1192:1: ( ( ( rule__ExploitationActivity__EndDateAssignment_3_3 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1193:1: ( ( rule__ExploitationActivity__EndDateAssignment_3_3 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1193:1: ( ( rule__ExploitationActivity__EndDateAssignment_3_3 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1194:1: ( rule__ExploitationActivity__EndDateAssignment_3_3 )
            {
             before(grammarAccess.getExploitationActivityAccess().getEndDateAssignment_3_3()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1195:1: ( rule__ExploitationActivity__EndDateAssignment_3_3 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1195:2: rule__ExploitationActivity__EndDateAssignment_3_3
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__EndDateAssignment_3_3_in_rule__ExploitationActivity__Group_3__3__Impl2500);
            rule__ExploitationActivity__EndDateAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getExploitationActivityAccess().getEndDateAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_3__3__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_4__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1213:1: rule__ExploitationActivity__Group_4__0 : rule__ExploitationActivity__Group_4__0__Impl rule__ExploitationActivity__Group_4__1 ;
    public final void rule__ExploitationActivity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1217:1: ( rule__ExploitationActivity__Group_4__0__Impl rule__ExploitationActivity__Group_4__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1218:2: rule__ExploitationActivity__Group_4__0__Impl rule__ExploitationActivity__Group_4__1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4__0__Impl_in_rule__ExploitationActivity__Group_4__02538);
            rule__ExploitationActivity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4__1_in_rule__ExploitationActivity__Group_4__02541);
            rule__ExploitationActivity__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4__0"


    // $ANTLR start "rule__ExploitationActivity__Group_4__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1225:1: rule__ExploitationActivity__Group_4__0__Impl : ( '[' ) ;
    public final void rule__ExploitationActivity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1229:1: ( ( '[' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1230:1: ( '[' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1230:1: ( '[' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1231:1: '['
            {
             before(grammarAccess.getExploitationActivityAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,40,FOLLOW_40_in_rule__ExploitationActivity__Group_4__0__Impl2569); 
             after(grammarAccess.getExploitationActivityAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4__0__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_4__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1244:1: rule__ExploitationActivity__Group_4__1 : rule__ExploitationActivity__Group_4__1__Impl rule__ExploitationActivity__Group_4__2 ;
    public final void rule__ExploitationActivity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1248:1: ( rule__ExploitationActivity__Group_4__1__Impl rule__ExploitationActivity__Group_4__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1249:2: rule__ExploitationActivity__Group_4__1__Impl rule__ExploitationActivity__Group_4__2
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4__1__Impl_in_rule__ExploitationActivity__Group_4__12600);
            rule__ExploitationActivity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4__2_in_rule__ExploitationActivity__Group_4__12603);
            rule__ExploitationActivity__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4__1"


    // $ANTLR start "rule__ExploitationActivity__Group_4__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1256:1: rule__ExploitationActivity__Group_4__1__Impl : ( ( rule__ExploitationActivity__PredicatesAssignment_4_1 ) ) ;
    public final void rule__ExploitationActivity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1260:1: ( ( ( rule__ExploitationActivity__PredicatesAssignment_4_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1261:1: ( ( rule__ExploitationActivity__PredicatesAssignment_4_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1261:1: ( ( rule__ExploitationActivity__PredicatesAssignment_4_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1262:1: ( rule__ExploitationActivity__PredicatesAssignment_4_1 )
            {
             before(grammarAccess.getExploitationActivityAccess().getPredicatesAssignment_4_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1263:1: ( rule__ExploitationActivity__PredicatesAssignment_4_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1263:2: rule__ExploitationActivity__PredicatesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__PredicatesAssignment_4_1_in_rule__ExploitationActivity__Group_4__1__Impl2630);
            rule__ExploitationActivity__PredicatesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExploitationActivityAccess().getPredicatesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4__1__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_4__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1273:1: rule__ExploitationActivity__Group_4__2 : rule__ExploitationActivity__Group_4__2__Impl rule__ExploitationActivity__Group_4__3 ;
    public final void rule__ExploitationActivity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1277:1: ( rule__ExploitationActivity__Group_4__2__Impl rule__ExploitationActivity__Group_4__3 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1278:2: rule__ExploitationActivity__Group_4__2__Impl rule__ExploitationActivity__Group_4__3
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4__2__Impl_in_rule__ExploitationActivity__Group_4__22660);
            rule__ExploitationActivity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4__3_in_rule__ExploitationActivity__Group_4__22663);
            rule__ExploitationActivity__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4__2"


    // $ANTLR start "rule__ExploitationActivity__Group_4__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1285:1: rule__ExploitationActivity__Group_4__2__Impl : ( ( rule__ExploitationActivity__Group_4_2__0 )* ) ;
    public final void rule__ExploitationActivity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1289:1: ( ( ( rule__ExploitationActivity__Group_4_2__0 )* ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1290:1: ( ( rule__ExploitationActivity__Group_4_2__0 )* )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1290:1: ( ( rule__ExploitationActivity__Group_4_2__0 )* )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1291:1: ( rule__ExploitationActivity__Group_4_2__0 )*
            {
             before(grammarAccess.getExploitationActivityAccess().getGroup_4_2()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1292:1: ( rule__ExploitationActivity__Group_4_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==42) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1292:2: rule__ExploitationActivity__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ExploitationActivity__Group_4_2__0_in_rule__ExploitationActivity__Group_4__2__Impl2690);
            	    rule__ExploitationActivity__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getExploitationActivityAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4__2__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_4__3"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1302:1: rule__ExploitationActivity__Group_4__3 : rule__ExploitationActivity__Group_4__3__Impl ;
    public final void rule__ExploitationActivity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1306:1: ( rule__ExploitationActivity__Group_4__3__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1307:2: rule__ExploitationActivity__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4__3__Impl_in_rule__ExploitationActivity__Group_4__32721);
            rule__ExploitationActivity__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4__3"


    // $ANTLR start "rule__ExploitationActivity__Group_4__3__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1313:1: rule__ExploitationActivity__Group_4__3__Impl : ( ']' ) ;
    public final void rule__ExploitationActivity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1317:1: ( ( ']' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1318:1: ( ']' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1318:1: ( ']' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1319:1: ']'
            {
             before(grammarAccess.getExploitationActivityAccess().getRightSquareBracketKeyword_4_3()); 
            match(input,41,FOLLOW_41_in_rule__ExploitationActivity__Group_4__3__Impl2749); 
             after(grammarAccess.getExploitationActivityAccess().getRightSquareBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4__3__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_4_2__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1340:1: rule__ExploitationActivity__Group_4_2__0 : rule__ExploitationActivity__Group_4_2__0__Impl rule__ExploitationActivity__Group_4_2__1 ;
    public final void rule__ExploitationActivity__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1344:1: ( rule__ExploitationActivity__Group_4_2__0__Impl rule__ExploitationActivity__Group_4_2__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1345:2: rule__ExploitationActivity__Group_4_2__0__Impl rule__ExploitationActivity__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4_2__0__Impl_in_rule__ExploitationActivity__Group_4_2__02788);
            rule__ExploitationActivity__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4_2__1_in_rule__ExploitationActivity__Group_4_2__02791);
            rule__ExploitationActivity__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4_2__0"


    // $ANTLR start "rule__ExploitationActivity__Group_4_2__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1352:1: rule__ExploitationActivity__Group_4_2__0__Impl : ( '&&' ) ;
    public final void rule__ExploitationActivity__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1356:1: ( ( '&&' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1357:1: ( '&&' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1357:1: ( '&&' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1358:1: '&&'
            {
             before(grammarAccess.getExploitationActivityAccess().getAmpersandAmpersandKeyword_4_2_0()); 
            match(input,42,FOLLOW_42_in_rule__ExploitationActivity__Group_4_2__0__Impl2819); 
             after(grammarAccess.getExploitationActivityAccess().getAmpersandAmpersandKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4_2__0__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_4_2__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1371:1: rule__ExploitationActivity__Group_4_2__1 : rule__ExploitationActivity__Group_4_2__1__Impl ;
    public final void rule__ExploitationActivity__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1375:1: ( rule__ExploitationActivity__Group_4_2__1__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1376:2: rule__ExploitationActivity__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4_2__1__Impl_in_rule__ExploitationActivity__Group_4_2__12850);
            rule__ExploitationActivity__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4_2__1"


    // $ANTLR start "rule__ExploitationActivity__Group_4_2__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1382:1: rule__ExploitationActivity__Group_4_2__1__Impl : ( ( rule__ExploitationActivity__PredicatesAssignment_4_2_1 ) ) ;
    public final void rule__ExploitationActivity__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1386:1: ( ( ( rule__ExploitationActivity__PredicatesAssignment_4_2_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1387:1: ( ( rule__ExploitationActivity__PredicatesAssignment_4_2_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1387:1: ( ( rule__ExploitationActivity__PredicatesAssignment_4_2_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1388:1: ( rule__ExploitationActivity__PredicatesAssignment_4_2_1 )
            {
             before(grammarAccess.getExploitationActivityAccess().getPredicatesAssignment_4_2_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1389:1: ( rule__ExploitationActivity__PredicatesAssignment_4_2_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1389:2: rule__ExploitationActivity__PredicatesAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__PredicatesAssignment_4_2_1_in_rule__ExploitationActivity__Group_4_2__1__Impl2877);
            rule__ExploitationActivity__PredicatesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExploitationActivityAccess().getPredicatesAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4_2__1__Impl"


    // $ANTLR start "rule__NoRain__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1403:1: rule__NoRain__Group__0 : rule__NoRain__Group__0__Impl rule__NoRain__Group__1 ;
    public final void rule__NoRain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1407:1: ( rule__NoRain__Group__0__Impl rule__NoRain__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1408:2: rule__NoRain__Group__0__Impl rule__NoRain__Group__1
            {
            pushFollow(FOLLOW_rule__NoRain__Group__0__Impl_in_rule__NoRain__Group__02911);
            rule__NoRain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoRain__Group__1_in_rule__NoRain__Group__02914);
            rule__NoRain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRain__Group__0"


    // $ANTLR start "rule__NoRain__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1415:1: rule__NoRain__Group__0__Impl : ( 'no rain since' ) ;
    public final void rule__NoRain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1419:1: ( ( 'no rain since' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1420:1: ( 'no rain since' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1420:1: ( 'no rain since' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1421:1: 'no rain since'
            {
             before(grammarAccess.getNoRainAccess().getNoRainSinceKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__NoRain__Group__0__Impl2942); 
             after(grammarAccess.getNoRainAccess().getNoRainSinceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRain__Group__0__Impl"


    // $ANTLR start "rule__NoRain__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1434:1: rule__NoRain__Group__1 : rule__NoRain__Group__1__Impl rule__NoRain__Group__2 ;
    public final void rule__NoRain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1438:1: ( rule__NoRain__Group__1__Impl rule__NoRain__Group__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1439:2: rule__NoRain__Group__1__Impl rule__NoRain__Group__2
            {
            pushFollow(FOLLOW_rule__NoRain__Group__1__Impl_in_rule__NoRain__Group__12973);
            rule__NoRain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoRain__Group__2_in_rule__NoRain__Group__12976);
            rule__NoRain__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRain__Group__1"


    // $ANTLR start "rule__NoRain__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1446:1: rule__NoRain__Group__1__Impl : ( ( rule__NoRain__DaysAssignment_1 ) ) ;
    public final void rule__NoRain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1450:1: ( ( ( rule__NoRain__DaysAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1451:1: ( ( rule__NoRain__DaysAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1451:1: ( ( rule__NoRain__DaysAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1452:1: ( rule__NoRain__DaysAssignment_1 )
            {
             before(grammarAccess.getNoRainAccess().getDaysAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1453:1: ( rule__NoRain__DaysAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1453:2: rule__NoRain__DaysAssignment_1
            {
            pushFollow(FOLLOW_rule__NoRain__DaysAssignment_1_in_rule__NoRain__Group__1__Impl3003);
            rule__NoRain__DaysAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNoRainAccess().getDaysAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRain__Group__1__Impl"


    // $ANTLR start "rule__NoRain__Group__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1463:1: rule__NoRain__Group__2 : rule__NoRain__Group__2__Impl ;
    public final void rule__NoRain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1467:1: ( rule__NoRain__Group__2__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1468:2: rule__NoRain__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NoRain__Group__2__Impl_in_rule__NoRain__Group__23033);
            rule__NoRain__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRain__Group__2"


    // $ANTLR start "rule__NoRain__Group__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1474:1: rule__NoRain__Group__2__Impl : ( 'days' ) ;
    public final void rule__NoRain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1478:1: ( ( 'days' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1479:1: ( 'days' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1479:1: ( 'days' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1480:1: 'days'
            {
             before(grammarAccess.getNoRainAccess().getDaysKeyword_2()); 
            match(input,44,FOLLOW_44_in_rule__NoRain__Group__2__Impl3061); 
             after(grammarAccess.getNoRainAccess().getDaysKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRain__Group__2__Impl"


    // $ANTLR start "rule__TempOfTheDay__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1499:1: rule__TempOfTheDay__Group__0 : rule__TempOfTheDay__Group__0__Impl rule__TempOfTheDay__Group__1 ;
    public final void rule__TempOfTheDay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1503:1: ( rule__TempOfTheDay__Group__0__Impl rule__TempOfTheDay__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1504:2: rule__TempOfTheDay__Group__0__Impl rule__TempOfTheDay__Group__1
            {
            pushFollow(FOLLOW_rule__TempOfTheDay__Group__0__Impl_in_rule__TempOfTheDay__Group__03098);
            rule__TempOfTheDay__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TempOfTheDay__Group__1_in_rule__TempOfTheDay__Group__03101);
            rule__TempOfTheDay__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__Group__0"


    // $ANTLR start "rule__TempOfTheDay__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1511:1: rule__TempOfTheDay__Group__0__Impl : ( 'temperature' ) ;
    public final void rule__TempOfTheDay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1515:1: ( ( 'temperature' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1516:1: ( 'temperature' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1516:1: ( 'temperature' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1517:1: 'temperature'
            {
             before(grammarAccess.getTempOfTheDayAccess().getTemperatureKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__TempOfTheDay__Group__0__Impl3129); 
             after(grammarAccess.getTempOfTheDayAccess().getTemperatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__Group__0__Impl"


    // $ANTLR start "rule__TempOfTheDay__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1530:1: rule__TempOfTheDay__Group__1 : rule__TempOfTheDay__Group__1__Impl rule__TempOfTheDay__Group__2 ;
    public final void rule__TempOfTheDay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1534:1: ( rule__TempOfTheDay__Group__1__Impl rule__TempOfTheDay__Group__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1535:2: rule__TempOfTheDay__Group__1__Impl rule__TempOfTheDay__Group__2
            {
            pushFollow(FOLLOW_rule__TempOfTheDay__Group__1__Impl_in_rule__TempOfTheDay__Group__13160);
            rule__TempOfTheDay__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TempOfTheDay__Group__2_in_rule__TempOfTheDay__Group__13163);
            rule__TempOfTheDay__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__Group__1"


    // $ANTLR start "rule__TempOfTheDay__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1542:1: rule__TempOfTheDay__Group__1__Impl : ( ( rule__TempOfTheDay__ComparisonAssignment_1 ) ) ;
    public final void rule__TempOfTheDay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1546:1: ( ( ( rule__TempOfTheDay__ComparisonAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1547:1: ( ( rule__TempOfTheDay__ComparisonAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1547:1: ( ( rule__TempOfTheDay__ComparisonAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1548:1: ( rule__TempOfTheDay__ComparisonAssignment_1 )
            {
             before(grammarAccess.getTempOfTheDayAccess().getComparisonAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1549:1: ( rule__TempOfTheDay__ComparisonAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1549:2: rule__TempOfTheDay__ComparisonAssignment_1
            {
            pushFollow(FOLLOW_rule__TempOfTheDay__ComparisonAssignment_1_in_rule__TempOfTheDay__Group__1__Impl3190);
            rule__TempOfTheDay__ComparisonAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTempOfTheDayAccess().getComparisonAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__Group__1__Impl"


    // $ANTLR start "rule__TempOfTheDay__Group__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1559:1: rule__TempOfTheDay__Group__2 : rule__TempOfTheDay__Group__2__Impl rule__TempOfTheDay__Group__3 ;
    public final void rule__TempOfTheDay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1563:1: ( rule__TempOfTheDay__Group__2__Impl rule__TempOfTheDay__Group__3 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1564:2: rule__TempOfTheDay__Group__2__Impl rule__TempOfTheDay__Group__3
            {
            pushFollow(FOLLOW_rule__TempOfTheDay__Group__2__Impl_in_rule__TempOfTheDay__Group__23220);
            rule__TempOfTheDay__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TempOfTheDay__Group__3_in_rule__TempOfTheDay__Group__23223);
            rule__TempOfTheDay__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__Group__2"


    // $ANTLR start "rule__TempOfTheDay__Group__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1571:1: rule__TempOfTheDay__Group__2__Impl : ( ( rule__TempOfTheDay__LowerTempBoundAssignment_2 ) ) ;
    public final void rule__TempOfTheDay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1575:1: ( ( ( rule__TempOfTheDay__LowerTempBoundAssignment_2 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1576:1: ( ( rule__TempOfTheDay__LowerTempBoundAssignment_2 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1576:1: ( ( rule__TempOfTheDay__LowerTempBoundAssignment_2 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1577:1: ( rule__TempOfTheDay__LowerTempBoundAssignment_2 )
            {
             before(grammarAccess.getTempOfTheDayAccess().getLowerTempBoundAssignment_2()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1578:1: ( rule__TempOfTheDay__LowerTempBoundAssignment_2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1578:2: rule__TempOfTheDay__LowerTempBoundAssignment_2
            {
            pushFollow(FOLLOW_rule__TempOfTheDay__LowerTempBoundAssignment_2_in_rule__TempOfTheDay__Group__2__Impl3250);
            rule__TempOfTheDay__LowerTempBoundAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTempOfTheDayAccess().getLowerTempBoundAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__Group__2__Impl"


    // $ANTLR start "rule__TempOfTheDay__Group__3"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1588:1: rule__TempOfTheDay__Group__3 : rule__TempOfTheDay__Group__3__Impl ;
    public final void rule__TempOfTheDay__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1592:1: ( rule__TempOfTheDay__Group__3__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1593:2: rule__TempOfTheDay__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TempOfTheDay__Group__3__Impl_in_rule__TempOfTheDay__Group__33280);
            rule__TempOfTheDay__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__Group__3"


    // $ANTLR start "rule__TempOfTheDay__Group__3__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1599:1: rule__TempOfTheDay__Group__3__Impl : ( ( rule__TempOfTheDay__UnitAssignment_3 ) ) ;
    public final void rule__TempOfTheDay__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1603:1: ( ( ( rule__TempOfTheDay__UnitAssignment_3 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1604:1: ( ( rule__TempOfTheDay__UnitAssignment_3 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1604:1: ( ( rule__TempOfTheDay__UnitAssignment_3 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1605:1: ( rule__TempOfTheDay__UnitAssignment_3 )
            {
             before(grammarAccess.getTempOfTheDayAccess().getUnitAssignment_3()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1606:1: ( rule__TempOfTheDay__UnitAssignment_3 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1606:2: rule__TempOfTheDay__UnitAssignment_3
            {
            pushFollow(FOLLOW_rule__TempOfTheDay__UnitAssignment_3_in_rule__TempOfTheDay__Group__3__Impl3307);
            rule__TempOfTheDay__UnitAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTempOfTheDayAccess().getUnitAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__Group__3__Impl"


    // $ANTLR start "rule__DelaySinceActivy__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1624:1: rule__DelaySinceActivy__Group__0 : rule__DelaySinceActivy__Group__0__Impl rule__DelaySinceActivy__Group__1 ;
    public final void rule__DelaySinceActivy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1628:1: ( rule__DelaySinceActivy__Group__0__Impl rule__DelaySinceActivy__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1629:2: rule__DelaySinceActivy__Group__0__Impl rule__DelaySinceActivy__Group__1
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__Group__0__Impl_in_rule__DelaySinceActivy__Group__03345);
            rule__DelaySinceActivy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DelaySinceActivy__Group__1_in_rule__DelaySinceActivy__Group__03348);
            rule__DelaySinceActivy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group__0"


    // $ANTLR start "rule__DelaySinceActivy__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1636:1: rule__DelaySinceActivy__Group__0__Impl : ( 'after' ) ;
    public final void rule__DelaySinceActivy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1640:1: ( ( 'after' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1641:1: ( 'after' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1641:1: ( 'after' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1642:1: 'after'
            {
             before(grammarAccess.getDelaySinceActivyAccess().getAfterKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__DelaySinceActivy__Group__0__Impl3376); 
             after(grammarAccess.getDelaySinceActivyAccess().getAfterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group__0__Impl"


    // $ANTLR start "rule__DelaySinceActivy__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1655:1: rule__DelaySinceActivy__Group__1 : rule__DelaySinceActivy__Group__1__Impl rule__DelaySinceActivy__Group__2 ;
    public final void rule__DelaySinceActivy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1659:1: ( rule__DelaySinceActivy__Group__1__Impl rule__DelaySinceActivy__Group__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1660:2: rule__DelaySinceActivy__Group__1__Impl rule__DelaySinceActivy__Group__2
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__Group__1__Impl_in_rule__DelaySinceActivy__Group__13407);
            rule__DelaySinceActivy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DelaySinceActivy__Group__2_in_rule__DelaySinceActivy__Group__13410);
            rule__DelaySinceActivy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group__1"


    // $ANTLR start "rule__DelaySinceActivy__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1667:1: rule__DelaySinceActivy__Group__1__Impl : ( ( rule__DelaySinceActivy__PrerequisiteAssignment_1 ) ) ;
    public final void rule__DelaySinceActivy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1671:1: ( ( ( rule__DelaySinceActivy__PrerequisiteAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1672:1: ( ( rule__DelaySinceActivy__PrerequisiteAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1672:1: ( ( rule__DelaySinceActivy__PrerequisiteAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1673:1: ( rule__DelaySinceActivy__PrerequisiteAssignment_1 )
            {
             before(grammarAccess.getDelaySinceActivyAccess().getPrerequisiteAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1674:1: ( rule__DelaySinceActivy__PrerequisiteAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1674:2: rule__DelaySinceActivy__PrerequisiteAssignment_1
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__PrerequisiteAssignment_1_in_rule__DelaySinceActivy__Group__1__Impl3437);
            rule__DelaySinceActivy__PrerequisiteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDelaySinceActivyAccess().getPrerequisiteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group__1__Impl"


    // $ANTLR start "rule__DelaySinceActivy__Group__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1684:1: rule__DelaySinceActivy__Group__2 : rule__DelaySinceActivy__Group__2__Impl ;
    public final void rule__DelaySinceActivy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1688:1: ( rule__DelaySinceActivy__Group__2__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1689:2: rule__DelaySinceActivy__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__Group__2__Impl_in_rule__DelaySinceActivy__Group__23467);
            rule__DelaySinceActivy__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group__2"


    // $ANTLR start "rule__DelaySinceActivy__Group__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1695:1: rule__DelaySinceActivy__Group__2__Impl : ( ( rule__DelaySinceActivy__Group_2__0 )? ) ;
    public final void rule__DelaySinceActivy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1699:1: ( ( ( rule__DelaySinceActivy__Group_2__0 )? ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1700:1: ( ( rule__DelaySinceActivy__Group_2__0 )? )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1700:1: ( ( rule__DelaySinceActivy__Group_2__0 )? )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1701:1: ( rule__DelaySinceActivy__Group_2__0 )?
            {
             before(grammarAccess.getDelaySinceActivyAccess().getGroup_2()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1702:1: ( rule__DelaySinceActivy__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==47) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1702:2: rule__DelaySinceActivy__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DelaySinceActivy__Group_2__0_in_rule__DelaySinceActivy__Group__2__Impl3494);
                    rule__DelaySinceActivy__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDelaySinceActivyAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group__2__Impl"


    // $ANTLR start "rule__DelaySinceActivy__Group_2__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1718:1: rule__DelaySinceActivy__Group_2__0 : rule__DelaySinceActivy__Group_2__0__Impl rule__DelaySinceActivy__Group_2__1 ;
    public final void rule__DelaySinceActivy__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1722:1: ( rule__DelaySinceActivy__Group_2__0__Impl rule__DelaySinceActivy__Group_2__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1723:2: rule__DelaySinceActivy__Group_2__0__Impl rule__DelaySinceActivy__Group_2__1
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__Group_2__0__Impl_in_rule__DelaySinceActivy__Group_2__03531);
            rule__DelaySinceActivy__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DelaySinceActivy__Group_2__1_in_rule__DelaySinceActivy__Group_2__03534);
            rule__DelaySinceActivy__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group_2__0"


    // $ANTLR start "rule__DelaySinceActivy__Group_2__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1730:1: rule__DelaySinceActivy__Group_2__0__Impl : ( 'is done since' ) ;
    public final void rule__DelaySinceActivy__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1734:1: ( ( 'is done since' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1735:1: ( 'is done since' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1735:1: ( 'is done since' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1736:1: 'is done since'
            {
             before(grammarAccess.getDelaySinceActivyAccess().getIsDoneSinceKeyword_2_0()); 
            match(input,47,FOLLOW_47_in_rule__DelaySinceActivy__Group_2__0__Impl3562); 
             after(grammarAccess.getDelaySinceActivyAccess().getIsDoneSinceKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group_2__0__Impl"


    // $ANTLR start "rule__DelaySinceActivy__Group_2__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1749:1: rule__DelaySinceActivy__Group_2__1 : rule__DelaySinceActivy__Group_2__1__Impl rule__DelaySinceActivy__Group_2__2 ;
    public final void rule__DelaySinceActivy__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1753:1: ( rule__DelaySinceActivy__Group_2__1__Impl rule__DelaySinceActivy__Group_2__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1754:2: rule__DelaySinceActivy__Group_2__1__Impl rule__DelaySinceActivy__Group_2__2
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__Group_2__1__Impl_in_rule__DelaySinceActivy__Group_2__13593);
            rule__DelaySinceActivy__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DelaySinceActivy__Group_2__2_in_rule__DelaySinceActivy__Group_2__13596);
            rule__DelaySinceActivy__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group_2__1"


    // $ANTLR start "rule__DelaySinceActivy__Group_2__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1761:1: rule__DelaySinceActivy__Group_2__1__Impl : ( ( rule__DelaySinceActivy__DaysAssignment_2_1 ) ) ;
    public final void rule__DelaySinceActivy__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1765:1: ( ( ( rule__DelaySinceActivy__DaysAssignment_2_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1766:1: ( ( rule__DelaySinceActivy__DaysAssignment_2_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1766:1: ( ( rule__DelaySinceActivy__DaysAssignment_2_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1767:1: ( rule__DelaySinceActivy__DaysAssignment_2_1 )
            {
             before(grammarAccess.getDelaySinceActivyAccess().getDaysAssignment_2_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1768:1: ( rule__DelaySinceActivy__DaysAssignment_2_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1768:2: rule__DelaySinceActivy__DaysAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__DaysAssignment_2_1_in_rule__DelaySinceActivy__Group_2__1__Impl3623);
            rule__DelaySinceActivy__DaysAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDelaySinceActivyAccess().getDaysAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group_2__1__Impl"


    // $ANTLR start "rule__DelaySinceActivy__Group_2__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1778:1: rule__DelaySinceActivy__Group_2__2 : rule__DelaySinceActivy__Group_2__2__Impl ;
    public final void rule__DelaySinceActivy__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1782:1: ( rule__DelaySinceActivy__Group_2__2__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1783:2: rule__DelaySinceActivy__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__Group_2__2__Impl_in_rule__DelaySinceActivy__Group_2__23653);
            rule__DelaySinceActivy__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group_2__2"


    // $ANTLR start "rule__DelaySinceActivy__Group_2__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1789:1: rule__DelaySinceActivy__Group_2__2__Impl : ( 'days' ) ;
    public final void rule__DelaySinceActivy__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1793:1: ( ( 'days' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1794:1: ( 'days' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1794:1: ( 'days' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1795:1: 'days'
            {
             before(grammarAccess.getDelaySinceActivyAccess().getDaysKeyword_2_2()); 
            match(input,44,FOLLOW_44_in_rule__DelaySinceActivy__Group_2__2__Impl3681); 
             after(grammarAccess.getDelaySinceActivyAccess().getDaysKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group_2__2__Impl"


    // $ANTLR start "rule__GrainIs__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1814:1: rule__GrainIs__Group__0 : rule__GrainIs__Group__0__Impl rule__GrainIs__Group__1 ;
    public final void rule__GrainIs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1818:1: ( rule__GrainIs__Group__0__Impl rule__GrainIs__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1819:2: rule__GrainIs__Group__0__Impl rule__GrainIs__Group__1
            {
            pushFollow(FOLLOW_rule__GrainIs__Group__0__Impl_in_rule__GrainIs__Group__03718);
            rule__GrainIs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrainIs__Group__1_in_rule__GrainIs__Group__03721);
            rule__GrainIs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrainIs__Group__0"


    // $ANTLR start "rule__GrainIs__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1826:1: rule__GrainIs__Group__0__Impl : ( 'grain is' ) ;
    public final void rule__GrainIs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1830:1: ( ( 'grain is' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1831:1: ( 'grain is' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1831:1: ( 'grain is' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1832:1: 'grain is'
            {
             before(grammarAccess.getGrainIsAccess().getGrainIsKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__GrainIs__Group__0__Impl3749); 
             after(grammarAccess.getGrainIsAccess().getGrainIsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrainIs__Group__0__Impl"


    // $ANTLR start "rule__GrainIs__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1845:1: rule__GrainIs__Group__1 : rule__GrainIs__Group__1__Impl ;
    public final void rule__GrainIs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1849:1: ( rule__GrainIs__Group__1__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1850:2: rule__GrainIs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GrainIs__Group__1__Impl_in_rule__GrainIs__Group__13780);
            rule__GrainIs__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrainIs__Group__1"


    // $ANTLR start "rule__GrainIs__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1856:1: rule__GrainIs__Group__1__Impl : ( ( rule__GrainIs__StateAssignment_1 ) ) ;
    public final void rule__GrainIs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1860:1: ( ( ( rule__GrainIs__StateAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1861:1: ( ( rule__GrainIs__StateAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1861:1: ( ( rule__GrainIs__StateAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1862:1: ( rule__GrainIs__StateAssignment_1 )
            {
             before(grammarAccess.getGrainIsAccess().getStateAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1863:1: ( rule__GrainIs__StateAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1863:2: rule__GrainIs__StateAssignment_1
            {
            pushFollow(FOLLOW_rule__GrainIs__StateAssignment_1_in_rule__GrainIs__Group__1__Impl3807);
            rule__GrainIs__StateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGrainIsAccess().getStateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrainIs__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1877:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1881:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1882:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__03841);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__1_in_rule__Date__Group__03844);
            rule__Date__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1889:1: rule__Date__Group__0__Impl : ( ( rule__Date__DayAssignment_0 ) ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1893:1: ( ( ( rule__Date__DayAssignment_0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1894:1: ( ( rule__Date__DayAssignment_0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1894:1: ( ( rule__Date__DayAssignment_0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1895:1: ( rule__Date__DayAssignment_0 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_0()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1896:1: ( rule__Date__DayAssignment_0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1896:2: rule__Date__DayAssignment_0
            {
            pushFollow(FOLLOW_rule__Date__DayAssignment_0_in_rule__Date__Group__0__Impl3871);
            rule__Date__DayAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getDayAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1906:1: rule__Date__Group__1 : rule__Date__Group__1__Impl ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1910:1: ( rule__Date__Group__1__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1911:2: rule__Date__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__13901);
            rule__Date__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1917:1: rule__Date__Group__1__Impl : ( ( rule__Date__MonthAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1921:1: ( ( ( rule__Date__MonthAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1922:1: ( ( rule__Date__MonthAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1922:1: ( ( rule__Date__MonthAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1923:1: ( rule__Date__MonthAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1924:1: ( rule__Date__MonthAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1924:2: rule__Date__MonthAssignment_1
            {
            pushFollow(FOLLOW_rule__Date__MonthAssignment_1_in_rule__Date__Group__1__Impl3928);
            rule__Date__MonthAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getMonthAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Model__CulturesAssignment_0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1939:1: rule__Model__CulturesAssignment_0 : ( ruleCulture ) ;
    public final void rule__Model__CulturesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1943:1: ( ( ruleCulture ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1944:1: ( ruleCulture )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1944:1: ( ruleCulture )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1945:1: ruleCulture
            {
             before(grammarAccess.getModelAccess().getCulturesCultureParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCulture_in_rule__Model__CulturesAssignment_03967);
            ruleCulture();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCulturesCultureParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CulturesAssignment_0"


    // $ANTLR start "rule__Model__ResourceKindsAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1954:1: rule__Model__ResourceKindsAssignment_1 : ( ruleResourceKind ) ;
    public final void rule__Model__ResourceKindsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1958:1: ( ( ruleResourceKind ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1959:1: ( ruleResourceKind )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1959:1: ( ruleResourceKind )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1960:1: ruleResourceKind
            {
             before(grammarAccess.getModelAccess().getResourceKindsResourceKindParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleResourceKind_in_rule__Model__ResourceKindsAssignment_13998);
            ruleResourceKind();

            state._fsp--;

             after(grammarAccess.getModelAccess().getResourceKindsResourceKindParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ResourceKindsAssignment_1"


    // $ANTLR start "rule__ResourceKind__NameAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1969:1: rule__ResourceKind__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ResourceKind__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1973:1: ( ( RULE_ID ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1974:1: ( RULE_ID )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1974:1: ( RULE_ID )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1975:1: RULE_ID
            {
             before(grammarAccess.getResourceKindAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceKind__NameAssignment_14029); 
             after(grammarAccess.getResourceKindAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceKind__NameAssignment_1"


    // $ANTLR start "rule__Culture__NameAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1984:1: rule__Culture__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Culture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1988:1: ( ( RULE_ID ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1989:1: ( RULE_ID )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1989:1: ( RULE_ID )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1990:1: RULE_ID
            {
             before(grammarAccess.getCultureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Culture__NameAssignment_14060); 
             after(grammarAccess.getCultureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__NameAssignment_1"


    // $ANTLR start "rule__Culture__ActivitiesAssignment_3"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1999:1: rule__Culture__ActivitiesAssignment_3 : ( ruleExploitationActivity ) ;
    public final void rule__Culture__ActivitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2003:1: ( ( ruleExploitationActivity ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2004:1: ( ruleExploitationActivity )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2004:1: ( ruleExploitationActivity )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2005:1: ruleExploitationActivity
            {
             before(grammarAccess.getCultureAccess().getActivitiesExploitationActivityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExploitationActivity_in_rule__Culture__ActivitiesAssignment_34091);
            ruleExploitationActivity();

            state._fsp--;

             after(grammarAccess.getCultureAccess().getActivitiesExploitationActivityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__ActivitiesAssignment_3"


    // $ANTLR start "rule__ExploitationActivity__NameAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2014:1: rule__ExploitationActivity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExploitationActivity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2018:1: ( ( RULE_ID ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2019:1: ( RULE_ID )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2019:1: ( RULE_ID )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2020:1: RULE_ID
            {
             before(grammarAccess.getExploitationActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExploitationActivity__NameAssignment_14122); 
             after(grammarAccess.getExploitationActivityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__NameAssignment_1"


    // $ANTLR start "rule__ExploitationActivity__FrequencyAssignment_2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2029:1: rule__ExploitationActivity__FrequencyAssignment_2 : ( ruleFrequency ) ;
    public final void rule__ExploitationActivity__FrequencyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2033:1: ( ( ruleFrequency ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2034:1: ( ruleFrequency )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2034:1: ( ruleFrequency )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2035:1: ruleFrequency
            {
             before(grammarAccess.getExploitationActivityAccess().getFrequencyFrequencyEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFrequency_in_rule__ExploitationActivity__FrequencyAssignment_24153);
            ruleFrequency();

            state._fsp--;

             after(grammarAccess.getExploitationActivityAccess().getFrequencyFrequencyEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__FrequencyAssignment_2"


    // $ANTLR start "rule__ExploitationActivity__StartDateAssignment_3_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2044:1: rule__ExploitationActivity__StartDateAssignment_3_1 : ( ruleDate ) ;
    public final void rule__ExploitationActivity__StartDateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2048:1: ( ( ruleDate ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2049:1: ( ruleDate )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2049:1: ( ruleDate )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2050:1: ruleDate
            {
             before(grammarAccess.getExploitationActivityAccess().getStartDateDateParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleDate_in_rule__ExploitationActivity__StartDateAssignment_3_14184);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getExploitationActivityAccess().getStartDateDateParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__StartDateAssignment_3_1"


    // $ANTLR start "rule__ExploitationActivity__EndDateAssignment_3_3"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2059:1: rule__ExploitationActivity__EndDateAssignment_3_3 : ( ruleDate ) ;
    public final void rule__ExploitationActivity__EndDateAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2063:1: ( ( ruleDate ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2064:1: ( ruleDate )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2064:1: ( ruleDate )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2065:1: ruleDate
            {
             before(grammarAccess.getExploitationActivityAccess().getEndDateDateParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleDate_in_rule__ExploitationActivity__EndDateAssignment_3_34215);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getExploitationActivityAccess().getEndDateDateParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__EndDateAssignment_3_3"


    // $ANTLR start "rule__ExploitationActivity__PredicatesAssignment_4_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2074:1: rule__ExploitationActivity__PredicatesAssignment_4_1 : ( rulePredicate ) ;
    public final void rule__ExploitationActivity__PredicatesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2078:1: ( ( rulePredicate ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2079:1: ( rulePredicate )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2079:1: ( rulePredicate )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2080:1: rulePredicate
            {
             before(grammarAccess.getExploitationActivityAccess().getPredicatesPredicateParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_rulePredicate_in_rule__ExploitationActivity__PredicatesAssignment_4_14246);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getExploitationActivityAccess().getPredicatesPredicateParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__PredicatesAssignment_4_1"


    // $ANTLR start "rule__ExploitationActivity__PredicatesAssignment_4_2_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2089:1: rule__ExploitationActivity__PredicatesAssignment_4_2_1 : ( rulePredicate ) ;
    public final void rule__ExploitationActivity__PredicatesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2093:1: ( ( rulePredicate ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2094:1: ( rulePredicate )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2094:1: ( rulePredicate )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2095:1: rulePredicate
            {
             before(grammarAccess.getExploitationActivityAccess().getPredicatesPredicateParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_rulePredicate_in_rule__ExploitationActivity__PredicatesAssignment_4_2_14277);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getExploitationActivityAccess().getPredicatesPredicateParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__PredicatesAssignment_4_2_1"


    // $ANTLR start "rule__NoRain__DaysAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2104:1: rule__NoRain__DaysAssignment_1 : ( RULE_INT ) ;
    public final void rule__NoRain__DaysAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2108:1: ( ( RULE_INT ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2109:1: ( RULE_INT )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2109:1: ( RULE_INT )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2110:1: RULE_INT
            {
             before(grammarAccess.getNoRainAccess().getDaysINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NoRain__DaysAssignment_14308); 
             after(grammarAccess.getNoRainAccess().getDaysINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRain__DaysAssignment_1"


    // $ANTLR start "rule__TempOfTheDay__ComparisonAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2119:1: rule__TempOfTheDay__ComparisonAssignment_1 : ( ruleComp ) ;
    public final void rule__TempOfTheDay__ComparisonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2123:1: ( ( ruleComp ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2124:1: ( ruleComp )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2124:1: ( ruleComp )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2125:1: ruleComp
            {
             before(grammarAccess.getTempOfTheDayAccess().getComparisonCompEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComp_in_rule__TempOfTheDay__ComparisonAssignment_14339);
            ruleComp();

            state._fsp--;

             after(grammarAccess.getTempOfTheDayAccess().getComparisonCompEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__ComparisonAssignment_1"


    // $ANTLR start "rule__TempOfTheDay__LowerTempBoundAssignment_2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2134:1: rule__TempOfTheDay__LowerTempBoundAssignment_2 : ( RULE_INT ) ;
    public final void rule__TempOfTheDay__LowerTempBoundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2138:1: ( ( RULE_INT ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2139:1: ( RULE_INT )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2139:1: ( RULE_INT )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2140:1: RULE_INT
            {
             before(grammarAccess.getTempOfTheDayAccess().getLowerTempBoundINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TempOfTheDay__LowerTempBoundAssignment_24370); 
             after(grammarAccess.getTempOfTheDayAccess().getLowerTempBoundINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__LowerTempBoundAssignment_2"


    // $ANTLR start "rule__TempOfTheDay__UnitAssignment_3"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2149:1: rule__TempOfTheDay__UnitAssignment_3 : ( ruleTempUnit ) ;
    public final void rule__TempOfTheDay__UnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2153:1: ( ( ruleTempUnit ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2154:1: ( ruleTempUnit )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2154:1: ( ruleTempUnit )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2155:1: ruleTempUnit
            {
             before(grammarAccess.getTempOfTheDayAccess().getUnitTempUnitEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTempUnit_in_rule__TempOfTheDay__UnitAssignment_34401);
            ruleTempUnit();

            state._fsp--;

             after(grammarAccess.getTempOfTheDayAccess().getUnitTempUnitEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__UnitAssignment_3"


    // $ANTLR start "rule__DelaySinceActivy__PrerequisiteAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2164:1: rule__DelaySinceActivy__PrerequisiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DelaySinceActivy__PrerequisiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2168:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2169:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2169:1: ( ( RULE_ID ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2170:1: ( RULE_ID )
            {
             before(grammarAccess.getDelaySinceActivyAccess().getPrerequisiteExploitationActivityCrossReference_1_0()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2171:1: ( RULE_ID )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2172:1: RULE_ID
            {
             before(grammarAccess.getDelaySinceActivyAccess().getPrerequisiteExploitationActivityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DelaySinceActivy__PrerequisiteAssignment_14436); 
             after(grammarAccess.getDelaySinceActivyAccess().getPrerequisiteExploitationActivityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDelaySinceActivyAccess().getPrerequisiteExploitationActivityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__PrerequisiteAssignment_1"


    // $ANTLR start "rule__DelaySinceActivy__DaysAssignment_2_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2183:1: rule__DelaySinceActivy__DaysAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__DelaySinceActivy__DaysAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2187:1: ( ( RULE_INT ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2188:1: ( RULE_INT )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2188:1: ( RULE_INT )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2189:1: RULE_INT
            {
             before(grammarAccess.getDelaySinceActivyAccess().getDaysINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DelaySinceActivy__DaysAssignment_2_14471); 
             after(grammarAccess.getDelaySinceActivyAccess().getDaysINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__DaysAssignment_2_1"


    // $ANTLR start "rule__GrainIs__StateAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2198:1: rule__GrainIs__StateAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GrainIs__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2202:1: ( ( RULE_STRING ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2203:1: ( RULE_STRING )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2203:1: ( RULE_STRING )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2204:1: RULE_STRING
            {
             before(grammarAccess.getGrainIsAccess().getStateSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GrainIs__StateAssignment_14502); 
             after(grammarAccess.getGrainIsAccess().getStateSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrainIs__StateAssignment_1"


    // $ANTLR start "rule__Date__DayAssignment_0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2213:1: rule__Date__DayAssignment_0 : ( RULE_INT ) ;
    public final void rule__Date__DayAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2217:1: ( ( RULE_INT ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2218:1: ( RULE_INT )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2218:1: ( RULE_INT )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2219:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getDayINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Date__DayAssignment_04533); 
             after(grammarAccess.getDateAccess().getDayINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__DayAssignment_0"


    // $ANTLR start "rule__Date__MonthAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2228:1: rule__Date__MonthAssignment_1 : ( ruleMonth ) ;
    public final void rule__Date__MonthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2232:1: ( ( ruleMonth ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2233:1: ( ruleMonth )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2233:1: ( ruleMonth )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2234:1: ruleMonth
            {
             before(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMonth_in_rule__Date__MonthAssignment_14564);
            ruleMonth();

            state._fsp--;

             after(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__MonthAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceKind_in_entryRuleResourceKind121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceKind128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceKind__Group__0_in_ruleResourceKind154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCulture_in_entryRuleCulture181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCulture188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Culture__Group__0_in_ruleCulture214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploitationActivity_in_entryRuleExploitationActivity241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExploitationActivity248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__0_in_ruleExploitationActivity274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Alternatives_in_rulePredicate334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRain_in_entryRuleNoRain361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoRain368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoRain__Group__0_in_ruleNoRain394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempOfTheDay_in_entryRuleTempOfTheDay421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTempOfTheDay428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__Group__0_in_ruleTempOfTheDay454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelaySinceActivy_in_entryRuleDelaySinceActivy481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelaySinceActivy488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group__0_in_ruleDelaySinceActivy514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrainIs_in_entryRuleGrainIs541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrainIs548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrainIs__Group__0_in_ruleGrainIs574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__0_in_ruleDate634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Alternatives_in_ruleMonth671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comp__Alternatives_in_ruleComp707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempUnit__Alternatives_in_ruleTempUnit743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Frequency__Alternatives_in_ruleFrequency779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRain_in_rule__Predicate__Alternatives814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempOfTheDay_in_rule__Predicate__Alternatives831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelaySinceActivy_in_rule__Predicate__Alternatives848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrainIs_in_rule__Predicate__Alternatives865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Month__Alternatives898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Month__Alternatives919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Month__Alternatives940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Month__Alternatives961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Month__Alternatives982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Month__Alternatives1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Month__Alternatives1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Month__Alternatives1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Month__Alternatives1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Month__Alternatives1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Month__Alternatives1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Month__Alternatives1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Comp__Alternatives1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Comp__Alternatives1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TempUnit__Alternatives1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TempUnit__Alternatives1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Frequency__Alternatives1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Frequency__Alternatives1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Frequency__Alternatives1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Frequency__Alternatives1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Frequency__Alternatives1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Frequency__Alternatives1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01417 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__CulturesAssignment_0_in_rule__Model__Group__0__Impl1447 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ResourceKindsAssignment_1_in_rule__Model__Group__1__Impl1505 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__ResourceKind__Group__0__Impl_in_rule__ResourceKind__Group__01540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceKind__Group__1_in_rule__ResourceKind__Group__01543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ResourceKind__Group__0__Impl1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceKind__Group__1__Impl_in_rule__ResourceKind__Group__11602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceKind__NameAssignment_1_in_rule__ResourceKind__Group__1__Impl1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Culture__Group__0__Impl_in_rule__Culture__Group__01663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Culture__Group__1_in_rule__Culture__Group__01666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Culture__Group__0__Impl1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Culture__Group__1__Impl_in_rule__Culture__Group__11725 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Culture__Group__2_in_rule__Culture__Group__11728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Culture__NameAssignment_1_in_rule__Culture__Group__1__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Culture__Group__2__Impl_in_rule__Culture__Group__21785 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_rule__Culture__Group__3_in_rule__Culture__Group__21788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Culture__Group__2__Impl1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Culture__Group__3__Impl_in_rule__Culture__Group__31847 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_rule__Culture__Group__4_in_rule__Culture__Group__31850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Culture__ActivitiesAssignment_3_in_rule__Culture__Group__3__Impl1877 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Culture__Group__4__Impl_in_rule__Culture__Group__41908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Culture__Group__4__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__0__Impl_in_rule__ExploitationActivity__Group__01977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__1_in_rule__ExploitationActivity__Group__01980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ExploitationActivity__Group__0__Impl2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__1__Impl_in_rule__ExploitationActivity__Group__12039 = new BitSet(new long[]{0x00000141F8000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__2_in_rule__ExploitationActivity__Group__12042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__NameAssignment_1_in_rule__ExploitationActivity__Group__1__Impl2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__2__Impl_in_rule__ExploitationActivity__Group__22099 = new BitSet(new long[]{0x00000141F8000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__3_in_rule__ExploitationActivity__Group__22102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__FrequencyAssignment_2_in_rule__ExploitationActivity__Group__2__Impl2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__3__Impl_in_rule__ExploitationActivity__Group__32160 = new BitSet(new long[]{0x00000141F8000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__4_in_rule__ExploitationActivity__Group__32163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_3__0_in_rule__ExploitationActivity__Group__3__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__4__Impl_in_rule__ExploitationActivity__Group__42221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4__0_in_rule__ExploitationActivity__Group__4__Impl2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_3__0__Impl_in_rule__ExploitationActivity__Group_3__02289 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_3__1_in_rule__ExploitationActivity__Group_3__02292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ExploitationActivity__Group_3__0__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_3__1__Impl_in_rule__ExploitationActivity__Group_3__12351 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_3__2_in_rule__ExploitationActivity__Group_3__12354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__StartDateAssignment_3_1_in_rule__ExploitationActivity__Group_3__1__Impl2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_3__2__Impl_in_rule__ExploitationActivity__Group_3__22411 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_3__3_in_rule__ExploitationActivity__Group_3__22414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ExploitationActivity__Group_3__2__Impl2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_3__3__Impl_in_rule__ExploitationActivity__Group_3__32473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__EndDateAssignment_3_3_in_rule__ExploitationActivity__Group_3__3__Impl2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4__0__Impl_in_rule__ExploitationActivity__Group_4__02538 = new BitSet(new long[]{0x0001680000000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4__1_in_rule__ExploitationActivity__Group_4__02541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ExploitationActivity__Group_4__0__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4__1__Impl_in_rule__ExploitationActivity__Group_4__12600 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4__2_in_rule__ExploitationActivity__Group_4__12603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__PredicatesAssignment_4_1_in_rule__ExploitationActivity__Group_4__1__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4__2__Impl_in_rule__ExploitationActivity__Group_4__22660 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4__3_in_rule__ExploitationActivity__Group_4__22663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4_2__0_in_rule__ExploitationActivity__Group_4__2__Impl2690 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4__3__Impl_in_rule__ExploitationActivity__Group_4__32721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ExploitationActivity__Group_4__3__Impl2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4_2__0__Impl_in_rule__ExploitationActivity__Group_4_2__02788 = new BitSet(new long[]{0x0001680000000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4_2__1_in_rule__ExploitationActivity__Group_4_2__02791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ExploitationActivity__Group_4_2__0__Impl2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4_2__1__Impl_in_rule__ExploitationActivity__Group_4_2__12850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__PredicatesAssignment_4_2_1_in_rule__ExploitationActivity__Group_4_2__1__Impl2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoRain__Group__0__Impl_in_rule__NoRain__Group__02911 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NoRain__Group__1_in_rule__NoRain__Group__02914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__NoRain__Group__0__Impl2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoRain__Group__1__Impl_in_rule__NoRain__Group__12973 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__NoRain__Group__2_in_rule__NoRain__Group__12976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoRain__DaysAssignment_1_in_rule__NoRain__Group__1__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoRain__Group__2__Impl_in_rule__NoRain__Group__23033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__NoRain__Group__2__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__Group__0__Impl_in_rule__TempOfTheDay__Group__03098 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__Group__1_in_rule__TempOfTheDay__Group__03101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__TempOfTheDay__Group__0__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__Group__1__Impl_in_rule__TempOfTheDay__Group__13160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__Group__2_in_rule__TempOfTheDay__Group__13163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__ComparisonAssignment_1_in_rule__TempOfTheDay__Group__1__Impl3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__Group__2__Impl_in_rule__TempOfTheDay__Group__23220 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__Group__3_in_rule__TempOfTheDay__Group__23223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__LowerTempBoundAssignment_2_in_rule__TempOfTheDay__Group__2__Impl3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__Group__3__Impl_in_rule__TempOfTheDay__Group__33280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__UnitAssignment_3_in_rule__TempOfTheDay__Group__3__Impl3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group__0__Impl_in_rule__DelaySinceActivy__Group__03345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group__1_in_rule__DelaySinceActivy__Group__03348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DelaySinceActivy__Group__0__Impl3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group__1__Impl_in_rule__DelaySinceActivy__Group__13407 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group__2_in_rule__DelaySinceActivy__Group__13410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__PrerequisiteAssignment_1_in_rule__DelaySinceActivy__Group__1__Impl3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group__2__Impl_in_rule__DelaySinceActivy__Group__23467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group_2__0_in_rule__DelaySinceActivy__Group__2__Impl3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group_2__0__Impl_in_rule__DelaySinceActivy__Group_2__03531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group_2__1_in_rule__DelaySinceActivy__Group_2__03534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__DelaySinceActivy__Group_2__0__Impl3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group_2__1__Impl_in_rule__DelaySinceActivy__Group_2__13593 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group_2__2_in_rule__DelaySinceActivy__Group_2__13596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__DaysAssignment_2_1_in_rule__DelaySinceActivy__Group_2__1__Impl3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group_2__2__Impl_in_rule__DelaySinceActivy__Group_2__23653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DelaySinceActivy__Group_2__2__Impl3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrainIs__Group__0__Impl_in_rule__GrainIs__Group__03718 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__GrainIs__Group__1_in_rule__GrainIs__Group__03721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__GrainIs__Group__0__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrainIs__Group__1__Impl_in_rule__GrainIs__Group__13780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrainIs__StateAssignment_1_in_rule__GrainIs__Group__1__Impl3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__03841 = new BitSet(new long[]{0x00000000007FF800L});
    public static final BitSet FOLLOW_rule__Date__Group__1_in_rule__Date__Group__03844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__DayAssignment_0_in_rule__Date__Group__0__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__13901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__MonthAssignment_1_in_rule__Date__Group__1__Impl3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCulture_in_rule__Model__CulturesAssignment_03967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceKind_in_rule__Model__ResourceKindsAssignment_13998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceKind__NameAssignment_14029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Culture__NameAssignment_14060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploitationActivity_in_rule__Culture__ActivitiesAssignment_34091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExploitationActivity__NameAssignment_14122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrequency_in_rule__ExploitationActivity__FrequencyAssignment_24153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_rule__ExploitationActivity__StartDateAssignment_3_14184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_rule__ExploitationActivity__EndDateAssignment_3_34215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rule__ExploitationActivity__PredicatesAssignment_4_14246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rule__ExploitationActivity__PredicatesAssignment_4_2_14277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NoRain__DaysAssignment_14308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComp_in_rule__TempOfTheDay__ComparisonAssignment_14339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TempOfTheDay__LowerTempBoundAssignment_24370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempUnit_in_rule__TempOfTheDay__UnitAssignment_34401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DelaySinceActivy__PrerequisiteAssignment_14436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DelaySinceActivy__DaysAssignment_2_14471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GrainIs__StateAssignment_14502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Date__DayAssignment_04533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonth_in_rule__Date__MonthAssignment_14564 = new BitSet(new long[]{0x0000000000000002L});

}