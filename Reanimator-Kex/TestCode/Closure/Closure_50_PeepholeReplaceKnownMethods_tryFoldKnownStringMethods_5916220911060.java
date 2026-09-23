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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4493726;
     Object term4493812;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4493726 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4493812 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4493904 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4493996 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4494088 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4494212 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term4493812, term4493812.getClass(), "type", 37);
        setIntField(term4493904, term4493904.getClass(), "type", 33);
        setIntField(term4494088, term4494088.getClass(), "type", 40);
        setField(term4494088, term4494088.getClass(), "str", "indexOf");
        setField(term4493996, term4493996.getClass(), "next", term4494088);
        setIntField(term4493996, term4493996.getClass(), "type", 40);
        setField(term4493996, term4493996.getClass(), "str", null);
        setField(term4493904, term4493904.getClass(), "first", term4493996);
        setIntField(term4494212, term4494212.getClass(), "type", 44);
        setField(term4494212, term4494212.getClass(), "next", null);
        setField(term4493904, term4493904.getClass(), "next", term4494212);
        setField(term4493812, term4493812.getClass(), "first", term4493904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4493812;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4493726, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


