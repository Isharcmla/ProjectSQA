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

public class NodeUtil_isUndefined_497061199192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1022;
     Object term10390;

    public NodeUtil_isUndefined_497061199192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1035 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1045 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1022, term1022.getClass(), "type", 765731371);
        setIntField(term1024, term1024.getClass(), "type", -1941343035);
        setIntField(term1026, term1026.getClass(), "type", 0);
        setField(term1026, term1026.getClass(), "next", null);
        setField(term1026, term1026.getClass(), "first", null);
        setField(term1026, term1026.getClass(), "last", null);
        setField(term1026, term1026.getClass(), "propListHead", null);
        setIntField(term1026, term1026.getClass(), "sourcePosition", 0);
        setField(term1026, term1026.getClass(), "jsType", null);
        setField(term1026, term1026.getClass(), "parent", null);
        setField(term1024, term1024.getClass(), "next", term1026);
        setIntField(term1029, term1029.getClass(), "type", 0);
        setField(term1029, term1029.getClass(), "next", null);
        setField(term1029, term1029.getClass(), "first", null);
        setField(term1029, term1029.getClass(), "last", null);
        setField(term1029, term1029.getClass(), "propListHead", null);
        setIntField(term1029, term1029.getClass(), "sourcePosition", 0);
        setField(term1029, term1029.getClass(), "jsType", null);
        setField(term1029, term1029.getClass(), "parent", null);
        setField(term1024, term1024.getClass(), "first", term1029);
        setIntField(term1032, term1032.getClass(), "type", 0);
        setField(term1032, term1032.getClass(), "next", null);
        setField(term1032, term1032.getClass(), "first", null);
        setField(term1032, term1032.getClass(), "last", null);
        setField(term1032, term1032.getClass(), "propListHead", null);
        setIntField(term1032, term1032.getClass(), "sourcePosition", 0);
        setField(term1032, term1032.getClass(), "jsType", null);
        setField(term1032, term1032.getClass(), "parent", null);
        setField(term1024, term1024.getClass(), "last", term1032);
        setField(term1035, term1035.getClass(), "next", null);
        setIntField(term1035, term1035.getClass(), "type", 0);
        setIntField(term1035, term1035.getClass(), "intValue", 0);
        setField(term1035, term1035.getClass(), "objectValue", null);
        setField(term1024, term1024.getClass(), "propListHead", term1035);
        setIntField(term1024, term1024.getClass(), "sourcePosition", -1748391876);
        setField(term1024, term1024.getClass(), "jsType", null);
        setField(term1024, term1024.getClass(), "parent", null);
        setField(term1022, term1022.getClass(), "next", term1024);
        setIntField(term1039, term1039.getClass(), "type", 0);
        setField(term1039, term1039.getClass(), "next", null);
        setField(term1039, term1039.getClass(), "first", null);
        setField(term1039, term1039.getClass(), "last", null);
        setField(term1039, term1039.getClass(), "propListHead", null);
        setIntField(term1039, term1039.getClass(), "sourcePosition", 0);
        setField(term1039, term1039.getClass(), "jsType", null);
        setField(term1039, term1039.getClass(), "parent", null);
        setField(term1022, term1022.getClass(), "first", term1039);
        setIntField(term1042, term1042.getClass(), "type", 0);
        setField(term1042, term1042.getClass(), "next", null);
        setField(term1042, term1042.getClass(), "first", null);
        setField(term1042, term1042.getClass(), "last", null);
        setField(term1042, term1042.getClass(), "propListHead", null);
        setIntField(term1042, term1042.getClass(), "sourcePosition", 0);
        setField(term1042, term1042.getClass(), "jsType", null);
        setField(term1042, term1042.getClass(), "parent", null);
        setField(term1022, term1022.getClass(), "last", term1042);
        setField(term1045, term1045.getClass(), "next", null);
        setIntField(term1045, term1045.getClass(), "type", 0);
        setIntField(term1045, term1045.getClass(), "intValue", 0);
        setField(term1045, term1045.getClass(), "objectValue", null);
        setField(term1022, term1022.getClass(), "propListHead", term1045);
        setIntField(term1022, term1022.getClass(), "sourcePosition", 43258317);
        setField(term1022, term1022.getClass(), "jsType", null);
        setField(term1022, term1022.getClass(), "parent", null);
        term10390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10395 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10398 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10390, term10390.getClass(), "type", 765731371);
        setIntField(term10391, term10391.getClass(), "type", -1941343035);
        setIntField(term10392, term10392.getClass(), "type", 0);
        setField(term10392, term10392.getClass(), "next", null);
        setField(term10392, term10392.getClass(), "first", null);
        setField(term10392, term10392.getClass(), "last", null);
        setField(term10392, term10392.getClass(), "propListHead", null);
        setIntField(term10392, term10392.getClass(), "sourcePosition", 0);
        setField(term10392, term10392.getClass(), "jsType", null);
        setField(term10392, term10392.getClass(), "parent", null);
        setField(term10391, term10391.getClass(), "next", term10392);
        setIntField(term10393, term10393.getClass(), "type", 0);
        setField(term10393, term10393.getClass(), "next", null);
        setField(term10393, term10393.getClass(), "first", null);
        setField(term10393, term10393.getClass(), "last", null);
        setField(term10393, term10393.getClass(), "propListHead", null);
        setIntField(term10393, term10393.getClass(), "sourcePosition", 0);
        setField(term10393, term10393.getClass(), "jsType", null);
        setField(term10393, term10393.getClass(), "parent", null);
        setField(term10391, term10391.getClass(), "first", term10393);
        setIntField(term10394, term10394.getClass(), "type", 0);
        setField(term10394, term10394.getClass(), "next", null);
        setField(term10394, term10394.getClass(), "first", null);
        setField(term10394, term10394.getClass(), "last", null);
        setField(term10394, term10394.getClass(), "propListHead", null);
        setIntField(term10394, term10394.getClass(), "sourcePosition", 0);
        setField(term10394, term10394.getClass(), "jsType", null);
        setField(term10394, term10394.getClass(), "parent", null);
        setField(term10391, term10391.getClass(), "last", term10394);
        setField(term10395, term10395.getClass(), "next", null);
        setIntField(term10395, term10395.getClass(), "type", 0);
        setIntField(term10395, term10395.getClass(), "intValue", 0);
        setField(term10395, term10395.getClass(), "objectValue", null);
        setField(term10391, term10391.getClass(), "propListHead", term10395);
        setIntField(term10391, term10391.getClass(), "sourcePosition", -1748391876);
        setField(term10391, term10391.getClass(), "jsType", null);
        setField(term10391, term10391.getClass(), "parent", null);
        setField(term10390, term10390.getClass(), "next", term10391);
        setIntField(term10396, term10396.getClass(), "type", 0);
        setField(term10396, term10396.getClass(), "next", null);
        setField(term10396, term10396.getClass(), "first", null);
        setField(term10396, term10396.getClass(), "last", null);
        setField(term10396, term10396.getClass(), "propListHead", null);
        setIntField(term10396, term10396.getClass(), "sourcePosition", 0);
        setField(term10396, term10396.getClass(), "jsType", null);
        setField(term10396, term10396.getClass(), "parent", null);
        setField(term10390, term10390.getClass(), "first", term10396);
        setIntField(term10397, term10397.getClass(), "type", 0);
        setField(term10397, term10397.getClass(), "next", null);
        setField(term10397, term10397.getClass(), "first", null);
        setField(term10397, term10397.getClass(), "last", null);
        setField(term10397, term10397.getClass(), "propListHead", null);
        setIntField(term10397, term10397.getClass(), "sourcePosition", 0);
        setField(term10397, term10397.getClass(), "jsType", null);
        setField(term10397, term10397.getClass(), "parent", null);
        setField(term10390, term10390.getClass(), "last", term10397);
        setField(term10398, term10398.getClass(), "next", null);
        setIntField(term10398, term10398.getClass(), "type", 0);
        setIntField(term10398, term10398.getClass(), "intValue", 0);
        setField(term10398, term10398.getClass(), "objectValue", null);
        setField(term10390, term10390.getClass(), "propListHead", term10398);
        setIntField(term10390, term10390.getClass(), "sourcePosition", 43258317);
        setField(term10390, term10390.getClass(), "jsType", null);
        setField(term10390, term10390.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1022;
        Object retValue = callMethod(klass, "isUndefined", argTypes, null, args);
        assertTrue(recursiveEquals(term1022, term10390));
        assertTrue(recursiveEquals(retValue, false));
    }

};


