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

public class MustBeReachingVariableDef_flowThrough_1424472260186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50195;
     Object term50265;
     Object term50605;

    public MustBeReachingVariableDef_flowThrough_1424472260186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50195 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term50265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50265, term50265.getClass(), "type", 292681826);
        setIntField(term50335, term50335.getClass(), "type", 493620644);
        setIntField(term50405, term50405.getClass(), "type", 1596070772);
        setField(term50405, term50405.getClass(), "first", null);
        setField(term50405, term50405.getClass(), "next", null);
        setField(term50335, term50335.getClass(), "first", term50405);
        setIntField(term50475, term50475.getClass(), "type", 107);
        setField(term50335, term50335.getClass(), "next", term50475);
        setField(term50265, term50265.getClass(), "first", term50335);
        term50605 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term50605, term50605.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term50265;
        args[1] = term50605;
        try {
            callMethod(klass, "flowThrough", argTypes, term50195, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


