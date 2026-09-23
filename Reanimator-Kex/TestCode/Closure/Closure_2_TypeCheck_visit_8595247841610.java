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

public class TypeCheck_visit_8595247841610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539280;
     Object term539476;

    public TypeCheck_visit_8595247841610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term539280 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term539384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term539280, term539280.getClass(), "typeRegistry", term539384);
        term539476 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term539568 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term539476, term539476.getClass(), "type", 97);
        setIntField(term539568, term539568.getClass(), "type", 0);
        setField(term539568, term539568.getClass(), "jsType", null);
        setField(term539476, term539476.getClass(), "first", term539568);
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
        args[1] = term539476;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term539280, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


