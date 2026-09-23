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

public class IRFactory_transformNumberAsString_1706735028202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66072;
     Object term66270;

    public IRFactory_transformNumberAsString_1706735028202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66072 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term66164 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term66164, term66164.getClass(), "propListHead", null);
        setField(term66072, term66072.getClass(), "templateNode", term66164);
        term66270 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term66376 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term66270, term66270.getClass(), "number", 4.8897659609987953E18);
        setIntField(term66376, term66376.getClass(), "type", -25);
        setField(term66376, term66376.getClass(), "next", term66376);
        setField(term66270, term66270.getClass(), "propListHead", term66376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term66270;
        callMethod(klass, "transformNumberAsString", argTypes, term66072, args);
    }

};


