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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2664147;
     Object term2664239;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2664147 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2664239 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2664325 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2664411 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2664497 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2664239, term2664239.getClass(), "type", 37);
        setIntField(term2664325, term2664325.getClass(), "type", 35);
        setIntField(term2664497, term2664497.getClass(), "type", 40);
        setField(term2664411, term2664411.getClass(), "next", term2664497);
        setIntField(term2664411, term2664411.getClass(), "type", 40);
        setField(term2664325, term2664325.getClass(), "first", term2664411);
        setField(term2664239, term2664239.getClass(), "first", term2664325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2664239;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2664147, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


