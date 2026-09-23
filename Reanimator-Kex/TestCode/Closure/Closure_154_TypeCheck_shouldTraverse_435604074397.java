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

public class TypeCheck_shouldTraverse_435604074397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109020;
     Object term109112;

    public TypeCheck_shouldTraverse_435604074397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109020 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term109020, term109020.getClass(), "validator", null);
        setIntField(term109020, term109020.getClass(), "noTypeCheckSection", -1);
        term109112 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term109112, term109112.getClass(), "type", 105);
        setField(term109112, term109112.getClass(), "propListHead", null);
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
        args[1] = term109112;
        args[2] = null;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term109020, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


