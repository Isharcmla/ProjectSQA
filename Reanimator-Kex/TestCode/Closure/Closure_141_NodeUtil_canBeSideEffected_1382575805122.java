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

public class NodeUtil_canBeSideEffected_1382575805122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433;
     Object term5301;

    public NodeUtil_canBeSideEffected_1382575805122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term446 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term433, term433.getClass(), "type", -506958186);
        setIntField(term435, term435.getClass(), "type", 729658803);
        setIntField(term437, term437.getClass(), "type", 0);
        setField(term437, term437.getClass(), "next", null);
        setField(term437, term437.getClass(), "first", null);
        setField(term437, term437.getClass(), "last", null);
        setField(term437, term437.getClass(), "propListHead", null);
        setIntField(term437, term437.getClass(), "sourcePosition", 0);
        setField(term437, term437.getClass(), "jsType", null);
        setField(term437, term437.getClass(), "parent", null);
        setField(term435, term435.getClass(), "next", term437);
        setIntField(term440, term440.getClass(), "type", 0);
        setField(term440, term440.getClass(), "next", null);
        setField(term440, term440.getClass(), "first", null);
        setField(term440, term440.getClass(), "last", null);
        setField(term440, term440.getClass(), "propListHead", null);
        setIntField(term440, term440.getClass(), "sourcePosition", 0);
        setField(term440, term440.getClass(), "jsType", null);
        setField(term440, term440.getClass(), "parent", null);
        setField(term435, term435.getClass(), "first", term440);
        setIntField(term443, term443.getClass(), "type", 0);
        setField(term443, term443.getClass(), "next", null);
        setField(term443, term443.getClass(), "first", null);
        setField(term443, term443.getClass(), "last", null);
        setField(term443, term443.getClass(), "propListHead", null);
        setIntField(term443, term443.getClass(), "sourcePosition", 0);
        setField(term443, term443.getClass(), "jsType", null);
        setField(term443, term443.getClass(), "parent", null);
        setField(term435, term435.getClass(), "last", term443);
        setField(term446, term446.getClass(), "next", null);
        setIntField(term446, term446.getClass(), "type", 0);
        setIntField(term446, term446.getClass(), "intValue", 0);
        setField(term446, term446.getClass(), "objectValue", null);
        setField(term435, term435.getClass(), "propListHead", term446);
        setIntField(term435, term435.getClass(), "sourcePosition", 584893196);
        setField(term435, term435.getClass(), "jsType", null);
        setField(term435, term435.getClass(), "parent", null);
        setField(term433, term433.getClass(), "next", term435);
        setIntField(term450, term450.getClass(), "type", 0);
        setField(term450, term450.getClass(), "next", null);
        setField(term450, term450.getClass(), "first", null);
        setField(term450, term450.getClass(), "last", null);
        setField(term450, term450.getClass(), "propListHead", null);
        setIntField(term450, term450.getClass(), "sourcePosition", 0);
        setField(term450, term450.getClass(), "jsType", null);
        setField(term450, term450.getClass(), "parent", null);
        setField(term433, term433.getClass(), "first", term450);
        setIntField(term453, term453.getClass(), "type", 0);
        setField(term453, term453.getClass(), "next", null);
        setField(term453, term453.getClass(), "first", null);
        setField(term453, term453.getClass(), "last", null);
        setField(term453, term453.getClass(), "propListHead", null);
        setIntField(term453, term453.getClass(), "sourcePosition", 0);
        setField(term453, term453.getClass(), "jsType", null);
        setField(term453, term453.getClass(), "parent", null);
        setField(term433, term433.getClass(), "last", term453);
        setField(term456, term456.getClass(), "next", null);
        setIntField(term456, term456.getClass(), "type", 0);
        setIntField(term456, term456.getClass(), "intValue", 0);
        setField(term456, term456.getClass(), "objectValue", null);
        setField(term433, term433.getClass(), "propListHead", term456);
        setIntField(term433, term433.getClass(), "sourcePosition", 497269071);
        setField(term433, term433.getClass(), "jsType", null);
        setField(term433, term433.getClass(), "parent", null);
        term5301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5306 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5309 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5301, term5301.getClass(), "type", -506958186);
        setIntField(term5302, term5302.getClass(), "type", 729658803);
        setIntField(term5303, term5303.getClass(), "type", 0);
        setField(term5303, term5303.getClass(), "next", null);
        setField(term5303, term5303.getClass(), "first", null);
        setField(term5303, term5303.getClass(), "last", null);
        setField(term5303, term5303.getClass(), "propListHead", null);
        setIntField(term5303, term5303.getClass(), "sourcePosition", 0);
        setField(term5303, term5303.getClass(), "jsType", null);
        setField(term5303, term5303.getClass(), "parent", null);
        setField(term5302, term5302.getClass(), "next", term5303);
        setIntField(term5304, term5304.getClass(), "type", 0);
        setField(term5304, term5304.getClass(), "next", null);
        setField(term5304, term5304.getClass(), "first", null);
        setField(term5304, term5304.getClass(), "last", null);
        setField(term5304, term5304.getClass(), "propListHead", null);
        setIntField(term5304, term5304.getClass(), "sourcePosition", 0);
        setField(term5304, term5304.getClass(), "jsType", null);
        setField(term5304, term5304.getClass(), "parent", null);
        setField(term5302, term5302.getClass(), "first", term5304);
        setIntField(term5305, term5305.getClass(), "type", 0);
        setField(term5305, term5305.getClass(), "next", null);
        setField(term5305, term5305.getClass(), "first", null);
        setField(term5305, term5305.getClass(), "last", null);
        setField(term5305, term5305.getClass(), "propListHead", null);
        setIntField(term5305, term5305.getClass(), "sourcePosition", 0);
        setField(term5305, term5305.getClass(), "jsType", null);
        setField(term5305, term5305.getClass(), "parent", null);
        setField(term5302, term5302.getClass(), "last", term5305);
        setField(term5306, term5306.getClass(), "next", null);
        setIntField(term5306, term5306.getClass(), "type", 0);
        setIntField(term5306, term5306.getClass(), "intValue", 0);
        setField(term5306, term5306.getClass(), "objectValue", null);
        setField(term5302, term5302.getClass(), "propListHead", term5306);
        setIntField(term5302, term5302.getClass(), "sourcePosition", 584893196);
        setField(term5302, term5302.getClass(), "jsType", null);
        setField(term5302, term5302.getClass(), "parent", null);
        setField(term5301, term5301.getClass(), "next", term5302);
        setIntField(term5307, term5307.getClass(), "type", 0);
        setField(term5307, term5307.getClass(), "next", null);
        setField(term5307, term5307.getClass(), "first", null);
        setField(term5307, term5307.getClass(), "last", null);
        setField(term5307, term5307.getClass(), "propListHead", null);
        setIntField(term5307, term5307.getClass(), "sourcePosition", 0);
        setField(term5307, term5307.getClass(), "jsType", null);
        setField(term5307, term5307.getClass(), "parent", null);
        setField(term5301, term5301.getClass(), "first", term5307);
        setIntField(term5308, term5308.getClass(), "type", 0);
        setField(term5308, term5308.getClass(), "next", null);
        setField(term5308, term5308.getClass(), "first", null);
        setField(term5308, term5308.getClass(), "last", null);
        setField(term5308, term5308.getClass(), "propListHead", null);
        setIntField(term5308, term5308.getClass(), "sourcePosition", 0);
        setField(term5308, term5308.getClass(), "jsType", null);
        setField(term5308, term5308.getClass(), "parent", null);
        setField(term5301, term5301.getClass(), "last", term5308);
        setField(term5309, term5309.getClass(), "next", null);
        setIntField(term5309, term5309.getClass(), "type", 0);
        setIntField(term5309, term5309.getClass(), "intValue", 0);
        setField(term5309, term5309.getClass(), "objectValue", null);
        setField(term5301, term5301.getClass(), "propListHead", term5309);
        setIntField(term5301, term5301.getClass(), "sourcePosition", 497269071);
        setField(term5301, term5301.getClass(), "jsType", null);
        setField(term5301, term5301.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term433;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term433, term5301));
    }

};


