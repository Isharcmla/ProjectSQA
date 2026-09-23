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

public class MustBeReachingVariableDef_computeMustDef_179693505658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13870;
     Object term13940;

    public MustBeReachingVariableDef_computeMustDef_179693505658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13870 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term13940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13940, term13940.getClass(), "type", 1265463001);
        setIntField(term14010, term14010.getClass(), "type", -2027534003);
        setIntField(term14080, term14080.getClass(), "type", 102);
        setField(term14010, term14010.getClass(), "first", term14080);
        setField(term13940, term13940.getClass(), "first", term14010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term13940;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeMustDef", argTypes, term13870, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


