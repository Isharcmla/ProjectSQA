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

public class Node_addChildToBack_1431671620238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1137;
     Object term1164;

    public Node_addChildToBack_1431671620238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1137, term1137.getClass(), "type", 1137624258);
        setIntField(term1139, term1139.getClass(), "type", 977862393);
        setIntField(term1141, term1141.getClass(), "type", 301401782);
        setIntField(term1143, term1143.getClass(), "type", 1988605357);
        setIntField(term1145, term1145.getClass(), "type", 808203320);
        setField(term1145, term1145.getClass(), "next", null);
        setField(term1145, term1145.getClass(), "first", null);
        setField(term1145, term1145.getClass(), "last", null);
        setField(term1145, term1145.getClass(), "propListHead", null);
        setIntField(term1145, term1145.getClass(), "sourcePosition", 0);
        setField(term1145, term1145.getClass(), "jsType", null);
        setField(term1145, term1145.getClass(), "parent", null);
        setField(term1143, term1143.getClass(), "next", term1145);
        setIntField(term1148, term1148.getClass(), "type", -544382127);
        setField(term1148, term1148.getClass(), "next", null);
        setField(term1148, term1148.getClass(), "first", null);
        setField(term1148, term1148.getClass(), "last", term1145);
        setField(term1148, term1148.getClass(), "propListHead", null);
        setIntField(term1148, term1148.getClass(), "sourcePosition", 0);
        setField(term1148, term1148.getClass(), "jsType", null);
        setField(term1148, term1148.getClass(), "parent", null);
        setField(term1143, term1143.getClass(), "first", term1148);
        setField(term1143, term1143.getClass(), "last", term1141);
        setField(term1143, term1143.getClass(), "propListHead", null);
        setIntField(term1143, term1143.getClass(), "sourcePosition", 0);
        setField(term1143, term1143.getClass(), "jsType", null);
        setField(term1143, term1143.getClass(), "parent", null);
        setField(term1141, term1141.getClass(), "next", term1143);
        setField(term1141, term1141.getClass(), "first", term1145);
        setIntField(term1152, term1152.getClass(), "type", -439048495);
        setIntField(term1154, term1154.getClass(), "type", -1849105286);
        setField(term1154, term1154.getClass(), "next", null);
        setField(term1154, term1154.getClass(), "first", term1148);
        setField(term1154, term1154.getClass(), "last", term1143);
        setField(term1154, term1154.getClass(), "propListHead", null);
        setIntField(term1154, term1154.getClass(), "sourcePosition", 0);
        setField(term1154, term1154.getClass(), "jsType", null);
        setField(term1154, term1154.getClass(), "parent", null);
        setField(term1152, term1152.getClass(), "next", term1154);
        setField(term1152, term1152.getClass(), "first", term1139);
        setField(term1152, term1152.getClass(), "last", term1139);
        setField(term1152, term1152.getClass(), "propListHead", null);
        setIntField(term1152, term1152.getClass(), "sourcePosition", 0);
        setField(term1152, term1152.getClass(), "jsType", null);
        setField(term1152, term1152.getClass(), "parent", null);
        setField(term1141, term1141.getClass(), "last", term1152);
        setField(term1141, term1141.getClass(), "propListHead", null);
        setIntField(term1141, term1141.getClass(), "sourcePosition", 0);
        setField(term1141, term1141.getClass(), "jsType", null);
        setField(term1141, term1141.getClass(), "parent", null);
        setField(term1139, term1139.getClass(), "next", term1141);
        setIntField(term1159, term1159.getClass(), "type", 1334483645);
        setField(term1159, term1159.getClass(), "next", term1152);
        setField(term1159, term1159.getClass(), "first", term1154);
        setField(term1159, term1159.getClass(), "last", term1137);
        setField(term1159, term1159.getClass(), "propListHead", null);
        setIntField(term1159, term1159.getClass(), "sourcePosition", 0);
        setField(term1159, term1159.getClass(), "jsType", null);
        setField(term1159, term1159.getClass(), "parent", null);
        setField(term1139, term1139.getClass(), "first", term1159);
        setField(term1139, term1139.getClass(), "last", term1159);
        setField(term1139, term1139.getClass(), "propListHead", null);
        setIntField(term1139, term1139.getClass(), "sourcePosition", 0);
        setField(term1139, term1139.getClass(), "jsType", null);
        setField(term1139, term1139.getClass(), "parent", null);
        setField(term1137, term1137.getClass(), "next", term1139);
        setField(term1137, term1137.getClass(), "first", term1143);
        setField(term1137, term1137.getClass(), "last", term1145);
        setField(term1137, term1137.getClass(), "propListHead", null);
        setIntField(term1137, term1137.getClass(), "sourcePosition", 0);
        setField(term1137, term1137.getClass(), "jsType", null);
        setField(term1137, term1137.getClass(), "parent", null);
        term1164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1164, term1164.getClass(), "type", 917513193);
        setIntField(term1166, term1166.getClass(), "type", 787278105);
        setIntField(term1168, term1168.getClass(), "type", -2063843486);
        setIntField(term1170, term1170.getClass(), "type", 833762980);
        setIntField(term1172, term1172.getClass(), "type", 320711637);
        setField(term1172, term1172.getClass(), "next", null);
        setField(term1172, term1172.getClass(), "first", null);
        setField(term1172, term1172.getClass(), "last", null);
        setField(term1172, term1172.getClass(), "propListHead", null);
        setIntField(term1172, term1172.getClass(), "sourcePosition", 0);
        setField(term1172, term1172.getClass(), "jsType", null);
        setField(term1172, term1172.getClass(), "parent", null);
        setField(term1170, term1170.getClass(), "next", term1172);
        setIntField(term1175, term1175.getClass(), "type", 1241164745);
        setField(term1175, term1175.getClass(), "next", null);
        setField(term1175, term1175.getClass(), "first", null);
        setField(term1175, term1175.getClass(), "last", term1172);
        setField(term1175, term1175.getClass(), "propListHead", null);
        setIntField(term1175, term1175.getClass(), "sourcePosition", 0);
        setField(term1175, term1175.getClass(), "jsType", null);
        setField(term1175, term1175.getClass(), "parent", null);
        setField(term1170, term1170.getClass(), "first", term1175);
        setField(term1170, term1170.getClass(), "last", term1168);
        setField(term1170, term1170.getClass(), "propListHead", null);
        setIntField(term1170, term1170.getClass(), "sourcePosition", 0);
        setField(term1170, term1170.getClass(), "jsType", null);
        setField(term1170, term1170.getClass(), "parent", null);
        setField(term1168, term1168.getClass(), "next", term1170);
        setField(term1168, term1168.getClass(), "first", term1172);
        setIntField(term1179, term1179.getClass(), "type", -920797484);
        setIntField(term1181, term1181.getClass(), "type", -1631697577);
        setField(term1181, term1181.getClass(), "next", null);
        setField(term1181, term1181.getClass(), "first", term1175);
        setField(term1181, term1181.getClass(), "last", term1170);
        setField(term1181, term1181.getClass(), "propListHead", null);
        setIntField(term1181, term1181.getClass(), "sourcePosition", 0);
        setField(term1181, term1181.getClass(), "jsType", null);
        setField(term1181, term1181.getClass(), "parent", null);
        setField(term1179, term1179.getClass(), "next", term1181);
        setField(term1179, term1179.getClass(), "first", term1166);
        setField(term1179, term1179.getClass(), "last", term1166);
        setField(term1179, term1179.getClass(), "propListHead", null);
        setIntField(term1179, term1179.getClass(), "sourcePosition", 0);
        setField(term1179, term1179.getClass(), "jsType", null);
        setField(term1179, term1179.getClass(), "parent", null);
        setField(term1168, term1168.getClass(), "last", term1179);
        setField(term1168, term1168.getClass(), "propListHead", null);
        setIntField(term1168, term1168.getClass(), "sourcePosition", 0);
        setField(term1168, term1168.getClass(), "jsType", null);
        setField(term1168, term1168.getClass(), "parent", null);
        setField(term1166, term1166.getClass(), "next", term1168);
        setIntField(term1186, term1186.getClass(), "type", 765731371);
        setField(term1186, term1186.getClass(), "next", term1179);
        setField(term1186, term1186.getClass(), "first", term1181);
        setField(term1186, term1186.getClass(), "last", term1164);
        setField(term1186, term1186.getClass(), "propListHead", null);
        setIntField(term1186, term1186.getClass(), "sourcePosition", 0);
        setField(term1186, term1186.getClass(), "jsType", null);
        setField(term1186, term1186.getClass(), "parent", null);
        setField(term1166, term1166.getClass(), "first", term1186);
        setField(term1166, term1166.getClass(), "last", term1186);
        setField(term1166, term1166.getClass(), "propListHead", null);
        setIntField(term1166, term1166.getClass(), "sourcePosition", 0);
        setField(term1166, term1166.getClass(), "jsType", null);
        setField(term1166, term1166.getClass(), "parent", null);
        setField(term1164, term1164.getClass(), "next", term1166);
        setField(term1164, term1164.getClass(), "first", term1170);
        setField(term1164, term1164.getClass(), "last", term1172);
        setField(term1164, term1164.getClass(), "propListHead", null);
        setIntField(term1164, term1164.getClass(), "sourcePosition", 0);
        setField(term1164, term1164.getClass(), "jsType", null);
        setField(term1164, term1164.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1164;
        try {
            callMethod(klass, "addChildToBack", argTypes, term1137, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


