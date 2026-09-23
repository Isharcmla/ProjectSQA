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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getPrototypePropertyName_1544369638271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3270;

    public NodeUtil_getPrototypePropertyName_1544369638271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3270, term3270.getClass(), "type", 504525721);
        setIntField(term3272, term3272.getClass(), "type", 1835568392);
        setIntField(term3274, term3274.getClass(), "type", 457470807);
        setIntField(term3276, term3276.getClass(), "type", -994742871);
        setIntField(term3278, term3278.getClass(), "type", -222412326);
        setField(term3278, term3278.getClass(), "next", null);
        setField(term3278, term3278.getClass(), "first", null);
        setField(term3278, term3278.getClass(), "last", null);
        setField(term3278, term3278.getClass(), "propListHead", null);
        setIntField(term3278, term3278.getClass(), "sourcePosition", 0);
        setField(term3278, term3278.getClass(), "jsType", null);
        setField(term3278, term3278.getClass(), "parent", null);
        setField(term3276, term3276.getClass(), "next", term3278);
        setIntField(term3281, term3281.getClass(), "type", -299497261);
        setField(term3281, term3281.getClass(), "next", null);
        setField(term3281, term3281.getClass(), "first", null);
        setField(term3281, term3281.getClass(), "last", term3278);
        setField(term3281, term3281.getClass(), "propListHead", null);
        setIntField(term3281, term3281.getClass(), "sourcePosition", 0);
        setField(term3281, term3281.getClass(), "jsType", null);
        setField(term3281, term3281.getClass(), "parent", null);
        setField(term3276, term3276.getClass(), "first", term3281);
        setField(term3276, term3276.getClass(), "last", term3274);
        setField(term3276, term3276.getClass(), "propListHead", null);
        setIntField(term3276, term3276.getClass(), "sourcePosition", 0);
        setField(term3276, term3276.getClass(), "jsType", null);
        setField(term3276, term3276.getClass(), "parent", null);
        setField(term3274, term3274.getClass(), "next", term3276);
        setField(term3274, term3274.getClass(), "first", term3278);
        setIntField(term3285, term3285.getClass(), "type", 153009426);
        setIntField(term3287, term3287.getClass(), "type", 185751892);
        setField(term3287, term3287.getClass(), "next", null);
        setField(term3287, term3287.getClass(), "first", term3281);
        setField(term3287, term3287.getClass(), "last", term3276);
        setField(term3287, term3287.getClass(), "propListHead", null);
        setIntField(term3287, term3287.getClass(), "sourcePosition", 0);
        setField(term3287, term3287.getClass(), "jsType", null);
        setField(term3287, term3287.getClass(), "parent", null);
        setField(term3285, term3285.getClass(), "next", term3287);
        setField(term3285, term3285.getClass(), "first", term3272);
        setField(term3285, term3285.getClass(), "last", term3272);
        setField(term3285, term3285.getClass(), "propListHead", null);
        setIntField(term3285, term3285.getClass(), "sourcePosition", 0);
        setField(term3285, term3285.getClass(), "jsType", null);
        setField(term3285, term3285.getClass(), "parent", null);
        setField(term3274, term3274.getClass(), "last", term3285);
        setField(term3274, term3274.getClass(), "propListHead", null);
        setIntField(term3274, term3274.getClass(), "sourcePosition", 0);
        setField(term3274, term3274.getClass(), "jsType", null);
        setField(term3274, term3274.getClass(), "parent", null);
        setField(term3272, term3272.getClass(), "next", term3274);
        setIntField(term3292, term3292.getClass(), "type", 1068256001);
        setField(term3292, term3292.getClass(), "next", term3285);
        setField(term3292, term3292.getClass(), "first", term3287);
        setField(term3292, term3292.getClass(), "last", term3270);
        setField(term3292, term3292.getClass(), "propListHead", null);
        setIntField(term3292, term3292.getClass(), "sourcePosition", 0);
        setField(term3292, term3292.getClass(), "jsType", null);
        setField(term3292, term3292.getClass(), "parent", null);
        setField(term3272, term3272.getClass(), "first", term3292);
        setField(term3272, term3272.getClass(), "last", term3292);
        setField(term3272, term3272.getClass(), "propListHead", null);
        setIntField(term3272, term3272.getClass(), "sourcePosition", 0);
        setField(term3272, term3272.getClass(), "jsType", null);
        setField(term3272, term3272.getClass(), "parent", null);
        setField(term3270, term3270.getClass(), "next", term3272);
        setField(term3270, term3270.getClass(), "first", term3276);
        setField(term3270, term3270.getClass(), "last", term3278);
        setField(term3270, term3270.getClass(), "propListHead", null);
        setIntField(term3270, term3270.getClass(), "sourcePosition", 0);
        setField(term3270, term3270.getClass(), "jsType", null);
        setField(term3270, term3270.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3270;
        try {
            callMethod(klass, "getPrototypePropertyName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


