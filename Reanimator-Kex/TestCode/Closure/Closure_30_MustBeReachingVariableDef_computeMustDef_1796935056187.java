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

public class MustBeReachingVariableDef_computeMustDef_1796935056187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50771;
     Object term50863;
     Object term59699;
     Object term59700;

    public MustBeReachingVariableDef_computeMustDef_1796935056187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50771 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term50863 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term50955 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term51047 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term50863, term50863.getClass(), "type", 1265463001);
        setIntField(term50955, term50955.getClass(), "type", 103);
        setField(term50955, term50955.getClass(), "first", term51047);
        setField(term50863, term50863.getClass(), "first", term50955);
        term59699 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term59699, term59699.getClass(), "jsScope", null);
        setField(term59699, term59699.getClass(), "compiler", null);
        setField(term59699, term59699.getClass(), "escaped", null);
        setField(term59699, term59699.getClass(), "cfg", null);
        setField(term59699, term59699.getClass(), "joinOp", null);
        setField(term59699, term59699.getClass(), "orderedWorkSet", null);
        term59700 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term59701 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term59702 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term59700, term59700.getClass(), "str", null);
        setIntField(term59700, term59700.getClass(), "type", 1265463001);
        setField(term59700, term59700.getClass(), "next", null);
        setField(term59701, term59701.getClass(), "str", null);
        setIntField(term59701, term59701.getClass(), "type", 103);
        setField(term59701, term59701.getClass(), "next", null);
        setField(term59702, term59702.getClass(), "str", null);
        setIntField(term59702, term59702.getClass(), "type", 0);
        setField(term59702, term59702.getClass(), "next", null);
        setField(term59702, term59702.getClass(), "first", null);
        setField(term59702, term59702.getClass(), "last", null);
        setField(term59702, term59702.getClass(), "propListHead", null);
        setIntField(term59702, term59702.getClass(), "sourcePosition", 0);
        setField(term59702, term59702.getClass(), "jsType", null);
        setField(term59702, term59702.getClass(), "parent", null);
        setField(term59701, term59701.getClass(), "first", term59702);
        setField(term59701, term59701.getClass(), "last", null);
        setField(term59701, term59701.getClass(), "propListHead", null);
        setIntField(term59701, term59701.getClass(), "sourcePosition", 0);
        setField(term59701, term59701.getClass(), "jsType", null);
        setField(term59701, term59701.getClass(), "parent", null);
        setField(term59700, term59700.getClass(), "first", term59701);
        setField(term59700, term59700.getClass(), "last", null);
        setField(term59700, term59700.getClass(), "propListHead", null);
        setIntField(term59700, term59700.getClass(), "sourcePosition", 0);
        setField(term59700, term59700.getClass(), "jsType", null);
        setField(term59700, term59700.getClass(), "parent", null);
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
        args[0] = term50863;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term50771, args);
        assertTrue(recursiveEquals(term50771, term59699));
        assertTrue(recursiveEquals(term50863, term59700));
    }

};


