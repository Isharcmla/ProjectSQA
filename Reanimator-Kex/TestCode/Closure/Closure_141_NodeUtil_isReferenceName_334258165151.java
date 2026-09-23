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

public class NodeUtil_isReferenceName_334258165151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1219;
     Object term8182;

    public NodeUtil_isReferenceName_334258165151() {
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
        term8182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8187 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8190 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8182, term8182.getClass(), "type", -695279311);
        setIntField(term8183, term8183.getClass(), "type", 1862841859);
        setIntField(term8184, term8184.getClass(), "type", 0);
        setField(term8184, term8184.getClass(), "next", null);
        setField(term8184, term8184.getClass(), "first", null);
        setField(term8184, term8184.getClass(), "last", null);
        setField(term8184, term8184.getClass(), "propListHead", null);
        setIntField(term8184, term8184.getClass(), "sourcePosition", 0);
        setField(term8184, term8184.getClass(), "jsType", null);
        setField(term8184, term8184.getClass(), "parent", null);
        setField(term8183, term8183.getClass(), "next", term8184);
        setIntField(term8185, term8185.getClass(), "type", 0);
        setField(term8185, term8185.getClass(), "next", null);
        setField(term8185, term8185.getClass(), "first", null);
        setField(term8185, term8185.getClass(), "last", null);
        setField(term8185, term8185.getClass(), "propListHead", null);
        setIntField(term8185, term8185.getClass(), "sourcePosition", 0);
        setField(term8185, term8185.getClass(), "jsType", null);
        setField(term8185, term8185.getClass(), "parent", null);
        setField(term8183, term8183.getClass(), "first", term8185);
        setIntField(term8186, term8186.getClass(), "type", 0);
        setField(term8186, term8186.getClass(), "next", null);
        setField(term8186, term8186.getClass(), "first", null);
        setField(term8186, term8186.getClass(), "last", null);
        setField(term8186, term8186.getClass(), "propListHead", null);
        setIntField(term8186, term8186.getClass(), "sourcePosition", 0);
        setField(term8186, term8186.getClass(), "jsType", null);
        setField(term8186, term8186.getClass(), "parent", null);
        setField(term8183, term8183.getClass(), "last", term8186);
        setField(term8187, term8187.getClass(), "next", null);
        setIntField(term8187, term8187.getClass(), "type", 0);
        setIntField(term8187, term8187.getClass(), "intValue", 0);
        setField(term8187, term8187.getClass(), "objectValue", null);
        setField(term8183, term8183.getClass(), "propListHead", term8187);
        setIntField(term8183, term8183.getClass(), "sourcePosition", 1713573821);
        setField(term8183, term8183.getClass(), "jsType", null);
        setField(term8183, term8183.getClass(), "parent", null);
        setField(term8182, term8182.getClass(), "next", term8183);
        setIntField(term8188, term8188.getClass(), "type", 0);
        setField(term8188, term8188.getClass(), "next", null);
        setField(term8188, term8188.getClass(), "first", null);
        setField(term8188, term8188.getClass(), "last", null);
        setField(term8188, term8188.getClass(), "propListHead", null);
        setIntField(term8188, term8188.getClass(), "sourcePosition", 0);
        setField(term8188, term8188.getClass(), "jsType", null);
        setField(term8188, term8188.getClass(), "parent", null);
        setField(term8182, term8182.getClass(), "first", term8188);
        setIntField(term8189, term8189.getClass(), "type", 0);
        setField(term8189, term8189.getClass(), "next", null);
        setField(term8189, term8189.getClass(), "first", null);
        setField(term8189, term8189.getClass(), "last", null);
        setField(term8189, term8189.getClass(), "propListHead", null);
        setIntField(term8189, term8189.getClass(), "sourcePosition", 0);
        setField(term8189, term8189.getClass(), "jsType", null);
        setField(term8189, term8189.getClass(), "parent", null);
        setField(term8182, term8182.getClass(), "last", term8189);
        setField(term8190, term8190.getClass(), "next", null);
        setIntField(term8190, term8190.getClass(), "type", 0);
        setIntField(term8190, term8190.getClass(), "intValue", 0);
        setField(term8190, term8190.getClass(), "objectValue", null);
        setField(term8182, term8182.getClass(), "propListHead", term8190);
        setIntField(term8182, term8182.getClass(), "sourcePosition", 1956590498);
        setField(term8182, term8182.getClass(), "jsType", null);
        setField(term8182, term8182.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1219;
        Object retValue = callMethod(klass, "isReferenceName", argTypes, null, args);
        assertTrue(recursiveEquals(term1219, term8182));
        assertTrue(recursiveEquals(retValue, false));
    }

};


