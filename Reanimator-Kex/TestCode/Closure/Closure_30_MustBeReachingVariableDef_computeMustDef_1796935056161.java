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

public class MustBeReachingVariableDef_computeMustDef_1796935056161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45350;
     Object term45442;
     Object term45779;
     Object term45780;

    public MustBeReachingVariableDef_computeMustDef_1796935056161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45350 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term45442 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term45534 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term45626 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term45442, term45442.getClass(), "type", 1265463001);
        setIntField(term45534, term45534.getClass(), "type", -2027534003);
        setIntField(term45626, term45626.getClass(), "type", 122);
        setField(term45534, term45534.getClass(), "first", term45626);
        setField(term45442, term45442.getClass(), "first", term45534);
        term45779 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term45779, term45779.getClass(), "jsScope", null);
        setField(term45779, term45779.getClass(), "compiler", null);
        setField(term45779, term45779.getClass(), "escaped", null);
        setField(term45779, term45779.getClass(), "cfg", null);
        setField(term45779, term45779.getClass(), "joinOp", null);
        setField(term45779, term45779.getClass(), "orderedWorkSet", null);
        term45780 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term45781 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term45782 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term45780, term45780.getClass(), "str", null);
        setIntField(term45780, term45780.getClass(), "type", 1265463001);
        setField(term45780, term45780.getClass(), "next", null);
        setField(term45781, term45781.getClass(), "str", null);
        setIntField(term45781, term45781.getClass(), "type", -2027534003);
        setField(term45781, term45781.getClass(), "next", null);
        setField(term45782, term45782.getClass(), "str", null);
        setIntField(term45782, term45782.getClass(), "type", 122);
        setField(term45782, term45782.getClass(), "next", null);
        setField(term45782, term45782.getClass(), "first", null);
        setField(term45782, term45782.getClass(), "last", null);
        setField(term45782, term45782.getClass(), "propListHead", null);
        setIntField(term45782, term45782.getClass(), "sourcePosition", 0);
        setField(term45782, term45782.getClass(), "jsType", null);
        setField(term45782, term45782.getClass(), "parent", null);
        setField(term45781, term45781.getClass(), "first", term45782);
        setField(term45781, term45781.getClass(), "last", null);
        setField(term45781, term45781.getClass(), "propListHead", null);
        setIntField(term45781, term45781.getClass(), "sourcePosition", 0);
        setField(term45781, term45781.getClass(), "jsType", null);
        setField(term45781, term45781.getClass(), "parent", null);
        setField(term45780, term45780.getClass(), "first", term45781);
        setField(term45780, term45780.getClass(), "last", null);
        setField(term45780, term45780.getClass(), "propListHead", null);
        setIntField(term45780, term45780.getClass(), "sourcePosition", 0);
        setField(term45780, term45780.getClass(), "jsType", null);
        setField(term45780, term45780.getClass(), "parent", null);
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
        args[0] = term45442;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term45350, args);
        assertTrue(recursiveEquals(term45350, term45779));
        assertTrue(recursiveEquals(term45442, term45780));
    }

};


