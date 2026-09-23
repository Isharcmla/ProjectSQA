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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2646879;
     Object term2646971;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2646879 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2646971 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2647063 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2647155 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2647247 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2646971, term2646971.getClass(), "type", 37);
        setIntField(term2647063, term2647063.getClass(), "type", 35);
        setIntField(term2647247, term2647247.getClass(), "type", 40);
        setField(term2647155, term2647155.getClass(), "next", term2647247);
        setIntField(term2647155, term2647155.getClass(), "type", 40);
        setField(term2647063, term2647063.getClass(), "first", term2647155);
        setField(term2646971, term2646971.getClass(), "first", term2647063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2646971;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2646879, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


