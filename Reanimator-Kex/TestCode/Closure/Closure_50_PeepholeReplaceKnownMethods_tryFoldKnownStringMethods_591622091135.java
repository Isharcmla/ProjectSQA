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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34064;
     Object term34156;
     Object term34589;
     Object term34590;
     Object term34562;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34064 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term34156 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term34248 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term34156, term34156.getClass(), "type", 37);
        setField(term34156, term34156.getClass(), "first", term34248);
        term34589 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term34589, term34589.getClass(), "currentTraversal", null);
        term34590 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term34591 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term34590, term34590.getClass(), "number", 0.0);
        setIntField(term34590, term34590.getClass(), "type", 37);
        setField(term34590, term34590.getClass(), "next", null);
        setDoubleField(term34591, term34591.getClass(), "number", 0.0);
        setIntField(term34591, term34591.getClass(), "type", 0);
        setField(term34591, term34591.getClass(), "next", null);
        setField(term34591, term34591.getClass(), "first", null);
        setField(term34591, term34591.getClass(), "last", null);
        setField(term34591, term34591.getClass(), "propListHead", null);
        setIntField(term34591, term34591.getClass(), "sourcePosition", 0);
        setField(term34591, term34591.getClass(), "jsType", null);
        setField(term34591, term34591.getClass(), "parent", null);
        setField(term34590, term34590.getClass(), "first", term34591);
        setField(term34590, term34590.getClass(), "last", null);
        setField(term34590, term34590.getClass(), "propListHead", null);
        setIntField(term34590, term34590.getClass(), "sourcePosition", 0);
        setField(term34590, term34590.getClass(), "jsType", null);
        setField(term34590, term34590.getClass(), "parent", null);
        term34562 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term34565 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term34562, term34562.getClass(), "number", 0.0);
        setIntField(term34562, term34562.getClass(), "type", 37);
        setField(term34562, term34562.getClass(), "next", null);
        setDoubleField(term34565, term34565.getClass(), "number", 0.0);
        setIntField(term34565, term34565.getClass(), "type", 0);
        setField(term34565, term34565.getClass(), "next", null);
        setField(term34565, term34565.getClass(), "first", null);
        setField(term34565, term34565.getClass(), "last", null);
        setField(term34565, term34565.getClass(), "propListHead", null);
        setIntField(term34565, term34565.getClass(), "sourcePosition", 0);
        setField(term34565, term34565.getClass(), "jsType", null);
        setField(term34565, term34565.getClass(), "parent", null);
        setField(term34562, term34562.getClass(), "first", term34565);
        setField(term34562, term34562.getClass(), "last", null);
        setField(term34562, term34562.getClass(), "propListHead", null);
        setIntField(term34562, term34562.getClass(), "sourcePosition", 0);
        setField(term34562, term34562.getClass(), "jsType", null);
        setField(term34562, term34562.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34156;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term34064, args);
        assertTrue(recursiveEquals(term34064, term34589));
        assertTrue(recursiveEquals(term34156, term34590));
        assertTrue(recursiveEquals(retValue, term34562));
    }

};


