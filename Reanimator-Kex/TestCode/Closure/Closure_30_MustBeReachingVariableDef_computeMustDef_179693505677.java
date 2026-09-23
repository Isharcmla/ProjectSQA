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

public class MustBeReachingVariableDef_computeMustDef_179693505677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19791;
     Object term19861;
     Object term20504;
     Object term20505;

    public MustBeReachingVariableDef_computeMustDef_179693505677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19791 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term19861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19861, term19861.getClass(), "type", 1265463001);
        setIntField(term19931, term19931.getClass(), "type", -2027534003);
        setIntField(term20001, term20001.getClass(), "type", 107);
        setField(term19931, term19931.getClass(), "first", term20001);
        setField(term19861, term19861.getClass(), "first", term19931);
        term20504 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term20504, term20504.getClass(), "jsScope", null);
        setField(term20504, term20504.getClass(), "compiler", null);
        setField(term20504, term20504.getClass(), "escaped", null);
        setField(term20504, term20504.getClass(), "cfg", null);
        setField(term20504, term20504.getClass(), "joinOp", null);
        setField(term20504, term20504.getClass(), "orderedWorkSet", null);
        term20505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20505, term20505.getClass(), "type", 1265463001);
        setField(term20505, term20505.getClass(), "next", null);
        setIntField(term20506, term20506.getClass(), "type", -2027534003);
        setField(term20506, term20506.getClass(), "next", null);
        setIntField(term20507, term20507.getClass(), "type", 107);
        setField(term20507, term20507.getClass(), "next", null);
        setField(term20507, term20507.getClass(), "first", null);
        setField(term20507, term20507.getClass(), "last", null);
        setField(term20507, term20507.getClass(), "propListHead", null);
        setIntField(term20507, term20507.getClass(), "sourcePosition", 0);
        setField(term20507, term20507.getClass(), "jsType", null);
        setField(term20507, term20507.getClass(), "parent", null);
        setField(term20506, term20506.getClass(), "first", term20507);
        setField(term20506, term20506.getClass(), "last", null);
        setField(term20506, term20506.getClass(), "propListHead", null);
        setIntField(term20506, term20506.getClass(), "sourcePosition", 0);
        setField(term20506, term20506.getClass(), "jsType", null);
        setField(term20506, term20506.getClass(), "parent", null);
        setField(term20505, term20505.getClass(), "first", term20506);
        setField(term20505, term20505.getClass(), "last", null);
        setField(term20505, term20505.getClass(), "propListHead", null);
        setIntField(term20505, term20505.getClass(), "sourcePosition", 0);
        setField(term20505, term20505.getClass(), "jsType", null);
        setField(term20505, term20505.getClass(), "parent", null);
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
        args[0] = term19861;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term19791, args);
        assertTrue(recursiveEquals(term19791, term20504));
        assertTrue(recursiveEquals(term19861, term20505));
    }

};


