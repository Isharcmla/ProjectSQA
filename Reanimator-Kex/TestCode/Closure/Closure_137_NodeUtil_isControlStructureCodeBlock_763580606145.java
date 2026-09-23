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

public class NodeUtil_isControlStructureCodeBlock_763580606145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1057;
     Object term1084;

    public NodeUtil_isControlStructureCodeBlock_763580606145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1070 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1080 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1057, term1057.getClass(), "type", 1607082164);
        setIntField(term1059, term1059.getClass(), "type", 91958879);
        setIntField(term1061, term1061.getClass(), "type", 0);
        setField(term1061, term1061.getClass(), "next", null);
        setField(term1061, term1061.getClass(), "first", null);
        setField(term1061, term1061.getClass(), "last", null);
        setField(term1061, term1061.getClass(), "propListHead", null);
        setIntField(term1061, term1061.getClass(), "sourcePosition", 0);
        setField(term1061, term1061.getClass(), "jsType", null);
        setField(term1061, term1061.getClass(), "parent", null);
        setField(term1059, term1059.getClass(), "next", term1061);
        setIntField(term1064, term1064.getClass(), "type", 0);
        setField(term1064, term1064.getClass(), "next", null);
        setField(term1064, term1064.getClass(), "first", null);
        setField(term1064, term1064.getClass(), "last", null);
        setField(term1064, term1064.getClass(), "propListHead", null);
        setIntField(term1064, term1064.getClass(), "sourcePosition", 0);
        setField(term1064, term1064.getClass(), "jsType", null);
        setField(term1064, term1064.getClass(), "parent", null);
        setField(term1059, term1059.getClass(), "first", term1064);
        setIntField(term1067, term1067.getClass(), "type", 0);
        setField(term1067, term1067.getClass(), "next", null);
        setField(term1067, term1067.getClass(), "first", null);
        setField(term1067, term1067.getClass(), "last", null);
        setField(term1067, term1067.getClass(), "propListHead", null);
        setIntField(term1067, term1067.getClass(), "sourcePosition", 0);
        setField(term1067, term1067.getClass(), "jsType", null);
        setField(term1067, term1067.getClass(), "parent", null);
        setField(term1059, term1059.getClass(), "last", term1067);
        setField(term1070, term1070.getClass(), "next", null);
        setIntField(term1070, term1070.getClass(), "type", 0);
        setIntField(term1070, term1070.getClass(), "intValue", 0);
        setField(term1070, term1070.getClass(), "objectValue", null);
        setField(term1059, term1059.getClass(), "propListHead", term1070);
        setIntField(term1059, term1059.getClass(), "sourcePosition", 644154104);
        setField(term1059, term1059.getClass(), "jsType", null);
        setField(term1059, term1059.getClass(), "parent", null);
        setField(term1057, term1057.getClass(), "next", term1059);
        setIntField(term1074, term1074.getClass(), "type", 0);
        setField(term1074, term1074.getClass(), "next", null);
        setField(term1074, term1074.getClass(), "first", null);
        setField(term1074, term1074.getClass(), "last", null);
        setField(term1074, term1074.getClass(), "propListHead", null);
        setIntField(term1074, term1074.getClass(), "sourcePosition", 0);
        setField(term1074, term1074.getClass(), "jsType", null);
        setField(term1074, term1074.getClass(), "parent", null);
        setField(term1057, term1057.getClass(), "first", term1074);
        setIntField(term1077, term1077.getClass(), "type", 0);
        setField(term1077, term1077.getClass(), "next", null);
        setField(term1077, term1077.getClass(), "first", null);
        setField(term1077, term1077.getClass(), "last", null);
        setField(term1077, term1077.getClass(), "propListHead", null);
        setIntField(term1077, term1077.getClass(), "sourcePosition", 0);
        setField(term1077, term1077.getClass(), "jsType", null);
        setField(term1077, term1077.getClass(), "parent", null);
        setField(term1057, term1057.getClass(), "last", term1077);
        setField(term1080, term1080.getClass(), "next", null);
        setIntField(term1080, term1080.getClass(), "type", 0);
        setIntField(term1080, term1080.getClass(), "intValue", 0);
        setField(term1080, term1080.getClass(), "objectValue", null);
        setField(term1057, term1057.getClass(), "propListHead", term1080);
        setIntField(term1057, term1057.getClass(), "sourcePosition", 76650923);
        setField(term1057, term1057.getClass(), "jsType", null);
        setField(term1057, term1057.getClass(), "parent", null);
        term1084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1097 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1107 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1084, term1084.getClass(), "type", -1840305774);
        setIntField(term1086, term1086.getClass(), "type", 4900410);
        setIntField(term1088, term1088.getClass(), "type", 0);
        setField(term1088, term1088.getClass(), "next", null);
        setField(term1088, term1088.getClass(), "first", null);
        setField(term1088, term1088.getClass(), "last", null);
        setField(term1088, term1088.getClass(), "propListHead", null);
        setIntField(term1088, term1088.getClass(), "sourcePosition", 0);
        setField(term1088, term1088.getClass(), "jsType", null);
        setField(term1088, term1088.getClass(), "parent", null);
        setField(term1086, term1086.getClass(), "next", term1088);
        setIntField(term1091, term1091.getClass(), "type", 0);
        setField(term1091, term1091.getClass(), "next", null);
        setField(term1091, term1091.getClass(), "first", null);
        setField(term1091, term1091.getClass(), "last", null);
        setField(term1091, term1091.getClass(), "propListHead", null);
        setIntField(term1091, term1091.getClass(), "sourcePosition", 0);
        setField(term1091, term1091.getClass(), "jsType", null);
        setField(term1091, term1091.getClass(), "parent", null);
        setField(term1086, term1086.getClass(), "first", term1091);
        setIntField(term1094, term1094.getClass(), "type", 0);
        setField(term1094, term1094.getClass(), "next", null);
        setField(term1094, term1094.getClass(), "first", null);
        setField(term1094, term1094.getClass(), "last", null);
        setField(term1094, term1094.getClass(), "propListHead", null);
        setIntField(term1094, term1094.getClass(), "sourcePosition", 0);
        setField(term1094, term1094.getClass(), "jsType", null);
        setField(term1094, term1094.getClass(), "parent", null);
        setField(term1086, term1086.getClass(), "last", term1094);
        setField(term1097, term1097.getClass(), "next", null);
        setIntField(term1097, term1097.getClass(), "type", 0);
        setIntField(term1097, term1097.getClass(), "intValue", 0);
        setField(term1097, term1097.getClass(), "objectValue", null);
        setField(term1086, term1086.getClass(), "propListHead", term1097);
        setIntField(term1086, term1086.getClass(), "sourcePosition", 812570053);
        setField(term1086, term1086.getClass(), "jsType", null);
        setField(term1086, term1086.getClass(), "parent", null);
        setField(term1084, term1084.getClass(), "next", term1086);
        setIntField(term1101, term1101.getClass(), "type", 0);
        setField(term1101, term1101.getClass(), "next", null);
        setField(term1101, term1101.getClass(), "first", null);
        setField(term1101, term1101.getClass(), "last", null);
        setField(term1101, term1101.getClass(), "propListHead", null);
        setIntField(term1101, term1101.getClass(), "sourcePosition", 0);
        setField(term1101, term1101.getClass(), "jsType", null);
        setField(term1101, term1101.getClass(), "parent", null);
        setField(term1084, term1084.getClass(), "first", term1101);
        setIntField(term1104, term1104.getClass(), "type", 0);
        setField(term1104, term1104.getClass(), "next", null);
        setField(term1104, term1104.getClass(), "first", null);
        setField(term1104, term1104.getClass(), "last", null);
        setField(term1104, term1104.getClass(), "propListHead", null);
        setIntField(term1104, term1104.getClass(), "sourcePosition", 0);
        setField(term1104, term1104.getClass(), "jsType", null);
        setField(term1104, term1104.getClass(), "parent", null);
        setField(term1084, term1084.getClass(), "last", term1104);
        setField(term1107, term1107.getClass(), "next", null);
        setIntField(term1107, term1107.getClass(), "type", 0);
        setIntField(term1107, term1107.getClass(), "intValue", 0);
        setField(term1107, term1107.getClass(), "objectValue", null);
        setField(term1084, term1084.getClass(), "propListHead", term1107);
        setIntField(term1084, term1084.getClass(), "sourcePosition", -1488938905);
        setField(term1084, term1084.getClass(), "jsType", null);
        setField(term1084, term1084.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1057;
        args[1] = term1084;
        try {
            callMethod(klass, "isControlStructureCodeBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


