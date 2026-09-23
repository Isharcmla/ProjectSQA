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

public class NodeUtil_isNameReferenced_1518412862197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2829;
     Object term15060;

    public NodeUtil_isNameReferenced_1518412862197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2842 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2852 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2829, term2829.getClass(), "type", -1870339027);
        setIntField(term2831, term2831.getClass(), "type", -1644358555);
        setIntField(term2833, term2833.getClass(), "type", 0);
        setField(term2833, term2833.getClass(), "next", null);
        setField(term2833, term2833.getClass(), "first", null);
        setField(term2833, term2833.getClass(), "last", null);
        setField(term2833, term2833.getClass(), "propListHead", null);
        setIntField(term2833, term2833.getClass(), "sourcePosition", 0);
        setField(term2833, term2833.getClass(), "jsType", null);
        setField(term2833, term2833.getClass(), "parent", null);
        setField(term2831, term2831.getClass(), "next", term2833);
        setIntField(term2836, term2836.getClass(), "type", 0);
        setField(term2836, term2836.getClass(), "next", null);
        setField(term2836, term2836.getClass(), "first", null);
        setField(term2836, term2836.getClass(), "last", null);
        setField(term2836, term2836.getClass(), "propListHead", null);
        setIntField(term2836, term2836.getClass(), "sourcePosition", 0);
        setField(term2836, term2836.getClass(), "jsType", null);
        setField(term2836, term2836.getClass(), "parent", null);
        setField(term2831, term2831.getClass(), "first", term2836);
        setIntField(term2839, term2839.getClass(), "type", 0);
        setField(term2839, term2839.getClass(), "next", null);
        setField(term2839, term2839.getClass(), "first", null);
        setField(term2839, term2839.getClass(), "last", null);
        setField(term2839, term2839.getClass(), "propListHead", null);
        setIntField(term2839, term2839.getClass(), "sourcePosition", 0);
        setField(term2839, term2839.getClass(), "jsType", null);
        setField(term2839, term2839.getClass(), "parent", null);
        setField(term2831, term2831.getClass(), "last", term2839);
        setField(term2842, term2842.getClass(), "next", null);
        setIntField(term2842, term2842.getClass(), "type", 0);
        setIntField(term2842, term2842.getClass(), "intValue", 0);
        setField(term2842, term2842.getClass(), "objectValue", null);
        setField(term2831, term2831.getClass(), "propListHead", term2842);
        setIntField(term2831, term2831.getClass(), "sourcePosition", 1677994069);
        setField(term2831, term2831.getClass(), "jsType", null);
        setField(term2831, term2831.getClass(), "parent", null);
        setField(term2829, term2829.getClass(), "next", term2831);
        setIntField(term2846, term2846.getClass(), "type", 0);
        setField(term2846, term2846.getClass(), "next", null);
        setField(term2846, term2846.getClass(), "first", null);
        setField(term2846, term2846.getClass(), "last", null);
        setField(term2846, term2846.getClass(), "propListHead", null);
        setIntField(term2846, term2846.getClass(), "sourcePosition", 0);
        setField(term2846, term2846.getClass(), "jsType", null);
        setField(term2846, term2846.getClass(), "parent", null);
        setField(term2829, term2829.getClass(), "first", term2846);
        setIntField(term2849, term2849.getClass(), "type", 0);
        setField(term2849, term2849.getClass(), "next", null);
        setField(term2849, term2849.getClass(), "first", null);
        setField(term2849, term2849.getClass(), "last", null);
        setField(term2849, term2849.getClass(), "propListHead", null);
        setIntField(term2849, term2849.getClass(), "sourcePosition", 0);
        setField(term2849, term2849.getClass(), "jsType", null);
        setField(term2849, term2849.getClass(), "parent", null);
        setField(term2829, term2829.getClass(), "last", term2849);
        setField(term2852, term2852.getClass(), "next", null);
        setIntField(term2852, term2852.getClass(), "type", 0);
        setIntField(term2852, term2852.getClass(), "intValue", 0);
        setField(term2852, term2852.getClass(), "objectValue", null);
        setField(term2829, term2829.getClass(), "propListHead", term2852);
        setIntField(term2829, term2829.getClass(), "sourcePosition", -439999692);
        setField(term2829, term2829.getClass(), "jsType", null);
        setField(term2829, term2829.getClass(), "parent", null);
        term15060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15065 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15068 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15060, term15060.getClass(), "type", -1870339027);
        setIntField(term15061, term15061.getClass(), "type", -1644358555);
        setIntField(term15062, term15062.getClass(), "type", 0);
        setField(term15062, term15062.getClass(), "next", null);
        setField(term15062, term15062.getClass(), "first", null);
        setField(term15062, term15062.getClass(), "last", null);
        setField(term15062, term15062.getClass(), "propListHead", null);
        setIntField(term15062, term15062.getClass(), "sourcePosition", 0);
        setField(term15062, term15062.getClass(), "jsType", null);
        setField(term15062, term15062.getClass(), "parent", null);
        setField(term15061, term15061.getClass(), "next", term15062);
        setIntField(term15063, term15063.getClass(), "type", 0);
        setField(term15063, term15063.getClass(), "next", null);
        setField(term15063, term15063.getClass(), "first", null);
        setField(term15063, term15063.getClass(), "last", null);
        setField(term15063, term15063.getClass(), "propListHead", null);
        setIntField(term15063, term15063.getClass(), "sourcePosition", 0);
        setField(term15063, term15063.getClass(), "jsType", null);
        setField(term15063, term15063.getClass(), "parent", null);
        setField(term15061, term15061.getClass(), "first", term15063);
        setIntField(term15064, term15064.getClass(), "type", 0);
        setField(term15064, term15064.getClass(), "next", null);
        setField(term15064, term15064.getClass(), "first", null);
        setField(term15064, term15064.getClass(), "last", null);
        setField(term15064, term15064.getClass(), "propListHead", null);
        setIntField(term15064, term15064.getClass(), "sourcePosition", 0);
        setField(term15064, term15064.getClass(), "jsType", null);
        setField(term15064, term15064.getClass(), "parent", null);
        setField(term15061, term15061.getClass(), "last", term15064);
        setField(term15065, term15065.getClass(), "next", null);
        setIntField(term15065, term15065.getClass(), "type", 0);
        setIntField(term15065, term15065.getClass(), "intValue", 0);
        setField(term15065, term15065.getClass(), "objectValue", null);
        setField(term15061, term15061.getClass(), "propListHead", term15065);
        setIntField(term15061, term15061.getClass(), "sourcePosition", 1677994069);
        setField(term15061, term15061.getClass(), "jsType", null);
        setField(term15061, term15061.getClass(), "parent", null);
        setField(term15060, term15060.getClass(), "next", term15061);
        setIntField(term15066, term15066.getClass(), "type", 0);
        setField(term15066, term15066.getClass(), "next", null);
        setField(term15066, term15066.getClass(), "first", null);
        setField(term15066, term15066.getClass(), "last", null);
        setField(term15066, term15066.getClass(), "propListHead", null);
        setIntField(term15066, term15066.getClass(), "sourcePosition", 0);
        setField(term15066, term15066.getClass(), "jsType", null);
        setField(term15066, term15066.getClass(), "parent", null);
        setField(term15060, term15060.getClass(), "first", term15066);
        setIntField(term15067, term15067.getClass(), "type", 0);
        setField(term15067, term15067.getClass(), "next", null);
        setField(term15067, term15067.getClass(), "first", null);
        setField(term15067, term15067.getClass(), "last", null);
        setField(term15067, term15067.getClass(), "propListHead", null);
        setIntField(term15067, term15067.getClass(), "sourcePosition", 0);
        setField(term15067, term15067.getClass(), "jsType", null);
        setField(term15067, term15067.getClass(), "parent", null);
        setField(term15060, term15060.getClass(), "last", term15067);
        setField(term15068, term15068.getClass(), "next", null);
        setIntField(term15068, term15068.getClass(), "type", 0);
        setIntField(term15068, term15068.getClass(), "intValue", 0);
        setField(term15068, term15068.getClass(), "objectValue", null);
        setField(term15060, term15060.getClass(), "propListHead", term15068);
        setIntField(term15060, term15060.getClass(), "sourcePosition", -439999692);
        setField(term15060, term15060.getClass(), "jsType", null);
        setField(term15060, term15060.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2829;
        args[1] = "BYqFIqCKAV";
        callMethod(klass, "isNameReferenced", argTypes, null, args);
        assertTrue(recursiveEquals(term2829, "BYqFIqCKAV"));
    }

};


