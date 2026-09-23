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

public class TypeCheck_visit_8595247841135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327271;
     Object term327363;

    public TypeCheck_visit_8595247841135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327271 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term327271, term327271.getClass(), "validator", null);
        term327363 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term327455 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term327559 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term327363, term327363.getClass(), "type", 52);
        setField(term327455, term327455.getClass(), "jsType", term327559);
        setField(term327363, term327363.getClass(), "first", term327455);
        setField(term327363, term327363.getClass(), "last", term327455);
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
        args[1] = term327363;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term327271, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


