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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getFunctionName_522147513165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175;

    public NodeUtil_getFunctionName_522147513165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term175, term175.getClass(), "type", 1225272962);
        setIntField(term177, term177.getClass(), "type", -112921587);
        setIntField(term179, term179.getClass(), "type", 0);
        setField(term179, term179.getClass(), "next", null);
        setField(term179, term179.getClass(), "first", null);
        setField(term179, term179.getClass(), "last", null);
        setField(term179, term179.getClass(), "propListHead", null);
        setIntField(term179, term179.getClass(), "sourcePosition", 0);
        setField(term179, term179.getClass(), "jsType", null);
        setField(term179, term179.getClass(), "parent", null);
        setField(term177, term177.getClass(), "next", term179);
        setIntField(term182, term182.getClass(), "type", 0);
        setField(term182, term182.getClass(), "next", null);
        setField(term182, term182.getClass(), "first", null);
        setField(term182, term182.getClass(), "last", null);
        setField(term182, term182.getClass(), "propListHead", null);
        setIntField(term182, term182.getClass(), "sourcePosition", 0);
        setField(term182, term182.getClass(), "jsType", null);
        setField(term182, term182.getClass(), "parent", null);
        setField(term177, term177.getClass(), "first", term182);
        setIntField(term185, term185.getClass(), "type", 0);
        setField(term185, term185.getClass(), "next", null);
        setField(term185, term185.getClass(), "first", null);
        setField(term185, term185.getClass(), "last", null);
        setField(term185, term185.getClass(), "propListHead", null);
        setIntField(term185, term185.getClass(), "sourcePosition", 0);
        setField(term185, term185.getClass(), "jsType", null);
        setField(term185, term185.getClass(), "parent", null);
        setField(term177, term177.getClass(), "last", term185);
        setField(term177, term177.getClass(), "propListHead", null);
        setIntField(term177, term177.getClass(), "sourcePosition", 0);
        setField(term177, term177.getClass(), "jsType", null);
        setField(term177, term177.getClass(), "parent", null);
        setField(term175, term175.getClass(), "next", term177);
        setIntField(term189, term189.getClass(), "type", 0);
        setField(term189, term189.getClass(), "next", null);
        setField(term189, term189.getClass(), "first", null);
        setField(term189, term189.getClass(), "last", null);
        setField(term189, term189.getClass(), "propListHead", null);
        setIntField(term189, term189.getClass(), "sourcePosition", 0);
        setField(term189, term189.getClass(), "jsType", null);
        setField(term189, term189.getClass(), "parent", null);
        setField(term175, term175.getClass(), "first", term189);
        setIntField(term192, term192.getClass(), "type", 0);
        setField(term192, term192.getClass(), "next", null);
        setField(term192, term192.getClass(), "first", null);
        setField(term192, term192.getClass(), "last", null);
        setField(term192, term192.getClass(), "propListHead", null);
        setIntField(term192, term192.getClass(), "sourcePosition", 0);
        setField(term192, term192.getClass(), "jsType", null);
        setField(term192, term192.getClass(), "parent", null);
        setField(term175, term175.getClass(), "last", term192);
        setField(term175, term175.getClass(), "propListHead", null);
        setIntField(term175, term175.getClass(), "sourcePosition", 0);
        setField(term175, term175.getClass(), "jsType", null);
        setField(term175, term175.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term175;
        try {
            callMethod(klass, "getFunctionName", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


