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
import java.lang.Boolean;

public class NodeUtil_mayBeString_1356610414196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1130;
     Object term1157;
     Object term11051;

    public NodeUtil_mayBeString_1356610414196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1143 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1153 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1130, term1130.getClass(), "type", -1840305774);
        setIntField(term1132, term1132.getClass(), "type", 4900410);
        setIntField(term1134, term1134.getClass(), "type", 0);
        setField(term1134, term1134.getClass(), "next", null);
        setField(term1134, term1134.getClass(), "first", null);
        setField(term1134, term1134.getClass(), "last", null);
        setField(term1134, term1134.getClass(), "propListHead", null);
        setIntField(term1134, term1134.getClass(), "sourcePosition", 0);
        setField(term1134, term1134.getClass(), "jsType", null);
        setField(term1134, term1134.getClass(), "parent", null);
        setField(term1132, term1132.getClass(), "next", term1134);
        setIntField(term1137, term1137.getClass(), "type", 0);
        setField(term1137, term1137.getClass(), "next", null);
        setField(term1137, term1137.getClass(), "first", null);
        setField(term1137, term1137.getClass(), "last", null);
        setField(term1137, term1137.getClass(), "propListHead", null);
        setIntField(term1137, term1137.getClass(), "sourcePosition", 0);
        setField(term1137, term1137.getClass(), "jsType", null);
        setField(term1137, term1137.getClass(), "parent", null);
        setField(term1132, term1132.getClass(), "first", term1137);
        setIntField(term1140, term1140.getClass(), "type", 0);
        setField(term1140, term1140.getClass(), "next", null);
        setField(term1140, term1140.getClass(), "first", null);
        setField(term1140, term1140.getClass(), "last", null);
        setField(term1140, term1140.getClass(), "propListHead", null);
        setIntField(term1140, term1140.getClass(), "sourcePosition", 0);
        setField(term1140, term1140.getClass(), "jsType", null);
        setField(term1140, term1140.getClass(), "parent", null);
        setField(term1132, term1132.getClass(), "last", term1140);
        setField(term1143, term1143.getClass(), "next", null);
        setIntField(term1143, term1143.getClass(), "type", 0);
        setIntField(term1143, term1143.getClass(), "intValue", 0);
        setField(term1143, term1143.getClass(), "objectValue", null);
        setField(term1132, term1132.getClass(), "propListHead", term1143);
        setIntField(term1132, term1132.getClass(), "sourcePosition", 812570053);
        setField(term1132, term1132.getClass(), "jsType", null);
        setField(term1132, term1132.getClass(), "parent", null);
        setField(term1130, term1130.getClass(), "next", term1132);
        setIntField(term1147, term1147.getClass(), "type", 0);
        setField(term1147, term1147.getClass(), "next", null);
        setField(term1147, term1147.getClass(), "first", null);
        setField(term1147, term1147.getClass(), "last", null);
        setField(term1147, term1147.getClass(), "propListHead", null);
        setIntField(term1147, term1147.getClass(), "sourcePosition", 0);
        setField(term1147, term1147.getClass(), "jsType", null);
        setField(term1147, term1147.getClass(), "parent", null);
        setField(term1130, term1130.getClass(), "first", term1147);
        setIntField(term1150, term1150.getClass(), "type", 0);
        setField(term1150, term1150.getClass(), "next", null);
        setField(term1150, term1150.getClass(), "first", null);
        setField(term1150, term1150.getClass(), "last", null);
        setField(term1150, term1150.getClass(), "propListHead", null);
        setIntField(term1150, term1150.getClass(), "sourcePosition", 0);
        setField(term1150, term1150.getClass(), "jsType", null);
        setField(term1150, term1150.getClass(), "parent", null);
        setField(term1130, term1130.getClass(), "last", term1150);
        setField(term1153, term1153.getClass(), "next", null);
        setIntField(term1153, term1153.getClass(), "type", 0);
        setIntField(term1153, term1153.getClass(), "intValue", 0);
        setField(term1153, term1153.getClass(), "objectValue", null);
        setField(term1130, term1130.getClass(), "propListHead", term1153);
        setIntField(term1130, term1130.getClass(), "sourcePosition", -1488938905);
        setField(term1130, term1130.getClass(), "jsType", null);
        setField(term1130, term1130.getClass(), "parent", null);
        term1157 = new Boolean(false);
        term11051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11056 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11059 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11051, term11051.getClass(), "type", -1840305774);
        setIntField(term11052, term11052.getClass(), "type", 4900410);
        setIntField(term11053, term11053.getClass(), "type", 0);
        setField(term11053, term11053.getClass(), "next", null);
        setField(term11053, term11053.getClass(), "first", null);
        setField(term11053, term11053.getClass(), "last", null);
        setField(term11053, term11053.getClass(), "propListHead", null);
        setIntField(term11053, term11053.getClass(), "sourcePosition", 0);
        setField(term11053, term11053.getClass(), "jsType", null);
        setField(term11053, term11053.getClass(), "parent", null);
        setField(term11052, term11052.getClass(), "next", term11053);
        setIntField(term11054, term11054.getClass(), "type", 0);
        setField(term11054, term11054.getClass(), "next", null);
        setField(term11054, term11054.getClass(), "first", null);
        setField(term11054, term11054.getClass(), "last", null);
        setField(term11054, term11054.getClass(), "propListHead", null);
        setIntField(term11054, term11054.getClass(), "sourcePosition", 0);
        setField(term11054, term11054.getClass(), "jsType", null);
        setField(term11054, term11054.getClass(), "parent", null);
        setField(term11052, term11052.getClass(), "first", term11054);
        setIntField(term11055, term11055.getClass(), "type", 0);
        setField(term11055, term11055.getClass(), "next", null);
        setField(term11055, term11055.getClass(), "first", null);
        setField(term11055, term11055.getClass(), "last", null);
        setField(term11055, term11055.getClass(), "propListHead", null);
        setIntField(term11055, term11055.getClass(), "sourcePosition", 0);
        setField(term11055, term11055.getClass(), "jsType", null);
        setField(term11055, term11055.getClass(), "parent", null);
        setField(term11052, term11052.getClass(), "last", term11055);
        setField(term11056, term11056.getClass(), "next", null);
        setIntField(term11056, term11056.getClass(), "type", 0);
        setIntField(term11056, term11056.getClass(), "intValue", 0);
        setField(term11056, term11056.getClass(), "objectValue", null);
        setField(term11052, term11052.getClass(), "propListHead", term11056);
        setIntField(term11052, term11052.getClass(), "sourcePosition", 812570053);
        setField(term11052, term11052.getClass(), "jsType", null);
        setField(term11052, term11052.getClass(), "parent", null);
        setField(term11051, term11051.getClass(), "next", term11052);
        setIntField(term11057, term11057.getClass(), "type", 0);
        setField(term11057, term11057.getClass(), "next", null);
        setField(term11057, term11057.getClass(), "first", null);
        setField(term11057, term11057.getClass(), "last", null);
        setField(term11057, term11057.getClass(), "propListHead", null);
        setIntField(term11057, term11057.getClass(), "sourcePosition", 0);
        setField(term11057, term11057.getClass(), "jsType", null);
        setField(term11057, term11057.getClass(), "parent", null);
        setField(term11051, term11051.getClass(), "first", term11057);
        setIntField(term11058, term11058.getClass(), "type", 0);
        setField(term11058, term11058.getClass(), "next", null);
        setField(term11058, term11058.getClass(), "first", null);
        setField(term11058, term11058.getClass(), "last", null);
        setField(term11058, term11058.getClass(), "propListHead", null);
        setIntField(term11058, term11058.getClass(), "sourcePosition", 0);
        setField(term11058, term11058.getClass(), "jsType", null);
        setField(term11058, term11058.getClass(), "parent", null);
        setField(term11051, term11051.getClass(), "last", term11058);
        setField(term11059, term11059.getClass(), "next", null);
        setIntField(term11059, term11059.getClass(), "type", 0);
        setIntField(term11059, term11059.getClass(), "intValue", 0);
        setField(term11059, term11059.getClass(), "objectValue", null);
        setField(term11051, term11051.getClass(), "propListHead", term11059);
        setIntField(term11051, term11051.getClass(), "sourcePosition", -1488938905);
        setField(term11051, term11051.getClass(), "jsType", null);
        setField(term11051, term11051.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1130;
        args[1] = term1157;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term1130, term11051));
        assertTrue(recursiveEquals(term1157, false));
    }

};


