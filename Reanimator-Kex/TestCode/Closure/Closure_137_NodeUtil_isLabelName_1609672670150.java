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

public class NodeUtil_isLabelName_1609672670150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1219;
     Object term8154;

    public NodeUtil_isLabelName_1609672670150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1232 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1242 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1219, term1219.getClass(), "type", -695279311);
        setIntField(term1221, term1221.getClass(), "type", 1862841859);
        setIntField(term1223, term1223.getClass(), "type", 0);
        setField(term1223, term1223.getClass(), "next", null);
        setField(term1223, term1223.getClass(), "first", null);
        setField(term1223, term1223.getClass(), "last", null);
        setField(term1223, term1223.getClass(), "propListHead", null);
        setIntField(term1223, term1223.getClass(), "sourcePosition", 0);
        setField(term1223, term1223.getClass(), "jsType", null);
        setField(term1223, term1223.getClass(), "parent", null);
        setField(term1221, term1221.getClass(), "next", term1223);
        setIntField(term1226, term1226.getClass(), "type", 0);
        setField(term1226, term1226.getClass(), "next", null);
        setField(term1226, term1226.getClass(), "first", null);
        setField(term1226, term1226.getClass(), "last", null);
        setField(term1226, term1226.getClass(), "propListHead", null);
        setIntField(term1226, term1226.getClass(), "sourcePosition", 0);
        setField(term1226, term1226.getClass(), "jsType", null);
        setField(term1226, term1226.getClass(), "parent", null);
        setField(term1221, term1221.getClass(), "first", term1226);
        setIntField(term1229, term1229.getClass(), "type", 0);
        setField(term1229, term1229.getClass(), "next", null);
        setField(term1229, term1229.getClass(), "first", null);
        setField(term1229, term1229.getClass(), "last", null);
        setField(term1229, term1229.getClass(), "propListHead", null);
        setIntField(term1229, term1229.getClass(), "sourcePosition", 0);
        setField(term1229, term1229.getClass(), "jsType", null);
        setField(term1229, term1229.getClass(), "parent", null);
        setField(term1221, term1221.getClass(), "last", term1229);
        setField(term1232, term1232.getClass(), "next", null);
        setIntField(term1232, term1232.getClass(), "type", 0);
        setIntField(term1232, term1232.getClass(), "intValue", 0);
        setField(term1232, term1232.getClass(), "objectValue", null);
        setField(term1221, term1221.getClass(), "propListHead", term1232);
        setIntField(term1221, term1221.getClass(), "sourcePosition", 1713573821);
        setField(term1221, term1221.getClass(), "jsType", null);
        setField(term1221, term1221.getClass(), "parent", null);
        setField(term1219, term1219.getClass(), "next", term1221);
        setIntField(term1236, term1236.getClass(), "type", 0);
        setField(term1236, term1236.getClass(), "next", null);
        setField(term1236, term1236.getClass(), "first", null);
        setField(term1236, term1236.getClass(), "last", null);
        setField(term1236, term1236.getClass(), "propListHead", null);
        setIntField(term1236, term1236.getClass(), "sourcePosition", 0);
        setField(term1236, term1236.getClass(), "jsType", null);
        setField(term1236, term1236.getClass(), "parent", null);
        setField(term1219, term1219.getClass(), "first", term1236);
        setIntField(term1239, term1239.getClass(), "type", 0);
        setField(term1239, term1239.getClass(), "next", null);
        setField(term1239, term1239.getClass(), "first", null);
        setField(term1239, term1239.getClass(), "last", null);
        setField(term1239, term1239.getClass(), "propListHead", null);
        setIntField(term1239, term1239.getClass(), "sourcePosition", 0);
        setField(term1239, term1239.getClass(), "jsType", null);
        setField(term1239, term1239.getClass(), "parent", null);
        setField(term1219, term1219.getClass(), "last", term1239);
        setField(term1242, term1242.getClass(), "next", null);
        setIntField(term1242, term1242.getClass(), "type", 0);
        setIntField(term1242, term1242.getClass(), "intValue", 0);
        setField(term1242, term1242.getClass(), "objectValue", null);
        setField(term1219, term1219.getClass(), "propListHead", term1242);
        setIntField(term1219, term1219.getClass(), "sourcePosition", 1956590498);
        setField(term1219, term1219.getClass(), "jsType", null);
        setField(term1219, term1219.getClass(), "parent", null);
        term8154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8159 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8162 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8154, term8154.getClass(), "type", -695279311);
        setIntField(term8155, term8155.getClass(), "type", 1862841859);
        setIntField(term8156, term8156.getClass(), "type", 0);
        setField(term8156, term8156.getClass(), "next", null);
        setField(term8156, term8156.getClass(), "first", null);
        setField(term8156, term8156.getClass(), "last", null);
        setField(term8156, term8156.getClass(), "propListHead", null);
        setIntField(term8156, term8156.getClass(), "sourcePosition", 0);
        setField(term8156, term8156.getClass(), "jsType", null);
        setField(term8156, term8156.getClass(), "parent", null);
        setField(term8155, term8155.getClass(), "next", term8156);
        setIntField(term8157, term8157.getClass(), "type", 0);
        setField(term8157, term8157.getClass(), "next", null);
        setField(term8157, term8157.getClass(), "first", null);
        setField(term8157, term8157.getClass(), "last", null);
        setField(term8157, term8157.getClass(), "propListHead", null);
        setIntField(term8157, term8157.getClass(), "sourcePosition", 0);
        setField(term8157, term8157.getClass(), "jsType", null);
        setField(term8157, term8157.getClass(), "parent", null);
        setField(term8155, term8155.getClass(), "first", term8157);
        setIntField(term8158, term8158.getClass(), "type", 0);
        setField(term8158, term8158.getClass(), "next", null);
        setField(term8158, term8158.getClass(), "first", null);
        setField(term8158, term8158.getClass(), "last", null);
        setField(term8158, term8158.getClass(), "propListHead", null);
        setIntField(term8158, term8158.getClass(), "sourcePosition", 0);
        setField(term8158, term8158.getClass(), "jsType", null);
        setField(term8158, term8158.getClass(), "parent", null);
        setField(term8155, term8155.getClass(), "last", term8158);
        setField(term8159, term8159.getClass(), "next", null);
        setIntField(term8159, term8159.getClass(), "type", 0);
        setIntField(term8159, term8159.getClass(), "intValue", 0);
        setField(term8159, term8159.getClass(), "objectValue", null);
        setField(term8155, term8155.getClass(), "propListHead", term8159);
        setIntField(term8155, term8155.getClass(), "sourcePosition", 1713573821);
        setField(term8155, term8155.getClass(), "jsType", null);
        setField(term8155, term8155.getClass(), "parent", null);
        setField(term8154, term8154.getClass(), "next", term8155);
        setIntField(term8160, term8160.getClass(), "type", 0);
        setField(term8160, term8160.getClass(), "next", null);
        setField(term8160, term8160.getClass(), "first", null);
        setField(term8160, term8160.getClass(), "last", null);
        setField(term8160, term8160.getClass(), "propListHead", null);
        setIntField(term8160, term8160.getClass(), "sourcePosition", 0);
        setField(term8160, term8160.getClass(), "jsType", null);
        setField(term8160, term8160.getClass(), "parent", null);
        setField(term8154, term8154.getClass(), "first", term8160);
        setIntField(term8161, term8161.getClass(), "type", 0);
        setField(term8161, term8161.getClass(), "next", null);
        setField(term8161, term8161.getClass(), "first", null);
        setField(term8161, term8161.getClass(), "last", null);
        setField(term8161, term8161.getClass(), "propListHead", null);
        setIntField(term8161, term8161.getClass(), "sourcePosition", 0);
        setField(term8161, term8161.getClass(), "jsType", null);
        setField(term8161, term8161.getClass(), "parent", null);
        setField(term8154, term8154.getClass(), "last", term8161);
        setField(term8162, term8162.getClass(), "next", null);
        setIntField(term8162, term8162.getClass(), "type", 0);
        setIntField(term8162, term8162.getClass(), "intValue", 0);
        setField(term8162, term8162.getClass(), "objectValue", null);
        setField(term8154, term8154.getClass(), "propListHead", term8162);
        setIntField(term8154, term8154.getClass(), "sourcePosition", 1956590498);
        setField(term8154, term8154.getClass(), "jsType", null);
        setField(term8154, term8154.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1219;
        Object retValue = callMethod(klass, "isLabelName", argTypes, null, args);
        assertTrue(recursiveEquals(term1219, term8154));
        assertTrue(recursiveEquals(retValue, false));
    }

};


