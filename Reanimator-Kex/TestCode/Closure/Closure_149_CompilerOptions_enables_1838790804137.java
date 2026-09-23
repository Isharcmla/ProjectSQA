package com.google.javascript.jscomp;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class CompilerOptions_enables_1838790804137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317772;
     Object term318029;

    public CompilerOptions_enables_1838790804137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term317928 = new ArrayList();
        term317772 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term317876 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setField(term317876, term317876.getClass(), "guards", term317928);
        setField(term317772, term317772.getClass(), "warningsGuard", term317876);
        ArrayList term318031 = new ArrayList();
        term318029 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term318030 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setBooleanField(term318029, term318029.getClass(), "ideMode", false);
        setBooleanField(term318029, term318029.getClass(), "skipAllPasses", false);
        setBooleanField(term318029, term318029.getClass(), "nameAnonymousFunctionsOnly", false);
        setField(term318029, term318029.getClass(), "devMode", null);
        setBooleanField(term318029, term318029.getClass(), "manageClosureDependencies", false);
        setField(term318029, term318029.getClass(), "messageBundle", null);
        setBooleanField(term318029, term318029.getClass(), "checkSymbols", false);
        setField(term318029, term318029.getClass(), "checkShadowVars", null);
        setField(term318029, term318029.getClass(), "aggressiveVarCheck", null);
        setField(term318029, term318029.getClass(), "checkFunctions", null);
        setField(term318029, term318029.getClass(), "checkMethods", null);
        setBooleanField(term318029, term318029.getClass(), "checkDuplicateMessages", false);
        setBooleanField(term318029, term318029.getClass(), "allowLegacyJsMessages", false);
        setBooleanField(term318029, term318029.getClass(), "strictMessageReplacement", false);
        setBooleanField(term318029, term318029.getClass(), "checkSuspiciousCode", false);
        setBooleanField(term318029, term318029.getClass(), "checkControlStructures", false);
        setField(term318029, term318029.getClass(), "checkUndefinedProperties", null);
        setBooleanField(term318029, term318029.getClass(), "checkUnusedPropertiesEarly", false);
        setBooleanField(term318029, term318029.getClass(), "checkTypes", false);
        setBooleanField(term318029, term318029.getClass(), "tightenTypes", false);
        setBooleanField(term318029, term318029.getClass(), "inferTypesInGlobalScope", false);
        setBooleanField(term318029, term318029.getClass(), "checkTypedPropertyCalls", false);
        setField(term318029, term318029.getClass(), "reportMissingOverride", null);
        setField(term318029, term318029.getClass(), "reportUnknownTypes", null);
        setField(term318029, term318029.getClass(), "checkRequires", null);
        setField(term318029, term318029.getClass(), "checkProvides", null);
        setField(term318029, term318029.getClass(), "checkGlobalNamesLevel", null);
        setField(term318029, term318029.getClass(), "brokenClosureRequiresLevel", null);
        setField(term318029, term318029.getClass(), "checkGlobalThisLevel", null);
        setField(term318029, term318029.getClass(), "checkMissingGetCssNameLevel", null);
        setField(term318029, term318029.getClass(), "checkMissingGetCssNameBlacklist", null);
        setBooleanField(term318029, term318029.getClass(), "checkEs5Strict", false);
        setBooleanField(term318029, term318029.getClass(), "checkCaja", false);
        setBooleanField(term318029, term318029.getClass(), "foldConstants", false);
        setBooleanField(term318029, term318029.getClass(), "removeConstantExpressions", false);
        setBooleanField(term318029, term318029.getClass(), "deadAssignmentElimination", false);
        setBooleanField(term318029, term318029.getClass(), "inlineConstantVars", false);
        setBooleanField(term318029, term318029.getClass(), "inlineFunctions", false);
        setBooleanField(term318029, term318029.getClass(), "decomposeExpressions", false);
        setBooleanField(term318029, term318029.getClass(), "inlineAnonymousFunctionExpressions", false);
        setBooleanField(term318029, term318029.getClass(), "inlineLocalFunctions", false);
        setBooleanField(term318029, term318029.getClass(), "crossModuleCodeMotion", false);
        setBooleanField(term318029, term318029.getClass(), "coalesceVariableNames", false);
        setBooleanField(term318029, term318029.getClass(), "crossModuleMethodMotion", false);
        setBooleanField(term318029, term318029.getClass(), "inlineGetters", false);
        setBooleanField(term318029, term318029.getClass(), "inlineVariables", false);
        setBooleanField(term318029, term318029.getClass(), "inlineLocalVariables", false);
        setBooleanField(term318029, term318029.getClass(), "flowSensitiveInlineVariables", false);
        setBooleanField(term318029, term318029.getClass(), "smartNameRemoval", false);
        setBooleanField(term318029, term318029.getClass(), "removeDeadCode", false);
        setField(term318029, term318029.getClass(), "checkUnreachableCode", null);
        setField(term318029, term318029.getClass(), "checkMissingReturn", null);
        setBooleanField(term318029, term318029.getClass(), "extractPrototypeMemberDeclarations", false);
        setBooleanField(term318029, term318029.getClass(), "removeEmptyFunctions", false);
        setBooleanField(term318029, term318029.getClass(), "removeUnusedPrototypeProperties", false);
        setBooleanField(term318029, term318029.getClass(), "removeUnusedPrototypePropertiesInExterns", false);
        setBooleanField(term318029, term318029.getClass(), "removeUnusedVars", false);
        setBooleanField(term318029, term318029.getClass(), "removeUnusedVarsInGlobalScope", false);
        setBooleanField(term318029, term318029.getClass(), "aliasExternals", false);
        setField(term318029, term318029.getClass(), "aliasableGlobals", null);
        setField(term318029, term318029.getClass(), "unaliasableGlobals", null);
        setBooleanField(term318029, term318029.getClass(), "collapseVariableDeclarations", false);
        setBooleanField(term318029, term318029.getClass(), "groupVariableDeclarations", false);
        setBooleanField(term318029, term318029.getClass(), "collapseAnonymousFunctions", false);
        setField(term318029, term318029.getClass(), "aliasableStrings", null);
        setField(term318029, term318029.getClass(), "aliasStringsBlacklist", null);
        setBooleanField(term318029, term318029.getClass(), "aliasAllStrings", false);
        setBooleanField(term318029, term318029.getClass(), "outputJsStringUsage", false);
        setBooleanField(term318029, term318029.getClass(), "convertToDottedProperties", false);
        setBooleanField(term318029, term318029.getClass(), "rewriteFunctionExpressions", false);
        setBooleanField(term318029, term318029.getClass(), "optimizeParameters", false);
        setBooleanField(term318029, term318029.getClass(), "optimizeArgumentsArray", false);
        setBooleanField(term318029, term318029.getClass(), "chainCalls", false);
        setField(term318029, term318029.getClass(), "variableRenaming", null);
        setField(term318029, term318029.getClass(), "propertyRenaming", null);
        setBooleanField(term318029, term318029.getClass(), "labelRenaming", false);
        setBooleanField(term318029, term318029.getClass(), "reserveRawExports", false);
        setBooleanField(term318029, term318029.getClass(), "generatePseudoNames", false);
        setField(term318029, term318029.getClass(), "renamePrefix", null);
        setBooleanField(term318029, term318029.getClass(), "aliasKeywords", false);
        setBooleanField(term318029, term318029.getClass(), "collapseProperties", false);
        setBooleanField(term318029, term318029.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term318029, term318029.getClass(), "devirtualizePrototypeMethods", false);
        setBooleanField(term318029, term318029.getClass(), "computeFunctionSideEffects", false);
        setField(term318029, term318029.getClass(), "debugFunctionSideEffectsPath", null);
        setBooleanField(term318029, term318029.getClass(), "disambiguateProperties", false);
        setBooleanField(term318029, term318029.getClass(), "ambiguateProperties", false);
        setField(term318029, term318029.getClass(), "anonymousFunctionNaming", null);
        setField(term318029, term318029.getClass(), "inputVariableMapSerialized", null);
        setField(term318029, term318029.getClass(), "inputPropertyMapSerialized", null);
        setBooleanField(term318029, term318029.getClass(), "exportTestFunctions", false);
        setBooleanField(term318029, term318029.getClass(), "runtimeTypeCheck", false);
        setField(term318029, term318029.getClass(), "runtimeTypeCheckLogFunction", null);
        setField(term318029, term318029.getClass(), "codingConvention", null);
        setBooleanField(term318029, term318029.getClass(), "instrumentForCoverage", false);
        setBooleanField(term318029, term318029.getClass(), "instrumentForCoverageOnly", false);
        setBooleanField(term318029, term318029.getClass(), "ignoreCajaProperties", false);
        setField(term318029, term318029.getClass(), "syntheticBlockStartMarker", null);
        setField(term318029, term318029.getClass(), "syntheticBlockEndMarker", null);
        setField(term318029, term318029.getClass(), "locale", null);
        setBooleanField(term318029, term318029.getClass(), "markAsCompiled", false);
        setBooleanField(term318029, term318029.getClass(), "removeTryCatchFinally", false);
        setBooleanField(term318029, term318029.getClass(), "closurePass", false);
        setBooleanField(term318029, term318029.getClass(), "rewriteNewDateGoogNow", false);
        setBooleanField(term318029, term318029.getClass(), "removeAbstractMethods", false);
        setBooleanField(term318029, term318029.getClass(), "gatherCssNames", false);
        setField(term318029, term318029.getClass(), "stripTypes", null);
        setField(term318029, term318029.getClass(), "stripNameSuffixes", null);
        setField(term318029, term318029.getClass(), "stripNamePrefixes", null);
        setField(term318029, term318029.getClass(), "stripTypePrefixes", null);
        setField(term318029, term318029.getClass(), "customPasses", null);
        setBooleanField(term318029, term318029.getClass(), "markNoSideEffectCalls", false);
        setField(term318029, term318029.getClass(), "defineReplacements", null);
        setBooleanField(term318029, term318029.getClass(), "moveFunctionDeclarations", false);
        setField(term318029, term318029.getClass(), "instrumentationTemplate", null);
        setField(term318029, term318029.getClass(), "appNameStr", null);
        setBooleanField(term318029, term318029.getClass(), "recordFunctionInformation", false);
        setBooleanField(term318029, term318029.getClass(), "generateExports", false);
        setField(term318029, term318029.getClass(), "cssRenamingMap", null);
        setBooleanField(term318029, term318029.getClass(), "processObjectPropertyString", false);
        setField(term318029, term318029.getClass(), "idGenerators", null);
        setField(term318029, term318029.getClass(), "replaceStringsFunctionDescriptions", null);
        setField(term318029, term318029.getClass(), "replaceStringsPlaceholderToken", null);
        setBooleanField(term318029, term318029.getClass(), "prettyPrint", false);
        setBooleanField(term318029, term318029.getClass(), "lineBreak", false);
        setBooleanField(term318029, term318029.getClass(), "printInputDelimiter", false);
        setField(term318029, term318029.getClass(), "inputDelimiter", null);
        setField(term318029, term318029.getClass(), "reportPath", null);
        setField(term318029, term318029.getClass(), "tracer", null);
        setBooleanField(term318029, term318029.getClass(), "colorizeErrorOutput", false);
        setField(term318029, term318029.getClass(), "errorFormat", null);
        setField(term318029, term318029.getClass(), "jsOutputFile", null);
        setField(term318030, term318030.getClass(), "guards", term318031);
        setField(term318029, term318029.getClass(), "warningsGuard", term318030);
        setIntField(term318029, term318029.getClass(), "summaryDetailLevel", 0);
        setBooleanField(term318029, term318029.getClass(), "externExports", false);
        setField(term318029, term318029.getClass(), "externExportsPath", null);
        setField(term318029, term318029.getClass(), "nameReferenceReportPath", null);
        setField(term318029, term318029.getClass(), "nameReferenceGraphPath", null);
        setField(term318029, term318029.getClass(), "sourceMapOutputPath", null);
        setField(term318029, term318029.getClass(), "sourceMapDetailLevel", null);
        setField(term318029, term318029.getClass(), "outputCharset", null);
        setBooleanField(term318029, term318029.getClass(), "looseTypes", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticGroup");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "enables", argTypes, term317772, args);
        assertTrue(recursiveEquals(term317772, term318029));
        assertTrue(recursiveEquals(retValue, false));
    }

};


