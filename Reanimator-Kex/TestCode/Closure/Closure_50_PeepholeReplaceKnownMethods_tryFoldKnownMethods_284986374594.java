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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3543657;
     Object term3543749;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3543657 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3543749 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3543841 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3543933 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3544025 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3544149 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3543841, term3543841.getClass(), "type", 35);
        setIntField(term3544025, term3544025.getClass(), "type", 40);
        setField(term3544025, term3544025.getClass(), "str", "indexOf");
        setField(term3543933, term3543933.getClass(), "next", term3544025);
        setIntField(term3543933, term3543933.getClass(), "type", 40);
        setField(term3543841, term3543841.getClass(), "first", term3543933);
        setIntField(term3544149, term3544149.getClass(), "type", 41);
        setField(term3543841, term3543841.getClass(), "next", term3544149);
        setField(term3543749, term3543749.getClass(), "first", term3543841);
        setIntField(term3543749, term3543749.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3543749;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3543657, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


