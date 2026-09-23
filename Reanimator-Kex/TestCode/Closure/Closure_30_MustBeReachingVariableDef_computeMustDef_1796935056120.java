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

public class MustBeReachingVariableDef_computeMustDef_1796935056120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32662;
     Object term32732;
     Object term33341;
     Object term33342;

    public MustBeReachingVariableDef_computeMustDef_1796935056120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32662 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term32732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32732, term32732.getClass(), "type", 118);
        term33341 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term33341, term33341.getClass(), "jsScope", null);
        setField(term33341, term33341.getClass(), "compiler", null);
        setField(term33341, term33341.getClass(), "escaped", null);
        setField(term33341, term33341.getClass(), "cfg", null);
        setField(term33341, term33341.getClass(), "joinOp", null);
        setField(term33341, term33341.getClass(), "orderedWorkSet", null);
        term33342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33342, term33342.getClass(), "type", 118);
        setField(term33342, term33342.getClass(), "next", null);
        setField(term33342, term33342.getClass(), "first", null);
        setField(term33342, term33342.getClass(), "last", null);
        setField(term33342, term33342.getClass(), "propListHead", null);
        setIntField(term33342, term33342.getClass(), "sourcePosition", 0);
        setField(term33342, term33342.getClass(), "jsType", null);
        setField(term33342, term33342.getClass(), "parent", null);
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
        args[0] = term32732;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term32662, args);
        assertTrue(recursiveEquals(term32662, term33341));
        assertTrue(recursiveEquals(term32732, term33342));
    }

};


