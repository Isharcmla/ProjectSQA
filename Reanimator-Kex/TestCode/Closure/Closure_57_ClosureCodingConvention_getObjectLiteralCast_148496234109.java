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

public class ClosureCodingConvention_getObjectLiteralCast_148496234109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54979;
     Object term55049;
     Object term55170;
     Object term55171;

    public ClosureCodingConvention_getObjectLiteralCast_148496234109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54979 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term55049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55049, term55049.getClass(), "type", 37);
        setIntField(term55119, term55119.getClass(), "type", 42);
        setField(term55049, term55049.getClass(), "first", term55119);
        term55170 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term55170, term55170.getClass(), "propertyTestFunctions", null);
        term55171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55171, term55171.getClass(), "type", 37);
        setField(term55171, term55171.getClass(), "next", null);
        setIntField(term55172, term55172.getClass(), "type", 42);
        setField(term55172, term55172.getClass(), "next", null);
        setField(term55172, term55172.getClass(), "first", null);
        setField(term55172, term55172.getClass(), "last", null);
        setField(term55172, term55172.getClass(), "propListHead", null);
        setIntField(term55172, term55172.getClass(), "sourcePosition", 0);
        setField(term55172, term55172.getClass(), "jsType", null);
        setField(term55172, term55172.getClass(), "parent", null);
        setField(term55171, term55171.getClass(), "first", term55172);
        setField(term55171, term55171.getClass(), "last", null);
        setField(term55171, term55171.getClass(), "propListHead", null);
        setIntField(term55171, term55171.getClass(), "sourcePosition", 0);
        setField(term55171, term55171.getClass(), "jsType", null);
        setField(term55171, term55171.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term55049;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term54979, args);
        assertTrue(recursiveEquals(term54979, term55170));
        assertTrue(recursiveEquals(term55049, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


