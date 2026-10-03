package com.google.javascript.jscomp;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CompilerOptionsTest {

  @Test
  public void testConstructor_defaultValues() {
    CompilerOptions options = new CompilerOptions();

    Assert.assertFalse(options.skipAllPasses);
    Assert.assertFalse(options.nameAnonymousFunctionsOnly);
    Assert.assertEquals(CompilerOptions.DevMode.OFF, options.devMode);
    Assert.assertFalse(options.checkSymbols);
    Assert.assertEquals(CheckLevel.OFF, options.checkShadowVars);
    Assert.assertEquals(CheckLevel.OFF, options.aggressiveVarCheck);
    Assert.assertEquals(CheckLevel.OFF, options.checkFunctions);
    Assert.assertEquals(CheckLevel.OFF, options.checkMethods);
    Assert.assertFalse(options.checkDuplicateMessages);
    Assert.assertFalse(options.allowLegacyJsMessages);
    Assert.assertFalse(options.strictMessageReplacement);
    Assert.assertFalse(options.checkSuspiciousCode);
    Assert.assertFalse(options.checkControlStructures);
    Assert.assertEquals(CheckLevel.OFF, options.checkUndefinedProperties);
    Assert.assertFalse(options.checkUnusedPropertiesEarly);
    Assert.assertFalse(options.checkTypes);
    Assert.assertFalse(options.tightenTypes);
    Assert.assertFalse(options.inferTypesInGlobalScope);
    Assert.assertFalse(options.checkTypedPropertyCalls);
    Assert.assertEquals(CheckLevel.OFF, options.reportMissingOverride);
    Assert.assertEquals(CheckLevel.OFF, options.reportUnknownTypes);
    Assert.assertEquals(CheckLevel.OFF, options.checkRequires);
    Assert.assertEquals(CheckLevel.OFF, options.checkProvides);
    Assert.assertEquals(CheckLevel.OFF, options.checkGlobalNamesLevel);
    Assert.assertEquals(CheckLevel.ERROR, options.brokenClosureRequiresLevel);
    Assert.assertEquals(CheckLevel.OFF, options.checkGlobalThisLevel);
    Assert.assertEquals(CheckLevel.OFF, options.checkUnreachableCode);
    Assert.assertEquals(CheckLevel.OFF, options.checkMissingReturn);
    Assert.assertEquals(CheckLevel.OFF, options.checkMissingGetCssNameLevel);
    Assert.assertNull(options.checkMissingGetCssNameBlacklist);
    Assert.assertFalse(options.checkEs5Strict);
    Assert.assertFalse(options.checkCaja);
    Assert.assertFalse(options.computeFunctionSideEffects);
    Assert.assertFalse(options.chainCalls);

    Assert.assertFalse(options.foldConstants);
    Assert.assertFalse(options.removeConstantExpressions);
    Assert.assertFalse(options.coalesceVariableNames);
    Assert.assertFalse(options.deadAssignmentElimination);
    Assert.assertFalse(options.inlineConstantVars);
    Assert.assertFalse(options.inlineFunctions);
    Assert.assertFalse(options.inlineLocalFunctions);
    Assert.assertFalse(options.crossModuleCodeMotion);
    Assert.assertFalse(options.crossModuleMethodMotion);
    Assert.assertFalse(options.inlineGetters);
    Assert.assertFalse(options.inlineVariables);
    Assert.assertFalse(options.inlineLocalVariables);
    Assert.assertFalse(options.smartNameRemoval);
    Assert.assertFalse(options.removeDeadCode);
    Assert.assertFalse(options.extractPrototypeMemberDeclarations);
    Assert.assertFalse(options.removeUnusedPrototypeProperties);
    Assert.assertFalse(options.removeUnusedPrototypePropertiesInExterns);
    Assert.assertFalse(options.removeUnusedVars);
    Assert.assertTrue(options.removeUnusedVarsInGlobalScope);
    Assert.assertFalse(options.aliasExternals);
    Assert.assertFalse(options.collapseVariableDeclarations);
    Assert.assertFalse(options.groupVariableDeclarations);
    Assert.assertFalse(options.collapseAnonymousFunctions);
    Assert.assertTrue(options.aliasableStrings.isEmpty());
    Assert.assertEquals("", options.aliasStringsBlacklist);
    Assert.assertFalse(options.aliasAllStrings);
    Assert.assertFalse(options.outputJsStringUsage);
    Assert.assertFalse(options.convertToDottedProperties);
    Assert.assertFalse(options.rewriteFunctionExpressions);
    Assert.assertFalse(options.optimizeParameters);

    Assert.assertEquals(VariableRenamingPolicy.OFF, options.variableRenaming);
    Assert.assertEquals(PropertyRenamingPolicy.OFF, options.propertyRenaming);
    Assert.assertFalse(options.labelRenaming);
    Assert.assertFalse(options.generatePseudoNames);
    Assert.assertNull(options.renamePrefix);
    Assert.assertFalse(options.aliasKeywords);
    Assert.assertFalse(options.collapseProperties);
    Assert.assertFalse(options.collapsePropertiesOnExternTypes);
    Assert.assertFalse(options.devirtualizePrototypeMethods);
    Assert.assertFalse(options.disambiguateProperties);
    Assert.assertFalse(options.ambiguateProperties);
    Assert.assertEquals(AnonymousFunctionNamingPolicy.OFF, options.anonymousFunctionNaming);
    Assert.assertFalse(options.exportTestFunctions);

    Assert.assertFalse(options.runtimeTypeCheck);
    Assert.assertNull(options.runtimeTypeCheckLogFunction);
    Assert.assertFalse(options.instrumentForCoverage);
    Assert.assertFalse(options.instrumentForCoverageOnly);
    Assert.assertFalse(options.ignoreCajaProperties);
    Assert.assertNull(options.syntheticBlockStartMarker);
    Assert.assertNull(options.syntheticBlockEndMarker);
    Assert.assertNull(options.locale);
    Assert.assertFalse(options.markAsCompiled);
    Assert.assertFalse(options.removeTryCatchFinally);
    Assert.assertFalse(options.closurePass);
    Assert.assertTrue(options.rewriteNewDateGoogNow);
    Assert.assertTrue(options.removeAbstractMethods);
    Assert.assertTrue(options.stripTypes.isEmpty());
    Assert.assertTrue(options.stripNameSuffixes.isEmpty());
    Assert.assertTrue(options.stripNamePrefixes.isEmpty());
    Assert.assertTrue(options.stripTypePrefixes.isEmpty());
    Assert.assertNull(options.customPasses);
    Assert.assertFalse(options.markNoSideEffectCalls);
    Assert.assertTrue(options.getDefineReplacements().isEmpty());
    Assert.assertFalse(options.moveFunctionDeclarations);
    Assert.assertNull(options.instrumentationTemplate);
    Assert.assertEquals("", options.appNameStr);
    Assert.assertFalse(options.recordFunctionInformation);
    Assert.assertFalse(options.generateExports);
    Assert.assertNull(options.cssRenamingMap);
    Assert.assertFalse(options.processObjectPropertyString);
    Assert.assertTrue(options.idGenerators.isEmpty());
    Assert.assertTrue(options.replaceStringsFunctionDescriptions.isEmpty());
    Assert.assertEquals("", options.replaceStringsPlaceholderToken);

    Assert.assertFalse(options.printInputDelimiter);
    Assert.assertFalse(options.prettyPrint);
    Assert.assertFalse(options.lineBreak);
    Assert.assertNull(options.reportPath);
    Assert.assertEquals(CompilerOptions.TracerMode.OFF, options.tracer);
    Assert.assertFalse(options.shouldColorizeErrorOutput());
    Assert.assertEquals(ErrorFormat.SINGLELINE, options.errorFormat);
    Assert.assertNull(options.getWarningsGuard());
    Assert.assertNull(options.debugFunctionSideEffectsPath);
    Assert.assertEquals("", options.jsOutputFile);
    Assert.assertFalse(options.isExternExportsEnabled());
    Assert.assertNull(options.nameReferenceReportPath);
    Assert.assertNull(options.nameReferenceGraphPath);
    Assert.assertEquals(1, options.summaryDetailLevel);
  }

  @Test
  public void testGetDefineReplacements_allSupportedTypes() {
    CompilerOptions options = new CompilerOptions();
    options.setDefineToBooleanLiteral("DEF_TRUE", true);
    options.setDefineToBooleanLiteral("DEF_FALSE", false);
    options.setDefineToNumberLiteral("DEF_INT", 42);
    options.setDefineToNumberLiteral("DEF_ZERO_INT", 0);
    options.setDefineToNumberLiteral("DEF_NEG_INT", -100);
    options.setDefineToDoubleLiteral("DEF_DOUBLE", 3.1415);
    options.setDefineToDoubleLiteral("DEF_ZERO_DOUBLE", 0.0);
    options.setDefineToStringLiteral("DEF_STRING", "hello");
    options.setDefineToStringLiteral("DEF_EMPTY_STRING", "");

    Map<String, Node> replacements = options.getDefineReplacements();
    Assert.assertEquals(9, replacements.size());

    Assert.assertEquals(Token.TRUE, replacements.get("DEF_TRUE").getType());
    Assert.assertEquals(Token.FALSE, replacements.get("DEF_FALSE").getType());

    Node intNode = replacements.get("DEF_INT");
    Assert.assertEquals(Token.NUMBER, intNode.getType());
    Assert.assertEquals(42.0, intNode.getDouble(), 0.0001);

    Node zeroIntNode = replacements.get("DEF_ZERO_INT");
    Assert.assertEquals(Token.NUMBER, zeroIntNode.getType());
    Assert.assertEquals(0.0, zeroIntNode.getDouble(), 0.0001);

    Node negIntNode = replacements.get("DEF_NEG_INT");
    Assert.assertEquals(Token.NUMBER, negIntNode.getType());
    Assert.assertEquals(-100.0, negIntNode.getDouble(), 0.0001);

    Node doubleNode = replacements.get("DEF_DOUBLE");
    Assert.assertEquals(Token.NUMBER, doubleNode.getType());
    Assert.assertEquals(3.1415, doubleNode.getDouble(), 0.0001);

    Node zeroDoubleNode = replacements.get("DEF_ZERO_DOUBLE");
    Assert.assertEquals(Token.NUMBER, zeroDoubleNode.getType());
    Assert.assertEquals(0.0, zeroDoubleNode.getDouble(), 0.0001);

    Node strNode = replacements.get("DEF_STRING");
    Assert.assertEquals(Token.STRING, strNode.getType());
    Assert.assertEquals("hello", strNode.getString());

    Node emptyStrNode = replacements.get("DEF_EMPTY_STRING");
    Assert.assertEquals(Token.STRING, emptyStrNode.getType());
    Assert.assertEquals("", emptyStrNode.getString());
  }

  @Test
  public void testSkipAllCompilerPasses_setsFlagTrue() {
    CompilerOptions options = new CompilerOptions();
    Assert.assertFalse(options.skipAllPasses);
    options.skipAllCompilerPasses();
    Assert.assertTrue(options.skipAllPasses);
  }

  @Test
  public void testWarningsGuard_enablesAndDisablesWithNullGuard() {
    CompilerOptions options = new CompilerOptions();
    DiagnosticGroup group = new DiagnosticGroup("testGroup", DiagnosticType.error("TEST_ERR", "description"));
    Assert.assertFalse(options.enables(group));
    Assert.assertFalse(options.disables(group));
  }

  @Test
  public void testSetWarningLevel_enablesAndDisablesDiagnosticGroup() {
    CompilerOptions options = new CompilerOptions();
    DiagnosticGroup groupOn = new DiagnosticGroup("groupOn", DiagnosticType.error("ERR_ON", "msg"));
    DiagnosticGroup groupOff = new DiagnosticGroup("groupOff", DiagnosticType.error("ERR_OFF", "msg"));

    options.setWarningLevel(groupOn, CheckLevel.WARNING);
    options.setWarningLevel(groupOff, CheckLevel.OFF);

    Assert.assertNotNull(options.getWarningsGuard());
    Assert.assertTrue(options.enables(groupOn));
    Assert.assertFalse(options.disables(groupOn));

    Assert.assertTrue(options.disables(groupOff));
    Assert.assertFalse(options.enables(groupOff));
  }

  @Test
  public void testAddWarningsGuard_multipleGuardsAppended() {
    CompilerOptions options = new CompilerOptions();
    DiagnosticGroup group1 = new DiagnosticGroup("group1", DiagnosticType.error("ERR_1", "msg"));
    DiagnosticGroup group2 = new DiagnosticGroup("group2", DiagnosticType.error("ERR_2", "msg"));

    WarningsGuard guard1 = new DiagnosticGroupWarningsGuard(group1, CheckLevel.ERROR);
    WarningsGuard guard2 = new DiagnosticGroupWarningsGuard(group2, CheckLevel.OFF);

    options.addWarningsGuard(guard1);
    Assert.assertNotNull(options.getWarningsGuard());
    Assert.assertTrue(options.enables(group1));

    options.addWarningsGuard(guard2);
    Assert.assertTrue(options.enables(group1));
    Assert.assertTrue(options.disables(group2));
  }

  @Test
  public void testSetRenamingPolicy_validPolicies() {
    CompilerOptions options = new CompilerOptions();
    options.setRenamingPolicy(VariableRenamingPolicy.ALL, PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC);
    Assert.assertEquals(VariableRenamingPolicy.ALL, options.variableRenaming);
    Assert.assertEquals(PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC, options.propertyRenaming);

    options.setRenamingPolicy(VariableRenamingPolicy.LOCAL, PropertyRenamingPolicy.UNTYPED);
    Assert.assertEquals(VariableRenamingPolicy.LOCAL, options.variableRenaming);
    Assert.assertEquals(PropertyRenamingPolicy.UNTYPED, options.propertyRenaming);
  }

  @Test
  public void testSetCollapsePropertiesOnExternTypes_toggle() {
    CompilerOptions options = new CompilerOptions();
    options.setCollapsePropertiesOnExternTypes(true);
    Assert.assertTrue(options.collapsePropertiesOnExternTypes);
    options.setCollapsePropertiesOnExternTypes(false);
    Assert.assertFalse(options.collapsePropertiesOnExternTypes);
  }

  @Test
  public void testSetProcessObjectPropertyString_toggle() {
    CompilerOptions options = new CompilerOptions();
    options.setProcessObjectPropertyString(true);
    Assert.assertTrue(options.processObjectPropertyString);
    options.setProcessObjectPropertyString(false);
    Assert.assertFalse(options.processObjectPropertyString);
  }

  @Test
  public void testSetIdGenerators_normalAndEmpty() {
    CompilerOptions options = new CompilerOptions();
    Set<String> ids = Sets.newHashSet("genId1", "genId2");
    options.setIdGenerators(ids);
    Assert.assertEquals(ids, options.idGenerators);

    options.setIdGenerators(Collections.<String>emptySet());
    Assert.assertTrue(options.idGenerators.isEmpty());
  }

  @Test
  public void testSetReplaceStringsConfiguration_normalAndEmpty() {
    CompilerOptions options = new CompilerOptions();
    List<String> descriptors = Lists.newArrayList("func1(1)", "func2(2)");
    options.setReplaceStringsConfiguration("TOKEN_XYZ", descriptors);

    Assert.assertEquals("TOKEN_XYZ", options.replaceStringsPlaceholderToken);
    Assert.assertEquals(descriptors, options.replaceStringsFunctionDescriptions);

    options.setReplaceStringsConfiguration("", Collections.<String>emptyList());
    Assert.assertEquals("", options.replaceStringsPlaceholderToken);
    Assert.assertTrue(options.replaceStringsFunctionDescriptions.isEmpty());
  }

  @Test
  public void testSetRewriteNewDateGoogNow_toggle() {
    CompilerOptions options = new CompilerOptions();
    options.setRewriteNewDateGoogNow(false);
    Assert.assertFalse(options.rewriteNewDateGoogNow);
    options.setRewriteNewDateGoogNow(true);
    Assert.assertTrue(options.rewriteNewDateGoogNow);
  }

  @Test
  public void testSetRemoveAbstractMethods_toggle() {
    CompilerOptions options = new CompilerOptions();
    options.setRemoveAbstractMethods(false);
    Assert.assertFalse(options.removeAbstractMethods);
    options.setRemoveAbstractMethods(true);
    Assert.assertTrue(options.removeAbstractMethods);
  }

  @Test
  public void testSetNameAnonymousFunctionsOnly_toggle() {
    CompilerOptions options = new CompilerOptions();
    options.setNameAnonymousFunctionsOnly(true);
    Assert.assertTrue(options.nameAnonymousFunctionsOnly);
    options.setNameAnonymousFunctionsOnly(false);
    Assert.assertFalse(options.nameAnonymousFunctionsOnly);
  }

  @Test
  public void testSetColorizeErrorOutput_toggle() {
    CompilerOptions options = new CompilerOptions();
    options.setColorizeErrorOutput(true);
    Assert.assertTrue(options.shouldColorizeErrorOutput());
    options.setColorizeErrorOutput(false);
    Assert.assertFalse(options.shouldColorizeErrorOutput());
  }

  @Test
  public void testSetChainCalls_toggle() {
    CompilerOptions options = new CompilerOptions();
    options.setChainCalls(true);
    Assert.assertTrue(options.chainCalls);
    options.setChainCalls(false);
    Assert.assertFalse(options.chainCalls);
  }

  @Test
  public void testRuntimeTypeCheck_enableAndDisable() {
    CompilerOptions options = new CompilerOptions();
    options.enableRuntimeTypeCheck("myLogFunction");
    Assert.assertTrue(options.runtimeTypeCheck);
    Assert.assertEquals("myLogFunction", options.runtimeTypeCheckLogFunction);

    options.enableRuntimeTypeCheck(null);
    Assert.assertTrue(options.runtimeTypeCheck);
    Assert.assertNull(options.runtimeTypeCheckLogFunction);

    options.disableRuntimeTypeCheck();
    Assert.assertFalse(options.runtimeTypeCheck);
  }

  @Test
  public void testCodingConvention_getterAndSetter() {
    CompilerOptions options = new CompilerOptions();
    Assert.assertNull(options.getCodingConvention());

    CodingConvention convention = new ClosureCodingConvention();
    options.setCodingConvention(convention);
    Assert.assertSame(convention, options.getCodingConvention());

    options.setCodingConvention(null);
    Assert.assertNull(options.getCodingConvention());
  }

  @Test
  public void testSetManageClosureDependencies_toggle() {
    CompilerOptions options = new CompilerOptions();
    options.setManageClosureDependencies(true);
    Assert.assertTrue(options.manageClosureDependencies);
    options.setManageClosureDependencies(false);
    Assert.assertFalse(options.manageClosureDependencies);
  }

  @Test
  public void testSetSummaryDetailLevel_variousValues() {
    CompilerOptions options = new CompilerOptions();
    options.setSummaryDetailLevel(0);
    Assert.assertEquals(0, options.summaryDetailLevel);
    options.setSummaryDetailLevel(3);
    Assert.assertEquals(3, options.summaryDetailLevel);
    options.setSummaryDetailLevel(-1);
    Assert.assertEquals(-1, options.summaryDetailLevel);
  }

  @Test
  public void testExternExports_enableAndDisable() {
    CompilerOptions options = new CompilerOptions();
    Assert.assertFalse(options.isExternExportsEnabled());

    options.enableExternExports(true);
    Assert.assertTrue(options.isExternExportsEnabled());

    options.enableExternExports(false);
    Assert.assertFalse(options.isExternExportsEnabled());
  }

  @Test
  public void testSetLooseTypes_toggle() {
    CompilerOptions options = new CompilerOptions();
    options.setLooseTypes(true);
    Assert.assertTrue(options.looseTypes);
    options.setLooseTypes(false);
    Assert.assertFalse(options.looseTypes);
  }

  @Test
  public void testClone_createsDistinctCopy() throws CloneNotSupportedException {
    CompilerOptions options = new CompilerOptions();
    options.checkSymbols = true;
    options.outputCharset = Charset.forName("UTF-8");
    options.jsOutputFile = "out.js";

    Object cloned = options.clone();
    Assert.assertNotNull(cloned);
    Assert.assertTrue(cloned instanceof CompilerOptions);
    Assert.assertNotSame(options, cloned);

    CompilerOptions clonedOptions = (CompilerOptions) cloned;
    Assert.assertTrue(clonedOptions.checkSymbols);
    Assert.assertEquals(Charset.forName("UTF-8"), clonedOptions.outputCharset);
    Assert.assertEquals("out.js", clonedOptions.jsOutputFile);
  }

  @Test
  public void testDevMode_enumCoverage() {
    CompilerOptions.DevMode[] values = CompilerOptions.DevMode.values();
    Assert.assertEquals(4, values.length);
    Assert.assertEquals(CompilerOptions.DevMode.OFF, CompilerOptions.DevMode.valueOf("OFF"));
    Assert.assertEquals(CompilerOptions.DevMode.START, CompilerOptions.DevMode.valueOf("START"));
    Assert.assertEquals(CompilerOptions.DevMode.START_AND_END, CompilerOptions.DevMode.valueOf("START_AND_END"));
    Assert.assertEquals(CompilerOptions.DevMode.EVERY_PASS, CompilerOptions.DevMode.valueOf("EVERY_PASS"));
  }

  @Test
  public void testTracerMode_isOnAndEnumCoverage() {
    CompilerOptions.TracerMode[] values = CompilerOptions.TracerMode.values();
    Assert.assertEquals(3, values.length);
    Assert.assertTrue(CompilerOptions.TracerMode.ALL.isOn());
    Assert.assertTrue(CompilerOptions.TracerMode.FAST.isOn());
    Assert.assertFalse(CompilerOptions.TracerMode.OFF.isOn());
    Assert.assertEquals(CompilerOptions.TracerMode.ALL, CompilerOptions.TracerMode.valueOf("ALL"));
    Assert.assertEquals(CompilerOptions.TracerMode.FAST, CompilerOptions.TracerMode.valueOf("FAST"));
    Assert.assertEquals(CompilerOptions.TracerMode.OFF, CompilerOptions.TracerMode.valueOf("OFF"));
  }
}
