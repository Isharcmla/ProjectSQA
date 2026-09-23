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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3694488;
     Object term3694580;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3694488 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3694580 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3694672 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3694764 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3694856 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3694580, term3694580.getClass(), "type", 37);
        setIntField(term3694672, term3694672.getClass(), "type", 35);
        setIntField(term3694856, term3694856.getClass(), "type", 40);
        setField(term3694856, term3694856.getClass(), "str", "toUpperCase");
        setField(term3694764, term3694764.getClass(), "next", term3694856);
        setIntField(term3694764, term3694764.getClass(), "type", 40);
        setField(term3694672, term3694672.getClass(), "first", term3694764);
        setField(term3694672, term3694672.getClass(), "next", null);
        setField(term3694580, term3694580.getClass(), "first", term3694672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3694580;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3694488, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


