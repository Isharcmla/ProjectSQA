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

public class MustBeReachingVariableDef_computeMustDef_179693505637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6903;
     Object term6973;
     Object term7282;
     Object term7283;

    public MustBeReachingVariableDef_computeMustDef_179693505637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6903 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term6973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6973, term6973.getClass(), "type", 1265463001);
        setIntField(term7043, term7043.getClass(), "type", -2027534003);
        setIntField(term7113, term7113.getClass(), "type", 110);
        setField(term7043, term7043.getClass(), "first", term7113);
        setField(term6973, term6973.getClass(), "first", term7043);
        term7282 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term7282, term7282.getClass(), "jsScope", null);
        setField(term7282, term7282.getClass(), "compiler", null);
        setField(term7282, term7282.getClass(), "escaped", null);
        setField(term7282, term7282.getClass(), "cfg", null);
        setField(term7282, term7282.getClass(), "joinOp", null);
        setField(term7282, term7282.getClass(), "orderedWorkSet", null);
        term7283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7283, term7283.getClass(), "type", 1265463001);
        setField(term7283, term7283.getClass(), "next", null);
        setIntField(term7284, term7284.getClass(), "type", -2027534003);
        setField(term7284, term7284.getClass(), "next", null);
        setIntField(term7285, term7285.getClass(), "type", 110);
        setField(term7285, term7285.getClass(), "next", null);
        setField(term7285, term7285.getClass(), "first", null);
        setField(term7285, term7285.getClass(), "last", null);
        setField(term7285, term7285.getClass(), "propListHead", null);
        setIntField(term7285, term7285.getClass(), "sourcePosition", 0);
        setField(term7285, term7285.getClass(), "jsType", null);
        setField(term7285, term7285.getClass(), "parent", null);
        setField(term7284, term7284.getClass(), "first", term7285);
        setField(term7284, term7284.getClass(), "last", null);
        setField(term7284, term7284.getClass(), "propListHead", null);
        setIntField(term7284, term7284.getClass(), "sourcePosition", 0);
        setField(term7284, term7284.getClass(), "jsType", null);
        setField(term7284, term7284.getClass(), "parent", null);
        setField(term7283, term7283.getClass(), "first", term7284);
        setField(term7283, term7283.getClass(), "last", null);
        setField(term7283, term7283.getClass(), "propListHead", null);
        setIntField(term7283, term7283.getClass(), "sourcePosition", 0);
        setField(term7283, term7283.getClass(), "jsType", null);
        setField(term7283, term7283.getClass(), "parent", null);
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
        args[0] = term6973;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term6903, args);
        assertTrue(recursiveEquals(term6903, term7282));
        assertTrue(recursiveEquals(term6973, term7283));
    }

};


