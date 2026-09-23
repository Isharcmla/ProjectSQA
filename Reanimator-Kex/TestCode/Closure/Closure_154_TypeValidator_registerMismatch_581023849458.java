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

public class TypeValidator_registerMismatch_581023849458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227550;
     Object term227807;

    public TypeValidator_registerMismatch_581023849458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227550 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term227807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term227862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term227807, term227807.getClass(), "referencedType", term227862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term227807;
        args[1] = term227807;
        try {
            callMethod(klass, "registerMismatch", argTypes, term227550, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


