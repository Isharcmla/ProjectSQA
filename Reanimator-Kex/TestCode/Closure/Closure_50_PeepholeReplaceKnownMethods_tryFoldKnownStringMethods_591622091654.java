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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3580253;
     Object term3580339;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3580253 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3580339 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3580431 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3580523 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3580615 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3580739 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3580339, term3580339.getClass(), "type", 37);
        setIntField(term3580431, term3580431.getClass(), "type", 35);
        setIntField(term3580615, term3580615.getClass(), "type", 40);
        setField(term3580615, term3580615.getClass(), "str", "charAt");
        setField(term3580523, term3580523.getClass(), "next", term3580615);
        setIntField(term3580523, term3580523.getClass(), "type", 40);
        setField(term3580431, term3580431.getClass(), "first", term3580523);
        setIntField(term3580739, term3580739.getClass(), "type", 39);
        setField(term3580431, term3580431.getClass(), "next", term3580739);
        setField(term3580339, term3580339.getClass(), "first", term3580431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3580339;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3580253, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


