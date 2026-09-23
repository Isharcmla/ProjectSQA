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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2661459;
     Object term2661551;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2661459 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2661551 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2661637 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2661723 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2661809 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2661551, term2661551.getClass(), "type", 37);
        setIntField(term2661637, term2661637.getClass(), "type", 33);
        setIntField(term2661809, term2661809.getClass(), "type", 40);
        setField(term2661723, term2661723.getClass(), "next", term2661809);
        setIntField(term2661723, term2661723.getClass(), "type", 40);
        setField(term2661637, term2661637.getClass(), "first", term2661723);
        setField(term2661551, term2661551.getClass(), "first", term2661637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2661551;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2661459, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


