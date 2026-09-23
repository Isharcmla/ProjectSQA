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

public class TypeCheck_visit_8595247841466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453291;
     Object term453383;

    public TypeCheck_visit_8595247841466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453291 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term453291, term453291.getClass(), "validator", null);
        term453383 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term453475 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term453579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term453383, term453383.getClass(), "type", 52);
        setField(term453475, term453475.getClass(), "jsType", term453579);
        setField(term453383, term453383.getClass(), "first", term453475);
        setField(term453383, term453383.getClass(), "last", term453475);
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
        args[1] = term453383;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term453291, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


