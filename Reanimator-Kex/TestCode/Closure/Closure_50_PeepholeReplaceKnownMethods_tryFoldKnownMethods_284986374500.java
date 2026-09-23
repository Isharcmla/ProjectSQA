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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3481102;
     Object term3481194;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3481102 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3481194 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3481286 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3481378 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3481470 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3481594 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3481286, term3481286.getClass(), "type", 35);
        setIntField(term3481470, term3481470.getClass(), "type", 40);
        setField(term3481470, term3481470.getClass(), "str", "substr");
        setField(term3481378, term3481378.getClass(), "next", term3481470);
        setIntField(term3481378, term3481378.getClass(), "type", 40);
        setField(term3481286, term3481286.getClass(), "first", term3481378);
        setIntField(term3481594, term3481594.getClass(), "type", 39);
        setField(term3481286, term3481286.getClass(), "next", term3481594);
        setField(term3481194, term3481194.getClass(), "first", term3481286);
        setIntField(term3481194, term3481194.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3481194;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3481102, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


