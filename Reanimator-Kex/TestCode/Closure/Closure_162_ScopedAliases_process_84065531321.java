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

public class ScopedAliases_process_84065531321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8737;
     Object term8887;
     Object term9344;
     Object term9346;

    public ScopedAliases_process_84065531321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8737 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term8817 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term8737, term8737.getClass(), "compiler", term8817);
        term8887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8887, term8887.getClass(), "type", 37);
        setField(term8887, term8887.getClass(), "parent", null);
        setField(term8957, term8957.getClass(), "next", null);
        setIntField(term8957, term8957.getClass(), "type", 0);
        setField(term8957, term8957.getClass(), "first", null);
        setField(term8887, term8887.getClass(), "first", term8957);
        term9344 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term9345 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term9345, term9345.getClass(), "options", null);
        setField(term9345, term9345.getClass(), "passes", null);
        setField(term9345, term9345.getClass(), "externs", null);
        setField(term9345, term9345.getClass(), "modules", null);
        setField(term9345, term9345.getClass(), "moduleGraph", null);
        setField(term9345, term9345.getClass(), "inputs", null);
        setField(term9345, term9345.getClass(), "errorManager", null);
        setField(term9345, term9345.getClass(), "warningsGuard", null);
        setField(term9345, term9345.getClass(), "externsRoot", null);
        setField(term9345, term9345.getClass(), "jsRoot", null);
        setField(term9345, term9345.getClass(), "externAndJsRoot", null);
        setField(term9345, term9345.getClass(), "inputsById", null);
        setField(term9345, term9345.getClass(), "sourceMap", null);
        setField(term9345, term9345.getClass(), "externExports", null);
        setIntField(term9345, term9345.getClass(), "uniqueNameId", 0);
        setBooleanField(term9345, term9345.getClass(), "useThreads", false);
        setBooleanField(term9345, term9345.getClass(), "hasRegExpGlobalReferences", false);
        setField(term9345, term9345.getClass(), "functionInformationMap", null);
        setField(term9345, term9345.getClass(), "debugLog", null);
        setField(term9345, term9345.getClass(), "defaultCodingConvention", null);
        setField(term9345, term9345.getClass(), "typeRegistry", null);
        setField(term9345, term9345.getClass(), "parserConfig", null);
        setField(term9345, term9345.getClass(), "abstractInterpreter", null);
        setField(term9345, term9345.getClass(), "typeValidator", null);
        setField(term9345, term9345.getClass(), "tracker", null);
        setField(term9345, term9345.getClass(), "oldErrorReporter", null);
        setField(term9345, term9345.getClass(), "defaultErrorReporter", null);
        setField(term9345, term9345.getClass(), "outStream", null);
        setField(term9345, term9345.getClass(), "globalRefMap", null);
        setField(term9345, term9345.getClass(), "sanityCheck", null);
        setField(term9345, term9345.getClass(), "currentTracer", null);
        setField(term9345, term9345.getClass(), "currentPassName", null);
        setIntField(term9345, term9345.getClass(), "syntheticCodeId", 0);
        setField(term9345, term9345.getClass(), "recentChange", null);
        setField(term9345, term9345.getClass(), "codeChangeHandlers", null);
        setField(term9345, term9345.getClass(), "stage", null);
        setField(term9344, term9344.getClass(), "compiler", term9345);
        setField(term9344, term9344.getClass(), "preprocessorSymbolTable", null);
        setField(term9344, term9344.getClass(), "transformationHandler", null);
        term9346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9346, term9346.getClass(), "type", 37);
        setField(term9346, term9346.getClass(), "next", null);
        setIntField(term9347, term9347.getClass(), "type", 0);
        setField(term9347, term9347.getClass(), "next", null);
        setField(term9347, term9347.getClass(), "first", null);
        setField(term9347, term9347.getClass(), "last", null);
        setField(term9347, term9347.getClass(), "propListHead", null);
        setIntField(term9347, term9347.getClass(), "sourcePosition", 0);
        setField(term9347, term9347.getClass(), "jsType", null);
        setField(term9347, term9347.getClass(), "parent", null);
        setField(term9346, term9346.getClass(), "first", term9347);
        setField(term9346, term9346.getClass(), "last", null);
        setField(term9346, term9346.getClass(), "propListHead", null);
        setIntField(term9346, term9346.getClass(), "sourcePosition", 0);
        setField(term9346, term9346.getClass(), "jsType", null);
        setField(term9346, term9346.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term8887;
        callMethod(klass, "process", argTypes, term8737, args);
        assertTrue(recursiveEquals(term8737, term9344));
        assertTrue(recursiveEquals(term8887, null));
    }

};


