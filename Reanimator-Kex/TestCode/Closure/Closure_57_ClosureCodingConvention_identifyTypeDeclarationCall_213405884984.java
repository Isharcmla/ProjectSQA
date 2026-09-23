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

public class ClosureCodingConvention_identifyTypeDeclarationCall_213405884984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47530;
     Object term47600;
     Object term47815;
     Object term47816;

    public ClosureCodingConvention_identifyTypeDeclarationCall_213405884984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47530 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term47600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47600, term47600.getClass(), "first", term47600);
        setIntField(term47600, term47600.getClass(), "type", 42);
        term47815 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term47815, term47815.getClass(), "propertyTestFunctions", null);
        term47816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47816, term47816.getClass(), "type", 42);
        setField(term47816, term47816.getClass(), "next", null);
        setField(term47816, term47816.getClass(), "first", term47816);
        setField(term47816, term47816.getClass(), "last", null);
        setField(term47816, term47816.getClass(), "propListHead", null);
        setIntField(term47816, term47816.getClass(), "sourcePosition", 0);
        setField(term47816, term47816.getClass(), "jsType", null);
        setField(term47816, term47816.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term47600;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term47530, args);
        assertTrue(recursiveEquals(term47530, term47815));
        assertTrue(recursiveEquals(term47600, term47816));
        assertTrue(recursiveEquals(retValue, null));
    }

};


