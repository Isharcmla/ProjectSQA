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

public class MustBeReachingVariableDef_computeMustDef_1796935056131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36291;
     Object term36383;
     Object term36406;
     Object term36407;

    public MustBeReachingVariableDef_computeMustDef_1796935056131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36291 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term36383 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term36383, term36383.getClass(), "type", 122);
        term36406 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term36406, term36406.getClass(), "jsScope", null);
        setField(term36406, term36406.getClass(), "compiler", null);
        setField(term36406, term36406.getClass(), "escaped", null);
        setField(term36406, term36406.getClass(), "cfg", null);
        setField(term36406, term36406.getClass(), "joinOp", null);
        setField(term36406, term36406.getClass(), "orderedWorkSet", null);
        term36407 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term36407, term36407.getClass(), "str", null);
        setIntField(term36407, term36407.getClass(), "type", 122);
        setField(term36407, term36407.getClass(), "next", null);
        setField(term36407, term36407.getClass(), "first", null);
        setField(term36407, term36407.getClass(), "last", null);
        setField(term36407, term36407.getClass(), "propListHead", null);
        setIntField(term36407, term36407.getClass(), "sourcePosition", 0);
        setField(term36407, term36407.getClass(), "jsType", null);
        setField(term36407, term36407.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term36383;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term36291, args);
        assertTrue(recursiveEquals(term36291, term36406));
        assertTrue(recursiveEquals(term36383, term36407));
    }

};


