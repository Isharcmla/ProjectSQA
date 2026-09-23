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

public class MustBeReachingVariableDef_computeMustDef_1796935056193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53242;
     Object term53334;
     Object term60221;
     Object term60222;

    public MustBeReachingVariableDef_computeMustDef_1796935056193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53242 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term53334 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term53426 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term53334, term53334.getClass(), "type", 1265463001);
        setField(term53334, term53334.getClass(), "first", term53426);
        term60221 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term60221, term60221.getClass(), "jsScope", null);
        setField(term60221, term60221.getClass(), "compiler", null);
        setField(term60221, term60221.getClass(), "escaped", null);
        setField(term60221, term60221.getClass(), "cfg", null);
        setField(term60221, term60221.getClass(), "joinOp", null);
        setField(term60221, term60221.getClass(), "orderedWorkSet", null);
        term60222 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term60223 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term60222, term60222.getClass(), "str", null);
        setIntField(term60222, term60222.getClass(), "type", 1265463001);
        setField(term60222, term60222.getClass(), "next", null);
        setField(term60223, term60223.getClass(), "str", null);
        setIntField(term60223, term60223.getClass(), "type", 0);
        setField(term60223, term60223.getClass(), "next", null);
        setField(term60223, term60223.getClass(), "first", null);
        setField(term60223, term60223.getClass(), "last", null);
        setField(term60223, term60223.getClass(), "propListHead", null);
        setIntField(term60223, term60223.getClass(), "sourcePosition", 0);
        setField(term60223, term60223.getClass(), "jsType", null);
        setField(term60223, term60223.getClass(), "parent", null);
        setField(term60222, term60222.getClass(), "first", term60223);
        setField(term60222, term60222.getClass(), "last", null);
        setField(term60222, term60222.getClass(), "propListHead", null);
        setIntField(term60222, term60222.getClass(), "sourcePosition", 0);
        setField(term60222, term60222.getClass(), "jsType", null);
        setField(term60222, term60222.getClass(), "parent", null);
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
        args[0] = term53334;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term53242, args);
        assertTrue(recursiveEquals(term53242, term60221));
        assertTrue(recursiveEquals(term53334, term60222));
    }

};


