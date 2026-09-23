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

public class MustBeReachingVariableDef_computeMustDef_179693505674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18889;
     Object term18981;
     Object term19615;
     Object term19616;

    public MustBeReachingVariableDef_computeMustDef_179693505674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18889 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term18981 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term19073 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term19165 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term18981, term18981.getClass(), "type", 1265463001);
        setIntField(term19073, term19073.getClass(), "type", -2027534003);
        setIntField(term19165, term19165.getClass(), "type", 125);
        setField(term19073, term19073.getClass(), "first", term19165);
        setField(term18981, term18981.getClass(), "first", term19073);
        term19615 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term19615, term19615.getClass(), "jsScope", null);
        setField(term19615, term19615.getClass(), "compiler", null);
        setField(term19615, term19615.getClass(), "escaped", null);
        setField(term19615, term19615.getClass(), "cfg", null);
        setField(term19615, term19615.getClass(), "joinOp", null);
        setField(term19615, term19615.getClass(), "orderedWorkSet", null);
        term19616 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term19617 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term19618 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term19616, term19616.getClass(), "str", null);
        setIntField(term19616, term19616.getClass(), "type", 1265463001);
        setField(term19616, term19616.getClass(), "next", null);
        setField(term19617, term19617.getClass(), "str", null);
        setIntField(term19617, term19617.getClass(), "type", -2027534003);
        setField(term19617, term19617.getClass(), "next", null);
        setField(term19618, term19618.getClass(), "str", null);
        setIntField(term19618, term19618.getClass(), "type", 125);
        setField(term19618, term19618.getClass(), "next", null);
        setField(term19618, term19618.getClass(), "first", null);
        setField(term19618, term19618.getClass(), "last", null);
        setField(term19618, term19618.getClass(), "propListHead", null);
        setIntField(term19618, term19618.getClass(), "sourcePosition", 0);
        setField(term19618, term19618.getClass(), "jsType", null);
        setField(term19618, term19618.getClass(), "parent", null);
        setField(term19617, term19617.getClass(), "first", term19618);
        setField(term19617, term19617.getClass(), "last", null);
        setField(term19617, term19617.getClass(), "propListHead", null);
        setIntField(term19617, term19617.getClass(), "sourcePosition", 0);
        setField(term19617, term19617.getClass(), "jsType", null);
        setField(term19617, term19617.getClass(), "parent", null);
        setField(term19616, term19616.getClass(), "first", term19617);
        setField(term19616, term19616.getClass(), "last", null);
        setField(term19616, term19616.getClass(), "propListHead", null);
        setIntField(term19616, term19616.getClass(), "sourcePosition", 0);
        setField(term19616, term19616.getClass(), "jsType", null);
        setField(term19616, term19616.getClass(), "parent", null);
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
        args[0] = term18981;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term18889, args);
        assertTrue(recursiveEquals(term18889, term19615));
        assertTrue(recursiveEquals(term18981, term19616));
    }

};


