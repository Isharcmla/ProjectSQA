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

public class TypeCheck_visit_8595247841166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337284;
     Object term337376;

    public TypeCheck_visit_8595247841166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337284 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term337284, term337284.getClass(), "validator", null);
        term337376 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term337468 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term337568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term337376, term337376.getClass(), "type", 28);
        setField(term337468, term337468.getClass(), "jsType", term337568);
        setField(term337376, term337376.getClass(), "first", term337468);
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
        args[1] = term337376;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term337284, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


