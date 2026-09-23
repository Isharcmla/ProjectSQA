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

public class RenameLabels_process_15092268027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9925;
     Object term10075;
     Object term11493;
     Object term11495;

    public RenameLabels_process_15092268027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9925 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        Object term10005 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term9925, term9925.getClass(), "compiler", term10005);
        term10075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10075, term10075.getClass(), "type", 0);
        setField(term10145, term10145.getClass(), "next", term10215);
        setIntField(term10145, term10145.getClass(), "type", 116);
        setField(term10145, term10145.getClass(), "first", null);
        setField(term10075, term10075.getClass(), "first", term10145);
        term11493 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        Object term11494 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term11494, term11494.getClass(), "options", null);
        setField(term11494, term11494.getClass(), "passes", null);
        setField(term11494, term11494.getClass(), "externs", null);
        setField(term11494, term11494.getClass(), "modules", null);
        setField(term11494, term11494.getClass(), "moduleGraph", null);
        setField(term11494, term11494.getClass(), "inputs", null);
        setField(term11494, term11494.getClass(), "errorManager", null);
        setField(term11494, term11494.getClass(), "warningsGuard", null);
        setField(term11494, term11494.getClass(), "externsRoot", null);
        setField(term11494, term11494.getClass(), "jsRoot", null);
        setField(term11494, term11494.getClass(), "externAndJsRoot", null);
        setField(term11494, term11494.getClass(), "inputsByName", null);
        setField(term11494, term11494.getClass(), "sourceMap", null);
        setField(term11494, term11494.getClass(), "externExports", null);
        setIntField(term11494, term11494.getClass(), "uniqueNameId", 0);
        setBooleanField(term11494, term11494.getClass(), "useThreads", false);
        setBooleanField(term11494, term11494.getClass(), "hasRegExpGlobalReferences", false);
        setField(term11494, term11494.getClass(), "functionInformationMap", null);
        setField(term11494, term11494.getClass(), "debugLog", null);
        setField(term11494, term11494.getClass(), "defaultCodingConvention", null);
        setField(term11494, term11494.getClass(), "typeRegistry", null);
        setField(term11494, term11494.getClass(), "parserConfig", null);
        setField(term11494, term11494.getClass(), "abstractInterpreter", null);
        setField(term11494, term11494.getClass(), "typeValidator", null);
        setField(term11494, term11494.getClass(), "tracker", null);
        setField(term11494, term11494.getClass(), "oldErrorReporter", null);
        setField(term11494, term11494.getClass(), "defaultErrorReporter", null);
        setField(term11494, term11494.getClass(), "outStream", null);
        setField(term11494, term11494.getClass(), "sanityCheck", null);
        setField(term11494, term11494.getClass(), "currentTracer", null);
        setField(term11494, term11494.getClass(), "currentPassName", null);
        setField(term11494, term11494.getClass(), "recentChange", null);
        setField(term11494, term11494.getClass(), "codeChangeHandlers", null);
        setField(term11494, term11494.getClass(), "stage", null);
        setField(term11493, term11493.getClass(), "compiler", term11494);
        setField(term11493, term11493.getClass(), "nameSupplier", null);
        setBooleanField(term11493, term11493.getClass(), "removeUnused", false);
        term11495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11495, term11495.getClass(), "type", 0);
        setField(term11495, term11495.getClass(), "next", null);
        setIntField(term11496, term11496.getClass(), "type", 116);
        setIntField(term11497, term11497.getClass(), "type", 0);
        setField(term11497, term11497.getClass(), "next", null);
        setField(term11497, term11497.getClass(), "first", null);
        setField(term11497, term11497.getClass(), "last", null);
        setField(term11497, term11497.getClass(), "propListHead", null);
        setIntField(term11497, term11497.getClass(), "sourcePosition", 0);
        setField(term11497, term11497.getClass(), "jsType", null);
        setField(term11497, term11497.getClass(), "parent", null);
        setField(term11496, term11496.getClass(), "next", term11497);
        setField(term11496, term11496.getClass(), "first", null);
        setField(term11496, term11496.getClass(), "last", null);
        setField(term11496, term11496.getClass(), "propListHead", null);
        setIntField(term11496, term11496.getClass(), "sourcePosition", 0);
        setField(term11496, term11496.getClass(), "jsType", null);
        setField(term11496, term11496.getClass(), "parent", null);
        setField(term11495, term11495.getClass(), "first", term11496);
        setField(term11495, term11495.getClass(), "last", null);
        setField(term11495, term11495.getClass(), "propListHead", null);
        setIntField(term11495, term11495.getClass(), "sourcePosition", 0);
        setField(term11495, term11495.getClass(), "jsType", null);
        setField(term11495, term11495.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term10075;
        callMethod(klass, "process", argTypes, term9925, args);
        assertTrue(recursiveEquals(term9925, term11493));
        assertTrue(recursiveEquals(term10075, null));
    }

};


