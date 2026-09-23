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

public class TypeValidator_registerMismatch_581023849496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261208;
     Object term261306;
     Object term261496;

    public TypeValidator_registerMismatch_581023849496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261208 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term261306 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term261398 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term261306, term261306.getClass(), "referencedType", term261398);
        term261496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term261590 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term261496, term261496.getClass(), "referencedType", term261590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term261306;
        args[1] = term261496;
        try {
            callMethod(klass, "registerMismatch", argTypes, term261208, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


