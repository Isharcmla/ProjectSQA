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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127643;
     Object term127735;
     Object term127898;
     Object term127899;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127643 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term127735 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term127827 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term127735, term127735.getClass(), "first", term127827);
        term127898 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term127898, term127898.getClass(), "propertyTestFunctions", null);
        term127899 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term127900 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term127899, term127899.getClass(), "str", null);
        setIntField(term127899, term127899.getClass(), "type", 0);
        setField(term127899, term127899.getClass(), "next", null);
        setField(term127900, term127900.getClass(), "str", null);
        setIntField(term127900, term127900.getClass(), "type", 0);
        setField(term127900, term127900.getClass(), "next", null);
        setField(term127900, term127900.getClass(), "first", null);
        setField(term127900, term127900.getClass(), "last", null);
        setField(term127900, term127900.getClass(), "propListHead", null);
        setIntField(term127900, term127900.getClass(), "sourcePosition", 0);
        setField(term127900, term127900.getClass(), "jsType", null);
        setField(term127900, term127900.getClass(), "parent", null);
        setField(term127899, term127899.getClass(), "first", term127900);
        setField(term127899, term127899.getClass(), "last", null);
        setField(term127899, term127899.getClass(), "propListHead", null);
        setIntField(term127899, term127899.getClass(), "sourcePosition", 0);
        setField(term127899, term127899.getClass(), "jsType", null);
        setField(term127899, term127899.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term127735;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term127643, args);
        assertTrue(recursiveEquals(term127643, term127898));
        assertTrue(recursiveEquals(term127735, term127899));
        assertTrue(recursiveEquals(retValue, null));
    }

};


