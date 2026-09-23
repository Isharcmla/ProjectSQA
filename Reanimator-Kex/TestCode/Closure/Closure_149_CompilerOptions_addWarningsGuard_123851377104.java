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

public class CompilerOptions_addWarningsGuard_123851377104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280477;
     Object term280978;

    public CompilerOptions_addWarningsGuard_123851377104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280477 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term280477, term280477.getClass(), "warningsGuard", null);
        ArrayList term280980 = new ArrayList();
        ((ArrayList) term280980).add((Object)null);
        term280978 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term280979 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setBooleanField(term280978, term280978.getClass(), "ideMode", false);
        setBooleanField(term280978, term280978.getClass(), "skipAllPasses", false);
        setBooleanField(term280978, term280978.getClass(), "nameAnonymousFunctionsOnly", false);
        setField(term280978, term280978.getClass(), "devMode", null);
        setBooleanField(term280978, term280978.getClass(), "manageClosureDependencies", false);
        setField(term280978, term280978.getClass(), "messageBundle", null);
        setBooleanField(term280978, term280978.getClass(), "checkSymbols", false);
        setField(term280978, term280978.getClass(), "checkShadowVars", null);
        setField(term280978, term280978.getClass(), "aggressiveVarCheck", null);
        setField(term280978, term280978.getClass(), "checkFunctions", null);
        setField(term280978, term280978.getClass(), "checkMethods", null);
        setBooleanField(term280978, term280978.getClass(), "checkDuplicateMessages", false);
        setBooleanField(term280978, term280978.getClass(), "allowLegacyJsMessages", false);
        setBooleanField(term280978, term280978.getClass(), "strictMessageReplacement", false);
        setBooleanField(term280978, term280978.getClass(), "checkSuspiciousCode", false);
        setBooleanField(term280978, term280978.getClass(), "checkControlStructures", false);
        setField(term280978, term280978.getClass(), "checkUndefinedProperties", null);
        setBooleanField(term280978, term280978.getClass(), "checkUnusedPropertiesEarly", false);
        setBooleanField(term280978, term280978.getClass(), "checkTypes", false);
        setBooleanField(term280978, term280978.getClass(), "tightenTypes", false);
        setBooleanField(term280978, term280978.getClass(), "inferTypesInGlobalScope", false);
        setBooleanField(term280978, term280978.getClass(), "checkTypedPropertyCalls", false);
        setField(term280978, term280978.getClass(), "reportMissingOverride", null);
        setField(term280978, term280978.getClass(), "reportUnknownTypes", null);
        setField(term280978, term280978.getClass(), "checkRequires", null);
        setField(term280978, term280978.getClass(), "checkProvides", null);
        setField(term280978, term280978.getClass(), "checkGlobalNamesLevel", null);
        setField(term280978, term280978.getClass(), "brokenClosureRequiresLevel", null);
        setField(term280978, term280978.getClass(), "checkGlobalThisLevel", null);
        setField(term280978, term280978.getClass(), "checkMissingGetCssNameLevel", null);
        setField(term280978, term280978.getClass(), "checkMissingGetCssNameBlacklist", null);
        setBooleanField(term280978, term280978.getClass(), "checkEs5Strict", false);
        setBooleanField(term280978, term280978.getClass(), "checkCaja", false);
        setBooleanField(term280978, term280978.getClass(), "foldConstants", false);
        setBooleanField(term280978, term280978.getClass(), "removeConstantExpressions", false);
        setBooleanField(term280978, term280978.getClass(), "deadAssignmentElimination", false);
        setBooleanField(term280978, term280978.getClass(), "inlineConstantVars", false);
        setBooleanField(term280978, term280978.getClass(), "inlineFunctions", false);
        setBooleanField(term280978, term280978.getClass(), "decomposeExpressions", false);
        setBooleanField(term280978, term280978.getClass(), "inlineAnonymousFunctionExpressions", false);
        setBooleanField(term280978, term280978.getClass(), "inlineLocalFunctions", false);
        setBooleanField(term280978, term280978.getClass(), "crossModuleCodeMotion", false);
        setBooleanField(term280978, term280978.getClass(), "coalesceVariableNames", false);
        setBooleanField(term280978, term280978.getClass(), "crossModuleMethodMotion", false);
        setBooleanField(term280978, term280978.getClass(), "inlineGetters", false);
        setBooleanField(term280978, term280978.getClass(), "inlineVariables", false);
        setBooleanField(term280978, term280978.getClass(), "inlineLocalVariables", false);
        setBooleanField(term280978, term280978.getClass(), "flowSensitiveInlineVariables", false);
        setBooleanField(term280978, term280978.getClass(), "smartNameRemoval", false);
        setBooleanField(term280978, term280978.getClass(), "removeDeadCode", false);
        setField(term280978, term280978.getClass(), "checkUnreachableCode", null);
        setField(term280978, term280978.getClass(), "checkMissingReturn", null);
        setBooleanField(term280978, term280978.getClass(), "extractPrototypeMemberDeclarations", false);
        setBooleanField(term280978, term280978.getClass(), "removeEmptyFunctions", false);
        setBooleanField(term280978, term280978.getClass(), "removeUnusedPrototypeProperties", false);
        setBooleanField(term280978, term280978.getClass(), "removeUnusedPrototypePropertiesInExterns", false);
        setBooleanField(term280978, term280978.getClass(), "removeUnusedVars", false);
        setBooleanField(term280978, term280978.getClass(), "removeUnusedVarsInGlobalScope", false);
        setBooleanField(term280978, term280978.getClass(), "aliasExternals", false);
        setField(term280978, term280978.getClass(), "aliasableGlobals", null);
        setField(term280978, term280978.getClass(), "unaliasableGlobals", null);
        setBooleanField(term280978, term280978.getClass(), "collapseVariableDeclarations", false);
        setBooleanField(term280978, term280978.getClass(), "groupVariableDeclarations", false);
        setBooleanField(term280978, term280978.getClass(), "collapseAnonymousFunctions", false);
        setField(term280978, term280978.getClass(), "aliasableStrings", null);
        setField(term280978, term280978.getClass(), "aliasStringsBlacklist", null);
        setBooleanField(term280978, term280978.getClass(), "aliasAllStrings", false);
        setBooleanField(term280978, term280978.getClass(), "outputJsStringUsage", false);
        setBooleanField(term280978, term280978.getClass(), "convertToDottedProperties", false);
        setBooleanField(term280978, term280978.getClass(), "rewriteFunctionExpressions", false);
        setBooleanField(term280978, term280978.getClass(), "optimizeParameters", false);
        setBooleanField(term280978, term280978.getClass(), "optimizeArgumentsArray", false);
        setBooleanField(term280978, term280978.getClass(), "chainCalls", false);
        setField(term280978, term280978.getClass(), "variableRenaming", null);
        setField(term280978, term280978.getClass(), "propertyRenaming", null);
        setBooleanField(term280978, term280978.getClass(), "labelRenaming", false);
        setBooleanField(term280978, term280978.getClass(), "reserveRawExports", false);
        setBooleanField(term280978, term280978.getClass(), "generatePseudoNames", false);
        setField(term280978, term280978.getClass(), "renamePrefix", null);
        setBooleanField(term280978, term280978.getClass(), "aliasKeywords", false);
        setBooleanField(term280978, term280978.getClass(), "collapseProperties", false);
        setBooleanField(term280978, term280978.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term280978, term280978.getClass(), "devirtualizePrototypeMethods", false);
        setBooleanField(term280978, term280978.getClass(), "computeFunctionSideEffects", false);
        setField(term280978, term280978.getClass(), "debugFunctionSideEffectsPath", null);
        setBooleanField(term280978, term280978.getClass(), "disambiguateProperties", false);
        setBooleanField(term280978, term280978.getClass(), "ambiguateProperties", false);
        setField(term280978, term280978.getClass(), "anonymousFunctionNaming", null);
        setField(term280978, term280978.getClass(), "inputVariableMapSerialized", null);
        setField(term280978, term280978.getClass(), "inputPropertyMapSerialized", null);
        setBooleanField(term280978, term280978.getClass(), "exportTestFunctions", false);
        setBooleanField(term280978, term280978.getClass(), "runtimeTypeCheck", false);
        setField(term280978, term280978.getClass(), "runtimeTypeCheckLogFunction", null);
        setField(term280978, term280978.getClass(), "codingConvention", null);
        setBooleanField(term280978, term280978.getClass(), "instrumentForCoverage", false);
        setBooleanField(term280978, term280978.getClass(), "instrumentForCoverageOnly", false);
        setBooleanField(term280978, term280978.getClass(), "ignoreCajaProperties", false);
        setField(term280978, term280978.getClass(), "syntheticBlockStartMarker", null);
        setField(term280978, term280978.getClass(), "syntheticBlockEndMarker", null);
        setField(term280978, term280978.getClass(), "locale", null);
        setBooleanField(term280978, term280978.getClass(), "markAsCompiled", false);
        setBooleanField(term280978, term280978.getClass(), "removeTryCatchFinally", false);
        setBooleanField(term280978, term280978.getClass(), "closurePass", false);
        setBooleanField(term280978, term280978.getClass(), "rewriteNewDateGoogNow", false);
        setBooleanField(term280978, term280978.getClass(), "removeAbstractMethods", false);
        setBooleanField(term280978, term280978.getClass(), "gatherCssNames", false);
        setField(term280978, term280978.getClass(), "stripTypes", null);
        setField(term280978, term280978.getClass(), "stripNameSuffixes", null);
        setField(term280978, term280978.getClass(), "stripNamePrefixes", null);
        setField(term280978, term280978.getClass(), "stripTypePrefixes", null);
        setField(term280978, term280978.getClass(), "customPasses", null);
        setBooleanField(term280978, term280978.getClass(), "markNoSideEffectCalls", false);
        setField(term280978, term280978.getClass(), "defineReplacements", null);
        setBooleanField(term280978, term280978.getClass(), "moveFunctionDeclarations", false);
        setField(term280978, term280978.getClass(), "instrumentationTemplate", null);
        setField(term280978, term280978.getClass(), "appNameStr", null);
        setBooleanField(term280978, term280978.getClass(), "recordFunctionInformation", false);
        setBooleanField(term280978, term280978.getClass(), "generateExports", false);
        setField(term280978, term280978.getClass(), "cssRenamingMap", null);
        setBooleanField(term280978, term280978.getClass(), "processObjectPropertyString", false);
        setField(term280978, term280978.getClass(), "idGenerators", null);
        setField(term280978, term280978.getClass(), "replaceStringsFunctionDescriptions", null);
        setField(term280978, term280978.getClass(), "replaceStringsPlaceholderToken", null);
        setBooleanField(term280978, term280978.getClass(), "prettyPrint", false);
        setBooleanField(term280978, term280978.getClass(), "lineBreak", false);
        setBooleanField(term280978, term280978.getClass(), "printInputDelimiter", false);
        setField(term280978, term280978.getClass(), "inputDelimiter", null);
        setField(term280978, term280978.getClass(), "reportPath", null);
        setField(term280978, term280978.getClass(), "tracer", null);
        setBooleanField(term280978, term280978.getClass(), "colorizeErrorOutput", false);
        setField(term280978, term280978.getClass(), "errorFormat", null);
        setField(term280978, term280978.getClass(), "jsOutputFile", null);
        setField(term280979, term280979.getClass(), "guards", term280980);
        setField(term280978, term280978.getClass(), "warningsGuard", term280979);
        setIntField(term280978, term280978.getClass(), "summaryDetailLevel", 0);
        setBooleanField(term280978, term280978.getClass(), "externExports", false);
        setField(term280978, term280978.getClass(), "externExportsPath", null);
        setField(term280978, term280978.getClass(), "nameReferenceReportPath", null);
        setField(term280978, term280978.getClass(), "nameReferenceGraphPath", null);
        setField(term280978, term280978.getClass(), "sourceMapOutputPath", null);
        setField(term280978, term280978.getClass(), "sourceMapDetailLevel", null);
        setField(term280978, term280978.getClass(), "outputCharset", null);
        setBooleanField(term280978, term280978.getClass(), "looseTypes", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.WarningsGuard");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addWarningsGuard", argTypes, term280477, args);
        assertTrue(recursiveEquals(term280477, term280978));
    }

};


