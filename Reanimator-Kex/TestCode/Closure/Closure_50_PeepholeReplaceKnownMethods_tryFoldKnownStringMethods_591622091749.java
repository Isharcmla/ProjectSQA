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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3643050;
     Object term3643136;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3643050 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3643136 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3643228 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3643320 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3643412 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3643542 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3643628 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3643136, term3643136.getClass(), "type", 37);
        setIntField(term3643228, term3643228.getClass(), "type", 33);
        setIntField(term3643412, term3643412.getClass(), "type", 40);
        setField(term3643412, term3643412.getClass(), "str", "indexOf");
        setField(term3643320, term3643320.getClass(), "next", term3643412);
        setIntField(term3643320, term3643320.getClass(), "type", 40);
        setField(term3643320, term3643320.getClass(), "str", "indexOf");
        setField(term3643228, term3643228.getClass(), "first", term3643320);
        setIntField(term3643542, term3643542.getClass(), "type", 44);
        setField(term3643542, term3643542.getClass(), "next", null);
        setField(term3643228, term3643228.getClass(), "next", term3643542);
        setField(term3643136, term3643136.getClass(), "first", term3643228);
        setField(term3643136, term3643136.getClass(), "parent", term3643628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3643136;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3643050, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


