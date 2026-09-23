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

public class NodeUtil_newName_29866120273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2696;

    public NodeUtil_newName_29866120273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2696, term2696.getClass(), "type", -1174440096);
        setIntField(term2698, term2698.getClass(), "type", -191639503);
        setIntField(term2700, term2700.getClass(), "type", 0);
        setField(term2700, term2700.getClass(), "next", null);
        setField(term2700, term2700.getClass(), "first", null);
        setField(term2700, term2700.getClass(), "last", null);
        setField(term2700, term2700.getClass(), "propListHead", null);
        setIntField(term2700, term2700.getClass(), "sourcePosition", 0);
        setField(term2700, term2700.getClass(), "jsType", null);
        setField(term2700, term2700.getClass(), "parent", null);
        setField(term2698, term2698.getClass(), "next", term2700);
        setIntField(term2703, term2703.getClass(), "type", 0);
        setField(term2703, term2703.getClass(), "next", null);
        setField(term2703, term2703.getClass(), "first", null);
        setField(term2703, term2703.getClass(), "last", null);
        setField(term2703, term2703.getClass(), "propListHead", null);
        setIntField(term2703, term2703.getClass(), "sourcePosition", 0);
        setField(term2703, term2703.getClass(), "jsType", null);
        setField(term2703, term2703.getClass(), "parent", null);
        setField(term2698, term2698.getClass(), "first", term2703);
        setIntField(term2706, term2706.getClass(), "type", 0);
        setField(term2706, term2706.getClass(), "next", null);
        setField(term2706, term2706.getClass(), "first", null);
        setField(term2706, term2706.getClass(), "last", null);
        setField(term2706, term2706.getClass(), "propListHead", null);
        setIntField(term2706, term2706.getClass(), "sourcePosition", 0);
        setField(term2706, term2706.getClass(), "jsType", null);
        setField(term2706, term2706.getClass(), "parent", null);
        setField(term2698, term2698.getClass(), "last", term2706);
        setField(term2698, term2698.getClass(), "propListHead", null);
        setIntField(term2698, term2698.getClass(), "sourcePosition", 0);
        setField(term2698, term2698.getClass(), "jsType", null);
        setField(term2698, term2698.getClass(), "parent", null);
        setField(term2696, term2696.getClass(), "next", term2698);
        setIntField(term2710, term2710.getClass(), "type", 0);
        setField(term2710, term2710.getClass(), "next", null);
        setField(term2710, term2710.getClass(), "first", null);
        setField(term2710, term2710.getClass(), "last", null);
        setField(term2710, term2710.getClass(), "propListHead", null);
        setIntField(term2710, term2710.getClass(), "sourcePosition", 0);
        setField(term2710, term2710.getClass(), "jsType", null);
        setField(term2710, term2710.getClass(), "parent", null);
        setField(term2696, term2696.getClass(), "first", term2710);
        setIntField(term2713, term2713.getClass(), "type", 0);
        setField(term2713, term2713.getClass(), "next", null);
        setField(term2713, term2713.getClass(), "first", null);
        setField(term2713, term2713.getClass(), "last", null);
        setField(term2713, term2713.getClass(), "propListHead", null);
        setIntField(term2713, term2713.getClass(), "sourcePosition", 0);
        setField(term2713, term2713.getClass(), "jsType", null);
        setField(term2713, term2713.getClass(), "parent", null);
        setField(term2696, term2696.getClass(), "last", term2713);
        setField(term2696, term2696.getClass(), "propListHead", null);
        setIntField(term2696, term2696.getClass(), "sourcePosition", 0);
        setField(term2696, term2696.getClass(), "jsType", null);
        setField(term2696, term2696.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "hNxWaHcfhY";
        args[2] = term2696;
        try {
            callMethod(klass, "newName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


