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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3513218;
     Object term3513310;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3513218 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3513310 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3513402 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3513494 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3513586 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3513716 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3513808 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3513402, term3513402.getClass(), "type", 35);
        setIntField(term3513586, term3513586.getClass(), "type", 40);
        setField(term3513586, term3513586.getClass(), "str", "indexOf");
        setField(term3513494, term3513494.getClass(), "next", term3513586);
        setIntField(term3513494, term3513494.getClass(), "type", 40);
        setField(term3513494, term3513494.getClass(), "str", null);
        setField(term3513402, term3513402.getClass(), "first", term3513494);
        setIntField(term3513716, term3513716.getClass(), "type", 40);
        setField(term3513808, term3513808.getClass(), "next", null);
        setIntField(term3513808, term3513808.getClass(), "type", 39);
        setField(term3513716, term3513716.getClass(), "next", term3513808);
        setField(term3513716, term3513716.getClass(), "str", "");
        setField(term3513402, term3513402.getClass(), "next", term3513716);
        setField(term3513310, term3513310.getClass(), "first", term3513402);
        setIntField(term3513310, term3513310.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3513310;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3513218, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


