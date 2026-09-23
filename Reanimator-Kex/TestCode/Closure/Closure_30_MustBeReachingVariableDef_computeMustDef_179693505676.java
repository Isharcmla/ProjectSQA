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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MustBeReachingVariableDef_computeMustDef_179693505676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19338;
     Object term19408;

    public MustBeReachingVariableDef_computeMustDef_179693505676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19338 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term19408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19408, term19408.getClass(), "type", 1265463001);
        setIntField(term19478, term19478.getClass(), "type", -2027534003);
        setIntField(term19548, term19548.getClass(), "type", 115);
        setField(term19478, term19478.getClass(), "first", term19548);
        setField(term19408, term19408.getClass(), "first", term19478);
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
        args[0] = term19408;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeMustDef", argTypes, term19338, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


