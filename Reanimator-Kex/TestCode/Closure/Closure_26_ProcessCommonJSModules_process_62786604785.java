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

public class ProcessCommonJSModules_process_62786604785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45219;
     Object term45311;
     Object term45933;
     Object term45934;

    public ProcessCommonJSModules_process_62786604785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45219 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term45219, term45219.getClass(), "compiler", null);
        term45311 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term45403 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term45473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45565 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term45311, term45311.getClass(), "type", 0);
        setField(term45311, term45311.getClass(), "parent", null);
        setField(term45473, term45473.getClass(), "next", term45565);
        setIntField(term45473, term45473.getClass(), "type", 37);
        setField(term45473, term45473.getClass(), "first", null);
        setField(term45403, term45403.getClass(), "next", term45473);
        setIntField(term45403, term45403.getClass(), "type", 0);
        setField(term45403, term45403.getClass(), "first", null);
        setField(term45311, term45311.getClass(), "first", term45403);
        term45933 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term45933, term45933.getClass(), "compiler", null);
        setField(term45933, term45933.getClass(), "filenamePrefix", null);
        setBooleanField(term45933, term45933.getClass(), "reportDependencies", false);
        setField(term45933, term45933.getClass(), "module", null);
        term45934 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term45935 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term45936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45937 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term45934, term45934.getClass(), "number", 0.0);
        setIntField(term45934, term45934.getClass(), "type", 0);
        setField(term45934, term45934.getClass(), "next", null);
        setDoubleField(term45935, term45935.getClass(), "number", 0.0);
        setIntField(term45935, term45935.getClass(), "type", 0);
        setIntField(term45936, term45936.getClass(), "type", 37);
        setDoubleField(term45937, term45937.getClass(), "number", 0.0);
        setIntField(term45937, term45937.getClass(), "type", 0);
        setField(term45937, term45937.getClass(), "next", null);
        setField(term45937, term45937.getClass(), "first", null);
        setField(term45937, term45937.getClass(), "last", null);
        setField(term45937, term45937.getClass(), "propListHead", null);
        setIntField(term45937, term45937.getClass(), "sourcePosition", 0);
        setField(term45937, term45937.getClass(), "jsType", null);
        setField(term45937, term45937.getClass(), "parent", null);
        setField(term45936, term45936.getClass(), "next", term45937);
        setField(term45936, term45936.getClass(), "first", null);
        setField(term45936, term45936.getClass(), "last", null);
        setField(term45936, term45936.getClass(), "propListHead", null);
        setIntField(term45936, term45936.getClass(), "sourcePosition", 0);
        setField(term45936, term45936.getClass(), "jsType", null);
        setField(term45936, term45936.getClass(), "parent", null);
        setField(term45935, term45935.getClass(), "next", term45936);
        setField(term45935, term45935.getClass(), "first", null);
        setField(term45935, term45935.getClass(), "last", null);
        setField(term45935, term45935.getClass(), "propListHead", null);
        setIntField(term45935, term45935.getClass(), "sourcePosition", 0);
        setField(term45935, term45935.getClass(), "jsType", null);
        setField(term45935, term45935.getClass(), "parent", null);
        setField(term45934, term45934.getClass(), "first", term45935);
        setField(term45934, term45934.getClass(), "last", null);
        setField(term45934, term45934.getClass(), "propListHead", null);
        setIntField(term45934, term45934.getClass(), "sourcePosition", 0);
        setField(term45934, term45934.getClass(), "jsType", null);
        setField(term45934, term45934.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term45311;
        callMethod(klass, "process", argTypes, term45219, args);
        assertTrue(recursiveEquals(term45219, term45933));
        assertTrue(recursiveEquals(term45311, null));
    }

};


