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

public class IRFactory_transformNumberAsString_1706735028259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104340;
     Object term104678;

    public IRFactory_transformNumberAsString_1706735028259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104340 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term104432 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term104534 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term104432, term104432.getClass(), "propListHead", term104534);
        setField(term104340, term104340.getClass(), "templateNode", term104432);
        setField(term104340, term104340.getClass(), "sourceString", "");
        term104678 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term104784 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        Object term104890 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term104678, term104678.getClass(), "number", -4.3848171870629253E18);
        setIntField(term104784, term104784.getClass(), "type", 0);
        setIntField(term104890, term104890.getClass(), "type", 0);
        setField(term104890, term104890.getClass(), "next", null);
        setField(term104784, term104784.getClass(), "next", term104890);
        setField(term104678, term104678.getClass(), "propListHead", term104784);
        setIntField(term104678, term104678.getClass(), "lineno", 0);
        setIntField(term104678, term104678.getClass(), "position", 0);
        setField(term104678, term104678.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term104678;
        callMethod(klass, "transformNumberAsString", argTypes, term104340, args);
    }

};


