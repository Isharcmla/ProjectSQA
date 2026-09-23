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

public class PeepholeFoldConstants_tryFoldKnownMethods_889469083102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18369;
     Object term18439;
     Object term18761;
     Object term18762;
     Object term18715;

    public PeepholeFoldConstants_tryFoldKnownMethods_889469083102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18369 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term18439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18509, term18509.getClass(), "type", 37);
        setField(term18439, term18439.getClass(), "first", term18509);
        setIntField(term18439, term18439.getClass(), "type", 37);
        term18761 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term18761, term18761.getClass(), "currentTraversal", null);
        term18762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18762, term18762.getClass(), "type", 37);
        setField(term18762, term18762.getClass(), "next", null);
        setIntField(term18763, term18763.getClass(), "type", 37);
        setField(term18763, term18763.getClass(), "next", null);
        setField(term18763, term18763.getClass(), "first", null);
        setField(term18763, term18763.getClass(), "last", null);
        setField(term18763, term18763.getClass(), "propListHead", null);
        setIntField(term18763, term18763.getClass(), "sourcePosition", 0);
        setField(term18763, term18763.getClass(), "jsType", null);
        setField(term18763, term18763.getClass(), "parent", null);
        setField(term18762, term18762.getClass(), "first", term18763);
        setField(term18762, term18762.getClass(), "last", null);
        setField(term18762, term18762.getClass(), "propListHead", null);
        setIntField(term18762, term18762.getClass(), "sourcePosition", 0);
        setField(term18762, term18762.getClass(), "jsType", null);
        setField(term18762, term18762.getClass(), "parent", null);
        term18715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18715, term18715.getClass(), "type", 37);
        setField(term18715, term18715.getClass(), "next", null);
        setIntField(term18717, term18717.getClass(), "type", 37);
        setField(term18717, term18717.getClass(), "next", null);
        setField(term18717, term18717.getClass(), "first", null);
        setField(term18717, term18717.getClass(), "last", null);
        setField(term18717, term18717.getClass(), "propListHead", null);
        setIntField(term18717, term18717.getClass(), "sourcePosition", 0);
        setField(term18717, term18717.getClass(), "jsType", null);
        setField(term18717, term18717.getClass(), "parent", null);
        setField(term18715, term18715.getClass(), "first", term18717);
        setField(term18715, term18715.getClass(), "last", null);
        setField(term18715, term18715.getClass(), "propListHead", null);
        setIntField(term18715, term18715.getClass(), "sourcePosition", 0);
        setField(term18715, term18715.getClass(), "jsType", null);
        setField(term18715, term18715.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18439;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term18369, args);
        assertTrue(recursiveEquals(term18369, term18761));
        assertTrue(recursiveEquals(term18439, term18762));
        assertTrue(recursiveEquals(retValue, term18715));
    }

};


