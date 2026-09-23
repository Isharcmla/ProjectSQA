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

public class MustBeReachingVariableDef_computeMustDef_1796935056156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43915;
     Object term43985;
     Object term44574;
     Object term44575;

    public MustBeReachingVariableDef_computeMustDef_1796935056156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43915 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term43985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43985, term43985.getClass(), "type", 107);
        term44574 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term44574, term44574.getClass(), "jsScope", null);
        setField(term44574, term44574.getClass(), "compiler", null);
        setField(term44574, term44574.getClass(), "escaped", null);
        setField(term44574, term44574.getClass(), "cfg", null);
        setField(term44574, term44574.getClass(), "joinOp", null);
        setField(term44574, term44574.getClass(), "orderedWorkSet", null);
        term44575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44575, term44575.getClass(), "type", 107);
        setField(term44575, term44575.getClass(), "next", null);
        setField(term44575, term44575.getClass(), "first", null);
        setField(term44575, term44575.getClass(), "last", null);
        setField(term44575, term44575.getClass(), "propListHead", null);
        setIntField(term44575, term44575.getClass(), "sourcePosition", 0);
        setField(term44575, term44575.getClass(), "jsType", null);
        setField(term44575, term44575.getClass(), "parent", null);
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
        args[0] = term43985;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term43915, args);
        assertTrue(recursiveEquals(term43915, term44574));
        assertTrue(recursiveEquals(term43985, term44575));
    }

};


