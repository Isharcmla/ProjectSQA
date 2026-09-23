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

public class NodeUtil_getCount_725644382293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4233;

    public NodeUtil_getCount_725644382293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4233, term4233.getClass(), "type", 719185716);
        setIntField(term4235, term4235.getClass(), "type", 1624820010);
        setIntField(term4237, term4237.getClass(), "type", -831921156);
        setIntField(term4239, term4239.getClass(), "type", -2085566906);
        setIntField(term4241, term4241.getClass(), "type", 1773193728);
        setField(term4241, term4241.getClass(), "next", null);
        setField(term4241, term4241.getClass(), "first", null);
        setField(term4241, term4241.getClass(), "last", null);
        setField(term4241, term4241.getClass(), "propListHead", null);
        setIntField(term4241, term4241.getClass(), "sourcePosition", 0);
        setField(term4241, term4241.getClass(), "jsType", null);
        setField(term4241, term4241.getClass(), "parent", null);
        setField(term4239, term4239.getClass(), "next", term4241);
        setIntField(term4244, term4244.getClass(), "type", -1341357647);
        setField(term4244, term4244.getClass(), "next", null);
        setField(term4244, term4244.getClass(), "first", null);
        setField(term4244, term4244.getClass(), "last", term4241);
        setField(term4244, term4244.getClass(), "propListHead", null);
        setIntField(term4244, term4244.getClass(), "sourcePosition", 0);
        setField(term4244, term4244.getClass(), "jsType", null);
        setField(term4244, term4244.getClass(), "parent", null);
        setField(term4239, term4239.getClass(), "first", term4244);
        setField(term4239, term4239.getClass(), "last", term4237);
        setField(term4239, term4239.getClass(), "propListHead", null);
        setIntField(term4239, term4239.getClass(), "sourcePosition", 0);
        setField(term4239, term4239.getClass(), "jsType", null);
        setField(term4239, term4239.getClass(), "parent", null);
        setField(term4237, term4237.getClass(), "next", term4239);
        setField(term4237, term4237.getClass(), "first", term4241);
        setIntField(term4248, term4248.getClass(), "type", 114915275);
        setIntField(term4250, term4250.getClass(), "type", 338519695);
        setField(term4250, term4250.getClass(), "next", null);
        setField(term4250, term4250.getClass(), "first", term4244);
        setField(term4250, term4250.getClass(), "last", term4239);
        setField(term4250, term4250.getClass(), "propListHead", null);
        setIntField(term4250, term4250.getClass(), "sourcePosition", 0);
        setField(term4250, term4250.getClass(), "jsType", null);
        setField(term4250, term4250.getClass(), "parent", null);
        setField(term4248, term4248.getClass(), "next", term4250);
        setField(term4248, term4248.getClass(), "first", term4235);
        setField(term4248, term4248.getClass(), "last", term4235);
        setField(term4248, term4248.getClass(), "propListHead", null);
        setIntField(term4248, term4248.getClass(), "sourcePosition", 0);
        setField(term4248, term4248.getClass(), "jsType", null);
        setField(term4248, term4248.getClass(), "parent", null);
        setField(term4237, term4237.getClass(), "last", term4248);
        setField(term4237, term4237.getClass(), "propListHead", null);
        setIntField(term4237, term4237.getClass(), "sourcePosition", 0);
        setField(term4237, term4237.getClass(), "jsType", null);
        setField(term4237, term4237.getClass(), "parent", null);
        setField(term4235, term4235.getClass(), "next", term4237);
        setIntField(term4255, term4255.getClass(), "type", 2025566580);
        setField(term4255, term4255.getClass(), "next", term4248);
        setField(term4255, term4255.getClass(), "first", term4250);
        setField(term4255, term4255.getClass(), "last", term4233);
        setField(term4255, term4255.getClass(), "propListHead", null);
        setIntField(term4255, term4255.getClass(), "sourcePosition", 0);
        setField(term4255, term4255.getClass(), "jsType", null);
        setField(term4255, term4255.getClass(), "parent", null);
        setField(term4235, term4235.getClass(), "first", term4255);
        setField(term4235, term4235.getClass(), "last", term4255);
        setField(term4235, term4235.getClass(), "propListHead", null);
        setIntField(term4235, term4235.getClass(), "sourcePosition", 0);
        setField(term4235, term4235.getClass(), "jsType", null);
        setField(term4235, term4235.getClass(), "parent", null);
        setField(term4233, term4233.getClass(), "next", term4235);
        setField(term4233, term4233.getClass(), "first", term4239);
        setField(term4233, term4233.getClass(), "last", term4241);
        setField(term4233, term4233.getClass(), "propListHead", null);
        setIntField(term4233, term4233.getClass(), "sourcePosition", 0);
        setField(term4233, term4233.getClass(), "jsType", null);
        setField(term4233, term4233.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term4233;
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


