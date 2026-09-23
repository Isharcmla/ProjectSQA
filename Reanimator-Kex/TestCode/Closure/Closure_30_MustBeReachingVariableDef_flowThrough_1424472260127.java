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

public class MustBeReachingVariableDef_flowThrough_1424472260127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34735;
     Object term34805;
     Object term35145;

    public MustBeReachingVariableDef_flowThrough_1424472260127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34735 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term34805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34805, term34805.getClass(), "type", 292681826);
        setIntField(term34875, term34875.getClass(), "type", 493620644);
        setIntField(term34945, term34945.getClass(), "type", 1596070772);
        setField(term34945, term34945.getClass(), "first", null);
        setField(term34945, term34945.getClass(), "next", null);
        setField(term34875, term34875.getClass(), "first", term34945);
        setIntField(term35015, term35015.getClass(), "type", 116);
        setField(term34875, term34875.getClass(), "next", term35015);
        setField(term34805, term34805.getClass(), "first", term34875);
        term35145 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term35145, term35145.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term34805;
        args[1] = term35145;
        try {
            callMethod(klass, "flowThrough", argTypes, term34735, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


