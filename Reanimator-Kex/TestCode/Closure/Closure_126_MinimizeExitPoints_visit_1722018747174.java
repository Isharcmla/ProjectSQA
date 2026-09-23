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

public class MinimizeExitPoints_visit_1722018747174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53370;
     Object term53462;

    public MinimizeExitPoints_visit_1722018747174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53370 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term53462 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term53554 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term53462, term53462.getClass(), "type", 114);
        setIntField(term53554, term53554.getClass(), "type", 117);
        setField(term53462, term53462.getClass(), "first", term53554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term53462;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term53370, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


