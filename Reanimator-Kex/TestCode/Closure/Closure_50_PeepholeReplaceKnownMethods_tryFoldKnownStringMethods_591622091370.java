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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2643903;
     Object term2643995;
     Object term2644451;
     Object term2644452;
     Object term2644385;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2643903 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2643995 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2644087 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2644157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2644249 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2643995, term2643995.getClass(), "type", 37);
        setIntField(term2644087, term2644087.getClass(), "type", 35);
        setField(term2644157, term2644157.getClass(), "next", term2644249);
        setIntField(term2644157, term2644157.getClass(), "type", 40);
        setField(term2644087, term2644087.getClass(), "first", term2644157);
        setField(term2643995, term2643995.getClass(), "first", term2644087);
        term2644451 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2644451, term2644451.getClass(), "currentTraversal", null);
        term2644452 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2644453 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2644454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2644455 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term2644452, term2644452.getClass(), "str", null);
        setIntField(term2644452, term2644452.getClass(), "type", 37);
        setField(term2644452, term2644452.getClass(), "next", null);
        setDoubleField(term2644453, term2644453.getClass(), "number", 0.0);
        setIntField(term2644453, term2644453.getClass(), "type", 35);
        setField(term2644453, term2644453.getClass(), "next", null);
        setIntField(term2644454, term2644454.getClass(), "type", 40);
        setDoubleField(term2644455, term2644455.getClass(), "number", 0.0);
        setIntField(term2644455, term2644455.getClass(), "type", 0);
        setField(term2644455, term2644455.getClass(), "next", null);
        setField(term2644455, term2644455.getClass(), "first", null);
        setField(term2644455, term2644455.getClass(), "last", null);
        setField(term2644455, term2644455.getClass(), "propListHead", null);
        setIntField(term2644455, term2644455.getClass(), "sourcePosition", 0);
        setField(term2644455, term2644455.getClass(), "jsType", null);
        setField(term2644455, term2644455.getClass(), "parent", null);
        setField(term2644454, term2644454.getClass(), "next", term2644455);
        setField(term2644454, term2644454.getClass(), "first", null);
        setField(term2644454, term2644454.getClass(), "last", null);
        setField(term2644454, term2644454.getClass(), "propListHead", null);
        setIntField(term2644454, term2644454.getClass(), "sourcePosition", 0);
        setField(term2644454, term2644454.getClass(), "jsType", null);
        setField(term2644454, term2644454.getClass(), "parent", null);
        setField(term2644453, term2644453.getClass(), "first", term2644454);
        setField(term2644453, term2644453.getClass(), "last", null);
        setField(term2644453, term2644453.getClass(), "propListHead", null);
        setIntField(term2644453, term2644453.getClass(), "sourcePosition", 0);
        setField(term2644453, term2644453.getClass(), "jsType", null);
        setField(term2644453, term2644453.getClass(), "parent", null);
        setField(term2644452, term2644452.getClass(), "first", term2644453);
        setField(term2644452, term2644452.getClass(), "last", null);
        setField(term2644452, term2644452.getClass(), "propListHead", null);
        setIntField(term2644452, term2644452.getClass(), "sourcePosition", 0);
        setField(term2644452, term2644452.getClass(), "jsType", null);
        setField(term2644452, term2644452.getClass(), "parent", null);
        term2644385 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2644387 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2644390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2644392 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term2644385, term2644385.getClass(), "str", null);
        setIntField(term2644385, term2644385.getClass(), "type", 37);
        setField(term2644385, term2644385.getClass(), "next", null);
        setDoubleField(term2644387, term2644387.getClass(), "number", 0.0);
        setIntField(term2644387, term2644387.getClass(), "type", 35);
        setField(term2644387, term2644387.getClass(), "next", null);
        setIntField(term2644390, term2644390.getClass(), "type", 40);
        setDoubleField(term2644392, term2644392.getClass(), "number", 0.0);
        setIntField(term2644392, term2644392.getClass(), "type", 0);
        setField(term2644392, term2644392.getClass(), "next", null);
        setField(term2644392, term2644392.getClass(), "first", null);
        setField(term2644392, term2644392.getClass(), "last", null);
        setField(term2644392, term2644392.getClass(), "propListHead", null);
        setIntField(term2644392, term2644392.getClass(), "sourcePosition", 0);
        setField(term2644392, term2644392.getClass(), "jsType", null);
        setField(term2644392, term2644392.getClass(), "parent", null);
        setField(term2644390, term2644390.getClass(), "next", term2644392);
        setField(term2644390, term2644390.getClass(), "first", null);
        setField(term2644390, term2644390.getClass(), "last", null);
        setField(term2644390, term2644390.getClass(), "propListHead", null);
        setIntField(term2644390, term2644390.getClass(), "sourcePosition", 0);
        setField(term2644390, term2644390.getClass(), "jsType", null);
        setField(term2644390, term2644390.getClass(), "parent", null);
        setField(term2644387, term2644387.getClass(), "first", term2644390);
        setField(term2644387, term2644387.getClass(), "last", null);
        setField(term2644387, term2644387.getClass(), "propListHead", null);
        setIntField(term2644387, term2644387.getClass(), "sourcePosition", 0);
        setField(term2644387, term2644387.getClass(), "jsType", null);
        setField(term2644387, term2644387.getClass(), "parent", null);
        setField(term2644385, term2644385.getClass(), "first", term2644387);
        setField(term2644385, term2644385.getClass(), "last", null);
        setField(term2644385, term2644385.getClass(), "propListHead", null);
        setIntField(term2644385, term2644385.getClass(), "sourcePosition", 0);
        setField(term2644385, term2644385.getClass(), "jsType", null);
        setField(term2644385, term2644385.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2643995;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2643903, args);
        assertTrue(recursiveEquals(term2643903, term2644451));
        assertTrue(recursiveEquals(term2643995, term2644452));
        assertTrue(recursiveEquals(retValue, term2644385));
    }

};


