package com.google.javascript.jscomp.parsing;

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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IRFactory_transformNumberAsString_1706735028253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101093;
     Object term101399;

    public IRFactory_transformNumberAsString_1706735028253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101093 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term101185 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term101293 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term101185, term101185.getClass(), "propListHead", term101293);
        setField(term101093, term101093.getClass(), "templateNode", term101185);
        term101399 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term101505 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        Object term101611 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term101399, term101399.getClass(), "number", 0.0);
        setIntField(term101505, term101505.getClass(), "type", 0);
        setIntField(term101611, term101611.getClass(), "type", 0);
        setField(term101611, term101611.getClass(), "next", null);
        setField(term101505, term101505.getClass(), "next", term101611);
        setField(term101399, term101399.getClass(), "propListHead", term101505);
        setIntField(term101399, term101399.getClass(), "lineno", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term101399;
        callMethod(klass, "transformNumberAsString", argTypes, term101093, args);
    }

};


