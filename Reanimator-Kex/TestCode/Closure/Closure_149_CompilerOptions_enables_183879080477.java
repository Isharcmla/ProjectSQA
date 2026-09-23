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

public class CompilerOptions_enables_183879080477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273250;
     Object term273338;

    public CompilerOptions_enables_183879080477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273250 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term273250, term273250.getClass(), "warningsGuard", null);
        term273338 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setBooleanField(term273338, term273338.getClass(), "ideMode", false);
        setBooleanField(term273338, term273338.getClass(), "skipAllPasses", false);
        setBooleanField(term273338, term273338.getClass(), "nameAnonymousFunctionsOnly", false);
        setField(term273338, term273338.getClass(), "devMode", null);
        setBooleanField(term273338, term273338.getClass(), "manageClosureDependencies", false);
        setField(term273338, term273338.getClass(), "messageBundle", null);
        setBooleanField(term273338, term273338.getClass(), "checkSymbols", false);
        setField(term273338, term273338.getClass(), "checkShadowVars", null);
        setField(term273338, term273338.getClass(), "aggressiveVarCheck", null);
        setField(term273338, term273338.getClass(), "checkFunctions", null);
        setField(term273338, term273338.getClass(), "checkMethods", null);
        setBooleanField(term273338, term273338.getClass(), "checkDuplicateMessages", false);
        setBooleanField(term273338, term273338.getClass(), "allowLegacyJsMessages", false);
        setBooleanField(term273338, term273338.getClass(), "strictMessageReplacement", false);
        setBooleanField(term273338, term273338.getClass(), "checkSuspiciousCode", false);
        setBooleanField(term273338, term273338.getClass(), "checkControlStructures", false);
        setField(term273338, term273338.getClass(), "checkUndefinedProperties", null);
        setBooleanField(term273338, term273338.getClass(), "checkUnusedPropertiesEarly", false);
        setBooleanField(term273338, term273338.getClass(), "checkTypes", false);
        setBooleanField(term273338, term273338.getClass(), "tightenTypes", false);
        setBooleanField(term273338, term273338.getClass(), "inferTypesInGlobalScope", false);
        setBooleanField(term273338, term273338.getClass(), "checkTypedPropertyCalls", false);
        setField(term273338, term273338.getClass(), "reportMissingOverride", null);
        setField(term273338, term273338.getClass(), "reportUnknownTypes", null);
        setField(term273338, term273338.getClass(), "checkRequires", null);
        setField(term273338, term273338.getClass(), "checkProvides", null);
        setField(term273338, term273338.getClass(), "checkGlobalNamesLevel", null);
        setField(term273338, term273338.getClass(), "brokenClosureRequiresLevel", null);
        setField(term273338, term273338.getClass(), "checkGlobalThisLevel", null);
        setField(term273338, term273338.getClass(), "checkMissingGetCssNameLevel", null);
        setField(term273338, term273338.getClass(), "checkMissingGetCssNameBlacklist", null);
        setBooleanField(term273338, term273338.getClass(), "checkEs5Strict", false);
        setBooleanField(term273338, term273338.getClass(), "checkCaja", false);
        setBooleanField(term273338, term273338.getClass(), "foldConstants", false);
        setBooleanField(term273338, term273338.getClass(), "removeConstantExpressions", false);
        setBooleanField(term273338, term273338.getClass(), "deadAssignmentElimination", false);
        setBooleanField(term273338, term273338.getClass(), "inlineConstantVars", false);
        setBooleanField(term273338, term273338.getClass(), "inlineFunctions", false);
        setBooleanField(term273338, term273338.getClass(), "decomposeExpressions", false);
        setBooleanField(term273338, term273338.getClass(), "inlineAnonymousFunctionExpressions", false);
        setBooleanField(term273338, term273338.getClass(), "inlineLocalFunctions", false);
        setBooleanField(term273338, term273338.getClass(), "crossModuleCodeMotion", false);
        setBooleanField(term273338, term273338.getClass(), "coalesceVariableNames", false);
        setBooleanField(term273338, term273338.getClass(), "crossModuleMethodMotion", false);
        setBooleanField(term273338, term273338.getClass(), "inlineGetters", false);
        setBooleanField(term273338, term273338.getClass(), "inlineVariables", false);
        setBooleanField(term273338, term273338.getClass(), "inlineLocalVariables", false);
        setBooleanField(term273338, term273338.getClass(), "flowSensitiveInlineVariables", false);
        setBooleanField(term273338, term273338.getClass(), "smartNameRemoval", false);
        setBooleanField(term273338, term273338.getClass(), "removeDeadCode", false);
        setField(term273338, term273338.getClass(), "checkUnreachableCode", null);
        setField(term273338, term273338.getClass(), "checkMissingReturn", null);
        setBooleanField(term273338, term273338.getClass(), "extractPrototypeMemberDeclarations", false);
        setBooleanField(term273338, term273338.getClass(), "removeEmptyFunctions", false);
        setBooleanField(term273338, term273338.getClass(), "removeUnusedPrototypeProperties", false);
        setBooleanField(term273338, term273338.getClass(), "removeUnusedPrototypePropertiesInExterns", false);
        setBooleanField(term273338, term273338.getClass(), "removeUnusedVars", false);
        setBooleanField(term273338, term273338.getClass(), "removeUnusedVarsInGlobalScope", false);
        setBooleanField(term273338, term273338.getClass(), "aliasExternals", false);
        setField(term273338, term273338.getClass(), "aliasableGlobals", null);
        setField(term273338, term273338.getClass(), "unaliasableGlobals", null);
        setBooleanField(term273338, term273338.getClass(), "collapseVariableDeclarations", false);
        setBooleanField(term273338, term273338.getClass(), "groupVariableDeclarations", false);
        setBooleanField(term273338, term273338.getClass(), "collapseAnonymousFunctions", false);
        setField(term273338, term273338.getClass(), "aliasableStrings", null);
        setField(term273338, term273338.getClass(), "aliasStringsBlacklist", null);
        setBooleanField(term273338, term273338.getClass(), "aliasAllStrings", false);
        setBooleanField(term273338, term273338.getClass(), "outputJsStringUsage", false);
        setBooleanField(term273338, term273338.getClass(), "convertToDottedProperties", false);
        setBooleanField(term273338, term273338.getClass(), "rewriteFunctionExpressions", false);
        setBooleanField(term273338, term273338.getClass(), "optimizeParameters", false);
        setBooleanField(term273338, term273338.getClass(), "optimizeArgumentsArray", false);
        setBooleanField(term273338, term273338.getClass(), "chainCalls", false);
        setField(term273338, term273338.getClass(), "variableRenaming", null);
        setField(term273338, term273338.getClass(), "propertyRenaming", null);
        setBooleanField(term273338, term273338.getClass(), "labelRenaming", false);
        setBooleanField(term273338, term273338.getClass(), "reserveRawExports", false);
        setBooleanField(term273338, term273338.getClass(), "generatePseudoNames", false);
        setField(term273338, term273338.getClass(), "renamePrefix", null);
        setBooleanField(term273338, term273338.getClass(), "aliasKeywords", false);
        setBooleanField(term273338, term273338.getClass(), "collapseProperties", false);
        setBooleanField(term273338, term273338.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term273338, term273338.getClass(), "devirtualizePrototypeMethods", false);
        setBooleanField(term273338, term273338.getClass(), "computeFunctionSideEffects", false);
        setField(term273338, term273338.getClass(), "debugFunctionSideEffectsPath", null);
        setBooleanField(term273338, term273338.getClass(), "disambiguateProperties", false);
        setBooleanField(term273338, term273338.getClass(), "ambiguateProperties", false);
        setField(term273338, term273338.getClass(), "anonymousFunctionNaming", null);
        setField(term273338, term273338.getClass(), "inputVariableMapSerialized", null);
        setField(term273338, term273338.getClass(), "inputPropertyMapSerialized", null);
        setBooleanField(term273338, term273338.getClass(), "exportTestFunctions", false);
        setBooleanField(term273338, term273338.getClass(), "runtimeTypeCheck", false);
        setField(term273338, term273338.getClass(), "runtimeTypeCheckLogFunction", null);
        setField(term273338, term273338.getClass(), "codingConvention", null);
        setBooleanField(term273338, term273338.getClass(), "instrumentForCoverage", false);
        setBooleanField(term273338, term273338.getClass(), "instrumentForCoverageOnly", false);
        setBooleanField(term273338, term273338.getClass(), "ignoreCajaProperties", false);
        setField(term273338, term273338.getClass(), "syntheticBlockStartMarker", null);
        setField(term273338, term273338.getClass(), "syntheticBlockEndMarker", null);
        setField(term273338, term273338.getClass(), "locale", null);
        setBooleanField(term273338, term273338.getClass(), "markAsCompiled", false);
        setBooleanField(term273338, term273338.getClass(), "removeTryCatchFinally", false);
        setBooleanField(term273338, term273338.getClass(), "closurePass", false);
        setBooleanField(term273338, term273338.getClass(), "rewriteNewDateGoogNow", false);
        setBooleanField(term273338, term273338.getClass(), "removeAbstractMethods", false);
        setBooleanField(term273338, term273338.getClass(), "gatherCssNames", false);
        setField(term273338, term273338.getClass(), "stripTypes", null);
        setField(term273338, term273338.getClass(), "stripNameSuffixes", null);
        setField(term273338, term273338.getClass(), "stripNamePrefixes", null);
        setField(term273338, term273338.getClass(), "stripTypePrefixes", null);
        setField(term273338, term273338.getClass(), "customPasses", null);
        setBooleanField(term273338, term273338.getClass(), "markNoSideEffectCalls", false);
        setField(term273338, term273338.getClass(), "defineReplacements", null);
        setBooleanField(term273338, term273338.getClass(), "moveFunctionDeclarations", false);
        setField(term273338, term273338.getClass(), "instrumentationTemplate", null);
        setField(term273338, term273338.getClass(), "appNameStr", null);
        setBooleanField(term273338, term273338.getClass(), "recordFunctionInformation", false);
        setBooleanField(term273338, term273338.getClass(), "generateExports", false);
        setField(term273338, term273338.getClass(), "cssRenamingMap", null);
        setBooleanField(term273338, term273338.getClass(), "processObjectPropertyString", false);
        setField(term273338, term273338.getClass(), "idGenerators", null);
        setField(term273338, term273338.getClass(), "replaceStringsFunctionDescriptions", null);
        setField(term273338, term273338.getClass(), "replaceStringsPlaceholderToken", null);
        setBooleanField(term273338, term273338.getClass(), "prettyPrint", false);
        setBooleanField(term273338, term273338.getClass(), "lineBreak", false);
        setBooleanField(term273338, term273338.getClass(), "printInputDelimiter", false);
        setField(term273338, term273338.getClass(), "inputDelimiter", null);
        setField(term273338, term273338.getClass(), "reportPath", null);
        setField(term273338, term273338.getClass(), "tracer", null);
        setBooleanField(term273338, term273338.getClass(), "colorizeErrorOutput", false);
        setField(term273338, term273338.getClass(), "errorFormat", null);
        setField(term273338, term273338.getClass(), "jsOutputFile", null);
        setField(term273338, term273338.getClass(), "warningsGuard", null);
        setIntField(term273338, term273338.getClass(), "summaryDetailLevel", 0);
        setBooleanField(term273338, term273338.getClass(), "externExports", false);
        setField(term273338, term273338.getClass(), "externExportsPath", null);
        setField(term273338, term273338.getClass(), "nameReferenceReportPath", null);
        setField(term273338, term273338.getClass(), "nameReferenceGraphPath", null);
        setField(term273338, term273338.getClass(), "sourceMapOutputPath", null);
        setField(term273338, term273338.getClass(), "sourceMapDetailLevel", null);
        setField(term273338, term273338.getClass(), "outputCharset", null);
        setBooleanField(term273338, term273338.getClass(), "looseTypes", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticGroup");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "enables", argTypes, term273250, args);
        assertTrue(recursiveEquals(term273250, term273338));
        assertTrue(recursiveEquals(retValue, false));
    }

};


