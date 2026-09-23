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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class DisambiguateProperties_init_90568078051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12190;
     Object term12250;
     Object term13101;
     Object term13110;
     Object term13111;

    public DisambiguateProperties_init_90568078051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11836 = new HashMap();
        HashMap term12110 = new HashMap();
        Object term11788 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term11916 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term12062 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem"));
        setField(term11788, term11788.getClass(), "properties", term11836);
        setField(term11788, term11788.getClass(), "compiler", term11916);
        setField(term11788, term11788.getClass(), "typeSystem", term12062);
        setField(term11788, term11788.getClass(), "propertiesToErrorFor", term12110);
        term12190 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term12250 = new LinkedHashMap();
        ((LinkedHashMap) term12250).put((Object)null, (Object)null);
        ((LinkedHashMap) term12250).put((Object)null, (Object)null);
        ((LinkedHashMap) term12250).put((Object)null, (Object)null);
        ((LinkedHashMap) term12250).put((Object)null, (Object)null);
        ((LinkedHashMap) term12250).put((Object)null, (Object)null);
        LinkedHashMap term13105 = new LinkedHashMap();
        LinkedHashMap term13106 = new LinkedHashMap();
        HashMap term13109 = new HashMap();
        term13101 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term13102 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term13103 = newInstance(Class.forName("com.google.common.collect.LinkedHashMultimap"));
        Object term13104 = newInstance(Class.forName("com.google.common.collect.LinkedHashMultimap$ValueEntry"));
        setField(term13102, term13102.getClass(), "options", null);
        setField(term13102, term13102.getClass(), "passes", null);
        setField(term13102, term13102.getClass(), "externs", null);
        setField(term13102, term13102.getClass(), "modules", null);
        setField(term13102, term13102.getClass(), "moduleGraph", null);
        setField(term13102, term13102.getClass(), "inputs", null);
        setField(term13102, term13102.getClass(), "errorManager", null);
        setField(term13102, term13102.getClass(), "warningsGuard", null);
        setField(term13102, term13102.getClass(), "injectedLibraries", null);
        setField(term13102, term13102.getClass(), "externsRoot", null);
        setField(term13102, term13102.getClass(), "jsRoot", null);
        setField(term13102, term13102.getClass(), "externAndJsRoot", null);
        setField(term13102, term13102.getClass(), "inputsById", null);
        setField(term13102, term13102.getClass(), "sourceMap", null);
        setField(term13102, term13102.getClass(), "externExports", null);
        setIntField(term13102, term13102.getClass(), "uniqueNameId", 0);
        setBooleanField(term13102, term13102.getClass(), "hasRegExpGlobalReferences", false);
        setField(term13102, term13102.getClass(), "functionInformationMap", null);
        setField(term13102, term13102.getClass(), "debugLog", null);
        setField(term13102, term13102.getClass(), "defaultCodingConvention", null);
        setField(term13102, term13102.getClass(), "typeRegistry", null);
        setField(term13102, term13102.getClass(), "parserConfig", null);
        setField(term13102, term13102.getClass(), "abstractInterpreter", null);
        setField(term13102, term13102.getClass(), "typeValidator", null);
        setField(term13102, term13102.getClass(), "phaseOptimizer", null);
        setField(term13102, term13102.getClass(), "tracker", null);
        setField(term13102, term13102.getClass(), "oldErrorReporter", null);
        setField(term13102, term13102.getClass(), "defaultErrorReporter", null);
        setField(term13102, term13102.getClass(), "compilerThread", null);
        setBooleanField(term13102, term13102.getClass(), "useThreads", false);
        setField(term13102, term13102.getClass(), "outStream", null);
        setField(term13102, term13102.getClass(), "globalRefMap", null);
        setDoubleField(term13102, term13102.getClass(), "progress", 0.0);
        setField(term13102, term13102.getClass(), "lastPassName", null);
        setField(term13102, term13102.getClass(), "sanityCheck", null);
        setField(term13102, term13102.getClass(), "currentTracer", null);
        setField(term13102, term13102.getClass(), "currentPassName", null);
        setIntField(term13102, term13102.getClass(), "syntheticCodeId", 0);
        setField(term13102, term13102.getClass(), "recentChange", null);
        setField(term13102, term13102.getClass(), "codeChangeHandlers", null);
        setField(term13102, term13102.getClass(), "synthesizedExternsInput", null);
        setField(term13102, term13102.getClass(), "stage", null);
        setBooleanField(term13102, term13102.getClass(), "analyzeChangedScopesOnly", false);
        setField(term13101, term13101.getClass(), "compiler", term13102);
        setField(term13101, term13101.getClass(), "typeSystem", null);
        setIntField(term13103, term13103.getClass(), "valueSetCapacity", 2);
        setField(term13104, term13104.getClass(), "key", null);
        setField(term13104, term13104.getClass(), "value", null);
        setIntField(term13104, term13104.getClass(), "valueHash", 0);
        setField(term13104, term13104.getClass(), "nextInValueSetHashRow", null);
        setField(term13104, term13104.getClass(), "predecessorInValueSet", null);
        setField(term13104, term13104.getClass(), "successorInValueSet", null);
        setField(term13104, term13104.getClass(), "predecessorInMultimap", term13104);
        setField(term13104, term13104.getClass(), "successorInMultimap", term13104);
        setField(term13103, term13103.getClass(), "multimapHeaderEntry", term13104);
        setField(term13103, term13103.getClass(), "map", term13105);
        setIntField(term13103, term13103.getClass(), "totalSize", 0);
        setField(term13103, term13103.getClass(), "entries", null);
        setField(term13103, term13103.getClass(), "keySet", null);
        setField(term13103, term13103.getClass(), "keys", null);
        setField(term13103, term13103.getClass(), "values", null);
        setField(term13103, term13103.getClass(), "asMap", null);
        setField(term13101, term13101.getClass(), "invalidationMap", term13103);
        setField(term13101, term13101.getClass(), "propertiesToErrorFor", term13106);
        setField(term13101, term13101.getClass(), "properties", term13109);
        term13110 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term13110, term13110.getClass(), "options", null);
        setField(term13110, term13110.getClass(), "passes", null);
        setField(term13110, term13110.getClass(), "externs", null);
        setField(term13110, term13110.getClass(), "modules", null);
        setField(term13110, term13110.getClass(), "moduleGraph", null);
        setField(term13110, term13110.getClass(), "inputs", null);
        setField(term13110, term13110.getClass(), "errorManager", null);
        setField(term13110, term13110.getClass(), "warningsGuard", null);
        setField(term13110, term13110.getClass(), "injectedLibraries", null);
        setField(term13110, term13110.getClass(), "externsRoot", null);
        setField(term13110, term13110.getClass(), "jsRoot", null);
        setField(term13110, term13110.getClass(), "externAndJsRoot", null);
        setField(term13110, term13110.getClass(), "inputsById", null);
        setField(term13110, term13110.getClass(), "sourceMap", null);
        setField(term13110, term13110.getClass(), "externExports", null);
        setIntField(term13110, term13110.getClass(), "uniqueNameId", 0);
        setBooleanField(term13110, term13110.getClass(), "hasRegExpGlobalReferences", false);
        setField(term13110, term13110.getClass(), "functionInformationMap", null);
        setField(term13110, term13110.getClass(), "debugLog", null);
        setField(term13110, term13110.getClass(), "defaultCodingConvention", null);
        setField(term13110, term13110.getClass(), "typeRegistry", null);
        setField(term13110, term13110.getClass(), "parserConfig", null);
        setField(term13110, term13110.getClass(), "abstractInterpreter", null);
        setField(term13110, term13110.getClass(), "typeValidator", null);
        setField(term13110, term13110.getClass(), "phaseOptimizer", null);
        setField(term13110, term13110.getClass(), "tracker", null);
        setField(term13110, term13110.getClass(), "oldErrorReporter", null);
        setField(term13110, term13110.getClass(), "defaultErrorReporter", null);
        setField(term13110, term13110.getClass(), "compilerThread", null);
        setBooleanField(term13110, term13110.getClass(), "useThreads", false);
        setField(term13110, term13110.getClass(), "outStream", null);
        setField(term13110, term13110.getClass(), "globalRefMap", null);
        setDoubleField(term13110, term13110.getClass(), "progress", 0.0);
        setField(term13110, term13110.getClass(), "lastPassName", null);
        setField(term13110, term13110.getClass(), "sanityCheck", null);
        setField(term13110, term13110.getClass(), "currentTracer", null);
        setField(term13110, term13110.getClass(), "currentPassName", null);
        setIntField(term13110, term13110.getClass(), "syntheticCodeId", 0);
        setField(term13110, term13110.getClass(), "recentChange", null);
        setField(term13110, term13110.getClass(), "codeChangeHandlers", null);
        setField(term13110, term13110.getClass(), "synthesizedExternsInput", null);
        setField(term13110, term13110.getClass(), "stage", null);
        setBooleanField(term13110, term13110.getClass(), "analyzeChangedScopesOnly", false);
        term13111 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.DisambiguateProperties$TypeSystem");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = term12190;
        args[1] = null;
        args[2] = term12250;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13101));
        assertTrue(recursiveEquals(term12190, term13110));
        assertTrue(recursiveEquals(term12250, term13111));
    }

};


