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

public class MustBeReachingVariableDef_computeMustDef_1796935056126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34090;
     Object term34160;
     Object term35195;
     Object term35196;

    public MustBeReachingVariableDef_computeMustDef_1796935056126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34090 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term34160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34160, term34160.getClass(), "type", 1265463001);
        setIntField(term34230, term34230.getClass(), "type", 123);
        setField(term34160, term34160.getClass(), "first", term34230);
        term35195 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term35195, term35195.getClass(), "jsScope", null);
        setField(term35195, term35195.getClass(), "compiler", null);
        setField(term35195, term35195.getClass(), "escaped", null);
        setField(term35195, term35195.getClass(), "cfg", null);
        setField(term35195, term35195.getClass(), "joinOp", null);
        setField(term35195, term35195.getClass(), "orderedWorkSet", null);
        term35196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35196, term35196.getClass(), "type", 1265463001);
        setField(term35196, term35196.getClass(), "next", null);
        setIntField(term35197, term35197.getClass(), "type", 123);
        setField(term35197, term35197.getClass(), "next", null);
        setField(term35197, term35197.getClass(), "first", null);
        setField(term35197, term35197.getClass(), "last", null);
        setField(term35197, term35197.getClass(), "propListHead", null);
        setIntField(term35197, term35197.getClass(), "sourcePosition", 0);
        setField(term35197, term35197.getClass(), "jsType", null);
        setField(term35197, term35197.getClass(), "parent", null);
        setField(term35196, term35196.getClass(), "first", term35197);
        setField(term35196, term35196.getClass(), "last", null);
        setField(term35196, term35196.getClass(), "propListHead", null);
        setIntField(term35196, term35196.getClass(), "sourcePosition", 0);
        setField(term35196, term35196.getClass(), "jsType", null);
        setField(term35196, term35196.getClass(), "parent", null);
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
        args[0] = term34160;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term34090, args);
        assertTrue(recursiveEquals(term34090, term35195));
        assertTrue(recursiveEquals(term34160, term35196));
    }

};


