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

public class TypeCheck_visit_8595247841180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342758;
     Object term342954;

    public TypeCheck_visit_8595247841180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term342758 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term342862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term342758, term342758.getClass(), "typeRegistry", term342862);
        term342954 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term343046 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term342954, term342954.getClass(), "type", 92);
        setIntField(term343046, term343046.getClass(), "type", 0);
        setField(term343046, term343046.getClass(), "jsType", null);
        setField(term342954, term342954.getClass(), "first", term343046);
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
        args[1] = term342954;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term342758, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


