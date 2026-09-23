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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3725190;
     Object term3725282;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3725190 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3725282 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3725374 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3725466 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3725558 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3725682 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3725374, term3725374.getClass(), "type", 35);
        setIntField(term3725558, term3725558.getClass(), "type", 40);
        setField(term3725558, term3725558.getClass(), "str", "lastIndexOf");
        setField(term3725466, term3725466.getClass(), "next", term3725558);
        setIntField(term3725466, term3725466.getClass(), "type", 40);
        setField(term3725374, term3725374.getClass(), "first", term3725466);
        setIntField(term3725682, term3725682.getClass(), "type", 39);
        setField(term3725374, term3725374.getClass(), "next", term3725682);
        setField(term3725282, term3725282.getClass(), "first", term3725374);
        setIntField(term3725282, term3725282.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3725282;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3725190, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


