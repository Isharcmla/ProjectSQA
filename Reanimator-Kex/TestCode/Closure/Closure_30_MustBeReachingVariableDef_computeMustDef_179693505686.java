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

public class MustBeReachingVariableDef_computeMustDef_179693505686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22602;
     Object term22672;
     Object term23291;
     Object term23292;

    public MustBeReachingVariableDef_computeMustDef_179693505686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22602 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term22672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22672, term22672.getClass(), "type", 117);
        term23291 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term23291, term23291.getClass(), "jsScope", null);
        setField(term23291, term23291.getClass(), "compiler", null);
        setField(term23291, term23291.getClass(), "escaped", null);
        setField(term23291, term23291.getClass(), "cfg", null);
        setField(term23291, term23291.getClass(), "joinOp", null);
        setField(term23291, term23291.getClass(), "orderedWorkSet", null);
        term23292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23292, term23292.getClass(), "type", 117);
        setField(term23292, term23292.getClass(), "next", null);
        setField(term23292, term23292.getClass(), "first", null);
        setField(term23292, term23292.getClass(), "last", null);
        setField(term23292, term23292.getClass(), "propListHead", null);
        setIntField(term23292, term23292.getClass(), "sourcePosition", 0);
        setField(term23292, term23292.getClass(), "jsType", null);
        setField(term23292, term23292.getClass(), "parent", null);
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
        args[0] = term22672;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term22602, args);
        assertTrue(recursiveEquals(term22602, term23291));
        assertTrue(recursiveEquals(term22672, term23292));
    }

};


