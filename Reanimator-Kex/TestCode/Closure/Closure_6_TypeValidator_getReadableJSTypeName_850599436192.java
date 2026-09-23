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

public class TypeValidator_getReadableJSTypeName_850599436192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51542;
     Object term51634;
     Object term51786;
     Object term51787;

    public TypeValidator_getReadableJSTypeName_850599436192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51542 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term51634 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term51726 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setIntField(term51634, term51634.getClass(), "type", -34);
        setField(term51634, term51634.getClass(), "jsType", term51726);
        term51786 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term51786, term51786.getClass(), "compiler", null);
        setField(term51786, term51786.getClass(), "typeRegistry", null);
        setField(term51786, term51786.getClass(), "allValueTypes", null);
        setBooleanField(term51786, term51786.getClass(), "shouldReport", false);
        setField(term51786, term51786.getClass(), "nullOrUndefined", null);
        setField(term51786, term51786.getClass(), "mismatches", null);
        term51787 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term51788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setField(term51787, term51787.getClass(), "str", null);
        setIntField(term51787, term51787.getClass(), "type", -34);
        setField(term51787, term51787.getClass(), "next", null);
        setField(term51787, term51787.getClass(), "first", null);
        setField(term51787, term51787.getClass(), "last", null);
        setField(term51787, term51787.getClass(), "propListHead", null);
        setIntField(term51787, term51787.getClass(), "sourcePosition", 0);
        setBooleanField(term51788, term51788.getClass(), "resolved", false);
        setField(term51788, term51788.getClass(), "resolveResult", null);
        setField(term51788, term51788.getClass(), "templateKeys", null);
        setField(term51788, term51788.getClass(), "templatizedTypes", null);
        setBooleanField(term51788, term51788.getClass(), "inTemplatedCheckVisit", false);
        setField(term51788, term51788.getClass(), "registry", null);
        setField(term51787, term51787.getClass(), "jsType", term51788);
        setField(term51787, term51787.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term51634;
        args[1] = false;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term51542, args);
        assertTrue(recursiveEquals(term51542, term51786));
        assertTrue(recursiveEquals(term51634, term51787));
        assertTrue(recursiveEquals(retValue, "null"));
    }

};


