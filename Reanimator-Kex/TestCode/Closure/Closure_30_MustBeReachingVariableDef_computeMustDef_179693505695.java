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

public class MustBeReachingVariableDef_computeMustDef_179693505695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25281;
     Object term25373;

    public MustBeReachingVariableDef_computeMustDef_179693505695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25281 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term25373 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term25465 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term25557 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term25373, term25373.getClass(), "type", 1265463001);
        setIntField(term25465, term25465.getClass(), "type", -2027534003);
        setIntField(term25557, term25557.getClass(), "type", 108);
        setField(term25465, term25465.getClass(), "first", term25557);
        setField(term25373, term25373.getClass(), "first", term25465);
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
        args[0] = term25373;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeMustDef", argTypes, term25281, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


