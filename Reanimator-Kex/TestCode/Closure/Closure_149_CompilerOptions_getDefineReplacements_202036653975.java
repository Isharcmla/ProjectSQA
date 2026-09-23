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
import java.util.HashMap;

public class CompilerOptions_getDefineReplacements_202036653975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272333;
     Object term273147;
     Object term273051;

    public CompilerOptions_getDefineReplacements_202036653975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term272381 = new HashMap();
        term272333 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term272333, term272333.getClass(), "defineReplacements", term272381);
        HashMap term273148 = new HashMap();
        term273147 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setBooleanField(term273147, term273147.getClass(), "ideMode", false);
        setBooleanField(term273147, term273147.getClass(), "skipAllPasses", false);
        setBooleanField(term273147, term273147.getClass(), "nameAnonymousFunctionsOnly", false);
        setField(term273147, term273147.getClass(), "devMode", null);
        setBooleanField(term273147, term273147.getClass(), "manageClosureDependencies", false);
        setField(term273147, term273147.getClass(), "messageBundle", null);
        setBooleanField(term273147, term273147.getClass(), "checkSymbols", false);
        setField(term273147, term273147.getClass(), "checkShadowVars", null);
        setField(term273147, term273147.getClass(), "aggressiveVarCheck", null);
        setField(term273147, term273147.getClass(), "checkFunctions", null);
        setField(term273147, term273147.getClass(), "checkMethods", null);
        setBooleanField(term273147, term273147.getClass(), "checkDuplicateMessages", false);
        setBooleanField(term273147, term273147.getClass(), "allowLegacyJsMessages", false);
        setBooleanField(term273147, term273147.getClass(), "strictMessageReplacement", false);
        setBooleanField(term273147, term273147.getClass(), "checkSuspiciousCode", false);
        setBooleanField(term273147, term273147.getClass(), "checkControlStructures", false);
        setField(term273147, term273147.getClass(), "checkUndefinedProperties", null);
        setBooleanField(term273147, term273147.getClass(), "checkUnusedPropertiesEarly", false);
        setBooleanField(term273147, term273147.getClass(), "checkTypes", false);
        setBooleanField(term273147, term273147.getClass(), "tightenTypes", false);
        setBooleanField(term273147, term273147.getClass(), "inferTypesInGlobalScope", false);
        setBooleanField(term273147, term273147.getClass(), "checkTypedPropertyCalls", false);
        setField(term273147, term273147.getClass(), "reportMissingOverride", null);
        setField(term273147, term273147.getClass(), "reportUnknownTypes", null);
        setField(term273147, term273147.getClass(), "checkRequires", null);
        setField(term273147, term273147.getClass(), "checkProvides", null);
        setField(term273147, term273147.getClass(), "checkGlobalNamesLevel", null);
        setField(term273147, term273147.getClass(), "brokenClosureRequiresLevel", null);
        setField(term273147, term273147.getClass(), "checkGlobalThisLevel", null);
        setField(term273147, term273147.getClass(), "checkMissingGetCssNameLevel", null);
        setField(term273147, term273147.getClass(), "checkMissingGetCssNameBlacklist", null);
        setBooleanField(term273147, term273147.getClass(), "checkEs5Strict", false);
        setBooleanField(term273147, term273147.getClass(), "checkCaja", false);
        setBooleanField(term273147, term273147.getClass(), "foldConstants", false);
        setBooleanField(term273147, term273147.getClass(), "removeConstantExpressions", false);
        setBooleanField(term273147, term273147.getClass(), "deadAssignmentElimination", false);
        setBooleanField(term273147, term273147.getClass(), "inlineConstantVars", false);
        setBooleanField(term273147, term273147.getClass(), "inlineFunctions", false);
        setBooleanField(term273147, term273147.getClass(), "decomposeExpressions", false);
        setBooleanField(term273147, term273147.getClass(), "inlineAnonymousFunctionExpressions", false);
        setBooleanField(term273147, term273147.getClass(), "inlineLocalFunctions", false);
        setBooleanField(term273147, term273147.getClass(), "crossModuleCodeMotion", false);
        setBooleanField(term273147, term273147.getClass(), "coalesceVariableNames", false);
        setBooleanField(term273147, term273147.getClass(), "crossModuleMethodMotion", false);
        setBooleanField(term273147, term273147.getClass(), "inlineGetters", false);
        setBooleanField(term273147, term273147.getClass(), "inlineVariables", false);
        setBooleanField(term273147, term273147.getClass(), "inlineLocalVariables", false);
        setBooleanField(term273147, term273147.getClass(), "flowSensitiveInlineVariables", false);
        setBooleanField(term273147, term273147.getClass(), "smartNameRemoval", false);
        setBooleanField(term273147, term273147.getClass(), "removeDeadCode", false);
        setField(term273147, term273147.getClass(), "checkUnreachableCode", null);
        setField(term273147, term273147.getClass(), "checkMissingReturn", null);
        setBooleanField(term273147, term273147.getClass(), "extractPrototypeMemberDeclarations", false);
        setBooleanField(term273147, term273147.getClass(), "removeEmptyFunctions", false);
        setBooleanField(term273147, term273147.getClass(), "removeUnusedPrototypeProperties", false);
        setBooleanField(term273147, term273147.getClass(), "removeUnusedPrototypePropertiesInExterns", false);
        setBooleanField(term273147, term273147.getClass(), "removeUnusedVars", false);
        setBooleanField(term273147, term273147.getClass(), "removeUnusedVarsInGlobalScope", false);
        setBooleanField(term273147, term273147.getClass(), "aliasExternals", false);
        setField(term273147, term273147.getClass(), "aliasableGlobals", null);
        setField(term273147, term273147.getClass(), "unaliasableGlobals", null);
        setBooleanField(term273147, term273147.getClass(), "collapseVariableDeclarations", false);
        setBooleanField(term273147, term273147.getClass(), "groupVariableDeclarations", false);
        setBooleanField(term273147, term273147.getClass(), "collapseAnonymousFunctions", false);
        setField(term273147, term273147.getClass(), "aliasableStrings", null);
        setField(term273147, term273147.getClass(), "aliasStringsBlacklist", null);
        setBooleanField(term273147, term273147.getClass(), "aliasAllStrings", false);
        setBooleanField(term273147, term273147.getClass(), "outputJsStringUsage", false);
        setBooleanField(term273147, term273147.getClass(), "convertToDottedProperties", false);
        setBooleanField(term273147, term273147.getClass(), "rewriteFunctionExpressions", false);
        setBooleanField(term273147, term273147.getClass(), "optimizeParameters", false);
        setBooleanField(term273147, term273147.getClass(), "optimizeArgumentsArray", false);
        setBooleanField(term273147, term273147.getClass(), "chainCalls", false);
        setField(term273147, term273147.getClass(), "variableRenaming", null);
        setField(term273147, term273147.getClass(), "propertyRenaming", null);
        setBooleanField(term273147, term273147.getClass(), "labelRenaming", false);
        setBooleanField(term273147, term273147.getClass(), "reserveRawExports", false);
        setBooleanField(term273147, term273147.getClass(), "generatePseudoNames", false);
        setField(term273147, term273147.getClass(), "renamePrefix", null);
        setBooleanField(term273147, term273147.getClass(), "aliasKeywords", false);
        setBooleanField(term273147, term273147.getClass(), "collapseProperties", false);
        setBooleanField(term273147, term273147.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term273147, term273147.getClass(), "devirtualizePrototypeMethods", false);
        setBooleanField(term273147, term273147.getClass(), "computeFunctionSideEffects", false);
        setField(term273147, term273147.getClass(), "debugFunctionSideEffectsPath", null);
        setBooleanField(term273147, term273147.getClass(), "disambiguateProperties", false);
        setBooleanField(term273147, term273147.getClass(), "ambiguateProperties", false);
        setField(term273147, term273147.getClass(), "anonymousFunctionNaming", null);
        setField(term273147, term273147.getClass(), "inputVariableMapSerialized", null);
        setField(term273147, term273147.getClass(), "inputPropertyMapSerialized", null);
        setBooleanField(term273147, term273147.getClass(), "exportTestFunctions", false);
        setBooleanField(term273147, term273147.getClass(), "runtimeTypeCheck", false);
        setField(term273147, term273147.getClass(), "runtimeTypeCheckLogFunction", null);
        setField(term273147, term273147.getClass(), "codingConvention", null);
        setBooleanField(term273147, term273147.getClass(), "instrumentForCoverage", false);
        setBooleanField(term273147, term273147.getClass(), "instrumentForCoverageOnly", false);
        setBooleanField(term273147, term273147.getClass(), "ignoreCajaProperties", false);
        setField(term273147, term273147.getClass(), "syntheticBlockStartMarker", null);
        setField(term273147, term273147.getClass(), "syntheticBlockEndMarker", null);
        setField(term273147, term273147.getClass(), "locale", null);
        setBooleanField(term273147, term273147.getClass(), "markAsCompiled", false);
        setBooleanField(term273147, term273147.getClass(), "removeTryCatchFinally", false);
        setBooleanField(term273147, term273147.getClass(), "closurePass", false);
        setBooleanField(term273147, term273147.getClass(), "rewriteNewDateGoogNow", false);
        setBooleanField(term273147, term273147.getClass(), "removeAbstractMethods", false);
        setBooleanField(term273147, term273147.getClass(), "gatherCssNames", false);
        setField(term273147, term273147.getClass(), "stripTypes", null);
        setField(term273147, term273147.getClass(), "stripNameSuffixes", null);
        setField(term273147, term273147.getClass(), "stripNamePrefixes", null);
        setField(term273147, term273147.getClass(), "stripTypePrefixes", null);
        setField(term273147, term273147.getClass(), "customPasses", null);
        setBooleanField(term273147, term273147.getClass(), "markNoSideEffectCalls", false);
        setField(term273147, term273147.getClass(), "defineReplacements", term273148);
        setBooleanField(term273147, term273147.getClass(), "moveFunctionDeclarations", false);
        setField(term273147, term273147.getClass(), "instrumentationTemplate", null);
        setField(term273147, term273147.getClass(), "appNameStr", null);
        setBooleanField(term273147, term273147.getClass(), "recordFunctionInformation", false);
        setBooleanField(term273147, term273147.getClass(), "generateExports", false);
        setField(term273147, term273147.getClass(), "cssRenamingMap", null);
        setBooleanField(term273147, term273147.getClass(), "processObjectPropertyString", false);
        setField(term273147, term273147.getClass(), "idGenerators", null);
        setField(term273147, term273147.getClass(), "replaceStringsFunctionDescriptions", null);
        setField(term273147, term273147.getClass(), "replaceStringsPlaceholderToken", null);
        setBooleanField(term273147, term273147.getClass(), "prettyPrint", false);
        setBooleanField(term273147, term273147.getClass(), "lineBreak", false);
        setBooleanField(term273147, term273147.getClass(), "printInputDelimiter", false);
        setField(term273147, term273147.getClass(), "inputDelimiter", null);
        setField(term273147, term273147.getClass(), "reportPath", null);
        setField(term273147, term273147.getClass(), "tracer", null);
        setBooleanField(term273147, term273147.getClass(), "colorizeErrorOutput", false);
        setField(term273147, term273147.getClass(), "errorFormat", null);
        setField(term273147, term273147.getClass(), "jsOutputFile", null);
        setField(term273147, term273147.getClass(), "warningsGuard", null);
        setIntField(term273147, term273147.getClass(), "summaryDetailLevel", 0);
        setBooleanField(term273147, term273147.getClass(), "externExports", false);
        setField(term273147, term273147.getClass(), "externExportsPath", null);
        setField(term273147, term273147.getClass(), "nameReferenceReportPath", null);
        setField(term273147, term273147.getClass(), "nameReferenceGraphPath", null);
        setField(term273147, term273147.getClass(), "sourceMapOutputPath", null);
        setField(term273147, term273147.getClass(), "sourceMapDetailLevel", null);
        setField(term273147, term273147.getClass(), "outputCharset", null);
        setBooleanField(term273147, term273147.getClass(), "looseTypes", false);
        term273051 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefineReplacements", argTypes, term272333, args);
        assertTrue(recursiveEquals(term272333, term273147));
        assertTrue(recursiveEquals(retValue, term273051));
    }

};


