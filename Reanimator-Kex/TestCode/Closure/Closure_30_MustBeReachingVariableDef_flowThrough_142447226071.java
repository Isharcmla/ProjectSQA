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

public class MustBeReachingVariableDef_flowThrough_142447226071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18210;
     Object term18280;
     Object term18550;

    public MustBeReachingVariableDef_flowThrough_142447226071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18210 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term18280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18280, term18280.getClass(), "type", 292681826);
        setIntField(term18350, term18350.getClass(), "type", 493620644);
        setIntField(term18420, term18420.getClass(), "type", 124);
        setField(term18350, term18350.getClass(), "first", term18420);
        setField(term18280, term18280.getClass(), "first", term18350);
        term18550 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term18550, term18550.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term18280;
        args[1] = term18550;
        try {
            callMethod(klass, "flowThrough", argTypes, term18210, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


