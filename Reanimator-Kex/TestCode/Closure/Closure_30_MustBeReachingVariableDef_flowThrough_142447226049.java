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

public class MustBeReachingVariableDef_flowThrough_142447226049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10318;
     Object term10388;
     Object term10588;

    public MustBeReachingVariableDef_flowThrough_142447226049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10318 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term10388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10388, term10388.getClass(), "type", 292681826);
        setIntField(term10458, term10458.getClass(), "type", 115);
        setField(term10388, term10388.getClass(), "first", term10458);
        term10588 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term10588, term10588.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term10388;
        args[1] = term10588;
        try {
            callMethod(klass, "flowThrough", argTypes, term10318, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


