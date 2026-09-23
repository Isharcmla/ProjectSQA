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

public class AbstractCommandLineRunner_initOptionsFromFlags_164339102237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public AbstractCommandLineRunner_initOptionsFromFlags_164339102237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35065 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term35064 = ((Class) term35065).getDeclaredField((String) "OFF");
        ((Field) term35064).setAccessible(true);
        Object enum91 = ((Field) term35064).get((Object) null);
        Class<? extends Object> term35341 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term35340 = ((Class) term35341).getDeclaredField((String) "OFF");
        ((Field) term35340).setAccessible(true);
        Object enum92 = ((Field) term35340).get((Object) null);
        Class<? extends Object> term35552 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term35551 = ((Class) term35552).getDeclaredField((String) "ERROR");
        ((Field) term35551).setAccessible(true);
        Object enum93 = ((Field) term35551).get((Object) null);
        Class<? extends Object> term35799 = Class.forName((String) "com.google.javascript.jscomp.VariableRenamingPolicy");
        Field term35798 = ((Class) term35799).getDeclaredField((String) "OFF");
        ((Field) term35798).setAccessible(true);
        Object enum94 = ((Field) term35798).get((Object) null);
        Class<? extends Object> term36070 = Class.forName((String) "com.google.javascript.jscomp.PropertyRenamingPolicy");
        Field term36069 = ((Class) term36070).getDeclaredField((String) "OFF");
        ((Field) term36069).setAccessible(true);
        Object enum95 = ((Field) term36069).get((Object) null);
        Class<? extends Object> term36361 = Class.forName((String) "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy");
        Field term36360 = ((Class) term36361).getDeclaredField((String) "OFF");
        ((Field) term36360).setAccessible(true);
        Object enum96 = ((Field) term36360).get((Object) null);
        HashMap term241 = new HashMap();
        Class<? extends Object> term36750 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term36749 = ((Class) term36750).getDeclaredField((String) "OFF");
        ((Field) term36749).setAccessible(true);
        Object enum97 = ((Field) term36749).get((Object) null);
        Class<? extends Object> term37041 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term37040 = ((Class) term37041).getDeclaredField((String) "SINGLELINE");
        ((Field) term37040).setAccessible(true);
        Object enum98 = ((Field) term37040).get((Object) null);
        ArrayList term324 = new ArrayList();
        ((ArrayList) term324).add((Object)null);
        ((ArrayList) term324).add((Object)null);
        ((ArrayList) term324).add((Object)null);
        Class<? extends Object> term37318 = Class.forName((String) "com.google.javascript.jscomp.SourceMap$DetailLevel");
        Field term37317 = ((Class) term37318).getDeclaredField((String) "SYMBOLS");
        ((Field) term37317).setAccessible(true);
        Object enum99 = ((Field) term37317).get((Object) null);
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term105 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        byte[] term170 = (byte[]) newByteArray(5);
        byte[] term176 = (byte[]) newByteArray(4);
        Object term264 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term323 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setBooleanField(term1, term1.getClass(), "ideMode", false);
        setBooleanField(term1, term1.getClass(), "skipAllPasses", false);
        setBooleanField(term1, term1.getClass(), "nameAnonymousFunctionsOnly", false);
        setField(term1, term1.getClass(), "devMode", enum91);
        setBooleanField(term1, term1.getClass(), "manageClosureDependencies", false);
        setField(term1, term1.getClass(), "messageBundle", null);
        setBooleanField(term1, term1.getClass(), "checkSymbols", true);
        setField(term1, term1.getClass(), "checkShadowVars", enum92);
        setField(term1, term1.getClass(), "aggressiveVarCheck", enum92);
        setField(term1, term1.getClass(), "checkFunctions", enum92);
        setField(term1, term1.getClass(), "checkMethods", enum92);
        setBooleanField(term1, term1.getClass(), "checkDuplicateMessages", true);
        setBooleanField(term1, term1.getClass(), "allowLegacyJsMessages", true);
        setBooleanField(term1, term1.getClass(), "strictMessageReplacement", true);
        setBooleanField(term1, term1.getClass(), "checkSuspiciousCode", false);
        setBooleanField(term1, term1.getClass(), "checkControlStructures", true);
        setField(term1, term1.getClass(), "checkUndefinedProperties", enum92);
        setBooleanField(term1, term1.getClass(), "checkUnusedPropertiesEarly", false);
        setBooleanField(term1, term1.getClass(), "checkTypes", true);
        setBooleanField(term1, term1.getClass(), "tightenTypes", false);
        setBooleanField(term1, term1.getClass(), "inferTypesInGlobalScope", true);
        setBooleanField(term1, term1.getClass(), "checkTypedPropertyCalls", false);
        setField(term1, term1.getClass(), "reportMissingOverride", enum92);
        setField(term1, term1.getClass(), "reportUnknownTypes", enum92);
        setField(term1, term1.getClass(), "checkRequires", enum92);
        setField(term1, term1.getClass(), "checkProvides", enum92);
        setField(term1, term1.getClass(), "checkGlobalNamesLevel", enum92);
        setField(term1, term1.getClass(), "brokenClosureRequiresLevel", enum93);
        setField(term1, term1.getClass(), "checkGlobalThisLevel", enum92);
        setField(term1, term1.getClass(), "checkMissingGetCssNameLevel", enum92);
        setField(term1, term1.getClass(), "checkMissingGetCssNameBlacklist", "PAEBtnZtTD");
        setBooleanField(term1, term1.getClass(), "checkEs5Strict", false);
        setBooleanField(term1, term1.getClass(), "checkCaja", true);
        setBooleanField(term1, term1.getClass(), "foldConstants", true);
        setBooleanField(term1, term1.getClass(), "removeConstantExpressions", false);
        setBooleanField(term1, term1.getClass(), "deadAssignmentElimination", false);
        setBooleanField(term1, term1.getClass(), "inlineConstantVars", true);
        setBooleanField(term1, term1.getClass(), "inlineFunctions", true);
        setBooleanField(term1, term1.getClass(), "decomposeExpressions", true);
        setBooleanField(term1, term1.getClass(), "inlineAnonymousFunctionExpressions", true);
        setBooleanField(term1, term1.getClass(), "inlineLocalFunctions", true);
        setBooleanField(term1, term1.getClass(), "crossModuleCodeMotion", false);
        setBooleanField(term1, term1.getClass(), "coalesceVariableNames", false);
        setBooleanField(term1, term1.getClass(), "crossModuleMethodMotion", false);
        setBooleanField(term1, term1.getClass(), "inlineGetters", true);
        setBooleanField(term1, term1.getClass(), "inlineVariables", true);
        setBooleanField(term1, term1.getClass(), "inlineLocalVariables", true);
        setBooleanField(term1, term1.getClass(), "flowSensitiveInlineVariables", true);
        setBooleanField(term1, term1.getClass(), "smartNameRemoval", true);
        setBooleanField(term1, term1.getClass(), "removeDeadCode", true);
        setField(term1, term1.getClass(), "checkUnreachableCode", enum92);
        setField(term1, term1.getClass(), "checkMissingReturn", enum92);
        setBooleanField(term1, term1.getClass(), "extractPrototypeMemberDeclarations", false);
        setBooleanField(term1, term1.getClass(), "removeEmptyFunctions", true);
        setBooleanField(term1, term1.getClass(), "removeUnusedPrototypeProperties", true);
        setBooleanField(term1, term1.getClass(), "removeUnusedPrototypePropertiesInExterns", true);
        setBooleanField(term1, term1.getClass(), "removeUnusedVars", true);
        setBooleanField(term1, term1.getClass(), "removeUnusedVarsInGlobalScope", true);
        setBooleanField(term1, term1.getClass(), "aliasExternals", false);
        setField(term1, term1.getClass(), "aliasableGlobals", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "unaliasableGlobals", "MuLcgQHgqz");
        setBooleanField(term1, term1.getClass(), "collapseVariableDeclarations", false);
        setBooleanField(term1, term1.getClass(), "groupVariableDeclarations", false);
        setBooleanField(term1, term1.getClass(), "collapseAnonymousFunctions", true);
        setField(term1, term1.getClass(), "aliasableStrings", term105);
        setField(term1, term1.getClass(), "aliasStringsBlacklist", "");
        setBooleanField(term1, term1.getClass(), "aliasAllStrings", true);
        setBooleanField(term1, term1.getClass(), "outputJsStringUsage", false);
        setBooleanField(term1, term1.getClass(), "convertToDottedProperties", true);
        setBooleanField(term1, term1.getClass(), "rewriteFunctionExpressions", true);
        setBooleanField(term1, term1.getClass(), "optimizeParameters", true);
        setBooleanField(term1, term1.getClass(), "optimizeArgumentsArray", false);
        setBooleanField(term1, term1.getClass(), "chainCalls", true);
        setField(term1, term1.getClass(), "variableRenaming", enum94);
        setField(term1, term1.getClass(), "propertyRenaming", enum95);
        setBooleanField(term1, term1.getClass(), "labelRenaming", false);
        setBooleanField(term1, term1.getClass(), "reserveRawExports", false);
        setBooleanField(term1, term1.getClass(), "generatePseudoNames", true);
        setField(term1, term1.getClass(), "renamePrefix", "xxtlPwDYFs");
        setBooleanField(term1, term1.getClass(), "aliasKeywords", false);
        setBooleanField(term1, term1.getClass(), "collapseProperties", true);
        setBooleanField(term1, term1.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term1, term1.getClass(), "devirtualizePrototypeMethods", false);
        setBooleanField(term1, term1.getClass(), "computeFunctionSideEffects", true);
        setField(term1, term1.getClass(), "debugFunctionSideEffectsPath", "jJCZpVmanW");
        setBooleanField(term1, term1.getClass(), "disambiguateProperties", false);
        setBooleanField(term1, term1.getClass(), "ambiguateProperties", false);
        setField(term1, term1.getClass(), "anonymousFunctionNaming", enum96);
        setByteElement(term170, 0, (byte) 47);
        setByteElement(term170, 1, (byte) 48);
        setByteElement(term170, 2, (byte) 89);
        setByteElement(term170, 3, (byte) 75);
        setByteElement(term170, 4, (byte) 18);
        setField(term1, term1.getClass(), "inputVariableMapSerialized", term170);
        setByteElement(term176, 0, (byte) -58);
        setByteElement(term176, 1, (byte) -29);
        setByteElement(term176, 2, (byte) -54);
        setByteElement(term176, 3, (byte) -10);
        setField(term1, term1.getClass(), "inputPropertyMapSerialized", term176);
        setBooleanField(term1, term1.getClass(), "exportTestFunctions", false);
        setBooleanField(term1, term1.getClass(), "runtimeTypeCheck", false);
        setField(term1, term1.getClass(), "runtimeTypeCheckLogFunction", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "codingConvention", null);
        setBooleanField(term1, term1.getClass(), "instrumentForCoverage", true);
        setBooleanField(term1, term1.getClass(), "instrumentForCoverageOnly", true);
        setBooleanField(term1, term1.getClass(), "ignoreCajaProperties", false);
        setField(term1, term1.getClass(), "syntheticBlockStartMarker", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "syntheticBlockEndMarker", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "locale", "hRNSzYYIrc");
        setBooleanField(term1, term1.getClass(), "markAsCompiled", false);
        setBooleanField(term1, term1.getClass(), "removeTryCatchFinally", true);
        setBooleanField(term1, term1.getClass(), "closurePass", true);
        setBooleanField(term1, term1.getClass(), "rewriteNewDateGoogNow", true);
        setBooleanField(term1, term1.getClass(), "removeAbstractMethods", true);
        setBooleanField(term1, term1.getClass(), "gatherCssNames", true);
        setField(term1, term1.getClass(), "stripTypes", term105);
        setField(term1, term1.getClass(), "stripNameSuffixes", term105);
        setField(term1, term1.getClass(), "stripNamePrefixes", term105);
        setField(term1, term1.getClass(), "stripTypePrefixes", term105);
        setField(term1, term1.getClass(), "customPasses", null);
        setBooleanField(term1, term1.getClass(), "markNoSideEffectCalls", false);
        setField(term1, term1.getClass(), "defineReplacements", term241);
        setBooleanField(term1, term1.getClass(), "moveFunctionDeclarations", false);
        setField(term1, term1.getClass(), "instrumentationTemplate", "RMFIsYGgne");
        setField(term1, term1.getClass(), "appNameStr", "");
        setBooleanField(term1, term1.getClass(), "recordFunctionInformation", false);
        setBooleanField(term1, term1.getClass(), "generateExports", false);
        setField(term1, term1.getClass(), "cssRenamingMap", null);
        setBooleanField(term1, term1.getClass(), "processObjectPropertyString", false);
        setField(term1, term1.getClass(), "idGenerators", term105);
        setIntField(term264, term264.getClass(), "modCount", 0);
        setField(term1, term1.getClass(), "replaceStringsFunctionDescriptions", term264);
        setField(term1, term1.getClass(), "replaceStringsPlaceholderToken", "");
        setBooleanField(term1, term1.getClass(), "prettyPrint", false);
        setBooleanField(term1, term1.getClass(), "lineBreak", false);
        setBooleanField(term1, term1.getClass(), "printInputDelimiter", true);
        setField(term1, term1.getClass(), "inputDelimiter", "// Input %num%");
        setField(term1, term1.getClass(), "reportPath", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "tracer", enum97);
        setBooleanField(term1, term1.getClass(), "colorizeErrorOutput", false);
        setField(term1, term1.getClass(), "errorFormat", enum98);
        setField(term1, term1.getClass(), "jsOutputFile", "");
        setField(term323, term323.getClass(), "guards", term324);
        setField(term1, term1.getClass(), "warningsGuard", term323);
        setIntField(term1, term1.getClass(), "summaryDetailLevel", 1);
        setBooleanField(term1, term1.getClass(), "externExports", false);
        setField(term1, term1.getClass(), "externExportsPath", "uuaPigETmJ");
        setField(term1, term1.getClass(), "nameReferenceReportPath", "MxlszYVzRf");
        setField(term1, term1.getClass(), "nameReferenceGraphPath", "LQFpaHEwXR");
        setField(term1, term1.getClass(), "sourceMapOutputPath", "oVcInYnLWB");
        setField(term1, term1.getClass(), "sourceMapDetailLevel", enum99);
        setField(term1, term1.getClass(), "outputCharset", null);
        setBooleanField(term1, term1.getClass(), "looseTypes", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[1];
        args[0] = term1;
        try {
            callMethod(klass, "initOptionsFromFlags", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


