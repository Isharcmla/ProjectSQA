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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class PeepholeSubstituteAlternateSyntax_maybeReplaceChildWithNumber_119838286583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1083;
     Object term1086;
     Object term1113;
     Object term1140;

    public PeepholeSubstituteAlternateSyntax_maybeReplaceChildWithNumber_119838286583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1083 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term1083, term1083.getClass(), "late", true);
        setIntField(term1083, term1083.getClass(), "STRING_SPLIT_OVERHEAD", 301401782);
        setField(term1083, term1083.getClass(), "compiler", null);
        term1086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1086, term1086.getClass(), "type", 1988605357);
        setIntField(term1088, term1088.getClass(), "type", 808203320);
        setIntField(term1090, term1090.getClass(), "type", -544382127);
        setIntField(term1092, term1092.getClass(), "type", -1830198043);
        setIntField(term1094, term1094.getClass(), "type", -439048495);
        setField(term1094, term1094.getClass(), "next", null);
        setField(term1094, term1094.getClass(), "first", null);
        setField(term1094, term1094.getClass(), "last", null);
        setField(term1094, term1094.getClass(), "propListHead", null);
        setIntField(term1094, term1094.getClass(), "sourcePosition", 0);
        setField(term1094, term1094.getClass(), "jsType", null);
        setField(term1094, term1094.getClass(), "parent", null);
        setField(term1092, term1092.getClass(), "next", term1094);
        setIntField(term1097, term1097.getClass(), "type", -1849105286);
        setField(term1097, term1097.getClass(), "next", null);
        setField(term1097, term1097.getClass(), "first", null);
        setField(term1097, term1097.getClass(), "last", term1094);
        setField(term1097, term1097.getClass(), "propListHead", null);
        setIntField(term1097, term1097.getClass(), "sourcePosition", 0);
        setField(term1097, term1097.getClass(), "jsType", null);
        setField(term1097, term1097.getClass(), "parent", null);
        setField(term1092, term1092.getClass(), "first", term1097);
        setField(term1092, term1092.getClass(), "last", term1090);
        setField(term1092, term1092.getClass(), "propListHead", null);
        setIntField(term1092, term1092.getClass(), "sourcePosition", 0);
        setField(term1092, term1092.getClass(), "jsType", null);
        setField(term1092, term1092.getClass(), "parent", null);
        setField(term1090, term1090.getClass(), "next", term1092);
        setField(term1090, term1090.getClass(), "first", term1094);
        setIntField(term1101, term1101.getClass(), "type", 917513193);
        setIntField(term1103, term1103.getClass(), "type", 787278105);
        setField(term1103, term1103.getClass(), "next", null);
        setField(term1103, term1103.getClass(), "first", term1097);
        setField(term1103, term1103.getClass(), "last", term1092);
        setField(term1103, term1103.getClass(), "propListHead", null);
        setIntField(term1103, term1103.getClass(), "sourcePosition", 0);
        setField(term1103, term1103.getClass(), "jsType", null);
        setField(term1103, term1103.getClass(), "parent", null);
        setField(term1101, term1101.getClass(), "next", term1103);
        setField(term1101, term1101.getClass(), "first", term1088);
        setField(term1101, term1101.getClass(), "last", term1088);
        setField(term1101, term1101.getClass(), "propListHead", null);
        setIntField(term1101, term1101.getClass(), "sourcePosition", 0);
        setField(term1101, term1101.getClass(), "jsType", null);
        setField(term1101, term1101.getClass(), "parent", null);
        setField(term1090, term1090.getClass(), "last", term1101);
        setField(term1090, term1090.getClass(), "propListHead", null);
        setIntField(term1090, term1090.getClass(), "sourcePosition", 0);
        setField(term1090, term1090.getClass(), "jsType", null);
        setField(term1090, term1090.getClass(), "parent", null);
        setField(term1088, term1088.getClass(), "next", term1090);
        setIntField(term1108, term1108.getClass(), "type", -2063843486);
        setField(term1108, term1108.getClass(), "next", term1101);
        setField(term1108, term1108.getClass(), "first", term1103);
        setField(term1108, term1108.getClass(), "last", term1086);
        setField(term1108, term1108.getClass(), "propListHead", null);
        setIntField(term1108, term1108.getClass(), "sourcePosition", 0);
        setField(term1108, term1108.getClass(), "jsType", null);
        setField(term1108, term1108.getClass(), "parent", null);
        setField(term1088, term1088.getClass(), "first", term1108);
        setField(term1088, term1088.getClass(), "last", term1108);
        setField(term1088, term1088.getClass(), "propListHead", null);
        setIntField(term1088, term1088.getClass(), "sourcePosition", 0);
        setField(term1088, term1088.getClass(), "jsType", null);
        setField(term1088, term1088.getClass(), "parent", null);
        setField(term1086, term1086.getClass(), "next", term1088);
        setField(term1086, term1086.getClass(), "first", term1092);
        setField(term1086, term1086.getClass(), "last", term1094);
        setField(term1086, term1086.getClass(), "propListHead", null);
        setIntField(term1086, term1086.getClass(), "sourcePosition", 0);
        setField(term1086, term1086.getClass(), "jsType", null);
        setField(term1086, term1086.getClass(), "parent", null);
        term1113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1113, term1113.getClass(), "type", 833762980);
        setIntField(term1115, term1115.getClass(), "type", 320711637);
        setIntField(term1117, term1117.getClass(), "type", 1241164745);
        setIntField(term1119, term1119.getClass(), "type", 1723148410);
        setIntField(term1121, term1121.getClass(), "type", -920797484);
        setField(term1121, term1121.getClass(), "next", null);
        setField(term1121, term1121.getClass(), "first", null);
        setField(term1121, term1121.getClass(), "last", null);
        setField(term1121, term1121.getClass(), "propListHead", null);
        setIntField(term1121, term1121.getClass(), "sourcePosition", 0);
        setField(term1121, term1121.getClass(), "jsType", null);
        setField(term1121, term1121.getClass(), "parent", null);
        setField(term1119, term1119.getClass(), "next", term1121);
        setIntField(term1124, term1124.getClass(), "type", -1631697577);
        setField(term1124, term1124.getClass(), "next", null);
        setField(term1124, term1124.getClass(), "first", null);
        setField(term1124, term1124.getClass(), "last", term1121);
        setField(term1124, term1124.getClass(), "propListHead", null);
        setIntField(term1124, term1124.getClass(), "sourcePosition", 0);
        setField(term1124, term1124.getClass(), "jsType", null);
        setField(term1124, term1124.getClass(), "parent", null);
        setField(term1119, term1119.getClass(), "first", term1124);
        setField(term1119, term1119.getClass(), "last", term1117);
        setField(term1119, term1119.getClass(), "propListHead", null);
        setIntField(term1119, term1119.getClass(), "sourcePosition", 0);
        setField(term1119, term1119.getClass(), "jsType", null);
        setField(term1119, term1119.getClass(), "parent", null);
        setField(term1117, term1117.getClass(), "next", term1119);
        setField(term1117, term1117.getClass(), "first", term1121);
        setIntField(term1128, term1128.getClass(), "type", -1703035419);
        setIntField(term1130, term1130.getClass(), "type", 765766290);
        setField(term1130, term1130.getClass(), "next", null);
        setField(term1130, term1130.getClass(), "first", term1124);
        setField(term1130, term1130.getClass(), "last", term1119);
        setField(term1130, term1130.getClass(), "propListHead", null);
        setIntField(term1130, term1130.getClass(), "sourcePosition", 0);
        setField(term1130, term1130.getClass(), "jsType", null);
        setField(term1130, term1130.getClass(), "parent", null);
        setField(term1128, term1128.getClass(), "next", term1130);
        setField(term1128, term1128.getClass(), "first", term1115);
        setField(term1128, term1128.getClass(), "last", term1115);
        setField(term1128, term1128.getClass(), "propListHead", null);
        setIntField(term1128, term1128.getClass(), "sourcePosition", 0);
        setField(term1128, term1128.getClass(), "jsType", null);
        setField(term1128, term1128.getClass(), "parent", null);
        setField(term1117, term1117.getClass(), "last", term1128);
        setField(term1117, term1117.getClass(), "propListHead", null);
        setIntField(term1117, term1117.getClass(), "sourcePosition", 0);
        setField(term1117, term1117.getClass(), "jsType", null);
        setField(term1117, term1117.getClass(), "parent", null);
        setField(term1115, term1115.getClass(), "next", term1117);
        setIntField(term1135, term1135.getClass(), "type", -1284825282);
        setField(term1135, term1135.getClass(), "next", term1128);
        setField(term1135, term1135.getClass(), "first", term1130);
        setField(term1135, term1135.getClass(), "last", term1113);
        setField(term1135, term1135.getClass(), "propListHead", null);
        setIntField(term1135, term1135.getClass(), "sourcePosition", 0);
        setField(term1135, term1135.getClass(), "jsType", null);
        setField(term1135, term1135.getClass(), "parent", null);
        setField(term1115, term1115.getClass(), "first", term1135);
        setField(term1115, term1115.getClass(), "last", term1135);
        setField(term1115, term1115.getClass(), "propListHead", null);
        setIntField(term1115, term1115.getClass(), "sourcePosition", 0);
        setField(term1115, term1115.getClass(), "jsType", null);
        setField(term1115, term1115.getClass(), "parent", null);
        setField(term1113, term1113.getClass(), "next", term1115);
        setField(term1113, term1113.getClass(), "first", term1119);
        setField(term1113, term1113.getClass(), "last", term1121);
        setField(term1113, term1113.getClass(), "propListHead", null);
        setIntField(term1113, term1113.getClass(), "sourcePosition", 0);
        setField(term1113, term1113.getClass(), "jsType", null);
        setField(term1113, term1113.getClass(), "parent", null);
        term1140 = new Integer(-1941343035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1086;
        args[1] = term1113;
        args[2] = term1140;
        try {
            callMethod(klass, "maybeReplaceChildWithNumber", argTypes, term1083, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


