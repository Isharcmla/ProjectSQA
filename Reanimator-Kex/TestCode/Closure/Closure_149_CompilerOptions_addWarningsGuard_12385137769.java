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

public class CompilerOptions_addWarningsGuard_12385137769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242438;
     Object term271220;

    public CompilerOptions_addWarningsGuard_12385137769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242438 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term242438, term242438.getClass(), "warningsGuard", null);
        ArrayList term271222 = new ArrayList();
        ((ArrayList) term271222).add((Object)null);
        term271220 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term271221 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setBooleanField(term271220, term271220.getClass(), "ideMode", false);
        setBooleanField(term271220, term271220.getClass(), "skipAllPasses", false);
        setBooleanField(term271220, term271220.getClass(), "nameAnonymousFunctionsOnly", false);
        setField(term271220, term271220.getClass(), "devMode", null);
        setBooleanField(term271220, term271220.getClass(), "manageClosureDependencies", false);
        setField(term271220, term271220.getClass(), "messageBundle", null);
        setBooleanField(term271220, term271220.getClass(), "checkSymbols", false);
        setField(term271220, term271220.getClass(), "checkShadowVars", null);
        setField(term271220, term271220.getClass(), "aggressiveVarCheck", null);
        setField(term271220, term271220.getClass(), "checkFunctions", null);
        setField(term271220, term271220.getClass(), "checkMethods", null);
        setBooleanField(term271220, term271220.getClass(), "checkDuplicateMessages", false);
        setBooleanField(term271220, term271220.getClass(), "allowLegacyJsMessages", false);
        setBooleanField(term271220, term271220.getClass(), "strictMessageReplacement", false);
        setBooleanField(term271220, term271220.getClass(), "checkSuspiciousCode", false);
        setBooleanField(term271220, term271220.getClass(), "checkControlStructures", false);
        setField(term271220, term271220.getClass(), "checkUndefinedProperties", null);
        setBooleanField(term271220, term271220.getClass(), "checkUnusedPropertiesEarly", false);
        setBooleanField(term271220, term271220.getClass(), "checkTypes", false);
        setBooleanField(term271220, term271220.getClass(), "tightenTypes", false);
        setBooleanField(term271220, term271220.getClass(), "inferTypesInGlobalScope", false);
        setBooleanField(term271220, term271220.getClass(), "checkTypedPropertyCalls", false);
        setField(term271220, term271220.getClass(), "reportMissingOverride", null);
        setField(term271220, term271220.getClass(), "reportUnknownTypes", null);
        setField(term271220, term271220.getClass(), "checkRequires", null);
        setField(term271220, term271220.getClass(), "checkProvides", null);
        setField(term271220, term271220.getClass(), "checkGlobalNamesLevel", null);
        setField(term271220, term271220.getClass(), "brokenClosureRequiresLevel", null);
        setField(term271220, term271220.getClass(), "checkGlobalThisLevel", null);
        setField(term271220, term271220.getClass(), "checkMissingGetCssNameLevel", null);
        setField(term271220, term271220.getClass(), "checkMissingGetCssNameBlacklist", null);
        setBooleanField(term271220, term271220.getClass(), "checkEs5Strict", false);
        setBooleanField(term271220, term271220.getClass(), "checkCaja", false);
        setBooleanField(term271220, term271220.getClass(), "foldConstants", false);
        setBooleanField(term271220, term271220.getClass(), "removeConstantExpressions", false);
        setBooleanField(term271220, term271220.getClass(), "deadAssignmentElimination", false);
        setBooleanField(term271220, term271220.getClass(), "inlineConstantVars", false);
        setBooleanField(term271220, term271220.getClass(), "inlineFunctions", false);
        setBooleanField(term271220, term271220.getClass(), "decomposeExpressions", false);
        setBooleanField(term271220, term271220.getClass(), "inlineAnonymousFunctionExpressions", false);
        setBooleanField(term271220, term271220.getClass(), "inlineLocalFunctions", false);
        setBooleanField(term271220, term271220.getClass(), "crossModuleCodeMotion", false);
        setBooleanField(term271220, term271220.getClass(), "coalesceVariableNames", false);
        setBooleanField(term271220, term271220.getClass(), "crossModuleMethodMotion", false);
        setBooleanField(term271220, term271220.getClass(), "inlineGetters", false);
        setBooleanField(term271220, term271220.getClass(), "inlineVariables", false);
        setBooleanField(term271220, term271220.getClass(), "inlineLocalVariables", false);
        setBooleanField(term271220, term271220.getClass(), "flowSensitiveInlineVariables", false);
        setBooleanField(term271220, term271220.getClass(), "smartNameRemoval", false);
        setBooleanField(term271220, term271220.getClass(), "removeDeadCode", false);
        setField(term271220, term271220.getClass(), "checkUnreachableCode", null);
        setField(term271220, term271220.getClass(), "checkMissingReturn", null);
        setBooleanField(term271220, term271220.getClass(), "extractPrototypeMemberDeclarations", false);
        setBooleanField(term271220, term271220.getClass(), "removeEmptyFunctions", false);
        setBooleanField(term271220, term271220.getClass(), "removeUnusedPrototypeProperties", false);
        setBooleanField(term271220, term271220.getClass(), "removeUnusedPrototypePropertiesInExterns", false);
        setBooleanField(term271220, term271220.getClass(), "removeUnusedVars", false);
        setBooleanField(term271220, term271220.getClass(), "removeUnusedVarsInGlobalScope", false);
        setBooleanField(term271220, term271220.getClass(), "aliasExternals", false);
        setField(term271220, term271220.getClass(), "aliasableGlobals", null);
        setField(term271220, term271220.getClass(), "unaliasableGlobals", null);
        setBooleanField(term271220, term271220.getClass(), "collapseVariableDeclarations", false);
        setBooleanField(term271220, term271220.getClass(), "groupVariableDeclarations", false);
        setBooleanField(term271220, term271220.getClass(), "collapseAnonymousFunctions", false);
        setField(term271220, term271220.getClass(), "aliasableStrings", null);
        setField(term271220, term271220.getClass(), "aliasStringsBlacklist", null);
        setBooleanField(term271220, term271220.getClass(), "aliasAllStrings", false);
        setBooleanField(term271220, term271220.getClass(), "outputJsStringUsage", false);
        setBooleanField(term271220, term271220.getClass(), "convertToDottedProperties", false);
        setBooleanField(term271220, term271220.getClass(), "rewriteFunctionExpressions", false);
        setBooleanField(term271220, term271220.getClass(), "optimizeParameters", false);
        setBooleanField(term271220, term271220.getClass(), "optimizeArgumentsArray", false);
        setBooleanField(term271220, term271220.getClass(), "chainCalls", false);
        setField(term271220, term271220.getClass(), "variableRenaming", null);
        setField(term271220, term271220.getClass(), "propertyRenaming", null);
        setBooleanField(term271220, term271220.getClass(), "labelRenaming", false);
        setBooleanField(term271220, term271220.getClass(), "reserveRawExports", false);
        setBooleanField(term271220, term271220.getClass(), "generatePseudoNames", false);
        setField(term271220, term271220.getClass(), "renamePrefix", null);
        setBooleanField(term271220, term271220.getClass(), "aliasKeywords", false);
        setBooleanField(term271220, term271220.getClass(), "collapseProperties", false);
        setBooleanField(term271220, term271220.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term271220, term271220.getClass(), "devirtualizePrototypeMethods", false);
        setBooleanField(term271220, term271220.getClass(), "computeFunctionSideEffects", false);
        setField(term271220, term271220.getClass(), "debugFunctionSideEffectsPath", null);
        setBooleanField(term271220, term271220.getClass(), "disambiguateProperties", false);
        setBooleanField(term271220, term271220.getClass(), "ambiguateProperties", false);
        setField(term271220, term271220.getClass(), "anonymousFunctionNaming", null);
        setField(term271220, term271220.getClass(), "inputVariableMapSerialized", null);
        setField(term271220, term271220.getClass(), "inputPropertyMapSerialized", null);
        setBooleanField(term271220, term271220.getClass(), "exportTestFunctions", false);
        setBooleanField(term271220, term271220.getClass(), "runtimeTypeCheck", false);
        setField(term271220, term271220.getClass(), "runtimeTypeCheckLogFunction", null);
        setField(term271220, term271220.getClass(), "codingConvention", null);
        setBooleanField(term271220, term271220.getClass(), "instrumentForCoverage", false);
        setBooleanField(term271220, term271220.getClass(), "instrumentForCoverageOnly", false);
        setBooleanField(term271220, term271220.getClass(), "ignoreCajaProperties", false);
        setField(term271220, term271220.getClass(), "syntheticBlockStartMarker", null);
        setField(term271220, term271220.getClass(), "syntheticBlockEndMarker", null);
        setField(term271220, term271220.getClass(), "locale", null);
        setBooleanField(term271220, term271220.getClass(), "markAsCompiled", false);
        setBooleanField(term271220, term271220.getClass(), "removeTryCatchFinally", false);
        setBooleanField(term271220, term271220.getClass(), "closurePass", false);
        setBooleanField(term271220, term271220.getClass(), "rewriteNewDateGoogNow", false);
        setBooleanField(term271220, term271220.getClass(), "removeAbstractMethods", false);
        setBooleanField(term271220, term271220.getClass(), "gatherCssNames", false);
        setField(term271220, term271220.getClass(), "stripTypes", null);
        setField(term271220, term271220.getClass(), "stripNameSuffixes", null);
        setField(term271220, term271220.getClass(), "stripNamePrefixes", null);
        setField(term271220, term271220.getClass(), "stripTypePrefixes", null);
        setField(term271220, term271220.getClass(), "customPasses", null);
        setBooleanField(term271220, term271220.getClass(), "markNoSideEffectCalls", false);
        setField(term271220, term271220.getClass(), "defineReplacements", null);
        setBooleanField(term271220, term271220.getClass(), "moveFunctionDeclarations", false);
        setField(term271220, term271220.getClass(), "instrumentationTemplate", null);
        setField(term271220, term271220.getClass(), "appNameStr", null);
        setBooleanField(term271220, term271220.getClass(), "recordFunctionInformation", false);
        setBooleanField(term271220, term271220.getClass(), "generateExports", false);
        setField(term271220, term271220.getClass(), "cssRenamingMap", null);
        setBooleanField(term271220, term271220.getClass(), "processObjectPropertyString", false);
        setField(term271220, term271220.getClass(), "idGenerators", null);
        setField(term271220, term271220.getClass(), "replaceStringsFunctionDescriptions", null);
        setField(term271220, term271220.getClass(), "replaceStringsPlaceholderToken", null);
        setBooleanField(term271220, term271220.getClass(), "prettyPrint", false);
        setBooleanField(term271220, term271220.getClass(), "lineBreak", false);
        setBooleanField(term271220, term271220.getClass(), "printInputDelimiter", false);
        setField(term271220, term271220.getClass(), "inputDelimiter", null);
        setField(term271220, term271220.getClass(), "reportPath", null);
        setField(term271220, term271220.getClass(), "tracer", null);
        setBooleanField(term271220, term271220.getClass(), "colorizeErrorOutput", false);
        setField(term271220, term271220.getClass(), "errorFormat", null);
        setField(term271220, term271220.getClass(), "jsOutputFile", null);
        setField(term271221, term271221.getClass(), "guards", term271222);
        setField(term271220, term271220.getClass(), "warningsGuard", term271221);
        setIntField(term271220, term271220.getClass(), "summaryDetailLevel", 0);
        setBooleanField(term271220, term271220.getClass(), "externExports", false);
        setField(term271220, term271220.getClass(), "externExportsPath", null);
        setField(term271220, term271220.getClass(), "nameReferenceReportPath", null);
        setField(term271220, term271220.getClass(), "nameReferenceGraphPath", null);
        setField(term271220, term271220.getClass(), "sourceMapOutputPath", null);
        setField(term271220, term271220.getClass(), "sourceMapDetailLevel", null);
        setField(term271220, term271220.getClass(), "outputCharset", null);
        setBooleanField(term271220, term271220.getClass(), "looseTypes", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.WarningsGuard");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addWarningsGuard", argTypes, term242438, args);
        assertTrue(recursiveEquals(term242438, term271220));
    }

};


