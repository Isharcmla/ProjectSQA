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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210082;
     Object term210174;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210082 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term210174 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term210266 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term210266, term210266.getClass(), "type", 33);
        setField(term210174, term210174.getClass(), "first", term210266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term210174;
        try {
            callMethod(klass, "getSingletonGetterClassName", argTypes, term210082, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


