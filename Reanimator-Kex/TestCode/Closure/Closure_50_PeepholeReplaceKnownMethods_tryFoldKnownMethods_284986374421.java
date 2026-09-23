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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2667186;
     Object term2667278;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2667186 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2667278 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2667370 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2667462 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2667554 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2667370, term2667370.getClass(), "type", 35);
        setIntField(term2667554, term2667554.getClass(), "type", 40);
        setField(term2667554, term2667554.getClass(), "str", "toLowerCase");
        setField(term2667462, term2667462.getClass(), "next", term2667554);
        setIntField(term2667462, term2667462.getClass(), "type", 40);
        setField(term2667462, term2667462.getClass(), "str", "");
        setField(term2667370, term2667370.getClass(), "first", term2667462);
        setField(term2667370, term2667370.getClass(), "next", null);
        setField(term2667278, term2667278.getClass(), "first", term2667370);
        setIntField(term2667278, term2667278.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2667278;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term2667186, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


