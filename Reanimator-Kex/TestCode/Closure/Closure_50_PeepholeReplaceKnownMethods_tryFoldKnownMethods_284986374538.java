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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3509082;
     Object term3509174;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3509082 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3509174 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3509266 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3509358 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3509450 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3509578 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term3509266, term3509266.getClass(), "type", 35);
        setIntField(term3509450, term3509450.getClass(), "type", 40);
        setField(term3509450, term3509450.getClass(), "str", "charAt");
        setField(term3509358, term3509358.getClass(), "next", term3509450);
        setIntField(term3509358, term3509358.getClass(), "type", 40);
        setField(term3509266, term3509266.getClass(), "first", term3509358);
        setIntField(term3509578, term3509578.getClass(), "type", 39);
        setField(term3509266, term3509266.getClass(), "next", term3509578);
        setField(term3509174, term3509174.getClass(), "first", term3509266);
        setIntField(term3509174, term3509174.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3509174;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3509082, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


