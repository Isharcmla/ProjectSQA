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

public class TypeCheck_shouldTraverse_435604074778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211729;
     Object term211889;

    public TypeCheck_shouldTraverse_435604074778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211729 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term211819 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term211729, term211729.getClass(), "validator", term211819);
        setIntField(term211729, term211729.getClass(), "noTypeCheckSection", -1);
        term211889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term211889, term211889.getClass(), "type", 105);
        setField(term211889, term211889.getClass(), "propListHead", null);
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
        args[1] = term211889;
        args[2] = null;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term211729, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


