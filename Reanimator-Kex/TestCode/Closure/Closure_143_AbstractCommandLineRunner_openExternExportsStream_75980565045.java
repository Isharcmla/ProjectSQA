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

public class AbstractCommandLineRunner_openExternExportsStream_75980565045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15732;

    public AbstractCommandLineRunner_openExternExportsStream_75980565045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74719 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term74718 = ((Class) term74719).getDeclaredField((String) "OFF");
        ((Field) term74718).setAccessible(true);
        Object enum135 = ((Field) term74718).get((Object) null);
        Class<? extends Object> term74995 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term74994 = ((Class) term74995).getDeclaredField((String) "OFF");
        ((Field) term74994).setAccessible(true);
        Object enum136 = ((Field) term74994).get((Object) null);
        Class<? extends Object> term75206 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term75205 = ((Class) term75206).getDeclaredField((String) "ERROR");
        ((Field) term75205).setAccessible(true);
        Object enum137 = ((Field) term75205).get((Object) null);
        Class<? extends Object> term75423 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term75422 = ((Class) term75423).getDeclaredField((String) "WARNING");
        ((Field) term75422).setAccessible(true);
        Object enum138 = ((Field) term75422).get((Object) null);
        Class<? extends Object> term75676 = Class.forName((String) "com.google.javascript.jscomp.VariableRenamingPolicy");
        Field term75675 = ((Class) term75676).getDeclaredField((String) "OFF");
        ((Field) term75675).setAccessible(true);
        Object enum139 = ((Field) term75675).get((Object) null);
        Class<? extends Object> term75947 = Class.forName((String) "com.google.javascript.jscomp.PropertyRenamingPolicy");
        Field term75946 = ((Class) term75947).getDeclaredField((String) "OFF");
        ((Field) term75946).setAccessible(true);
        Object enum140 = ((Field) term75946).get((Object) null);
        Class<? extends Object> term76238 = Class.forName((String) "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy");
        Field term76237 = ((Class) term76238).getDeclaredField((String) "OFF");
        ((Field) term76237).setAccessible(true);
        Object enum141 = ((Field) term76237).get((Object) null);
        HashMap term15987 = new HashMap();
        Class<? extends Object> term76632 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term76631 = ((Class) term76632).getDeclaredField((String) "OFF");
        ((Field) term76631).setAccessible(true);
        Object enum142 = ((Field) term76631).get((Object) null);
        Class<? extends Object> term76923 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term76922 = ((Class) term76923).getDeclaredField((String) "SINGLELINE");
        ((Field) term76922).setAccessible(true);
        Object enum143 = ((Field) term76922).get((Object) null);
        ArrayList term16066 = new ArrayList();
        term15732 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term15846 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        byte[] term15911 = (byte[]) newByteArray(5);
        byte[] term15917 = (byte[]) newByteArray(9);
        Object term16065 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setBooleanField(term15732, term15732.getClass(), "ideMode", true);
        setBooleanField(term15732, term15732.getClass(), "skipAllPasses", false);
        setBooleanField(term15732, term15732.getClass(), "nameAnonymousFunctionsOnly", true);
        setField(term15732, term15732.getClass(), "devMode", enum135);
        setBooleanField(term15732, term15732.getClass(), "checkSymbols", false);
        setField(term15732, term15732.getClass(), "checkShadowVars", enum136);
        setField(term15732, term15732.getClass(), "aggressiveVarCheck", enum136);
        setField(term15732, term15732.getClass(), "checkFunctions", enum136);
        setField(term15732, term15732.getClass(), "checkMethods", enum136);
        setBooleanField(term15732, term15732.getClass(), "checkDuplicateMessages", true);
        setBooleanField(term15732, term15732.getClass(), "allowLegacyJsMessages", true);
        setBooleanField(term15732, term15732.getClass(), "strictMessageReplacement", false);
        setBooleanField(term15732, term15732.getClass(), "checkSuspiciousCode", false);
        setBooleanField(term15732, term15732.getClass(), "checkControlStructures", true);
        setField(term15732, term15732.getClass(), "checkUndefinedProperties", enum136);
        setBooleanField(term15732, term15732.getClass(), "checkUnusedPropertiesEarly", false);
        setBooleanField(term15732, term15732.getClass(), "checkTypes", false);
        setBooleanField(term15732, term15732.getClass(), "tightenTypes", true);
        setBooleanField(term15732, term15732.getClass(), "inferTypesInGlobalScope", false);
        setBooleanField(term15732, term15732.getClass(), "checkTypedPropertyCalls", false);
        setField(term15732, term15732.getClass(), "reportMissingOverride", enum136);
        setField(term15732, term15732.getClass(), "reportUnknownTypes", enum136);
        setField(term15732, term15732.getClass(), "checkRequires", enum136);
        setField(term15732, term15732.getClass(), "checkProvides", enum136);
        setField(term15732, term15732.getClass(), "checkGlobalNamesLevel", enum136);
        setField(term15732, term15732.getClass(), "brokenClosureRequiresLevel", enum137);
        setField(term15732, term15732.getClass(), "checkGlobalThisLevel", enum138);
        setField(term15732, term15732.getClass(), "checkMissingGetCssNameLevel", enum136);
        setField(term15732, term15732.getClass(), "checkMissingGetCssNameBlacklist", "IpQuOGMgmj");
        setBooleanField(term15732, term15732.getClass(), "checkEs5Strict", false);
        setBooleanField(term15732, term15732.getClass(), "checkCaja", false);
        setBooleanField(term15732, term15732.getClass(), "foldConstants", false);
        setBooleanField(term15732, term15732.getClass(), "removeConstantExpressions", false);
        setBooleanField(term15732, term15732.getClass(), "deadAssignmentElimination", true);
        setBooleanField(term15732, term15732.getClass(), "inlineConstantVars", false);
        setBooleanField(term15732, term15732.getClass(), "inlineFunctions", true);
        setBooleanField(term15732, term15732.getClass(), "decomposeExpressions", true);
        setBooleanField(term15732, term15732.getClass(), "inlineAnonymousFunctionExpressions", false);
        setBooleanField(term15732, term15732.getClass(), "inlineLocalFunctions", false);
        setBooleanField(term15732, term15732.getClass(), "crossModuleCodeMotion", true);
        setBooleanField(term15732, term15732.getClass(), "coalesceVariableNames", true);
        setBooleanField(term15732, term15732.getClass(), "crossModuleMethodMotion", true);
        setBooleanField(term15732, term15732.getClass(), "inlineGetters", true);
        setBooleanField(term15732, term15732.getClass(), "inlineVariables", false);
        setBooleanField(term15732, term15732.getClass(), "inlineLocalVariables", false);
        setBooleanField(term15732, term15732.getClass(), "flowSensitiveInlineVariables", false);
        setBooleanField(term15732, term15732.getClass(), "smartNameRemoval", true);
        setBooleanField(term15732, term15732.getClass(), "removeDeadCode", true);
        setField(term15732, term15732.getClass(), "checkUnreachableCode", enum136);
        setField(term15732, term15732.getClass(), "checkMissingReturn", enum136);
        setBooleanField(term15732, term15732.getClass(), "extractPrototypeMemberDeclarations", false);
        setBooleanField(term15732, term15732.getClass(), "removeEmptyFunctions", true);
        setBooleanField(term15732, term15732.getClass(), "removeUnusedPrototypeProperties", true);
        setBooleanField(term15732, term15732.getClass(), "removeUnusedPrototypePropertiesInExterns", false);
        setBooleanField(term15732, term15732.getClass(), "removeUnusedVars", false);
        setBooleanField(term15732, term15732.getClass(), "removeUnusedVarsInGlobalScope", true);
        setBooleanField(term15732, term15732.getClass(), "aliasExternals", false);
        setField(term15732, term15732.getClass(), "aliasableGlobals", "pJbnHTYrxn");
        setField(term15732, term15732.getClass(), "unaliasableGlobals", "iIRsCSYqXH");
        setBooleanField(term15732, term15732.getClass(), "collapseVariableDeclarations", true);
        setBooleanField(term15732, term15732.getClass(), "groupVariableDeclarations", false);
        setBooleanField(term15732, term15732.getClass(), "collapseAnonymousFunctions", false);
        setField(term15732, term15732.getClass(), "aliasableStrings", term15846);
        setField(term15732, term15732.getClass(), "aliasStringsBlacklist", "");
        setBooleanField(term15732, term15732.getClass(), "aliasAllStrings", true);
        setBooleanField(term15732, term15732.getClass(), "outputJsStringUsage", true);
        setBooleanField(term15732, term15732.getClass(), "convertToDottedProperties", false);
        setBooleanField(term15732, term15732.getClass(), "rewriteFunctionExpressions", false);
        setBooleanField(term15732, term15732.getClass(), "optimizeParameters", false);
        setBooleanField(term15732, term15732.getClass(), "optimizeArgumentsArray", false);
        setBooleanField(term15732, term15732.getClass(), "chainCalls", false);
        setField(term15732, term15732.getClass(), "variableRenaming", enum139);
        setField(term15732, term15732.getClass(), "propertyRenaming", enum140);
        setBooleanField(term15732, term15732.getClass(), "labelRenaming", true);
        setBooleanField(term15732, term15732.getClass(), "reserveRawExports", false);
        setBooleanField(term15732, term15732.getClass(), "generatePseudoNames", true);
        setField(term15732, term15732.getClass(), "renamePrefix", "nghfqDXyCG");
        setBooleanField(term15732, term15732.getClass(), "aliasKeywords", false);
        setBooleanField(term15732, term15732.getClass(), "collapseProperties", false);
        setBooleanField(term15732, term15732.getClass(), "collapsePropertiesOnExternTypes", true);
        setBooleanField(term15732, term15732.getClass(), "devirtualizePrototypeMethods", true);
        setBooleanField(term15732, term15732.getClass(), "computeFunctionSideEffects", false);
        setField(term15732, term15732.getClass(), "debugFunctionSideEffectsPath", "WBAOTqErtm");
        setBooleanField(term15732, term15732.getClass(), "disambiguateProperties", true);
        setBooleanField(term15732, term15732.getClass(), "ambiguateProperties", false);
        setField(term15732, term15732.getClass(), "anonymousFunctionNaming", enum141);
        setByteElement(term15911, 0, (byte) 66);
        setByteElement(term15911, 1, (byte) -121);
        setByteElement(term15911, 2, (byte) -119);
        setByteElement(term15911, 3, (byte) 71);
        setByteElement(term15911, 4, (byte) 80);
        setField(term15732, term15732.getClass(), "inputVariableMapSerialized", term15911);
        setByteElement(term15917, 0, (byte) 42);
        setByteElement(term15917, 1, (byte) 72);
        setByteElement(term15917, 2, (byte) 111);
        setByteElement(term15917, 3, (byte) 99);
        setByteElement(term15917, 4, (byte) -12);
        setByteElement(term15917, 5, (byte) -61);
        setByteElement(term15917, 6, (byte) -85);
        setByteElement(term15917, 7, (byte) -22);
        setByteElement(term15917, 8, (byte) 93);
        setField(term15732, term15732.getClass(), "inputPropertyMapSerialized", term15917);
        setBooleanField(term15732, term15732.getClass(), "exportTestFunctions", true);
        setBooleanField(term15732, term15732.getClass(), "runtimeTypeCheck", false);
        setField(term15732, term15732.getClass(), "runtimeTypeCheckLogFunction", "PqtVXXZMqK");
        setField(term15732, term15732.getClass(), "codingConvention", null);
        setBooleanField(term15732, term15732.getClass(), "instrumentForCoverage", false);
        setBooleanField(term15732, term15732.getClass(), "instrumentForCoverageOnly", true);
        setBooleanField(term15732, term15732.getClass(), "ignoreCajaProperties", true);
        setField(term15732, term15732.getClass(), "syntheticBlockStartMarker", "rYbtIDVdnd");
        setField(term15732, term15732.getClass(), "syntheticBlockEndMarker", "UKAReurpHG");
        setField(term15732, term15732.getClass(), "locale", "WVRMUmrljA");
        setBooleanField(term15732, term15732.getClass(), "markAsCompiled", true);
        setBooleanField(term15732, term15732.getClass(), "removeTryCatchFinally", false);
        setBooleanField(term15732, term15732.getClass(), "closurePass", false);
        setBooleanField(term15732, term15732.getClass(), "rewriteNewDateGoogNow", true);
        setBooleanField(term15732, term15732.getClass(), "removeAbstractMethods", true);
        setBooleanField(term15732, term15732.getClass(), "gatherCssNames", true);
        setField(term15732, term15732.getClass(), "stripTypes", term15846);
        setField(term15732, term15732.getClass(), "stripNameSuffixes", term15846);
        setField(term15732, term15732.getClass(), "stripNamePrefixes", term15846);
        setField(term15732, term15732.getClass(), "stripTypePrefixes", term15846);
        setField(term15732, term15732.getClass(), "customPasses", null);
        setBooleanField(term15732, term15732.getClass(), "markNoSideEffectCalls", true);
        setField(term15732, term15732.getClass(), "defineReplacements", term15987);
        setBooleanField(term15732, term15732.getClass(), "moveFunctionDeclarations", false);
        setField(term15732, term15732.getClass(), "instrumentationTemplate", "NTlKJDDWlk");
        setField(term15732, term15732.getClass(), "appNameStr", "");
        setBooleanField(term15732, term15732.getClass(), "recordFunctionInformation", true);
        setBooleanField(term15732, term15732.getClass(), "generateExports", false);
        setField(term15732, term15732.getClass(), "cssRenamingMap", null);
        setBooleanField(term15732, term15732.getClass(), "processObjectPropertyString", true);
        setField(term15732, term15732.getClass(), "idGenerators", term15846);
        setBooleanField(term15732, term15732.getClass(), "prettyPrint", false);
        setBooleanField(term15732, term15732.getClass(), "lineBreak", false);
        setBooleanField(term15732, term15732.getClass(), "printInputDelimiter", false);
        setField(term15732, term15732.getClass(), "inputDelimiter", "// Input %num%");
        setField(term15732, term15732.getClass(), "reportPath", "vOuMEpOQAg");
        setField(term15732, term15732.getClass(), "tracer", enum142);
        setBooleanField(term15732, term15732.getClass(), "colorizeErrorOutput", true);
        setField(term15732, term15732.getClass(), "errorFormat", enum143);
        setField(term15732, term15732.getClass(), "jsOutputFile", "");
        setField(term16065, term16065.getClass(), "guards", term16066);
        setField(term15732, term15732.getClass(), "warningsGuard", term16065);
        setIntField(term15732, term15732.getClass(), "summaryDetailLevel", 1);
        setField(term15732, term15732.getClass(), "externExportsPath", "SIODFGaQhr");
        setField(term15732, term15732.getClass(), "nameReferenceReportPath", "qYzsiuXOgS");
        setField(term15732, term15732.getClass(), "nameReferenceGraphPath", "bxrCBbrrct");
        setField(term15732, term15732.getClass(), "sourceMapOutputPath", "CKWpJaaaxX");
        setField(term15732, term15732.getClass(), "outputCharset", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term15732;
        args[1] = "UBRmXJmfrt";
        try {
            callMethod(klass, "openExternExportsStream", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


