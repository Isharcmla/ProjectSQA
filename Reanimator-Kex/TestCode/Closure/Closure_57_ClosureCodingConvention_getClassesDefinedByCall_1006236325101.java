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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51025;
     Object term51117;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51025 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term51117 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term51209 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term51301 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term51209, term51209.getClass(), "type", 33);
        setField(term51209, term51209.getClass(), "last", term51301);
        setField(term51117, term51117.getClass(), "first", term51209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term51117;
        try {
            callMethod(klass, "getClassesDefinedByCall", argTypes, term51025, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


