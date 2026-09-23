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

public class MustBeReachingVariableDef_flowThrough_142447226055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12957;
     Object term13027;
     Object term13367;

    public MustBeReachingVariableDef_flowThrough_142447226055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12957 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term13027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13027, term13027.getClass(), "type", 292681826);
        setIntField(term13097, term13097.getClass(), "type", 493620644);
        setIntField(term13167, term13167.getClass(), "type", 1596070772);
        setField(term13167, term13167.getClass(), "first", null);
        setField(term13167, term13167.getClass(), "next", null);
        setField(term13097, term13097.getClass(), "first", term13167);
        setIntField(term13237, term13237.getClass(), "type", 117);
        setField(term13097, term13097.getClass(), "next", term13237);
        setField(term13027, term13027.getClass(), "first", term13097);
        term13367 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term13367, term13367.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term13027;
        args[1] = term13367;
        try {
            callMethod(klass, "flowThrough", argTypes, term12957, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


