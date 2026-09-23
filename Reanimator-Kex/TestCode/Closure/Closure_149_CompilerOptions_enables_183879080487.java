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

public class CompilerOptions_enables_183879080487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275412;
     Object term275669;

    public CompilerOptions_enables_183879080487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term275568 = new ArrayList();
        term275412 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term275516 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setField(term275516, term275516.getClass(), "guards", term275568);
        setField(term275412, term275412.getClass(), "warningsGuard", term275516);
        ArrayList term275671 = new ArrayList();
        term275669 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term275670 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setBooleanField(term275669, term275669.getClass(), "ideMode", false);
        setBooleanField(term275669, term275669.getClass(), "skipAllPasses", false);
        setBooleanField(term275669, term275669.getClass(), "nameAnonymousFunctionsOnly", false);
        setField(term275669, term275669.getClass(), "devMode", null);
        setBooleanField(term275669, term275669.getClass(), "manageClosureDependencies", false);
        setField(term275669, term275669.getClass(), "messageBundle", null);
        setBooleanField(term275669, term275669.getClass(), "checkSymbols", false);
        setField(term275669, term275669.getClass(), "checkShadowVars", null);
        setField(term275669, term275669.getClass(), "aggressiveVarCheck", null);
        setField(term275669, term275669.getClass(), "checkFunctions", null);
        setField(term275669, term275669.getClass(), "checkMethods", null);
        setBooleanField(term275669, term275669.getClass(), "checkDuplicateMessages", false);
        setBooleanField(term275669, term275669.getClass(), "allowLegacyJsMessages", false);
        setBooleanField(term275669, term275669.getClass(), "strictMessageReplacement", false);
        setBooleanField(term275669, term275669.getClass(), "checkSuspiciousCode", false);
        setBooleanField(term275669, term275669.getClass(), "checkControlStructures", false);
        setField(term275669, term275669.getClass(), "checkUndefinedProperties", null);
        setBooleanField(term275669, term275669.getClass(), "checkUnusedPropertiesEarly", false);
        setBooleanField(term275669, term275669.getClass(), "checkTypes", false);
        setBooleanField(term275669, term275669.getClass(), "tightenTypes", false);
        setBooleanField(term275669, term275669.getClass(), "inferTypesInGlobalScope", false);
        setBooleanField(term275669, term275669.getClass(), "checkTypedPropertyCalls", false);
        setField(term275669, term275669.getClass(), "reportMissingOverride", null);
        setField(term275669, term275669.getClass(), "reportUnknownTypes", null);
        setField(term275669, term275669.getClass(), "checkRequires", null);
        setField(term275669, term275669.getClass(), "checkProvides", null);
        setField(term275669, term275669.getClass(), "checkGlobalNamesLevel", null);
        setField(term275669, term275669.getClass(), "brokenClosureRequiresLevel", null);
        setField(term275669, term275669.getClass(), "checkGlobalThisLevel", null);
        setField(term275669, term275669.getClass(), "checkMissingGetCssNameLevel", null);
        setField(term275669, term275669.getClass(), "checkMissingGetCssNameBlacklist", null);
        setBooleanField(term275669, term275669.getClass(), "checkEs5Strict", false);
        setBooleanField(term275669, term275669.getClass(), "checkCaja", false);
        setBooleanField(term275669, term275669.getClass(), "foldConstants", false);
        setBooleanField(term275669, term275669.getClass(), "removeConstantExpressions", false);
        setBooleanField(term275669, term275669.getClass(), "deadAssignmentElimination", false);
        setBooleanField(term275669, term275669.getClass(), "inlineConstantVars", false);
        setBooleanField(term275669, term275669.getClass(), "inlineFunctions", false);
        setBooleanField(term275669, term275669.getClass(), "decomposeExpressions", false);
        setBooleanField(term275669, term275669.getClass(), "inlineAnonymousFunctionExpressions", false);
        setBooleanField(term275669, term275669.getClass(), "inlineLocalFunctions", false);
        setBooleanField(term275669, term275669.getClass(), "crossModuleCodeMotion", false);
        setBooleanField(term275669, term275669.getClass(), "coalesceVariableNames", false);
        setBooleanField(term275669, term275669.getClass(), "crossModuleMethodMotion", false);
        setBooleanField(term275669, term275669.getClass(), "inlineGetters", false);
        setBooleanField(term275669, term275669.getClass(), "inlineVariables", false);
        setBooleanField(term275669, term275669.getClass(), "inlineLocalVariables", false);
        setBooleanField(term275669, term275669.getClass(), "flowSensitiveInlineVariables", false);
        setBooleanField(term275669, term275669.getClass(), "smartNameRemoval", false);
        setBooleanField(term275669, term275669.getClass(), "removeDeadCode", false);
        setField(term275669, term275669.getClass(), "checkUnreachableCode", null);
        setField(term275669, term275669.getClass(), "checkMissingReturn", null);
        setBooleanField(term275669, term275669.getClass(), "extractPrototypeMemberDeclarations", false);
        setBooleanField(term275669, term275669.getClass(), "removeEmptyFunctions", false);
        setBooleanField(term275669, term275669.getClass(), "removeUnusedPrototypeProperties", false);
        setBooleanField(term275669, term275669.getClass(), "removeUnusedPrototypePropertiesInExterns", false);
        setBooleanField(term275669, term275669.getClass(), "removeUnusedVars", false);
        setBooleanField(term275669, term275669.getClass(), "removeUnusedVarsInGlobalScope", false);
        setBooleanField(term275669, term275669.getClass(), "aliasExternals", false);
        setField(term275669, term275669.getClass(), "aliasableGlobals", null);
        setField(term275669, term275669.getClass(), "unaliasableGlobals", null);
        setBooleanField(term275669, term275669.getClass(), "collapseVariableDeclarations", false);
        setBooleanField(term275669, term275669.getClass(), "groupVariableDeclarations", false);
        setBooleanField(term275669, term275669.getClass(), "collapseAnonymousFunctions", false);
        setField(term275669, term275669.getClass(), "aliasableStrings", null);
        setField(term275669, term275669.getClass(), "aliasStringsBlacklist", null);
        setBooleanField(term275669, term275669.getClass(), "aliasAllStrings", false);
        setBooleanField(term275669, term275669.getClass(), "outputJsStringUsage", false);
        setBooleanField(term275669, term275669.getClass(), "convertToDottedProperties", false);
        setBooleanField(term275669, term275669.getClass(), "rewriteFunctionExpressions", false);
        setBooleanField(term275669, term275669.getClass(), "optimizeParameters", false);
        setBooleanField(term275669, term275669.getClass(), "optimizeArgumentsArray", false);
        setBooleanField(term275669, term275669.getClass(), "chainCalls", false);
        setField(term275669, term275669.getClass(), "variableRenaming", null);
        setField(term275669, term275669.getClass(), "propertyRenaming", null);
        setBooleanField(term275669, term275669.getClass(), "labelRenaming", false);
        setBooleanField(term275669, term275669.getClass(), "reserveRawExports", false);
        setBooleanField(term275669, term275669.getClass(), "generatePseudoNames", false);
        setField(term275669, term275669.getClass(), "renamePrefix", null);
        setBooleanField(term275669, term275669.getClass(), "aliasKeywords", false);
        setBooleanField(term275669, term275669.getClass(), "collapseProperties", false);
        setBooleanField(term275669, term275669.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term275669, term275669.getClass(), "devirtualizePrototypeMethods", false);
        setBooleanField(term275669, term275669.getClass(), "computeFunctionSideEffects", false);
        setField(term275669, term275669.getClass(), "debugFunctionSideEffectsPath", null);
        setBooleanField(term275669, term275669.getClass(), "disambiguateProperties", false);
        setBooleanField(term275669, term275669.getClass(), "ambiguateProperties", false);
        setField(term275669, term275669.getClass(), "anonymousFunctionNaming", null);
        setField(term275669, term275669.getClass(), "inputVariableMapSerialized", null);
        setField(term275669, term275669.getClass(), "inputPropertyMapSerialized", null);
        setBooleanField(term275669, term275669.getClass(), "exportTestFunctions", false);
        setBooleanField(term275669, term275669.getClass(), "runtimeTypeCheck", false);
        setField(term275669, term275669.getClass(), "runtimeTypeCheckLogFunction", null);
        setField(term275669, term275669.getClass(), "codingConvention", null);
        setBooleanField(term275669, term275669.getClass(), "instrumentForCoverage", false);
        setBooleanField(term275669, term275669.getClass(), "instrumentForCoverageOnly", false);
        setBooleanField(term275669, term275669.getClass(), "ignoreCajaProperties", false);
        setField(term275669, term275669.getClass(), "syntheticBlockStartMarker", null);
        setField(term275669, term275669.getClass(), "syntheticBlockEndMarker", null);
        setField(term275669, term275669.getClass(), "locale", null);
        setBooleanField(term275669, term275669.getClass(), "markAsCompiled", false);
        setBooleanField(term275669, term275669.getClass(), "removeTryCatchFinally", false);
        setBooleanField(term275669, term275669.getClass(), "closurePass", false);
        setBooleanField(term275669, term275669.getClass(), "rewriteNewDateGoogNow", false);
        setBooleanField(term275669, term275669.getClass(), "removeAbstractMethods", false);
        setBooleanField(term275669, term275669.getClass(), "gatherCssNames", false);
        setField(term275669, term275669.getClass(), "stripTypes", null);
        setField(term275669, term275669.getClass(), "stripNameSuffixes", null);
        setField(term275669, term275669.getClass(), "stripNamePrefixes", null);
        setField(term275669, term275669.getClass(), "stripTypePrefixes", null);
        setField(term275669, term275669.getClass(), "customPasses", null);
        setBooleanField(term275669, term275669.getClass(), "markNoSideEffectCalls", false);
        setField(term275669, term275669.getClass(), "defineReplacements", null);
        setBooleanField(term275669, term275669.getClass(), "moveFunctionDeclarations", false);
        setField(term275669, term275669.getClass(), "instrumentationTemplate", null);
        setField(term275669, term275669.getClass(), "appNameStr", null);
        setBooleanField(term275669, term275669.getClass(), "recordFunctionInformation", false);
        setBooleanField(term275669, term275669.getClass(), "generateExports", false);
        setField(term275669, term275669.getClass(), "cssRenamingMap", null);
        setBooleanField(term275669, term275669.getClass(), "processObjectPropertyString", false);
        setField(term275669, term275669.getClass(), "idGenerators", null);
        setField(term275669, term275669.getClass(), "replaceStringsFunctionDescriptions", null);
        setField(term275669, term275669.getClass(), "replaceStringsPlaceholderToken", null);
        setBooleanField(term275669, term275669.getClass(), "prettyPrint", false);
        setBooleanField(term275669, term275669.getClass(), "lineBreak", false);
        setBooleanField(term275669, term275669.getClass(), "printInputDelimiter", false);
        setField(term275669, term275669.getClass(), "inputDelimiter", null);
        setField(term275669, term275669.getClass(), "reportPath", null);
        setField(term275669, term275669.getClass(), "tracer", null);
        setBooleanField(term275669, term275669.getClass(), "colorizeErrorOutput", false);
        setField(term275669, term275669.getClass(), "errorFormat", null);
        setField(term275669, term275669.getClass(), "jsOutputFile", null);
        setField(term275670, term275670.getClass(), "guards", term275671);
        setField(term275669, term275669.getClass(), "warningsGuard", term275670);
        setIntField(term275669, term275669.getClass(), "summaryDetailLevel", 0);
        setBooleanField(term275669, term275669.getClass(), "externExports", false);
        setField(term275669, term275669.getClass(), "externExportsPath", null);
        setField(term275669, term275669.getClass(), "nameReferenceReportPath", null);
        setField(term275669, term275669.getClass(), "nameReferenceGraphPath", null);
        setField(term275669, term275669.getClass(), "sourceMapOutputPath", null);
        setField(term275669, term275669.getClass(), "sourceMapDetailLevel", null);
        setField(term275669, term275669.getClass(), "outputCharset", null);
        setBooleanField(term275669, term275669.getClass(), "looseTypes", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticGroup");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "enables", argTypes, term275412, args);
        assertTrue(recursiveEquals(term275412, term275669));
        assertTrue(recursiveEquals(retValue, false));
    }

};


