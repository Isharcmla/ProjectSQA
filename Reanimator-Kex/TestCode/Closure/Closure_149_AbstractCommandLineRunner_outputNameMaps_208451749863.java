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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class AbstractCommandLineRunner_outputNameMaps_208451749863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28424;

    public AbstractCommandLineRunner_outputNameMaps_208451749863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63863 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term63862 = ((Class) term63863).getDeclaredField((String) "OFF");
        ((Field) term63862).setAccessible(true);
        Object enum154 = ((Field) term63862).get((Object) null);
        Class<? extends Object> term64139 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term64138 = ((Class) term64139).getDeclaredField((String) "OFF");
        ((Field) term64138).setAccessible(true);
        Object enum155 = ((Field) term64138).get((Object) null);
        Class<? extends Object> term64350 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term64349 = ((Class) term64350).getDeclaredField((String) "ERROR");
        ((Field) term64349).setAccessible(true);
        Object enum156 = ((Field) term64349).get((Object) null);
        Class<? extends Object> term64597 = Class.forName((String) "com.google.javascript.jscomp.VariableRenamingPolicy");
        Field term64596 = ((Class) term64597).getDeclaredField((String) "OFF");
        ((Field) term64596).setAccessible(true);
        Object enum157 = ((Field) term64596).get((Object) null);
        Class<? extends Object> term64868 = Class.forName((String) "com.google.javascript.jscomp.PropertyRenamingPolicy");
        Field term64867 = ((Class) term64868).getDeclaredField((String) "OFF");
        ((Field) term64867).setAccessible(true);
        Object enum158 = ((Field) term64867).get((Object) null);
        Class<? extends Object> term65159 = Class.forName((String) "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy");
        Field term65158 = ((Class) term65159).getDeclaredField((String) "OFF");
        ((Field) term65158).setAccessible(true);
        Object enum159 = ((Field) term65158).get((Object) null);
        HashMap term28665 = new HashMap();
        Class<? extends Object> term65549 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term65548 = ((Class) term65549).getDeclaredField((String) "OFF");
        ((Field) term65548).setAccessible(true);
        Object enum160 = ((Field) term65548).get((Object) null);
        Class<? extends Object> term65840 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term65839 = ((Class) term65840).getDeclaredField((String) "SINGLELINE");
        ((Field) term65839).setAccessible(true);
        Object enum161 = ((Field) term65839).get((Object) null);
        ArrayList term28748 = new ArrayList();
        Class<? extends Object> term66117 = Class.forName((String) "com.google.javascript.jscomp.SourceMap$DetailLevel");
        Field term66116 = ((Class) term66117).getDeclaredField((String) "SYMBOLS");
        ((Field) term66116).setAccessible(true);
        Object enum162 = ((Field) term66116).get((Object) null);
        term28424 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term28528 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        byte[] term28593 = (byte[]) newByteArray(8);
        byte[] term28602 = (byte[]) newByteArray(2);
        Object term28688 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term28747 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setBooleanField(term28424, term28424.getClass(), "ideMode", true);
        setBooleanField(term28424, term28424.getClass(), "skipAllPasses", false);
        setBooleanField(term28424, term28424.getClass(), "nameAnonymousFunctionsOnly", true);
        setField(term28424, term28424.getClass(), "devMode", enum154);
        setBooleanField(term28424, term28424.getClass(), "manageClosureDependencies", true);
        setField(term28424, term28424.getClass(), "messageBundle", null);
        setBooleanField(term28424, term28424.getClass(), "checkSymbols", true);
        setField(term28424, term28424.getClass(), "checkShadowVars", enum155);
        setField(term28424, term28424.getClass(), "aggressiveVarCheck", enum155);
        setField(term28424, term28424.getClass(), "checkFunctions", enum155);
        setField(term28424, term28424.getClass(), "checkMethods", enum155);
        setBooleanField(term28424, term28424.getClass(), "checkDuplicateMessages", false);
        setBooleanField(term28424, term28424.getClass(), "allowLegacyJsMessages", true);
        setBooleanField(term28424, term28424.getClass(), "strictMessageReplacement", false);
        setBooleanField(term28424, term28424.getClass(), "checkSuspiciousCode", true);
        setBooleanField(term28424, term28424.getClass(), "checkControlStructures", false);
        setField(term28424, term28424.getClass(), "checkUndefinedProperties", enum155);
        setBooleanField(term28424, term28424.getClass(), "checkUnusedPropertiesEarly", false);
        setBooleanField(term28424, term28424.getClass(), "checkTypes", true);
        setBooleanField(term28424, term28424.getClass(), "tightenTypes", false);
        setBooleanField(term28424, term28424.getClass(), "inferTypesInGlobalScope", false);
        setBooleanField(term28424, term28424.getClass(), "checkTypedPropertyCalls", true);
        setField(term28424, term28424.getClass(), "reportMissingOverride", enum155);
        setField(term28424, term28424.getClass(), "reportUnknownTypes", enum155);
        setField(term28424, term28424.getClass(), "checkRequires", enum155);
        setField(term28424, term28424.getClass(), "checkProvides", enum155);
        setField(term28424, term28424.getClass(), "checkGlobalNamesLevel", enum155);
        setField(term28424, term28424.getClass(), "brokenClosureRequiresLevel", enum156);
        setField(term28424, term28424.getClass(), "checkGlobalThisLevel", enum155);
        setField(term28424, term28424.getClass(), "checkMissingGetCssNameLevel", enum155);
        setField(term28424, term28424.getClass(), "checkMissingGetCssNameBlacklist", "DSFGlcaXUb");
        setBooleanField(term28424, term28424.getClass(), "checkEs5Strict", false);
        setBooleanField(term28424, term28424.getClass(), "checkCaja", false);
        setBooleanField(term28424, term28424.getClass(), "foldConstants", true);
        setBooleanField(term28424, term28424.getClass(), "removeConstantExpressions", true);
        setBooleanField(term28424, term28424.getClass(), "deadAssignmentElimination", false);
        setBooleanField(term28424, term28424.getClass(), "inlineConstantVars", true);
        setBooleanField(term28424, term28424.getClass(), "inlineFunctions", false);
        setBooleanField(term28424, term28424.getClass(), "decomposeExpressions", false);
        setBooleanField(term28424, term28424.getClass(), "inlineAnonymousFunctionExpressions", true);
        setBooleanField(term28424, term28424.getClass(), "inlineLocalFunctions", false);
        setBooleanField(term28424, term28424.getClass(), "crossModuleCodeMotion", true);
        setBooleanField(term28424, term28424.getClass(), "coalesceVariableNames", true);
        setBooleanField(term28424, term28424.getClass(), "crossModuleMethodMotion", true);
        setBooleanField(term28424, term28424.getClass(), "inlineGetters", false);
        setBooleanField(term28424, term28424.getClass(), "inlineVariables", true);
        setBooleanField(term28424, term28424.getClass(), "inlineLocalVariables", false);
        setBooleanField(term28424, term28424.getClass(), "flowSensitiveInlineVariables", false);
        setBooleanField(term28424, term28424.getClass(), "smartNameRemoval", false);
        setBooleanField(term28424, term28424.getClass(), "removeDeadCode", false);
        setField(term28424, term28424.getClass(), "checkUnreachableCode", enum155);
        setField(term28424, term28424.getClass(), "checkMissingReturn", enum155);
        setBooleanField(term28424, term28424.getClass(), "extractPrototypeMemberDeclarations", false);
        setBooleanField(term28424, term28424.getClass(), "removeEmptyFunctions", true);
        setBooleanField(term28424, term28424.getClass(), "removeUnusedPrototypeProperties", false);
        setBooleanField(term28424, term28424.getClass(), "removeUnusedPrototypePropertiesInExterns", false);
        setBooleanField(term28424, term28424.getClass(), "removeUnusedVars", true);
        setBooleanField(term28424, term28424.getClass(), "removeUnusedVarsInGlobalScope", true);
        setBooleanField(term28424, term28424.getClass(), "aliasExternals", false);
        setField(term28424, term28424.getClass(), "aliasableGlobals", "sHMXNUzNeM");
        setField(term28424, term28424.getClass(), "unaliasableGlobals", "gPzGDOEPPw");
        setBooleanField(term28424, term28424.getClass(), "collapseVariableDeclarations", true);
        setBooleanField(term28424, term28424.getClass(), "groupVariableDeclarations", true);
        setBooleanField(term28424, term28424.getClass(), "collapseAnonymousFunctions", true);
        setField(term28424, term28424.getClass(), "aliasableStrings", term28528);
        setField(term28424, term28424.getClass(), "aliasStringsBlacklist", "");
        setBooleanField(term28424, term28424.getClass(), "aliasAllStrings", true);
        setBooleanField(term28424, term28424.getClass(), "outputJsStringUsage", true);
        setBooleanField(term28424, term28424.getClass(), "convertToDottedProperties", false);
        setBooleanField(term28424, term28424.getClass(), "rewriteFunctionExpressions", true);
        setBooleanField(term28424, term28424.getClass(), "optimizeParameters", false);
        setBooleanField(term28424, term28424.getClass(), "optimizeArgumentsArray", false);
        setBooleanField(term28424, term28424.getClass(), "chainCalls", false);
        setField(term28424, term28424.getClass(), "variableRenaming", enum157);
        setField(term28424, term28424.getClass(), "propertyRenaming", enum158);
        setBooleanField(term28424, term28424.getClass(), "labelRenaming", false);
        setBooleanField(term28424, term28424.getClass(), "reserveRawExports", false);
        setBooleanField(term28424, term28424.getClass(), "generatePseudoNames", true);
        setField(term28424, term28424.getClass(), "renamePrefix", "rwKoAngzCu");
        setBooleanField(term28424, term28424.getClass(), "aliasKeywords", true);
        setBooleanField(term28424, term28424.getClass(), "collapseProperties", true);
        setBooleanField(term28424, term28424.getClass(), "collapsePropertiesOnExternTypes", true);
        setBooleanField(term28424, term28424.getClass(), "devirtualizePrototypeMethods", false);
        setBooleanField(term28424, term28424.getClass(), "computeFunctionSideEffects", false);
        setField(term28424, term28424.getClass(), "debugFunctionSideEffectsPath", "VUkRVwROTl");
        setBooleanField(term28424, term28424.getClass(), "disambiguateProperties", false);
        setBooleanField(term28424, term28424.getClass(), "ambiguateProperties", true);
        setField(term28424, term28424.getClass(), "anonymousFunctionNaming", enum159);
        setByteElement(term28593, 0, (byte) 15);
        setByteElement(term28593, 1, (byte) 45);
        setByteElement(term28593, 2, (byte) -39);
        setByteElement(term28593, 3, (byte) -20);
        setByteElement(term28593, 4, (byte) 10);
        setByteElement(term28593, 5, (byte) 77);
        setByteElement(term28593, 6, (byte) 14);
        setByteElement(term28593, 7, (byte) -101);
        setField(term28424, term28424.getClass(), "inputVariableMapSerialized", term28593);
        setByteElement(term28602, 0, (byte) 35);
        setByteElement(term28602, 1, (byte) 66);
        setField(term28424, term28424.getClass(), "inputPropertyMapSerialized", term28602);
        setBooleanField(term28424, term28424.getClass(), "exportTestFunctions", true);
        setBooleanField(term28424, term28424.getClass(), "runtimeTypeCheck", true);
        setField(term28424, term28424.getClass(), "runtimeTypeCheckLogFunction", "UDlkdccCRn");
        setField(term28424, term28424.getClass(), "codingConvention", null);
        setBooleanField(term28424, term28424.getClass(), "instrumentForCoverage", true);
        setBooleanField(term28424, term28424.getClass(), "instrumentForCoverageOnly", false);
        setBooleanField(term28424, term28424.getClass(), "ignoreCajaProperties", true);
        setField(term28424, term28424.getClass(), "syntheticBlockStartMarker", "McpzErOcYb");
        setField(term28424, term28424.getClass(), "syntheticBlockEndMarker", "jqrVEUvYEz");
        setField(term28424, term28424.getClass(), "locale", "QITgiBrmfj");
        setBooleanField(term28424, term28424.getClass(), "markAsCompiled", false);
        setBooleanField(term28424, term28424.getClass(), "removeTryCatchFinally", true);
        setBooleanField(term28424, term28424.getClass(), "closurePass", false);
        setBooleanField(term28424, term28424.getClass(), "rewriteNewDateGoogNow", true);
        setBooleanField(term28424, term28424.getClass(), "removeAbstractMethods", true);
        setBooleanField(term28424, term28424.getClass(), "gatherCssNames", true);
        setField(term28424, term28424.getClass(), "stripTypes", term28528);
        setField(term28424, term28424.getClass(), "stripNameSuffixes", term28528);
        setField(term28424, term28424.getClass(), "stripNamePrefixes", term28528);
        setField(term28424, term28424.getClass(), "stripTypePrefixes", term28528);
        setField(term28424, term28424.getClass(), "customPasses", null);
        setBooleanField(term28424, term28424.getClass(), "markNoSideEffectCalls", true);
        setField(term28424, term28424.getClass(), "defineReplacements", term28665);
        setBooleanField(term28424, term28424.getClass(), "moveFunctionDeclarations", true);
        setField(term28424, term28424.getClass(), "instrumentationTemplate", "pXxkiXgQnq");
        setField(term28424, term28424.getClass(), "appNameStr", "");
        setBooleanField(term28424, term28424.getClass(), "recordFunctionInformation", false);
        setBooleanField(term28424, term28424.getClass(), "generateExports", true);
        setField(term28424, term28424.getClass(), "cssRenamingMap", null);
        setBooleanField(term28424, term28424.getClass(), "processObjectPropertyString", false);
        setField(term28424, term28424.getClass(), "idGenerators", term28528);
        setIntField(term28688, term28688.getClass(), "modCount", 0);
        setField(term28424, term28424.getClass(), "replaceStringsFunctionDescriptions", term28688);
        setField(term28424, term28424.getClass(), "replaceStringsPlaceholderToken", "");
        setBooleanField(term28424, term28424.getClass(), "prettyPrint", false);
        setBooleanField(term28424, term28424.getClass(), "lineBreak", false);
        setBooleanField(term28424, term28424.getClass(), "printInputDelimiter", true);
        setField(term28424, term28424.getClass(), "inputDelimiter", "// Input %num%");
        setField(term28424, term28424.getClass(), "reportPath", "tKmrUDURku");
        setField(term28424, term28424.getClass(), "tracer", enum160);
        setBooleanField(term28424, term28424.getClass(), "colorizeErrorOutput", true);
        setField(term28424, term28424.getClass(), "errorFormat", enum161);
        setField(term28424, term28424.getClass(), "jsOutputFile", "");
        setField(term28747, term28747.getClass(), "guards", term28748);
        setField(term28424, term28424.getClass(), "warningsGuard", term28747);
        setIntField(term28424, term28424.getClass(), "summaryDetailLevel", 1);
        setBooleanField(term28424, term28424.getClass(), "externExports", false);
        setField(term28424, term28424.getClass(), "externExportsPath", "JeZbrwZmsP");
        setField(term28424, term28424.getClass(), "nameReferenceReportPath", "bxyfeicqrK");
        setField(term28424, term28424.getClass(), "nameReferenceGraphPath", "vBnWPlsZMk");
        setField(term28424, term28424.getClass(), "sourceMapOutputPath", "fIZsWucfXz");
        setField(term28424, term28424.getClass(), "sourceMapDetailLevel", enum162);
        setField(term28424, term28424.getClass(), "outputCharset", null);
        setBooleanField(term28424, term28424.getClass(), "looseTypes", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[1];
        args[0] = term28424;
        try {
            callMethod(klass, "outputNameMaps", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


