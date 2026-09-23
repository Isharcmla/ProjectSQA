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

public class IRFactory_transformNumberAsString_1706735028215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67442;
     Object term67748;

    public IRFactory_transformNumberAsString_1706735028215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67442 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term67534 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term67642 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term67534, term67534.getClass(), "propListHead", term67642);
        setField(term67442, term67442.getClass(), "templateNode", term67534);
        term67748 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term67854 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term67748, term67748.getClass(), "number", 4.678254850419458E18);
        setIntField(term67854, term67854.getClass(), "type", -25);
        setField(term67854, term67854.getClass(), "next", null);
        setField(term67748, term67748.getClass(), "propListHead", term67854);
        setIntField(term67748, term67748.getClass(), "lineno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term67748;
        callMethod(klass, "transformNumberAsString", argTypes, term67442, args);
    }

};


