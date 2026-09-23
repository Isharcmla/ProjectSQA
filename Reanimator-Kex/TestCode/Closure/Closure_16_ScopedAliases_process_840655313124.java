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

public class ScopedAliases_process_840655313124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74152;
     Object term74324;
     Object term75945;
     Object term75947;

    public ScopedAliases_process_840655313124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74152 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term74232 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term74152, term74152.getClass(), "compiler", term74232);
        term74324 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74416 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74508 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74600 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term74324, term74324.getClass(), "type", 0);
        setField(term74324, term74324.getClass(), "parent", null);
        setField(term74508, term74508.getClass(), "next", null);
        setIntField(term74508, term74508.getClass(), "type", 0);
        setField(term74508, term74508.getClass(), "first", null);
        setField(term74416, term74416.getClass(), "next", term74508);
        setIntField(term74416, term74416.getClass(), "type", 0);
        setField(term74600, term74600.getClass(), "next", null);
        setIntField(term74600, term74600.getClass(), "type", 0);
        setField(term74600, term74600.getClass(), "first", null);
        setField(term74416, term74416.getClass(), "first", term74600);
        setField(term74324, term74324.getClass(), "first", term74416);
        term75945 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term75946 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term75946, term75946.getClass(), "options", null);
        setField(term75946, term75946.getClass(), "passes", null);
        setField(term75946, term75946.getClass(), "externs", null);
        setField(term75946, term75946.getClass(), "modules", null);
        setField(term75946, term75946.getClass(), "moduleGraph", null);
        setField(term75946, term75946.getClass(), "inputs", null);
        setField(term75946, term75946.getClass(), "errorManager", null);
        setField(term75946, term75946.getClass(), "warningsGuard", null);
        setField(term75946, term75946.getClass(), "injectedLibraries", null);
        setField(term75946, term75946.getClass(), "externsRoot", null);
        setField(term75946, term75946.getClass(), "jsRoot", null);
        setField(term75946, term75946.getClass(), "externAndJsRoot", null);
        setField(term75946, term75946.getClass(), "inputsById", null);
        setField(term75946, term75946.getClass(), "sourceMap", null);
        setField(term75946, term75946.getClass(), "externExports", null);
        setIntField(term75946, term75946.getClass(), "uniqueNameId", 0);
        setBooleanField(term75946, term75946.getClass(), "useThreads", false);
        setBooleanField(term75946, term75946.getClass(), "hasRegExpGlobalReferences", false);
        setField(term75946, term75946.getClass(), "functionInformationMap", null);
        setField(term75946, term75946.getClass(), "debugLog", null);
        setField(term75946, term75946.getClass(), "defaultCodingConvention", null);
        setField(term75946, term75946.getClass(), "typeRegistry", null);
        setField(term75946, term75946.getClass(), "parserConfig", null);
        setField(term75946, term75946.getClass(), "abstractInterpreter", null);
        setField(term75946, term75946.getClass(), "typeValidator", null);
        setField(term75946, term75946.getClass(), "tracker", null);
        setField(term75946, term75946.getClass(), "oldErrorReporter", null);
        setField(term75946, term75946.getClass(), "defaultErrorReporter", null);
        setField(term75946, term75946.getClass(), "outStream", null);
        setField(term75946, term75946.getClass(), "globalRefMap", null);
        setDoubleField(term75946, term75946.getClass(), "progress", 0.0);
        setField(term75946, term75946.getClass(), "sanityCheck", null);
        setField(term75946, term75946.getClass(), "currentTracer", null);
        setField(term75946, term75946.getClass(), "currentPassName", null);
        setIntField(term75946, term75946.getClass(), "syntheticCodeId", 0);
        setField(term75946, term75946.getClass(), "recentChange", null);
        setField(term75946, term75946.getClass(), "codeChangeHandlers", null);
        setField(term75946, term75946.getClass(), "synthesizedExternsInput", null);
        setField(term75946, term75946.getClass(), "stage", null);
        setField(term75945, term75945.getClass(), "compiler", term75946);
        setField(term75945, term75945.getClass(), "preprocessorSymbolTable", null);
        setField(term75945, term75945.getClass(), "transformationHandler", null);
        term75947 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75948 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75949 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75950 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term75947, term75947.getClass(), "number", 0.0);
        setIntField(term75947, term75947.getClass(), "type", 0);
        setField(term75947, term75947.getClass(), "next", null);
        setDoubleField(term75948, term75948.getClass(), "number", 0.0);
        setIntField(term75948, term75948.getClass(), "type", 0);
        setDoubleField(term75949, term75949.getClass(), "number", 0.0);
        setIntField(term75949, term75949.getClass(), "type", 0);
        setField(term75949, term75949.getClass(), "next", null);
        setField(term75949, term75949.getClass(), "first", null);
        setField(term75949, term75949.getClass(), "last", null);
        setField(term75949, term75949.getClass(), "propListHead", null);
        setIntField(term75949, term75949.getClass(), "sourcePosition", 0);
        setField(term75949, term75949.getClass(), "jsType", null);
        setField(term75949, term75949.getClass(), "parent", null);
        setField(term75948, term75948.getClass(), "next", term75949);
        setDoubleField(term75950, term75950.getClass(), "number", 0.0);
        setIntField(term75950, term75950.getClass(), "type", 0);
        setField(term75950, term75950.getClass(), "next", null);
        setField(term75950, term75950.getClass(), "first", null);
        setField(term75950, term75950.getClass(), "last", null);
        setField(term75950, term75950.getClass(), "propListHead", null);
        setIntField(term75950, term75950.getClass(), "sourcePosition", 0);
        setField(term75950, term75950.getClass(), "jsType", null);
        setField(term75950, term75950.getClass(), "parent", null);
        setField(term75948, term75948.getClass(), "first", term75950);
        setField(term75948, term75948.getClass(), "last", null);
        setField(term75948, term75948.getClass(), "propListHead", null);
        setIntField(term75948, term75948.getClass(), "sourcePosition", 0);
        setField(term75948, term75948.getClass(), "jsType", null);
        setField(term75948, term75948.getClass(), "parent", null);
        setField(term75947, term75947.getClass(), "first", term75948);
        setField(term75947, term75947.getClass(), "last", null);
        setField(term75947, term75947.getClass(), "propListHead", null);
        setIntField(term75947, term75947.getClass(), "sourcePosition", 0);
        setField(term75947, term75947.getClass(), "jsType", null);
        setField(term75947, term75947.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term74324;
        callMethod(klass, "process", argTypes, term74152, args);
        assertTrue(recursiveEquals(term74152, term75945));
        assertTrue(recursiveEquals(term74324, null));
    }

};


