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

public class PeepholeReplaceKnownMethods_tryFoldParseNumber_123555927146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37485;
     Object term37555;
     Object term37663;
     Object term38107;
     Object term38108;
     Object term38109;
     Object term38069;

    public PeepholeReplaceKnownMethods_tryFoldParseNumber_123555927146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37485 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term37555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37555, term37555.getClass(), "type", 37);
        term37663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37663, term37663.getClass(), "next", term37733);
        term38107 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term38107, term38107.getClass(), "currentTraversal", null);
        term38108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38108, term38108.getClass(), "type", 37);
        setField(term38108, term38108.getClass(), "next", null);
        setField(term38108, term38108.getClass(), "first", null);
        setField(term38108, term38108.getClass(), "last", null);
        setField(term38108, term38108.getClass(), "propListHead", null);
        setIntField(term38108, term38108.getClass(), "sourcePosition", 0);
        setField(term38108, term38108.getClass(), "jsType", null);
        setField(term38108, term38108.getClass(), "parent", null);
        term38109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38109, term38109.getClass(), "type", 0);
        setIntField(term38110, term38110.getClass(), "type", 0);
        setField(term38110, term38110.getClass(), "next", null);
        setField(term38110, term38110.getClass(), "first", null);
        setField(term38110, term38110.getClass(), "last", null);
        setField(term38110, term38110.getClass(), "propListHead", null);
        setIntField(term38110, term38110.getClass(), "sourcePosition", 0);
        setField(term38110, term38110.getClass(), "jsType", null);
        setField(term38110, term38110.getClass(), "parent", null);
        setField(term38109, term38109.getClass(), "next", term38110);
        setField(term38109, term38109.getClass(), "first", null);
        setField(term38109, term38109.getClass(), "last", null);
        setField(term38109, term38109.getClass(), "propListHead", null);
        setIntField(term38109, term38109.getClass(), "sourcePosition", 0);
        setField(term38109, term38109.getClass(), "jsType", null);
        setField(term38109, term38109.getClass(), "parent", null);
        term38069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38069, term38069.getClass(), "type", 37);
        setField(term38069, term38069.getClass(), "next", null);
        setField(term38069, term38069.getClass(), "first", null);
        setField(term38069, term38069.getClass(), "last", null);
        setField(term38069, term38069.getClass(), "propListHead", null);
        setIntField(term38069, term38069.getClass(), "sourcePosition", 0);
        setField(term38069, term38069.getClass(), "jsType", null);
        setField(term38069, term38069.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term37555;
        args[1] = "                  ";
        args[2] = term37663;
        Object retValue = callMethod(klass, "tryFoldParseNumber", argTypes, term37485, args);
        assertTrue(recursiveEquals(term37485, term38107));
        assertTrue(recursiveEquals(term37555, term38108));
        assertTrue(recursiveEquals(term37663, "                  "));
        assertTrue(recursiveEquals(retValue, term38069));
    }

};


