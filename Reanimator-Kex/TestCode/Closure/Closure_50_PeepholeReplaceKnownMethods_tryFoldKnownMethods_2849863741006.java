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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4208908;
     Object term4209000;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4208908 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4209000 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4209092 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4209184 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4209276 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4209444 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4209092, term4209092.getClass(), "type", 35);
        setIntField(term4209276, term4209276.getClass(), "type", 40);
        setField(term4209276, term4209276.getClass(), "str", "indexOf");
        setField(term4209184, term4209184.getClass(), "next", term4209276);
        setIntField(term4209184, term4209184.getClass(), "type", 40);
        setField(term4209184, term4209184.getClass(), "str", "");
        setField(term4209092, term4209092.getClass(), "first", term4209184);
        setIntField(term4209444, term4209444.getClass(), "type", 44);
        setField(term4209444, term4209444.getClass(), "next", null);
        setField(term4209092, term4209092.getClass(), "next", term4209444);
        setField(term4209000, term4209000.getClass(), "first", term4209092);
        setIntField(term4209000, term4209000.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4209000;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term4208908, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


