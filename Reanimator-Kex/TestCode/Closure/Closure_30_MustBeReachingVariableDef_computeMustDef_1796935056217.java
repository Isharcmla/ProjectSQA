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

public class MustBeReachingVariableDef_computeMustDef_1796935056217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205249;
     Object term205319;
     Object term211311;
     Object term211312;

    public MustBeReachingVariableDef_computeMustDef_1796935056217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205249 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term205319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term205389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term205459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term205319, term205319.getClass(), "type", 1265463001);
        setIntField(term205389, term205389.getClass(), "type", -2027534003);
        setIntField(term205459, term205459.getClass(), "type", 111);
        setField(term205389, term205389.getClass(), "first", term205459);
        setField(term205319, term205319.getClass(), "first", term205389);
        term211311 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term211311, term211311.getClass(), "jsScope", null);
        setField(term211311, term211311.getClass(), "compiler", null);
        setField(term211311, term211311.getClass(), "escaped", null);
        setField(term211311, term211311.getClass(), "cfg", null);
        setField(term211311, term211311.getClass(), "joinOp", null);
        setField(term211311, term211311.getClass(), "orderedWorkSet", null);
        term211312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term211312, term211312.getClass(), "type", 1265463001);
        setField(term211312, term211312.getClass(), "next", null);
        setIntField(term211313, term211313.getClass(), "type", -2027534003);
        setField(term211313, term211313.getClass(), "next", null);
        setIntField(term211314, term211314.getClass(), "type", 111);
        setField(term211314, term211314.getClass(), "next", null);
        setField(term211314, term211314.getClass(), "first", null);
        setField(term211314, term211314.getClass(), "last", null);
        setField(term211314, term211314.getClass(), "propListHead", null);
        setIntField(term211314, term211314.getClass(), "sourcePosition", 0);
        setField(term211314, term211314.getClass(), "jsType", null);
        setField(term211314, term211314.getClass(), "parent", null);
        setField(term211313, term211313.getClass(), "first", term211314);
        setField(term211313, term211313.getClass(), "last", null);
        setField(term211313, term211313.getClass(), "propListHead", null);
        setIntField(term211313, term211313.getClass(), "sourcePosition", 0);
        setField(term211313, term211313.getClass(), "jsType", null);
        setField(term211313, term211313.getClass(), "parent", null);
        setField(term211312, term211312.getClass(), "first", term211313);
        setField(term211312, term211312.getClass(), "last", null);
        setField(term211312, term211312.getClass(), "propListHead", null);
        setIntField(term211312, term211312.getClass(), "sourcePosition", 0);
        setField(term211312, term211312.getClass(), "jsType", null);
        setField(term211312, term211312.getClass(), "parent", null);
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
        args[0] = term205319;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term205249, args);
        assertTrue(recursiveEquals(term205249, term211311));
        assertTrue(recursiveEquals(term205319, term211312));
    }

};


