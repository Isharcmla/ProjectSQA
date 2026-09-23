package com.google.javascript.rhino;

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
import java.lang.IllegalArgumentException;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_addChildToFront_1809724966237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1083;
     Object term1110;

    public Node_addChildToFront_1809724966237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1083, term1083.getClass(), "type", 1146601902);
        setIntField(term1085, term1085.getClass(), "type", -1938881385);
        setIntField(term1087, term1087.getClass(), "type", -1629418973);
        setIntField(term1089, term1089.getClass(), "type", -100825168);
        setIntField(term1091, term1091.getClass(), "type", 768407648);
        setField(term1091, term1091.getClass(), "next", null);
        setField(term1091, term1091.getClass(), "first", null);
        setField(term1091, term1091.getClass(), "last", null);
        setField(term1091, term1091.getClass(), "propListHead", null);
        setIntField(term1091, term1091.getClass(), "sourcePosition", 0);
        setField(term1091, term1091.getClass(), "jsType", null);
        setField(term1091, term1091.getClass(), "parent", null);
        setField(term1089, term1089.getClass(), "next", term1091);
        setIntField(term1094, term1094.getClass(), "type", -350454594);
        setField(term1094, term1094.getClass(), "next", null);
        setField(term1094, term1094.getClass(), "first", null);
        setField(term1094, term1094.getClass(), "last", term1091);
        setField(term1094, term1094.getClass(), "propListHead", null);
        setIntField(term1094, term1094.getClass(), "sourcePosition", 0);
        setField(term1094, term1094.getClass(), "jsType", null);
        setField(term1094, term1094.getClass(), "parent", null);
        setField(term1089, term1089.getClass(), "first", term1094);
        setField(term1089, term1089.getClass(), "last", term1087);
        setField(term1089, term1089.getClass(), "propListHead", null);
        setIntField(term1089, term1089.getClass(), "sourcePosition", 0);
        setField(term1089, term1089.getClass(), "jsType", null);
        setField(term1089, term1089.getClass(), "parent", null);
        setField(term1087, term1087.getClass(), "next", term1089);
        setField(term1087, term1087.getClass(), "first", term1091);
        setIntField(term1098, term1098.getClass(), "type", -233024044);
        setIntField(term1100, term1100.getClass(), "type", 1820784228);
        setField(term1100, term1100.getClass(), "next", null);
        setField(term1100, term1100.getClass(), "first", term1094);
        setField(term1100, term1100.getClass(), "last", term1089);
        setField(term1100, term1100.getClass(), "propListHead", null);
        setIntField(term1100, term1100.getClass(), "sourcePosition", 0);
        setField(term1100, term1100.getClass(), "jsType", null);
        setField(term1100, term1100.getClass(), "parent", null);
        setField(term1098, term1098.getClass(), "next", term1100);
        setField(term1098, term1098.getClass(), "first", term1085);
        setField(term1098, term1098.getClass(), "last", term1085);
        setField(term1098, term1098.getClass(), "propListHead", null);
        setIntField(term1098, term1098.getClass(), "sourcePosition", 0);
        setField(term1098, term1098.getClass(), "jsType", null);
        setField(term1098, term1098.getClass(), "parent", null);
        setField(term1087, term1087.getClass(), "last", term1098);
        setField(term1087, term1087.getClass(), "propListHead", null);
        setIntField(term1087, term1087.getClass(), "sourcePosition", 0);
        setField(term1087, term1087.getClass(), "jsType", null);
        setField(term1087, term1087.getClass(), "parent", null);
        setField(term1085, term1085.getClass(), "next", term1087);
        setIntField(term1105, term1105.getClass(), "type", 1390820006);
        setField(term1105, term1105.getClass(), "next", term1098);
        setField(term1105, term1105.getClass(), "first", term1100);
        setField(term1105, term1105.getClass(), "last", term1083);
        setField(term1105, term1105.getClass(), "propListHead", null);
        setIntField(term1105, term1105.getClass(), "sourcePosition", 0);
        setField(term1105, term1105.getClass(), "jsType", null);
        setField(term1105, term1105.getClass(), "parent", null);
        setField(term1085, term1085.getClass(), "first", term1105);
        setField(term1085, term1085.getClass(), "last", term1105);
        setField(term1085, term1085.getClass(), "propListHead", null);
        setIntField(term1085, term1085.getClass(), "sourcePosition", 0);
        setField(term1085, term1085.getClass(), "jsType", null);
        setField(term1085, term1085.getClass(), "parent", null);
        setField(term1083, term1083.getClass(), "next", term1085);
        setField(term1083, term1083.getClass(), "first", term1089);
        setField(term1083, term1083.getClass(), "last", term1091);
        setField(term1083, term1083.getClass(), "propListHead", null);
        setIntField(term1083, term1083.getClass(), "sourcePosition", 0);
        setField(term1083, term1083.getClass(), "jsType", null);
        setField(term1083, term1083.getClass(), "parent", null);
        term1110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1110, term1110.getClass(), "type", -828982065);
        setIntField(term1112, term1112.getClass(), "type", 1221443226);
        setIntField(term1114, term1114.getClass(), "type", 908108726);
        setIntField(term1116, term1116.getClass(), "type", 1023209512);
        setIntField(term1118, term1118.getClass(), "type", 1084849225);
        setField(term1118, term1118.getClass(), "next", null);
        setField(term1118, term1118.getClass(), "first", null);
        setField(term1118, term1118.getClass(), "last", null);
        setField(term1118, term1118.getClass(), "propListHead", null);
        setIntField(term1118, term1118.getClass(), "sourcePosition", 0);
        setField(term1118, term1118.getClass(), "jsType", null);
        setField(term1118, term1118.getClass(), "parent", null);
        setField(term1116, term1116.getClass(), "next", term1118);
        setIntField(term1121, term1121.getClass(), "type", -1702055571);
        setField(term1121, term1121.getClass(), "next", null);
        setField(term1121, term1121.getClass(), "first", null);
        setField(term1121, term1121.getClass(), "last", term1118);
        setField(term1121, term1121.getClass(), "propListHead", null);
        setIntField(term1121, term1121.getClass(), "sourcePosition", 0);
        setField(term1121, term1121.getClass(), "jsType", null);
        setField(term1121, term1121.getClass(), "parent", null);
        setField(term1116, term1116.getClass(), "first", term1121);
        setField(term1116, term1116.getClass(), "last", term1114);
        setField(term1116, term1116.getClass(), "propListHead", null);
        setIntField(term1116, term1116.getClass(), "sourcePosition", 0);
        setField(term1116, term1116.getClass(), "jsType", null);
        setField(term1116, term1116.getClass(), "parent", null);
        setField(term1114, term1114.getClass(), "next", term1116);
        setField(term1114, term1114.getClass(), "first", term1118);
        setIntField(term1125, term1125.getClass(), "type", 2063762142);
        setIntField(term1127, term1127.getClass(), "type", 1658391716);
        setField(term1127, term1127.getClass(), "next", null);
        setField(term1127, term1127.getClass(), "first", term1121);
        setField(term1127, term1127.getClass(), "last", term1116);
        setField(term1127, term1127.getClass(), "propListHead", null);
        setIntField(term1127, term1127.getClass(), "sourcePosition", 0);
        setField(term1127, term1127.getClass(), "jsType", null);
        setField(term1127, term1127.getClass(), "parent", null);
        setField(term1125, term1125.getClass(), "next", term1127);
        setField(term1125, term1125.getClass(), "first", term1112);
        setField(term1125, term1125.getClass(), "last", term1112);
        setField(term1125, term1125.getClass(), "propListHead", null);
        setIntField(term1125, term1125.getClass(), "sourcePosition", 0);
        setField(term1125, term1125.getClass(), "jsType", null);
        setField(term1125, term1125.getClass(), "parent", null);
        setField(term1114, term1114.getClass(), "last", term1125);
        setField(term1114, term1114.getClass(), "propListHead", null);
        setIntField(term1114, term1114.getClass(), "sourcePosition", 0);
        setField(term1114, term1114.getClass(), "jsType", null);
        setField(term1114, term1114.getClass(), "parent", null);
        setField(term1112, term1112.getClass(), "next", term1114);
        setIntField(term1132, term1132.getClass(), "type", 2143282300);
        setField(term1132, term1132.getClass(), "next", term1125);
        setField(term1132, term1132.getClass(), "first", term1127);
        setField(term1132, term1132.getClass(), "last", term1110);
        setField(term1132, term1132.getClass(), "propListHead", null);
        setIntField(term1132, term1132.getClass(), "sourcePosition", 0);
        setField(term1132, term1132.getClass(), "jsType", null);
        setField(term1132, term1132.getClass(), "parent", null);
        setField(term1112, term1112.getClass(), "first", term1132);
        setField(term1112, term1112.getClass(), "last", term1132);
        setField(term1112, term1112.getClass(), "propListHead", null);
        setIntField(term1112, term1112.getClass(), "sourcePosition", 0);
        setField(term1112, term1112.getClass(), "jsType", null);
        setField(term1112, term1112.getClass(), "parent", null);
        setField(term1110, term1110.getClass(), "next", term1112);
        setField(term1110, term1110.getClass(), "first", term1116);
        setField(term1110, term1110.getClass(), "last", term1118);
        setField(term1110, term1110.getClass(), "propListHead", null);
        setIntField(term1110, term1110.getClass(), "sourcePosition", 0);
        setField(term1110, term1110.getClass(), "jsType", null);
        setField(term1110, term1110.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1110;
        try {
            callMethod(klass, "addChildToFront", argTypes, term1083, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


