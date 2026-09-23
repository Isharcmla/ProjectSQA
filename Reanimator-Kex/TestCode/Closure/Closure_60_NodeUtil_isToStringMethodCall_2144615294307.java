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

public class NodeUtil_isToStringMethodCall_2144615294307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3584;
     Object term25840;

    public NodeUtil_isToStringMethodCall_2144615294307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3584, term3584.getClass(), "type", 954234820);
        setIntField(term3586, term3586.getClass(), "type", -1854929057);
        setIntField(term3588, term3588.getClass(), "type", 0);
        setField(term3588, term3588.getClass(), "next", null);
        setField(term3588, term3588.getClass(), "first", null);
        setField(term3588, term3588.getClass(), "last", null);
        setField(term3588, term3588.getClass(), "propListHead", null);
        setIntField(term3588, term3588.getClass(), "sourcePosition", 0);
        setField(term3588, term3588.getClass(), "jsType", null);
        setField(term3588, term3588.getClass(), "parent", null);
        setField(term3586, term3586.getClass(), "next", term3588);
        setIntField(term3591, term3591.getClass(), "type", 0);
        setField(term3591, term3591.getClass(), "next", null);
        setField(term3591, term3591.getClass(), "first", null);
        setField(term3591, term3591.getClass(), "last", null);
        setField(term3591, term3591.getClass(), "propListHead", null);
        setIntField(term3591, term3591.getClass(), "sourcePosition", 0);
        setField(term3591, term3591.getClass(), "jsType", null);
        setField(term3591, term3591.getClass(), "parent", null);
        setField(term3586, term3586.getClass(), "first", term3591);
        setIntField(term3594, term3594.getClass(), "type", 0);
        setField(term3594, term3594.getClass(), "next", null);
        setField(term3594, term3594.getClass(), "first", null);
        setField(term3594, term3594.getClass(), "last", null);
        setField(term3594, term3594.getClass(), "propListHead", null);
        setIntField(term3594, term3594.getClass(), "sourcePosition", 0);
        setField(term3594, term3594.getClass(), "jsType", null);
        setField(term3594, term3594.getClass(), "parent", null);
        setField(term3586, term3586.getClass(), "last", term3594);
        setField(term3586, term3586.getClass(), "propListHead", null);
        setIntField(term3586, term3586.getClass(), "sourcePosition", 0);
        setField(term3586, term3586.getClass(), "jsType", null);
        setField(term3586, term3586.getClass(), "parent", null);
        setField(term3584, term3584.getClass(), "next", term3586);
        setIntField(term3598, term3598.getClass(), "type", 0);
        setField(term3598, term3598.getClass(), "next", null);
        setField(term3598, term3598.getClass(), "first", null);
        setField(term3598, term3598.getClass(), "last", null);
        setField(term3598, term3598.getClass(), "propListHead", null);
        setIntField(term3598, term3598.getClass(), "sourcePosition", 0);
        setField(term3598, term3598.getClass(), "jsType", null);
        setField(term3598, term3598.getClass(), "parent", null);
        setField(term3584, term3584.getClass(), "first", term3598);
        setIntField(term3601, term3601.getClass(), "type", 0);
        setField(term3601, term3601.getClass(), "next", null);
        setField(term3601, term3601.getClass(), "first", null);
        setField(term3601, term3601.getClass(), "last", null);
        setField(term3601, term3601.getClass(), "propListHead", null);
        setIntField(term3601, term3601.getClass(), "sourcePosition", 0);
        setField(term3601, term3601.getClass(), "jsType", null);
        setField(term3601, term3601.getClass(), "parent", null);
        setField(term3584, term3584.getClass(), "last", term3601);
        setField(term3584, term3584.getClass(), "propListHead", null);
        setIntField(term3584, term3584.getClass(), "sourcePosition", 0);
        setField(term3584, term3584.getClass(), "jsType", null);
        setField(term3584, term3584.getClass(), "parent", null);
        term25840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25840, term25840.getClass(), "type", 954234820);
        setIntField(term25841, term25841.getClass(), "type", -1854929057);
        setIntField(term25842, term25842.getClass(), "type", 0);
        setField(term25842, term25842.getClass(), "next", null);
        setField(term25842, term25842.getClass(), "first", null);
        setField(term25842, term25842.getClass(), "last", null);
        setField(term25842, term25842.getClass(), "propListHead", null);
        setIntField(term25842, term25842.getClass(), "sourcePosition", 0);
        setField(term25842, term25842.getClass(), "jsType", null);
        setField(term25842, term25842.getClass(), "parent", null);
        setField(term25841, term25841.getClass(), "next", term25842);
        setIntField(term25843, term25843.getClass(), "type", 0);
        setField(term25843, term25843.getClass(), "next", null);
        setField(term25843, term25843.getClass(), "first", null);
        setField(term25843, term25843.getClass(), "last", null);
        setField(term25843, term25843.getClass(), "propListHead", null);
        setIntField(term25843, term25843.getClass(), "sourcePosition", 0);
        setField(term25843, term25843.getClass(), "jsType", null);
        setField(term25843, term25843.getClass(), "parent", null);
        setField(term25841, term25841.getClass(), "first", term25843);
        setIntField(term25844, term25844.getClass(), "type", 0);
        setField(term25844, term25844.getClass(), "next", null);
        setField(term25844, term25844.getClass(), "first", null);
        setField(term25844, term25844.getClass(), "last", null);
        setField(term25844, term25844.getClass(), "propListHead", null);
        setIntField(term25844, term25844.getClass(), "sourcePosition", 0);
        setField(term25844, term25844.getClass(), "jsType", null);
        setField(term25844, term25844.getClass(), "parent", null);
        setField(term25841, term25841.getClass(), "last", term25844);
        setField(term25841, term25841.getClass(), "propListHead", null);
        setIntField(term25841, term25841.getClass(), "sourcePosition", 0);
        setField(term25841, term25841.getClass(), "jsType", null);
        setField(term25841, term25841.getClass(), "parent", null);
        setField(term25840, term25840.getClass(), "next", term25841);
        setIntField(term25845, term25845.getClass(), "type", 0);
        setField(term25845, term25845.getClass(), "next", null);
        setField(term25845, term25845.getClass(), "first", null);
        setField(term25845, term25845.getClass(), "last", null);
        setField(term25845, term25845.getClass(), "propListHead", null);
        setIntField(term25845, term25845.getClass(), "sourcePosition", 0);
        setField(term25845, term25845.getClass(), "jsType", null);
        setField(term25845, term25845.getClass(), "parent", null);
        setField(term25840, term25840.getClass(), "first", term25845);
        setIntField(term25846, term25846.getClass(), "type", 0);
        setField(term25846, term25846.getClass(), "next", null);
        setField(term25846, term25846.getClass(), "first", null);
        setField(term25846, term25846.getClass(), "last", null);
        setField(term25846, term25846.getClass(), "propListHead", null);
        setIntField(term25846, term25846.getClass(), "sourcePosition", 0);
        setField(term25846, term25846.getClass(), "jsType", null);
        setField(term25846, term25846.getClass(), "parent", null);
        setField(term25840, term25840.getClass(), "last", term25846);
        setField(term25840, term25840.getClass(), "propListHead", null);
        setIntField(term25840, term25840.getClass(), "sourcePosition", 0);
        setField(term25840, term25840.getClass(), "jsType", null);
        setField(term25840, term25840.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3584;
        Object retValue = callMethod(klass, "isToStringMethodCall", argTypes, null, args);
        assertTrue(recursiveEquals(term3584, term25840));
        assertTrue(recursiveEquals(retValue, false));
    }

};


