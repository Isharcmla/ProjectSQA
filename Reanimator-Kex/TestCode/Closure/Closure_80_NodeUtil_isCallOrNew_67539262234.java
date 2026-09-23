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

public class NodeUtil_isCallOrNew_67539262234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2189;
     Object term14836;

    public NodeUtil_isCallOrNew_67539262234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2202 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2189, term2189.getClass(), "type", 1985432430);
        setIntField(term2191, term2191.getClass(), "type", 1354781442);
        setIntField(term2193, term2193.getClass(), "type", 0);
        setField(term2193, term2193.getClass(), "next", null);
        setField(term2193, term2193.getClass(), "first", null);
        setField(term2193, term2193.getClass(), "last", null);
        setField(term2193, term2193.getClass(), "propListHead", null);
        setIntField(term2193, term2193.getClass(), "sourcePosition", 0);
        setField(term2193, term2193.getClass(), "jsType", null);
        setField(term2193, term2193.getClass(), "parent", null);
        setField(term2191, term2191.getClass(), "next", term2193);
        setIntField(term2196, term2196.getClass(), "type", 0);
        setField(term2196, term2196.getClass(), "next", null);
        setField(term2196, term2196.getClass(), "first", null);
        setField(term2196, term2196.getClass(), "last", null);
        setField(term2196, term2196.getClass(), "propListHead", null);
        setIntField(term2196, term2196.getClass(), "sourcePosition", 0);
        setField(term2196, term2196.getClass(), "jsType", null);
        setField(term2196, term2196.getClass(), "parent", null);
        setField(term2191, term2191.getClass(), "first", term2196);
        setIntField(term2199, term2199.getClass(), "type", 0);
        setField(term2199, term2199.getClass(), "next", null);
        setField(term2199, term2199.getClass(), "first", null);
        setField(term2199, term2199.getClass(), "last", null);
        setField(term2199, term2199.getClass(), "propListHead", null);
        setIntField(term2199, term2199.getClass(), "sourcePosition", 0);
        setField(term2199, term2199.getClass(), "jsType", null);
        setField(term2199, term2199.getClass(), "parent", null);
        setField(term2191, term2191.getClass(), "last", term2199);
        setField(term2202, term2202.getClass(), "next", null);
        setIntField(term2202, term2202.getClass(), "type", 0);
        setIntField(term2202, term2202.getClass(), "intValue", 0);
        setField(term2202, term2202.getClass(), "objectValue", null);
        setField(term2191, term2191.getClass(), "propListHead", term2202);
        setIntField(term2191, term2191.getClass(), "sourcePosition", -829441157);
        setField(term2191, term2191.getClass(), "jsType", null);
        setField(term2191, term2191.getClass(), "parent", null);
        setField(term2189, term2189.getClass(), "next", term2191);
        setIntField(term2206, term2206.getClass(), "type", 0);
        setField(term2206, term2206.getClass(), "next", null);
        setField(term2206, term2206.getClass(), "first", null);
        setField(term2206, term2206.getClass(), "last", null);
        setField(term2206, term2206.getClass(), "propListHead", null);
        setIntField(term2206, term2206.getClass(), "sourcePosition", 0);
        setField(term2206, term2206.getClass(), "jsType", null);
        setField(term2206, term2206.getClass(), "parent", null);
        setField(term2189, term2189.getClass(), "first", term2206);
        setIntField(term2209, term2209.getClass(), "type", 0);
        setField(term2209, term2209.getClass(), "next", null);
        setField(term2209, term2209.getClass(), "first", null);
        setField(term2209, term2209.getClass(), "last", null);
        setField(term2209, term2209.getClass(), "propListHead", null);
        setIntField(term2209, term2209.getClass(), "sourcePosition", 0);
        setField(term2209, term2209.getClass(), "jsType", null);
        setField(term2209, term2209.getClass(), "parent", null);
        setField(term2189, term2189.getClass(), "last", term2209);
        setField(term2212, term2212.getClass(), "next", null);
        setIntField(term2212, term2212.getClass(), "type", 0);
        setIntField(term2212, term2212.getClass(), "intValue", 0);
        setField(term2212, term2212.getClass(), "objectValue", null);
        setField(term2189, term2189.getClass(), "propListHead", term2212);
        setIntField(term2189, term2189.getClass(), "sourcePosition", -1489991025);
        setField(term2189, term2189.getClass(), "jsType", null);
        setField(term2189, term2189.getClass(), "parent", null);
        term14836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14841 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14844 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term14836, term14836.getClass(), "type", 1985432430);
        setIntField(term14837, term14837.getClass(), "type", 1354781442);
        setIntField(term14838, term14838.getClass(), "type", 0);
        setField(term14838, term14838.getClass(), "next", null);
        setField(term14838, term14838.getClass(), "first", null);
        setField(term14838, term14838.getClass(), "last", null);
        setField(term14838, term14838.getClass(), "propListHead", null);
        setIntField(term14838, term14838.getClass(), "sourcePosition", 0);
        setField(term14838, term14838.getClass(), "jsType", null);
        setField(term14838, term14838.getClass(), "parent", null);
        setField(term14837, term14837.getClass(), "next", term14838);
        setIntField(term14839, term14839.getClass(), "type", 0);
        setField(term14839, term14839.getClass(), "next", null);
        setField(term14839, term14839.getClass(), "first", null);
        setField(term14839, term14839.getClass(), "last", null);
        setField(term14839, term14839.getClass(), "propListHead", null);
        setIntField(term14839, term14839.getClass(), "sourcePosition", 0);
        setField(term14839, term14839.getClass(), "jsType", null);
        setField(term14839, term14839.getClass(), "parent", null);
        setField(term14837, term14837.getClass(), "first", term14839);
        setIntField(term14840, term14840.getClass(), "type", 0);
        setField(term14840, term14840.getClass(), "next", null);
        setField(term14840, term14840.getClass(), "first", null);
        setField(term14840, term14840.getClass(), "last", null);
        setField(term14840, term14840.getClass(), "propListHead", null);
        setIntField(term14840, term14840.getClass(), "sourcePosition", 0);
        setField(term14840, term14840.getClass(), "jsType", null);
        setField(term14840, term14840.getClass(), "parent", null);
        setField(term14837, term14837.getClass(), "last", term14840);
        setField(term14841, term14841.getClass(), "next", null);
        setIntField(term14841, term14841.getClass(), "type", 0);
        setIntField(term14841, term14841.getClass(), "intValue", 0);
        setField(term14841, term14841.getClass(), "objectValue", null);
        setField(term14837, term14837.getClass(), "propListHead", term14841);
        setIntField(term14837, term14837.getClass(), "sourcePosition", -829441157);
        setField(term14837, term14837.getClass(), "jsType", null);
        setField(term14837, term14837.getClass(), "parent", null);
        setField(term14836, term14836.getClass(), "next", term14837);
        setIntField(term14842, term14842.getClass(), "type", 0);
        setField(term14842, term14842.getClass(), "next", null);
        setField(term14842, term14842.getClass(), "first", null);
        setField(term14842, term14842.getClass(), "last", null);
        setField(term14842, term14842.getClass(), "propListHead", null);
        setIntField(term14842, term14842.getClass(), "sourcePosition", 0);
        setField(term14842, term14842.getClass(), "jsType", null);
        setField(term14842, term14842.getClass(), "parent", null);
        setField(term14836, term14836.getClass(), "first", term14842);
        setIntField(term14843, term14843.getClass(), "type", 0);
        setField(term14843, term14843.getClass(), "next", null);
        setField(term14843, term14843.getClass(), "first", null);
        setField(term14843, term14843.getClass(), "last", null);
        setField(term14843, term14843.getClass(), "propListHead", null);
        setIntField(term14843, term14843.getClass(), "sourcePosition", 0);
        setField(term14843, term14843.getClass(), "jsType", null);
        setField(term14843, term14843.getClass(), "parent", null);
        setField(term14836, term14836.getClass(), "last", term14843);
        setField(term14844, term14844.getClass(), "next", null);
        setIntField(term14844, term14844.getClass(), "type", 0);
        setIntField(term14844, term14844.getClass(), "intValue", 0);
        setField(term14844, term14844.getClass(), "objectValue", null);
        setField(term14836, term14836.getClass(), "propListHead", term14844);
        setIntField(term14836, term14836.getClass(), "sourcePosition", -1489991025);
        setField(term14836, term14836.getClass(), "jsType", null);
        setField(term14836, term14836.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2189;
        Object retValue = callMethod(klass, "isCallOrNew", argTypes, null, args);
        assertTrue(recursiveEquals(term2189, term14836));
        assertTrue(recursiveEquals(retValue, false));
    }

};


