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

public class ProcessCommonJSModules_process_627866047331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172989;
     Object term173059;
     Object term173931;
     Object term173932;

    public ProcessCommonJSModules_process_627866047331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172989 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term172989, term172989.getClass(), "compiler", null);
        term173059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term173059, term173059.getClass(), "type", 33);
        setField(term173059, term173059.getClass(), "parent", null);
        setField(term173199, term173199.getClass(), "next", null);
        setIntField(term173199, term173199.getClass(), "type", 0);
        setField(term173199, term173199.getClass(), "first", null);
        setField(term173129, term173129.getClass(), "next", term173199);
        setIntField(term173129, term173129.getClass(), "type", 33);
        setField(term173269, term173269.getClass(), "next", null);
        setIntField(term173269, term173269.getClass(), "type", 0);
        setField(term173269, term173269.getClass(), "first", null);
        setField(term173129, term173129.getClass(), "first", term173269);
        setField(term173059, term173059.getClass(), "first", term173129);
        term173931 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term173931, term173931.getClass(), "compiler", null);
        setField(term173931, term173931.getClass(), "filenamePrefix", null);
        setBooleanField(term173931, term173931.getClass(), "reportDependencies", false);
        setField(term173931, term173931.getClass(), "module", null);
        term173932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term173932, term173932.getClass(), "type", 33);
        setField(term173932, term173932.getClass(), "next", null);
        setIntField(term173933, term173933.getClass(), "type", 33);
        setIntField(term173934, term173934.getClass(), "type", 0);
        setField(term173934, term173934.getClass(), "next", null);
        setField(term173934, term173934.getClass(), "first", null);
        setField(term173934, term173934.getClass(), "last", null);
        setField(term173934, term173934.getClass(), "propListHead", null);
        setIntField(term173934, term173934.getClass(), "sourcePosition", 0);
        setField(term173934, term173934.getClass(), "jsType", null);
        setField(term173934, term173934.getClass(), "parent", null);
        setField(term173933, term173933.getClass(), "next", term173934);
        setIntField(term173935, term173935.getClass(), "type", 0);
        setField(term173935, term173935.getClass(), "next", null);
        setField(term173935, term173935.getClass(), "first", null);
        setField(term173935, term173935.getClass(), "last", null);
        setField(term173935, term173935.getClass(), "propListHead", null);
        setIntField(term173935, term173935.getClass(), "sourcePosition", 0);
        setField(term173935, term173935.getClass(), "jsType", null);
        setField(term173935, term173935.getClass(), "parent", null);
        setField(term173933, term173933.getClass(), "first", term173935);
        setField(term173933, term173933.getClass(), "last", null);
        setField(term173933, term173933.getClass(), "propListHead", null);
        setIntField(term173933, term173933.getClass(), "sourcePosition", 0);
        setField(term173933, term173933.getClass(), "jsType", null);
        setField(term173933, term173933.getClass(), "parent", null);
        setField(term173932, term173932.getClass(), "first", term173933);
        setField(term173932, term173932.getClass(), "last", null);
        setField(term173932, term173932.getClass(), "propListHead", null);
        setIntField(term173932, term173932.getClass(), "sourcePosition", 0);
        setField(term173932, term173932.getClass(), "jsType", null);
        setField(term173932, term173932.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term173059;
        callMethod(klass, "process", argTypes, term172989, args);
        assertTrue(recursiveEquals(term172989, term173931));
        assertTrue(recursiveEquals(term173059, null));
    }

};


