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
import java.util.HashSet;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class ClosureCodingConvention_isPropertyTestFunction_1591894470167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78014;
     Object term78132;
     Object term78236;
     Object term78239;

    public ClosureCodingConvention_isPropertyTestFunction_1591894470167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term78062 = new HashSet();
        term78014 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term78014, term78014.getClass(), "propertyTestFunctions", term78062);
        term78132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78132, term78132.getClass(), "type", 37);
        setIntField(term78202, term78202.getClass(), "type", 42);
        setField(term78132, term78132.getClass(), "first", term78202);
        HashMap term78238 = new HashMap();
        Set<Object> term78241 =  ((Map) term78238).keySet();
        HashSet term78237 = new HashSet((Collection<? extends Object>) term78241);
        term78236 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term78236, term78236.getClass(), "propertyTestFunctions", term78237);
        term78239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78239, term78239.getClass(), "type", 37);
        setField(term78239, term78239.getClass(), "next", null);
        setIntField(term78240, term78240.getClass(), "type", 42);
        setField(term78240, term78240.getClass(), "next", null);
        setField(term78240, term78240.getClass(), "first", null);
        setField(term78240, term78240.getClass(), "last", null);
        setField(term78240, term78240.getClass(), "propListHead", null);
        setIntField(term78240, term78240.getClass(), "sourcePosition", 0);
        setField(term78240, term78240.getClass(), "jsType", null);
        setField(term78240, term78240.getClass(), "parent", null);
        setField(term78239, term78239.getClass(), "first", term78240);
        setField(term78239, term78239.getClass(), "last", null);
        setField(term78239, term78239.getClass(), "propListHead", null);
        setIntField(term78239, term78239.getClass(), "sourcePosition", 0);
        setField(term78239, term78239.getClass(), "jsType", null);
        setField(term78239, term78239.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term78132;
        callMethod(klass, "isPropertyTestFunction", argTypes, term78014, args);
        assertTrue(recursiveEquals(term78014, term78236));
        assertTrue(recursiveEquals(term78132, term78239));
    }

};


