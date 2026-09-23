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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60260;
     Object term60352;
     Object term61785;
     Object term61786;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60260 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term60352 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60444 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term60352, term60352.getClass(), "first", term60444);
        term61785 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term61785, term61785.getClass(), "propertyTestFunctions", null);
        term61786 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61787 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term61786, term61786.getClass(), "number", 0.0);
        setIntField(term61786, term61786.getClass(), "type", 0);
        setField(term61786, term61786.getClass(), "next", null);
        setDoubleField(term61787, term61787.getClass(), "number", 0.0);
        setIntField(term61787, term61787.getClass(), "type", 0);
        setField(term61787, term61787.getClass(), "next", null);
        setField(term61787, term61787.getClass(), "first", null);
        setField(term61787, term61787.getClass(), "last", null);
        setField(term61787, term61787.getClass(), "propListHead", null);
        setIntField(term61787, term61787.getClass(), "sourcePosition", 0);
        setField(term61787, term61787.getClass(), "jsType", null);
        setField(term61787, term61787.getClass(), "parent", null);
        setField(term61786, term61786.getClass(), "first", term61787);
        setField(term61786, term61786.getClass(), "last", null);
        setField(term61786, term61786.getClass(), "propListHead", null);
        setIntField(term61786, term61786.getClass(), "sourcePosition", 0);
        setField(term61786, term61786.getClass(), "jsType", null);
        setField(term61786, term61786.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term60352;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term60260, args);
        assertTrue(recursiveEquals(term60260, term61785));
        assertTrue(recursiveEquals(term60352, term61786));
        assertTrue(recursiveEquals(retValue, null));
    }

};


