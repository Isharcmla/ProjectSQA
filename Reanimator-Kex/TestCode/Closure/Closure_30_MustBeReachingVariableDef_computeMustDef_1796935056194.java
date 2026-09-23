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

public class MustBeReachingVariableDef_computeMustDef_1796935056194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53623;
     Object term53693;
     Object term60336;
     Object term60337;

    public MustBeReachingVariableDef_computeMustDef_1796935056194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53623 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term53693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53693, term53693.getClass(), "type", 1265463001);
        setIntField(term53763, term53763.getClass(), "type", -2027534003);
        setIntField(term53833, term53833.getClass(), "type", 1375330971);
        setField(term53833, term53833.getClass(), "first", null);
        setField(term53833, term53833.getClass(), "next", null);
        setField(term53763, term53763.getClass(), "first", term53833);
        setIntField(term53903, term53903.getClass(), "type", 106);
        setField(term53763, term53763.getClass(), "next", term53903);
        setField(term53693, term53693.getClass(), "first", term53763);
        term60336 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term60336, term60336.getClass(), "jsScope", null);
        setField(term60336, term60336.getClass(), "compiler", null);
        setField(term60336, term60336.getClass(), "escaped", null);
        setField(term60336, term60336.getClass(), "cfg", null);
        setField(term60336, term60336.getClass(), "joinOp", null);
        setField(term60336, term60336.getClass(), "orderedWorkSet", null);
        term60337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60337, term60337.getClass(), "type", 1265463001);
        setField(term60337, term60337.getClass(), "next", null);
        setIntField(term60338, term60338.getClass(), "type", -2027534003);
        setIntField(term60339, term60339.getClass(), "type", 106);
        setField(term60339, term60339.getClass(), "next", null);
        setField(term60339, term60339.getClass(), "first", null);
        setField(term60339, term60339.getClass(), "last", null);
        setField(term60339, term60339.getClass(), "propListHead", null);
        setIntField(term60339, term60339.getClass(), "sourcePosition", 0);
        setField(term60339, term60339.getClass(), "jsType", null);
        setField(term60339, term60339.getClass(), "parent", null);
        setField(term60338, term60338.getClass(), "next", term60339);
        setIntField(term60340, term60340.getClass(), "type", 1375330971);
        setField(term60340, term60340.getClass(), "next", null);
        setField(term60340, term60340.getClass(), "first", null);
        setField(term60340, term60340.getClass(), "last", null);
        setField(term60340, term60340.getClass(), "propListHead", null);
        setIntField(term60340, term60340.getClass(), "sourcePosition", 0);
        setField(term60340, term60340.getClass(), "jsType", null);
        setField(term60340, term60340.getClass(), "parent", null);
        setField(term60338, term60338.getClass(), "first", term60340);
        setField(term60338, term60338.getClass(), "last", null);
        setField(term60338, term60338.getClass(), "propListHead", null);
        setIntField(term60338, term60338.getClass(), "sourcePosition", 0);
        setField(term60338, term60338.getClass(), "jsType", null);
        setField(term60338, term60338.getClass(), "parent", null);
        setField(term60337, term60337.getClass(), "first", term60338);
        setField(term60337, term60337.getClass(), "last", null);
        setField(term60337, term60337.getClass(), "propListHead", null);
        setIntField(term60337, term60337.getClass(), "sourcePosition", 0);
        setField(term60337, term60337.getClass(), "jsType", null);
        setField(term60337, term60337.getClass(), "parent", null);
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
        args[0] = term53693;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term53623, args);
        assertTrue(recursiveEquals(term53623, term60336));
        assertTrue(recursiveEquals(term53693, term60337));
    }

};


