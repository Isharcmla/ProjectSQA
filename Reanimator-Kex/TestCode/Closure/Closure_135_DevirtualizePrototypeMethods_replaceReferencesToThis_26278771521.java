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

public class DevirtualizePrototypeMethods_replaceReferencesToThis_26278771521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343;
     Object term344;
     Object term2744;
     Object term2745;

    public DevirtualizePrototypeMethods_replaceReferencesToThis_26278771521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        setField(term343, term343.getClass(), "compiler", null);
        term344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term357 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term344, term344.getClass(), "type", -375014958);
        setIntField(term346, term346.getClass(), "type", -2015854073);
        setIntField(term348, term348.getClass(), "type", 0);
        setField(term348, term348.getClass(), "next", null);
        setField(term348, term348.getClass(), "first", null);
        setField(term348, term348.getClass(), "last", null);
        setField(term348, term348.getClass(), "propListHead", null);
        setIntField(term348, term348.getClass(), "sourcePosition", 0);
        setField(term348, term348.getClass(), "jsType", null);
        setField(term348, term348.getClass(), "parent", null);
        setField(term346, term346.getClass(), "next", term348);
        setIntField(term351, term351.getClass(), "type", 0);
        setField(term351, term351.getClass(), "next", null);
        setField(term351, term351.getClass(), "first", null);
        setField(term351, term351.getClass(), "last", null);
        setField(term351, term351.getClass(), "propListHead", null);
        setIntField(term351, term351.getClass(), "sourcePosition", 0);
        setField(term351, term351.getClass(), "jsType", null);
        setField(term351, term351.getClass(), "parent", null);
        setField(term346, term346.getClass(), "first", term351);
        setIntField(term354, term354.getClass(), "type", 0);
        setField(term354, term354.getClass(), "next", null);
        setField(term354, term354.getClass(), "first", null);
        setField(term354, term354.getClass(), "last", null);
        setField(term354, term354.getClass(), "propListHead", null);
        setIntField(term354, term354.getClass(), "sourcePosition", 0);
        setField(term354, term354.getClass(), "jsType", null);
        setField(term354, term354.getClass(), "parent", null);
        setField(term346, term346.getClass(), "last", term354);
        setField(term357, term357.getClass(), "next", null);
        setIntField(term357, term357.getClass(), "type", 0);
        setIntField(term357, term357.getClass(), "intValue", 0);
        setField(term357, term357.getClass(), "objectValue", null);
        setField(term346, term346.getClass(), "propListHead", term357);
        setIntField(term346, term346.getClass(), "sourcePosition", -343325701);
        setField(term346, term346.getClass(), "jsType", null);
        setField(term346, term346.getClass(), "parent", null);
        setField(term344, term344.getClass(), "next", term346);
        setIntField(term361, term361.getClass(), "type", 0);
        setField(term361, term361.getClass(), "next", null);
        setField(term361, term361.getClass(), "first", null);
        setField(term361, term361.getClass(), "last", null);
        setField(term361, term361.getClass(), "propListHead", null);
        setIntField(term361, term361.getClass(), "sourcePosition", 0);
        setField(term361, term361.getClass(), "jsType", null);
        setField(term361, term361.getClass(), "parent", null);
        setField(term344, term344.getClass(), "first", term361);
        setIntField(term364, term364.getClass(), "type", 0);
        setField(term364, term364.getClass(), "next", null);
        setField(term364, term364.getClass(), "first", null);
        setField(term364, term364.getClass(), "last", null);
        setField(term364, term364.getClass(), "propListHead", null);
        setIntField(term364, term364.getClass(), "sourcePosition", 0);
        setField(term364, term364.getClass(), "jsType", null);
        setField(term364, term364.getClass(), "parent", null);
        setField(term344, term344.getClass(), "last", term364);
        setField(term367, term367.getClass(), "next", null);
        setIntField(term367, term367.getClass(), "type", 0);
        setIntField(term367, term367.getClass(), "intValue", 0);
        setField(term367, term367.getClass(), "objectValue", null);
        setField(term344, term344.getClass(), "propListHead", term367);
        setIntField(term344, term344.getClass(), "sourcePosition", 107945604);
        setField(term344, term344.getClass(), "jsType", null);
        setField(term344, term344.getClass(), "parent", null);
        term2744 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        setField(term2744, term2744.getClass(), "compiler", null);
        term2745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2750 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2753 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2745, term2745.getClass(), "type", -375014958);
        setIntField(term2746, term2746.getClass(), "type", -2015854073);
        setIntField(term2747, term2747.getClass(), "type", 0);
        setField(term2747, term2747.getClass(), "next", null);
        setField(term2747, term2747.getClass(), "first", null);
        setField(term2747, term2747.getClass(), "last", null);
        setField(term2747, term2747.getClass(), "propListHead", null);
        setIntField(term2747, term2747.getClass(), "sourcePosition", 0);
        setField(term2747, term2747.getClass(), "jsType", null);
        setField(term2747, term2747.getClass(), "parent", null);
        setField(term2746, term2746.getClass(), "next", term2747);
        setIntField(term2748, term2748.getClass(), "type", 0);
        setField(term2748, term2748.getClass(), "next", null);
        setField(term2748, term2748.getClass(), "first", null);
        setField(term2748, term2748.getClass(), "last", null);
        setField(term2748, term2748.getClass(), "propListHead", null);
        setIntField(term2748, term2748.getClass(), "sourcePosition", 0);
        setField(term2748, term2748.getClass(), "jsType", null);
        setField(term2748, term2748.getClass(), "parent", null);
        setField(term2746, term2746.getClass(), "first", term2748);
        setIntField(term2749, term2749.getClass(), "type", 0);
        setField(term2749, term2749.getClass(), "next", null);
        setField(term2749, term2749.getClass(), "first", null);
        setField(term2749, term2749.getClass(), "last", null);
        setField(term2749, term2749.getClass(), "propListHead", null);
        setIntField(term2749, term2749.getClass(), "sourcePosition", 0);
        setField(term2749, term2749.getClass(), "jsType", null);
        setField(term2749, term2749.getClass(), "parent", null);
        setField(term2746, term2746.getClass(), "last", term2749);
        setField(term2750, term2750.getClass(), "next", null);
        setIntField(term2750, term2750.getClass(), "type", 0);
        setIntField(term2750, term2750.getClass(), "intValue", 0);
        setField(term2750, term2750.getClass(), "objectValue", null);
        setField(term2746, term2746.getClass(), "propListHead", term2750);
        setIntField(term2746, term2746.getClass(), "sourcePosition", -343325701);
        setField(term2746, term2746.getClass(), "jsType", null);
        setField(term2746, term2746.getClass(), "parent", null);
        setField(term2745, term2745.getClass(), "next", term2746);
        setIntField(term2751, term2751.getClass(), "type", 0);
        setField(term2751, term2751.getClass(), "next", null);
        setField(term2751, term2751.getClass(), "first", null);
        setField(term2751, term2751.getClass(), "last", null);
        setField(term2751, term2751.getClass(), "propListHead", null);
        setIntField(term2751, term2751.getClass(), "sourcePosition", 0);
        setField(term2751, term2751.getClass(), "jsType", null);
        setField(term2751, term2751.getClass(), "parent", null);
        setField(term2745, term2745.getClass(), "first", term2751);
        setIntField(term2752, term2752.getClass(), "type", 0);
        setField(term2752, term2752.getClass(), "next", null);
        setField(term2752, term2752.getClass(), "first", null);
        setField(term2752, term2752.getClass(), "last", null);
        setField(term2752, term2752.getClass(), "propListHead", null);
        setIntField(term2752, term2752.getClass(), "sourcePosition", 0);
        setField(term2752, term2752.getClass(), "jsType", null);
        setField(term2752, term2752.getClass(), "parent", null);
        setField(term2745, term2745.getClass(), "last", term2752);
        setField(term2753, term2753.getClass(), "next", null);
        setIntField(term2753, term2753.getClass(), "type", 0);
        setIntField(term2753, term2753.getClass(), "intValue", 0);
        setField(term2753, term2753.getClass(), "objectValue", null);
        setField(term2745, term2745.getClass(), "propListHead", term2753);
        setIntField(term2745, term2745.getClass(), "sourcePosition", 107945604);
        setField(term2745, term2745.getClass(), "jsType", null);
        setField(term2745, term2745.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term344;
        args[1] = "xxtlPwDYFs";
        callMethod(klass, "replaceReferencesToThis", argTypes, term343, args);
        assertTrue(recursiveEquals(term343, term2744));
        assertTrue(recursiveEquals(term344, term2745));
    }

};


