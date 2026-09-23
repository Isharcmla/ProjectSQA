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

public class NodeUtil_redeclareVarsInsideBranch_1330830302260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2921;
     Object term17831;

    public NodeUtil_redeclareVarsInsideBranch_1330830302260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2934 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2944 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2921, term2921.getClass(), "type", 1505375686);
        setIntField(term2923, term2923.getClass(), "type", 444514470);
        setIntField(term2925, term2925.getClass(), "type", 0);
        setField(term2925, term2925.getClass(), "next", null);
        setField(term2925, term2925.getClass(), "first", null);
        setField(term2925, term2925.getClass(), "last", null);
        setField(term2925, term2925.getClass(), "propListHead", null);
        setIntField(term2925, term2925.getClass(), "sourcePosition", 0);
        setField(term2925, term2925.getClass(), "jsType", null);
        setField(term2925, term2925.getClass(), "parent", null);
        setField(term2923, term2923.getClass(), "next", term2925);
        setIntField(term2928, term2928.getClass(), "type", 0);
        setField(term2928, term2928.getClass(), "next", null);
        setField(term2928, term2928.getClass(), "first", null);
        setField(term2928, term2928.getClass(), "last", null);
        setField(term2928, term2928.getClass(), "propListHead", null);
        setIntField(term2928, term2928.getClass(), "sourcePosition", 0);
        setField(term2928, term2928.getClass(), "jsType", null);
        setField(term2928, term2928.getClass(), "parent", null);
        setField(term2923, term2923.getClass(), "first", term2928);
        setIntField(term2931, term2931.getClass(), "type", 0);
        setField(term2931, term2931.getClass(), "next", null);
        setField(term2931, term2931.getClass(), "first", null);
        setField(term2931, term2931.getClass(), "last", null);
        setField(term2931, term2931.getClass(), "propListHead", null);
        setIntField(term2931, term2931.getClass(), "sourcePosition", 0);
        setField(term2931, term2931.getClass(), "jsType", null);
        setField(term2931, term2931.getClass(), "parent", null);
        setField(term2923, term2923.getClass(), "last", term2931);
        setField(term2934, term2934.getClass(), "next", null);
        setIntField(term2934, term2934.getClass(), "type", 0);
        setIntField(term2934, term2934.getClass(), "intValue", 0);
        setField(term2934, term2934.getClass(), "objectValue", null);
        setField(term2923, term2923.getClass(), "propListHead", term2934);
        setIntField(term2923, term2923.getClass(), "sourcePosition", 961252909);
        setField(term2923, term2923.getClass(), "jsType", null);
        setField(term2923, term2923.getClass(), "parent", null);
        setField(term2921, term2921.getClass(), "next", term2923);
        setIntField(term2938, term2938.getClass(), "type", 0);
        setField(term2938, term2938.getClass(), "next", null);
        setField(term2938, term2938.getClass(), "first", null);
        setField(term2938, term2938.getClass(), "last", null);
        setField(term2938, term2938.getClass(), "propListHead", null);
        setIntField(term2938, term2938.getClass(), "sourcePosition", 0);
        setField(term2938, term2938.getClass(), "jsType", null);
        setField(term2938, term2938.getClass(), "parent", null);
        setField(term2921, term2921.getClass(), "first", term2938);
        setIntField(term2941, term2941.getClass(), "type", 0);
        setField(term2941, term2941.getClass(), "next", null);
        setField(term2941, term2941.getClass(), "first", null);
        setField(term2941, term2941.getClass(), "last", null);
        setField(term2941, term2941.getClass(), "propListHead", null);
        setIntField(term2941, term2941.getClass(), "sourcePosition", 0);
        setField(term2941, term2941.getClass(), "jsType", null);
        setField(term2941, term2941.getClass(), "parent", null);
        setField(term2921, term2921.getClass(), "last", term2941);
        setField(term2944, term2944.getClass(), "next", null);
        setIntField(term2944, term2944.getClass(), "type", 0);
        setIntField(term2944, term2944.getClass(), "intValue", 0);
        setField(term2944, term2944.getClass(), "objectValue", null);
        setField(term2921, term2921.getClass(), "propListHead", term2944);
        setIntField(term2921, term2921.getClass(), "sourcePosition", 1455842357);
        setField(term2921, term2921.getClass(), "jsType", null);
        setField(term2921, term2921.getClass(), "parent", null);
        term17831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17836 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term17837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17839 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term17831, term17831.getClass(), "type", 1505375686);
        setIntField(term17832, term17832.getClass(), "type", 444514470);
        setIntField(term17833, term17833.getClass(), "type", 0);
        setField(term17833, term17833.getClass(), "next", null);
        setField(term17833, term17833.getClass(), "first", null);
        setField(term17833, term17833.getClass(), "last", null);
        setField(term17833, term17833.getClass(), "propListHead", null);
        setIntField(term17833, term17833.getClass(), "sourcePosition", 0);
        setField(term17833, term17833.getClass(), "jsType", null);
        setField(term17833, term17833.getClass(), "parent", null);
        setField(term17832, term17832.getClass(), "next", term17833);
        setIntField(term17834, term17834.getClass(), "type", 0);
        setField(term17834, term17834.getClass(), "next", null);
        setField(term17834, term17834.getClass(), "first", null);
        setField(term17834, term17834.getClass(), "last", null);
        setField(term17834, term17834.getClass(), "propListHead", null);
        setIntField(term17834, term17834.getClass(), "sourcePosition", 0);
        setField(term17834, term17834.getClass(), "jsType", null);
        setField(term17834, term17834.getClass(), "parent", null);
        setField(term17832, term17832.getClass(), "first", term17834);
        setIntField(term17835, term17835.getClass(), "type", 0);
        setField(term17835, term17835.getClass(), "next", null);
        setField(term17835, term17835.getClass(), "first", null);
        setField(term17835, term17835.getClass(), "last", null);
        setField(term17835, term17835.getClass(), "propListHead", null);
        setIntField(term17835, term17835.getClass(), "sourcePosition", 0);
        setField(term17835, term17835.getClass(), "jsType", null);
        setField(term17835, term17835.getClass(), "parent", null);
        setField(term17832, term17832.getClass(), "last", term17835);
        setField(term17836, term17836.getClass(), "next", null);
        setIntField(term17836, term17836.getClass(), "type", 0);
        setIntField(term17836, term17836.getClass(), "intValue", 0);
        setField(term17836, term17836.getClass(), "objectValue", null);
        setField(term17832, term17832.getClass(), "propListHead", term17836);
        setIntField(term17832, term17832.getClass(), "sourcePosition", 961252909);
        setField(term17832, term17832.getClass(), "jsType", null);
        setField(term17832, term17832.getClass(), "parent", null);
        setField(term17831, term17831.getClass(), "next", term17832);
        setIntField(term17837, term17837.getClass(), "type", 0);
        setField(term17837, term17837.getClass(), "next", null);
        setField(term17837, term17837.getClass(), "first", null);
        setField(term17837, term17837.getClass(), "last", null);
        setField(term17837, term17837.getClass(), "propListHead", null);
        setIntField(term17837, term17837.getClass(), "sourcePosition", 0);
        setField(term17837, term17837.getClass(), "jsType", null);
        setField(term17837, term17837.getClass(), "parent", null);
        setField(term17831, term17831.getClass(), "first", term17837);
        setIntField(term17838, term17838.getClass(), "type", 0);
        setField(term17838, term17838.getClass(), "next", null);
        setField(term17838, term17838.getClass(), "first", null);
        setField(term17838, term17838.getClass(), "last", null);
        setField(term17838, term17838.getClass(), "propListHead", null);
        setIntField(term17838, term17838.getClass(), "sourcePosition", 0);
        setField(term17838, term17838.getClass(), "jsType", null);
        setField(term17838, term17838.getClass(), "parent", null);
        setField(term17831, term17831.getClass(), "last", term17838);
        setField(term17839, term17839.getClass(), "next", null);
        setIntField(term17839, term17839.getClass(), "type", 0);
        setIntField(term17839, term17839.getClass(), "intValue", 0);
        setField(term17839, term17839.getClass(), "objectValue", null);
        setField(term17831, term17831.getClass(), "propListHead", term17839);
        setIntField(term17831, term17831.getClass(), "sourcePosition", 1455842357);
        setField(term17831, term17831.getClass(), "jsType", null);
        setField(term17831, term17831.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2921;
        callMethod(klass, "redeclareVarsInsideBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term2921, term17831));
    }

};


