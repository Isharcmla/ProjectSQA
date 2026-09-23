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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3640715;
     Object term3640807;
     Object term3642396;
     Object term3642397;
     Object term3642081;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3640715 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3640807 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3640899 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3640991 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3641083 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3641213 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3640899, term3640899.getClass(), "type", 35);
        setIntField(term3641083, term3641083.getClass(), "type", 40);
        setField(term3641083, term3641083.getClass(), "str", "indexOf");
        setField(term3640991, term3640991.getClass(), "next", term3641083);
        setIntField(term3640991, term3640991.getClass(), "type", 40);
        setField(term3640991, term3640991.getClass(), "str", null);
        setField(term3640899, term3640899.getClass(), "first", term3640991);
        setIntField(term3641213, term3641213.getClass(), "type", 44);
        setField(term3641213, term3641213.getClass(), "next", term3641083);
        setField(term3640899, term3640899.getClass(), "next", term3641213);
        setField(term3640807, term3640807.getClass(), "first", term3640899);
        setIntField(term3640807, term3640807.getClass(), "type", 37);
        term3642396 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3642396, term3642396.getClass(), "currentTraversal", null);
        term3642397 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3642398 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3642399 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3642400 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3642402 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3642397, term3642397.getClass(), "str", null);
        setIntField(term3642397, term3642397.getClass(), "type", 37);
        setField(term3642397, term3642397.getClass(), "next", null);
        setField(term3642398, term3642398.getClass(), "str", null);
        setIntField(term3642398, term3642398.getClass(), "type", 35);
        setField(term3642399, term3642399.getClass(), "str", null);
        setIntField(term3642399, term3642399.getClass(), "type", 44);
        setField(term3642400, term3642400.getClass(), "str", "");
        setIntField(term3642400, term3642400.getClass(), "type", 40);
        setField(term3642400, term3642400.getClass(), "next", null);
        setField(term3642400, term3642400.getClass(), "first", null);
        setField(term3642400, term3642400.getClass(), "last", null);
        setField(term3642400, term3642400.getClass(), "propListHead", null);
        setIntField(term3642400, term3642400.getClass(), "sourcePosition", 0);
        setField(term3642400, term3642400.getClass(), "jsType", null);
        setField(term3642400, term3642400.getClass(), "parent", null);
        setField(term3642399, term3642399.getClass(), "next", term3642400);
        setField(term3642399, term3642399.getClass(), "first", null);
        setField(term3642399, term3642399.getClass(), "last", null);
        setField(term3642399, term3642399.getClass(), "propListHead", null);
        setIntField(term3642399, term3642399.getClass(), "sourcePosition", 0);
        setField(term3642399, term3642399.getClass(), "jsType", null);
        setField(term3642399, term3642399.getClass(), "parent", null);
        setField(term3642398, term3642398.getClass(), "next", term3642399);
        setField(term3642402, term3642402.getClass(), "str", null);
        setIntField(term3642402, term3642402.getClass(), "type", 40);
        setField(term3642402, term3642402.getClass(), "next", term3642400);
        setField(term3642402, term3642402.getClass(), "first", null);
        setField(term3642402, term3642402.getClass(), "last", null);
        setField(term3642402, term3642402.getClass(), "propListHead", null);
        setIntField(term3642402, term3642402.getClass(), "sourcePosition", 0);
        setField(term3642402, term3642402.getClass(), "jsType", null);
        setField(term3642402, term3642402.getClass(), "parent", null);
        setField(term3642398, term3642398.getClass(), "first", term3642402);
        setField(term3642398, term3642398.getClass(), "last", null);
        setField(term3642398, term3642398.getClass(), "propListHead", null);
        setIntField(term3642398, term3642398.getClass(), "sourcePosition", 0);
        setField(term3642398, term3642398.getClass(), "jsType", null);
        setField(term3642398, term3642398.getClass(), "parent", null);
        setField(term3642397, term3642397.getClass(), "first", term3642398);
        setField(term3642397, term3642397.getClass(), "last", null);
        setField(term3642397, term3642397.getClass(), "propListHead", null);
        setIntField(term3642397, term3642397.getClass(), "sourcePosition", 0);
        setField(term3642397, term3642397.getClass(), "jsType", null);
        setField(term3642397, term3642397.getClass(), "parent", null);
        term3642081 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3642083 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3642085 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3642087 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3642092 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3642081, term3642081.getClass(), "str", null);
        setIntField(term3642081, term3642081.getClass(), "type", 37);
        setField(term3642081, term3642081.getClass(), "next", null);
        setField(term3642083, term3642083.getClass(), "str", null);
        setIntField(term3642083, term3642083.getClass(), "type", 35);
        setField(term3642085, term3642085.getClass(), "str", null);
        setIntField(term3642085, term3642085.getClass(), "type", 44);
        setField(term3642087, term3642087.getClass(), "str", "");
        setIntField(term3642087, term3642087.getClass(), "type", 40);
        setField(term3642087, term3642087.getClass(), "next", null);
        setField(term3642087, term3642087.getClass(), "first", null);
        setField(term3642087, term3642087.getClass(), "last", null);
        setField(term3642087, term3642087.getClass(), "propListHead", null);
        setIntField(term3642087, term3642087.getClass(), "sourcePosition", 0);
        setField(term3642087, term3642087.getClass(), "jsType", null);
        setField(term3642087, term3642087.getClass(), "parent", null);
        setField(term3642085, term3642085.getClass(), "next", term3642087);
        setField(term3642085, term3642085.getClass(), "first", null);
        setField(term3642085, term3642085.getClass(), "last", null);
        setField(term3642085, term3642085.getClass(), "propListHead", null);
        setIntField(term3642085, term3642085.getClass(), "sourcePosition", 0);
        setField(term3642085, term3642085.getClass(), "jsType", null);
        setField(term3642085, term3642085.getClass(), "parent", null);
        setField(term3642083, term3642083.getClass(), "next", term3642085);
        setField(term3642092, term3642092.getClass(), "str", null);
        setIntField(term3642092, term3642092.getClass(), "type", 40);
        setField(term3642092, term3642092.getClass(), "next", term3642087);
        setField(term3642092, term3642092.getClass(), "first", null);
        setField(term3642092, term3642092.getClass(), "last", null);
        setField(term3642092, term3642092.getClass(), "propListHead", null);
        setIntField(term3642092, term3642092.getClass(), "sourcePosition", 0);
        setField(term3642092, term3642092.getClass(), "jsType", null);
        setField(term3642092, term3642092.getClass(), "parent", null);
        setField(term3642083, term3642083.getClass(), "first", term3642092);
        setField(term3642083, term3642083.getClass(), "last", null);
        setField(term3642083, term3642083.getClass(), "propListHead", null);
        setIntField(term3642083, term3642083.getClass(), "sourcePosition", 0);
        setField(term3642083, term3642083.getClass(), "jsType", null);
        setField(term3642083, term3642083.getClass(), "parent", null);
        setField(term3642081, term3642081.getClass(), "first", term3642083);
        setField(term3642081, term3642081.getClass(), "last", null);
        setField(term3642081, term3642081.getClass(), "propListHead", null);
        setIntField(term3642081, term3642081.getClass(), "sourcePosition", 0);
        setField(term3642081, term3642081.getClass(), "jsType", null);
        setField(term3642081, term3642081.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3640807;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3640715, args);
        assertTrue(recursiveEquals(term3640715, term3642396));
        assertTrue(recursiveEquals(term3640807, term3642397));
        assertTrue(recursiveEquals(retValue, term3642081));
    }

};


