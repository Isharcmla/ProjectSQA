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

public class PeepholeReplaceKnownMethods_tryFoldParseNumber_123555927116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29915;
     Object term29985;
     Object term30093;
     Object term30189;
     Object term30190;
     Object term30191;
     Object term30163;

    public PeepholeReplaceKnownMethods_tryFoldParseNumber_123555927116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29915 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term29985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29985, term29985.getClass(), "type", 37);
        term30093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term30189 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term30189, term30189.getClass(), "currentTraversal", null);
        term30190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30190, term30190.getClass(), "type", 37);
        setField(term30190, term30190.getClass(), "next", null);
        setField(term30190, term30190.getClass(), "first", null);
        setField(term30190, term30190.getClass(), "last", null);
        setField(term30190, term30190.getClass(), "propListHead", null);
        setIntField(term30190, term30190.getClass(), "sourcePosition", 0);
        setField(term30190, term30190.getClass(), "jsType", null);
        setField(term30190, term30190.getClass(), "parent", null);
        term30191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30191, term30191.getClass(), "type", 0);
        setField(term30191, term30191.getClass(), "next", null);
        setField(term30191, term30191.getClass(), "first", null);
        setField(term30191, term30191.getClass(), "last", null);
        setField(term30191, term30191.getClass(), "propListHead", null);
        setIntField(term30191, term30191.getClass(), "sourcePosition", 0);
        setField(term30191, term30191.getClass(), "jsType", null);
        setField(term30191, term30191.getClass(), "parent", null);
        term30163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30163, term30163.getClass(), "type", 37);
        setField(term30163, term30163.getClass(), "next", null);
        setField(term30163, term30163.getClass(), "first", null);
        setField(term30163, term30163.getClass(), "last", null);
        setField(term30163, term30163.getClass(), "propListHead", null);
        setIntField(term30163, term30163.getClass(), "sourcePosition", 0);
        setField(term30163, term30163.getClass(), "jsType", null);
        setField(term30163, term30163.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term29985;
        args[1] = "         ";
        args[2] = term30093;
        Object retValue = callMethod(klass, "tryFoldParseNumber", argTypes, term29915, args);
        assertTrue(recursiveEquals(term29915, term30189));
        assertTrue(recursiveEquals(term29985, term30190));
        assertTrue(recursiveEquals(term30093, "         "));
        assertTrue(recursiveEquals(retValue, term30163));
    }

};


