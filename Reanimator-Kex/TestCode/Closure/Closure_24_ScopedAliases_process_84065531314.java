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

public class ScopedAliases_process_84065531314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6503;
     Object term6653;
     Object term8262;
     Object term8264;

    public ScopedAliases_process_84065531314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6503 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term6583 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term6503, term6503.getClass(), "compiler", term6583);
        term6653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6653, term6653.getClass(), "type", 0);
        setField(term6653, term6653.getClass(), "parent", null);
        setField(term6793, term6793.getClass(), "next", null);
        setIntField(term6793, term6793.getClass(), "type", 0);
        setField(term6793, term6793.getClass(), "first", null);
        setField(term6723, term6723.getClass(), "next", term6793);
        setIntField(term6723, term6723.getClass(), "type", 0);
        setField(term6863, term6863.getClass(), "next", null);
        setIntField(term6863, term6863.getClass(), "type", 0);
        setField(term6863, term6863.getClass(), "first", null);
        setField(term6723, term6723.getClass(), "first", term6863);
        setField(term6653, term6653.getClass(), "first", term6723);
        term8262 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term8263 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term8263, term8263.getClass(), "options", null);
        setField(term8263, term8263.getClass(), "passes", null);
        setField(term8263, term8263.getClass(), "externs", null);
        setField(term8263, term8263.getClass(), "modules", null);
        setField(term8263, term8263.getClass(), "moduleGraph", null);
        setField(term8263, term8263.getClass(), "inputs", null);
        setField(term8263, term8263.getClass(), "errorManager", null);
        setField(term8263, term8263.getClass(), "warningsGuard", null);
        setField(term8263, term8263.getClass(), "injectedLibraries", null);
        setField(term8263, term8263.getClass(), "externsRoot", null);
        setField(term8263, term8263.getClass(), "jsRoot", null);
        setField(term8263, term8263.getClass(), "externAndJsRoot", null);
        setField(term8263, term8263.getClass(), "inputsById", null);
        setField(term8263, term8263.getClass(), "sourceMap", null);
        setField(term8263, term8263.getClass(), "externExports", null);
        setIntField(term8263, term8263.getClass(), "uniqueNameId", 0);
        setBooleanField(term8263, term8263.getClass(), "useThreads", false);
        setBooleanField(term8263, term8263.getClass(), "hasRegExpGlobalReferences", false);
        setField(term8263, term8263.getClass(), "functionInformationMap", null);
        setField(term8263, term8263.getClass(), "debugLog", null);
        setField(term8263, term8263.getClass(), "defaultCodingConvention", null);
        setField(term8263, term8263.getClass(), "typeRegistry", null);
        setField(term8263, term8263.getClass(), "parserConfig", null);
        setField(term8263, term8263.getClass(), "abstractInterpreter", null);
        setField(term8263, term8263.getClass(), "typeValidator", null);
        setField(term8263, term8263.getClass(), "tracker", null);
        setField(term8263, term8263.getClass(), "oldErrorReporter", null);
        setField(term8263, term8263.getClass(), "defaultErrorReporter", null);
        setField(term8263, term8263.getClass(), "outStream", null);
        setField(term8263, term8263.getClass(), "globalRefMap", null);
        setDoubleField(term8263, term8263.getClass(), "progress", 0.0);
        setField(term8263, term8263.getClass(), "sanityCheck", null);
        setField(term8263, term8263.getClass(), "currentTracer", null);
        setField(term8263, term8263.getClass(), "currentPassName", null);
        setIntField(term8263, term8263.getClass(), "syntheticCodeId", 0);
        setField(term8263, term8263.getClass(), "recentChange", null);
        setField(term8263, term8263.getClass(), "codeChangeHandlers", null);
        setField(term8263, term8263.getClass(), "synthesizedExternsInput", null);
        setField(term8263, term8263.getClass(), "stage", null);
        setField(term8262, term8262.getClass(), "compiler", term8263);
        setField(term8262, term8262.getClass(), "preprocessorSymbolTable", null);
        setField(term8262, term8262.getClass(), "transformationHandler", null);
        term8264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8264, term8264.getClass(), "type", 0);
        setField(term8264, term8264.getClass(), "next", null);
        setIntField(term8265, term8265.getClass(), "type", 0);
        setIntField(term8266, term8266.getClass(), "type", 0);
        setField(term8266, term8266.getClass(), "next", null);
        setField(term8266, term8266.getClass(), "first", null);
        setField(term8266, term8266.getClass(), "last", null);
        setField(term8266, term8266.getClass(), "propListHead", null);
        setIntField(term8266, term8266.getClass(), "sourcePosition", 0);
        setField(term8266, term8266.getClass(), "jsType", null);
        setField(term8266, term8266.getClass(), "parent", null);
        setField(term8265, term8265.getClass(), "next", term8266);
        setIntField(term8267, term8267.getClass(), "type", 0);
        setField(term8267, term8267.getClass(), "next", null);
        setField(term8267, term8267.getClass(), "first", null);
        setField(term8267, term8267.getClass(), "last", null);
        setField(term8267, term8267.getClass(), "propListHead", null);
        setIntField(term8267, term8267.getClass(), "sourcePosition", 0);
        setField(term8267, term8267.getClass(), "jsType", null);
        setField(term8267, term8267.getClass(), "parent", null);
        setField(term8265, term8265.getClass(), "first", term8267);
        setField(term8265, term8265.getClass(), "last", null);
        setField(term8265, term8265.getClass(), "propListHead", null);
        setIntField(term8265, term8265.getClass(), "sourcePosition", 0);
        setField(term8265, term8265.getClass(), "jsType", null);
        setField(term8265, term8265.getClass(), "parent", null);
        setField(term8264, term8264.getClass(), "first", term8265);
        setField(term8264, term8264.getClass(), "last", null);
        setField(term8264, term8264.getClass(), "propListHead", null);
        setIntField(term8264, term8264.getClass(), "sourcePosition", 0);
        setField(term8264, term8264.getClass(), "jsType", null);
        setField(term8264, term8264.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term6653;
        callMethod(klass, "process", argTypes, term6503, args);
        assertTrue(recursiveEquals(term6503, term8262));
        assertTrue(recursiveEquals(term6653, null));
    }

};


