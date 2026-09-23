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

public class IRFactory_transformNumberAsString_1706735028116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47009;
     Object term47207;

    public IRFactory_transformNumberAsString_1706735028116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47009 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term47101 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term47101, term47101.getClass(), "propListHead", null);
        setField(term47009, term47009.getClass(), "templateNode", term47101);
        term47207 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term47313 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term47207, term47207.getClass(), "number", 8.8046829568E10);
        setIntField(term47313, term47313.getClass(), "type", 24);
        setField(term47207, term47207.getClass(), "propListHead", term47313);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term47207;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term47009, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


