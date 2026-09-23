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

public class MustBeReachingVariableDef_flowThrough_142447226094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24745;
     Object term24815;
     Object term25107;

    public MustBeReachingVariableDef_flowThrough_142447226094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24745 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term24815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24977 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term24815, term24815.getClass(), "type", 292681826);
        setIntField(term24885, term24885.getClass(), "type", 493620644);
        setIntField(term24977, term24977.getClass(), "type", 1596070772);
        setField(term24977, term24977.getClass(), "first", null);
        setField(term24977, term24977.getClass(), "next", null);
        setField(term24885, term24885.getClass(), "first", term24977);
        setField(term24885, term24885.getClass(), "next", term24977);
        setField(term24815, term24815.getClass(), "first", term24885);
        term25107 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term25107, term25107.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term24815;
        args[1] = term25107;
        try {
            callMethod(klass, "flowThrough", argTypes, term24745, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


