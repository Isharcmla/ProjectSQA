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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169481;
     Object term169567;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169481 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term169567 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169659 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term169659, term169659.getClass(), "type", 38);
        setField(term169567, term169567.getClass(), "first", term169659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term169567;
        try {
            callMethod(klass, "getClassesDefinedByCall", argTypes, term169481, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


