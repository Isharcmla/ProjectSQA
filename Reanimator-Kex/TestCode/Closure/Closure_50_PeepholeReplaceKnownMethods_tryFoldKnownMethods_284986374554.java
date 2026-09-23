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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3518314;
     Object term3518406;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3518314 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3518406 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3518498 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3518590 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3518682 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3518812 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3518498, term3518498.getClass(), "type", 35);
        setIntField(term3518682, term3518682.getClass(), "type", 40);
        setField(term3518682, term3518682.getClass(), "str", "substring");
        setField(term3518590, term3518590.getClass(), "next", term3518682);
        setIntField(term3518590, term3518590.getClass(), "type", 40);
        setField(term3518498, term3518498.getClass(), "first", term3518590);
        setIntField(term3518812, term3518812.getClass(), "type", 39);
        setField(term3518498, term3518498.getClass(), "next", term3518812);
        setField(term3518406, term3518406.getClass(), "first", term3518498);
        setIntField(term3518406, term3518406.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3518406;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3518314, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


