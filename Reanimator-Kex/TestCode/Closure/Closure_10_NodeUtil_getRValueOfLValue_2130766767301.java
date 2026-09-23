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

public class NodeUtil_getRValueOfLValue_2130766767301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4231;

    public NodeUtil_getRValueOfLValue_2130766767301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4231, term4231.getClass(), "type", 2081679151);
        setIntField(term4233, term4233.getClass(), "type", -1030167086);
        setIntField(term4235, term4235.getClass(), "type", -434230943);
        setIntField(term4237, term4237.getClass(), "type", 698633875);
        setIntField(term4239, term4239.getClass(), "type", 548468113);
        setField(term4239, term4239.getClass(), "next", null);
        setField(term4239, term4239.getClass(), "first", null);
        setField(term4239, term4239.getClass(), "last", null);
        setField(term4239, term4239.getClass(), "propListHead", null);
        setIntField(term4239, term4239.getClass(), "sourcePosition", 0);
        setField(term4239, term4239.getClass(), "jsType", null);
        setField(term4239, term4239.getClass(), "parent", null);
        setField(term4237, term4237.getClass(), "next", term4239);
        setIntField(term4242, term4242.getClass(), "type", 1701819905);
        setField(term4242, term4242.getClass(), "next", null);
        setField(term4242, term4242.getClass(), "first", null);
        setField(term4242, term4242.getClass(), "last", term4239);
        setField(term4242, term4242.getClass(), "propListHead", null);
        setIntField(term4242, term4242.getClass(), "sourcePosition", 0);
        setField(term4242, term4242.getClass(), "jsType", null);
        setField(term4242, term4242.getClass(), "parent", null);
        setField(term4237, term4237.getClass(), "first", term4242);
        setField(term4237, term4237.getClass(), "last", term4235);
        setField(term4237, term4237.getClass(), "propListHead", null);
        setIntField(term4237, term4237.getClass(), "sourcePosition", 0);
        setField(term4237, term4237.getClass(), "jsType", null);
        setField(term4237, term4237.getClass(), "parent", null);
        setField(term4235, term4235.getClass(), "next", term4237);
        setField(term4235, term4235.getClass(), "first", term4239);
        setIntField(term4246, term4246.getClass(), "type", -111082612);
        setIntField(term4248, term4248.getClass(), "type", 1253334988);
        setField(term4248, term4248.getClass(), "next", null);
        setField(term4248, term4248.getClass(), "first", term4242);
        setField(term4248, term4248.getClass(), "last", term4237);
        setField(term4248, term4248.getClass(), "propListHead", null);
        setIntField(term4248, term4248.getClass(), "sourcePosition", 0);
        setField(term4248, term4248.getClass(), "jsType", null);
        setField(term4248, term4248.getClass(), "parent", null);
        setField(term4246, term4246.getClass(), "next", term4248);
        setField(term4246, term4246.getClass(), "first", term4233);
        setField(term4246, term4246.getClass(), "last", term4233);
        setField(term4246, term4246.getClass(), "propListHead", null);
        setIntField(term4246, term4246.getClass(), "sourcePosition", 0);
        setField(term4246, term4246.getClass(), "jsType", null);
        setField(term4246, term4246.getClass(), "parent", null);
        setField(term4235, term4235.getClass(), "last", term4246);
        setField(term4235, term4235.getClass(), "propListHead", null);
        setIntField(term4235, term4235.getClass(), "sourcePosition", 0);
        setField(term4235, term4235.getClass(), "jsType", null);
        setField(term4235, term4235.getClass(), "parent", null);
        setField(term4233, term4233.getClass(), "next", term4235);
        setIntField(term4253, term4253.getClass(), "type", 1086709736);
        setField(term4253, term4253.getClass(), "next", term4246);
        setField(term4253, term4253.getClass(), "first", term4248);
        setField(term4253, term4253.getClass(), "last", term4231);
        setField(term4253, term4253.getClass(), "propListHead", null);
        setIntField(term4253, term4253.getClass(), "sourcePosition", 0);
        setField(term4253, term4253.getClass(), "jsType", null);
        setField(term4253, term4253.getClass(), "parent", null);
        setField(term4233, term4233.getClass(), "first", term4253);
        setField(term4233, term4233.getClass(), "last", term4253);
        setField(term4233, term4233.getClass(), "propListHead", null);
        setIntField(term4233, term4233.getClass(), "sourcePosition", 0);
        setField(term4233, term4233.getClass(), "jsType", null);
        setField(term4233, term4233.getClass(), "parent", null);
        setField(term4231, term4231.getClass(), "next", term4233);
        setField(term4231, term4231.getClass(), "first", term4237);
        setField(term4231, term4231.getClass(), "last", term4239);
        setField(term4231, term4231.getClass(), "propListHead", null);
        setIntField(term4231, term4231.getClass(), "sourcePosition", 0);
        setField(term4231, term4231.getClass(), "jsType", null);
        setField(term4231, term4231.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4231;
        try {
            callMethod(klass, "getRValueOfLValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


