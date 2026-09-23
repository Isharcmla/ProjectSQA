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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3787731;
     Object term3787817;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3787731 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3787817 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3787909 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3788001 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3788109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3787817, term3787817.getClass(), "type", 37);
        setIntField(term3787909, term3787909.getClass(), "type", 33);
        setField(term3788001, term3788001.getClass(), "next", term3788001);
        setIntField(term3788001, term3788001.getClass(), "type", 40);
        setField(term3788001, term3788001.getClass(), "str", "charCodeAt");
        setField(term3787909, term3787909.getClass(), "first", term3788001);
        setIntField(term3788109, term3788109.getClass(), "type", 39);
        setField(term3787909, term3787909.getClass(), "next", term3788109);
        setField(term3787817, term3787817.getClass(), "first", term3787909);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3787817;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3787731, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


