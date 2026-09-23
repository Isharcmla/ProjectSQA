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

public class MustBeReachingVariableDef_computeMustDef_1796935056172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48534;
     Object term48626;
     Object term49331;
     Object term49332;

    public MustBeReachingVariableDef_computeMustDef_1796935056172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48534 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term48626 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term48718 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term48810 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term48902 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term48626, term48626.getClass(), "type", 1265463001);
        setIntField(term48718, term48718.getClass(), "type", -2027534003);
        setIntField(term48810, term48810.getClass(), "type", 1375330971);
        setField(term48810, term48810.getClass(), "first", term48902);
        setField(term48718, term48718.getClass(), "first", term48810);
        setField(term48626, term48626.getClass(), "first", term48718);
        term49331 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term49331, term49331.getClass(), "jsScope", null);
        setField(term49331, term49331.getClass(), "compiler", null);
        setField(term49331, term49331.getClass(), "escaped", null);
        setField(term49331, term49331.getClass(), "cfg", null);
        setField(term49331, term49331.getClass(), "joinOp", null);
        setField(term49331, term49331.getClass(), "orderedWorkSet", null);
        term49332 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term49333 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term49334 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term49335 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term49332, term49332.getClass(), "str", null);
        setIntField(term49332, term49332.getClass(), "type", 1265463001);
        setField(term49332, term49332.getClass(), "next", null);
        setField(term49333, term49333.getClass(), "str", null);
        setIntField(term49333, term49333.getClass(), "type", -2027534003);
        setField(term49333, term49333.getClass(), "next", null);
        setField(term49334, term49334.getClass(), "str", null);
        setIntField(term49334, term49334.getClass(), "type", 1375330971);
        setField(term49334, term49334.getClass(), "next", null);
        setField(term49335, term49335.getClass(), "str", null);
        setIntField(term49335, term49335.getClass(), "type", 0);
        setField(term49335, term49335.getClass(), "next", null);
        setField(term49335, term49335.getClass(), "first", null);
        setField(term49335, term49335.getClass(), "last", null);
        setField(term49335, term49335.getClass(), "propListHead", null);
        setIntField(term49335, term49335.getClass(), "sourcePosition", 0);
        setField(term49335, term49335.getClass(), "jsType", null);
        setField(term49335, term49335.getClass(), "parent", null);
        setField(term49334, term49334.getClass(), "first", term49335);
        setField(term49334, term49334.getClass(), "last", null);
        setField(term49334, term49334.getClass(), "propListHead", null);
        setIntField(term49334, term49334.getClass(), "sourcePosition", 0);
        setField(term49334, term49334.getClass(), "jsType", null);
        setField(term49334, term49334.getClass(), "parent", null);
        setField(term49333, term49333.getClass(), "first", term49334);
        setField(term49333, term49333.getClass(), "last", null);
        setField(term49333, term49333.getClass(), "propListHead", null);
        setIntField(term49333, term49333.getClass(), "sourcePosition", 0);
        setField(term49333, term49333.getClass(), "jsType", null);
        setField(term49333, term49333.getClass(), "parent", null);
        setField(term49332, term49332.getClass(), "first", term49333);
        setField(term49332, term49332.getClass(), "last", null);
        setField(term49332, term49332.getClass(), "propListHead", null);
        setIntField(term49332, term49332.getClass(), "sourcePosition", 0);
        setField(term49332, term49332.getClass(), "jsType", null);
        setField(term49332, term49332.getClass(), "parent", null);
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
        args[0] = term48626;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term48534, args);
        assertTrue(recursiveEquals(term48534, term49331));
        assertTrue(recursiveEquals(term48626, term49332));
    }

};


