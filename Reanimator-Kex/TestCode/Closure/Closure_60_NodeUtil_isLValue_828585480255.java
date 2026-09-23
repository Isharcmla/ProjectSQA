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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_isLValue_828585480255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2150;

    public NodeUtil_isLValue_828585480255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2150, term2150.getClass(), "type", -1142164411);
        setIntField(term2152, term2152.getClass(), "type", -965421502);
        setIntField(term2154, term2154.getClass(), "type", 0);
        setField(term2154, term2154.getClass(), "next", null);
        setField(term2154, term2154.getClass(), "first", null);
        setField(term2154, term2154.getClass(), "last", null);
        setField(term2154, term2154.getClass(), "propListHead", null);
        setIntField(term2154, term2154.getClass(), "sourcePosition", 0);
        setField(term2154, term2154.getClass(), "jsType", null);
        setField(term2154, term2154.getClass(), "parent", null);
        setField(term2152, term2152.getClass(), "next", term2154);
        setIntField(term2157, term2157.getClass(), "type", 0);
        setField(term2157, term2157.getClass(), "next", null);
        setField(term2157, term2157.getClass(), "first", null);
        setField(term2157, term2157.getClass(), "last", null);
        setField(term2157, term2157.getClass(), "propListHead", null);
        setIntField(term2157, term2157.getClass(), "sourcePosition", 0);
        setField(term2157, term2157.getClass(), "jsType", null);
        setField(term2157, term2157.getClass(), "parent", null);
        setField(term2152, term2152.getClass(), "first", term2157);
        setIntField(term2160, term2160.getClass(), "type", 0);
        setField(term2160, term2160.getClass(), "next", null);
        setField(term2160, term2160.getClass(), "first", null);
        setField(term2160, term2160.getClass(), "last", null);
        setField(term2160, term2160.getClass(), "propListHead", null);
        setIntField(term2160, term2160.getClass(), "sourcePosition", 0);
        setField(term2160, term2160.getClass(), "jsType", null);
        setField(term2160, term2160.getClass(), "parent", null);
        setField(term2152, term2152.getClass(), "last", term2160);
        setField(term2152, term2152.getClass(), "propListHead", null);
        setIntField(term2152, term2152.getClass(), "sourcePosition", 0);
        setField(term2152, term2152.getClass(), "jsType", null);
        setField(term2152, term2152.getClass(), "parent", null);
        setField(term2150, term2150.getClass(), "next", term2152);
        setIntField(term2164, term2164.getClass(), "type", 0);
        setField(term2164, term2164.getClass(), "next", null);
        setField(term2164, term2164.getClass(), "first", null);
        setField(term2164, term2164.getClass(), "last", null);
        setField(term2164, term2164.getClass(), "propListHead", null);
        setIntField(term2164, term2164.getClass(), "sourcePosition", 0);
        setField(term2164, term2164.getClass(), "jsType", null);
        setField(term2164, term2164.getClass(), "parent", null);
        setField(term2150, term2150.getClass(), "first", term2164);
        setIntField(term2167, term2167.getClass(), "type", 0);
        setField(term2167, term2167.getClass(), "next", null);
        setField(term2167, term2167.getClass(), "first", null);
        setField(term2167, term2167.getClass(), "last", null);
        setField(term2167, term2167.getClass(), "propListHead", null);
        setIntField(term2167, term2167.getClass(), "sourcePosition", 0);
        setField(term2167, term2167.getClass(), "jsType", null);
        setField(term2167, term2167.getClass(), "parent", null);
        setField(term2150, term2150.getClass(), "last", term2167);
        setField(term2150, term2150.getClass(), "propListHead", null);
        setIntField(term2150, term2150.getClass(), "sourcePosition", 0);
        setField(term2150, term2150.getClass(), "jsType", null);
        setField(term2150, term2150.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2150;
        try {
            callMethod(klass, "isLValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


