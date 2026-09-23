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

public class TypedScopeCreator_getPrototypePropertyOwner_120862705819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2301;
     Object term6640;

    public TypedScopeCreator_getPrototypePropertyOwner_120862705819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2314 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2324 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2301, term2301.getClass(), "type", 962840079);
        setIntField(term2303, term2303.getClass(), "type", 1551099402);
        setIntField(term2305, term2305.getClass(), "type", 0);
        setField(term2305, term2305.getClass(), "next", null);
        setField(term2305, term2305.getClass(), "first", null);
        setField(term2305, term2305.getClass(), "last", null);
        setField(term2305, term2305.getClass(), "propListHead", null);
        setIntField(term2305, term2305.getClass(), "sourcePosition", 0);
        setField(term2305, term2305.getClass(), "jsType", null);
        setField(term2305, term2305.getClass(), "parent", null);
        setField(term2303, term2303.getClass(), "next", term2305);
        setIntField(term2308, term2308.getClass(), "type", 0);
        setField(term2308, term2308.getClass(), "next", null);
        setField(term2308, term2308.getClass(), "first", null);
        setField(term2308, term2308.getClass(), "last", null);
        setField(term2308, term2308.getClass(), "propListHead", null);
        setIntField(term2308, term2308.getClass(), "sourcePosition", 0);
        setField(term2308, term2308.getClass(), "jsType", null);
        setField(term2308, term2308.getClass(), "parent", null);
        setField(term2303, term2303.getClass(), "first", term2308);
        setIntField(term2311, term2311.getClass(), "type", 0);
        setField(term2311, term2311.getClass(), "next", null);
        setField(term2311, term2311.getClass(), "first", null);
        setField(term2311, term2311.getClass(), "last", null);
        setField(term2311, term2311.getClass(), "propListHead", null);
        setIntField(term2311, term2311.getClass(), "sourcePosition", 0);
        setField(term2311, term2311.getClass(), "jsType", null);
        setField(term2311, term2311.getClass(), "parent", null);
        setField(term2303, term2303.getClass(), "last", term2311);
        setField(term2314, term2314.getClass(), "next", null);
        setIntField(term2314, term2314.getClass(), "type", 0);
        setIntField(term2314, term2314.getClass(), "intValue", 0);
        setField(term2314, term2314.getClass(), "objectValue", null);
        setField(term2303, term2303.getClass(), "propListHead", term2314);
        setIntField(term2303, term2303.getClass(), "sourcePosition", 1375330971);
        setField(term2303, term2303.getClass(), "jsType", null);
        setField(term2303, term2303.getClass(), "parent", null);
        setField(term2301, term2301.getClass(), "next", term2303);
        setIntField(term2318, term2318.getClass(), "type", 0);
        setField(term2318, term2318.getClass(), "next", null);
        setField(term2318, term2318.getClass(), "first", null);
        setField(term2318, term2318.getClass(), "last", null);
        setField(term2318, term2318.getClass(), "propListHead", null);
        setIntField(term2318, term2318.getClass(), "sourcePosition", 0);
        setField(term2318, term2318.getClass(), "jsType", null);
        setField(term2318, term2318.getClass(), "parent", null);
        setField(term2301, term2301.getClass(), "first", term2318);
        setIntField(term2321, term2321.getClass(), "type", 0);
        setField(term2321, term2321.getClass(), "next", null);
        setField(term2321, term2321.getClass(), "first", null);
        setField(term2321, term2321.getClass(), "last", null);
        setField(term2321, term2321.getClass(), "propListHead", null);
        setIntField(term2321, term2321.getClass(), "sourcePosition", 0);
        setField(term2321, term2321.getClass(), "jsType", null);
        setField(term2321, term2321.getClass(), "parent", null);
        setField(term2301, term2301.getClass(), "last", term2321);
        setField(term2324, term2324.getClass(), "next", null);
        setIntField(term2324, term2324.getClass(), "type", 0);
        setIntField(term2324, term2324.getClass(), "intValue", 0);
        setField(term2324, term2324.getClass(), "objectValue", null);
        setField(term2301, term2301.getClass(), "propListHead", term2324);
        setIntField(term2301, term2301.getClass(), "sourcePosition", -478195677);
        setField(term2301, term2301.getClass(), "jsType", null);
        setField(term2301, term2301.getClass(), "parent", null);
        term6640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6645 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6648 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6640, term6640.getClass(), "type", 962840079);
        setIntField(term6641, term6641.getClass(), "type", 1551099402);
        setIntField(term6642, term6642.getClass(), "type", 0);
        setField(term6642, term6642.getClass(), "next", null);
        setField(term6642, term6642.getClass(), "first", null);
        setField(term6642, term6642.getClass(), "last", null);
        setField(term6642, term6642.getClass(), "propListHead", null);
        setIntField(term6642, term6642.getClass(), "sourcePosition", 0);
        setField(term6642, term6642.getClass(), "jsType", null);
        setField(term6642, term6642.getClass(), "parent", null);
        setField(term6641, term6641.getClass(), "next", term6642);
        setIntField(term6643, term6643.getClass(), "type", 0);
        setField(term6643, term6643.getClass(), "next", null);
        setField(term6643, term6643.getClass(), "first", null);
        setField(term6643, term6643.getClass(), "last", null);
        setField(term6643, term6643.getClass(), "propListHead", null);
        setIntField(term6643, term6643.getClass(), "sourcePosition", 0);
        setField(term6643, term6643.getClass(), "jsType", null);
        setField(term6643, term6643.getClass(), "parent", null);
        setField(term6641, term6641.getClass(), "first", term6643);
        setIntField(term6644, term6644.getClass(), "type", 0);
        setField(term6644, term6644.getClass(), "next", null);
        setField(term6644, term6644.getClass(), "first", null);
        setField(term6644, term6644.getClass(), "last", null);
        setField(term6644, term6644.getClass(), "propListHead", null);
        setIntField(term6644, term6644.getClass(), "sourcePosition", 0);
        setField(term6644, term6644.getClass(), "jsType", null);
        setField(term6644, term6644.getClass(), "parent", null);
        setField(term6641, term6641.getClass(), "last", term6644);
        setField(term6645, term6645.getClass(), "next", null);
        setIntField(term6645, term6645.getClass(), "type", 0);
        setIntField(term6645, term6645.getClass(), "intValue", 0);
        setField(term6645, term6645.getClass(), "objectValue", null);
        setField(term6641, term6641.getClass(), "propListHead", term6645);
        setIntField(term6641, term6641.getClass(), "sourcePosition", 1375330971);
        setField(term6641, term6641.getClass(), "jsType", null);
        setField(term6641, term6641.getClass(), "parent", null);
        setField(term6640, term6640.getClass(), "next", term6641);
        setIntField(term6646, term6646.getClass(), "type", 0);
        setField(term6646, term6646.getClass(), "next", null);
        setField(term6646, term6646.getClass(), "first", null);
        setField(term6646, term6646.getClass(), "last", null);
        setField(term6646, term6646.getClass(), "propListHead", null);
        setIntField(term6646, term6646.getClass(), "sourcePosition", 0);
        setField(term6646, term6646.getClass(), "jsType", null);
        setField(term6646, term6646.getClass(), "parent", null);
        setField(term6640, term6640.getClass(), "first", term6646);
        setIntField(term6647, term6647.getClass(), "type", 0);
        setField(term6647, term6647.getClass(), "next", null);
        setField(term6647, term6647.getClass(), "first", null);
        setField(term6647, term6647.getClass(), "last", null);
        setField(term6647, term6647.getClass(), "propListHead", null);
        setIntField(term6647, term6647.getClass(), "sourcePosition", 0);
        setField(term6647, term6647.getClass(), "jsType", null);
        setField(term6647, term6647.getClass(), "parent", null);
        setField(term6640, term6640.getClass(), "last", term6647);
        setField(term6648, term6648.getClass(), "next", null);
        setIntField(term6648, term6648.getClass(), "type", 0);
        setIntField(term6648, term6648.getClass(), "intValue", 0);
        setField(term6648, term6648.getClass(), "objectValue", null);
        setField(term6640, term6640.getClass(), "propListHead", term6648);
        setIntField(term6640, term6640.getClass(), "sourcePosition", -478195677);
        setField(term6640, term6640.getClass(), "jsType", null);
        setField(term6640, term6640.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2301;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term2301, term6640));
        assertTrue(recursiveEquals(retValue, null));
    }

};


