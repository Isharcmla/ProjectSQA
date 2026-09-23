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

public class ClosureCodingConvention_safeNext_587672840287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121789;
     Object term121881;
     Object term121888;
     Object term121889;

    public ClosureCodingConvention_safeNext_587672840287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121789 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term121881 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term121888 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term121888, term121888.getClass(), "propertyTestFunctions", null);
        term121889 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term121889, term121889.getClass(), "number", 0.0);
        setIntField(term121889, term121889.getClass(), "type", 0);
        setField(term121889, term121889.getClass(), "next", null);
        setField(term121889, term121889.getClass(), "first", null);
        setField(term121889, term121889.getClass(), "last", null);
        setField(term121889, term121889.getClass(), "propListHead", null);
        setIntField(term121889, term121889.getClass(), "sourcePosition", 0);
        setField(term121889, term121889.getClass(), "jsType", null);
        setField(term121889, term121889.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term121881;
        Object retValue = callMethod(klass, "safeNext", argTypes, term121789, args);
        assertTrue(recursiveEquals(term121789, term121888));
        assertTrue(recursiveEquals(term121881, term121889));
        assertTrue(recursiveEquals(retValue, null));
    }

};


