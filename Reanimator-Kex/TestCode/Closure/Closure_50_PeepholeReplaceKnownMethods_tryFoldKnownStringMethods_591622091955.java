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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3798109;
     Object term3798195;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3798109 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3798195 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3798287 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3798379 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3798471 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3798557 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3798195, term3798195.getClass(), "type", 37);
        setIntField(term3798287, term3798287.getClass(), "type", 35);
        setIntField(term3798471, term3798471.getClass(), "type", 40);
        setField(term3798471, term3798471.getClass(), "str", null);
        setField(term3798379, term3798379.getClass(), "next", term3798471);
        setIntField(term3798379, term3798379.getClass(), "type", 40);
        setField(term3798287, term3798287.getClass(), "first", term3798379);
        setIntField(term3798557, term3798557.getClass(), "type", 44);
        setField(term3798287, term3798287.getClass(), "next", term3798557);
        setField(term3798195, term3798195.getClass(), "first", term3798287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3798195;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3798109, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


