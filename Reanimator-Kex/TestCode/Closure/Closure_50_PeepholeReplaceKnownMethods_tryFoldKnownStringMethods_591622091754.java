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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3646942;
     Object term3647028;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3646942 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3647028 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3647120 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3647212 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3647304 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3647466 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3647028, term3647028.getClass(), "type", 37);
        setIntField(term3647120, term3647120.getClass(), "type", 35);
        setIntField(term3647304, term3647304.getClass(), "type", 40);
        setField(term3647304, term3647304.getClass(), "str", "lastIndexOf");
        setField(term3647212, term3647212.getClass(), "next", term3647304);
        setIntField(term3647212, term3647212.getClass(), "type", 40);
        setField(term3647212, term3647212.getClass(), "str", "");
        setField(term3647120, term3647120.getClass(), "first", term3647212);
        setIntField(term3647466, term3647466.getClass(), "type", 44);
        setField(term3647466, term3647466.getClass(), "next", null);
        setField(term3647120, term3647120.getClass(), "next", term3647466);
        setField(term3647028, term3647028.getClass(), "first", term3647120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3647028;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3646942, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


