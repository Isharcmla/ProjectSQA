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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3590984;
     Object term3591076;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3590984 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3591076 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3591168 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3591260 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3591352 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3591520 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3591168, term3591168.getClass(), "type", 35);
        setIntField(term3591352, term3591352.getClass(), "type", 40);
        setField(term3591352, term3591352.getClass(), "str", "substring");
        setField(term3591260, term3591260.getClass(), "next", term3591352);
        setIntField(term3591260, term3591260.getClass(), "type", 40);
        setField(term3591260, term3591260.getClass(), "str", "");
        setField(term3591168, term3591168.getClass(), "first", term3591260);
        setIntField(term3591520, term3591520.getClass(), "type", 39);
        setDoubleField(term3591520, term3591520.getClass(), "number", 0.0);
        setField(term3591520, term3591520.getClass(), "next", null);
        setField(term3591168, term3591168.getClass(), "next", term3591520);
        setField(term3591076, term3591076.getClass(), "first", term3591168);
        setIntField(term3591076, term3591076.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3591076;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3590984, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


