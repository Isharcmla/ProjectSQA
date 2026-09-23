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

public class TypeCheck_shouldTraverse_435604074546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144910;
     Object term145002;

    public TypeCheck_shouldTraverse_435604074546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144910 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term144910, term144910.getClass(), "validator", null);
        setIntField(term144910, term144910.getClass(), "noTypeCheckSection", -1);
        term145002 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term145002, term145002.getClass(), "type", 86);
        setField(term145002, term145002.getClass(), "propListHead", null);
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
        args[1] = term145002;
        args[2] = null;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term144910, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


