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
import java.lang.Object;

public class NodeUtil_getRootOfQualifiedName_883329160258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2829;

    public NodeUtil_getRootOfQualifiedName_883329160258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2829, term2829.getClass(), "type", 892205855);
        setIntField(term2831, term2831.getClass(), "type", 1955560079);
        setIntField(term2833, term2833.getClass(), "type", -1330529019);
        setIntField(term2835, term2835.getClass(), "type", 237134844);
        setIntField(term2837, term2837.getClass(), "type", 2076413861);
        setField(term2837, term2837.getClass(), "next", null);
        setField(term2837, term2837.getClass(), "first", null);
        setField(term2837, term2837.getClass(), "last", null);
        setField(term2837, term2837.getClass(), "propListHead", null);
        setIntField(term2837, term2837.getClass(), "sourcePosition", 0);
        setField(term2837, term2837.getClass(), "jsType", null);
        setField(term2837, term2837.getClass(), "parent", null);
        setField(term2835, term2835.getClass(), "next", term2837);
        setIntField(term2840, term2840.getClass(), "type", 66817373);
        setField(term2840, term2840.getClass(), "next", null);
        setField(term2840, term2840.getClass(), "first", null);
        setField(term2840, term2840.getClass(), "last", term2837);
        setField(term2840, term2840.getClass(), "propListHead", null);
        setIntField(term2840, term2840.getClass(), "sourcePosition", 0);
        setField(term2840, term2840.getClass(), "jsType", null);
        setField(term2840, term2840.getClass(), "parent", null);
        setField(term2835, term2835.getClass(), "first", term2840);
        setField(term2835, term2835.getClass(), "last", term2833);
        setField(term2835, term2835.getClass(), "propListHead", null);
        setIntField(term2835, term2835.getClass(), "sourcePosition", 0);
        setField(term2835, term2835.getClass(), "jsType", null);
        setField(term2835, term2835.getClass(), "parent", null);
        setField(term2833, term2833.getClass(), "next", term2835);
        setField(term2833, term2833.getClass(), "first", term2837);
        setIntField(term2844, term2844.getClass(), "type", -1641507499);
        setIntField(term2846, term2846.getClass(), "type", -33436796);
        setField(term2846, term2846.getClass(), "next", null);
        setField(term2846, term2846.getClass(), "first", term2840);
        setField(term2846, term2846.getClass(), "last", term2835);
        setField(term2846, term2846.getClass(), "propListHead", null);
        setIntField(term2846, term2846.getClass(), "sourcePosition", 0);
        setField(term2846, term2846.getClass(), "jsType", null);
        setField(term2846, term2846.getClass(), "parent", null);
        setField(term2844, term2844.getClass(), "next", term2846);
        setField(term2844, term2844.getClass(), "first", term2831);
        setField(term2844, term2844.getClass(), "last", term2831);
        setField(term2844, term2844.getClass(), "propListHead", null);
        setIntField(term2844, term2844.getClass(), "sourcePosition", 0);
        setField(term2844, term2844.getClass(), "jsType", null);
        setField(term2844, term2844.getClass(), "parent", null);
        setField(term2833, term2833.getClass(), "last", term2844);
        setField(term2833, term2833.getClass(), "propListHead", null);
        setIntField(term2833, term2833.getClass(), "sourcePosition", 0);
        setField(term2833, term2833.getClass(), "jsType", null);
        setField(term2833, term2833.getClass(), "parent", null);
        setField(term2831, term2831.getClass(), "next", term2833);
        setIntField(term2851, term2851.getClass(), "type", -1527326823);
        setField(term2851, term2851.getClass(), "next", term2844);
        setField(term2851, term2851.getClass(), "first", term2846);
        setField(term2851, term2851.getClass(), "last", term2829);
        setField(term2851, term2851.getClass(), "propListHead", null);
        setIntField(term2851, term2851.getClass(), "sourcePosition", 0);
        setField(term2851, term2851.getClass(), "jsType", null);
        setField(term2851, term2851.getClass(), "parent", null);
        setField(term2831, term2831.getClass(), "first", term2851);
        setField(term2831, term2831.getClass(), "last", term2851);
        setField(term2831, term2831.getClass(), "propListHead", null);
        setIntField(term2831, term2831.getClass(), "sourcePosition", 0);
        setField(term2831, term2831.getClass(), "jsType", null);
        setField(term2831, term2831.getClass(), "parent", null);
        setField(term2829, term2829.getClass(), "next", term2831);
        setField(term2829, term2829.getClass(), "first", term2835);
        setField(term2829, term2829.getClass(), "last", term2837);
        setField(term2829, term2829.getClass(), "propListHead", null);
        setIntField(term2829, term2829.getClass(), "sourcePosition", 0);
        setField(term2829, term2829.getClass(), "jsType", null);
        setField(term2829, term2829.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2829;
        try {
            callMethod(klass, "getRootOfQualifiedName", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


