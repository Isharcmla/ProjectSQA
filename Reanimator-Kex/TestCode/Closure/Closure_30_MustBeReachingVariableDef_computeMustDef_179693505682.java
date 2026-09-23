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

public class MustBeReachingVariableDef_computeMustDef_179693505682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21270;
     Object term21340;
     Object term22470;
     Object term22471;

    public MustBeReachingVariableDef_computeMustDef_179693505682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21270 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term21340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21340, term21340.getClass(), "type", 1265463001);
        setIntField(term21410, term21410.getClass(), "type", -2027534003);
        setIntField(term21480, term21480.getClass(), "type", 1375330971);
        setField(term21480, term21480.getClass(), "first", null);
        setField(term21480, term21480.getClass(), "next", null);
        setField(term21410, term21410.getClass(), "first", term21480);
        setIntField(term21550, term21550.getClass(), "type", 110);
        setField(term21410, term21410.getClass(), "next", term21550);
        setField(term21340, term21340.getClass(), "first", term21410);
        term22470 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term22470, term22470.getClass(), "jsScope", null);
        setField(term22470, term22470.getClass(), "compiler", null);
        setField(term22470, term22470.getClass(), "escaped", null);
        setField(term22470, term22470.getClass(), "cfg", null);
        setField(term22470, term22470.getClass(), "joinOp", null);
        setField(term22470, term22470.getClass(), "orderedWorkSet", null);
        term22471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22471, term22471.getClass(), "type", 1265463001);
        setField(term22471, term22471.getClass(), "next", null);
        setIntField(term22472, term22472.getClass(), "type", -2027534003);
        setIntField(term22473, term22473.getClass(), "type", 110);
        setField(term22473, term22473.getClass(), "next", null);
        setField(term22473, term22473.getClass(), "first", null);
        setField(term22473, term22473.getClass(), "last", null);
        setField(term22473, term22473.getClass(), "propListHead", null);
        setIntField(term22473, term22473.getClass(), "sourcePosition", 0);
        setField(term22473, term22473.getClass(), "jsType", null);
        setField(term22473, term22473.getClass(), "parent", null);
        setField(term22472, term22472.getClass(), "next", term22473);
        setIntField(term22474, term22474.getClass(), "type", 1375330971);
        setField(term22474, term22474.getClass(), "next", null);
        setField(term22474, term22474.getClass(), "first", null);
        setField(term22474, term22474.getClass(), "last", null);
        setField(term22474, term22474.getClass(), "propListHead", null);
        setIntField(term22474, term22474.getClass(), "sourcePosition", 0);
        setField(term22474, term22474.getClass(), "jsType", null);
        setField(term22474, term22474.getClass(), "parent", null);
        setField(term22472, term22472.getClass(), "first", term22474);
        setField(term22472, term22472.getClass(), "last", null);
        setField(term22472, term22472.getClass(), "propListHead", null);
        setIntField(term22472, term22472.getClass(), "sourcePosition", 0);
        setField(term22472, term22472.getClass(), "jsType", null);
        setField(term22472, term22472.getClass(), "parent", null);
        setField(term22471, term22471.getClass(), "first", term22472);
        setField(term22471, term22471.getClass(), "last", null);
        setField(term22471, term22471.getClass(), "propListHead", null);
        setIntField(term22471, term22471.getClass(), "sourcePosition", 0);
        setField(term22471, term22471.getClass(), "jsType", null);
        setField(term22471, term22471.getClass(), "parent", null);
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
        args[0] = term21340;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term21270, args);
        assertTrue(recursiveEquals(term21270, term22470));
        assertTrue(recursiveEquals(term21340, term22471));
    }

};


