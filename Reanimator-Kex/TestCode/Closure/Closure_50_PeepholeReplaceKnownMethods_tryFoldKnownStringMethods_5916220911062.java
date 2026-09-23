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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4495291;
     Object term4495377;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4495291 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4495377 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4495469 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4495561 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4495653 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term4495377, term4495377.getClass(), "type", 37);
        setIntField(term4495469, term4495469.getClass(), "type", 35);
        setIntField(term4495653, term4495653.getClass(), "type", 40);
        setField(term4495653, term4495653.getClass(), "str", "toLowerCase");
        setField(term4495561, term4495561.getClass(), "next", term4495653);
        setIntField(term4495561, term4495561.getClass(), "type", 40);
        setField(term4495561, term4495561.getClass(), "str", "");
        setField(term4495469, term4495469.getClass(), "first", term4495561);
        setField(term4495469, term4495469.getClass(), "next", null);
        setField(term4495377, term4495377.getClass(), "first", term4495469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4495377;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4495291, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


