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

public class MustBeReachingVariableDef_computeMustDef_1796935056145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39630;
     Object term39722;
     Object term41008;
     Object term41009;

    public MustBeReachingVariableDef_computeMustDef_1796935056145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39630 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term39722 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term39722, term39722.getClass(), "type", 116);
        term41008 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term41008, term41008.getClass(), "jsScope", null);
        setField(term41008, term41008.getClass(), "compiler", null);
        setField(term41008, term41008.getClass(), "escaped", null);
        setField(term41008, term41008.getClass(), "cfg", null);
        setField(term41008, term41008.getClass(), "joinOp", null);
        setField(term41008, term41008.getClass(), "orderedWorkSet", null);
        term41009 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term41009, term41009.getClass(), "str", null);
        setIntField(term41009, term41009.getClass(), "type", 116);
        setField(term41009, term41009.getClass(), "next", null);
        setField(term41009, term41009.getClass(), "first", null);
        setField(term41009, term41009.getClass(), "last", null);
        setField(term41009, term41009.getClass(), "propListHead", null);
        setIntField(term41009, term41009.getClass(), "sourcePosition", 0);
        setField(term41009, term41009.getClass(), "jsType", null);
        setField(term41009, term41009.getClass(), "parent", null);
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
        args[0] = term39722;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term39630, args);
        assertTrue(recursiveEquals(term39630, term41008));
        assertTrue(recursiveEquals(term39722, term41009));
    }

};


