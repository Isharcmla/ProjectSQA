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

public class MustBeReachingVariableDef_flowThrough_142447226089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23661;
     Object term23731;
     Object term24001;

    public MustBeReachingVariableDef_flowThrough_142447226089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23661 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term23731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23731, term23731.getClass(), "type", 292681826);
        setIntField(term23801, term23801.getClass(), "type", 493620644);
        setIntField(term23871, term23871.getClass(), "type", 104);
        setField(term23801, term23801.getClass(), "first", term23871);
        setField(term23731, term23731.getClass(), "first", term23801);
        term24001 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term24001, term24001.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term23731;
        args[1] = term24001;
        try {
            callMethod(klass, "flowThrough", argTypes, term23661, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


