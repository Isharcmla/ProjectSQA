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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3718012;
     Object term3718104;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3718012 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3718104 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3718196 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3718288 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3718380 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3718510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3718196, term3718196.getClass(), "type", 35);
        setIntField(term3718380, term3718380.getClass(), "type", 40);
        setField(term3718380, term3718380.getClass(), "str", "indexOf");
        setField(term3718288, term3718288.getClass(), "next", term3718380);
        setIntField(term3718288, term3718288.getClass(), "type", 40);
        setField(term3718196, term3718196.getClass(), "first", term3718288);
        setIntField(term3718510, term3718510.getClass(), "type", 43);
        setField(term3718196, term3718196.getClass(), "next", term3718510);
        setField(term3718104, term3718104.getClass(), "first", term3718196);
        setIntField(term3718104, term3718104.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3718104;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3718012, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


