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

public class ScopedAliases_process_84065531315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8888;
     Object term9038;
     Object term9929;
     Object term9931;

    public ScopedAliases_process_84065531315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8888 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term8968 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term8888, term8888.getClass(), "compiler", term8968);
        term9038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9038, term9038.getClass(), "type", 0);
        setField(term9038, term9038.getClass(), "parent", null);
        setField(term9178, term9178.getClass(), "next", null);
        setIntField(term9178, term9178.getClass(), "type", 0);
        setField(term9178, term9178.getClass(), "first", null);
        setField(term9108, term9108.getClass(), "next", term9178);
        setIntField(term9108, term9108.getClass(), "type", 0);
        setField(term9248, term9248.getClass(), "next", null);
        setIntField(term9248, term9248.getClass(), "type", 0);
        setField(term9248, term9248.getClass(), "first", null);
        setField(term9108, term9108.getClass(), "first", term9248);
        setField(term9038, term9038.getClass(), "first", term9108);
        term9929 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term9930 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term9930, term9930.getClass(), "options", null);
        setField(term9930, term9930.getClass(), "passes", null);
        setField(term9930, term9930.getClass(), "externs", null);
        setField(term9930, term9930.getClass(), "modules", null);
        setField(term9930, term9930.getClass(), "moduleGraph", null);
        setField(term9930, term9930.getClass(), "inputs", null);
        setField(term9930, term9930.getClass(), "errorManager", null);
        setField(term9930, term9930.getClass(), "warningsGuard", null);
        setField(term9930, term9930.getClass(), "injectedLibraries", null);
        setField(term9930, term9930.getClass(), "externsRoot", null);
        setField(term9930, term9930.getClass(), "jsRoot", null);
        setField(term9930, term9930.getClass(), "externAndJsRoot", null);
        setField(term9930, term9930.getClass(), "inputsById", null);
        setField(term9930, term9930.getClass(), "sourceMap", null);
        setField(term9930, term9930.getClass(), "externExports", null);
        setIntField(term9930, term9930.getClass(), "uniqueNameId", 0);
        setBooleanField(term9930, term9930.getClass(), "useThreads", false);
        setBooleanField(term9930, term9930.getClass(), "hasRegExpGlobalReferences", false);
        setField(term9930, term9930.getClass(), "functionInformationMap", null);
        setField(term9930, term9930.getClass(), "debugLog", null);
        setField(term9930, term9930.getClass(), "defaultCodingConvention", null);
        setField(term9930, term9930.getClass(), "typeRegistry", null);
        setField(term9930, term9930.getClass(), "parserConfig", null);
        setField(term9930, term9930.getClass(), "abstractInterpreter", null);
        setField(term9930, term9930.getClass(), "typeValidator", null);
        setField(term9930, term9930.getClass(), "tracker", null);
        setField(term9930, term9930.getClass(), "oldErrorReporter", null);
        setField(term9930, term9930.getClass(), "defaultErrorReporter", null);
        setField(term9930, term9930.getClass(), "outStream", null);
        setField(term9930, term9930.getClass(), "globalRefMap", null);
        setDoubleField(term9930, term9930.getClass(), "progress", 0.0);
        setField(term9930, term9930.getClass(), "sanityCheck", null);
        setField(term9930, term9930.getClass(), "currentTracer", null);
        setField(term9930, term9930.getClass(), "currentPassName", null);
        setIntField(term9930, term9930.getClass(), "syntheticCodeId", 0);
        setField(term9930, term9930.getClass(), "recentChange", null);
        setField(term9930, term9930.getClass(), "codeChangeHandlers", null);
        setField(term9930, term9930.getClass(), "synthesizedExternsInput", null);
        setField(term9930, term9930.getClass(), "stage", null);
        setField(term9929, term9929.getClass(), "compiler", term9930);
        setField(term9929, term9929.getClass(), "preprocessorSymbolTable", null);
        setField(term9929, term9929.getClass(), "transformationHandler", null);
        term9931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9931, term9931.getClass(), "type", 0);
        setField(term9931, term9931.getClass(), "next", null);
        setIntField(term9932, term9932.getClass(), "type", 0);
        setIntField(term9933, term9933.getClass(), "type", 0);
        setField(term9933, term9933.getClass(), "next", null);
        setField(term9933, term9933.getClass(), "first", null);
        setField(term9933, term9933.getClass(), "last", null);
        setField(term9933, term9933.getClass(), "propListHead", null);
        setIntField(term9933, term9933.getClass(), "sourcePosition", 0);
        setField(term9933, term9933.getClass(), "jsType", null);
        setField(term9933, term9933.getClass(), "parent", null);
        setField(term9932, term9932.getClass(), "next", term9933);
        setIntField(term9934, term9934.getClass(), "type", 0);
        setField(term9934, term9934.getClass(), "next", null);
        setField(term9934, term9934.getClass(), "first", null);
        setField(term9934, term9934.getClass(), "last", null);
        setField(term9934, term9934.getClass(), "propListHead", null);
        setIntField(term9934, term9934.getClass(), "sourcePosition", 0);
        setField(term9934, term9934.getClass(), "jsType", null);
        setField(term9934, term9934.getClass(), "parent", null);
        setField(term9932, term9932.getClass(), "first", term9934);
        setField(term9932, term9932.getClass(), "last", null);
        setField(term9932, term9932.getClass(), "propListHead", null);
        setIntField(term9932, term9932.getClass(), "sourcePosition", 0);
        setField(term9932, term9932.getClass(), "jsType", null);
        setField(term9932, term9932.getClass(), "parent", null);
        setField(term9931, term9931.getClass(), "first", term9932);
        setField(term9931, term9931.getClass(), "last", null);
        setField(term9931, term9931.getClass(), "propListHead", null);
        setIntField(term9931, term9931.getClass(), "sourcePosition", 0);
        setField(term9931, term9931.getClass(), "jsType", null);
        setField(term9931, term9931.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9038;
        callMethod(klass, "process", argTypes, term8888, args);
        assertTrue(recursiveEquals(term8888, term9929));
        assertTrue(recursiveEquals(term9038, null));
    }

};


