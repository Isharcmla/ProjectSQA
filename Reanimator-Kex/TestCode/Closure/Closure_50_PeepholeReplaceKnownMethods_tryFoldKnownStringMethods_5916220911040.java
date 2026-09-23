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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4461878;
     Object term4461964;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4461878 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4461964 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4462056 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4462148 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4462240 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4462364 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term4461964, term4461964.getClass(), "type", 37);
        setIntField(term4462056, term4462056.getClass(), "type", 33);
        setIntField(term4462240, term4462240.getClass(), "type", 40);
        setField(term4462240, term4462240.getClass(), "str", "substr");
        setField(term4462148, term4462148.getClass(), "next", term4462240);
        setIntField(term4462148, term4462148.getClass(), "type", 40);
        setField(term4462056, term4462056.getClass(), "first", term4462148);
        setIntField(term4462364, term4462364.getClass(), "type", 39);
        setField(term4462056, term4462056.getClass(), "next", term4462364);
        setField(term4461964, term4461964.getClass(), "first", term4462056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4461964;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4461878, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


