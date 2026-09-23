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

public class NodeUtil_getStringValue_242131640122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;
     Object term4318;

    public NodeUtil_getStringValue_242131640122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term72 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term55, term55.getClass(), "type", 865208305);
        setIntField(term57, term57.getClass(), "type", -1179120542);
        setIntField(term59, term59.getClass(), "type", 0);
        setField(term59, term59.getClass(), "next", null);
        setField(term59, term59.getClass(), "first", null);
        setField(term59, term59.getClass(), "last", null);
        setField(term59, term59.getClass(), "propListHead", null);
        setIntField(term59, term59.getClass(), "sourcePosition", 0);
        setField(term59, term59.getClass(), "jsType", null);
        setField(term59, term59.getClass(), "parent", null);
        setField(term57, term57.getClass(), "next", term59);
        setIntField(term62, term62.getClass(), "type", 0);
        setField(term62, term62.getClass(), "next", null);
        setField(term62, term62.getClass(), "first", null);
        setField(term62, term62.getClass(), "last", null);
        setField(term62, term62.getClass(), "propListHead", null);
        setIntField(term62, term62.getClass(), "sourcePosition", 0);
        setField(term62, term62.getClass(), "jsType", null);
        setField(term62, term62.getClass(), "parent", null);
        setField(term57, term57.getClass(), "first", term62);
        setIntField(term65, term65.getClass(), "type", 0);
        setField(term65, term65.getClass(), "next", null);
        setField(term65, term65.getClass(), "first", null);
        setField(term65, term65.getClass(), "last", null);
        setField(term65, term65.getClass(), "propListHead", null);
        setIntField(term65, term65.getClass(), "sourcePosition", 0);
        setField(term65, term65.getClass(), "jsType", null);
        setField(term65, term65.getClass(), "parent", null);
        setField(term57, term57.getClass(), "last", term65);
        setField(term68, term68.getClass(), "next", null);
        setIntField(term68, term68.getClass(), "type", 0);
        setIntField(term68, term68.getClass(), "intValue", 0);
        setField(term68, term68.getClass(), "objectValue", null);
        setField(term57, term57.getClass(), "propListHead", term68);
        setIntField(term57, term57.getClass(), "sourcePosition", 1193880199);
        setField(term57, term57.getClass(), "jsType", null);
        setField(term57, term57.getClass(), "parent", null);
        setField(term55, term55.getClass(), "next", term57);
        setIntField(term72, term72.getClass(), "type", 0);
        setField(term72, term72.getClass(), "next", null);
        setField(term72, term72.getClass(), "first", null);
        setField(term72, term72.getClass(), "last", null);
        setField(term72, term72.getClass(), "propListHead", null);
        setIntField(term72, term72.getClass(), "sourcePosition", 0);
        setField(term72, term72.getClass(), "jsType", null);
        setField(term72, term72.getClass(), "parent", null);
        setField(term55, term55.getClass(), "first", term72);
        setIntField(term75, term75.getClass(), "type", 0);
        setField(term75, term75.getClass(), "next", null);
        setField(term75, term75.getClass(), "first", null);
        setField(term75, term75.getClass(), "last", null);
        setField(term75, term75.getClass(), "propListHead", null);
        setIntField(term75, term75.getClass(), "sourcePosition", 0);
        setField(term75, term75.getClass(), "jsType", null);
        setField(term75, term75.getClass(), "parent", null);
        setField(term55, term55.getClass(), "last", term75);
        setField(term78, term78.getClass(), "next", null);
        setIntField(term78, term78.getClass(), "type", 0);
        setIntField(term78, term78.getClass(), "intValue", 0);
        setField(term78, term78.getClass(), "objectValue", null);
        setField(term55, term55.getClass(), "propListHead", term78);
        setIntField(term55, term55.getClass(), "sourcePosition", -1087774327);
        setField(term55, term55.getClass(), "jsType", null);
        setField(term55, term55.getClass(), "parent", null);
        term4318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4323 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4326 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4318, term4318.getClass(), "type", 865208305);
        setIntField(term4319, term4319.getClass(), "type", -1179120542);
        setIntField(term4320, term4320.getClass(), "type", 0);
        setField(term4320, term4320.getClass(), "next", null);
        setField(term4320, term4320.getClass(), "first", null);
        setField(term4320, term4320.getClass(), "last", null);
        setField(term4320, term4320.getClass(), "propListHead", null);
        setIntField(term4320, term4320.getClass(), "sourcePosition", 0);
        setField(term4320, term4320.getClass(), "jsType", null);
        setField(term4320, term4320.getClass(), "parent", null);
        setField(term4319, term4319.getClass(), "next", term4320);
        setIntField(term4321, term4321.getClass(), "type", 0);
        setField(term4321, term4321.getClass(), "next", null);
        setField(term4321, term4321.getClass(), "first", null);
        setField(term4321, term4321.getClass(), "last", null);
        setField(term4321, term4321.getClass(), "propListHead", null);
        setIntField(term4321, term4321.getClass(), "sourcePosition", 0);
        setField(term4321, term4321.getClass(), "jsType", null);
        setField(term4321, term4321.getClass(), "parent", null);
        setField(term4319, term4319.getClass(), "first", term4321);
        setIntField(term4322, term4322.getClass(), "type", 0);
        setField(term4322, term4322.getClass(), "next", null);
        setField(term4322, term4322.getClass(), "first", null);
        setField(term4322, term4322.getClass(), "last", null);
        setField(term4322, term4322.getClass(), "propListHead", null);
        setIntField(term4322, term4322.getClass(), "sourcePosition", 0);
        setField(term4322, term4322.getClass(), "jsType", null);
        setField(term4322, term4322.getClass(), "parent", null);
        setField(term4319, term4319.getClass(), "last", term4322);
        setField(term4323, term4323.getClass(), "next", null);
        setIntField(term4323, term4323.getClass(), "type", 0);
        setIntField(term4323, term4323.getClass(), "intValue", 0);
        setField(term4323, term4323.getClass(), "objectValue", null);
        setField(term4319, term4319.getClass(), "propListHead", term4323);
        setIntField(term4319, term4319.getClass(), "sourcePosition", 1193880199);
        setField(term4319, term4319.getClass(), "jsType", null);
        setField(term4319, term4319.getClass(), "parent", null);
        setField(term4318, term4318.getClass(), "next", term4319);
        setIntField(term4324, term4324.getClass(), "type", 0);
        setField(term4324, term4324.getClass(), "next", null);
        setField(term4324, term4324.getClass(), "first", null);
        setField(term4324, term4324.getClass(), "last", null);
        setField(term4324, term4324.getClass(), "propListHead", null);
        setIntField(term4324, term4324.getClass(), "sourcePosition", 0);
        setField(term4324, term4324.getClass(), "jsType", null);
        setField(term4324, term4324.getClass(), "parent", null);
        setField(term4318, term4318.getClass(), "first", term4324);
        setIntField(term4325, term4325.getClass(), "type", 0);
        setField(term4325, term4325.getClass(), "next", null);
        setField(term4325, term4325.getClass(), "first", null);
        setField(term4325, term4325.getClass(), "last", null);
        setField(term4325, term4325.getClass(), "propListHead", null);
        setIntField(term4325, term4325.getClass(), "sourcePosition", 0);
        setField(term4325, term4325.getClass(), "jsType", null);
        setField(term4325, term4325.getClass(), "parent", null);
        setField(term4318, term4318.getClass(), "last", term4325);
        setField(term4326, term4326.getClass(), "next", null);
        setIntField(term4326, term4326.getClass(), "type", 0);
        setIntField(term4326, term4326.getClass(), "intValue", 0);
        setField(term4326, term4326.getClass(), "objectValue", null);
        setField(term4318, term4318.getClass(), "propListHead", term4326);
        setIntField(term4318, term4318.getClass(), "sourcePosition", -1087774327);
        setField(term4318, term4318.getClass(), "jsType", null);
        setField(term4318, term4318.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term55;
        Object retValue = callMethod(klass, "getStringValue", argTypes, null, args);
        assertTrue(recursiveEquals(term55, term4318));
        assertTrue(recursiveEquals(retValue, null));
    }

};


