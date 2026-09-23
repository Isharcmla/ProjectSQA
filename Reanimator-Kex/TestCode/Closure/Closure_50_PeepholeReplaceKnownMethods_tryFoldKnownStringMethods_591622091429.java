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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2691933;
     Object term2692025;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2691933 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2692025 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2692117 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2692209 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2692301 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2692025, term2692025.getClass(), "type", 37);
        setIntField(term2692117, term2692117.getClass(), "type", 35);
        setIntField(term2692301, term2692301.getClass(), "type", 40);
        setField(term2692209, term2692209.getClass(), "next", term2692301);
        setIntField(term2692209, term2692209.getClass(), "type", 40);
        setField(term2692117, term2692117.getClass(), "first", term2692209);
        setField(term2692025, term2692025.getClass(), "first", term2692117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2692025;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2691933, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


