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

public class IRFactory_transformNumberAsString_1706735028231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93281;
     Object term93479;

    public IRFactory_transformNumberAsString_1706735028231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93281 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term93373 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term93373, term93373.getClass(), "propListHead", null);
        setField(term93281, term93281.getClass(), "templateNode", term93373);
        term93479 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term93585 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term93479, term93479.getClass(), "number", -4.359480041248129E18);
        setIntField(term93585, term93585.getClass(), "type", 0);
        setField(term93585, term93585.getClass(), "next", term93585);
        setField(term93479, term93479.getClass(), "propListHead", term93585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term93479;
        callMethod(klass, "transformNumberAsString", argTypes, term93281, args);
    }

};


