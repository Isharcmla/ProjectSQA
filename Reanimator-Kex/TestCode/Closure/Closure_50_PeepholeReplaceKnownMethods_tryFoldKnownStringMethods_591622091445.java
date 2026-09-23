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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3206070;
     Object term3206162;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3206070 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3206162 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3206254 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3206346 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3206438 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3206508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3206162, term3206162.getClass(), "type", 37);
        setIntField(term3206254, term3206254.getClass(), "type", 35);
        setIntField(term3206438, term3206438.getClass(), "type", 40);
        setField(term3206438, term3206438.getClass(), "str", null);
        setField(term3206346, term3206346.getClass(), "next", term3206438);
        setIntField(term3206346, term3206346.getClass(), "type", 40);
        setField(term3206254, term3206254.getClass(), "first", term3206346);
        setIntField(term3206508, term3206508.getClass(), "type", 40);
        setField(term3206254, term3206254.getClass(), "next", term3206508);
        setField(term3206162, term3206162.getClass(), "first", term3206254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3206162;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3206070, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


