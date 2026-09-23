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

public class MustBeReachingVariableDef_computeMustDef_1796935056190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52118;
     Object term52188;
     Object term59952;
     Object term59953;

    public MustBeReachingVariableDef_computeMustDef_1796935056190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52118 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term52188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52188, term52188.getClass(), "type", 1265463001);
        setIntField(term52258, term52258.getClass(), "type", 107);
        setField(term52188, term52188.getClass(), "first", term52258);
        term59952 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term59952, term59952.getClass(), "jsScope", null);
        setField(term59952, term59952.getClass(), "compiler", null);
        setField(term59952, term59952.getClass(), "escaped", null);
        setField(term59952, term59952.getClass(), "cfg", null);
        setField(term59952, term59952.getClass(), "joinOp", null);
        setField(term59952, term59952.getClass(), "orderedWorkSet", null);
        term59953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59953, term59953.getClass(), "type", 1265463001);
        setField(term59953, term59953.getClass(), "next", null);
        setIntField(term59954, term59954.getClass(), "type", 107);
        setField(term59954, term59954.getClass(), "next", null);
        setField(term59954, term59954.getClass(), "first", null);
        setField(term59954, term59954.getClass(), "last", null);
        setField(term59954, term59954.getClass(), "propListHead", null);
        setIntField(term59954, term59954.getClass(), "sourcePosition", 0);
        setField(term59954, term59954.getClass(), "jsType", null);
        setField(term59954, term59954.getClass(), "parent", null);
        setField(term59953, term59953.getClass(), "first", term59954);
        setField(term59953, term59953.getClass(), "last", null);
        setField(term59953, term59953.getClass(), "propListHead", null);
        setIntField(term59953, term59953.getClass(), "sourcePosition", 0);
        setField(term59953, term59953.getClass(), "jsType", null);
        setField(term59953, term59953.getClass(), "parent", null);
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
        args[0] = term52188;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term52118, args);
        assertTrue(recursiveEquals(term52118, term59952));
        assertTrue(recursiveEquals(term52188, term59953));
    }

};


