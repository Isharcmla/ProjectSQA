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

public class NodeUtil_getNodeTypeReferenceCount_241691030274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373;
     Object term3400;

    public NodeUtil_getNodeTypeReferenceCount_241691030274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3373, term3373.getClass(), "type", -1823255084);
        setIntField(term3375, term3375.getClass(), "type", 793345010);
        setIntField(term3377, term3377.getClass(), "type", -2092117838);
        setIntField(term3379, term3379.getClass(), "type", 1524590776);
        setIntField(term3381, term3381.getClass(), "type", 1523896653);
        setField(term3381, term3381.getClass(), "next", null);
        setField(term3381, term3381.getClass(), "first", null);
        setField(term3381, term3381.getClass(), "last", null);
        setField(term3381, term3381.getClass(), "propListHead", null);
        setIntField(term3381, term3381.getClass(), "sourcePosition", 0);
        setField(term3381, term3381.getClass(), "jsType", null);
        setField(term3381, term3381.getClass(), "parent", null);
        setField(term3379, term3379.getClass(), "next", term3381);
        setIntField(term3384, term3384.getClass(), "type", -1731921726);
        setField(term3384, term3384.getClass(), "next", null);
        setField(term3384, term3384.getClass(), "first", null);
        setField(term3384, term3384.getClass(), "last", term3381);
        setField(term3384, term3384.getClass(), "propListHead", null);
        setIntField(term3384, term3384.getClass(), "sourcePosition", 0);
        setField(term3384, term3384.getClass(), "jsType", null);
        setField(term3384, term3384.getClass(), "parent", null);
        setField(term3379, term3379.getClass(), "first", term3384);
        setField(term3379, term3379.getClass(), "last", term3377);
        setField(term3379, term3379.getClass(), "propListHead", null);
        setIntField(term3379, term3379.getClass(), "sourcePosition", 0);
        setField(term3379, term3379.getClass(), "jsType", null);
        setField(term3379, term3379.getClass(), "parent", null);
        setField(term3377, term3377.getClass(), "next", term3379);
        setField(term3377, term3377.getClass(), "first", term3381);
        setIntField(term3388, term3388.getClass(), "type", 183531701);
        setIntField(term3390, term3390.getClass(), "type", -974923743);
        setField(term3390, term3390.getClass(), "next", null);
        setField(term3390, term3390.getClass(), "first", term3384);
        setField(term3390, term3390.getClass(), "last", term3379);
        setField(term3390, term3390.getClass(), "propListHead", null);
        setIntField(term3390, term3390.getClass(), "sourcePosition", 0);
        setField(term3390, term3390.getClass(), "jsType", null);
        setField(term3390, term3390.getClass(), "parent", null);
        setField(term3388, term3388.getClass(), "next", term3390);
        setField(term3388, term3388.getClass(), "first", term3375);
        setField(term3388, term3388.getClass(), "last", term3375);
        setField(term3388, term3388.getClass(), "propListHead", null);
        setIntField(term3388, term3388.getClass(), "sourcePosition", 0);
        setField(term3388, term3388.getClass(), "jsType", null);
        setField(term3388, term3388.getClass(), "parent", null);
        setField(term3377, term3377.getClass(), "last", term3388);
        setField(term3377, term3377.getClass(), "propListHead", null);
        setIntField(term3377, term3377.getClass(), "sourcePosition", 0);
        setField(term3377, term3377.getClass(), "jsType", null);
        setField(term3377, term3377.getClass(), "parent", null);
        setField(term3375, term3375.getClass(), "next", term3377);
        setIntField(term3395, term3395.getClass(), "type", 1876738932);
        setField(term3395, term3395.getClass(), "next", term3388);
        setField(term3395, term3395.getClass(), "first", term3390);
        setField(term3395, term3395.getClass(), "last", term3373);
        setField(term3395, term3395.getClass(), "propListHead", null);
        setIntField(term3395, term3395.getClass(), "sourcePosition", 0);
        setField(term3395, term3395.getClass(), "jsType", null);
        setField(term3395, term3395.getClass(), "parent", null);
        setField(term3375, term3375.getClass(), "first", term3395);
        setField(term3375, term3375.getClass(), "last", term3395);
        setField(term3375, term3375.getClass(), "propListHead", null);
        setIntField(term3375, term3375.getClass(), "sourcePosition", 0);
        setField(term3375, term3375.getClass(), "jsType", null);
        setField(term3375, term3375.getClass(), "parent", null);
        setField(term3373, term3373.getClass(), "next", term3375);
        setField(term3373, term3373.getClass(), "first", term3379);
        setField(term3373, term3373.getClass(), "last", term3381);
        setField(term3373, term3373.getClass(), "propListHead", null);
        setIntField(term3373, term3373.getClass(), "sourcePosition", 0);
        setField(term3373, term3373.getClass(), "jsType", null);
        setField(term3373, term3373.getClass(), "parent", null);
        term3400 = new Integer(-1870339027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3373;
        args[1] = term3400;
        args[2] = null;
        try {
            callMethod(klass, "getNodeTypeReferenceCount", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


