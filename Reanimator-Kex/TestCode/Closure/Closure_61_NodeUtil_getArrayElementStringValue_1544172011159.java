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

public class NodeUtil_getArrayElementStringValue_1544172011159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66;
     Object term4358;

    public NodeUtil_getArrayElementStringValue_1544172011159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66, term66.getClass(), "type", -226514366);
        setIntField(term68, term68.getClass(), "type", -469968304);
        setIntField(term70, term70.getClass(), "type", 0);
        setField(term70, term70.getClass(), "next", null);
        setField(term70, term70.getClass(), "first", null);
        setField(term70, term70.getClass(), "last", null);
        setField(term70, term70.getClass(), "propListHead", null);
        setIntField(term70, term70.getClass(), "sourcePosition", 0);
        setField(term70, term70.getClass(), "jsType", null);
        setField(term70, term70.getClass(), "parent", null);
        setField(term68, term68.getClass(), "next", term70);
        setIntField(term73, term73.getClass(), "type", 0);
        setField(term73, term73.getClass(), "next", null);
        setField(term73, term73.getClass(), "first", null);
        setField(term73, term73.getClass(), "last", null);
        setField(term73, term73.getClass(), "propListHead", null);
        setIntField(term73, term73.getClass(), "sourcePosition", 0);
        setField(term73, term73.getClass(), "jsType", null);
        setField(term73, term73.getClass(), "parent", null);
        setField(term68, term68.getClass(), "first", term73);
        setIntField(term76, term76.getClass(), "type", 0);
        setField(term76, term76.getClass(), "next", null);
        setField(term76, term76.getClass(), "first", null);
        setField(term76, term76.getClass(), "last", null);
        setField(term76, term76.getClass(), "propListHead", null);
        setIntField(term76, term76.getClass(), "sourcePosition", 0);
        setField(term76, term76.getClass(), "jsType", null);
        setField(term76, term76.getClass(), "parent", null);
        setField(term68, term68.getClass(), "last", term76);
        setField(term68, term68.getClass(), "propListHead", null);
        setIntField(term68, term68.getClass(), "sourcePosition", 0);
        setField(term68, term68.getClass(), "jsType", null);
        setField(term68, term68.getClass(), "parent", null);
        setField(term66, term66.getClass(), "next", term68);
        setIntField(term80, term80.getClass(), "type", 0);
        setField(term80, term80.getClass(), "next", null);
        setField(term80, term80.getClass(), "first", null);
        setField(term80, term80.getClass(), "last", null);
        setField(term80, term80.getClass(), "propListHead", null);
        setIntField(term80, term80.getClass(), "sourcePosition", 0);
        setField(term80, term80.getClass(), "jsType", null);
        setField(term80, term80.getClass(), "parent", null);
        setField(term66, term66.getClass(), "first", term80);
        setIntField(term83, term83.getClass(), "type", 0);
        setField(term83, term83.getClass(), "next", null);
        setField(term83, term83.getClass(), "first", null);
        setField(term83, term83.getClass(), "last", null);
        setField(term83, term83.getClass(), "propListHead", null);
        setIntField(term83, term83.getClass(), "sourcePosition", 0);
        setField(term83, term83.getClass(), "jsType", null);
        setField(term83, term83.getClass(), "parent", null);
        setField(term66, term66.getClass(), "last", term83);
        setField(term66, term66.getClass(), "propListHead", null);
        setIntField(term66, term66.getClass(), "sourcePosition", 0);
        setField(term66, term66.getClass(), "jsType", null);
        setField(term66, term66.getClass(), "parent", null);
        term4358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4358, term4358.getClass(), "type", -226514366);
        setIntField(term4359, term4359.getClass(), "type", -469968304);
        setIntField(term4360, term4360.getClass(), "type", 0);
        setField(term4360, term4360.getClass(), "next", null);
        setField(term4360, term4360.getClass(), "first", null);
        setField(term4360, term4360.getClass(), "last", null);
        setField(term4360, term4360.getClass(), "propListHead", null);
        setIntField(term4360, term4360.getClass(), "sourcePosition", 0);
        setField(term4360, term4360.getClass(), "jsType", null);
        setField(term4360, term4360.getClass(), "parent", null);
        setField(term4359, term4359.getClass(), "next", term4360);
        setIntField(term4361, term4361.getClass(), "type", 0);
        setField(term4361, term4361.getClass(), "next", null);
        setField(term4361, term4361.getClass(), "first", null);
        setField(term4361, term4361.getClass(), "last", null);
        setField(term4361, term4361.getClass(), "propListHead", null);
        setIntField(term4361, term4361.getClass(), "sourcePosition", 0);
        setField(term4361, term4361.getClass(), "jsType", null);
        setField(term4361, term4361.getClass(), "parent", null);
        setField(term4359, term4359.getClass(), "first", term4361);
        setIntField(term4362, term4362.getClass(), "type", 0);
        setField(term4362, term4362.getClass(), "next", null);
        setField(term4362, term4362.getClass(), "first", null);
        setField(term4362, term4362.getClass(), "last", null);
        setField(term4362, term4362.getClass(), "propListHead", null);
        setIntField(term4362, term4362.getClass(), "sourcePosition", 0);
        setField(term4362, term4362.getClass(), "jsType", null);
        setField(term4362, term4362.getClass(), "parent", null);
        setField(term4359, term4359.getClass(), "last", term4362);
        setField(term4359, term4359.getClass(), "propListHead", null);
        setIntField(term4359, term4359.getClass(), "sourcePosition", 0);
        setField(term4359, term4359.getClass(), "jsType", null);
        setField(term4359, term4359.getClass(), "parent", null);
        setField(term4358, term4358.getClass(), "next", term4359);
        setIntField(term4363, term4363.getClass(), "type", 0);
        setField(term4363, term4363.getClass(), "next", null);
        setField(term4363, term4363.getClass(), "first", null);
        setField(term4363, term4363.getClass(), "last", null);
        setField(term4363, term4363.getClass(), "propListHead", null);
        setIntField(term4363, term4363.getClass(), "sourcePosition", 0);
        setField(term4363, term4363.getClass(), "jsType", null);
        setField(term4363, term4363.getClass(), "parent", null);
        setField(term4358, term4358.getClass(), "first", term4363);
        setIntField(term4364, term4364.getClass(), "type", 0);
        setField(term4364, term4364.getClass(), "next", null);
        setField(term4364, term4364.getClass(), "first", null);
        setField(term4364, term4364.getClass(), "last", null);
        setField(term4364, term4364.getClass(), "propListHead", null);
        setIntField(term4364, term4364.getClass(), "sourcePosition", 0);
        setField(term4364, term4364.getClass(), "jsType", null);
        setField(term4364, term4364.getClass(), "parent", null);
        setField(term4358, term4358.getClass(), "last", term4364);
        setField(term4358, term4358.getClass(), "propListHead", null);
        setIntField(term4358, term4358.getClass(), "sourcePosition", 0);
        setField(term4358, term4358.getClass(), "jsType", null);
        setField(term4358, term4358.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term66;
        Object retValue = callMethod(klass, "getArrayElementStringValue", argTypes, null, args);
        assertTrue(recursiveEquals(term66, term4358));
        assertTrue(recursiveEquals(retValue, null));
    }

};


