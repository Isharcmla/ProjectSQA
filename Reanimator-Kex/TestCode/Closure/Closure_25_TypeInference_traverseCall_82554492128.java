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

public class TypeInference_traverseCall_82554492128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38961;
     Object term39031;

    public TypeInference_traverseCall_82554492128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38961 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term39031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39101, term39101.getClass(), "type", 1935707624);
        setField(term39101, term39101.getClass(), "propListHead", null);
        setIntField(term39171, term39171.getClass(), "type", 16);
        setField(term39101, term39101.getClass(), "next", term39171);
        setField(term39031, term39031.getClass(), "first", term39101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term39031;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term38961, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


