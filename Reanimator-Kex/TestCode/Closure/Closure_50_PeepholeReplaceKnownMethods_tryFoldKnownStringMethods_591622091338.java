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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2630662;
     Object term2630754;
     Object term2631019;
     Object term2631020;
     Object term2630983;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2630662 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2630754 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2630846 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2630916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2630754, term2630754.getClass(), "type", 37);
        setIntField(term2630846, term2630846.getClass(), "type", 33);
        setField(term2630846, term2630846.getClass(), "first", term2630916);
        setField(term2630754, term2630754.getClass(), "first", term2630846);
        term2631019 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2631019, term2631019.getClass(), "currentTraversal", null);
        term2631020 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2631021 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2631022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term2631020, term2631020.getClass(), "number", 0.0);
        setIntField(term2631020, term2631020.getClass(), "type", 37);
        setField(term2631020, term2631020.getClass(), "next", null);
        setField(term2631021, term2631021.getClass(), "str", null);
        setIntField(term2631021, term2631021.getClass(), "type", 33);
        setField(term2631021, term2631021.getClass(), "next", null);
        setIntField(term2631022, term2631022.getClass(), "type", 0);
        setField(term2631022, term2631022.getClass(), "next", null);
        setField(term2631022, term2631022.getClass(), "first", null);
        setField(term2631022, term2631022.getClass(), "last", null);
        setField(term2631022, term2631022.getClass(), "propListHead", null);
        setIntField(term2631022, term2631022.getClass(), "sourcePosition", 0);
        setField(term2631022, term2631022.getClass(), "jsType", null);
        setField(term2631022, term2631022.getClass(), "parent", null);
        setField(term2631021, term2631021.getClass(), "first", term2631022);
        setField(term2631021, term2631021.getClass(), "last", null);
        setField(term2631021, term2631021.getClass(), "propListHead", null);
        setIntField(term2631021, term2631021.getClass(), "sourcePosition", 0);
        setField(term2631021, term2631021.getClass(), "jsType", null);
        setField(term2631021, term2631021.getClass(), "parent", null);
        setField(term2631020, term2631020.getClass(), "first", term2631021);
        setField(term2631020, term2631020.getClass(), "last", null);
        setField(term2631020, term2631020.getClass(), "propListHead", null);
        setIntField(term2631020, term2631020.getClass(), "sourcePosition", 0);
        setField(term2631020, term2631020.getClass(), "jsType", null);
        setField(term2631020, term2631020.getClass(), "parent", null);
        term2630983 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2630986 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2630988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term2630983, term2630983.getClass(), "number", 0.0);
        setIntField(term2630983, term2630983.getClass(), "type", 37);
        setField(term2630983, term2630983.getClass(), "next", null);
        setField(term2630986, term2630986.getClass(), "str", null);
        setIntField(term2630986, term2630986.getClass(), "type", 33);
        setField(term2630986, term2630986.getClass(), "next", null);
        setIntField(term2630988, term2630988.getClass(), "type", 0);
        setField(term2630988, term2630988.getClass(), "next", null);
        setField(term2630988, term2630988.getClass(), "first", null);
        setField(term2630988, term2630988.getClass(), "last", null);
        setField(term2630988, term2630988.getClass(), "propListHead", null);
        setIntField(term2630988, term2630988.getClass(), "sourcePosition", 0);
        setField(term2630988, term2630988.getClass(), "jsType", null);
        setField(term2630988, term2630988.getClass(), "parent", null);
        setField(term2630986, term2630986.getClass(), "first", term2630988);
        setField(term2630986, term2630986.getClass(), "last", null);
        setField(term2630986, term2630986.getClass(), "propListHead", null);
        setIntField(term2630986, term2630986.getClass(), "sourcePosition", 0);
        setField(term2630986, term2630986.getClass(), "jsType", null);
        setField(term2630986, term2630986.getClass(), "parent", null);
        setField(term2630983, term2630983.getClass(), "first", term2630986);
        setField(term2630983, term2630983.getClass(), "last", null);
        setField(term2630983, term2630983.getClass(), "propListHead", null);
        setIntField(term2630983, term2630983.getClass(), "sourcePosition", 0);
        setField(term2630983, term2630983.getClass(), "jsType", null);
        setField(term2630983, term2630983.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2630754;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2630662, args);
        assertTrue(recursiveEquals(term2630662, term2631019));
        assertTrue(recursiveEquals(term2630754, term2631020));
        assertTrue(recursiveEquals(retValue, term2630983));
    }

};


