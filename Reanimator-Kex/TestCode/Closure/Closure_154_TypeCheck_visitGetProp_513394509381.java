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

public class TypeCheck_visitGetProp_513394509381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104593;
     Object term104685;

    public TypeCheck_visitGetProp_513394509381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104593 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term104685 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term104755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104847 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term104939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setField(term104685, term104685.getClass(), "jsType", null);
        setField(term104685, term104685.getClass(), "last", term104755);
        setField(term104847, term104847.getClass(), "jsType", term104939);
        setField(term104685, term104685.getClass(), "first", term104847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term104685;
        args[2] = null;
        try {
            callMethod(klass, "visitGetProp", argTypes, term104593, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


