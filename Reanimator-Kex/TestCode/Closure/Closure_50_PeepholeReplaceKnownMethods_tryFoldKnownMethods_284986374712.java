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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3617127;
     Object term3617219;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3617127 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3617219 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3617311 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3617403 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3617495 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3617619 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3617711 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3617311, term3617311.getClass(), "type", 35);
        setIntField(term3617495, term3617495.getClass(), "type", 40);
        setField(term3617495, term3617495.getClass(), "str", "lastIndexOf");
        setField(term3617403, term3617403.getClass(), "next", term3617495);
        setIntField(term3617403, term3617403.getClass(), "type", 40);
        setField(term3617403, term3617403.getClass(), "str", "lastIndexOf");
        setField(term3617311, term3617311.getClass(), "first", term3617403);
        setIntField(term3617619, term3617619.getClass(), "type", 41);
        setField(term3617619, term3617619.getClass(), "next", null);
        setField(term3617311, term3617311.getClass(), "next", term3617619);
        setField(term3617219, term3617219.getClass(), "first", term3617311);
        setIntField(term3617219, term3617219.getClass(), "type", 37);
        setField(term3617219, term3617219.getClass(), "parent", term3617711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3617219;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3617127, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


