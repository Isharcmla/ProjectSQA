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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746480;
     Object term746572;
     Object term746756;
     Object term746848;
     Object term747372;
     Object term747373;
     Object term747375;
     Object term747376;
     Object term747301;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term746480 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term746572 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term746664 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term746664, term746664.getClass(), "type", 108);
        setField(term746572, term746572.getClass(), "parent", term746664);
        setIntField(term746572, term746572.getClass(), "type", 0);
        term746756 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term746756, term746756.getClass(), "type", 0);
        term746848 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term746848, term746848.getClass(), "type", 44);
        term747372 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term747372, term747372.getClass(), "currentTraversal", null);
        term747373 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term747374 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term747373, term747373.getClass(), "number", 0.0);
        setIntField(term747373, term747373.getClass(), "type", 0);
        setField(term747373, term747373.getClass(), "next", null);
        setField(term747373, term747373.getClass(), "first", null);
        setField(term747373, term747373.getClass(), "last", null);
        setField(term747373, term747373.getClass(), "propListHead", null);
        setIntField(term747373, term747373.getClass(), "sourcePosition", 0);
        setField(term747373, term747373.getClass(), "jsType", null);
        setDoubleField(term747374, term747374.getClass(), "number", 0.0);
        setIntField(term747374, term747374.getClass(), "type", 108);
        setField(term747374, term747374.getClass(), "next", null);
        setField(term747374, term747374.getClass(), "first", null);
        setField(term747374, term747374.getClass(), "last", null);
        setField(term747374, term747374.getClass(), "propListHead", null);
        setIntField(term747374, term747374.getClass(), "sourcePosition", 0);
        setField(term747374, term747374.getClass(), "jsType", null);
        setField(term747374, term747374.getClass(), "parent", null);
        setField(term747373, term747373.getClass(), "parent", term747374);
        term747375 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term747375, term747375.getClass(), "str", null);
        setIntField(term747375, term747375.getClass(), "type", 0);
        setField(term747375, term747375.getClass(), "next", null);
        setField(term747375, term747375.getClass(), "first", null);
        setField(term747375, term747375.getClass(), "last", null);
        setField(term747375, term747375.getClass(), "propListHead", null);
        setIntField(term747375, term747375.getClass(), "sourcePosition", 0);
        setField(term747375, term747375.getClass(), "jsType", null);
        setField(term747375, term747375.getClass(), "parent", null);
        term747376 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term747376, term747376.getClass(), "number", 0.0);
        setIntField(term747376, term747376.getClass(), "type", 44);
        setField(term747376, term747376.getClass(), "next", null);
        setField(term747376, term747376.getClass(), "first", null);
        setField(term747376, term747376.getClass(), "last", null);
        setField(term747376, term747376.getClass(), "propListHead", null);
        setIntField(term747376, term747376.getClass(), "sourcePosition", 0);
        setField(term747376, term747376.getClass(), "jsType", null);
        setField(term747376, term747376.getClass(), "parent", null);
        term747301 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term747305 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term747301, term747301.getClass(), "number", 0.0);
        setIntField(term747301, term747301.getClass(), "type", 0);
        setField(term747301, term747301.getClass(), "next", null);
        setField(term747301, term747301.getClass(), "first", null);
        setField(term747301, term747301.getClass(), "last", null);
        setField(term747301, term747301.getClass(), "propListHead", null);
        setIntField(term747301, term747301.getClass(), "sourcePosition", 0);
        setField(term747301, term747301.getClass(), "jsType", null);
        setDoubleField(term747305, term747305.getClass(), "number", 0.0);
        setIntField(term747305, term747305.getClass(), "type", 108);
        setField(term747305, term747305.getClass(), "next", null);
        setField(term747305, term747305.getClass(), "first", null);
        setField(term747305, term747305.getClass(), "last", null);
        setField(term747305, term747305.getClass(), "propListHead", null);
        setIntField(term747305, term747305.getClass(), "sourcePosition", 0);
        setField(term747305, term747305.getClass(), "jsType", null);
        setField(term747305, term747305.getClass(), "parent", null);
        setField(term747301, term747301.getClass(), "parent", term747305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term746572;
        args[1] = term746756;
        args[2] = term746848;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term746480, args);
        assertTrue(recursiveEquals(term746480, term747372));
        assertTrue(recursiveEquals(term746572, term747373));
        assertTrue(recursiveEquals(term746756, term747375));
        assertTrue(recursiveEquals(term746848, term747376));
        assertTrue(recursiveEquals(retValue, term747301));
    }

};


