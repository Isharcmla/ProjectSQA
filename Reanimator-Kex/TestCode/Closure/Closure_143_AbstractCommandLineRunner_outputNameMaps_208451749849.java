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

public class AbstractCommandLineRunner_outputNameMaps_208451749849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24432;

    public AbstractCommandLineRunner_outputNameMaps_208451749849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83190 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term83189 = ((Class) term83190).getDeclaredField((String) "OFF");
        ((Field) term83189).setAccessible(true);
        Object enum162 = ((Field) term83189).get((Object) null);
        Class<? extends Object> term83466 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term83465 = ((Class) term83466).getDeclaredField((String) "OFF");
        ((Field) term83465).setAccessible(true);
        Object enum163 = ((Field) term83465).get((Object) null);
        Class<? extends Object> term83677 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term83676 = ((Class) term83677).getDeclaredField((String) "ERROR");
        ((Field) term83676).setAccessible(true);
        Object enum164 = ((Field) term83676).get((Object) null);
        Class<? extends Object> term83894 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term83893 = ((Class) term83894).getDeclaredField((String) "WARNING");
        ((Field) term83893).setAccessible(true);
        Object enum165 = ((Field) term83893).get((Object) null);
        Class<? extends Object> term84147 = Class.forName((String) "com.google.javascript.jscomp.VariableRenamingPolicy");
        Field term84146 = ((Class) term84147).getDeclaredField((String) "OFF");
        ((Field) term84146).setAccessible(true);
        Object enum166 = ((Field) term84146).get((Object) null);
        Class<? extends Object> term84418 = Class.forName((String) "com.google.javascript.jscomp.PropertyRenamingPolicy");
        Field term84417 = ((Class) term84418).getDeclaredField((String) "OFF");
        ((Field) term84417).setAccessible(true);
        Object enum167 = ((Field) term84417).get((Object) null);
        Class<? extends Object> term84709 = Class.forName((String) "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy");
        Field term84708 = ((Class) term84709).getDeclaredField((String) "OFF");
        ((Field) term84708).setAccessible(true);
        Object enum168 = ((Field) term84708).get((Object) null);
        HashMap term24683 = new HashMap();
        Class<? extends Object> term85099 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term85098 = ((Class) term85099).getDeclaredField((String) "OFF");
        ((Field) term85098).setAccessible(true);
        Object enum169 = ((Field) term85098).get((Object) null);
        Class<? extends Object> term85390 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term85389 = ((Class) term85390).getDeclaredField((String) "SINGLELINE");
        ((Field) term85389).setAccessible(true);
        Object enum170 = ((Field) term85389).get((Object) null);
        ArrayList term24762 = new ArrayList();
        ((ArrayList) term24762).add((Object)null);
        ((ArrayList) term24762).add((Object)null);
        ((ArrayList) term24762).add((Object)null);
        ((ArrayList) term24762).add((Object)null);
        ((ArrayList) term24762).add((Object)null);
        ((ArrayList) term24762).add((Object)null);
        ((ArrayList) term24762).add((Object)null);
        term24432 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term24546 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        byte[] term24611 = (byte[]) newByteArray(7);
        byte[] term24619 = (byte[]) newByteArray(3);
        Object term24761 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setBooleanField(term24432, term24432.getClass(), "ideMode", true);
        setBooleanField(term24432, term24432.getClass(), "skipAllPasses", false);
        setBooleanField(term24432, term24432.getClass(), "nameAnonymousFunctionsOnly", false);
        setField(term24432, term24432.getClass(), "devMode", enum162);
        setBooleanField(term24432, term24432.getClass(), "checkSymbols", true);
        setField(term24432, term24432.getClass(), "checkShadowVars", enum163);
        setField(term24432, term24432.getClass(), "aggressiveVarCheck", enum163);
        setField(term24432, term24432.getClass(), "checkFunctions", enum163);
        setField(term24432, term24432.getClass(), "checkMethods", enum163);
        setBooleanField(term24432, term24432.getClass(), "checkDuplicateMessages", false);
        setBooleanField(term24432, term24432.getClass(), "allowLegacyJsMessages", true);
        setBooleanField(term24432, term24432.getClass(), "strictMessageReplacement", false);
        setBooleanField(term24432, term24432.getClass(), "checkSuspiciousCode", false);
        setBooleanField(term24432, term24432.getClass(), "checkControlStructures", false);
        setField(term24432, term24432.getClass(), "checkUndefinedProperties", enum163);
        setBooleanField(term24432, term24432.getClass(), "checkUnusedPropertiesEarly", true);
        setBooleanField(term24432, term24432.getClass(), "checkTypes", false);
        setBooleanField(term24432, term24432.getClass(), "tightenTypes", true);
        setBooleanField(term24432, term24432.getClass(), "inferTypesInGlobalScope", true);
        setBooleanField(term24432, term24432.getClass(), "checkTypedPropertyCalls", true);
        setField(term24432, term24432.getClass(), "reportMissingOverride", enum163);
        setField(term24432, term24432.getClass(), "reportUnknownTypes", enum163);
        setField(term24432, term24432.getClass(), "checkRequires", enum163);
        setField(term24432, term24432.getClass(), "checkProvides", enum163);
        setField(term24432, term24432.getClass(), "checkGlobalNamesLevel", enum163);
        setField(term24432, term24432.getClass(), "brokenClosureRequiresLevel", enum164);
        setField(term24432, term24432.getClass(), "checkGlobalThisLevel", enum165);
        setField(term24432, term24432.getClass(), "checkMissingGetCssNameLevel", enum163);
        setField(term24432, term24432.getClass(), "checkMissingGetCssNameBlacklist", "GJVkUrCVdD");
        setBooleanField(term24432, term24432.getClass(), "checkEs5Strict", true);
        setBooleanField(term24432, term24432.getClass(), "checkCaja", false);
        setBooleanField(term24432, term24432.getClass(), "foldConstants", false);
        setBooleanField(term24432, term24432.getClass(), "removeConstantExpressions", false);
        setBooleanField(term24432, term24432.getClass(), "deadAssignmentElimination", false);
        setBooleanField(term24432, term24432.getClass(), "inlineConstantVars", false);
        setBooleanField(term24432, term24432.getClass(), "inlineFunctions", true);
        setBooleanField(term24432, term24432.getClass(), "decomposeExpressions", true);
        setBooleanField(term24432, term24432.getClass(), "inlineAnonymousFunctionExpressions", false);
        setBooleanField(term24432, term24432.getClass(), "inlineLocalFunctions", false);
        setBooleanField(term24432, term24432.getClass(), "crossModuleCodeMotion", false);
        setBooleanField(term24432, term24432.getClass(), "coalesceVariableNames", false);
        setBooleanField(term24432, term24432.getClass(), "crossModuleMethodMotion", false);
        setBooleanField(term24432, term24432.getClass(), "inlineGetters", false);
        setBooleanField(term24432, term24432.getClass(), "inlineVariables", false);
        setBooleanField(term24432, term24432.getClass(), "inlineLocalVariables", true);
        setBooleanField(term24432, term24432.getClass(), "flowSensitiveInlineVariables", true);
        setBooleanField(term24432, term24432.getClass(), "smartNameRemoval", false);
        setBooleanField(term24432, term24432.getClass(), "removeDeadCode", true);
        setField(term24432, term24432.getClass(), "checkUnreachableCode", enum163);
        setField(term24432, term24432.getClass(), "checkMissingReturn", enum163);
        setBooleanField(term24432, term24432.getClass(), "extractPrototypeMemberDeclarations", true);
        setBooleanField(term24432, term24432.getClass(), "removeEmptyFunctions", true);
        setBooleanField(term24432, term24432.getClass(), "removeUnusedPrototypeProperties", false);
        setBooleanField(term24432, term24432.getClass(), "removeUnusedPrototypePropertiesInExterns", true);
        setBooleanField(term24432, term24432.getClass(), "removeUnusedVars", true);
        setBooleanField(term24432, term24432.getClass(), "removeUnusedVarsInGlobalScope", true);
        setBooleanField(term24432, term24432.getClass(), "aliasExternals", true);
        setField(term24432, term24432.getClass(), "aliasableGlobals", "zNdorvdUgu");
        setField(term24432, term24432.getClass(), "unaliasableGlobals", "oPxuZbkYio");
        setBooleanField(term24432, term24432.getClass(), "collapseVariableDeclarations", false);
        setBooleanField(term24432, term24432.getClass(), "groupVariableDeclarations", true);
        setBooleanField(term24432, term24432.getClass(), "collapseAnonymousFunctions", true);
        setField(term24432, term24432.getClass(), "aliasableStrings", term24546);
        setField(term24432, term24432.getClass(), "aliasStringsBlacklist", "");
        setBooleanField(term24432, term24432.getClass(), "aliasAllStrings", false);
        setBooleanField(term24432, term24432.getClass(), "outputJsStringUsage", false);
        setBooleanField(term24432, term24432.getClass(), "convertToDottedProperties", true);
        setBooleanField(term24432, term24432.getClass(), "rewriteFunctionExpressions", true);
        setBooleanField(term24432, term24432.getClass(), "optimizeParameters", true);
        setBooleanField(term24432, term24432.getClass(), "optimizeArgumentsArray", false);
        setBooleanField(term24432, term24432.getClass(), "chainCalls", true);
        setField(term24432, term24432.getClass(), "variableRenaming", enum166);
        setField(term24432, term24432.getClass(), "propertyRenaming", enum167);
        setBooleanField(term24432, term24432.getClass(), "labelRenaming", true);
        setBooleanField(term24432, term24432.getClass(), "reserveRawExports", true);
        setBooleanField(term24432, term24432.getClass(), "generatePseudoNames", false);
        setField(term24432, term24432.getClass(), "renamePrefix", "vKitydDVnM");
        setBooleanField(term24432, term24432.getClass(), "aliasKeywords", true);
        setBooleanField(term24432, term24432.getClass(), "collapseProperties", false);
        setBooleanField(term24432, term24432.getClass(), "collapsePropertiesOnExternTypes", true);
        setBooleanField(term24432, term24432.getClass(), "devirtualizePrototypeMethods", false);
        setBooleanField(term24432, term24432.getClass(), "computeFunctionSideEffects", false);
        setField(term24432, term24432.getClass(), "debugFunctionSideEffectsPath", "urCiQnUFBM");
        setBooleanField(term24432, term24432.getClass(), "disambiguateProperties", true);
        setBooleanField(term24432, term24432.getClass(), "ambiguateProperties", false);
        setField(term24432, term24432.getClass(), "anonymousFunctionNaming", enum168);
        setByteElement(term24611, 0, (byte) 35);
        setByteElement(term24611, 1, (byte) 66);
        setByteElement(term24611, 2, (byte) 123);
        setByteElement(term24611, 3, (byte) -5);
        setByteElement(term24611, 4, (byte) 84);
        setByteElement(term24611, 5, (byte) -97);
        setByteElement(term24611, 6, (byte) -24);
        setField(term24432, term24432.getClass(), "inputVariableMapSerialized", term24611);
        setByteElement(term24619, 0, (byte) 88);
        setByteElement(term24619, 1, (byte) 96);
        setByteElement(term24619, 2, (byte) 70);
        setField(term24432, term24432.getClass(), "inputPropertyMapSerialized", term24619);
        setBooleanField(term24432, term24432.getClass(), "exportTestFunctions", false);
        setBooleanField(term24432, term24432.getClass(), "runtimeTypeCheck", true);
        setField(term24432, term24432.getClass(), "runtimeTypeCheckLogFunction", "EKjQdtKxAM");
        setField(term24432, term24432.getClass(), "codingConvention", null);
        setBooleanField(term24432, term24432.getClass(), "instrumentForCoverage", false);
        setBooleanField(term24432, term24432.getClass(), "instrumentForCoverageOnly", false);
        setBooleanField(term24432, term24432.getClass(), "ignoreCajaProperties", true);
        setField(term24432, term24432.getClass(), "syntheticBlockStartMarker", "TXZAIPQJHt");
        setField(term24432, term24432.getClass(), "syntheticBlockEndMarker", "DIbeDHICho");
        setField(term24432, term24432.getClass(), "locale", "dJGPlmSRnz");
        setBooleanField(term24432, term24432.getClass(), "markAsCompiled", true);
        setBooleanField(term24432, term24432.getClass(), "removeTryCatchFinally", false);
        setBooleanField(term24432, term24432.getClass(), "closurePass", true);
        setBooleanField(term24432, term24432.getClass(), "rewriteNewDateGoogNow", true);
        setBooleanField(term24432, term24432.getClass(), "removeAbstractMethods", true);
        setBooleanField(term24432, term24432.getClass(), "gatherCssNames", false);
        setField(term24432, term24432.getClass(), "stripTypes", term24546);
        setField(term24432, term24432.getClass(), "stripNameSuffixes", term24546);
        setField(term24432, term24432.getClass(), "stripNamePrefixes", term24546);
        setField(term24432, term24432.getClass(), "stripTypePrefixes", term24546);
        setField(term24432, term24432.getClass(), "customPasses", null);
        setBooleanField(term24432, term24432.getClass(), "markNoSideEffectCalls", false);
        setField(term24432, term24432.getClass(), "defineReplacements", term24683);
        setBooleanField(term24432, term24432.getClass(), "moveFunctionDeclarations", true);
        setField(term24432, term24432.getClass(), "instrumentationTemplate", "DPskuFUobI");
        setField(term24432, term24432.getClass(), "appNameStr", "");
        setBooleanField(term24432, term24432.getClass(), "recordFunctionInformation", false);
        setBooleanField(term24432, term24432.getClass(), "generateExports", true);
        setField(term24432, term24432.getClass(), "cssRenamingMap", null);
        setBooleanField(term24432, term24432.getClass(), "processObjectPropertyString", true);
        setField(term24432, term24432.getClass(), "idGenerators", term24546);
        setBooleanField(term24432, term24432.getClass(), "prettyPrint", true);
        setBooleanField(term24432, term24432.getClass(), "lineBreak", false);
        setBooleanField(term24432, term24432.getClass(), "printInputDelimiter", true);
        setField(term24432, term24432.getClass(), "inputDelimiter", "// Input %num%");
        setField(term24432, term24432.getClass(), "reportPath", "wBGfLpNNiZ");
        setField(term24432, term24432.getClass(), "tracer", enum169);
        setBooleanField(term24432, term24432.getClass(), "colorizeErrorOutput", false);
        setField(term24432, term24432.getClass(), "errorFormat", enum170);
        setField(term24432, term24432.getClass(), "jsOutputFile", "");
        setField(term24761, term24761.getClass(), "guards", term24762);
        setField(term24432, term24432.getClass(), "warningsGuard", term24761);
        setIntField(term24432, term24432.getClass(), "summaryDetailLevel", 1);
        setField(term24432, term24432.getClass(), "externExportsPath", "yUGCjlqgJE");
        setField(term24432, term24432.getClass(), "nameReferenceReportPath", "PXdVZyoJyC");
        setField(term24432, term24432.getClass(), "nameReferenceGraphPath", "vLerpqavFM");
        setField(term24432, term24432.getClass(), "sourceMapOutputPath", "qnvxzwuGKX");
        setField(term24432, term24432.getClass(), "outputCharset", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[1];
        args[0] = term24432;
        try {
            callMethod(klass, "outputNameMaps", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


