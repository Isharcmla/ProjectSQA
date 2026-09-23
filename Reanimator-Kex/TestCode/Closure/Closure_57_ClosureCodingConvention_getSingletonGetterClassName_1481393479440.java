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
import java.lang.Object;

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149580;
     Object term149672;
     Object term150083;
     Object term150084;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149580 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term149672 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term149764 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term149672, term149672.getClass(), "first", term149764);
        term150083 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term150083, term150083.getClass(), "propertyTestFunctions", null);
        term150084 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term150085 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term150084, term150084.getClass(), "number", 0.0);
        setIntField(term150084, term150084.getClass(), "type", 0);
        setField(term150084, term150084.getClass(), "next", null);
        setDoubleField(term150085, term150085.getClass(), "number", 0.0);
        setIntField(term150085, term150085.getClass(), "type", 0);
        setField(term150085, term150085.getClass(), "next", null);
        setField(term150085, term150085.getClass(), "first", null);
        setField(term150085, term150085.getClass(), "last", null);
        setField(term150085, term150085.getClass(), "propListHead", null);
        setIntField(term150085, term150085.getClass(), "sourcePosition", 0);
        setField(term150085, term150085.getClass(), "jsType", null);
        setField(term150085, term150085.getClass(), "parent", null);
        setField(term150084, term150084.getClass(), "first", term150085);
        setField(term150084, term150084.getClass(), "last", null);
        setField(term150084, term150084.getClass(), "propListHead", null);
        setIntField(term150084, term150084.getClass(), "sourcePosition", 0);
        setField(term150084, term150084.getClass(), "jsType", null);
        setField(term150084, term150084.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term149672;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term149580, args);
        assertTrue(recursiveEquals(term149580, term150083));
        assertTrue(recursiveEquals(term149672, term150084));
        assertTrue(recursiveEquals(retValue, null));
    }

};


