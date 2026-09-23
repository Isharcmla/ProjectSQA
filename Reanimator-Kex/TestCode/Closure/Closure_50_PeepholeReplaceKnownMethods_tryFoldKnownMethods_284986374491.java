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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3475848;
     Object term3475940;
     Object term3478010;
     Object term3478011;
     Object term3477738;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3475848 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3475940 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3476032 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3476124 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3476216 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3476346 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3476032, term3476032.getClass(), "type", 35);
        setIntField(term3476216, term3476216.getClass(), "type", 40);
        setField(term3476216, term3476216.getClass(), "str", "indexOf");
        setField(term3476124, term3476124.getClass(), "next", term3476216);
        setIntField(term3476124, term3476124.getClass(), "type", 40);
        setField(term3476124, term3476124.getClass(), "str", null);
        setField(term3476032, term3476032.getClass(), "first", term3476124);
        setIntField(term3476346, term3476346.getClass(), "type", 40);
        setField(term3476346, term3476346.getClass(), "next", null);
        setField(term3476346, term3476346.getClass(), "str", null);
        setField(term3476032, term3476032.getClass(), "next", term3476346);
        setField(term3475940, term3475940.getClass(), "first", term3476032);
        setIntField(term3475940, term3475940.getClass(), "type", 37);
        term3478010 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3478010, term3478010.getClass(), "currentTraversal", null);
        term3478011 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3478012 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3478013 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3478014 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3478015 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3478011, term3478011.getClass(), "str", null);
        setIntField(term3478011, term3478011.getClass(), "type", 37);
        setField(term3478011, term3478011.getClass(), "next", null);
        setField(term3478012, term3478012.getClass(), "str", null);
        setIntField(term3478012, term3478012.getClass(), "type", 35);
        setField(term3478013, term3478013.getClass(), "str", null);
        setIntField(term3478013, term3478013.getClass(), "type", 40);
        setField(term3478013, term3478013.getClass(), "next", null);
        setField(term3478013, term3478013.getClass(), "first", null);
        setField(term3478013, term3478013.getClass(), "last", null);
        setField(term3478013, term3478013.getClass(), "propListHead", null);
        setIntField(term3478013, term3478013.getClass(), "sourcePosition", 0);
        setField(term3478013, term3478013.getClass(), "jsType", null);
        setField(term3478013, term3478013.getClass(), "parent", null);
        setField(term3478012, term3478012.getClass(), "next", term3478013);
        setField(term3478014, term3478014.getClass(), "str", null);
        setIntField(term3478014, term3478014.getClass(), "type", 40);
        setField(term3478015, term3478015.getClass(), "str", "");
        setIntField(term3478015, term3478015.getClass(), "type", 40);
        setField(term3478015, term3478015.getClass(), "next", null);
        setField(term3478015, term3478015.getClass(), "first", null);
        setField(term3478015, term3478015.getClass(), "last", null);
        setField(term3478015, term3478015.getClass(), "propListHead", null);
        setIntField(term3478015, term3478015.getClass(), "sourcePosition", 0);
        setField(term3478015, term3478015.getClass(), "jsType", null);
        setField(term3478015, term3478015.getClass(), "parent", null);
        setField(term3478014, term3478014.getClass(), "next", term3478015);
        setField(term3478014, term3478014.getClass(), "first", null);
        setField(term3478014, term3478014.getClass(), "last", null);
        setField(term3478014, term3478014.getClass(), "propListHead", null);
        setIntField(term3478014, term3478014.getClass(), "sourcePosition", 0);
        setField(term3478014, term3478014.getClass(), "jsType", null);
        setField(term3478014, term3478014.getClass(), "parent", null);
        setField(term3478012, term3478012.getClass(), "first", term3478014);
        setField(term3478012, term3478012.getClass(), "last", null);
        setField(term3478012, term3478012.getClass(), "propListHead", null);
        setIntField(term3478012, term3478012.getClass(), "sourcePosition", 0);
        setField(term3478012, term3478012.getClass(), "jsType", null);
        setField(term3478012, term3478012.getClass(), "parent", null);
        setField(term3478011, term3478011.getClass(), "first", term3478012);
        setField(term3478011, term3478011.getClass(), "last", null);
        setField(term3478011, term3478011.getClass(), "propListHead", null);
        setIntField(term3478011, term3478011.getClass(), "sourcePosition", 0);
        setField(term3478011, term3478011.getClass(), "jsType", null);
        setField(term3478011, term3478011.getClass(), "parent", null);
        term3477738 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3477740 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3477742 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3477745 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3477747 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3477738, term3477738.getClass(), "str", null);
        setIntField(term3477738, term3477738.getClass(), "type", 37);
        setField(term3477738, term3477738.getClass(), "next", null);
        setField(term3477740, term3477740.getClass(), "str", null);
        setIntField(term3477740, term3477740.getClass(), "type", 35);
        setField(term3477742, term3477742.getClass(), "str", null);
        setIntField(term3477742, term3477742.getClass(), "type", 40);
        setField(term3477742, term3477742.getClass(), "next", null);
        setField(term3477742, term3477742.getClass(), "first", null);
        setField(term3477742, term3477742.getClass(), "last", null);
        setField(term3477742, term3477742.getClass(), "propListHead", null);
        setIntField(term3477742, term3477742.getClass(), "sourcePosition", 0);
        setField(term3477742, term3477742.getClass(), "jsType", null);
        setField(term3477742, term3477742.getClass(), "parent", null);
        setField(term3477740, term3477740.getClass(), "next", term3477742);
        setField(term3477745, term3477745.getClass(), "str", null);
        setIntField(term3477745, term3477745.getClass(), "type", 40);
        setField(term3477747, term3477747.getClass(), "str", "");
        setIntField(term3477747, term3477747.getClass(), "type", 40);
        setField(term3477747, term3477747.getClass(), "next", null);
        setField(term3477747, term3477747.getClass(), "first", null);
        setField(term3477747, term3477747.getClass(), "last", null);
        setField(term3477747, term3477747.getClass(), "propListHead", null);
        setIntField(term3477747, term3477747.getClass(), "sourcePosition", 0);
        setField(term3477747, term3477747.getClass(), "jsType", null);
        setField(term3477747, term3477747.getClass(), "parent", null);
        setField(term3477745, term3477745.getClass(), "next", term3477747);
        setField(term3477745, term3477745.getClass(), "first", null);
        setField(term3477745, term3477745.getClass(), "last", null);
        setField(term3477745, term3477745.getClass(), "propListHead", null);
        setIntField(term3477745, term3477745.getClass(), "sourcePosition", 0);
        setField(term3477745, term3477745.getClass(), "jsType", null);
        setField(term3477745, term3477745.getClass(), "parent", null);
        setField(term3477740, term3477740.getClass(), "first", term3477745);
        setField(term3477740, term3477740.getClass(), "last", null);
        setField(term3477740, term3477740.getClass(), "propListHead", null);
        setIntField(term3477740, term3477740.getClass(), "sourcePosition", 0);
        setField(term3477740, term3477740.getClass(), "jsType", null);
        setField(term3477740, term3477740.getClass(), "parent", null);
        setField(term3477738, term3477738.getClass(), "first", term3477740);
        setField(term3477738, term3477738.getClass(), "last", null);
        setField(term3477738, term3477738.getClass(), "propListHead", null);
        setIntField(term3477738, term3477738.getClass(), "sourcePosition", 0);
        setField(term3477738, term3477738.getClass(), "jsType", null);
        setField(term3477738, term3477738.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3475940;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3475848, args);
        assertTrue(recursiveEquals(term3475848, term3478010));
        assertTrue(recursiveEquals(term3475940, term3478011));
        assertTrue(recursiveEquals(retValue, term3477738));
    }

};


