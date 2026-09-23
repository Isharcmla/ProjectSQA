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

public class NodeUtil_getNameReferenceCount_213060949200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2905;
     Object term15261;

    public NodeUtil_getNameReferenceCount_213060949200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2918 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2928 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2905, term2905.getClass(), "type", -189738995);
        setIntField(term2907, term2907.getClass(), "type", -1626074989);
        setIntField(term2909, term2909.getClass(), "type", 0);
        setField(term2909, term2909.getClass(), "next", null);
        setField(term2909, term2909.getClass(), "first", null);
        setField(term2909, term2909.getClass(), "last", null);
        setField(term2909, term2909.getClass(), "propListHead", null);
        setIntField(term2909, term2909.getClass(), "sourcePosition", 0);
        setField(term2909, term2909.getClass(), "jsType", null);
        setField(term2909, term2909.getClass(), "parent", null);
        setField(term2907, term2907.getClass(), "next", term2909);
        setIntField(term2912, term2912.getClass(), "type", 0);
        setField(term2912, term2912.getClass(), "next", null);
        setField(term2912, term2912.getClass(), "first", null);
        setField(term2912, term2912.getClass(), "last", null);
        setField(term2912, term2912.getClass(), "propListHead", null);
        setIntField(term2912, term2912.getClass(), "sourcePosition", 0);
        setField(term2912, term2912.getClass(), "jsType", null);
        setField(term2912, term2912.getClass(), "parent", null);
        setField(term2907, term2907.getClass(), "first", term2912);
        setIntField(term2915, term2915.getClass(), "type", 0);
        setField(term2915, term2915.getClass(), "next", null);
        setField(term2915, term2915.getClass(), "first", null);
        setField(term2915, term2915.getClass(), "last", null);
        setField(term2915, term2915.getClass(), "propListHead", null);
        setIntField(term2915, term2915.getClass(), "sourcePosition", 0);
        setField(term2915, term2915.getClass(), "jsType", null);
        setField(term2915, term2915.getClass(), "parent", null);
        setField(term2907, term2907.getClass(), "last", term2915);
        setField(term2918, term2918.getClass(), "next", null);
        setIntField(term2918, term2918.getClass(), "type", 0);
        setIntField(term2918, term2918.getClass(), "intValue", 0);
        setField(term2918, term2918.getClass(), "objectValue", null);
        setField(term2907, term2907.getClass(), "propListHead", term2918);
        setIntField(term2907, term2907.getClass(), "sourcePosition", 1761540885);
        setField(term2907, term2907.getClass(), "jsType", null);
        setField(term2907, term2907.getClass(), "parent", null);
        setField(term2905, term2905.getClass(), "next", term2907);
        setIntField(term2922, term2922.getClass(), "type", 0);
        setField(term2922, term2922.getClass(), "next", null);
        setField(term2922, term2922.getClass(), "first", null);
        setField(term2922, term2922.getClass(), "last", null);
        setField(term2922, term2922.getClass(), "propListHead", null);
        setIntField(term2922, term2922.getClass(), "sourcePosition", 0);
        setField(term2922, term2922.getClass(), "jsType", null);
        setField(term2922, term2922.getClass(), "parent", null);
        setField(term2905, term2905.getClass(), "first", term2922);
        setIntField(term2925, term2925.getClass(), "type", 0);
        setField(term2925, term2925.getClass(), "next", null);
        setField(term2925, term2925.getClass(), "first", null);
        setField(term2925, term2925.getClass(), "last", null);
        setField(term2925, term2925.getClass(), "propListHead", null);
        setIntField(term2925, term2925.getClass(), "sourcePosition", 0);
        setField(term2925, term2925.getClass(), "jsType", null);
        setField(term2925, term2925.getClass(), "parent", null);
        setField(term2905, term2905.getClass(), "last", term2925);
        setField(term2928, term2928.getClass(), "next", null);
        setIntField(term2928, term2928.getClass(), "type", 0);
        setIntField(term2928, term2928.getClass(), "intValue", 0);
        setField(term2928, term2928.getClass(), "objectValue", null);
        setField(term2905, term2905.getClass(), "propListHead", term2928);
        setIntField(term2905, term2905.getClass(), "sourcePosition", -168498989);
        setField(term2905, term2905.getClass(), "jsType", null);
        setField(term2905, term2905.getClass(), "parent", null);
        term15261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15266 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15269 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15261, term15261.getClass(), "type", -189738995);
        setIntField(term15262, term15262.getClass(), "type", -1626074989);
        setIntField(term15263, term15263.getClass(), "type", 0);
        setField(term15263, term15263.getClass(), "next", null);
        setField(term15263, term15263.getClass(), "first", null);
        setField(term15263, term15263.getClass(), "last", null);
        setField(term15263, term15263.getClass(), "propListHead", null);
        setIntField(term15263, term15263.getClass(), "sourcePosition", 0);
        setField(term15263, term15263.getClass(), "jsType", null);
        setField(term15263, term15263.getClass(), "parent", null);
        setField(term15262, term15262.getClass(), "next", term15263);
        setIntField(term15264, term15264.getClass(), "type", 0);
        setField(term15264, term15264.getClass(), "next", null);
        setField(term15264, term15264.getClass(), "first", null);
        setField(term15264, term15264.getClass(), "last", null);
        setField(term15264, term15264.getClass(), "propListHead", null);
        setIntField(term15264, term15264.getClass(), "sourcePosition", 0);
        setField(term15264, term15264.getClass(), "jsType", null);
        setField(term15264, term15264.getClass(), "parent", null);
        setField(term15262, term15262.getClass(), "first", term15264);
        setIntField(term15265, term15265.getClass(), "type", 0);
        setField(term15265, term15265.getClass(), "next", null);
        setField(term15265, term15265.getClass(), "first", null);
        setField(term15265, term15265.getClass(), "last", null);
        setField(term15265, term15265.getClass(), "propListHead", null);
        setIntField(term15265, term15265.getClass(), "sourcePosition", 0);
        setField(term15265, term15265.getClass(), "jsType", null);
        setField(term15265, term15265.getClass(), "parent", null);
        setField(term15262, term15262.getClass(), "last", term15265);
        setField(term15266, term15266.getClass(), "next", null);
        setIntField(term15266, term15266.getClass(), "type", 0);
        setIntField(term15266, term15266.getClass(), "intValue", 0);
        setField(term15266, term15266.getClass(), "objectValue", null);
        setField(term15262, term15262.getClass(), "propListHead", term15266);
        setIntField(term15262, term15262.getClass(), "sourcePosition", 1761540885);
        setField(term15262, term15262.getClass(), "jsType", null);
        setField(term15262, term15262.getClass(), "parent", null);
        setField(term15261, term15261.getClass(), "next", term15262);
        setIntField(term15267, term15267.getClass(), "type", 0);
        setField(term15267, term15267.getClass(), "next", null);
        setField(term15267, term15267.getClass(), "first", null);
        setField(term15267, term15267.getClass(), "last", null);
        setField(term15267, term15267.getClass(), "propListHead", null);
        setIntField(term15267, term15267.getClass(), "sourcePosition", 0);
        setField(term15267, term15267.getClass(), "jsType", null);
        setField(term15267, term15267.getClass(), "parent", null);
        setField(term15261, term15261.getClass(), "first", term15267);
        setIntField(term15268, term15268.getClass(), "type", 0);
        setField(term15268, term15268.getClass(), "next", null);
        setField(term15268, term15268.getClass(), "first", null);
        setField(term15268, term15268.getClass(), "last", null);
        setField(term15268, term15268.getClass(), "propListHead", null);
        setIntField(term15268, term15268.getClass(), "sourcePosition", 0);
        setField(term15268, term15268.getClass(), "jsType", null);
        setField(term15268, term15268.getClass(), "parent", null);
        setField(term15261, term15261.getClass(), "last", term15268);
        setField(term15269, term15269.getClass(), "next", null);
        setIntField(term15269, term15269.getClass(), "type", 0);
        setIntField(term15269, term15269.getClass(), "intValue", 0);
        setField(term15269, term15269.getClass(), "objectValue", null);
        setField(term15261, term15261.getClass(), "propListHead", term15269);
        setIntField(term15261, term15261.getClass(), "sourcePosition", -168498989);
        setField(term15261, term15261.getClass(), "jsType", null);
        setField(term15261, term15261.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2905;
        args[1] = "vrQLuWIDJX";
        Object retValue = callMethod(klass, "getNameReferenceCount", argTypes, null, args);
        assertTrue(recursiveEquals(term2905, "vrQLuWIDJX"));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


