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

public class MustBeReachingVariableDef_computeMustDef_1796935056212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160728;
     Object term160820;

    public MustBeReachingVariableDef_computeMustDef_1796935056212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160728 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term160820 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term160912 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term161004 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term161096 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term161188 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term160820, term160820.getClass(), "type", 1265463001);
        setIntField(term160912, term160912.getClass(), "type", -2027534003);
        setIntField(term161004, term161004.getClass(), "type", 1375330971);
        setField(term161004, term161004.getClass(), "first", null);
        setField(term161004, term161004.getClass(), "next", null);
        setField(term160912, term160912.getClass(), "first", term161004);
        setIntField(term161096, term161096.getClass(), "type", 0);
        setIntField(term161188, term161188.getClass(), "type", 98);
        setField(term161096, term161096.getClass(), "first", term161188);
        setField(term160912, term160912.getClass(), "next", term161096);
        setField(term160820, term160820.getClass(), "first", term160912);
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
        args[0] = term160820;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeMustDef", argTypes, term160728, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


