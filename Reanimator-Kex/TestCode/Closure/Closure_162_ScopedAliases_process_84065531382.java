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

public class ScopedAliases_process_84065531382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41373;
     Object term41523;
     Object term41965;
     Object term41967;

    public ScopedAliases_process_84065531382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41373 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term41453 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term41373, term41373.getClass(), "compiler", term41453);
        term41523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41523, term41523.getClass(), "type", 37);
        setField(term41523, term41523.getClass(), "parent", null);
        setField(term41593, term41593.getClass(), "next", null);
        setIntField(term41593, term41593.getClass(), "type", 105);
        setField(term41523, term41523.getClass(), "first", term41593);
        term41965 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term41966 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term41966, term41966.getClass(), "options", null);
        setField(term41966, term41966.getClass(), "passes", null);
        setField(term41966, term41966.getClass(), "externs", null);
        setField(term41966, term41966.getClass(), "modules", null);
        setField(term41966, term41966.getClass(), "moduleGraph", null);
        setField(term41966, term41966.getClass(), "inputs", null);
        setField(term41966, term41966.getClass(), "errorManager", null);
        setField(term41966, term41966.getClass(), "warningsGuard", null);
        setField(term41966, term41966.getClass(), "externsRoot", null);
        setField(term41966, term41966.getClass(), "jsRoot", null);
        setField(term41966, term41966.getClass(), "externAndJsRoot", null);
        setField(term41966, term41966.getClass(), "inputsById", null);
        setField(term41966, term41966.getClass(), "sourceMap", null);
        setField(term41966, term41966.getClass(), "externExports", null);
        setIntField(term41966, term41966.getClass(), "uniqueNameId", 0);
        setBooleanField(term41966, term41966.getClass(), "useThreads", false);
        setBooleanField(term41966, term41966.getClass(), "hasRegExpGlobalReferences", false);
        setField(term41966, term41966.getClass(), "functionInformationMap", null);
        setField(term41966, term41966.getClass(), "debugLog", null);
        setField(term41966, term41966.getClass(), "defaultCodingConvention", null);
        setField(term41966, term41966.getClass(), "typeRegistry", null);
        setField(term41966, term41966.getClass(), "parserConfig", null);
        setField(term41966, term41966.getClass(), "abstractInterpreter", null);
        setField(term41966, term41966.getClass(), "typeValidator", null);
        setField(term41966, term41966.getClass(), "tracker", null);
        setField(term41966, term41966.getClass(), "oldErrorReporter", null);
        setField(term41966, term41966.getClass(), "defaultErrorReporter", null);
        setField(term41966, term41966.getClass(), "outStream", null);
        setField(term41966, term41966.getClass(), "globalRefMap", null);
        setField(term41966, term41966.getClass(), "sanityCheck", null);
        setField(term41966, term41966.getClass(), "currentTracer", null);
        setField(term41966, term41966.getClass(), "currentPassName", null);
        setIntField(term41966, term41966.getClass(), "syntheticCodeId", 0);
        setField(term41966, term41966.getClass(), "recentChange", null);
        setField(term41966, term41966.getClass(), "codeChangeHandlers", null);
        setField(term41966, term41966.getClass(), "stage", null);
        setField(term41965, term41965.getClass(), "compiler", term41966);
        setField(term41965, term41965.getClass(), "preprocessorSymbolTable", null);
        setField(term41965, term41965.getClass(), "transformationHandler", null);
        term41967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41967, term41967.getClass(), "type", 37);
        setField(term41967, term41967.getClass(), "next", null);
        setIntField(term41968, term41968.getClass(), "type", 105);
        setField(term41968, term41968.getClass(), "next", null);
        setField(term41968, term41968.getClass(), "first", null);
        setField(term41968, term41968.getClass(), "last", null);
        setField(term41968, term41968.getClass(), "propListHead", null);
        setIntField(term41968, term41968.getClass(), "sourcePosition", 0);
        setField(term41968, term41968.getClass(), "jsType", null);
        setField(term41968, term41968.getClass(), "parent", null);
        setField(term41967, term41967.getClass(), "first", term41968);
        setField(term41967, term41967.getClass(), "last", null);
        setField(term41967, term41967.getClass(), "propListHead", null);
        setIntField(term41967, term41967.getClass(), "sourcePosition", 0);
        setField(term41967, term41967.getClass(), "jsType", null);
        setField(term41967, term41967.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term41523;
        callMethod(klass, "process", argTypes, term41373, args);
        assertTrue(recursiveEquals(term41373, term41965));
        assertTrue(recursiveEquals(term41523, null));
    }

};


