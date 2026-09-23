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

public class TypeCheck_visit_8595247841384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430936;
     Object term431132;

    public TypeCheck_visit_8595247841384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term430936 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term431040 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term430936, term430936.getClass(), "typeRegistry", term431040);
        term431132 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term431224 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term431316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term431408 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term431132, term431132.getClass(), "type", 97);
        setIntField(term431224, term431224.getClass(), "type", 0);
        setField(term431224, term431224.getClass(), "jsType", term431316);
        setField(term431132, term431132.getClass(), "first", term431224);
        setField(term431408, term431408.getClass(), "jsType", null);
        setField(term431132, term431132.getClass(), "last", term431408);
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
        args[1] = term431132;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term430936, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


