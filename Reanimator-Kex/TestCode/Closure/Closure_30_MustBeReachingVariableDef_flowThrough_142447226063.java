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

public class MustBeReachingVariableDef_flowThrough_142447226063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15416;
     Object term15486;
     Object term15756;

    public MustBeReachingVariableDef_flowThrough_142447226063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15416 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term15486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15486, term15486.getClass(), "type", 292681826);
        setIntField(term15556, term15556.getClass(), "type", 493620644);
        setIntField(term15626, term15626.getClass(), "type", 110);
        setField(term15556, term15556.getClass(), "first", term15626);
        setField(term15486, term15486.getClass(), "first", term15556);
        term15756 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term15756, term15756.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term15486;
        args[1] = term15756;
        try {
            callMethod(klass, "flowThrough", argTypes, term15416, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


