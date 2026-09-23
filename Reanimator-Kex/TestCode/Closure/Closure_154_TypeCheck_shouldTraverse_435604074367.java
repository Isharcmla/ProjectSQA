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

public class TypeCheck_shouldTraverse_435604074367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101371;
     Object term101463;

    public TypeCheck_shouldTraverse_435604074367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101371 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term101371, term101371.getClass(), "validator", null);
        setIntField(term101371, term101371.getClass(), "noTypeCheckSection", -1);
        term101463 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term101463, term101463.getClass(), "type", 132);
        setField(term101463, term101463.getClass(), "propListHead", null);
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
        args[1] = term101463;
        args[2] = null;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term101371, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


