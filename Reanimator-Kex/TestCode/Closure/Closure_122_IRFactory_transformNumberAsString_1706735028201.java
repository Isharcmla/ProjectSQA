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

public class IRFactory_transformNumberAsString_1706735028201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83007;
     Object term83205;

    public IRFactory_transformNumberAsString_1706735028201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83007 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term83099 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term83099, term83099.getClass(), "propListHead", null);
        setField(term83007, term83007.getClass(), "templateNode", term83099);
        term83205 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term83311 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term83205, term83205.getClass(), "number", 0.0);
        setIntField(term83311, term83311.getClass(), "type", -25);
        setField(term83205, term83205.getClass(), "propListHead", term83311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term83205;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term83007, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


