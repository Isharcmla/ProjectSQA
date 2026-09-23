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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3819902;
     Object term3819988;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3819902 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3819988 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3820080 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3820172 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3820264 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3820388 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3820474 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3819988, term3819988.getClass(), "type", 37);
        setIntField(term3820080, term3820080.getClass(), "type", 33);
        setIntField(term3820264, term3820264.getClass(), "type", 40);
        setField(term3820264, term3820264.getClass(), "str", "indexOf");
        setField(term3820172, term3820172.getClass(), "next", term3820264);
        setIntField(term3820172, term3820172.getClass(), "type", 40);
        setField(term3820172, term3820172.getClass(), "str", null);
        setField(term3820080, term3820080.getClass(), "first", term3820172);
        setIntField(term3820388, term3820388.getClass(), "type", 44);
        setField(term3820474, term3820474.getClass(), "next", null);
        setIntField(term3820474, term3820474.getClass(), "type", 39);
        setField(term3820388, term3820388.getClass(), "next", term3820474);
        setField(term3820080, term3820080.getClass(), "next", term3820388);
        setField(term3819988, term3819988.getClass(), "first", term3820080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3819988;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3819902, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


