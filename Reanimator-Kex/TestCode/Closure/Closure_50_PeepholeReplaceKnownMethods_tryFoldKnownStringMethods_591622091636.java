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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3568888;
     Object term3568974;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3568888 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3568974 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3569066 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3569158 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3569266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3568974, term3568974.getClass(), "type", 37);
        setIntField(term3569066, term3569066.getClass(), "type", 33);
        setField(term3569158, term3569158.getClass(), "next", term3569158);
        setIntField(term3569158, term3569158.getClass(), "type", 40);
        setField(term3569158, term3569158.getClass(), "str", "indexOf");
        setField(term3569066, term3569066.getClass(), "first", term3569158);
        setIntField(term3569266, term3569266.getClass(), "type", 40);
        setField(term3569066, term3569066.getClass(), "next", term3569266);
        setField(term3568974, term3568974.getClass(), "first", term3569066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3568974;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3568888, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


