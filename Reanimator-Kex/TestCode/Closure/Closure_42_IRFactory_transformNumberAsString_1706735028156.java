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

public class IRFactory_transformNumberAsString_1706735028156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58848;
     Object term59046;

    public IRFactory_transformNumberAsString_1706735028156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58848 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term58940 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term58940, term58940.getClass(), "propListHead", null);
        setField(term58848, term58848.getClass(), "templateNode", term58940);
        term59046 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        setDoubleField(term59046, term59046.getClass(), "number", 4.6116860184273879E18);
        setField(term59046, term59046.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term59046;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term58848, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


