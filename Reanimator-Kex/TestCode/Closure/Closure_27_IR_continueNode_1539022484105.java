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

public class IR_continueNode_1539022484105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1240;

    public IR_continueNode_1539022484105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1240, term1240.getClass(), "type", 1607082164);
        setIntField(term1242, term1242.getClass(), "type", 1890399366);
        setIntField(term1244, term1244.getClass(), "type", -1867239125);
        setIntField(term1246, term1246.getClass(), "type", 952869601);
        setIntField(term1248, term1248.getClass(), "type", 91958879);
        setField(term1248, term1248.getClass(), "next", null);
        setField(term1248, term1248.getClass(), "first", null);
        setField(term1248, term1248.getClass(), "last", null);
        setField(term1248, term1248.getClass(), "propListHead", null);
        setIntField(term1248, term1248.getClass(), "sourcePosition", 0);
        setField(term1248, term1248.getClass(), "jsType", null);
        setField(term1248, term1248.getClass(), "parent", null);
        setField(term1246, term1246.getClass(), "next", term1248);
        setIntField(term1251, term1251.getClass(), "type", -645429025);
        setField(term1251, term1251.getClass(), "next", null);
        setField(term1251, term1251.getClass(), "first", null);
        setField(term1251, term1251.getClass(), "last", term1248);
        setField(term1251, term1251.getClass(), "propListHead", null);
        setIntField(term1251, term1251.getClass(), "sourcePosition", 0);
        setField(term1251, term1251.getClass(), "jsType", null);
        setField(term1251, term1251.getClass(), "parent", null);
        setField(term1246, term1246.getClass(), "first", term1251);
        setField(term1246, term1246.getClass(), "last", term1244);
        setField(term1246, term1246.getClass(), "propListHead", null);
        setIntField(term1246, term1246.getClass(), "sourcePosition", 0);
        setField(term1246, term1246.getClass(), "jsType", null);
        setField(term1246, term1246.getClass(), "parent", null);
        setField(term1244, term1244.getClass(), "next", term1246);
        setField(term1244, term1244.getClass(), "first", term1248);
        setIntField(term1255, term1255.getClass(), "type", 644154104);
        setIntField(term1257, term1257.getClass(), "type", 76650923);
        setField(term1257, term1257.getClass(), "next", null);
        setField(term1257, term1257.getClass(), "first", term1251);
        setField(term1257, term1257.getClass(), "last", term1246);
        setField(term1257, term1257.getClass(), "propListHead", null);
        setIntField(term1257, term1257.getClass(), "sourcePosition", 0);
        setField(term1257, term1257.getClass(), "jsType", null);
        setField(term1257, term1257.getClass(), "parent", null);
        setField(term1255, term1255.getClass(), "next", term1257);
        setField(term1255, term1255.getClass(), "first", term1242);
        setField(term1255, term1255.getClass(), "last", term1242);
        setField(term1255, term1255.getClass(), "propListHead", null);
        setIntField(term1255, term1255.getClass(), "sourcePosition", 0);
        setField(term1255, term1255.getClass(), "jsType", null);
        setField(term1255, term1255.getClass(), "parent", null);
        setField(term1244, term1244.getClass(), "last", term1255);
        setField(term1244, term1244.getClass(), "propListHead", null);
        setIntField(term1244, term1244.getClass(), "sourcePosition", 0);
        setField(term1244, term1244.getClass(), "jsType", null);
        setField(term1244, term1244.getClass(), "parent", null);
        setField(term1242, term1242.getClass(), "next", term1244);
        setIntField(term1262, term1262.getClass(), "type", 1003743923);
        setField(term1262, term1262.getClass(), "next", term1255);
        setField(term1262, term1262.getClass(), "first", term1257);
        setField(term1262, term1262.getClass(), "last", term1240);
        setField(term1262, term1262.getClass(), "propListHead", null);
        setIntField(term1262, term1262.getClass(), "sourcePosition", 0);
        setField(term1262, term1262.getClass(), "jsType", null);
        setField(term1262, term1262.getClass(), "parent", null);
        setField(term1242, term1242.getClass(), "first", term1262);
        setField(term1242, term1242.getClass(), "last", term1262);
        setField(term1242, term1242.getClass(), "propListHead", null);
        setIntField(term1242, term1242.getClass(), "sourcePosition", 0);
        setField(term1242, term1242.getClass(), "jsType", null);
        setField(term1242, term1242.getClass(), "parent", null);
        setField(term1240, term1240.getClass(), "next", term1242);
        setField(term1240, term1240.getClass(), "first", term1246);
        setField(term1240, term1240.getClass(), "last", term1248);
        setField(term1240, term1240.getClass(), "propListHead", null);
        setIntField(term1240, term1240.getClass(), "sourcePosition", 0);
        setField(term1240, term1240.getClass(), "jsType", null);
        setField(term1240, term1240.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1240;
        try {
            callMethod(klass, "continueNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


