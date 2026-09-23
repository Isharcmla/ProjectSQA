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

public class NodeUtil_getCount_725644382289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3178;

    public NodeUtil_getCount_725644382289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3178, term3178.getClass(), "type", 249657454);
        setIntField(term3180, term3180.getClass(), "type", -1600748613);
        setIntField(term3182, term3182.getClass(), "type", 0);
        setField(term3182, term3182.getClass(), "next", null);
        setField(term3182, term3182.getClass(), "first", null);
        setField(term3182, term3182.getClass(), "last", null);
        setField(term3182, term3182.getClass(), "propListHead", null);
        setIntField(term3182, term3182.getClass(), "sourcePosition", 0);
        setField(term3182, term3182.getClass(), "jsType", null);
        setField(term3182, term3182.getClass(), "parent", null);
        setField(term3180, term3180.getClass(), "next", term3182);
        setIntField(term3185, term3185.getClass(), "type", 0);
        setField(term3185, term3185.getClass(), "next", null);
        setField(term3185, term3185.getClass(), "first", null);
        setField(term3185, term3185.getClass(), "last", null);
        setField(term3185, term3185.getClass(), "propListHead", null);
        setIntField(term3185, term3185.getClass(), "sourcePosition", 0);
        setField(term3185, term3185.getClass(), "jsType", null);
        setField(term3185, term3185.getClass(), "parent", null);
        setField(term3180, term3180.getClass(), "first", term3185);
        setIntField(term3188, term3188.getClass(), "type", 0);
        setField(term3188, term3188.getClass(), "next", null);
        setField(term3188, term3188.getClass(), "first", null);
        setField(term3188, term3188.getClass(), "last", null);
        setField(term3188, term3188.getClass(), "propListHead", null);
        setIntField(term3188, term3188.getClass(), "sourcePosition", 0);
        setField(term3188, term3188.getClass(), "jsType", null);
        setField(term3188, term3188.getClass(), "parent", null);
        setField(term3180, term3180.getClass(), "last", term3188);
        setField(term3180, term3180.getClass(), "propListHead", null);
        setIntField(term3180, term3180.getClass(), "sourcePosition", 0);
        setField(term3180, term3180.getClass(), "jsType", null);
        setField(term3180, term3180.getClass(), "parent", null);
        setField(term3178, term3178.getClass(), "next", term3180);
        setIntField(term3192, term3192.getClass(), "type", 0);
        setField(term3192, term3192.getClass(), "next", null);
        setField(term3192, term3192.getClass(), "first", null);
        setField(term3192, term3192.getClass(), "last", null);
        setField(term3192, term3192.getClass(), "propListHead", null);
        setIntField(term3192, term3192.getClass(), "sourcePosition", 0);
        setField(term3192, term3192.getClass(), "jsType", null);
        setField(term3192, term3192.getClass(), "parent", null);
        setField(term3178, term3178.getClass(), "first", term3192);
        setIntField(term3195, term3195.getClass(), "type", 0);
        setField(term3195, term3195.getClass(), "next", null);
        setField(term3195, term3195.getClass(), "first", null);
        setField(term3195, term3195.getClass(), "last", null);
        setField(term3195, term3195.getClass(), "propListHead", null);
        setIntField(term3195, term3195.getClass(), "sourcePosition", 0);
        setField(term3195, term3195.getClass(), "jsType", null);
        setField(term3195, term3195.getClass(), "parent", null);
        setField(term3178, term3178.getClass(), "last", term3195);
        setField(term3178, term3178.getClass(), "propListHead", null);
        setIntField(term3178, term3178.getClass(), "sourcePosition", 0);
        setField(term3178, term3178.getClass(), "jsType", null);
        setField(term3178, term3178.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3178;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "getCount", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


