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

public class NodeUtil_getArrayElementStringValue_1544172011156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term5204;

    public NodeUtil_getArrayElementStringValue_1544172011156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term99 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term82, term82.getClass(), "type", 679763016);
        setIntField(term84, term84.getClass(), "type", -157887805);
        setIntField(term86, term86.getClass(), "type", 0);
        setField(term86, term86.getClass(), "next", null);
        setField(term86, term86.getClass(), "first", null);
        setField(term86, term86.getClass(), "last", null);
        setField(term86, term86.getClass(), "propListHead", null);
        setIntField(term86, term86.getClass(), "sourcePosition", 0);
        setField(term86, term86.getClass(), "jsType", null);
        setField(term86, term86.getClass(), "parent", null);
        setField(term84, term84.getClass(), "next", term86);
        setIntField(term89, term89.getClass(), "type", 0);
        setField(term89, term89.getClass(), "next", null);
        setField(term89, term89.getClass(), "first", null);
        setField(term89, term89.getClass(), "last", null);
        setField(term89, term89.getClass(), "propListHead", null);
        setIntField(term89, term89.getClass(), "sourcePosition", 0);
        setField(term89, term89.getClass(), "jsType", null);
        setField(term89, term89.getClass(), "parent", null);
        setField(term84, term84.getClass(), "first", term89);
        setIntField(term92, term92.getClass(), "type", 0);
        setField(term92, term92.getClass(), "next", null);
        setField(term92, term92.getClass(), "first", null);
        setField(term92, term92.getClass(), "last", null);
        setField(term92, term92.getClass(), "propListHead", null);
        setIntField(term92, term92.getClass(), "sourcePosition", 0);
        setField(term92, term92.getClass(), "jsType", null);
        setField(term92, term92.getClass(), "parent", null);
        setField(term84, term84.getClass(), "last", term92);
        setField(term95, term95.getClass(), "next", null);
        setIntField(term95, term95.getClass(), "type", 0);
        setIntField(term95, term95.getClass(), "intValue", 0);
        setField(term95, term95.getClass(), "objectValue", null);
        setField(term84, term84.getClass(), "propListHead", term95);
        setIntField(term84, term84.getClass(), "sourcePosition", -1016503459);
        setField(term84, term84.getClass(), "jsType", null);
        setField(term84, term84.getClass(), "parent", null);
        setField(term82, term82.getClass(), "next", term84);
        setIntField(term99, term99.getClass(), "type", 0);
        setField(term99, term99.getClass(), "next", null);
        setField(term99, term99.getClass(), "first", null);
        setField(term99, term99.getClass(), "last", null);
        setField(term99, term99.getClass(), "propListHead", null);
        setIntField(term99, term99.getClass(), "sourcePosition", 0);
        setField(term99, term99.getClass(), "jsType", null);
        setField(term99, term99.getClass(), "parent", null);
        setField(term82, term82.getClass(), "first", term99);
        setIntField(term102, term102.getClass(), "type", 0);
        setField(term102, term102.getClass(), "next", null);
        setField(term102, term102.getClass(), "first", null);
        setField(term102, term102.getClass(), "last", null);
        setField(term102, term102.getClass(), "propListHead", null);
        setIntField(term102, term102.getClass(), "sourcePosition", 0);
        setField(term102, term102.getClass(), "jsType", null);
        setField(term102, term102.getClass(), "parent", null);
        setField(term82, term82.getClass(), "last", term102);
        setField(term105, term105.getClass(), "next", null);
        setIntField(term105, term105.getClass(), "type", 0);
        setIntField(term105, term105.getClass(), "intValue", 0);
        setField(term105, term105.getClass(), "objectValue", null);
        setField(term82, term82.getClass(), "propListHead", term105);
        setIntField(term82, term82.getClass(), "sourcePosition", -1968847291);
        setField(term82, term82.getClass(), "jsType", null);
        setField(term82, term82.getClass(), "parent", null);
        term5204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5209 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5212 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5204, term5204.getClass(), "type", 679763016);
        setIntField(term5205, term5205.getClass(), "type", -157887805);
        setIntField(term5206, term5206.getClass(), "type", 0);
        setField(term5206, term5206.getClass(), "next", null);
        setField(term5206, term5206.getClass(), "first", null);
        setField(term5206, term5206.getClass(), "last", null);
        setField(term5206, term5206.getClass(), "propListHead", null);
        setIntField(term5206, term5206.getClass(), "sourcePosition", 0);
        setField(term5206, term5206.getClass(), "jsType", null);
        setField(term5206, term5206.getClass(), "parent", null);
        setField(term5205, term5205.getClass(), "next", term5206);
        setIntField(term5207, term5207.getClass(), "type", 0);
        setField(term5207, term5207.getClass(), "next", null);
        setField(term5207, term5207.getClass(), "first", null);
        setField(term5207, term5207.getClass(), "last", null);
        setField(term5207, term5207.getClass(), "propListHead", null);
        setIntField(term5207, term5207.getClass(), "sourcePosition", 0);
        setField(term5207, term5207.getClass(), "jsType", null);
        setField(term5207, term5207.getClass(), "parent", null);
        setField(term5205, term5205.getClass(), "first", term5207);
        setIntField(term5208, term5208.getClass(), "type", 0);
        setField(term5208, term5208.getClass(), "next", null);
        setField(term5208, term5208.getClass(), "first", null);
        setField(term5208, term5208.getClass(), "last", null);
        setField(term5208, term5208.getClass(), "propListHead", null);
        setIntField(term5208, term5208.getClass(), "sourcePosition", 0);
        setField(term5208, term5208.getClass(), "jsType", null);
        setField(term5208, term5208.getClass(), "parent", null);
        setField(term5205, term5205.getClass(), "last", term5208);
        setField(term5209, term5209.getClass(), "next", null);
        setIntField(term5209, term5209.getClass(), "type", 0);
        setIntField(term5209, term5209.getClass(), "intValue", 0);
        setField(term5209, term5209.getClass(), "objectValue", null);
        setField(term5205, term5205.getClass(), "propListHead", term5209);
        setIntField(term5205, term5205.getClass(), "sourcePosition", -1016503459);
        setField(term5205, term5205.getClass(), "jsType", null);
        setField(term5205, term5205.getClass(), "parent", null);
        setField(term5204, term5204.getClass(), "next", term5205);
        setIntField(term5210, term5210.getClass(), "type", 0);
        setField(term5210, term5210.getClass(), "next", null);
        setField(term5210, term5210.getClass(), "first", null);
        setField(term5210, term5210.getClass(), "last", null);
        setField(term5210, term5210.getClass(), "propListHead", null);
        setIntField(term5210, term5210.getClass(), "sourcePosition", 0);
        setField(term5210, term5210.getClass(), "jsType", null);
        setField(term5210, term5210.getClass(), "parent", null);
        setField(term5204, term5204.getClass(), "first", term5210);
        setIntField(term5211, term5211.getClass(), "type", 0);
        setField(term5211, term5211.getClass(), "next", null);
        setField(term5211, term5211.getClass(), "first", null);
        setField(term5211, term5211.getClass(), "last", null);
        setField(term5211, term5211.getClass(), "propListHead", null);
        setIntField(term5211, term5211.getClass(), "sourcePosition", 0);
        setField(term5211, term5211.getClass(), "jsType", null);
        setField(term5211, term5211.getClass(), "parent", null);
        setField(term5204, term5204.getClass(), "last", term5211);
        setField(term5212, term5212.getClass(), "next", null);
        setIntField(term5212, term5212.getClass(), "type", 0);
        setIntField(term5212, term5212.getClass(), "intValue", 0);
        setField(term5212, term5212.getClass(), "objectValue", null);
        setField(term5204, term5204.getClass(), "propListHead", term5212);
        setIntField(term5204, term5204.getClass(), "sourcePosition", -1968847291);
        setField(term5204, term5204.getClass(), "jsType", null);
        setField(term5204, term5204.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term82;
        Object retValue = callMethod(klass, "getArrayElementStringValue", argTypes, null, args);
        assertTrue(recursiveEquals(term82, term5204));
        assertTrue(recursiveEquals(retValue, null));
    }

};


