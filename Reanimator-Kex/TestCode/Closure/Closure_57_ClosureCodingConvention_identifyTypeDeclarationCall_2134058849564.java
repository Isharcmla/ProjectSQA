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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182389;
     Object term182459;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182389 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term182459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term182459, term182459.getClass(), "first", term182459);
        setIntField(term182459, term182459.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term182459;
        try {
            callMethod(klass, "identifyTypeDeclarationCall", argTypes, term182389, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


