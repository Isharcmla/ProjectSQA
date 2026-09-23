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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150280;
     Object term150372;
     Object term150692;
     Object term150693;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150280 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term150372 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term150372, term150372.getClass(), "first", term150372);
        setIntField(term150372, term150372.getClass(), "type", 42);
        term150692 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term150692, term150692.getClass(), "propertyTestFunctions", null);
        term150693 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term150693, term150693.getClass(), "number", 0.0);
        setIntField(term150693, term150693.getClass(), "type", 42);
        setField(term150693, term150693.getClass(), "next", null);
        setField(term150693, term150693.getClass(), "first", term150693);
        setField(term150693, term150693.getClass(), "last", null);
        setField(term150693, term150693.getClass(), "propListHead", null);
        setIntField(term150693, term150693.getClass(), "sourcePosition", 0);
        setField(term150693, term150693.getClass(), "jsType", null);
        setField(term150693, term150693.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term150372;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term150280, args);
        assertTrue(recursiveEquals(term150280, term150692));
        assertTrue(recursiveEquals(term150372, term150693));
        assertTrue(recursiveEquals(retValue, null));
    }

};


