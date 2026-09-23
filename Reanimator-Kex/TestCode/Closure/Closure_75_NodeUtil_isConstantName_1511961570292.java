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

public class NodeUtil_isConstantName_1511961570292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4106;
     Object term24970;

    public NodeUtil_isConstantName_1511961570292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4119 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4129 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4106, term4106.getClass(), "type", 383244929);
        setIntField(term4108, term4108.getClass(), "type", -31125530);
        setIntField(term4110, term4110.getClass(), "type", 0);
        setField(term4110, term4110.getClass(), "next", null);
        setField(term4110, term4110.getClass(), "first", null);
        setField(term4110, term4110.getClass(), "last", null);
        setField(term4110, term4110.getClass(), "propListHead", null);
        setIntField(term4110, term4110.getClass(), "sourcePosition", 0);
        setField(term4110, term4110.getClass(), "jsType", null);
        setField(term4110, term4110.getClass(), "parent", null);
        setField(term4108, term4108.getClass(), "next", term4110);
        setIntField(term4113, term4113.getClass(), "type", 0);
        setField(term4113, term4113.getClass(), "next", null);
        setField(term4113, term4113.getClass(), "first", null);
        setField(term4113, term4113.getClass(), "last", null);
        setField(term4113, term4113.getClass(), "propListHead", null);
        setIntField(term4113, term4113.getClass(), "sourcePosition", 0);
        setField(term4113, term4113.getClass(), "jsType", null);
        setField(term4113, term4113.getClass(), "parent", null);
        setField(term4108, term4108.getClass(), "first", term4113);
        setIntField(term4116, term4116.getClass(), "type", 0);
        setField(term4116, term4116.getClass(), "next", null);
        setField(term4116, term4116.getClass(), "first", null);
        setField(term4116, term4116.getClass(), "last", null);
        setField(term4116, term4116.getClass(), "propListHead", null);
        setIntField(term4116, term4116.getClass(), "sourcePosition", 0);
        setField(term4116, term4116.getClass(), "jsType", null);
        setField(term4116, term4116.getClass(), "parent", null);
        setField(term4108, term4108.getClass(), "last", term4116);
        setField(term4119, term4119.getClass(), "next", null);
        setIntField(term4119, term4119.getClass(), "type", 0);
        setIntField(term4119, term4119.getClass(), "intValue", 0);
        setField(term4119, term4119.getClass(), "objectValue", null);
        setField(term4108, term4108.getClass(), "propListHead", term4119);
        setIntField(term4108, term4108.getClass(), "sourcePosition", 1097894139);
        setField(term4108, term4108.getClass(), "jsType", null);
        setField(term4108, term4108.getClass(), "parent", null);
        setField(term4106, term4106.getClass(), "next", term4108);
        setIntField(term4123, term4123.getClass(), "type", 0);
        setField(term4123, term4123.getClass(), "next", null);
        setField(term4123, term4123.getClass(), "first", null);
        setField(term4123, term4123.getClass(), "last", null);
        setField(term4123, term4123.getClass(), "propListHead", null);
        setIntField(term4123, term4123.getClass(), "sourcePosition", 0);
        setField(term4123, term4123.getClass(), "jsType", null);
        setField(term4123, term4123.getClass(), "parent", null);
        setField(term4106, term4106.getClass(), "first", term4123);
        setIntField(term4126, term4126.getClass(), "type", 0);
        setField(term4126, term4126.getClass(), "next", null);
        setField(term4126, term4126.getClass(), "first", null);
        setField(term4126, term4126.getClass(), "last", null);
        setField(term4126, term4126.getClass(), "propListHead", null);
        setIntField(term4126, term4126.getClass(), "sourcePosition", 0);
        setField(term4126, term4126.getClass(), "jsType", null);
        setField(term4126, term4126.getClass(), "parent", null);
        setField(term4106, term4106.getClass(), "last", term4126);
        setField(term4129, term4129.getClass(), "next", null);
        setIntField(term4129, term4129.getClass(), "type", 0);
        setIntField(term4129, term4129.getClass(), "intValue", 0);
        setField(term4129, term4129.getClass(), "objectValue", null);
        setField(term4106, term4106.getClass(), "propListHead", term4129);
        setIntField(term4106, term4106.getClass(), "sourcePosition", 390256347);
        setField(term4106, term4106.getClass(), "jsType", null);
        setField(term4106, term4106.getClass(), "parent", null);
        term24970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24975 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term24976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24978 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term24970, term24970.getClass(), "type", 383244929);
        setIntField(term24971, term24971.getClass(), "type", -31125530);
        setIntField(term24972, term24972.getClass(), "type", 0);
        setField(term24972, term24972.getClass(), "next", null);
        setField(term24972, term24972.getClass(), "first", null);
        setField(term24972, term24972.getClass(), "last", null);
        setField(term24972, term24972.getClass(), "propListHead", null);
        setIntField(term24972, term24972.getClass(), "sourcePosition", 0);
        setField(term24972, term24972.getClass(), "jsType", null);
        setField(term24972, term24972.getClass(), "parent", null);
        setField(term24971, term24971.getClass(), "next", term24972);
        setIntField(term24973, term24973.getClass(), "type", 0);
        setField(term24973, term24973.getClass(), "next", null);
        setField(term24973, term24973.getClass(), "first", null);
        setField(term24973, term24973.getClass(), "last", null);
        setField(term24973, term24973.getClass(), "propListHead", null);
        setIntField(term24973, term24973.getClass(), "sourcePosition", 0);
        setField(term24973, term24973.getClass(), "jsType", null);
        setField(term24973, term24973.getClass(), "parent", null);
        setField(term24971, term24971.getClass(), "first", term24973);
        setIntField(term24974, term24974.getClass(), "type", 0);
        setField(term24974, term24974.getClass(), "next", null);
        setField(term24974, term24974.getClass(), "first", null);
        setField(term24974, term24974.getClass(), "last", null);
        setField(term24974, term24974.getClass(), "propListHead", null);
        setIntField(term24974, term24974.getClass(), "sourcePosition", 0);
        setField(term24974, term24974.getClass(), "jsType", null);
        setField(term24974, term24974.getClass(), "parent", null);
        setField(term24971, term24971.getClass(), "last", term24974);
        setField(term24975, term24975.getClass(), "next", null);
        setIntField(term24975, term24975.getClass(), "type", 0);
        setIntField(term24975, term24975.getClass(), "intValue", 0);
        setField(term24975, term24975.getClass(), "objectValue", null);
        setField(term24971, term24971.getClass(), "propListHead", term24975);
        setIntField(term24971, term24971.getClass(), "sourcePosition", 1097894139);
        setField(term24971, term24971.getClass(), "jsType", null);
        setField(term24971, term24971.getClass(), "parent", null);
        setField(term24970, term24970.getClass(), "next", term24971);
        setIntField(term24976, term24976.getClass(), "type", 0);
        setField(term24976, term24976.getClass(), "next", null);
        setField(term24976, term24976.getClass(), "first", null);
        setField(term24976, term24976.getClass(), "last", null);
        setField(term24976, term24976.getClass(), "propListHead", null);
        setIntField(term24976, term24976.getClass(), "sourcePosition", 0);
        setField(term24976, term24976.getClass(), "jsType", null);
        setField(term24976, term24976.getClass(), "parent", null);
        setField(term24970, term24970.getClass(), "first", term24976);
        setIntField(term24977, term24977.getClass(), "type", 0);
        setField(term24977, term24977.getClass(), "next", null);
        setField(term24977, term24977.getClass(), "first", null);
        setField(term24977, term24977.getClass(), "last", null);
        setField(term24977, term24977.getClass(), "propListHead", null);
        setIntField(term24977, term24977.getClass(), "sourcePosition", 0);
        setField(term24977, term24977.getClass(), "jsType", null);
        setField(term24977, term24977.getClass(), "parent", null);
        setField(term24970, term24970.getClass(), "last", term24977);
        setField(term24978, term24978.getClass(), "next", null);
        setIntField(term24978, term24978.getClass(), "type", 0);
        setIntField(term24978, term24978.getClass(), "intValue", 0);
        setField(term24978, term24978.getClass(), "objectValue", null);
        setField(term24970, term24970.getClass(), "propListHead", term24978);
        setIntField(term24970, term24970.getClass(), "sourcePosition", 390256347);
        setField(term24970, term24970.getClass(), "jsType", null);
        setField(term24970, term24970.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4106;
        callMethod(klass, "isConstantName", argTypes, null, args);
        assertTrue(recursiveEquals(term4106, term24970));
    }

};


