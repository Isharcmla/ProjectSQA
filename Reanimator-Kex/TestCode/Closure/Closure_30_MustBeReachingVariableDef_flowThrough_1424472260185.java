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

public class MustBeReachingVariableDef_flowThrough_1424472260185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49560;
     Object term49630;
     Object term49970;

    public MustBeReachingVariableDef_flowThrough_1424472260185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49560 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term49630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49630, term49630.getClass(), "type", 292681826);
        setIntField(term49700, term49700.getClass(), "type", 493620644);
        setIntField(term49770, term49770.getClass(), "type", 1596070772);
        setField(term49770, term49770.getClass(), "first", null);
        setField(term49770, term49770.getClass(), "next", null);
        setField(term49700, term49700.getClass(), "first", term49770);
        setIntField(term49840, term49840.getClass(), "type", 100);
        setField(term49700, term49700.getClass(), "next", term49840);
        setField(term49630, term49630.getClass(), "first", term49700);
        term49970 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term49970, term49970.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term49630;
        args[1] = term49970;
        try {
            callMethod(klass, "flowThrough", argTypes, term49560, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


