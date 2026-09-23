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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3713634;
     Object term3713726;
     Object term3715016;
     Object term3715017;
     Object term3714827;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3713634 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3713726 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3713818 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3713910 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3714002 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3714132 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3713818, term3713818.getClass(), "type", 35);
        setIntField(term3714002, term3714002.getClass(), "type", 40);
        setField(term3714002, term3714002.getClass(), "str", "");
        setField(term3713910, term3713910.getClass(), "next", term3714002);
        setIntField(term3713910, term3713910.getClass(), "type", 40);
        setField(term3713818, term3713818.getClass(), "first", term3713910);
        setIntField(term3714132, term3714132.getClass(), "type", 39);
        setField(term3713818, term3713818.getClass(), "next", term3714132);
        setField(term3713726, term3713726.getClass(), "first", term3713818);
        setIntField(term3713726, term3713726.getClass(), "type", 37);
        term3715016 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3715016, term3715016.getClass(), "currentTraversal", null);
        term3715017 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3715018 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3715019 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3715020 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3715021 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3715017, term3715017.getClass(), "str", null);
        setIntField(term3715017, term3715017.getClass(), "type", 37);
        setField(term3715017, term3715017.getClass(), "next", null);
        setField(term3715018, term3715018.getClass(), "str", null);
        setIntField(term3715018, term3715018.getClass(), "type", 35);
        setField(term3715019, term3715019.getClass(), "str", null);
        setIntField(term3715019, term3715019.getClass(), "type", 39);
        setField(term3715019, term3715019.getClass(), "next", null);
        setField(term3715019, term3715019.getClass(), "first", null);
        setField(term3715019, term3715019.getClass(), "last", null);
        setField(term3715019, term3715019.getClass(), "propListHead", null);
        setIntField(term3715019, term3715019.getClass(), "sourcePosition", 0);
        setField(term3715019, term3715019.getClass(), "jsType", null);
        setField(term3715019, term3715019.getClass(), "parent", null);
        setField(term3715018, term3715018.getClass(), "next", term3715019);
        setField(term3715020, term3715020.getClass(), "str", null);
        setIntField(term3715020, term3715020.getClass(), "type", 40);
        setField(term3715021, term3715021.getClass(), "str", "");
        setIntField(term3715021, term3715021.getClass(), "type", 40);
        setField(term3715021, term3715021.getClass(), "next", null);
        setField(term3715021, term3715021.getClass(), "first", null);
        setField(term3715021, term3715021.getClass(), "last", null);
        setField(term3715021, term3715021.getClass(), "propListHead", null);
        setIntField(term3715021, term3715021.getClass(), "sourcePosition", 0);
        setField(term3715021, term3715021.getClass(), "jsType", null);
        setField(term3715021, term3715021.getClass(), "parent", null);
        setField(term3715020, term3715020.getClass(), "next", term3715021);
        setField(term3715020, term3715020.getClass(), "first", null);
        setField(term3715020, term3715020.getClass(), "last", null);
        setField(term3715020, term3715020.getClass(), "propListHead", null);
        setIntField(term3715020, term3715020.getClass(), "sourcePosition", 0);
        setField(term3715020, term3715020.getClass(), "jsType", null);
        setField(term3715020, term3715020.getClass(), "parent", null);
        setField(term3715018, term3715018.getClass(), "first", term3715020);
        setField(term3715018, term3715018.getClass(), "last", null);
        setField(term3715018, term3715018.getClass(), "propListHead", null);
        setIntField(term3715018, term3715018.getClass(), "sourcePosition", 0);
        setField(term3715018, term3715018.getClass(), "jsType", null);
        setField(term3715018, term3715018.getClass(), "parent", null);
        setField(term3715017, term3715017.getClass(), "first", term3715018);
        setField(term3715017, term3715017.getClass(), "last", null);
        setField(term3715017, term3715017.getClass(), "propListHead", null);
        setIntField(term3715017, term3715017.getClass(), "sourcePosition", 0);
        setField(term3715017, term3715017.getClass(), "jsType", null);
        setField(term3715017, term3715017.getClass(), "parent", null);
        term3714827 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3714829 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3714831 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3714834 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3714836 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3714827, term3714827.getClass(), "str", null);
        setIntField(term3714827, term3714827.getClass(), "type", 37);
        setField(term3714827, term3714827.getClass(), "next", null);
        setField(term3714829, term3714829.getClass(), "str", null);
        setIntField(term3714829, term3714829.getClass(), "type", 35);
        setField(term3714831, term3714831.getClass(), "str", null);
        setIntField(term3714831, term3714831.getClass(), "type", 39);
        setField(term3714831, term3714831.getClass(), "next", null);
        setField(term3714831, term3714831.getClass(), "first", null);
        setField(term3714831, term3714831.getClass(), "last", null);
        setField(term3714831, term3714831.getClass(), "propListHead", null);
        setIntField(term3714831, term3714831.getClass(), "sourcePosition", 0);
        setField(term3714831, term3714831.getClass(), "jsType", null);
        setField(term3714831, term3714831.getClass(), "parent", null);
        setField(term3714829, term3714829.getClass(), "next", term3714831);
        setField(term3714834, term3714834.getClass(), "str", null);
        setIntField(term3714834, term3714834.getClass(), "type", 40);
        setField(term3714836, term3714836.getClass(), "str", "");
        setIntField(term3714836, term3714836.getClass(), "type", 40);
        setField(term3714836, term3714836.getClass(), "next", null);
        setField(term3714836, term3714836.getClass(), "first", null);
        setField(term3714836, term3714836.getClass(), "last", null);
        setField(term3714836, term3714836.getClass(), "propListHead", null);
        setIntField(term3714836, term3714836.getClass(), "sourcePosition", 0);
        setField(term3714836, term3714836.getClass(), "jsType", null);
        setField(term3714836, term3714836.getClass(), "parent", null);
        setField(term3714834, term3714834.getClass(), "next", term3714836);
        setField(term3714834, term3714834.getClass(), "first", null);
        setField(term3714834, term3714834.getClass(), "last", null);
        setField(term3714834, term3714834.getClass(), "propListHead", null);
        setIntField(term3714834, term3714834.getClass(), "sourcePosition", 0);
        setField(term3714834, term3714834.getClass(), "jsType", null);
        setField(term3714834, term3714834.getClass(), "parent", null);
        setField(term3714829, term3714829.getClass(), "first", term3714834);
        setField(term3714829, term3714829.getClass(), "last", null);
        setField(term3714829, term3714829.getClass(), "propListHead", null);
        setIntField(term3714829, term3714829.getClass(), "sourcePosition", 0);
        setField(term3714829, term3714829.getClass(), "jsType", null);
        setField(term3714829, term3714829.getClass(), "parent", null);
        setField(term3714827, term3714827.getClass(), "first", term3714829);
        setField(term3714827, term3714827.getClass(), "last", null);
        setField(term3714827, term3714827.getClass(), "propListHead", null);
        setIntField(term3714827, term3714827.getClass(), "sourcePosition", 0);
        setField(term3714827, term3714827.getClass(), "jsType", null);
        setField(term3714827, term3714827.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3713726;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3713634, args);
        assertTrue(recursiveEquals(term3713634, term3715016));
        assertTrue(recursiveEquals(term3713726, term3715017));
        assertTrue(recursiveEquals(retValue, term3714827));
    }

};


