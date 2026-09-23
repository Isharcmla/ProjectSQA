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

public class NodeUtil_getObjectLitKeyTypeFromValueType_1273715457254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2805;
     Object term16905;

    public NodeUtil_getObjectLitKeyTypeFromValueType_1273715457254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2818 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2828 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2805, term2805.getClass(), "type", 1280322790);
        setIntField(term2807, term2807.getClass(), "type", 1151963130);
        setIntField(term2809, term2809.getClass(), "type", 0);
        setField(term2809, term2809.getClass(), "next", null);
        setField(term2809, term2809.getClass(), "first", null);
        setField(term2809, term2809.getClass(), "last", null);
        setField(term2809, term2809.getClass(), "propListHead", null);
        setIntField(term2809, term2809.getClass(), "sourcePosition", 0);
        setField(term2809, term2809.getClass(), "jsType", null);
        setField(term2809, term2809.getClass(), "parent", null);
        setField(term2807, term2807.getClass(), "next", term2809);
        setIntField(term2812, term2812.getClass(), "type", 0);
        setField(term2812, term2812.getClass(), "next", null);
        setField(term2812, term2812.getClass(), "first", null);
        setField(term2812, term2812.getClass(), "last", null);
        setField(term2812, term2812.getClass(), "propListHead", null);
        setIntField(term2812, term2812.getClass(), "sourcePosition", 0);
        setField(term2812, term2812.getClass(), "jsType", null);
        setField(term2812, term2812.getClass(), "parent", null);
        setField(term2807, term2807.getClass(), "first", term2812);
        setIntField(term2815, term2815.getClass(), "type", 0);
        setField(term2815, term2815.getClass(), "next", null);
        setField(term2815, term2815.getClass(), "first", null);
        setField(term2815, term2815.getClass(), "last", null);
        setField(term2815, term2815.getClass(), "propListHead", null);
        setIntField(term2815, term2815.getClass(), "sourcePosition", 0);
        setField(term2815, term2815.getClass(), "jsType", null);
        setField(term2815, term2815.getClass(), "parent", null);
        setField(term2807, term2807.getClass(), "last", term2815);
        setField(term2818, term2818.getClass(), "next", null);
        setIntField(term2818, term2818.getClass(), "type", 0);
        setIntField(term2818, term2818.getClass(), "intValue", 0);
        setField(term2818, term2818.getClass(), "objectValue", null);
        setField(term2807, term2807.getClass(), "propListHead", term2818);
        setIntField(term2807, term2807.getClass(), "sourcePosition", 537273345);
        setField(term2807, term2807.getClass(), "jsType", null);
        setField(term2807, term2807.getClass(), "parent", null);
        setField(term2805, term2805.getClass(), "next", term2807);
        setIntField(term2822, term2822.getClass(), "type", 0);
        setField(term2822, term2822.getClass(), "next", null);
        setField(term2822, term2822.getClass(), "first", null);
        setField(term2822, term2822.getClass(), "last", null);
        setField(term2822, term2822.getClass(), "propListHead", null);
        setIntField(term2822, term2822.getClass(), "sourcePosition", 0);
        setField(term2822, term2822.getClass(), "jsType", null);
        setField(term2822, term2822.getClass(), "parent", null);
        setField(term2805, term2805.getClass(), "first", term2822);
        setIntField(term2825, term2825.getClass(), "type", 0);
        setField(term2825, term2825.getClass(), "next", null);
        setField(term2825, term2825.getClass(), "first", null);
        setField(term2825, term2825.getClass(), "last", null);
        setField(term2825, term2825.getClass(), "propListHead", null);
        setIntField(term2825, term2825.getClass(), "sourcePosition", 0);
        setField(term2825, term2825.getClass(), "jsType", null);
        setField(term2825, term2825.getClass(), "parent", null);
        setField(term2805, term2805.getClass(), "last", term2825);
        setField(term2828, term2828.getClass(), "next", null);
        setIntField(term2828, term2828.getClass(), "type", 0);
        setIntField(term2828, term2828.getClass(), "intValue", 0);
        setField(term2828, term2828.getClass(), "objectValue", null);
        setField(term2805, term2805.getClass(), "propListHead", term2828);
        setIntField(term2805, term2805.getClass(), "sourcePosition", -346107257);
        setField(term2805, term2805.getClass(), "jsType", null);
        setField(term2805, term2805.getClass(), "parent", null);
        term16905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16910 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16913 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term16905, term16905.getClass(), "type", 1280322790);
        setIntField(term16906, term16906.getClass(), "type", 1151963130);
        setIntField(term16907, term16907.getClass(), "type", 0);
        setField(term16907, term16907.getClass(), "next", null);
        setField(term16907, term16907.getClass(), "first", null);
        setField(term16907, term16907.getClass(), "last", null);
        setField(term16907, term16907.getClass(), "propListHead", null);
        setIntField(term16907, term16907.getClass(), "sourcePosition", 0);
        setField(term16907, term16907.getClass(), "jsType", null);
        setField(term16907, term16907.getClass(), "parent", null);
        setField(term16906, term16906.getClass(), "next", term16907);
        setIntField(term16908, term16908.getClass(), "type", 0);
        setField(term16908, term16908.getClass(), "next", null);
        setField(term16908, term16908.getClass(), "first", null);
        setField(term16908, term16908.getClass(), "last", null);
        setField(term16908, term16908.getClass(), "propListHead", null);
        setIntField(term16908, term16908.getClass(), "sourcePosition", 0);
        setField(term16908, term16908.getClass(), "jsType", null);
        setField(term16908, term16908.getClass(), "parent", null);
        setField(term16906, term16906.getClass(), "first", term16908);
        setIntField(term16909, term16909.getClass(), "type", 0);
        setField(term16909, term16909.getClass(), "next", null);
        setField(term16909, term16909.getClass(), "first", null);
        setField(term16909, term16909.getClass(), "last", null);
        setField(term16909, term16909.getClass(), "propListHead", null);
        setIntField(term16909, term16909.getClass(), "sourcePosition", 0);
        setField(term16909, term16909.getClass(), "jsType", null);
        setField(term16909, term16909.getClass(), "parent", null);
        setField(term16906, term16906.getClass(), "last", term16909);
        setField(term16910, term16910.getClass(), "next", null);
        setIntField(term16910, term16910.getClass(), "type", 0);
        setIntField(term16910, term16910.getClass(), "intValue", 0);
        setField(term16910, term16910.getClass(), "objectValue", null);
        setField(term16906, term16906.getClass(), "propListHead", term16910);
        setIntField(term16906, term16906.getClass(), "sourcePosition", 537273345);
        setField(term16906, term16906.getClass(), "jsType", null);
        setField(term16906, term16906.getClass(), "parent", null);
        setField(term16905, term16905.getClass(), "next", term16906);
        setIntField(term16911, term16911.getClass(), "type", 0);
        setField(term16911, term16911.getClass(), "next", null);
        setField(term16911, term16911.getClass(), "first", null);
        setField(term16911, term16911.getClass(), "last", null);
        setField(term16911, term16911.getClass(), "propListHead", null);
        setIntField(term16911, term16911.getClass(), "sourcePosition", 0);
        setField(term16911, term16911.getClass(), "jsType", null);
        setField(term16911, term16911.getClass(), "parent", null);
        setField(term16905, term16905.getClass(), "first", term16911);
        setIntField(term16912, term16912.getClass(), "type", 0);
        setField(term16912, term16912.getClass(), "next", null);
        setField(term16912, term16912.getClass(), "first", null);
        setField(term16912, term16912.getClass(), "last", null);
        setField(term16912, term16912.getClass(), "propListHead", null);
        setIntField(term16912, term16912.getClass(), "sourcePosition", 0);
        setField(term16912, term16912.getClass(), "jsType", null);
        setField(term16912, term16912.getClass(), "parent", null);
        setField(term16905, term16905.getClass(), "last", term16912);
        setField(term16913, term16913.getClass(), "next", null);
        setIntField(term16913, term16913.getClass(), "type", 0);
        setIntField(term16913, term16913.getClass(), "intValue", 0);
        setField(term16913, term16913.getClass(), "objectValue", null);
        setField(term16905, term16905.getClass(), "propListHead", term16913);
        setIntField(term16905, term16905.getClass(), "sourcePosition", -346107257);
        setField(term16905, term16905.getClass(), "jsType", null);
        setField(term16905, term16905.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term2805;
        args[1] = null;
        Object retValue = callMethod(klass, "getObjectLitKeyTypeFromValueType", argTypes, null, args);
        assertTrue(recursiveEquals(term2805, term16905));
        assertTrue(recursiveEquals(retValue, null));
    }

};


