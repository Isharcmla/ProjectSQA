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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4456379;
     Object term4456465;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4456379 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4456465 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4456557 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4456649 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4456741 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4456909 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term4456465, term4456465.getClass(), "type", 37);
        setIntField(term4456557, term4456557.getClass(), "type", 35);
        setIntField(term4456741, term4456741.getClass(), "type", 40);
        setField(term4456741, term4456741.getClass(), "str", "lastIndexOf");
        setField(term4456649, term4456649.getClass(), "next", term4456741);
        setIntField(term4456649, term4456649.getClass(), "type", 40);
        setField(term4456649, term4456649.getClass(), "str", "");
        setField(term4456557, term4456557.getClass(), "first", term4456649);
        setIntField(term4456909, term4456909.getClass(), "type", 43);
        setField(term4456909, term4456909.getClass(), "next", null);
        setField(term4456557, term4456557.getClass(), "next", term4456909);
        setField(term4456465, term4456465.getClass(), "first", term4456557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4456465;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4456379, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


