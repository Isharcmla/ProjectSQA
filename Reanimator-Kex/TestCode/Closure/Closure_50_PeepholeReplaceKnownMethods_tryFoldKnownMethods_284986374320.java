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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2623277;
     Object term2623369;
     Object term2624008;
     Object term2624009;
     Object term2623854;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2623277 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2623369 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2623461 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2623553 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2623645 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2623461, term2623461.getClass(), "type", 35);
        setField(term2623553, term2623553.getClass(), "next", term2623645);
        setIntField(term2623553, term2623553.getClass(), "type", 40);
        setField(term2623461, term2623461.getClass(), "first", term2623553);
        setField(term2623369, term2623369.getClass(), "first", term2623461);
        setIntField(term2623369, term2623369.getClass(), "type", 37);
        term2624008 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2624008, term2624008.getClass(), "currentTraversal", null);
        term2624009 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2624010 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2624011 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2624012 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term2624009, term2624009.getClass(), "number", 0.0);
        setIntField(term2624009, term2624009.getClass(), "type", 37);
        setField(term2624009, term2624009.getClass(), "next", null);
        setDoubleField(term2624010, term2624010.getClass(), "number", 0.0);
        setIntField(term2624010, term2624010.getClass(), "type", 35);
        setField(term2624010, term2624010.getClass(), "next", null);
        setDoubleField(term2624011, term2624011.getClass(), "number", 0.0);
        setIntField(term2624011, term2624011.getClass(), "type", 40);
        setDoubleField(term2624012, term2624012.getClass(), "number", 0.0);
        setIntField(term2624012, term2624012.getClass(), "type", 0);
        setField(term2624012, term2624012.getClass(), "next", null);
        setField(term2624012, term2624012.getClass(), "first", null);
        setField(term2624012, term2624012.getClass(), "last", null);
        setField(term2624012, term2624012.getClass(), "propListHead", null);
        setIntField(term2624012, term2624012.getClass(), "sourcePosition", 0);
        setField(term2624012, term2624012.getClass(), "jsType", null);
        setField(term2624012, term2624012.getClass(), "parent", null);
        setField(term2624011, term2624011.getClass(), "next", term2624012);
        setField(term2624011, term2624011.getClass(), "first", null);
        setField(term2624011, term2624011.getClass(), "last", null);
        setField(term2624011, term2624011.getClass(), "propListHead", null);
        setIntField(term2624011, term2624011.getClass(), "sourcePosition", 0);
        setField(term2624011, term2624011.getClass(), "jsType", null);
        setField(term2624011, term2624011.getClass(), "parent", null);
        setField(term2624010, term2624010.getClass(), "first", term2624011);
        setField(term2624010, term2624010.getClass(), "last", null);
        setField(term2624010, term2624010.getClass(), "propListHead", null);
        setIntField(term2624010, term2624010.getClass(), "sourcePosition", 0);
        setField(term2624010, term2624010.getClass(), "jsType", null);
        setField(term2624010, term2624010.getClass(), "parent", null);
        setField(term2624009, term2624009.getClass(), "first", term2624010);
        setField(term2624009, term2624009.getClass(), "last", null);
        setField(term2624009, term2624009.getClass(), "propListHead", null);
        setIntField(term2624009, term2624009.getClass(), "sourcePosition", 0);
        setField(term2624009, term2624009.getClass(), "jsType", null);
        setField(term2624009, term2624009.getClass(), "parent", null);
        term2623854 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2623857 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2623860 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2623863 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term2623854, term2623854.getClass(), "number", 0.0);
        setIntField(term2623854, term2623854.getClass(), "type", 37);
        setField(term2623854, term2623854.getClass(), "next", null);
        setDoubleField(term2623857, term2623857.getClass(), "number", 0.0);
        setIntField(term2623857, term2623857.getClass(), "type", 35);
        setField(term2623857, term2623857.getClass(), "next", null);
        setDoubleField(term2623860, term2623860.getClass(), "number", 0.0);
        setIntField(term2623860, term2623860.getClass(), "type", 40);
        setDoubleField(term2623863, term2623863.getClass(), "number", 0.0);
        setIntField(term2623863, term2623863.getClass(), "type", 0);
        setField(term2623863, term2623863.getClass(), "next", null);
        setField(term2623863, term2623863.getClass(), "first", null);
        setField(term2623863, term2623863.getClass(), "last", null);
        setField(term2623863, term2623863.getClass(), "propListHead", null);
        setIntField(term2623863, term2623863.getClass(), "sourcePosition", 0);
        setField(term2623863, term2623863.getClass(), "jsType", null);
        setField(term2623863, term2623863.getClass(), "parent", null);
        setField(term2623860, term2623860.getClass(), "next", term2623863);
        setField(term2623860, term2623860.getClass(), "first", null);
        setField(term2623860, term2623860.getClass(), "last", null);
        setField(term2623860, term2623860.getClass(), "propListHead", null);
        setIntField(term2623860, term2623860.getClass(), "sourcePosition", 0);
        setField(term2623860, term2623860.getClass(), "jsType", null);
        setField(term2623860, term2623860.getClass(), "parent", null);
        setField(term2623857, term2623857.getClass(), "first", term2623860);
        setField(term2623857, term2623857.getClass(), "last", null);
        setField(term2623857, term2623857.getClass(), "propListHead", null);
        setIntField(term2623857, term2623857.getClass(), "sourcePosition", 0);
        setField(term2623857, term2623857.getClass(), "jsType", null);
        setField(term2623857, term2623857.getClass(), "parent", null);
        setField(term2623854, term2623854.getClass(), "first", term2623857);
        setField(term2623854, term2623854.getClass(), "last", null);
        setField(term2623854, term2623854.getClass(), "propListHead", null);
        setIntField(term2623854, term2623854.getClass(), "sourcePosition", 0);
        setField(term2623854, term2623854.getClass(), "jsType", null);
        setField(term2623854, term2623854.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2623369;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term2623277, args);
        assertTrue(recursiveEquals(term2623277, term2624008));
        assertTrue(recursiveEquals(term2623369, term2624009));
        assertTrue(recursiveEquals(retValue, term2623854));
    }

};


