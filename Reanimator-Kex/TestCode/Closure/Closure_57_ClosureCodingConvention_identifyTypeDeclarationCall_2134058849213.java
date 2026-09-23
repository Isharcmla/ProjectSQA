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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96319;
     Object term96411;
     Object term96525;
     Object term96526;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96319 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term96411 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term96503 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term96411, term96411.getClass(), "first", term96503);
        term96525 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term96525, term96525.getClass(), "propertyTestFunctions", null);
        term96526 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term96527 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term96526, term96526.getClass(), "number", 0.0);
        setIntField(term96526, term96526.getClass(), "type", 0);
        setField(term96526, term96526.getClass(), "next", null);
        setDoubleField(term96527, term96527.getClass(), "number", 0.0);
        setIntField(term96527, term96527.getClass(), "type", 0);
        setField(term96527, term96527.getClass(), "next", null);
        setField(term96527, term96527.getClass(), "first", null);
        setField(term96527, term96527.getClass(), "last", null);
        setField(term96527, term96527.getClass(), "propListHead", null);
        setIntField(term96527, term96527.getClass(), "sourcePosition", 0);
        setField(term96527, term96527.getClass(), "jsType", null);
        setField(term96527, term96527.getClass(), "parent", null);
        setField(term96526, term96526.getClass(), "first", term96527);
        setField(term96526, term96526.getClass(), "last", null);
        setField(term96526, term96526.getClass(), "propListHead", null);
        setIntField(term96526, term96526.getClass(), "sourcePosition", 0);
        setField(term96526, term96526.getClass(), "jsType", null);
        setField(term96526, term96526.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term96411;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term96319, args);
        assertTrue(recursiveEquals(term96319, term96525));
        assertTrue(recursiveEquals(term96411, term96526));
        assertTrue(recursiveEquals(retValue, null));
    }

};


