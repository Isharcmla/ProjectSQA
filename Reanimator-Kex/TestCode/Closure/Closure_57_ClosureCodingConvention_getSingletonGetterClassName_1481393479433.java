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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148513;
     Object term148605;
     Object term148763;
     Object term148764;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148513 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term148605 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term148697 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term148605, term148605.getClass(), "first", term148697);
        term148763 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term148763, term148763.getClass(), "propertyTestFunctions", null);
        term148764 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term148765 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term148764, term148764.getClass(), "str", null);
        setIntField(term148764, term148764.getClass(), "type", 0);
        setField(term148764, term148764.getClass(), "next", null);
        setField(term148765, term148765.getClass(), "str", null);
        setIntField(term148765, term148765.getClass(), "type", 0);
        setField(term148765, term148765.getClass(), "next", null);
        setField(term148765, term148765.getClass(), "first", null);
        setField(term148765, term148765.getClass(), "last", null);
        setField(term148765, term148765.getClass(), "propListHead", null);
        setIntField(term148765, term148765.getClass(), "sourcePosition", 0);
        setField(term148765, term148765.getClass(), "jsType", null);
        setField(term148765, term148765.getClass(), "parent", null);
        setField(term148764, term148764.getClass(), "first", term148765);
        setField(term148764, term148764.getClass(), "last", null);
        setField(term148764, term148764.getClass(), "propListHead", null);
        setIntField(term148764, term148764.getClass(), "sourcePosition", 0);
        setField(term148764, term148764.getClass(), "jsType", null);
        setField(term148764, term148764.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term148605;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term148513, args);
        assertTrue(recursiveEquals(term148513, term148763));
        assertTrue(recursiveEquals(term148605, term148764));
        assertTrue(recursiveEquals(retValue, null));
    }

};


