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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3709789;
     Object term3709881;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3709789 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3709881 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3709973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3710065 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3710157 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3710325 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3709973, term3709973.getClass(), "type", 35);
        setIntField(term3710157, term3710157.getClass(), "type", 40);
        setField(term3710157, term3710157.getClass(), "str", "lastIndexOf");
        setField(term3710065, term3710065.getClass(), "next", term3710157);
        setIntField(term3710065, term3710065.getClass(), "type", 40);
        setField(term3710065, term3710065.getClass(), "str", "");
        setField(term3709973, term3709973.getClass(), "first", term3710065);
        setIntField(term3710325, term3710325.getClass(), "type", 41);
        setField(term3710325, term3710325.getClass(), "next", null);
        setField(term3709973, term3709973.getClass(), "next", term3710325);
        setField(term3709881, term3709881.getClass(), "first", term3709973);
        setIntField(term3709881, term3709881.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3709881;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3709789, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


