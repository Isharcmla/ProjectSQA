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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4470222;
     Object term4470314;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4470222 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4470314 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4470406 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4470498 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4470590 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4470720 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4470406, term4470406.getClass(), "type", 35);
        setIntField(term4470590, term4470590.getClass(), "type", 40);
        setField(term4470590, term4470590.getClass(), "str", "lastIndexOf");
        setField(term4470498, term4470498.getClass(), "next", term4470590);
        setIntField(term4470498, term4470498.getClass(), "type", 40);
        setField(term4470406, term4470406.getClass(), "first", term4470498);
        setIntField(term4470720, term4470720.getClass(), "type", 39);
        setField(term4470406, term4470406.getClass(), "next", term4470720);
        setField(term4470314, term4470314.getClass(), "first", term4470406);
        setIntField(term4470314, term4470314.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4470314;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term4470222, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


