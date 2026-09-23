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

public class CompilerOptions_addWarningsGuard_12385137744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29657;

    public CompilerOptions_addWarningsGuard_12385137744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term147400 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term147399 = ((Class) term147400).getDeclaredField((String) "OFF");
        ((Field) term147399).setAccessible(true);
        Object enum461 = ((Field) term147399).get((Object) null);
        Class<? extends Object> term147676 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term147675 = ((Class) term147676).getDeclaredField((String) "OFF");
        ((Field) term147675).setAccessible(true);
        Object enum462 = ((Field) term147675).get((Object) null);
        Class<? extends Object> term147887 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term147886 = ((Class) term147887).getDeclaredField((String) "ERROR");
        ((Field) term147886).setAccessible(true);
        Object enum463 = ((Field) term147886).get((Object) null);
        Class<? extends Object> term148134 = Class.forName((String) "com.google.javascript.jscomp.VariableRenamingPolicy");
        Field term148133 = ((Class) term148134).getDeclaredField((String) "OFF");
        ((Field) term148133).setAccessible(true);
        Object enum464 = ((Field) term148133).get((Object) null);
        Class<? extends Object> term148405 = Class.forName((String) "com.google.javascript.jscomp.PropertyRenamingPolicy");
        Field term148404 = ((Class) term148405).getDeclaredField((String) "OFF");
        ((Field) term148404).setAccessible(true);
        Object enum465 = ((Field) term148404).get((Object) null);
        Class<? extends Object> term148696 = Class.forName((String) "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy");
        Field term148695 = ((Class) term148696).getDeclaredField((String) "OFF");
        ((Field) term148695).setAccessible(true);
        Object enum466 = ((Field) term148695).get((Object) null);
        HashMap term29890 = new HashMap();
        Class<? extends Object> term149486 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term149485 = ((Class) term149486).getDeclaredField((String) "OFF");
        ((Field) term149485).setAccessible(true);
        Object enum467 = ((Field) term149485).get((Object) null);
        Class<? extends Object> term149777 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term149776 = ((Class) term149777).getDeclaredField((String) "SINGLELINE");
        ((Field) term149776).setAccessible(true);
        Object enum468 = ((Field) term149776).get((Object) null);
        ArrayList term29973 = new ArrayList();
        ((ArrayList) term29973).add((Object)null);
        ((ArrayList) term29973).add((Object)null);
        ((ArrayList) term29973).add((Object)null);
        ((ArrayList) term29973).add((Object)null);
        ((ArrayList) term29973).add((Object)null);
        ((ArrayList) term29973).add((Object)null);
        ((ArrayList) term29973).add((Object)null);
        Class<? extends Object> term150054 = Class.forName((String) "com.google.javascript.jscomp.SourceMap$DetailLevel");
        Field term150053 = ((Class) term150054).getDeclaredField((String) "SYMBOLS");
        ((Field) term150053).setAccessible(true);
        Object enum469 = ((Field) term150053).get((Object) null);
        term29657 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term29761 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        byte[] term29826 = (byte[]) newByteArray(0);
        byte[] term29827 = (byte[]) newByteArray(2);
        Object term29913 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term29972 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setBooleanField(term29657, term29657.getClass(), "ideMode", false);
        setBooleanField(term29657, term29657.getClass(), "skipAllPasses", true);
        setBooleanField(term29657, term29657.getClass(), "nameAnonymousFunctionsOnly", false);
        setField(term29657, term29657.getClass(), "devMode", enum461);
        setBooleanField(term29657, term29657.getClass(), "manageClosureDependencies", true);
        setField(term29657, term29657.getClass(), "messageBundle", null);
        setBooleanField(term29657, term29657.getClass(), "checkSymbols", true);
        setField(term29657, term29657.getClass(), "checkShadowVars", enum462);
        setField(term29657, term29657.getClass(), "aggressiveVarCheck", enum462);
        setField(term29657, term29657.getClass(), "checkFunctions", enum462);
        setField(term29657, term29657.getClass(), "checkMethods", enum462);
        setBooleanField(term29657, term29657.getClass(), "checkDuplicateMessages", true);
        setBooleanField(term29657, term29657.getClass(), "allowLegacyJsMessages", true);
        setBooleanField(term29657, term29657.getClass(), "strictMessageReplacement", false);
        setBooleanField(term29657, term29657.getClass(), "checkSuspiciousCode", false);
        setBooleanField(term29657, term29657.getClass(), "checkControlStructures", false);
        setField(term29657, term29657.getClass(), "checkUndefinedProperties", enum462);
        setBooleanField(term29657, term29657.getClass(), "checkUnusedPropertiesEarly", false);
        setBooleanField(term29657, term29657.getClass(), "checkTypes", true);
        setBooleanField(term29657, term29657.getClass(), "tightenTypes", false);
        setBooleanField(term29657, term29657.getClass(), "inferTypesInGlobalScope", false);
        setBooleanField(term29657, term29657.getClass(), "checkTypedPropertyCalls", true);
        setField(term29657, term29657.getClass(), "reportMissingOverride", enum462);
        setField(term29657, term29657.getClass(), "reportUnknownTypes", enum462);
        setField(term29657, term29657.getClass(), "checkRequires", enum462);
        setField(term29657, term29657.getClass(), "checkProvides", enum462);
        setField(term29657, term29657.getClass(), "checkGlobalNamesLevel", enum462);
        setField(term29657, term29657.getClass(), "brokenClosureRequiresLevel", enum463);
        setField(term29657, term29657.getClass(), "checkGlobalThisLevel", enum462);
        setField(term29657, term29657.getClass(), "checkMissingGetCssNameLevel", enum462);
        setField(term29657, term29657.getClass(), "checkMissingGetCssNameBlacklist", "jXzmYyrnnT");
        setBooleanField(term29657, term29657.getClass(), "checkEs5Strict", true);
        setBooleanField(term29657, term29657.getClass(), "checkCaja", false);
        setBooleanField(term29657, term29657.getClass(), "foldConstants", true);
        setBooleanField(term29657, term29657.getClass(), "removeConstantExpressions", true);
        setBooleanField(term29657, term29657.getClass(), "deadAssignmentElimination", false);
        setBooleanField(term29657, term29657.getClass(), "inlineConstantVars", true);
        setBooleanField(term29657, term29657.getClass(), "inlineFunctions", false);
        setBooleanField(term29657, term29657.getClass(), "decomposeExpressions", true);
        setBooleanField(term29657, term29657.getClass(), "inlineAnonymousFunctionExpressions", true);
        setBooleanField(term29657, term29657.getClass(), "inlineLocalFunctions", false);
        setBooleanField(term29657, term29657.getClass(), "crossModuleCodeMotion", false);
        setBooleanField(term29657, term29657.getClass(), "coalesceVariableNames", true);
        setBooleanField(term29657, term29657.getClass(), "crossModuleMethodMotion", false);
        setBooleanField(term29657, term29657.getClass(), "inlineGetters", false);
        setBooleanField(term29657, term29657.getClass(), "inlineVariables", true);
        setBooleanField(term29657, term29657.getClass(), "inlineLocalVariables", false);
        setBooleanField(term29657, term29657.getClass(), "flowSensitiveInlineVariables", true);
        setBooleanField(term29657, term29657.getClass(), "smartNameRemoval", true);
        setBooleanField(term29657, term29657.getClass(), "removeDeadCode", false);
        setField(term29657, term29657.getClass(), "checkUnreachableCode", enum462);
        setField(term29657, term29657.getClass(), "checkMissingReturn", enum462);
        setBooleanField(term29657, term29657.getClass(), "extractPrototypeMemberDeclarations", true);
        setBooleanField(term29657, term29657.getClass(), "removeEmptyFunctions", false);
        setBooleanField(term29657, term29657.getClass(), "removeUnusedPrototypeProperties", false);
        setBooleanField(term29657, term29657.getClass(), "removeUnusedPrototypePropertiesInExterns", false);
        setBooleanField(term29657, term29657.getClass(), "removeUnusedVars", true);
        setBooleanField(term29657, term29657.getClass(), "removeUnusedVarsInGlobalScope", true);
        setBooleanField(term29657, term29657.getClass(), "aliasExternals", true);
        setField(term29657, term29657.getClass(), "aliasableGlobals", "igCAtimmYB");
        setField(term29657, term29657.getClass(), "unaliasableGlobals", "DyiXbeYIaN");
        setBooleanField(term29657, term29657.getClass(), "collapseVariableDeclarations", false);
        setBooleanField(term29657, term29657.getClass(), "groupVariableDeclarations", true);
        setBooleanField(term29657, term29657.getClass(), "collapseAnonymousFunctions", false);
        setField(term29657, term29657.getClass(), "aliasableStrings", term29761);
        setField(term29657, term29657.getClass(), "aliasStringsBlacklist", "");
        setBooleanField(term29657, term29657.getClass(), "aliasAllStrings", false);
        setBooleanField(term29657, term29657.getClass(), "outputJsStringUsage", false);
        setBooleanField(term29657, term29657.getClass(), "convertToDottedProperties", false);
        setBooleanField(term29657, term29657.getClass(), "rewriteFunctionExpressions", false);
        setBooleanField(term29657, term29657.getClass(), "optimizeParameters", true);
        setBooleanField(term29657, term29657.getClass(), "optimizeArgumentsArray", true);
        setBooleanField(term29657, term29657.getClass(), "chainCalls", true);
        setField(term29657, term29657.getClass(), "variableRenaming", enum464);
        setField(term29657, term29657.getClass(), "propertyRenaming", enum465);
        setBooleanField(term29657, term29657.getClass(), "labelRenaming", false);
        setBooleanField(term29657, term29657.getClass(), "reserveRawExports", true);
        setBooleanField(term29657, term29657.getClass(), "generatePseudoNames", true);
        setField(term29657, term29657.getClass(), "renamePrefix", "VGizxZnyHX");
        setBooleanField(term29657, term29657.getClass(), "aliasKeywords", true);
        setBooleanField(term29657, term29657.getClass(), "collapseProperties", false);
        setBooleanField(term29657, term29657.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term29657, term29657.getClass(), "devirtualizePrototypeMethods", true);
        setBooleanField(term29657, term29657.getClass(), "computeFunctionSideEffects", true);
        setField(term29657, term29657.getClass(), "debugFunctionSideEffectsPath", "kVEZMHmRtR");
        setBooleanField(term29657, term29657.getClass(), "disambiguateProperties", false);
        setBooleanField(term29657, term29657.getClass(), "ambiguateProperties", false);
        setField(term29657, term29657.getClass(), "anonymousFunctionNaming", enum466);
        setField(term29657, term29657.getClass(), "inputVariableMapSerialized", term29826);
        setByteElement(term29827, 0, (byte) 14);
        setByteElement(term29827, 1, (byte) -101);
        setField(term29657, term29657.getClass(), "inputPropertyMapSerialized", term29827);
        setBooleanField(term29657, term29657.getClass(), "exportTestFunctions", false);
        setBooleanField(term29657, term29657.getClass(), "runtimeTypeCheck", false);
        setField(term29657, term29657.getClass(), "runtimeTypeCheckLogFunction", "ekxGuOYIwi");
        setField(term29657, term29657.getClass(), "codingConvention", null);
        setBooleanField(term29657, term29657.getClass(), "instrumentForCoverage", false);
        setBooleanField(term29657, term29657.getClass(), "instrumentForCoverageOnly", false);
        setBooleanField(term29657, term29657.getClass(), "ignoreCajaProperties", false);
        setField(term29657, term29657.getClass(), "syntheticBlockStartMarker", "RbVQXSpxXy");
        setField(term29657, term29657.getClass(), "syntheticBlockEndMarker", "YpJbIgJWWv");
        setField(term29657, term29657.getClass(), "locale", "JppkknKVOw");
        setBooleanField(term29657, term29657.getClass(), "markAsCompiled", true);
        setBooleanField(term29657, term29657.getClass(), "removeTryCatchFinally", true);
        setBooleanField(term29657, term29657.getClass(), "closurePass", false);
        setBooleanField(term29657, term29657.getClass(), "rewriteNewDateGoogNow", true);
        setBooleanField(term29657, term29657.getClass(), "removeAbstractMethods", true);
        setBooleanField(term29657, term29657.getClass(), "gatherCssNames", true);
        setField(term29657, term29657.getClass(), "stripTypes", term29761);
        setField(term29657, term29657.getClass(), "stripNameSuffixes", term29761);
        setField(term29657, term29657.getClass(), "stripNamePrefixes", term29761);
        setField(term29657, term29657.getClass(), "stripTypePrefixes", term29761);
        setField(term29657, term29657.getClass(), "customPasses", null);
        setBooleanField(term29657, term29657.getClass(), "markNoSideEffectCalls", false);
        setField(term29657, term29657.getClass(), "defineReplacements", term29890);
        setBooleanField(term29657, term29657.getClass(), "moveFunctionDeclarations", false);
        setField(term29657, term29657.getClass(), "instrumentationTemplate", "iljANwuEjk");
        setField(term29657, term29657.getClass(), "appNameStr", "");
        setBooleanField(term29657, term29657.getClass(), "recordFunctionInformation", false);
        setBooleanField(term29657, term29657.getClass(), "generateExports", true);
        setField(term29657, term29657.getClass(), "cssRenamingMap", null);
        setBooleanField(term29657, term29657.getClass(), "processObjectPropertyString", false);
        setField(term29657, term29657.getClass(), "idGenerators", term29761);
        setIntField(term29913, term29913.getClass(), "modCount", 0);
        setField(term29657, term29657.getClass(), "replaceStringsFunctionDescriptions", term29913);
        setField(term29657, term29657.getClass(), "replaceStringsPlaceholderToken", "");
        setBooleanField(term29657, term29657.getClass(), "prettyPrint", false);
        setBooleanField(term29657, term29657.getClass(), "lineBreak", false);
        setBooleanField(term29657, term29657.getClass(), "printInputDelimiter", false);
        setField(term29657, term29657.getClass(), "inputDelimiter", "// Input %num%");
        setField(term29657, term29657.getClass(), "reportPath", "kNqaJKIATy");
        setField(term29657, term29657.getClass(), "tracer", enum467);
        setBooleanField(term29657, term29657.getClass(), "colorizeErrorOutput", false);
        setField(term29657, term29657.getClass(), "errorFormat", enum468);
        setField(term29657, term29657.getClass(), "jsOutputFile", "");
        setField(term29972, term29972.getClass(), "guards", term29973);
        setField(term29657, term29657.getClass(), "warningsGuard", term29972);
        setIntField(term29657, term29657.getClass(), "summaryDetailLevel", 1);
        setBooleanField(term29657, term29657.getClass(), "externExports", false);
        setField(term29657, term29657.getClass(), "externExportsPath", "vKQukfbJUd");
        setField(term29657, term29657.getClass(), "nameReferenceReportPath", "lFRJFUMVbx");
        setField(term29657, term29657.getClass(), "nameReferenceGraphPath", "sZdUNdggUW");
        setField(term29657, term29657.getClass(), "sourceMapOutputPath", "OqbwYQfvAe");
        setField(term29657, term29657.getClass(), "sourceMapDetailLevel", enum469);
        setField(term29657, term29657.getClass(), "outputCharset", null);
        setBooleanField(term29657, term29657.getClass(), "looseTypes", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.WarningsGuard");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "addWarningsGuard", argTypes, term29657, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


