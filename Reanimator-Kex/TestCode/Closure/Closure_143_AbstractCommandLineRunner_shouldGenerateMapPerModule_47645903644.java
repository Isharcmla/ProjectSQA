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

public class AbstractCommandLineRunner_shouldGenerateMapPerModule_47645903644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12874;

    public AbstractCommandLineRunner_shouldGenerateMapPerModule_47645903644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term71997 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term71996 = ((Class) term71997).getDeclaredField((String) "OFF");
        ((Field) term71996).setAccessible(true);
        Object enum126 = ((Field) term71996).get((Object) null);
        Class<? extends Object> term72273 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term72272 = ((Class) term72273).getDeclaredField((String) "OFF");
        ((Field) term72272).setAccessible(true);
        Object enum127 = ((Field) term72272).get((Object) null);
        Class<? extends Object> term72484 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term72483 = ((Class) term72484).getDeclaredField((String) "ERROR");
        ((Field) term72483).setAccessible(true);
        Object enum128 = ((Field) term72483).get((Object) null);
        Class<? extends Object> term72701 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term72700 = ((Class) term72701).getDeclaredField((String) "WARNING");
        ((Field) term72700).setAccessible(true);
        Object enum129 = ((Field) term72700).get((Object) null);
        Class<? extends Object> term72954 = Class.forName((String) "com.google.javascript.jscomp.VariableRenamingPolicy");
        Field term72953 = ((Class) term72954).getDeclaredField((String) "OFF");
        ((Field) term72953).setAccessible(true);
        Object enum130 = ((Field) term72953).get((Object) null);
        Class<? extends Object> term73225 = Class.forName((String) "com.google.javascript.jscomp.PropertyRenamingPolicy");
        Field term73224 = ((Class) term73225).getDeclaredField((String) "OFF");
        ((Field) term73224).setAccessible(true);
        Object enum131 = ((Field) term73224).get((Object) null);
        Class<? extends Object> term73516 = Class.forName((String) "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy");
        Field term73515 = ((Class) term73516).getDeclaredField((String) "OFF");
        ((Field) term73515).setAccessible(true);
        Object enum132 = ((Field) term73515).get((Object) null);
        HashMap term13124 = new HashMap();
        Class<? extends Object> term73905 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term73904 = ((Class) term73905).getDeclaredField((String) "OFF");
        ((Field) term73904).setAccessible(true);
        Object enum133 = ((Field) term73904).get((Object) null);
        Class<? extends Object> term74196 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term74195 = ((Class) term74196).getDeclaredField((String) "SINGLELINE");
        ((Field) term74195).setAccessible(true);
        Object enum134 = ((Field) term74195).get((Object) null);
        ArrayList term13203 = new ArrayList();
        ((ArrayList) term13203).add((Object)null);
        ((ArrayList) term13203).add((Object)null);
        term12874 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term12988 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        byte[] term13053 = (byte[]) newByteArray(8);
        byte[] term13062 = (byte[]) newByteArray(1);
        Object term13202 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setBooleanField(term12874, term12874.getClass(), "ideMode", true);
        setBooleanField(term12874, term12874.getClass(), "skipAllPasses", true);
        setBooleanField(term12874, term12874.getClass(), "nameAnonymousFunctionsOnly", false);
        setField(term12874, term12874.getClass(), "devMode", enum126);
        setBooleanField(term12874, term12874.getClass(), "checkSymbols", true);
        setField(term12874, term12874.getClass(), "checkShadowVars", enum127);
        setField(term12874, term12874.getClass(), "aggressiveVarCheck", enum127);
        setField(term12874, term12874.getClass(), "checkFunctions", enum127);
        setField(term12874, term12874.getClass(), "checkMethods", enum127);
        setBooleanField(term12874, term12874.getClass(), "checkDuplicateMessages", false);
        setBooleanField(term12874, term12874.getClass(), "allowLegacyJsMessages", false);
        setBooleanField(term12874, term12874.getClass(), "strictMessageReplacement", false);
        setBooleanField(term12874, term12874.getClass(), "checkSuspiciousCode", true);
        setBooleanField(term12874, term12874.getClass(), "checkControlStructures", true);
        setField(term12874, term12874.getClass(), "checkUndefinedProperties", enum127);
        setBooleanField(term12874, term12874.getClass(), "checkUnusedPropertiesEarly", false);
        setBooleanField(term12874, term12874.getClass(), "checkTypes", true);
        setBooleanField(term12874, term12874.getClass(), "tightenTypes", true);
        setBooleanField(term12874, term12874.getClass(), "inferTypesInGlobalScope", true);
        setBooleanField(term12874, term12874.getClass(), "checkTypedPropertyCalls", false);
        setField(term12874, term12874.getClass(), "reportMissingOverride", enum127);
        setField(term12874, term12874.getClass(), "reportUnknownTypes", enum127);
        setField(term12874, term12874.getClass(), "checkRequires", enum127);
        setField(term12874, term12874.getClass(), "checkProvides", enum127);
        setField(term12874, term12874.getClass(), "checkGlobalNamesLevel", enum127);
        setField(term12874, term12874.getClass(), "brokenClosureRequiresLevel", enum128);
        setField(term12874, term12874.getClass(), "checkGlobalThisLevel", enum129);
        setField(term12874, term12874.getClass(), "checkMissingGetCssNameLevel", enum127);
        setField(term12874, term12874.getClass(), "checkMissingGetCssNameBlacklist", "wKWbJssZuG");
        setBooleanField(term12874, term12874.getClass(), "checkEs5Strict", true);
        setBooleanField(term12874, term12874.getClass(), "checkCaja", false);
        setBooleanField(term12874, term12874.getClass(), "foldConstants", true);
        setBooleanField(term12874, term12874.getClass(), "removeConstantExpressions", true);
        setBooleanField(term12874, term12874.getClass(), "deadAssignmentElimination", false);
        setBooleanField(term12874, term12874.getClass(), "inlineConstantVars", false);
        setBooleanField(term12874, term12874.getClass(), "inlineFunctions", false);
        setBooleanField(term12874, term12874.getClass(), "decomposeExpressions", false);
        setBooleanField(term12874, term12874.getClass(), "inlineAnonymousFunctionExpressions", true);
        setBooleanField(term12874, term12874.getClass(), "inlineLocalFunctions", true);
        setBooleanField(term12874, term12874.getClass(), "crossModuleCodeMotion", false);
        setBooleanField(term12874, term12874.getClass(), "coalesceVariableNames", true);
        setBooleanField(term12874, term12874.getClass(), "crossModuleMethodMotion", true);
        setBooleanField(term12874, term12874.getClass(), "inlineGetters", true);
        setBooleanField(term12874, term12874.getClass(), "inlineVariables", false);
        setBooleanField(term12874, term12874.getClass(), "inlineLocalVariables", true);
        setBooleanField(term12874, term12874.getClass(), "flowSensitiveInlineVariables", true);
        setBooleanField(term12874, term12874.getClass(), "smartNameRemoval", false);
        setBooleanField(term12874, term12874.getClass(), "removeDeadCode", true);
        setField(term12874, term12874.getClass(), "checkUnreachableCode", enum127);
        setField(term12874, term12874.getClass(), "checkMissingReturn", enum127);
        setBooleanField(term12874, term12874.getClass(), "extractPrototypeMemberDeclarations", false);
        setBooleanField(term12874, term12874.getClass(), "removeEmptyFunctions", true);
        setBooleanField(term12874, term12874.getClass(), "removeUnusedPrototypeProperties", false);
        setBooleanField(term12874, term12874.getClass(), "removeUnusedPrototypePropertiesInExterns", false);
        setBooleanField(term12874, term12874.getClass(), "removeUnusedVars", true);
        setBooleanField(term12874, term12874.getClass(), "removeUnusedVarsInGlobalScope", true);
        setBooleanField(term12874, term12874.getClass(), "aliasExternals", false);
        setField(term12874, term12874.getClass(), "aliasableGlobals", "NzBMMhkhpT");
        setField(term12874, term12874.getClass(), "unaliasableGlobals", "qCpEbQDHdF");
        setBooleanField(term12874, term12874.getClass(), "collapseVariableDeclarations", false);
        setBooleanField(term12874, term12874.getClass(), "groupVariableDeclarations", true);
        setBooleanField(term12874, term12874.getClass(), "collapseAnonymousFunctions", true);
        setField(term12874, term12874.getClass(), "aliasableStrings", term12988);
        setField(term12874, term12874.getClass(), "aliasStringsBlacklist", "");
        setBooleanField(term12874, term12874.getClass(), "aliasAllStrings", true);
        setBooleanField(term12874, term12874.getClass(), "outputJsStringUsage", false);
        setBooleanField(term12874, term12874.getClass(), "convertToDottedProperties", true);
        setBooleanField(term12874, term12874.getClass(), "rewriteFunctionExpressions", true);
        setBooleanField(term12874, term12874.getClass(), "optimizeParameters", true);
        setBooleanField(term12874, term12874.getClass(), "optimizeArgumentsArray", false);
        setBooleanField(term12874, term12874.getClass(), "chainCalls", false);
        setField(term12874, term12874.getClass(), "variableRenaming", enum130);
        setField(term12874, term12874.getClass(), "propertyRenaming", enum131);
        setBooleanField(term12874, term12874.getClass(), "labelRenaming", true);
        setBooleanField(term12874, term12874.getClass(), "reserveRawExports", false);
        setBooleanField(term12874, term12874.getClass(), "generatePseudoNames", false);
        setField(term12874, term12874.getClass(), "renamePrefix", "AHbZyFOmlo");
        setBooleanField(term12874, term12874.getClass(), "aliasKeywords", false);
        setBooleanField(term12874, term12874.getClass(), "collapseProperties", false);
        setBooleanField(term12874, term12874.getClass(), "collapsePropertiesOnExternTypes", true);
        setBooleanField(term12874, term12874.getClass(), "devirtualizePrototypeMethods", true);
        setBooleanField(term12874, term12874.getClass(), "computeFunctionSideEffects", false);
        setField(term12874, term12874.getClass(), "debugFunctionSideEffectsPath", "TwfWVQGiIj");
        setBooleanField(term12874, term12874.getClass(), "disambiguateProperties", false);
        setBooleanField(term12874, term12874.getClass(), "ambiguateProperties", false);
        setField(term12874, term12874.getClass(), "anonymousFunctionNaming", enum132);
        setByteElement(term13053, 0, (byte) -112);
        setByteElement(term13053, 1, (byte) -111);
        setByteElement(term13053, 2, (byte) 23);
        setByteElement(term13053, 3, (byte) -15);
        setByteElement(term13053, 4, (byte) 36);
        setByteElement(term13053, 5, (byte) 118);
        setByteElement(term13053, 6, (byte) 106);
        setByteElement(term13053, 7, (byte) 98);
        setField(term12874, term12874.getClass(), "inputVariableMapSerialized", term13053);
        setByteElement(term13062, 0, (byte) 67);
        setField(term12874, term12874.getClass(), "inputPropertyMapSerialized", term13062);
        setBooleanField(term12874, term12874.getClass(), "exportTestFunctions", false);
        setBooleanField(term12874, term12874.getClass(), "runtimeTypeCheck", false);
        setField(term12874, term12874.getClass(), "runtimeTypeCheckLogFunction", "gUvcueTURF");
        setField(term12874, term12874.getClass(), "codingConvention", null);
        setBooleanField(term12874, term12874.getClass(), "instrumentForCoverage", false);
        setBooleanField(term12874, term12874.getClass(), "instrumentForCoverageOnly", false);
        setBooleanField(term12874, term12874.getClass(), "ignoreCajaProperties", false);
        setField(term12874, term12874.getClass(), "syntheticBlockStartMarker", "EwQBhZjCIT");
        setField(term12874, term12874.getClass(), "syntheticBlockEndMarker", "aSkmSwTnEw");
        setField(term12874, term12874.getClass(), "locale", "xvkbvaEGYd");
        setBooleanField(term12874, term12874.getClass(), "markAsCompiled", true);
        setBooleanField(term12874, term12874.getClass(), "removeTryCatchFinally", true);
        setBooleanField(term12874, term12874.getClass(), "closurePass", true);
        setBooleanField(term12874, term12874.getClass(), "rewriteNewDateGoogNow", true);
        setBooleanField(term12874, term12874.getClass(), "removeAbstractMethods", true);
        setBooleanField(term12874, term12874.getClass(), "gatherCssNames", true);
        setField(term12874, term12874.getClass(), "stripTypes", term12988);
        setField(term12874, term12874.getClass(), "stripNameSuffixes", term12988);
        setField(term12874, term12874.getClass(), "stripNamePrefixes", term12988);
        setField(term12874, term12874.getClass(), "stripTypePrefixes", term12988);
        setField(term12874, term12874.getClass(), "customPasses", null);
        setBooleanField(term12874, term12874.getClass(), "markNoSideEffectCalls", false);
        setField(term12874, term12874.getClass(), "defineReplacements", term13124);
        setBooleanField(term12874, term12874.getClass(), "moveFunctionDeclarations", false);
        setField(term12874, term12874.getClass(), "instrumentationTemplate", "HBGNxdNURv");
        setField(term12874, term12874.getClass(), "appNameStr", "");
        setBooleanField(term12874, term12874.getClass(), "recordFunctionInformation", false);
        setBooleanField(term12874, term12874.getClass(), "generateExports", true);
        setField(term12874, term12874.getClass(), "cssRenamingMap", null);
        setBooleanField(term12874, term12874.getClass(), "processObjectPropertyString", false);
        setField(term12874, term12874.getClass(), "idGenerators", term12988);
        setBooleanField(term12874, term12874.getClass(), "prettyPrint", false);
        setBooleanField(term12874, term12874.getClass(), "lineBreak", false);
        setBooleanField(term12874, term12874.getClass(), "printInputDelimiter", false);
        setField(term12874, term12874.getClass(), "inputDelimiter", "// Input %num%");
        setField(term12874, term12874.getClass(), "reportPath", "mfCpTPPQQm");
        setField(term12874, term12874.getClass(), "tracer", enum133);
        setBooleanField(term12874, term12874.getClass(), "colorizeErrorOutput", true);
        setField(term12874, term12874.getClass(), "errorFormat", enum134);
        setField(term12874, term12874.getClass(), "jsOutputFile", "");
        setField(term13202, term13202.getClass(), "guards", term13203);
        setField(term12874, term12874.getClass(), "warningsGuard", term13202);
        setIntField(term12874, term12874.getClass(), "summaryDetailLevel", 1);
        setField(term12874, term12874.getClass(), "externExportsPath", "OcJCIDNIXA");
        setField(term12874, term12874.getClass(), "nameReferenceReportPath", "XfRABIFVEp");
        setField(term12874, term12874.getClass(), "nameReferenceGraphPath", "MHGKyEnwKc");
        setField(term12874, term12874.getClass(), "sourceMapOutputPath", "ShIELyuULw");
        setField(term12874, term12874.getClass(), "outputCharset", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[1];
        args[0] = term12874;
        try {
            callMethod(klass, "shouldGenerateMapPerModule", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


