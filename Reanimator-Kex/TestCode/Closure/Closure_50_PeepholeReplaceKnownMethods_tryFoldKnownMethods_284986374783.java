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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3664924;
     Object term3665016;
     Object term3666830;
     Object term3666831;
     Object term3666526;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3664924 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3665016 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3665108 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3665200 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3665292 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3665422 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3665108, term3665108.getClass(), "type", 35);
        setIntField(term3665292, term3665292.getClass(), "type", 40);
        setField(term3665292, term3665292.getClass(), "str", "charCodeAt");
        setField(term3665200, term3665200.getClass(), "next", term3665292);
        setIntField(term3665200, term3665200.getClass(), "type", 40);
        setField(term3665108, term3665108.getClass(), "first", term3665200);
        setIntField(term3665422, term3665422.getClass(), "type", 43);
        setField(term3665108, term3665108.getClass(), "next", term3665422);
        setField(term3665016, term3665016.getClass(), "first", term3665108);
        setIntField(term3665016, term3665016.getClass(), "type", 37);
        term3666830 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3666830, term3666830.getClass(), "currentTraversal", null);
        term3666831 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3666832 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3666833 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3666834 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3666835 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3666831, term3666831.getClass(), "str", null);
        setIntField(term3666831, term3666831.getClass(), "type", 37);
        setField(term3666831, term3666831.getClass(), "next", null);
        setField(term3666832, term3666832.getClass(), "str", null);
        setIntField(term3666832, term3666832.getClass(), "type", 35);
        setDoubleField(term3666833, term3666833.getClass(), "number", 0.0);
        setIntField(term3666833, term3666833.getClass(), "type", 43);
        setField(term3666833, term3666833.getClass(), "next", null);
        setField(term3666833, term3666833.getClass(), "first", null);
        setField(term3666833, term3666833.getClass(), "last", null);
        setField(term3666833, term3666833.getClass(), "propListHead", null);
        setIntField(term3666833, term3666833.getClass(), "sourcePosition", 0);
        setField(term3666833, term3666833.getClass(), "jsType", null);
        setField(term3666833, term3666833.getClass(), "parent", null);
        setField(term3666832, term3666832.getClass(), "next", term3666833);
        setField(term3666834, term3666834.getClass(), "str", null);
        setIntField(term3666834, term3666834.getClass(), "type", 40);
        setField(term3666835, term3666835.getClass(), "str", "");
        setIntField(term3666835, term3666835.getClass(), "type", 40);
        setField(term3666835, term3666835.getClass(), "next", null);
        setField(term3666835, term3666835.getClass(), "first", null);
        setField(term3666835, term3666835.getClass(), "last", null);
        setField(term3666835, term3666835.getClass(), "propListHead", null);
        setIntField(term3666835, term3666835.getClass(), "sourcePosition", 0);
        setField(term3666835, term3666835.getClass(), "jsType", null);
        setField(term3666835, term3666835.getClass(), "parent", null);
        setField(term3666834, term3666834.getClass(), "next", term3666835);
        setField(term3666834, term3666834.getClass(), "first", null);
        setField(term3666834, term3666834.getClass(), "last", null);
        setField(term3666834, term3666834.getClass(), "propListHead", null);
        setIntField(term3666834, term3666834.getClass(), "sourcePosition", 0);
        setField(term3666834, term3666834.getClass(), "jsType", null);
        setField(term3666834, term3666834.getClass(), "parent", null);
        setField(term3666832, term3666832.getClass(), "first", term3666834);
        setField(term3666832, term3666832.getClass(), "last", null);
        setField(term3666832, term3666832.getClass(), "propListHead", null);
        setIntField(term3666832, term3666832.getClass(), "sourcePosition", 0);
        setField(term3666832, term3666832.getClass(), "jsType", null);
        setField(term3666832, term3666832.getClass(), "parent", null);
        setField(term3666831, term3666831.getClass(), "first", term3666832);
        setField(term3666831, term3666831.getClass(), "last", null);
        setField(term3666831, term3666831.getClass(), "propListHead", null);
        setIntField(term3666831, term3666831.getClass(), "sourcePosition", 0);
        setField(term3666831, term3666831.getClass(), "jsType", null);
        setField(term3666831, term3666831.getClass(), "parent", null);
        term3666526 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3666528 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3666530 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3666534 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3666536 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3666526, term3666526.getClass(), "str", null);
        setIntField(term3666526, term3666526.getClass(), "type", 37);
        setField(term3666526, term3666526.getClass(), "next", null);
        setField(term3666528, term3666528.getClass(), "str", null);
        setIntField(term3666528, term3666528.getClass(), "type", 35);
        setDoubleField(term3666530, term3666530.getClass(), "number", 0.0);
        setIntField(term3666530, term3666530.getClass(), "type", 43);
        setField(term3666530, term3666530.getClass(), "next", null);
        setField(term3666530, term3666530.getClass(), "first", null);
        setField(term3666530, term3666530.getClass(), "last", null);
        setField(term3666530, term3666530.getClass(), "propListHead", null);
        setIntField(term3666530, term3666530.getClass(), "sourcePosition", 0);
        setField(term3666530, term3666530.getClass(), "jsType", null);
        setField(term3666530, term3666530.getClass(), "parent", null);
        setField(term3666528, term3666528.getClass(), "next", term3666530);
        setField(term3666534, term3666534.getClass(), "str", null);
        setIntField(term3666534, term3666534.getClass(), "type", 40);
        setField(term3666536, term3666536.getClass(), "str", "");
        setIntField(term3666536, term3666536.getClass(), "type", 40);
        setField(term3666536, term3666536.getClass(), "next", null);
        setField(term3666536, term3666536.getClass(), "first", null);
        setField(term3666536, term3666536.getClass(), "last", null);
        setField(term3666536, term3666536.getClass(), "propListHead", null);
        setIntField(term3666536, term3666536.getClass(), "sourcePosition", 0);
        setField(term3666536, term3666536.getClass(), "jsType", null);
        setField(term3666536, term3666536.getClass(), "parent", null);
        setField(term3666534, term3666534.getClass(), "next", term3666536);
        setField(term3666534, term3666534.getClass(), "first", null);
        setField(term3666534, term3666534.getClass(), "last", null);
        setField(term3666534, term3666534.getClass(), "propListHead", null);
        setIntField(term3666534, term3666534.getClass(), "sourcePosition", 0);
        setField(term3666534, term3666534.getClass(), "jsType", null);
        setField(term3666534, term3666534.getClass(), "parent", null);
        setField(term3666528, term3666528.getClass(), "first", term3666534);
        setField(term3666528, term3666528.getClass(), "last", null);
        setField(term3666528, term3666528.getClass(), "propListHead", null);
        setIntField(term3666528, term3666528.getClass(), "sourcePosition", 0);
        setField(term3666528, term3666528.getClass(), "jsType", null);
        setField(term3666528, term3666528.getClass(), "parent", null);
        setField(term3666526, term3666526.getClass(), "first", term3666528);
        setField(term3666526, term3666526.getClass(), "last", null);
        setField(term3666526, term3666526.getClass(), "propListHead", null);
        setIntField(term3666526, term3666526.getClass(), "sourcePosition", 0);
        setField(term3666526, term3666526.getClass(), "jsType", null);
        setField(term3666526, term3666526.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3665016;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3664924, args);
        assertTrue(recursiveEquals(term3664924, term3666830));
        assertTrue(recursiveEquals(term3665016, term3666831));
        assertTrue(recursiveEquals(retValue, term3666526));
    }

};


