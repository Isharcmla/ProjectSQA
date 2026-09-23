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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MustBeReachingVariableDef_computeMustDef_1796935056195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54093;
     Object term54163;

    public MustBeReachingVariableDef_computeMustDef_1796935056195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54093 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term54163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54163, term54163.getClass(), "type", 1265463001);
        setIntField(term54233, term54233.getClass(), "type", -2027534003);
        setIntField(term54303, term54303.getClass(), "type", 109);
        setField(term54303, term54303.getClass(), "first", null);
        setField(term54303, term54303.getClass(), "next", term54233);
        setField(term54233, term54233.getClass(), "first", term54303);
        setField(term54163, term54163.getClass(), "first", term54233);
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
        args[0] = term54163;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeMustDef", argTypes, term54093, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


