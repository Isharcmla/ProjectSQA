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

public class RenameLabels_process_15092268039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18326;
     Object term18476;
     Object term19249;
     Object term19251;

    public RenameLabels_process_15092268039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18326 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        Object term18406 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term18326, term18326.getClass(), "compiler", term18406);
        term18476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18476, term18476.getClass(), "type", 0);
        setField(term18616, term18616.getClass(), "next", term18686);
        setIntField(term18616, term18616.getClass(), "type", 0);
        setField(term18616, term18616.getClass(), "first", term18756);
        setField(term18546, term18546.getClass(), "next", term18616);
        setIntField(term18546, term18546.getClass(), "type", 117);
        setField(term18546, term18546.getClass(), "first", null);
        setField(term18476, term18476.getClass(), "first", term18546);
        term19249 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        Object term19250 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term19250, term19250.getClass(), "options", null);
        setField(term19250, term19250.getClass(), "passes", null);
        setField(term19250, term19250.getClass(), "externs", null);
        setField(term19250, term19250.getClass(), "modules", null);
        setField(term19250, term19250.getClass(), "moduleGraph", null);
        setField(term19250, term19250.getClass(), "inputs", null);
        setField(term19250, term19250.getClass(), "errorManager", null);
        setField(term19250, term19250.getClass(), "warningsGuard", null);
        setField(term19250, term19250.getClass(), "externsRoot", null);
        setField(term19250, term19250.getClass(), "jsRoot", null);
        setField(term19250, term19250.getClass(), "externAndJsRoot", null);
        setField(term19250, term19250.getClass(), "inputsByName", null);
        setField(term19250, term19250.getClass(), "sourceMap", null);
        setField(term19250, term19250.getClass(), "externExports", null);
        setIntField(term19250, term19250.getClass(), "uniqueNameId", 0);
        setBooleanField(term19250, term19250.getClass(), "useThreads", false);
        setBooleanField(term19250, term19250.getClass(), "hasRegExpGlobalReferences", false);
        setField(term19250, term19250.getClass(), "functionInformationMap", null);
        setField(term19250, term19250.getClass(), "debugLog", null);
        setField(term19250, term19250.getClass(), "defaultCodingConvention", null);
        setField(term19250, term19250.getClass(), "typeRegistry", null);
        setField(term19250, term19250.getClass(), "parserConfig", null);
        setField(term19250, term19250.getClass(), "abstractInterpreter", null);
        setField(term19250, term19250.getClass(), "typeValidator", null);
        setField(term19250, term19250.getClass(), "tracker", null);
        setField(term19250, term19250.getClass(), "oldErrorReporter", null);
        setField(term19250, term19250.getClass(), "defaultErrorReporter", null);
        setField(term19250, term19250.getClass(), "outStream", null);
        setField(term19250, term19250.getClass(), "sanityCheck", null);
        setField(term19250, term19250.getClass(), "currentTracer", null);
        setField(term19250, term19250.getClass(), "currentPassName", null);
        setField(term19250, term19250.getClass(), "recentChange", null);
        setField(term19250, term19250.getClass(), "codeChangeHandlers", null);
        setField(term19250, term19250.getClass(), "stage", null);
        setField(term19249, term19249.getClass(), "compiler", term19250);
        setField(term19249, term19249.getClass(), "nameSupplier", null);
        setBooleanField(term19249, term19249.getClass(), "removeUnused", false);
        term19251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19251, term19251.getClass(), "type", 0);
        setField(term19251, term19251.getClass(), "next", null);
        setIntField(term19252, term19252.getClass(), "type", 117);
        setIntField(term19253, term19253.getClass(), "type", 0);
        setIntField(term19254, term19254.getClass(), "type", 0);
        setField(term19254, term19254.getClass(), "next", null);
        setField(term19254, term19254.getClass(), "first", null);
        setField(term19254, term19254.getClass(), "last", null);
        setField(term19254, term19254.getClass(), "propListHead", null);
        setIntField(term19254, term19254.getClass(), "sourcePosition", 0);
        setField(term19254, term19254.getClass(), "jsType", null);
        setField(term19254, term19254.getClass(), "parent", null);
        setField(term19253, term19253.getClass(), "next", term19254);
        setIntField(term19255, term19255.getClass(), "type", 0);
        setField(term19255, term19255.getClass(), "next", null);
        setField(term19255, term19255.getClass(), "first", null);
        setField(term19255, term19255.getClass(), "last", null);
        setField(term19255, term19255.getClass(), "propListHead", null);
        setIntField(term19255, term19255.getClass(), "sourcePosition", 0);
        setField(term19255, term19255.getClass(), "jsType", null);
        setField(term19255, term19255.getClass(), "parent", null);
        setField(term19253, term19253.getClass(), "first", term19255);
        setField(term19253, term19253.getClass(), "last", null);
        setField(term19253, term19253.getClass(), "propListHead", null);
        setIntField(term19253, term19253.getClass(), "sourcePosition", 0);
        setField(term19253, term19253.getClass(), "jsType", null);
        setField(term19253, term19253.getClass(), "parent", null);
        setField(term19252, term19252.getClass(), "next", term19253);
        setField(term19252, term19252.getClass(), "first", null);
        setField(term19252, term19252.getClass(), "last", null);
        setField(term19252, term19252.getClass(), "propListHead", null);
        setIntField(term19252, term19252.getClass(), "sourcePosition", 0);
        setField(term19252, term19252.getClass(), "jsType", null);
        setField(term19252, term19252.getClass(), "parent", null);
        setField(term19251, term19251.getClass(), "first", term19252);
        setField(term19251, term19251.getClass(), "last", null);
        setField(term19251, term19251.getClass(), "propListHead", null);
        setIntField(term19251, term19251.getClass(), "sourcePosition", 0);
        setField(term19251, term19251.getClass(), "jsType", null);
        setField(term19251, term19251.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term18476;
        callMethod(klass, "process", argTypes, term18326, args);
        assertTrue(recursiveEquals(term18326, term19249));
        assertTrue(recursiveEquals(term18476, null));
    }

};


