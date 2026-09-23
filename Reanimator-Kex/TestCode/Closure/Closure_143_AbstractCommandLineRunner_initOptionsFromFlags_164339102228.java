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

public class AbstractCommandLineRunner_initOptionsFromFlags_164339102228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public AbstractCommandLineRunner_initOptionsFromFlags_164339102228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30955 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term30954 = ((Class) term30955).getDeclaredField((String) "OFF");
        ((Field) term30954).setAccessible(true);
        Object enum90 = ((Field) term30954).get((Object) null);
        Class<? extends Object> term31231 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term31230 = ((Class) term31231).getDeclaredField((String) "OFF");
        ((Field) term31230).setAccessible(true);
        Object enum91 = ((Field) term31230).get((Object) null);
        Class<? extends Object> term31442 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term31441 = ((Class) term31442).getDeclaredField((String) "ERROR");
        ((Field) term31441).setAccessible(true);
        Object enum92 = ((Field) term31441).get((Object) null);
        Class<? extends Object> term31659 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term31658 = ((Class) term31659).getDeclaredField((String) "WARNING");
        ((Field) term31658).setAccessible(true);
        Object enum93 = ((Field) term31658).get((Object) null);
        Class<? extends Object> term31912 = Class.forName((String) "com.google.javascript.jscomp.VariableRenamingPolicy");
        Field term31911 = ((Class) term31912).getDeclaredField((String) "OFF");
        ((Field) term31911).setAccessible(true);
        Object enum94 = ((Field) term31911).get((Object) null);
        Class<? extends Object> term32183 = Class.forName((String) "com.google.javascript.jscomp.PropertyRenamingPolicy");
        Field term32182 = ((Class) term32183).getDeclaredField((String) "OFF");
        ((Field) term32182).setAccessible(true);
        Object enum95 = ((Field) term32182).get((Object) null);
        Class<? extends Object> term32474 = Class.forName((String) "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy");
        Field term32473 = ((Class) term32474).getDeclaredField((String) "OFF");
        ((Field) term32473).setAccessible(true);
        Object enum96 = ((Field) term32473).get((Object) null);
        HashMap term251 = new HashMap();
        Class<? extends Object> term32863 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term32862 = ((Class) term32863).getDeclaredField((String) "OFF");
        ((Field) term32862).setAccessible(true);
        Object enum97 = ((Field) term32862).get((Object) null);
        Class<? extends Object> term33154 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term33153 = ((Class) term33154).getDeclaredField((String) "SINGLELINE");
        ((Field) term33153).setAccessible(true);
        Object enum98 = ((Field) term33153).get((Object) null);
        ArrayList term330 = new ArrayList();
        ((ArrayList) term330).add((Object)null);
        ((ArrayList) term330).add((Object)null);
        ((ArrayList) term330).add((Object)null);
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term115 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        byte[] term180 = (byte[]) newByteArray(5);
        byte[] term186 = (byte[]) newByteArray(4);
        Object term329 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setBooleanField(term1, term1.getClass(), "ideMode", false);
        setBooleanField(term1, term1.getClass(), "skipAllPasses", false);
        setBooleanField(term1, term1.getClass(), "nameAnonymousFunctionsOnly", false);
        setField(term1, term1.getClass(), "devMode", enum90);
        setBooleanField(term1, term1.getClass(), "checkSymbols", false);
        setField(term1, term1.getClass(), "checkShadowVars", enum91);
        setField(term1, term1.getClass(), "aggressiveVarCheck", enum91);
        setField(term1, term1.getClass(), "checkFunctions", enum91);
        setField(term1, term1.getClass(), "checkMethods", enum91);
        setBooleanField(term1, term1.getClass(), "checkDuplicateMessages", true);
        setBooleanField(term1, term1.getClass(), "allowLegacyJsMessages", true);
        setBooleanField(term1, term1.getClass(), "strictMessageReplacement", true);
        setBooleanField(term1, term1.getClass(), "checkSuspiciousCode", true);
        setBooleanField(term1, term1.getClass(), "checkControlStructures", false);
        setField(term1, term1.getClass(), "checkUndefinedProperties", enum91);
        setBooleanField(term1, term1.getClass(), "checkUnusedPropertiesEarly", true);
        setBooleanField(term1, term1.getClass(), "checkTypes", false);
        setBooleanField(term1, term1.getClass(), "tightenTypes", true);
        setBooleanField(term1, term1.getClass(), "inferTypesInGlobalScope", false);
        setBooleanField(term1, term1.getClass(), "checkTypedPropertyCalls", true);
        setField(term1, term1.getClass(), "reportMissingOverride", enum91);
        setField(term1, term1.getClass(), "reportUnknownTypes", enum91);
        setField(term1, term1.getClass(), "checkRequires", enum91);
        setField(term1, term1.getClass(), "checkProvides", enum91);
        setField(term1, term1.getClass(), "checkGlobalNamesLevel", enum91);
        setField(term1, term1.getClass(), "brokenClosureRequiresLevel", enum92);
        setField(term1, term1.getClass(), "checkGlobalThisLevel", enum93);
        setField(term1, term1.getClass(), "checkMissingGetCssNameLevel", enum91);
        setField(term1, term1.getClass(), "checkMissingGetCssNameBlacklist", "PAEBtnZtTD");
        setBooleanField(term1, term1.getClass(), "checkEs5Strict", false);
        setBooleanField(term1, term1.getClass(), "checkCaja", false);
        setBooleanField(term1, term1.getClass(), "foldConstants", true);
        setBooleanField(term1, term1.getClass(), "removeConstantExpressions", true);
        setBooleanField(term1, term1.getClass(), "deadAssignmentElimination", false);
        setBooleanField(term1, term1.getClass(), "inlineConstantVars", false);
        setBooleanField(term1, term1.getClass(), "inlineFunctions", true);
        setBooleanField(term1, term1.getClass(), "decomposeExpressions", true);
        setBooleanField(term1, term1.getClass(), "inlineAnonymousFunctionExpressions", true);
        setBooleanField(term1, term1.getClass(), "inlineLocalFunctions", true);
        setBooleanField(term1, term1.getClass(), "crossModuleCodeMotion", true);
        setBooleanField(term1, term1.getClass(), "coalesceVariableNames", false);
        setBooleanField(term1, term1.getClass(), "crossModuleMethodMotion", false);
        setBooleanField(term1, term1.getClass(), "inlineGetters", false);
        setBooleanField(term1, term1.getClass(), "inlineVariables", true);
        setBooleanField(term1, term1.getClass(), "inlineLocalVariables", true);
        setBooleanField(term1, term1.getClass(), "flowSensitiveInlineVariables", true);
        setBooleanField(term1, term1.getClass(), "smartNameRemoval", true);
        setBooleanField(term1, term1.getClass(), "removeDeadCode", true);
        setField(term1, term1.getClass(), "checkUnreachableCode", enum91);
        setField(term1, term1.getClass(), "checkMissingReturn", enum91);
        setBooleanField(term1, term1.getClass(), "extractPrototypeMemberDeclarations", true);
        setBooleanField(term1, term1.getClass(), "removeEmptyFunctions", false);
        setBooleanField(term1, term1.getClass(), "removeUnusedPrototypeProperties", true);
        setBooleanField(term1, term1.getClass(), "removeUnusedPrototypePropertiesInExterns", true);
        setBooleanField(term1, term1.getClass(), "removeUnusedVars", true);
        setBooleanField(term1, term1.getClass(), "removeUnusedVarsInGlobalScope", true);
        setBooleanField(term1, term1.getClass(), "aliasExternals", true);
        setField(term1, term1.getClass(), "aliasableGlobals", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "unaliasableGlobals", "MuLcgQHgqz");
        setBooleanField(term1, term1.getClass(), "collapseVariableDeclarations", false);
        setBooleanField(term1, term1.getClass(), "groupVariableDeclarations", false);
        setBooleanField(term1, term1.getClass(), "collapseAnonymousFunctions", false);
        setField(term1, term1.getClass(), "aliasableStrings", term115);
        setField(term1, term1.getClass(), "aliasStringsBlacklist", "");
        setBooleanField(term1, term1.getClass(), "aliasAllStrings", true);
        setBooleanField(term1, term1.getClass(), "outputJsStringUsage", true);
        setBooleanField(term1, term1.getClass(), "convertToDottedProperties", false);
        setBooleanField(term1, term1.getClass(), "rewriteFunctionExpressions", true);
        setBooleanField(term1, term1.getClass(), "optimizeParameters", true);
        setBooleanField(term1, term1.getClass(), "optimizeArgumentsArray", true);
        setBooleanField(term1, term1.getClass(), "chainCalls", false);
        setField(term1, term1.getClass(), "variableRenaming", enum94);
        setField(term1, term1.getClass(), "propertyRenaming", enum95);
        setBooleanField(term1, term1.getClass(), "labelRenaming", true);
        setBooleanField(term1, term1.getClass(), "reserveRawExports", false);
        setBooleanField(term1, term1.getClass(), "generatePseudoNames", false);
        setField(term1, term1.getClass(), "renamePrefix", "xxtlPwDYFs");
        setBooleanField(term1, term1.getClass(), "aliasKeywords", true);
        setBooleanField(term1, term1.getClass(), "collapseProperties", false);
        setBooleanField(term1, term1.getClass(), "collapsePropertiesOnExternTypes", true);
        setBooleanField(term1, term1.getClass(), "devirtualizePrototypeMethods", false);
        setBooleanField(term1, term1.getClass(), "computeFunctionSideEffects", false);
        setField(term1, term1.getClass(), "debugFunctionSideEffectsPath", "jJCZpVmanW");
        setBooleanField(term1, term1.getClass(), "disambiguateProperties", true);
        setBooleanField(term1, term1.getClass(), "ambiguateProperties", false);
        setField(term1, term1.getClass(), "anonymousFunctionNaming", enum96);
        setByteElement(term180, 0, (byte) 47);
        setByteElement(term180, 1, (byte) 48);
        setByteElement(term180, 2, (byte) 89);
        setByteElement(term180, 3, (byte) 75);
        setByteElement(term180, 4, (byte) 18);
        setField(term1, term1.getClass(), "inputVariableMapSerialized", term180);
        setByteElement(term186, 0, (byte) -58);
        setByteElement(term186, 1, (byte) -29);
        setByteElement(term186, 2, (byte) -54);
        setByteElement(term186, 3, (byte) -10);
        setField(term1, term1.getClass(), "inputPropertyMapSerialized", term186);
        setBooleanField(term1, term1.getClass(), "exportTestFunctions", false);
        setBooleanField(term1, term1.getClass(), "runtimeTypeCheck", false);
        setField(term1, term1.getClass(), "runtimeTypeCheckLogFunction", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "codingConvention", null);
        setBooleanField(term1, term1.getClass(), "instrumentForCoverage", false);
        setBooleanField(term1, term1.getClass(), "instrumentForCoverageOnly", true);
        setBooleanField(term1, term1.getClass(), "ignoreCajaProperties", true);
        setField(term1, term1.getClass(), "syntheticBlockStartMarker", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "syntheticBlockEndMarker", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "locale", "hRNSzYYIrc");
        setBooleanField(term1, term1.getClass(), "markAsCompiled", false);
        setBooleanField(term1, term1.getClass(), "removeTryCatchFinally", false);
        setBooleanField(term1, term1.getClass(), "closurePass", true);
        setBooleanField(term1, term1.getClass(), "rewriteNewDateGoogNow", true);
        setBooleanField(term1, term1.getClass(), "removeAbstractMethods", true);
        setBooleanField(term1, term1.getClass(), "gatherCssNames", true);
        setField(term1, term1.getClass(), "stripTypes", term115);
        setField(term1, term1.getClass(), "stripNameSuffixes", term115);
        setField(term1, term1.getClass(), "stripNamePrefixes", term115);
        setField(term1, term1.getClass(), "stripTypePrefixes", term115);
        setField(term1, term1.getClass(), "customPasses", null);
        setBooleanField(term1, term1.getClass(), "markNoSideEffectCalls", true);
        setField(term1, term1.getClass(), "defineReplacements", term251);
        setBooleanField(term1, term1.getClass(), "moveFunctionDeclarations", false);
        setField(term1, term1.getClass(), "instrumentationTemplate", "RMFIsYGgne");
        setField(term1, term1.getClass(), "appNameStr", "");
        setBooleanField(term1, term1.getClass(), "recordFunctionInformation", false);
        setBooleanField(term1, term1.getClass(), "generateExports", false);
        setField(term1, term1.getClass(), "cssRenamingMap", null);
        setBooleanField(term1, term1.getClass(), "processObjectPropertyString", false);
        setField(term1, term1.getClass(), "idGenerators", term115);
        setBooleanField(term1, term1.getClass(), "prettyPrint", false);
        setBooleanField(term1, term1.getClass(), "lineBreak", false);
        setBooleanField(term1, term1.getClass(), "printInputDelimiter", false);
        setField(term1, term1.getClass(), "inputDelimiter", "// Input %num%");
        setField(term1, term1.getClass(), "reportPath", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "tracer", enum97);
        setBooleanField(term1, term1.getClass(), "colorizeErrorOutput", true);
        setField(term1, term1.getClass(), "errorFormat", enum98);
        setField(term1, term1.getClass(), "jsOutputFile", "");
        setField(term329, term329.getClass(), "guards", term330);
        setField(term1, term1.getClass(), "warningsGuard", term329);
        setIntField(term1, term1.getClass(), "summaryDetailLevel", 1);
        setField(term1, term1.getClass(), "externExportsPath", "uuaPigETmJ");
        setField(term1, term1.getClass(), "nameReferenceReportPath", "MxlszYVzRf");
        setField(term1, term1.getClass(), "nameReferenceGraphPath", "LQFpaHEwXR");
        setField(term1, term1.getClass(), "sourceMapOutputPath", "oVcInYnLWB");
        setField(term1, term1.getClass(), "outputCharset", null);
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


