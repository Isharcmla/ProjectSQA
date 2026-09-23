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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130395;
     Object term130487;
     Object term130876;
     Object term130877;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130395 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term130487 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130579 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term130487, term130487.getClass(), "first", term130579);
        term130876 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term130876, term130876.getClass(), "propertyTestFunctions", null);
        term130877 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130878 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term130877, term130877.getClass(), "number", 0.0);
        setIntField(term130877, term130877.getClass(), "type", 0);
        setField(term130877, term130877.getClass(), "next", null);
        setDoubleField(term130878, term130878.getClass(), "number", 0.0);
        setIntField(term130878, term130878.getClass(), "type", 0);
        setField(term130878, term130878.getClass(), "next", null);
        setField(term130878, term130878.getClass(), "first", null);
        setField(term130878, term130878.getClass(), "last", null);
        setField(term130878, term130878.getClass(), "propListHead", null);
        setIntField(term130878, term130878.getClass(), "sourcePosition", 0);
        setField(term130878, term130878.getClass(), "jsType", null);
        setField(term130878, term130878.getClass(), "parent", null);
        setField(term130877, term130877.getClass(), "first", term130878);
        setField(term130877, term130877.getClass(), "last", null);
        setField(term130877, term130877.getClass(), "propListHead", null);
        setIntField(term130877, term130877.getClass(), "sourcePosition", 0);
        setField(term130877, term130877.getClass(), "jsType", null);
        setField(term130877, term130877.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term130487;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term130395, args);
        assertTrue(recursiveEquals(term130395, term130876));
        assertTrue(recursiveEquals(term130487, term130877));
        assertTrue(recursiveEquals(retValue, null));
    }

};


