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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_catchNode_1739614485101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1159;
     Object term1186;

    public IR_catchNode_1739614485101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1159, term1159.getClass(), "type", 1496340209);
        setIntField(term1161, term1161.getClass(), "type", -1748391876);
        setIntField(term1163, term1163.getClass(), "type", 43258317);
        setIntField(term1165, term1165.getClass(), "type", 1707220033);
        setIntField(term1167, term1167.getClass(), "type", -1792504217);
        setField(term1167, term1167.getClass(), "next", null);
        setField(term1167, term1167.getClass(), "first", null);
        setField(term1167, term1167.getClass(), "last", null);
        setField(term1167, term1167.getClass(), "propListHead", null);
        setIntField(term1167, term1167.getClass(), "sourcePosition", 0);
        setField(term1167, term1167.getClass(), "jsType", null);
        setField(term1167, term1167.getClass(), "parent", null);
        setField(term1165, term1165.getClass(), "next", term1167);
        setIntField(term1170, term1170.getClass(), "type", 1824538861);
        setField(term1170, term1170.getClass(), "next", null);
        setField(term1170, term1170.getClass(), "first", null);
        setField(term1170, term1170.getClass(), "last", term1167);
        setField(term1170, term1170.getClass(), "propListHead", null);
        setIntField(term1170, term1170.getClass(), "sourcePosition", 0);
        setField(term1170, term1170.getClass(), "jsType", null);
        setField(term1170, term1170.getClass(), "parent", null);
        setField(term1165, term1165.getClass(), "first", term1170);
        setField(term1165, term1165.getClass(), "last", term1163);
        setField(term1165, term1165.getClass(), "propListHead", null);
        setIntField(term1165, term1165.getClass(), "sourcePosition", 0);
        setField(term1165, term1165.getClass(), "jsType", null);
        setField(term1165, term1165.getClass(), "parent", null);
        setField(term1163, term1163.getClass(), "next", term1165);
        setField(term1163, term1163.getClass(), "first", term1167);
        setIntField(term1174, term1174.getClass(), "type", 1501165033);
        setIntField(term1176, term1176.getClass(), "type", 510162332);
        setField(term1176, term1176.getClass(), "next", null);
        setField(term1176, term1176.getClass(), "first", term1170);
        setField(term1176, term1176.getClass(), "last", term1165);
        setField(term1176, term1176.getClass(), "propListHead", null);
        setIntField(term1176, term1176.getClass(), "sourcePosition", 0);
        setField(term1176, term1176.getClass(), "jsType", null);
        setField(term1176, term1176.getClass(), "parent", null);
        setField(term1174, term1174.getClass(), "next", term1176);
        setField(term1174, term1174.getClass(), "first", term1161);
        setField(term1174, term1174.getClass(), "last", term1161);
        setField(term1174, term1174.getClass(), "propListHead", null);
        setIntField(term1174, term1174.getClass(), "sourcePosition", 0);
        setField(term1174, term1174.getClass(), "jsType", null);
        setField(term1174, term1174.getClass(), "parent", null);
        setField(term1163, term1163.getClass(), "last", term1174);
        setField(term1163, term1163.getClass(), "propListHead", null);
        setIntField(term1163, term1163.getClass(), "sourcePosition", 0);
        setField(term1163, term1163.getClass(), "jsType", null);
        setField(term1163, term1163.getClass(), "parent", null);
        setField(term1161, term1161.getClass(), "next", term1163);
        setIntField(term1181, term1181.getClass(), "type", 888506903);
        setField(term1181, term1181.getClass(), "next", term1174);
        setField(term1181, term1181.getClass(), "first", term1176);
        setField(term1181, term1181.getClass(), "last", term1159);
        setField(term1181, term1181.getClass(), "propListHead", null);
        setIntField(term1181, term1181.getClass(), "sourcePosition", 0);
        setField(term1181, term1181.getClass(), "jsType", null);
        setField(term1181, term1181.getClass(), "parent", null);
        setField(term1161, term1161.getClass(), "first", term1181);
        setField(term1161, term1161.getClass(), "last", term1181);
        setField(term1161, term1161.getClass(), "propListHead", null);
        setIntField(term1161, term1161.getClass(), "sourcePosition", 0);
        setField(term1161, term1161.getClass(), "jsType", null);
        setField(term1161, term1161.getClass(), "parent", null);
        setField(term1159, term1159.getClass(), "next", term1161);
        setField(term1159, term1159.getClass(), "first", term1165);
        setField(term1159, term1159.getClass(), "last", term1167);
        setField(term1159, term1159.getClass(), "propListHead", null);
        setIntField(term1159, term1159.getClass(), "sourcePosition", 0);
        setField(term1159, term1159.getClass(), "jsType", null);
        setField(term1159, term1159.getClass(), "parent", null);
        term1186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1186, term1186.getClass(), "type", 200252898);
        setIntField(term1188, term1188.getClass(), "type", -1831826725);
        setIntField(term1190, term1190.getClass(), "type", 752152965);
        setIntField(term1192, term1192.getClass(), "type", -1577069773);
        setIntField(term1194, term1194.getClass(), "type", -266625190);
        setField(term1194, term1194.getClass(), "next", null);
        setField(term1194, term1194.getClass(), "first", null);
        setField(term1194, term1194.getClass(), "last", null);
        setField(term1194, term1194.getClass(), "propListHead", null);
        setIntField(term1194, term1194.getClass(), "sourcePosition", 0);
        setField(term1194, term1194.getClass(), "jsType", null);
        setField(term1194, term1194.getClass(), "parent", null);
        setField(term1192, term1192.getClass(), "next", term1194);
        setIntField(term1197, term1197.getClass(), "type", 489201218);
        setField(term1197, term1197.getClass(), "next", null);
        setField(term1197, term1197.getClass(), "first", null);
        setField(term1197, term1197.getClass(), "last", term1194);
        setField(term1197, term1197.getClass(), "propListHead", null);
        setIntField(term1197, term1197.getClass(), "sourcePosition", 0);
        setField(term1197, term1197.getClass(), "jsType", null);
        setField(term1197, term1197.getClass(), "parent", null);
        setField(term1192, term1192.getClass(), "first", term1197);
        setField(term1192, term1192.getClass(), "last", term1190);
        setField(term1192, term1192.getClass(), "propListHead", null);
        setIntField(term1192, term1192.getClass(), "sourcePosition", 0);
        setField(term1192, term1192.getClass(), "jsType", null);
        setField(term1192, term1192.getClass(), "parent", null);
        setField(term1190, term1190.getClass(), "next", term1192);
        setField(term1190, term1190.getClass(), "first", term1194);
        setIntField(term1201, term1201.getClass(), "type", -1455526612);
        setIntField(term1203, term1203.getClass(), "type", -941356098);
        setField(term1203, term1203.getClass(), "next", null);
        setField(term1203, term1203.getClass(), "first", term1197);
        setField(term1203, term1203.getClass(), "last", term1192);
        setField(term1203, term1203.getClass(), "propListHead", null);
        setIntField(term1203, term1203.getClass(), "sourcePosition", 0);
        setField(term1203, term1203.getClass(), "jsType", null);
        setField(term1203, term1203.getClass(), "parent", null);
        setField(term1201, term1201.getClass(), "next", term1203);
        setField(term1201, term1201.getClass(), "first", term1188);
        setField(term1201, term1201.getClass(), "last", term1188);
        setField(term1201, term1201.getClass(), "propListHead", null);
        setIntField(term1201, term1201.getClass(), "sourcePosition", 0);
        setField(term1201, term1201.getClass(), "jsType", null);
        setField(term1201, term1201.getClass(), "parent", null);
        setField(term1190, term1190.getClass(), "last", term1201);
        setField(term1190, term1190.getClass(), "propListHead", null);
        setIntField(term1190, term1190.getClass(), "sourcePosition", 0);
        setField(term1190, term1190.getClass(), "jsType", null);
        setField(term1190, term1190.getClass(), "parent", null);
        setField(term1188, term1188.getClass(), "next", term1190);
        setIntField(term1208, term1208.getClass(), "type", -201517446);
        setField(term1208, term1208.getClass(), "next", term1201);
        setField(term1208, term1208.getClass(), "first", term1203);
        setField(term1208, term1208.getClass(), "last", term1186);
        setField(term1208, term1208.getClass(), "propListHead", null);
        setIntField(term1208, term1208.getClass(), "sourcePosition", 0);
        setField(term1208, term1208.getClass(), "jsType", null);
        setField(term1208, term1208.getClass(), "parent", null);
        setField(term1188, term1188.getClass(), "first", term1208);
        setField(term1188, term1188.getClass(), "last", term1208);
        setField(term1188, term1188.getClass(), "propListHead", null);
        setIntField(term1188, term1188.getClass(), "sourcePosition", 0);
        setField(term1188, term1188.getClass(), "jsType", null);
        setField(term1188, term1188.getClass(), "parent", null);
        setField(term1186, term1186.getClass(), "next", term1188);
        setField(term1186, term1186.getClass(), "first", term1192);
        setField(term1186, term1186.getClass(), "last", term1194);
        setField(term1186, term1186.getClass(), "propListHead", null);
        setIntField(term1186, term1186.getClass(), "sourcePosition", 0);
        setField(term1186, term1186.getClass(), "jsType", null);
        setField(term1186, term1186.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1159;
        args[1] = term1186;
        try {
            callMethod(klass, "catchNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


