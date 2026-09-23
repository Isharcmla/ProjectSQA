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

public class MustBeReachingVariableDef_computeMustDef_1796935056136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37077;
     Object term37169;

    public MustBeReachingVariableDef_computeMustDef_1796935056136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37077 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term37169 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term37261 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term37353 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term37445 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term37537 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term37169, term37169.getClass(), "type", 1265463001);
        setIntField(term37261, term37261.getClass(), "type", -2027534003);
        setIntField(term37353, term37353.getClass(), "type", 1375330971);
        setField(term37353, term37353.getClass(), "first", null);
        setField(term37353, term37353.getClass(), "next", null);
        setField(term37261, term37261.getClass(), "first", term37353);
        setIntField(term37445, term37445.getClass(), "type", 0);
        setField(term37445, term37445.getClass(), "first", null);
        setIntField(term37537, term37537.getClass(), "type", 100);
        setField(term37445, term37445.getClass(), "next", term37537);
        setField(term37261, term37261.getClass(), "next", term37445);
        setField(term37169, term37169.getClass(), "first", term37261);
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
        args[0] = term37169;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeMustDef", argTypes, term37077, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


