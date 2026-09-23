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

public class MustBeReachingVariableDef_flowThrough_142447226087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22928;
     Object term22998;
     Object term23268;

    public MustBeReachingVariableDef_flowThrough_142447226087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22928 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term22998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22998, term22998.getClass(), "type", 292681826);
        setIntField(term23068, term23068.getClass(), "type", 493620644);
        setIntField(term23138, term23138.getClass(), "type", 118);
        setField(term23068, term23068.getClass(), "first", term23138);
        setField(term22998, term22998.getClass(), "first", term23068);
        term23268 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term23268, term23268.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term22998;
        args[1] = term23268;
        try {
            callMethod(klass, "flowThrough", argTypes, term22928, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


