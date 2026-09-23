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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3550729;
     Object term3550821;
     Object term3552182;
     Object term3552183;
     Object term3551926;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3550729 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3550821 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3550913 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3551005 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3551097 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3551227 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3550913, term3550913.getClass(), "type", 35);
        setIntField(term3551097, term3551097.getClass(), "type", 40);
        setField(term3551097, term3551097.getClass(), "str", "substr");
        setField(term3551005, term3551005.getClass(), "next", term3551097);
        setIntField(term3551005, term3551005.getClass(), "type", 40);
        setField(term3550913, term3550913.getClass(), "first", term3551005);
        setIntField(term3551227, term3551227.getClass(), "type", 44);
        setField(term3550913, term3550913.getClass(), "next", term3551227);
        setField(term3550821, term3550821.getClass(), "first", term3550913);
        setIntField(term3550821, term3550821.getClass(), "type", 37);
        term3552182 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3552182, term3552182.getClass(), "currentTraversal", null);
        term3552183 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3552184 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3552185 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3552186 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3552187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3552183, term3552183.getClass(), "str", null);
        setIntField(term3552183, term3552183.getClass(), "type", 37);
        setField(term3552183, term3552183.getClass(), "next", null);
        setField(term3552184, term3552184.getClass(), "str", null);
        setIntField(term3552184, term3552184.getClass(), "type", 35);
        setField(term3552185, term3552185.getClass(), "str", null);
        setIntField(term3552185, term3552185.getClass(), "type", 44);
        setField(term3552185, term3552185.getClass(), "next", null);
        setField(term3552185, term3552185.getClass(), "first", null);
        setField(term3552185, term3552185.getClass(), "last", null);
        setField(term3552185, term3552185.getClass(), "propListHead", null);
        setIntField(term3552185, term3552185.getClass(), "sourcePosition", 0);
        setField(term3552185, term3552185.getClass(), "jsType", null);
        setField(term3552185, term3552185.getClass(), "parent", null);
        setField(term3552184, term3552184.getClass(), "next", term3552185);
        setField(term3552186, term3552186.getClass(), "str", null);
        setIntField(term3552186, term3552186.getClass(), "type", 40);
        setField(term3552187, term3552187.getClass(), "str", "");
        setIntField(term3552187, term3552187.getClass(), "type", 40);
        setField(term3552187, term3552187.getClass(), "next", null);
        setField(term3552187, term3552187.getClass(), "first", null);
        setField(term3552187, term3552187.getClass(), "last", null);
        setField(term3552187, term3552187.getClass(), "propListHead", null);
        setIntField(term3552187, term3552187.getClass(), "sourcePosition", 0);
        setField(term3552187, term3552187.getClass(), "jsType", null);
        setField(term3552187, term3552187.getClass(), "parent", null);
        setField(term3552186, term3552186.getClass(), "next", term3552187);
        setField(term3552186, term3552186.getClass(), "first", null);
        setField(term3552186, term3552186.getClass(), "last", null);
        setField(term3552186, term3552186.getClass(), "propListHead", null);
        setIntField(term3552186, term3552186.getClass(), "sourcePosition", 0);
        setField(term3552186, term3552186.getClass(), "jsType", null);
        setField(term3552186, term3552186.getClass(), "parent", null);
        setField(term3552184, term3552184.getClass(), "first", term3552186);
        setField(term3552184, term3552184.getClass(), "last", null);
        setField(term3552184, term3552184.getClass(), "propListHead", null);
        setIntField(term3552184, term3552184.getClass(), "sourcePosition", 0);
        setField(term3552184, term3552184.getClass(), "jsType", null);
        setField(term3552184, term3552184.getClass(), "parent", null);
        setField(term3552183, term3552183.getClass(), "first", term3552184);
        setField(term3552183, term3552183.getClass(), "last", null);
        setField(term3552183, term3552183.getClass(), "propListHead", null);
        setIntField(term3552183, term3552183.getClass(), "sourcePosition", 0);
        setField(term3552183, term3552183.getClass(), "jsType", null);
        setField(term3552183, term3552183.getClass(), "parent", null);
        term3551926 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3551928 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3551930 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3551933 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3551935 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3551926, term3551926.getClass(), "str", null);
        setIntField(term3551926, term3551926.getClass(), "type", 37);
        setField(term3551926, term3551926.getClass(), "next", null);
        setField(term3551928, term3551928.getClass(), "str", null);
        setIntField(term3551928, term3551928.getClass(), "type", 35);
        setField(term3551930, term3551930.getClass(), "str", null);
        setIntField(term3551930, term3551930.getClass(), "type", 44);
        setField(term3551930, term3551930.getClass(), "next", null);
        setField(term3551930, term3551930.getClass(), "first", null);
        setField(term3551930, term3551930.getClass(), "last", null);
        setField(term3551930, term3551930.getClass(), "propListHead", null);
        setIntField(term3551930, term3551930.getClass(), "sourcePosition", 0);
        setField(term3551930, term3551930.getClass(), "jsType", null);
        setField(term3551930, term3551930.getClass(), "parent", null);
        setField(term3551928, term3551928.getClass(), "next", term3551930);
        setField(term3551933, term3551933.getClass(), "str", null);
        setIntField(term3551933, term3551933.getClass(), "type", 40);
        setField(term3551935, term3551935.getClass(), "str", "");
        setIntField(term3551935, term3551935.getClass(), "type", 40);
        setField(term3551935, term3551935.getClass(), "next", null);
        setField(term3551935, term3551935.getClass(), "first", null);
        setField(term3551935, term3551935.getClass(), "last", null);
        setField(term3551935, term3551935.getClass(), "propListHead", null);
        setIntField(term3551935, term3551935.getClass(), "sourcePosition", 0);
        setField(term3551935, term3551935.getClass(), "jsType", null);
        setField(term3551935, term3551935.getClass(), "parent", null);
        setField(term3551933, term3551933.getClass(), "next", term3551935);
        setField(term3551933, term3551933.getClass(), "first", null);
        setField(term3551933, term3551933.getClass(), "last", null);
        setField(term3551933, term3551933.getClass(), "propListHead", null);
        setIntField(term3551933, term3551933.getClass(), "sourcePosition", 0);
        setField(term3551933, term3551933.getClass(), "jsType", null);
        setField(term3551933, term3551933.getClass(), "parent", null);
        setField(term3551928, term3551928.getClass(), "first", term3551933);
        setField(term3551928, term3551928.getClass(), "last", null);
        setField(term3551928, term3551928.getClass(), "propListHead", null);
        setIntField(term3551928, term3551928.getClass(), "sourcePosition", 0);
        setField(term3551928, term3551928.getClass(), "jsType", null);
        setField(term3551928, term3551928.getClass(), "parent", null);
        setField(term3551926, term3551926.getClass(), "first", term3551928);
        setField(term3551926, term3551926.getClass(), "last", null);
        setField(term3551926, term3551926.getClass(), "propListHead", null);
        setIntField(term3551926, term3551926.getClass(), "sourcePosition", 0);
        setField(term3551926, term3551926.getClass(), "jsType", null);
        setField(term3551926, term3551926.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3550821;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3550729, args);
        assertTrue(recursiveEquals(term3550729, term3552182));
        assertTrue(recursiveEquals(term3550821, term3552183));
        assertTrue(recursiveEquals(retValue, term3551926));
    }

};


