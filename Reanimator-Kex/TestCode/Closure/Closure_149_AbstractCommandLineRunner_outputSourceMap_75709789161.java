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

public class AbstractCommandLineRunner_outputSourceMap_75709789161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25496;

    public AbstractCommandLineRunner_outputSourceMap_75709789161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60413 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term60412 = ((Class) term60413).getDeclaredField((String) "OFF");
        ((Field) term60412).setAccessible(true);
        Object enum145 = ((Field) term60412).get((Object) null);
        Class<? extends Object> term60689 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term60688 = ((Class) term60689).getDeclaredField((String) "OFF");
        ((Field) term60688).setAccessible(true);
        Object enum146 = ((Field) term60688).get((Object) null);
        Class<? extends Object> term60900 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term60899 = ((Class) term60900).getDeclaredField((String) "ERROR");
        ((Field) term60899).setAccessible(true);
        Object enum147 = ((Field) term60899).get((Object) null);
        Class<? extends Object> term61147 = Class.forName((String) "com.google.javascript.jscomp.VariableRenamingPolicy");
        Field term61146 = ((Class) term61147).getDeclaredField((String) "OFF");
        ((Field) term61146).setAccessible(true);
        Object enum148 = ((Field) term61146).get((Object) null);
        Class<? extends Object> term61418 = Class.forName((String) "com.google.javascript.jscomp.PropertyRenamingPolicy");
        Field term61417 = ((Class) term61418).getDeclaredField((String) "OFF");
        ((Field) term61417).setAccessible(true);
        Object enum149 = ((Field) term61417).get((Object) null);
        Class<? extends Object> term61709 = Class.forName((String) "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy");
        Field term61708 = ((Class) term61709).getDeclaredField((String) "OFF");
        ((Field) term61708).setAccessible(true);
        Object enum150 = ((Field) term61708).get((Object) null);
        HashMap term25729 = new HashMap();
        Class<? extends Object> term62329 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term62328 = ((Class) term62329).getDeclaredField((String) "OFF");
        ((Field) term62328).setAccessible(true);
        Object enum151 = ((Field) term62328).get((Object) null);
        Class<? extends Object> term62620 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term62619 = ((Class) term62620).getDeclaredField((String) "SINGLELINE");
        ((Field) term62619).setAccessible(true);
        Object enum152 = ((Field) term62619).get((Object) null);
        ArrayList term25812 = new ArrayList();
        ((ArrayList) term25812).add((Object)null);
        ((ArrayList) term25812).add((Object)null);
        ((ArrayList) term25812).add((Object)null);
        ((ArrayList) term25812).add((Object)null);
        ((ArrayList) term25812).add((Object)null);
        ((ArrayList) term25812).add((Object)null);
        ((ArrayList) term25812).add((Object)null);
        Class<? extends Object> term62897 = Class.forName((String) "com.google.javascript.jscomp.SourceMap$DetailLevel");
        Field term62896 = ((Class) term62897).getDeclaredField((String) "SYMBOLS");
        ((Field) term62896).setAccessible(true);
        Object enum153 = ((Field) term62896).get((Object) null);
        term25496 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term25600 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        byte[] term25665 = (byte[]) newByteArray(1);
        byte[] term25667 = (byte[]) newByteArray(1);
        Object term25752 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term25811 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setBooleanField(term25496, term25496.getClass(), "ideMode", true);
        setBooleanField(term25496, term25496.getClass(), "skipAllPasses", true);
        setBooleanField(term25496, term25496.getClass(), "nameAnonymousFunctionsOnly", true);
        setField(term25496, term25496.getClass(), "devMode", enum145);
        setBooleanField(term25496, term25496.getClass(), "manageClosureDependencies", true);
        setField(term25496, term25496.getClass(), "messageBundle", null);
        setBooleanField(term25496, term25496.getClass(), "checkSymbols", true);
        setField(term25496, term25496.getClass(), "checkShadowVars", enum146);
        setField(term25496, term25496.getClass(), "aggressiveVarCheck", enum146);
        setField(term25496, term25496.getClass(), "checkFunctions", enum146);
        setField(term25496, term25496.getClass(), "checkMethods", enum146);
        setBooleanField(term25496, term25496.getClass(), "checkDuplicateMessages", true);
        setBooleanField(term25496, term25496.getClass(), "allowLegacyJsMessages", true);
        setBooleanField(term25496, term25496.getClass(), "strictMessageReplacement", false);
        setBooleanField(term25496, term25496.getClass(), "checkSuspiciousCode", true);
        setBooleanField(term25496, term25496.getClass(), "checkControlStructures", false);
        setField(term25496, term25496.getClass(), "checkUndefinedProperties", enum146);
        setBooleanField(term25496, term25496.getClass(), "checkUnusedPropertiesEarly", true);
        setBooleanField(term25496, term25496.getClass(), "checkTypes", true);
        setBooleanField(term25496, term25496.getClass(), "tightenTypes", true);
        setBooleanField(term25496, term25496.getClass(), "inferTypesInGlobalScope", false);
        setBooleanField(term25496, term25496.getClass(), "checkTypedPropertyCalls", true);
        setField(term25496, term25496.getClass(), "reportMissingOverride", enum146);
        setField(term25496, term25496.getClass(), "reportUnknownTypes", enum146);
        setField(term25496, term25496.getClass(), "checkRequires", enum146);
        setField(term25496, term25496.getClass(), "checkProvides", enum146);
        setField(term25496, term25496.getClass(), "checkGlobalNamesLevel", enum146);
        setField(term25496, term25496.getClass(), "brokenClosureRequiresLevel", enum147);
        setField(term25496, term25496.getClass(), "checkGlobalThisLevel", enum146);
        setField(term25496, term25496.getClass(), "checkMissingGetCssNameLevel", enum146);
        setField(term25496, term25496.getClass(), "checkMissingGetCssNameBlacklist", "NxgmYPzWCI");
        setBooleanField(term25496, term25496.getClass(), "checkEs5Strict", false);
        setBooleanField(term25496, term25496.getClass(), "checkCaja", true);
        setBooleanField(term25496, term25496.getClass(), "foldConstants", true);
        setBooleanField(term25496, term25496.getClass(), "removeConstantExpressions", false);
        setBooleanField(term25496, term25496.getClass(), "deadAssignmentElimination", false);
        setBooleanField(term25496, term25496.getClass(), "inlineConstantVars", true);
        setBooleanField(term25496, term25496.getClass(), "inlineFunctions", false);
        setBooleanField(term25496, term25496.getClass(), "decomposeExpressions", true);
        setBooleanField(term25496, term25496.getClass(), "inlineAnonymousFunctionExpressions", false);
        setBooleanField(term25496, term25496.getClass(), "inlineLocalFunctions", false);
        setBooleanField(term25496, term25496.getClass(), "crossModuleCodeMotion", false);
        setBooleanField(term25496, term25496.getClass(), "coalesceVariableNames", true);
        setBooleanField(term25496, term25496.getClass(), "crossModuleMethodMotion", false);
        setBooleanField(term25496, term25496.getClass(), "inlineGetters", false);
        setBooleanField(term25496, term25496.getClass(), "inlineVariables", false);
        setBooleanField(term25496, term25496.getClass(), "inlineLocalVariables", true);
        setBooleanField(term25496, term25496.getClass(), "flowSensitiveInlineVariables", true);
        setBooleanField(term25496, term25496.getClass(), "smartNameRemoval", false);
        setBooleanField(term25496, term25496.getClass(), "removeDeadCode", true);
        setField(term25496, term25496.getClass(), "checkUnreachableCode", enum146);
        setField(term25496, term25496.getClass(), "checkMissingReturn", enum146);
        setBooleanField(term25496, term25496.getClass(), "extractPrototypeMemberDeclarations", true);
        setBooleanField(term25496, term25496.getClass(), "removeEmptyFunctions", false);
        setBooleanField(term25496, term25496.getClass(), "removeUnusedPrototypeProperties", false);
        setBooleanField(term25496, term25496.getClass(), "removeUnusedPrototypePropertiesInExterns", true);
        setBooleanField(term25496, term25496.getClass(), "removeUnusedVars", false);
        setBooleanField(term25496, term25496.getClass(), "removeUnusedVarsInGlobalScope", true);
        setBooleanField(term25496, term25496.getClass(), "aliasExternals", true);
        setField(term25496, term25496.getClass(), "aliasableGlobals", "SqjyKmayBx");
        setField(term25496, term25496.getClass(), "unaliasableGlobals", "XjDhvToxJy");
        setBooleanField(term25496, term25496.getClass(), "collapseVariableDeclarations", false);
        setBooleanField(term25496, term25496.getClass(), "groupVariableDeclarations", false);
        setBooleanField(term25496, term25496.getClass(), "collapseAnonymousFunctions", false);
        setField(term25496, term25496.getClass(), "aliasableStrings", term25600);
        setField(term25496, term25496.getClass(), "aliasStringsBlacklist", "");
        setBooleanField(term25496, term25496.getClass(), "aliasAllStrings", true);
        setBooleanField(term25496, term25496.getClass(), "outputJsStringUsage", false);
        setBooleanField(term25496, term25496.getClass(), "convertToDottedProperties", true);
        setBooleanField(term25496, term25496.getClass(), "rewriteFunctionExpressions", true);
        setBooleanField(term25496, term25496.getClass(), "optimizeParameters", true);
        setBooleanField(term25496, term25496.getClass(), "optimizeArgumentsArray", true);
        setBooleanField(term25496, term25496.getClass(), "chainCalls", false);
        setField(term25496, term25496.getClass(), "variableRenaming", enum148);
        setField(term25496, term25496.getClass(), "propertyRenaming", enum149);
        setBooleanField(term25496, term25496.getClass(), "labelRenaming", false);
        setBooleanField(term25496, term25496.getClass(), "reserveRawExports", false);
        setBooleanField(term25496, term25496.getClass(), "generatePseudoNames", false);
        setField(term25496, term25496.getClass(), "renamePrefix", "nxSTJflLQy");
        setBooleanField(term25496, term25496.getClass(), "aliasKeywords", false);
        setBooleanField(term25496, term25496.getClass(), "collapseProperties", true);
        setBooleanField(term25496, term25496.getClass(), "collapsePropertiesOnExternTypes", true);
        setBooleanField(term25496, term25496.getClass(), "devirtualizePrototypeMethods", false);
        setBooleanField(term25496, term25496.getClass(), "computeFunctionSideEffects", false);
        setField(term25496, term25496.getClass(), "debugFunctionSideEffectsPath", "FlHzxEfFzI");
        setBooleanField(term25496, term25496.getClass(), "disambiguateProperties", false);
        setBooleanField(term25496, term25496.getClass(), "ambiguateProperties", false);
        setField(term25496, term25496.getClass(), "anonymousFunctionNaming", enum150);
        setByteElement(term25665, 0, (byte) 44);
        setField(term25496, term25496.getClass(), "inputVariableMapSerialized", term25665);
        setByteElement(term25667, 0, (byte) -63);
        setField(term25496, term25496.getClass(), "inputPropertyMapSerialized", term25667);
        setBooleanField(term25496, term25496.getClass(), "exportTestFunctions", false);
        setBooleanField(term25496, term25496.getClass(), "runtimeTypeCheck", false);
        setField(term25496, term25496.getClass(), "runtimeTypeCheckLogFunction", "aSATgQUpoe");
        setField(term25496, term25496.getClass(), "codingConvention", null);
        setBooleanField(term25496, term25496.getClass(), "instrumentForCoverage", false);
        setBooleanField(term25496, term25496.getClass(), "instrumentForCoverageOnly", true);
        setBooleanField(term25496, term25496.getClass(), "ignoreCajaProperties", true);
        setField(term25496, term25496.getClass(), "syntheticBlockStartMarker", "VkPSXewZfB");
        setField(term25496, term25496.getClass(), "syntheticBlockEndMarker", "ubodzJoMGW");
        setField(term25496, term25496.getClass(), "locale", "weddIktxOA");
        setBooleanField(term25496, term25496.getClass(), "markAsCompiled", false);
        setBooleanField(term25496, term25496.getClass(), "removeTryCatchFinally", true);
        setBooleanField(term25496, term25496.getClass(), "closurePass", true);
        setBooleanField(term25496, term25496.getClass(), "rewriteNewDateGoogNow", true);
        setBooleanField(term25496, term25496.getClass(), "removeAbstractMethods", true);
        setBooleanField(term25496, term25496.getClass(), "gatherCssNames", true);
        setField(term25496, term25496.getClass(), "stripTypes", term25600);
        setField(term25496, term25496.getClass(), "stripNameSuffixes", term25600);
        setField(term25496, term25496.getClass(), "stripNamePrefixes", term25600);
        setField(term25496, term25496.getClass(), "stripTypePrefixes", term25600);
        setField(term25496, term25496.getClass(), "customPasses", null);
        setBooleanField(term25496, term25496.getClass(), "markNoSideEffectCalls", false);
        setField(term25496, term25496.getClass(), "defineReplacements", term25729);
        setBooleanField(term25496, term25496.getClass(), "moveFunctionDeclarations", true);
        setField(term25496, term25496.getClass(), "instrumentationTemplate", "uSlMeISsDD");
        setField(term25496, term25496.getClass(), "appNameStr", "");
        setBooleanField(term25496, term25496.getClass(), "recordFunctionInformation", true);
        setBooleanField(term25496, term25496.getClass(), "generateExports", true);
        setField(term25496, term25496.getClass(), "cssRenamingMap", null);
        setBooleanField(term25496, term25496.getClass(), "processObjectPropertyString", false);
        setField(term25496, term25496.getClass(), "idGenerators", term25600);
        setIntField(term25752, term25752.getClass(), "modCount", 0);
        setField(term25496, term25496.getClass(), "replaceStringsFunctionDescriptions", term25752);
        setField(term25496, term25496.getClass(), "replaceStringsPlaceholderToken", "");
        setBooleanField(term25496, term25496.getClass(), "prettyPrint", true);
        setBooleanField(term25496, term25496.getClass(), "lineBreak", true);
        setBooleanField(term25496, term25496.getClass(), "printInputDelimiter", false);
        setField(term25496, term25496.getClass(), "inputDelimiter", "// Input %num%");
        setField(term25496, term25496.getClass(), "reportPath", "WdCiTDUKqn");
        setField(term25496, term25496.getClass(), "tracer", enum151);
        setBooleanField(term25496, term25496.getClass(), "colorizeErrorOutput", false);
        setField(term25496, term25496.getClass(), "errorFormat", enum152);
        setField(term25496, term25496.getClass(), "jsOutputFile", "");
        setField(term25811, term25811.getClass(), "guards", term25812);
        setField(term25496, term25496.getClass(), "warningsGuard", term25811);
        setIntField(term25496, term25496.getClass(), "summaryDetailLevel", 1);
        setBooleanField(term25496, term25496.getClass(), "externExports", true);
        setField(term25496, term25496.getClass(), "externExportsPath", "PSizQDoxxe");
        setField(term25496, term25496.getClass(), "nameReferenceReportPath", "mKaHyMybrK");
        setField(term25496, term25496.getClass(), "nameReferenceGraphPath", "AyrEXuGrEj");
        setField(term25496, term25496.getClass(), "sourceMapOutputPath", "yevIIoVYHq");
        setField(term25496, term25496.getClass(), "sourceMapDetailLevel", enum153);
        setField(term25496, term25496.getClass(), "outputCharset", null);
        setBooleanField(term25496, term25496.getClass(), "looseTypes", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[1];
        args[0] = term25496;
        try {
            callMethod(klass, "outputSourceMap", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


