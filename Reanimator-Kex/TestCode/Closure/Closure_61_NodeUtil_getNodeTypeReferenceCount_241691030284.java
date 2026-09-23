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
import java.lang.Integer;

public class NodeUtil_getNodeTypeReferenceCount_241691030284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3005;
     Object term3026;

    public NodeUtil_getNodeTypeReferenceCount_241691030284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3005, term3005.getClass(), "type", 1505375686);
        setIntField(term3007, term3007.getClass(), "type", 444514470);
        setIntField(term3009, term3009.getClass(), "type", 0);
        setField(term3009, term3009.getClass(), "next", null);
        setField(term3009, term3009.getClass(), "first", null);
        setField(term3009, term3009.getClass(), "last", null);
        setField(term3009, term3009.getClass(), "propListHead", null);
        setIntField(term3009, term3009.getClass(), "sourcePosition", 0);
        setField(term3009, term3009.getClass(), "jsType", null);
        setField(term3009, term3009.getClass(), "parent", null);
        setField(term3007, term3007.getClass(), "next", term3009);
        setIntField(term3012, term3012.getClass(), "type", 0);
        setField(term3012, term3012.getClass(), "next", null);
        setField(term3012, term3012.getClass(), "first", null);
        setField(term3012, term3012.getClass(), "last", null);
        setField(term3012, term3012.getClass(), "propListHead", null);
        setIntField(term3012, term3012.getClass(), "sourcePosition", 0);
        setField(term3012, term3012.getClass(), "jsType", null);
        setField(term3012, term3012.getClass(), "parent", null);
        setField(term3007, term3007.getClass(), "first", term3012);
        setIntField(term3015, term3015.getClass(), "type", 0);
        setField(term3015, term3015.getClass(), "next", null);
        setField(term3015, term3015.getClass(), "first", null);
        setField(term3015, term3015.getClass(), "last", null);
        setField(term3015, term3015.getClass(), "propListHead", null);
        setIntField(term3015, term3015.getClass(), "sourcePosition", 0);
        setField(term3015, term3015.getClass(), "jsType", null);
        setField(term3015, term3015.getClass(), "parent", null);
        setField(term3007, term3007.getClass(), "last", term3015);
        setField(term3007, term3007.getClass(), "propListHead", null);
        setIntField(term3007, term3007.getClass(), "sourcePosition", 0);
        setField(term3007, term3007.getClass(), "jsType", null);
        setField(term3007, term3007.getClass(), "parent", null);
        setField(term3005, term3005.getClass(), "next", term3007);
        setIntField(term3019, term3019.getClass(), "type", 0);
        setField(term3019, term3019.getClass(), "next", null);
        setField(term3019, term3019.getClass(), "first", null);
        setField(term3019, term3019.getClass(), "last", null);
        setField(term3019, term3019.getClass(), "propListHead", null);
        setIntField(term3019, term3019.getClass(), "sourcePosition", 0);
        setField(term3019, term3019.getClass(), "jsType", null);
        setField(term3019, term3019.getClass(), "parent", null);
        setField(term3005, term3005.getClass(), "first", term3019);
        setIntField(term3022, term3022.getClass(), "type", 0);
        setField(term3022, term3022.getClass(), "next", null);
        setField(term3022, term3022.getClass(), "first", null);
        setField(term3022, term3022.getClass(), "last", null);
        setField(term3022, term3022.getClass(), "propListHead", null);
        setIntField(term3022, term3022.getClass(), "sourcePosition", 0);
        setField(term3022, term3022.getClass(), "jsType", null);
        setField(term3022, term3022.getClass(), "parent", null);
        setField(term3005, term3005.getClass(), "last", term3022);
        setField(term3005, term3005.getClass(), "propListHead", null);
        setIntField(term3005, term3005.getClass(), "sourcePosition", 0);
        setField(term3005, term3005.getClass(), "jsType", null);
        setField(term3005, term3005.getClass(), "parent", null);
        term3026 = new Integer(961252909);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3005;
        args[1] = term3026;
        args[2] = null;
        try {
            callMethod(klass, "getNodeTypeReferenceCount", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


