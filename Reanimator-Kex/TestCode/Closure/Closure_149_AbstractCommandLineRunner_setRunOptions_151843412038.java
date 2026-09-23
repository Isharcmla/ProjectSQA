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

public class AbstractCommandLineRunner_setRunOptions_151843412038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3232;

    public AbstractCommandLineRunner_setRunOptions_151843412038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37842 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term37841 = ((Class) term37842).getDeclaredField((String) "OFF");
        ((Field) term37841).setAccessible(true);
        Object enum100 = ((Field) term37841).get((Object) null);
        Class<? extends Object> term38118 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term38117 = ((Class) term38118).getDeclaredField((String) "OFF");
        ((Field) term38117).setAccessible(true);
        Object enum101 = ((Field) term38117).get((Object) null);
        Class<? extends Object> term38329 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term38328 = ((Class) term38329).getDeclaredField((String) "ERROR");
        ((Field) term38328).setAccessible(true);
        Object enum102 = ((Field) term38328).get((Object) null);
        Class<? extends Object> term38576 = Class.forName((String) "com.google.javascript.jscomp.VariableRenamingPolicy");
        Field term38575 = ((Class) term38576).getDeclaredField((String) "OFF");
        ((Field) term38575).setAccessible(true);
        Object enum103 = ((Field) term38575).get((Object) null);
        Class<? extends Object> term38847 = Class.forName((String) "com.google.javascript.jscomp.PropertyRenamingPolicy");
        Field term38846 = ((Class) term38847).getDeclaredField((String) "OFF");
        ((Field) term38846).setAccessible(true);
        Object enum104 = ((Field) term38846).get((Object) null);
        Class<? extends Object> term39138 = Class.forName((String) "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy");
        Field term39137 = ((Class) term39138).getDeclaredField((String) "OFF");
        ((Field) term39137).setAccessible(true);
        Object enum105 = ((Field) term39137).get((Object) null);
        HashMap term3468 = new HashMap();
        Class<? extends Object> term39523 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term39522 = ((Class) term39523).getDeclaredField((String) "OFF");
        ((Field) term39522).setAccessible(true);
        Object enum106 = ((Field) term39522).get((Object) null);
        Class<? extends Object> term39814 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term39813 = ((Class) term39814).getDeclaredField((String) "SINGLELINE");
        ((Field) term39813).setAccessible(true);
        Object enum107 = ((Field) term39813).get((Object) null);
        ArrayList term3551 = new ArrayList();
        ((ArrayList) term3551).add((Object)null);
        ((ArrayList) term3551).add((Object)null);
        ((ArrayList) term3551).add((Object)null);
        ((ArrayList) term3551).add((Object)null);
        ((ArrayList) term3551).add((Object)null);
        ((ArrayList) term3551).add((Object)null);
        Class<? extends Object> term40091 = Class.forName((String) "com.google.javascript.jscomp.SourceMap$DetailLevel");
        Field term40090 = ((Class) term40091).getDeclaredField((String) "SYMBOLS");
        ((Field) term40090).setAccessible(true);
        Object enum108 = ((Field) term40090).get((Object) null);
        term3232 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term3336 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        byte[] term3401 = (byte[]) newByteArray(4);
        byte[] term3406 = (byte[]) newByteArray(1);
        Object term3491 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term3550 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setBooleanField(term3232, term3232.getClass(), "ideMode", false);
        setBooleanField(term3232, term3232.getClass(), "skipAllPasses", false);
        setBooleanField(term3232, term3232.getClass(), "nameAnonymousFunctionsOnly", true);
        setField(term3232, term3232.getClass(), "devMode", enum100);
        setBooleanField(term3232, term3232.getClass(), "manageClosureDependencies", false);
        setField(term3232, term3232.getClass(), "messageBundle", null);
        setBooleanField(term3232, term3232.getClass(), "checkSymbols", true);
        setField(term3232, term3232.getClass(), "checkShadowVars", enum101);
        setField(term3232, term3232.getClass(), "aggressiveVarCheck", enum101);
        setField(term3232, term3232.getClass(), "checkFunctions", enum101);
        setField(term3232, term3232.getClass(), "checkMethods", enum101);
        setBooleanField(term3232, term3232.getClass(), "checkDuplicateMessages", false);
        setBooleanField(term3232, term3232.getClass(), "allowLegacyJsMessages", true);
        setBooleanField(term3232, term3232.getClass(), "strictMessageReplacement", false);
        setBooleanField(term3232, term3232.getClass(), "checkSuspiciousCode", false);
        setBooleanField(term3232, term3232.getClass(), "checkControlStructures", true);
        setField(term3232, term3232.getClass(), "checkUndefinedProperties", enum101);
        setBooleanField(term3232, term3232.getClass(), "checkUnusedPropertiesEarly", true);
        setBooleanField(term3232, term3232.getClass(), "checkTypes", true);
        setBooleanField(term3232, term3232.getClass(), "tightenTypes", true);
        setBooleanField(term3232, term3232.getClass(), "inferTypesInGlobalScope", true);
        setBooleanField(term3232, term3232.getClass(), "checkTypedPropertyCalls", false);
        setField(term3232, term3232.getClass(), "reportMissingOverride", enum101);
        setField(term3232, term3232.getClass(), "reportUnknownTypes", enum101);
        setField(term3232, term3232.getClass(), "checkRequires", enum101);
        setField(term3232, term3232.getClass(), "checkProvides", enum101);
        setField(term3232, term3232.getClass(), "checkGlobalNamesLevel", enum101);
        setField(term3232, term3232.getClass(), "brokenClosureRequiresLevel", enum102);
        setField(term3232, term3232.getClass(), "checkGlobalThisLevel", enum101);
        setField(term3232, term3232.getClass(), "checkMissingGetCssNameLevel", enum101);
        setField(term3232, term3232.getClass(), "checkMissingGetCssNameBlacklist", "aJlieCFVtF");
        setBooleanField(term3232, term3232.getClass(), "checkEs5Strict", false);
        setBooleanField(term3232, term3232.getClass(), "checkCaja", true);
        setBooleanField(term3232, term3232.getClass(), "foldConstants", true);
        setBooleanField(term3232, term3232.getClass(), "removeConstantExpressions", true);
        setBooleanField(term3232, term3232.getClass(), "deadAssignmentElimination", false);
        setBooleanField(term3232, term3232.getClass(), "inlineConstantVars", true);
        setBooleanField(term3232, term3232.getClass(), "inlineFunctions", true);
        setBooleanField(term3232, term3232.getClass(), "decomposeExpressions", false);
        setBooleanField(term3232, term3232.getClass(), "inlineAnonymousFunctionExpressions", false);
        setBooleanField(term3232, term3232.getClass(), "inlineLocalFunctions", true);
        setBooleanField(term3232, term3232.getClass(), "crossModuleCodeMotion", true);
        setBooleanField(term3232, term3232.getClass(), "coalesceVariableNames", true);
        setBooleanField(term3232, term3232.getClass(), "crossModuleMethodMotion", false);
        setBooleanField(term3232, term3232.getClass(), "inlineGetters", true);
        setBooleanField(term3232, term3232.getClass(), "inlineVariables", true);
        setBooleanField(term3232, term3232.getClass(), "inlineLocalVariables", true);
        setBooleanField(term3232, term3232.getClass(), "flowSensitiveInlineVariables", false);
        setBooleanField(term3232, term3232.getClass(), "smartNameRemoval", true);
        setBooleanField(term3232, term3232.getClass(), "removeDeadCode", false);
        setField(term3232, term3232.getClass(), "checkUnreachableCode", enum101);
        setField(term3232, term3232.getClass(), "checkMissingReturn", enum101);
        setBooleanField(term3232, term3232.getClass(), "extractPrototypeMemberDeclarations", false);
        setBooleanField(term3232, term3232.getClass(), "removeEmptyFunctions", false);
        setBooleanField(term3232, term3232.getClass(), "removeUnusedPrototypeProperties", true);
        setBooleanField(term3232, term3232.getClass(), "removeUnusedPrototypePropertiesInExterns", true);
        setBooleanField(term3232, term3232.getClass(), "removeUnusedVars", false);
        setBooleanField(term3232, term3232.getClass(), "removeUnusedVarsInGlobalScope", true);
        setBooleanField(term3232, term3232.getClass(), "aliasExternals", false);
        setField(term3232, term3232.getClass(), "aliasableGlobals", "ZiaGIbnzTs");
        setField(term3232, term3232.getClass(), "unaliasableGlobals", "tbcdzjIfER");
        setBooleanField(term3232, term3232.getClass(), "collapseVariableDeclarations", false);
        setBooleanField(term3232, term3232.getClass(), "groupVariableDeclarations", false);
        setBooleanField(term3232, term3232.getClass(), "collapseAnonymousFunctions", false);
        setField(term3232, term3232.getClass(), "aliasableStrings", term3336);
        setField(term3232, term3232.getClass(), "aliasStringsBlacklist", "");
        setBooleanField(term3232, term3232.getClass(), "aliasAllStrings", false);
        setBooleanField(term3232, term3232.getClass(), "outputJsStringUsage", false);
        setBooleanField(term3232, term3232.getClass(), "convertToDottedProperties", false);
        setBooleanField(term3232, term3232.getClass(), "rewriteFunctionExpressions", true);
        setBooleanField(term3232, term3232.getClass(), "optimizeParameters", false);
        setBooleanField(term3232, term3232.getClass(), "optimizeArgumentsArray", false);
        setBooleanField(term3232, term3232.getClass(), "chainCalls", true);
        setField(term3232, term3232.getClass(), "variableRenaming", enum103);
        setField(term3232, term3232.getClass(), "propertyRenaming", enum104);
        setBooleanField(term3232, term3232.getClass(), "labelRenaming", true);
        setBooleanField(term3232, term3232.getClass(), "reserveRawExports", false);
        setBooleanField(term3232, term3232.getClass(), "generatePseudoNames", false);
        setField(term3232, term3232.getClass(), "renamePrefix", "HyxfbSQYBe");
        setBooleanField(term3232, term3232.getClass(), "aliasKeywords", true);
        setBooleanField(term3232, term3232.getClass(), "collapseProperties", false);
        setBooleanField(term3232, term3232.getClass(), "collapsePropertiesOnExternTypes", true);
        setBooleanField(term3232, term3232.getClass(), "devirtualizePrototypeMethods", false);
        setBooleanField(term3232, term3232.getClass(), "computeFunctionSideEffects", false);
        setField(term3232, term3232.getClass(), "debugFunctionSideEffectsPath", "pCTimMblYc");
        setBooleanField(term3232, term3232.getClass(), "disambiguateProperties", true);
        setBooleanField(term3232, term3232.getClass(), "ambiguateProperties", true);
        setField(term3232, term3232.getClass(), "anonymousFunctionNaming", enum105);
        setByteElement(term3401, 0, (byte) 79);
        setByteElement(term3401, 1, (byte) -119);
        setByteElement(term3401, 2, (byte) -66);
        setByteElement(term3401, 3, (byte) 83);
        setField(term3232, term3232.getClass(), "inputVariableMapSerialized", term3401);
        setByteElement(term3406, 0, (byte) 74);
        setField(term3232, term3232.getClass(), "inputPropertyMapSerialized", term3406);
        setBooleanField(term3232, term3232.getClass(), "exportTestFunctions", true);
        setBooleanField(term3232, term3232.getClass(), "runtimeTypeCheck", false);
        setField(term3232, term3232.getClass(), "runtimeTypeCheckLogFunction", "hNxWaHcfhY");
        setField(term3232, term3232.getClass(), "codingConvention", null);
        setBooleanField(term3232, term3232.getClass(), "instrumentForCoverage", true);
        setBooleanField(term3232, term3232.getClass(), "instrumentForCoverageOnly", false);
        setBooleanField(term3232, term3232.getClass(), "ignoreCajaProperties", false);
        setField(term3232, term3232.getClass(), "syntheticBlockStartMarker", "RkybSrpybU");
        setField(term3232, term3232.getClass(), "syntheticBlockEndMarker", "xOEqzGAmDU");
        setField(term3232, term3232.getClass(), "locale", "eZFUvlxvGV");
        setBooleanField(term3232, term3232.getClass(), "markAsCompiled", true);
        setBooleanField(term3232, term3232.getClass(), "removeTryCatchFinally", false);
        setBooleanField(term3232, term3232.getClass(), "closurePass", false);
        setBooleanField(term3232, term3232.getClass(), "rewriteNewDateGoogNow", true);
        setBooleanField(term3232, term3232.getClass(), "removeAbstractMethods", true);
        setBooleanField(term3232, term3232.getClass(), "gatherCssNames", false);
        setField(term3232, term3232.getClass(), "stripTypes", term3336);
        setField(term3232, term3232.getClass(), "stripNameSuffixes", term3336);
        setField(term3232, term3232.getClass(), "stripNamePrefixes", term3336);
        setField(term3232, term3232.getClass(), "stripTypePrefixes", term3336);
        setField(term3232, term3232.getClass(), "customPasses", null);
        setBooleanField(term3232, term3232.getClass(), "markNoSideEffectCalls", true);
        setField(term3232, term3232.getClass(), "defineReplacements", term3468);
        setBooleanField(term3232, term3232.getClass(), "moveFunctionDeclarations", true);
        setField(term3232, term3232.getClass(), "instrumentationTemplate", "BYqFIqCKAV");
        setField(term3232, term3232.getClass(), "appNameStr", "");
        setBooleanField(term3232, term3232.getClass(), "recordFunctionInformation", false);
        setBooleanField(term3232, term3232.getClass(), "generateExports", true);
        setField(term3232, term3232.getClass(), "cssRenamingMap", null);
        setBooleanField(term3232, term3232.getClass(), "processObjectPropertyString", true);
        setField(term3232, term3232.getClass(), "idGenerators", term3336);
        setIntField(term3491, term3491.getClass(), "modCount", 0);
        setField(term3232, term3232.getClass(), "replaceStringsFunctionDescriptions", term3491);
        setField(term3232, term3232.getClass(), "replaceStringsPlaceholderToken", "");
        setBooleanField(term3232, term3232.getClass(), "prettyPrint", false);
        setBooleanField(term3232, term3232.getClass(), "lineBreak", false);
        setBooleanField(term3232, term3232.getClass(), "printInputDelimiter", false);
        setField(term3232, term3232.getClass(), "inputDelimiter", "// Input %num%");
        setField(term3232, term3232.getClass(), "reportPath", "vrQLuWIDJX");
        setField(term3232, term3232.getClass(), "tracer", enum106);
        setBooleanField(term3232, term3232.getClass(), "colorizeErrorOutput", true);
        setField(term3232, term3232.getClass(), "errorFormat", enum107);
        setField(term3232, term3232.getClass(), "jsOutputFile", "");
        setField(term3550, term3550.getClass(), "guards", term3551);
        setField(term3232, term3232.getClass(), "warningsGuard", term3550);
        setIntField(term3232, term3232.getClass(), "summaryDetailLevel", 1);
        setBooleanField(term3232, term3232.getClass(), "externExports", false);
        setField(term3232, term3232.getClass(), "externExportsPath", "flxyYxBRtu");
        setField(term3232, term3232.getClass(), "nameReferenceReportPath", "OclPbYPkcH");
        setField(term3232, term3232.getClass(), "nameReferenceGraphPath", "IoAlmYsBwc");
        setField(term3232, term3232.getClass(), "sourceMapOutputPath", "TEParAifyi");
        setField(term3232, term3232.getClass(), "sourceMapDetailLevel", enum108);
        setField(term3232, term3232.getClass(), "outputCharset", null);
        setBooleanField(term3232, term3232.getClass(), "looseTypes", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[1];
        args[0] = term3232;
        try {
            callMethod(klass, "setRunOptions", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


