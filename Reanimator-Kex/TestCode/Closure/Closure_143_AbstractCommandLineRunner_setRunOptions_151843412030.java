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

public class AbstractCommandLineRunner_setRunOptions_151843412030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3152;

    public AbstractCommandLineRunner_setRunOptions_151843412030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33923 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term33922 = ((Class) term33923).getDeclaredField((String) "OFF");
        ((Field) term33922).setAccessible(true);
        Object enum99 = ((Field) term33922).get((Object) null);
        Class<? extends Object> term34199 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term34198 = ((Class) term34199).getDeclaredField((String) "OFF");
        ((Field) term34198).setAccessible(true);
        Object enum100 = ((Field) term34198).get((Object) null);
        Class<? extends Object> term34410 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term34409 = ((Class) term34410).getDeclaredField((String) "ERROR");
        ((Field) term34409).setAccessible(true);
        Object enum101 = ((Field) term34409).get((Object) null);
        Class<? extends Object> term34627 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term34626 = ((Class) term34627).getDeclaredField((String) "WARNING");
        ((Field) term34626).setAccessible(true);
        Object enum102 = ((Field) term34626).get((Object) null);
        Class<? extends Object> term34880 = Class.forName((String) "com.google.javascript.jscomp.VariableRenamingPolicy");
        Field term34879 = ((Class) term34880).getDeclaredField((String) "OFF");
        ((Field) term34879).setAccessible(true);
        Object enum103 = ((Field) term34879).get((Object) null);
        Class<? extends Object> term35151 = Class.forName((String) "com.google.javascript.jscomp.PropertyRenamingPolicy");
        Field term35150 = ((Class) term35151).getDeclaredField((String) "OFF");
        ((Field) term35150).setAccessible(true);
        Object enum104 = ((Field) term35150).get((Object) null);
        Class<? extends Object> term35442 = Class.forName((String) "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy");
        Field term35441 = ((Class) term35442).getDeclaredField((String) "OFF");
        ((Field) term35441).setAccessible(true);
        Object enum105 = ((Field) term35441).get((Object) null);
        HashMap term3398 = new HashMap();
        Class<? extends Object> term35827 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term35826 = ((Class) term35827).getDeclaredField((String) "OFF");
        ((Field) term35826).setAccessible(true);
        Object enum106 = ((Field) term35826).get((Object) null);
        Class<? extends Object> term36118 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term36117 = ((Class) term36118).getDeclaredField((String) "SINGLELINE");
        ((Field) term36117).setAccessible(true);
        Object enum107 = ((Field) term36117).get((Object) null);
        ArrayList term3477 = new ArrayList();
        ((ArrayList) term3477).add((Object)null);
        ((ArrayList) term3477).add((Object)null);
        ((ArrayList) term3477).add((Object)null);
        ((ArrayList) term3477).add((Object)null);
        ((ArrayList) term3477).add((Object)null);
        ((ArrayList) term3477).add((Object)null);
        term3152 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term3266 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        byte[] term3331 = (byte[]) newByteArray(4);
        byte[] term3336 = (byte[]) newByteArray(1);
        Object term3476 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setBooleanField(term3152, term3152.getClass(), "ideMode", false);
        setBooleanField(term3152, term3152.getClass(), "skipAllPasses", false);
        setBooleanField(term3152, term3152.getClass(), "nameAnonymousFunctionsOnly", true);
        setField(term3152, term3152.getClass(), "devMode", enum99);
        setBooleanField(term3152, term3152.getClass(), "checkSymbols", false);
        setField(term3152, term3152.getClass(), "checkShadowVars", enum100);
        setField(term3152, term3152.getClass(), "aggressiveVarCheck", enum100);
        setField(term3152, term3152.getClass(), "checkFunctions", enum100);
        setField(term3152, term3152.getClass(), "checkMethods", enum100);
        setBooleanField(term3152, term3152.getClass(), "checkDuplicateMessages", false);
        setBooleanField(term3152, term3152.getClass(), "allowLegacyJsMessages", true);
        setBooleanField(term3152, term3152.getClass(), "strictMessageReplacement", false);
        setBooleanField(term3152, term3152.getClass(), "checkSuspiciousCode", true);
        setBooleanField(term3152, term3152.getClass(), "checkControlStructures", false);
        setField(term3152, term3152.getClass(), "checkUndefinedProperties", enum100);
        setBooleanField(term3152, term3152.getClass(), "checkUnusedPropertiesEarly", true);
        setBooleanField(term3152, term3152.getClass(), "checkTypes", false);
        setBooleanField(term3152, term3152.getClass(), "tightenTypes", false);
        setBooleanField(term3152, term3152.getClass(), "inferTypesInGlobalScope", true);
        setBooleanField(term3152, term3152.getClass(), "checkTypedPropertyCalls", true);
        setField(term3152, term3152.getClass(), "reportMissingOverride", enum100);
        setField(term3152, term3152.getClass(), "reportUnknownTypes", enum100);
        setField(term3152, term3152.getClass(), "checkRequires", enum100);
        setField(term3152, term3152.getClass(), "checkProvides", enum100);
        setField(term3152, term3152.getClass(), "checkGlobalNamesLevel", enum100);
        setField(term3152, term3152.getClass(), "brokenClosureRequiresLevel", enum101);
        setField(term3152, term3152.getClass(), "checkGlobalThisLevel", enum102);
        setField(term3152, term3152.getClass(), "checkMissingGetCssNameLevel", enum100);
        setField(term3152, term3152.getClass(), "checkMissingGetCssNameBlacklist", "aJlieCFVtF");
        setBooleanField(term3152, term3152.getClass(), "checkEs5Strict", true);
        setBooleanField(term3152, term3152.getClass(), "checkCaja", true);
        setBooleanField(term3152, term3152.getClass(), "foldConstants", true);
        setBooleanField(term3152, term3152.getClass(), "removeConstantExpressions", false);
        setBooleanField(term3152, term3152.getClass(), "deadAssignmentElimination", false);
        setBooleanField(term3152, term3152.getClass(), "inlineConstantVars", true);
        setBooleanField(term3152, term3152.getClass(), "inlineFunctions", true);
        setBooleanField(term3152, term3152.getClass(), "decomposeExpressions", true);
        setBooleanField(term3152, term3152.getClass(), "inlineAnonymousFunctionExpressions", false);
        setBooleanField(term3152, term3152.getClass(), "inlineLocalFunctions", true);
        setBooleanField(term3152, term3152.getClass(), "crossModuleCodeMotion", true);
        setBooleanField(term3152, term3152.getClass(), "coalesceVariableNames", false);
        setBooleanField(term3152, term3152.getClass(), "crossModuleMethodMotion", false);
        setBooleanField(term3152, term3152.getClass(), "inlineGetters", true);
        setBooleanField(term3152, term3152.getClass(), "inlineVariables", true);
        setBooleanField(term3152, term3152.getClass(), "inlineLocalVariables", true);
        setBooleanField(term3152, term3152.getClass(), "flowSensitiveInlineVariables", false);
        setBooleanField(term3152, term3152.getClass(), "smartNameRemoval", true);
        setBooleanField(term3152, term3152.getClass(), "removeDeadCode", true);
        setField(term3152, term3152.getClass(), "checkUnreachableCode", enum100);
        setField(term3152, term3152.getClass(), "checkMissingReturn", enum100);
        setBooleanField(term3152, term3152.getClass(), "extractPrototypeMemberDeclarations", true);
        setBooleanField(term3152, term3152.getClass(), "removeEmptyFunctions", false);
        setBooleanField(term3152, term3152.getClass(), "removeUnusedPrototypeProperties", true);
        setBooleanField(term3152, term3152.getClass(), "removeUnusedPrototypePropertiesInExterns", false);
        setBooleanField(term3152, term3152.getClass(), "removeUnusedVars", false);
        setBooleanField(term3152, term3152.getClass(), "removeUnusedVarsInGlobalScope", true);
        setBooleanField(term3152, term3152.getClass(), "aliasExternals", false);
        setField(term3152, term3152.getClass(), "aliasableGlobals", "ZiaGIbnzTs");
        setField(term3152, term3152.getClass(), "unaliasableGlobals", "tbcdzjIfER");
        setBooleanField(term3152, term3152.getClass(), "collapseVariableDeclarations", true);
        setBooleanField(term3152, term3152.getClass(), "groupVariableDeclarations", true);
        setBooleanField(term3152, term3152.getClass(), "collapseAnonymousFunctions", false);
        setField(term3152, term3152.getClass(), "aliasableStrings", term3266);
        setField(term3152, term3152.getClass(), "aliasStringsBlacklist", "");
        setBooleanField(term3152, term3152.getClass(), "aliasAllStrings", false);
        setBooleanField(term3152, term3152.getClass(), "outputJsStringUsage", false);
        setBooleanField(term3152, term3152.getClass(), "convertToDottedProperties", false);
        setBooleanField(term3152, term3152.getClass(), "rewriteFunctionExpressions", false);
        setBooleanField(term3152, term3152.getClass(), "optimizeParameters", false);
        setBooleanField(term3152, term3152.getClass(), "optimizeArgumentsArray", false);
        setBooleanField(term3152, term3152.getClass(), "chainCalls", false);
        setField(term3152, term3152.getClass(), "variableRenaming", enum103);
        setField(term3152, term3152.getClass(), "propertyRenaming", enum104);
        setBooleanField(term3152, term3152.getClass(), "labelRenaming", true);
        setBooleanField(term3152, term3152.getClass(), "reserveRawExports", false);
        setBooleanField(term3152, term3152.getClass(), "generatePseudoNames", false);
        setField(term3152, term3152.getClass(), "renamePrefix", "HyxfbSQYBe");
        setBooleanField(term3152, term3152.getClass(), "aliasKeywords", true);
        setBooleanField(term3152, term3152.getClass(), "collapseProperties", true);
        setBooleanField(term3152, term3152.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term3152, term3152.getClass(), "devirtualizePrototypeMethods", false);
        setBooleanField(term3152, term3152.getClass(), "computeFunctionSideEffects", true);
        setField(term3152, term3152.getClass(), "debugFunctionSideEffectsPath", "pCTimMblYc");
        setBooleanField(term3152, term3152.getClass(), "disambiguateProperties", false);
        setBooleanField(term3152, term3152.getClass(), "ambiguateProperties", true);
        setField(term3152, term3152.getClass(), "anonymousFunctionNaming", enum105);
        setByteElement(term3331, 0, (byte) 79);
        setByteElement(term3331, 1, (byte) -119);
        setByteElement(term3331, 2, (byte) -66);
        setByteElement(term3331, 3, (byte) 83);
        setField(term3152, term3152.getClass(), "inputVariableMapSerialized", term3331);
        setByteElement(term3336, 0, (byte) 74);
        setField(term3152, term3152.getClass(), "inputPropertyMapSerialized", term3336);
        setBooleanField(term3152, term3152.getClass(), "exportTestFunctions", false);
        setBooleanField(term3152, term3152.getClass(), "runtimeTypeCheck", false);
        setField(term3152, term3152.getClass(), "runtimeTypeCheckLogFunction", "hNxWaHcfhY");
        setField(term3152, term3152.getClass(), "codingConvention", null);
        setBooleanField(term3152, term3152.getClass(), "instrumentForCoverage", true);
        setBooleanField(term3152, term3152.getClass(), "instrumentForCoverageOnly", true);
        setBooleanField(term3152, term3152.getClass(), "ignoreCajaProperties", true);
        setField(term3152, term3152.getClass(), "syntheticBlockStartMarker", "RkybSrpybU");
        setField(term3152, term3152.getClass(), "syntheticBlockEndMarker", "xOEqzGAmDU");
        setField(term3152, term3152.getClass(), "locale", "eZFUvlxvGV");
        setBooleanField(term3152, term3152.getClass(), "markAsCompiled", false);
        setBooleanField(term3152, term3152.getClass(), "removeTryCatchFinally", true);
        setBooleanField(term3152, term3152.getClass(), "closurePass", false);
        setBooleanField(term3152, term3152.getClass(), "rewriteNewDateGoogNow", true);
        setBooleanField(term3152, term3152.getClass(), "removeAbstractMethods", true);
        setBooleanField(term3152, term3152.getClass(), "gatherCssNames", false);
        setField(term3152, term3152.getClass(), "stripTypes", term3266);
        setField(term3152, term3152.getClass(), "stripNameSuffixes", term3266);
        setField(term3152, term3152.getClass(), "stripNamePrefixes", term3266);
        setField(term3152, term3152.getClass(), "stripTypePrefixes", term3266);
        setField(term3152, term3152.getClass(), "customPasses", null);
        setBooleanField(term3152, term3152.getClass(), "markNoSideEffectCalls", true);
        setField(term3152, term3152.getClass(), "defineReplacements", term3398);
        setBooleanField(term3152, term3152.getClass(), "moveFunctionDeclarations", false);
        setField(term3152, term3152.getClass(), "instrumentationTemplate", "BYqFIqCKAV");
        setField(term3152, term3152.getClass(), "appNameStr", "");
        setBooleanField(term3152, term3152.getClass(), "recordFunctionInformation", false);
        setBooleanField(term3152, term3152.getClass(), "generateExports", false);
        setField(term3152, term3152.getClass(), "cssRenamingMap", null);
        setBooleanField(term3152, term3152.getClass(), "processObjectPropertyString", true);
        setField(term3152, term3152.getClass(), "idGenerators", term3266);
        setBooleanField(term3152, term3152.getClass(), "prettyPrint", true);
        setBooleanField(term3152, term3152.getClass(), "lineBreak", false);
        setBooleanField(term3152, term3152.getClass(), "printInputDelimiter", true);
        setField(term3152, term3152.getClass(), "inputDelimiter", "// Input %num%");
        setField(term3152, term3152.getClass(), "reportPath", "vrQLuWIDJX");
        setField(term3152, term3152.getClass(), "tracer", enum106);
        setBooleanField(term3152, term3152.getClass(), "colorizeErrorOutput", true);
        setField(term3152, term3152.getClass(), "errorFormat", enum107);
        setField(term3152, term3152.getClass(), "jsOutputFile", "");
        setField(term3476, term3476.getClass(), "guards", term3477);
        setField(term3152, term3152.getClass(), "warningsGuard", term3476);
        setIntField(term3152, term3152.getClass(), "summaryDetailLevel", 1);
        setField(term3152, term3152.getClass(), "externExportsPath", "flxyYxBRtu");
        setField(term3152, term3152.getClass(), "nameReferenceReportPath", "OclPbYPkcH");
        setField(term3152, term3152.getClass(), "nameReferenceGraphPath", "IoAlmYsBwc");
        setField(term3152, term3152.getClass(), "sourceMapOutputPath", "TEParAifyi");
        setField(term3152, term3152.getClass(), "outputCharset", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[1];
        args[0] = term3152;
        try {
            callMethod(klass, "setRunOptions", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


