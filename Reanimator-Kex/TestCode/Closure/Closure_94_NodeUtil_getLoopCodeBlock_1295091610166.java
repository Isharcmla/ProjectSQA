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

public class NodeUtil_getLoopCodeBlock_1295091610166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1221;
     Object term9340;

    public NodeUtil_getLoopCodeBlock_1295091610166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1234 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1244 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1221, term1221.getClass(), "type", -695279311);
        setIntField(term1223, term1223.getClass(), "type", 1862841859);
        setIntField(term1225, term1225.getClass(), "type", 0);
        setField(term1225, term1225.getClass(), "next", null);
        setField(term1225, term1225.getClass(), "first", null);
        setField(term1225, term1225.getClass(), "last", null);
        setField(term1225, term1225.getClass(), "propListHead", null);
        setIntField(term1225, term1225.getClass(), "sourcePosition", 0);
        setField(term1225, term1225.getClass(), "jsType", null);
        setField(term1225, term1225.getClass(), "parent", null);
        setField(term1223, term1223.getClass(), "next", term1225);
        setIntField(term1228, term1228.getClass(), "type", 0);
        setField(term1228, term1228.getClass(), "next", null);
        setField(term1228, term1228.getClass(), "first", null);
        setField(term1228, term1228.getClass(), "last", null);
        setField(term1228, term1228.getClass(), "propListHead", null);
        setIntField(term1228, term1228.getClass(), "sourcePosition", 0);
        setField(term1228, term1228.getClass(), "jsType", null);
        setField(term1228, term1228.getClass(), "parent", null);
        setField(term1223, term1223.getClass(), "first", term1228);
        setIntField(term1231, term1231.getClass(), "type", 0);
        setField(term1231, term1231.getClass(), "next", null);
        setField(term1231, term1231.getClass(), "first", null);
        setField(term1231, term1231.getClass(), "last", null);
        setField(term1231, term1231.getClass(), "propListHead", null);
        setIntField(term1231, term1231.getClass(), "sourcePosition", 0);
        setField(term1231, term1231.getClass(), "jsType", null);
        setField(term1231, term1231.getClass(), "parent", null);
        setField(term1223, term1223.getClass(), "last", term1231);
        setField(term1234, term1234.getClass(), "next", null);
        setIntField(term1234, term1234.getClass(), "type", 0);
        setIntField(term1234, term1234.getClass(), "intValue", 0);
        setField(term1234, term1234.getClass(), "objectValue", null);
        setField(term1223, term1223.getClass(), "propListHead", term1234);
        setIntField(term1223, term1223.getClass(), "sourcePosition", 1713573821);
        setField(term1223, term1223.getClass(), "jsType", null);
        setField(term1223, term1223.getClass(), "parent", null);
        setField(term1221, term1221.getClass(), "next", term1223);
        setIntField(term1238, term1238.getClass(), "type", 0);
        setField(term1238, term1238.getClass(), "next", null);
        setField(term1238, term1238.getClass(), "first", null);
        setField(term1238, term1238.getClass(), "last", null);
        setField(term1238, term1238.getClass(), "propListHead", null);
        setIntField(term1238, term1238.getClass(), "sourcePosition", 0);
        setField(term1238, term1238.getClass(), "jsType", null);
        setField(term1238, term1238.getClass(), "parent", null);
        setField(term1221, term1221.getClass(), "first", term1238);
        setIntField(term1241, term1241.getClass(), "type", 0);
        setField(term1241, term1241.getClass(), "next", null);
        setField(term1241, term1241.getClass(), "first", null);
        setField(term1241, term1241.getClass(), "last", null);
        setField(term1241, term1241.getClass(), "propListHead", null);
        setIntField(term1241, term1241.getClass(), "sourcePosition", 0);
        setField(term1241, term1241.getClass(), "jsType", null);
        setField(term1241, term1241.getClass(), "parent", null);
        setField(term1221, term1221.getClass(), "last", term1241);
        setField(term1244, term1244.getClass(), "next", null);
        setIntField(term1244, term1244.getClass(), "type", 0);
        setIntField(term1244, term1244.getClass(), "intValue", 0);
        setField(term1244, term1244.getClass(), "objectValue", null);
        setField(term1221, term1221.getClass(), "propListHead", term1244);
        setIntField(term1221, term1221.getClass(), "sourcePosition", 1956590498);
        setField(term1221, term1221.getClass(), "jsType", null);
        setField(term1221, term1221.getClass(), "parent", null);
        term9340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9345 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9348 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9340, term9340.getClass(), "type", -695279311);
        setIntField(term9341, term9341.getClass(), "type", 1862841859);
        setIntField(term9342, term9342.getClass(), "type", 0);
        setField(term9342, term9342.getClass(), "next", null);
        setField(term9342, term9342.getClass(), "first", null);
        setField(term9342, term9342.getClass(), "last", null);
        setField(term9342, term9342.getClass(), "propListHead", null);
        setIntField(term9342, term9342.getClass(), "sourcePosition", 0);
        setField(term9342, term9342.getClass(), "jsType", null);
        setField(term9342, term9342.getClass(), "parent", null);
        setField(term9341, term9341.getClass(), "next", term9342);
        setIntField(term9343, term9343.getClass(), "type", 0);
        setField(term9343, term9343.getClass(), "next", null);
        setField(term9343, term9343.getClass(), "first", null);
        setField(term9343, term9343.getClass(), "last", null);
        setField(term9343, term9343.getClass(), "propListHead", null);
        setIntField(term9343, term9343.getClass(), "sourcePosition", 0);
        setField(term9343, term9343.getClass(), "jsType", null);
        setField(term9343, term9343.getClass(), "parent", null);
        setField(term9341, term9341.getClass(), "first", term9343);
        setIntField(term9344, term9344.getClass(), "type", 0);
        setField(term9344, term9344.getClass(), "next", null);
        setField(term9344, term9344.getClass(), "first", null);
        setField(term9344, term9344.getClass(), "last", null);
        setField(term9344, term9344.getClass(), "propListHead", null);
        setIntField(term9344, term9344.getClass(), "sourcePosition", 0);
        setField(term9344, term9344.getClass(), "jsType", null);
        setField(term9344, term9344.getClass(), "parent", null);
        setField(term9341, term9341.getClass(), "last", term9344);
        setField(term9345, term9345.getClass(), "next", null);
        setIntField(term9345, term9345.getClass(), "type", 0);
        setIntField(term9345, term9345.getClass(), "intValue", 0);
        setField(term9345, term9345.getClass(), "objectValue", null);
        setField(term9341, term9341.getClass(), "propListHead", term9345);
        setIntField(term9341, term9341.getClass(), "sourcePosition", 1713573821);
        setField(term9341, term9341.getClass(), "jsType", null);
        setField(term9341, term9341.getClass(), "parent", null);
        setField(term9340, term9340.getClass(), "next", term9341);
        setIntField(term9346, term9346.getClass(), "type", 0);
        setField(term9346, term9346.getClass(), "next", null);
        setField(term9346, term9346.getClass(), "first", null);
        setField(term9346, term9346.getClass(), "last", null);
        setField(term9346, term9346.getClass(), "propListHead", null);
        setIntField(term9346, term9346.getClass(), "sourcePosition", 0);
        setField(term9346, term9346.getClass(), "jsType", null);
        setField(term9346, term9346.getClass(), "parent", null);
        setField(term9340, term9340.getClass(), "first", term9346);
        setIntField(term9347, term9347.getClass(), "type", 0);
        setField(term9347, term9347.getClass(), "next", null);
        setField(term9347, term9347.getClass(), "first", null);
        setField(term9347, term9347.getClass(), "last", null);
        setField(term9347, term9347.getClass(), "propListHead", null);
        setIntField(term9347, term9347.getClass(), "sourcePosition", 0);
        setField(term9347, term9347.getClass(), "jsType", null);
        setField(term9347, term9347.getClass(), "parent", null);
        setField(term9340, term9340.getClass(), "last", term9347);
        setField(term9348, term9348.getClass(), "next", null);
        setIntField(term9348, term9348.getClass(), "type", 0);
        setIntField(term9348, term9348.getClass(), "intValue", 0);
        setField(term9348, term9348.getClass(), "objectValue", null);
        setField(term9340, term9340.getClass(), "propListHead", term9348);
        setIntField(term9340, term9340.getClass(), "sourcePosition", 1956590498);
        setField(term9340, term9340.getClass(), "jsType", null);
        setField(term9340, term9340.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1221;
        Object retValue = callMethod(klass, "getLoopCodeBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term1221, term9340));
        assertTrue(recursiveEquals(retValue, null));
    }

};


