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

public class PeepholeSubstituteAlternateSyntax_tryFoldRegularExpressionConstructor_212458914967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8336;
     Object term8406;
     Object term31554;
     Object term31555;
     Object term31535;

    public PeepholeSubstituteAlternateSyntax_tryFoldRegularExpressionConstructor_212458914967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8336 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term8406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term8406, term8406.getClass(), "parent", term8476);
        setField(term8546, term8546.getClass(), "next", null);
        setField(term8406, term8406.getClass(), "first", term8546);
        term31554 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term31554, term31554.getClass(), "late", false);
        setField(term31554, term31554.getClass(), "compiler", null);
        term31555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31555, term31555.getClass(), "type", 0);
        setField(term31555, term31555.getClass(), "next", null);
        setIntField(term31556, term31556.getClass(), "type", 0);
        setField(term31556, term31556.getClass(), "next", null);
        setField(term31556, term31556.getClass(), "first", null);
        setField(term31556, term31556.getClass(), "last", null);
        setField(term31556, term31556.getClass(), "propListHead", null);
        setIntField(term31556, term31556.getClass(), "sourcePosition", 0);
        setField(term31556, term31556.getClass(), "jsType", null);
        setField(term31556, term31556.getClass(), "parent", null);
        setField(term31555, term31555.getClass(), "first", term31556);
        setField(term31555, term31555.getClass(), "last", null);
        setField(term31555, term31555.getClass(), "propListHead", null);
        setIntField(term31555, term31555.getClass(), "sourcePosition", 0);
        setField(term31555, term31555.getClass(), "jsType", null);
        setIntField(term31557, term31557.getClass(), "type", 0);
        setField(term31557, term31557.getClass(), "next", null);
        setField(term31557, term31557.getClass(), "first", null);
        setField(term31557, term31557.getClass(), "last", null);
        setField(term31557, term31557.getClass(), "propListHead", null);
        setIntField(term31557, term31557.getClass(), "sourcePosition", 0);
        setField(term31557, term31557.getClass(), "jsType", null);
        setField(term31557, term31557.getClass(), "parent", null);
        setField(term31555, term31555.getClass(), "parent", term31557);
        term31535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31535, term31535.getClass(), "type", 0);
        setField(term31535, term31535.getClass(), "next", null);
        setIntField(term31537, term31537.getClass(), "type", 0);
        setField(term31537, term31537.getClass(), "next", null);
        setField(term31537, term31537.getClass(), "first", null);
        setField(term31537, term31537.getClass(), "last", null);
        setField(term31537, term31537.getClass(), "propListHead", null);
        setIntField(term31537, term31537.getClass(), "sourcePosition", 0);
        setField(term31537, term31537.getClass(), "jsType", null);
        setField(term31537, term31537.getClass(), "parent", null);
        setField(term31535, term31535.getClass(), "first", term31537);
        setField(term31535, term31535.getClass(), "last", null);
        setField(term31535, term31535.getClass(), "propListHead", null);
        setIntField(term31535, term31535.getClass(), "sourcePosition", 0);
        setField(term31535, term31535.getClass(), "jsType", null);
        setIntField(term31541, term31541.getClass(), "type", 0);
        setField(term31541, term31541.getClass(), "next", null);
        setField(term31541, term31541.getClass(), "first", null);
        setField(term31541, term31541.getClass(), "last", null);
        setField(term31541, term31541.getClass(), "propListHead", null);
        setIntField(term31541, term31541.getClass(), "sourcePosition", 0);
        setField(term31541, term31541.getClass(), "jsType", null);
        setField(term31541, term31541.getClass(), "parent", null);
        setField(term31535, term31535.getClass(), "parent", term31541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8406;
        Object retValue = callMethod(klass, "tryFoldRegularExpressionConstructor", argTypes, term8336, args);
        assertTrue(recursiveEquals(term8336, term31554));
        assertTrue(recursiveEquals(term8406, term31555));
        assertTrue(recursiveEquals(retValue, term31535));
    }

};


