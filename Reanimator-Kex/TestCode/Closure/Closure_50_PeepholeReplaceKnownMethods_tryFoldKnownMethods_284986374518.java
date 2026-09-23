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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3496093;
     Object term3496185;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3496093 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3496185 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3496277 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3496369 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3496493 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3496277, term3496277.getClass(), "type", 35);
        setField(term3496369, term3496369.getClass(), "next", term3496369);
        setIntField(term3496369, term3496369.getClass(), "type", 40);
        setField(term3496369, term3496369.getClass(), "str", "lastIndexOf");
        setField(term3496277, term3496277.getClass(), "first", term3496369);
        setIntField(term3496493, term3496493.getClass(), "type", 40);
        setField(term3496277, term3496277.getClass(), "next", term3496493);
        setField(term3496185, term3496185.getClass(), "first", term3496277);
        setIntField(term3496185, term3496185.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3496185;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3496093, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


