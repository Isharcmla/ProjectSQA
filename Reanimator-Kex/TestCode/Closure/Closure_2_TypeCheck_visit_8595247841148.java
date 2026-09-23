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

public class TypeCheck_visit_8595247841148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329075;
     Object term329167;

    public TypeCheck_visit_8595247841148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329075 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term329167 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term329259 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term329167, term329167.getClass(), "type", 15);
        setField(term329167, term329167.getClass(), "first", term329259);
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
        args[1] = term329167;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term329075, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


