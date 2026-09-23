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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4498806;
     Object term4498898;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4498806 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4498898 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4498990 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4499082 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4499174 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4499342 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4498990, term4498990.getClass(), "type", 35);
        setIntField(term4499174, term4499174.getClass(), "type", 40);
        setField(term4499174, term4499174.getClass(), "str", "indexOf");
        setField(term4499082, term4499082.getClass(), "next", term4499174);
        setIntField(term4499082, term4499082.getClass(), "type", 40);
        setField(term4499082, term4499082.getClass(), "str", "");
        setField(term4498990, term4498990.getClass(), "first", term4499082);
        setIntField(term4499342, term4499342.getClass(), "type", 39);
        setField(term4499342, term4499342.getClass(), "next", null);
        setDoubleField(term4499342, term4499342.getClass(), "number", 4.6116860184273879E18);
        setField(term4498990, term4498990.getClass(), "next", term4499342);
        setField(term4498898, term4498898.getClass(), "first", term4498990);
        setIntField(term4498898, term4498898.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4498898;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term4498806, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


