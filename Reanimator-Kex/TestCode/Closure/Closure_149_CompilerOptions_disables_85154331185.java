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

public class CompilerOptions_disables_85154331185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274906;
     Object term275261;

    public CompilerOptions_disables_85154331185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274906 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term274906, term274906.getClass(), "warningsGuard", null);
        term275261 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setBooleanField(term275261, term275261.getClass(), "ideMode", false);
        setBooleanField(term275261, term275261.getClass(), "skipAllPasses", false);
        setBooleanField(term275261, term275261.getClass(), "nameAnonymousFunctionsOnly", false);
        setField(term275261, term275261.getClass(), "devMode", null);
        setBooleanField(term275261, term275261.getClass(), "manageClosureDependencies", false);
        setField(term275261, term275261.getClass(), "messageBundle", null);
        setBooleanField(term275261, term275261.getClass(), "checkSymbols", false);
        setField(term275261, term275261.getClass(), "checkShadowVars", null);
        setField(term275261, term275261.getClass(), "aggressiveVarCheck", null);
        setField(term275261, term275261.getClass(), "checkFunctions", null);
        setField(term275261, term275261.getClass(), "checkMethods", null);
        setBooleanField(term275261, term275261.getClass(), "checkDuplicateMessages", false);
        setBooleanField(term275261, term275261.getClass(), "allowLegacyJsMessages", false);
        setBooleanField(term275261, term275261.getClass(), "strictMessageReplacement", false);
        setBooleanField(term275261, term275261.getClass(), "checkSuspiciousCode", false);
        setBooleanField(term275261, term275261.getClass(), "checkControlStructures", false);
        setField(term275261, term275261.getClass(), "checkUndefinedProperties", null);
        setBooleanField(term275261, term275261.getClass(), "checkUnusedPropertiesEarly", false);
        setBooleanField(term275261, term275261.getClass(), "checkTypes", false);
        setBooleanField(term275261, term275261.getClass(), "tightenTypes", false);
        setBooleanField(term275261, term275261.getClass(), "inferTypesInGlobalScope", false);
        setBooleanField(term275261, term275261.getClass(), "checkTypedPropertyCalls", false);
        setField(term275261, term275261.getClass(), "reportMissingOverride", null);
        setField(term275261, term275261.getClass(), "reportUnknownTypes", null);
        setField(term275261, term275261.getClass(), "checkRequires", null);
        setField(term275261, term275261.getClass(), "checkProvides", null);
        setField(term275261, term275261.getClass(), "checkGlobalNamesLevel", null);
        setField(term275261, term275261.getClass(), "brokenClosureRequiresLevel", null);
        setField(term275261, term275261.getClass(), "checkGlobalThisLevel", null);
        setField(term275261, term275261.getClass(), "checkMissingGetCssNameLevel", null);
        setField(term275261, term275261.getClass(), "checkMissingGetCssNameBlacklist", null);
        setBooleanField(term275261, term275261.getClass(), "checkEs5Strict", false);
        setBooleanField(term275261, term275261.getClass(), "checkCaja", false);
        setBooleanField(term275261, term275261.getClass(), "foldConstants", false);
        setBooleanField(term275261, term275261.getClass(), "removeConstantExpressions", false);
        setBooleanField(term275261, term275261.getClass(), "deadAssignmentElimination", false);
        setBooleanField(term275261, term275261.getClass(), "inlineConstantVars", false);
        setBooleanField(term275261, term275261.getClass(), "inlineFunctions", false);
        setBooleanField(term275261, term275261.getClass(), "decomposeExpressions", false);
        setBooleanField(term275261, term275261.getClass(), "inlineAnonymousFunctionExpressions", false);
        setBooleanField(term275261, term275261.getClass(), "inlineLocalFunctions", false);
        setBooleanField(term275261, term275261.getClass(), "crossModuleCodeMotion", false);
        setBooleanField(term275261, term275261.getClass(), "coalesceVariableNames", false);
        setBooleanField(term275261, term275261.getClass(), "crossModuleMethodMotion", false);
        setBooleanField(term275261, term275261.getClass(), "inlineGetters", false);
        setBooleanField(term275261, term275261.getClass(), "inlineVariables", false);
        setBooleanField(term275261, term275261.getClass(), "inlineLocalVariables", false);
        setBooleanField(term275261, term275261.getClass(), "flowSensitiveInlineVariables", false);
        setBooleanField(term275261, term275261.getClass(), "smartNameRemoval", false);
        setBooleanField(term275261, term275261.getClass(), "removeDeadCode", false);
        setField(term275261, term275261.getClass(), "checkUnreachableCode", null);
        setField(term275261, term275261.getClass(), "checkMissingReturn", null);
        setBooleanField(term275261, term275261.getClass(), "extractPrototypeMemberDeclarations", false);
        setBooleanField(term275261, term275261.getClass(), "removeEmptyFunctions", false);
        setBooleanField(term275261, term275261.getClass(), "removeUnusedPrototypeProperties", false);
        setBooleanField(term275261, term275261.getClass(), "removeUnusedPrototypePropertiesInExterns", false);
        setBooleanField(term275261, term275261.getClass(), "removeUnusedVars", false);
        setBooleanField(term275261, term275261.getClass(), "removeUnusedVarsInGlobalScope", false);
        setBooleanField(term275261, term275261.getClass(), "aliasExternals", false);
        setField(term275261, term275261.getClass(), "aliasableGlobals", null);
        setField(term275261, term275261.getClass(), "unaliasableGlobals", null);
        setBooleanField(term275261, term275261.getClass(), "collapseVariableDeclarations", false);
        setBooleanField(term275261, term275261.getClass(), "groupVariableDeclarations", false);
        setBooleanField(term275261, term275261.getClass(), "collapseAnonymousFunctions", false);
        setField(term275261, term275261.getClass(), "aliasableStrings", null);
        setField(term275261, term275261.getClass(), "aliasStringsBlacklist", null);
        setBooleanField(term275261, term275261.getClass(), "aliasAllStrings", false);
        setBooleanField(term275261, term275261.getClass(), "outputJsStringUsage", false);
        setBooleanField(term275261, term275261.getClass(), "convertToDottedProperties", false);
        setBooleanField(term275261, term275261.getClass(), "rewriteFunctionExpressions", false);
        setBooleanField(term275261, term275261.getClass(), "optimizeParameters", false);
        setBooleanField(term275261, term275261.getClass(), "optimizeArgumentsArray", false);
        setBooleanField(term275261, term275261.getClass(), "chainCalls", false);
        setField(term275261, term275261.getClass(), "variableRenaming", null);
        setField(term275261, term275261.getClass(), "propertyRenaming", null);
        setBooleanField(term275261, term275261.getClass(), "labelRenaming", false);
        setBooleanField(term275261, term275261.getClass(), "reserveRawExports", false);
        setBooleanField(term275261, term275261.getClass(), "generatePseudoNames", false);
        setField(term275261, term275261.getClass(), "renamePrefix", null);
        setBooleanField(term275261, term275261.getClass(), "aliasKeywords", false);
        setBooleanField(term275261, term275261.getClass(), "collapseProperties", false);
        setBooleanField(term275261, term275261.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term275261, term275261.getClass(), "devirtualizePrototypeMethods", false);
        setBooleanField(term275261, term275261.getClass(), "computeFunctionSideEffects", false);
        setField(term275261, term275261.getClass(), "debugFunctionSideEffectsPath", null);
        setBooleanField(term275261, term275261.getClass(), "disambiguateProperties", false);
        setBooleanField(term275261, term275261.getClass(), "ambiguateProperties", false);
        setField(term275261, term275261.getClass(), "anonymousFunctionNaming", null);
        setField(term275261, term275261.getClass(), "inputVariableMapSerialized", null);
        setField(term275261, term275261.getClass(), "inputPropertyMapSerialized", null);
        setBooleanField(term275261, term275261.getClass(), "exportTestFunctions", false);
        setBooleanField(term275261, term275261.getClass(), "runtimeTypeCheck", false);
        setField(term275261, term275261.getClass(), "runtimeTypeCheckLogFunction", null);
        setField(term275261, term275261.getClass(), "codingConvention", null);
        setBooleanField(term275261, term275261.getClass(), "instrumentForCoverage", false);
        setBooleanField(term275261, term275261.getClass(), "instrumentForCoverageOnly", false);
        setBooleanField(term275261, term275261.getClass(), "ignoreCajaProperties", false);
        setField(term275261, term275261.getClass(), "syntheticBlockStartMarker", null);
        setField(term275261, term275261.getClass(), "syntheticBlockEndMarker", null);
        setField(term275261, term275261.getClass(), "locale", null);
        setBooleanField(term275261, term275261.getClass(), "markAsCompiled", false);
        setBooleanField(term275261, term275261.getClass(), "removeTryCatchFinally", false);
        setBooleanField(term275261, term275261.getClass(), "closurePass", false);
        setBooleanField(term275261, term275261.getClass(), "rewriteNewDateGoogNow", false);
        setBooleanField(term275261, term275261.getClass(), "removeAbstractMethods", false);
        setBooleanField(term275261, term275261.getClass(), "gatherCssNames", false);
        setField(term275261, term275261.getClass(), "stripTypes", null);
        setField(term275261, term275261.getClass(), "stripNameSuffixes", null);
        setField(term275261, term275261.getClass(), "stripNamePrefixes", null);
        setField(term275261, term275261.getClass(), "stripTypePrefixes", null);
        setField(term275261, term275261.getClass(), "customPasses", null);
        setBooleanField(term275261, term275261.getClass(), "markNoSideEffectCalls", false);
        setField(term275261, term275261.getClass(), "defineReplacements", null);
        setBooleanField(term275261, term275261.getClass(), "moveFunctionDeclarations", false);
        setField(term275261, term275261.getClass(), "instrumentationTemplate", null);
        setField(term275261, term275261.getClass(), "appNameStr", null);
        setBooleanField(term275261, term275261.getClass(), "recordFunctionInformation", false);
        setBooleanField(term275261, term275261.getClass(), "generateExports", false);
        setField(term275261, term275261.getClass(), "cssRenamingMap", null);
        setBooleanField(term275261, term275261.getClass(), "processObjectPropertyString", false);
        setField(term275261, term275261.getClass(), "idGenerators", null);
        setField(term275261, term275261.getClass(), "replaceStringsFunctionDescriptions", null);
        setField(term275261, term275261.getClass(), "replaceStringsPlaceholderToken", null);
        setBooleanField(term275261, term275261.getClass(), "prettyPrint", false);
        setBooleanField(term275261, term275261.getClass(), "lineBreak", false);
        setBooleanField(term275261, term275261.getClass(), "printInputDelimiter", false);
        setField(term275261, term275261.getClass(), "inputDelimiter", null);
        setField(term275261, term275261.getClass(), "reportPath", null);
        setField(term275261, term275261.getClass(), "tracer", null);
        setBooleanField(term275261, term275261.getClass(), "colorizeErrorOutput", false);
        setField(term275261, term275261.getClass(), "errorFormat", null);
        setField(term275261, term275261.getClass(), "jsOutputFile", null);
        setField(term275261, term275261.getClass(), "warningsGuard", null);
        setIntField(term275261, term275261.getClass(), "summaryDetailLevel", 0);
        setBooleanField(term275261, term275261.getClass(), "externExports", false);
        setField(term275261, term275261.getClass(), "externExportsPath", null);
        setField(term275261, term275261.getClass(), "nameReferenceReportPath", null);
        setField(term275261, term275261.getClass(), "nameReferenceGraphPath", null);
        setField(term275261, term275261.getClass(), "sourceMapOutputPath", null);
        setField(term275261, term275261.getClass(), "sourceMapDetailLevel", null);
        setField(term275261, term275261.getClass(), "outputCharset", null);
        setBooleanField(term275261, term275261.getClass(), "looseTypes", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticGroup");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "disables", argTypes, term274906, args);
        assertTrue(recursiveEquals(term274906, term275261));
        assertTrue(recursiveEquals(retValue, false));
    }

};


