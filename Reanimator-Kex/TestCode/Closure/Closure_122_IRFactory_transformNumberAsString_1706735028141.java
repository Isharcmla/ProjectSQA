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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IRFactory_transformNumberAsString_1706735028141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68046;
     Object term68346;

    public IRFactory_transformNumberAsString_1706735028141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68046 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term68138 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term68240 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term68138, term68138.getClass(), "propListHead", term68240);
        setField(term68046, term68046.getClass(), "templateNode", term68138);
        term68346 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term68452 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term68346, term68346.getClass(), "number", -4.3279592418694922E18);
        setIntField(term68452, term68452.getClass(), "type", -25);
        setField(term68452, term68452.getClass(), "next", null);
        setField(term68346, term68346.getClass(), "propListHead", term68452);
        setIntField(term68346, term68346.getClass(), "lineno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term68346;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term68046, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


