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

public class MustBeReachingVariableDef_flowThrough_142447226093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24324;
     Object term24394;
     Object term24524;

    public MustBeReachingVariableDef_flowThrough_142447226093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24324 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term24394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24394, term24394.getClass(), "type", 113);
        term24524 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term24524, term24524.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term24394;
        args[1] = term24524;
        try {
            callMethod(klass, "flowThrough", argTypes, term24324, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


