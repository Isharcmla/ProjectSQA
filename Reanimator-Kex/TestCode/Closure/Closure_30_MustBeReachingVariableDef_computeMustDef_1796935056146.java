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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MustBeReachingVariableDef_computeMustDef_1796935056146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40070;
     Object term40140;

    public MustBeReachingVariableDef_computeMustDef_1796935056146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40070 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term40140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40140, term40140.getClass(), "type", 1265463001);
        setIntField(term40210, term40210.getClass(), "type", -2027534003);
        setIntField(term40280, term40280.getClass(), "type", 1375330971);
        setField(term40280, term40280.getClass(), "first", null);
        setField(term40280, term40280.getClass(), "next", null);
        setField(term40210, term40210.getClass(), "first", term40280);
        setIntField(term40350, term40350.getClass(), "type", 101);
        setField(term40210, term40210.getClass(), "next", term40350);
        setField(term40140, term40140.getClass(), "first", term40210);
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
        args[0] = term40140;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeMustDef", argTypes, term40070, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


