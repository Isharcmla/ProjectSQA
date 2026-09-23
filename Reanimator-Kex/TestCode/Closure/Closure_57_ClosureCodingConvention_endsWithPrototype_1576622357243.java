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

public class ClosureCodingConvention_endsWithPrototype_1576622357243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109044;
     Object term109136;

    public ClosureCodingConvention_endsWithPrototype_1576622357243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109044 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term109136 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term109228 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term109136, term109136.getClass(), "type", 33);
        setField(term109136, term109136.getClass(), "last", term109228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term109136;
        try {
            callMethod(klass, "endsWithPrototype", argTypes, term109044, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


