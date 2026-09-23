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

public class ClosureCodingConvention_getObjectLiteralCast_148496234429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147910;
     Object term148002;
     Object term148172;
     Object term148173;

    public ClosureCodingConvention_getObjectLiteralCast_148496234429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147910 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term148002 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term148094 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term148002, term148002.getClass(), "type", 37);
        setIntField(term148094, term148094.getClass(), "type", 42);
        setField(term148002, term148002.getClass(), "first", term148094);
        term148172 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term148172, term148172.getClass(), "propertyTestFunctions", null);
        term148173 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term148174 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term148173, term148173.getClass(), "number", 0.0);
        setIntField(term148173, term148173.getClass(), "type", 37);
        setField(term148173, term148173.getClass(), "next", null);
        setDoubleField(term148174, term148174.getClass(), "number", 0.0);
        setIntField(term148174, term148174.getClass(), "type", 42);
        setField(term148174, term148174.getClass(), "next", null);
        setField(term148174, term148174.getClass(), "first", null);
        setField(term148174, term148174.getClass(), "last", null);
        setField(term148174, term148174.getClass(), "propListHead", null);
        setIntField(term148174, term148174.getClass(), "sourcePosition", 0);
        setField(term148174, term148174.getClass(), "jsType", null);
        setField(term148174, term148174.getClass(), "parent", null);
        setField(term148173, term148173.getClass(), "first", term148174);
        setField(term148173, term148173.getClass(), "last", null);
        setField(term148173, term148173.getClass(), "propListHead", null);
        setIntField(term148173, term148173.getClass(), "sourcePosition", 0);
        setField(term148173, term148173.getClass(), "jsType", null);
        setField(term148173, term148173.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term148002;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term147910, args);
        assertTrue(recursiveEquals(term147910, term148172));
        assertTrue(recursiveEquals(term148002, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


