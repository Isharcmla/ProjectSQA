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

public class MustBeReachingVariableDef_computeMustDef_1796935056137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37831;
     Object term37923;
     Object term38318;
     Object term38319;

    public MustBeReachingVariableDef_computeMustDef_1796935056137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37831 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term37923 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term37923, term37923.getClass(), "type", 123);
        term38318 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term38318, term38318.getClass(), "jsScope", null);
        setField(term38318, term38318.getClass(), "compiler", null);
        setField(term38318, term38318.getClass(), "escaped", null);
        setField(term38318, term38318.getClass(), "cfg", null);
        setField(term38318, term38318.getClass(), "joinOp", null);
        setField(term38318, term38318.getClass(), "orderedWorkSet", null);
        term38319 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term38319, term38319.getClass(), "str", null);
        setIntField(term38319, term38319.getClass(), "type", 123);
        setField(term38319, term38319.getClass(), "next", null);
        setField(term38319, term38319.getClass(), "first", null);
        setField(term38319, term38319.getClass(), "last", null);
        setField(term38319, term38319.getClass(), "propListHead", null);
        setIntField(term38319, term38319.getClass(), "sourcePosition", 0);
        setField(term38319, term38319.getClass(), "jsType", null);
        setField(term38319, term38319.getClass(), "parent", null);
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
        args[0] = term37923;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term37831, args);
        assertTrue(recursiveEquals(term37831, term38318));
        assertTrue(recursiveEquals(term37923, term38319));
    }

};


