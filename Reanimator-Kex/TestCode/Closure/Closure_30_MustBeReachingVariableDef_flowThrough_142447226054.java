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

public class MustBeReachingVariableDef_flowThrough_142447226054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12138;
     Object term12208;
     Object term12478;

    public MustBeReachingVariableDef_flowThrough_142447226054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12138 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term12208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12208, term12208.getClass(), "type", 292681826);
        setIntField(term12278, term12278.getClass(), "type", 493620644);
        setIntField(term12348, term12348.getClass(), "type", 106);
        setField(term12278, term12278.getClass(), "first", term12348);
        setField(term12208, term12208.getClass(), "first", term12278);
        term12478 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term12478, term12478.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term12208;
        args[1] = term12478;
        try {
            callMethod(klass, "flowThrough", argTypes, term12138, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


