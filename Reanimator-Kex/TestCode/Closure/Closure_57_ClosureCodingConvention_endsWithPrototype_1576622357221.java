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

public class ClosureCodingConvention_endsWithPrototype_1576622357221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99978;
     Object term100070;
     Object term100226;
     Object term100227;

    public ClosureCodingConvention_endsWithPrototype_1576622357221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99978 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term100070 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term100162 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term100070, term100070.getClass(), "type", 33);
        setField(term100162, term100162.getClass(), "str", "");
        setField(term100070, term100070.getClass(), "last", term100162);
        term100226 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term100226, term100226.getClass(), "propertyTestFunctions", null);
        term100227 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term100228 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term100227, term100227.getClass(), "str", null);
        setIntField(term100227, term100227.getClass(), "type", 33);
        setField(term100227, term100227.getClass(), "next", null);
        setField(term100227, term100227.getClass(), "first", null);
        setField(term100228, term100228.getClass(), "str", "");
        setIntField(term100228, term100228.getClass(), "type", 0);
        setField(term100228, term100228.getClass(), "next", null);
        setField(term100228, term100228.getClass(), "first", null);
        setField(term100228, term100228.getClass(), "last", null);
        setField(term100228, term100228.getClass(), "propListHead", null);
        setIntField(term100228, term100228.getClass(), "sourcePosition", 0);
        setField(term100228, term100228.getClass(), "jsType", null);
        setField(term100228, term100228.getClass(), "parent", null);
        setField(term100227, term100227.getClass(), "last", term100228);
        setField(term100227, term100227.getClass(), "propListHead", null);
        setIntField(term100227, term100227.getClass(), "sourcePosition", 0);
        setField(term100227, term100227.getClass(), "jsType", null);
        setField(term100227, term100227.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term100070;
        Object retValue = callMethod(klass, "endsWithPrototype", argTypes, term99978, args);
        assertTrue(recursiveEquals(term99978, term100226));
        assertTrue(recursiveEquals(term100070, term100227));
        assertTrue(recursiveEquals(retValue, false));
    }

};


