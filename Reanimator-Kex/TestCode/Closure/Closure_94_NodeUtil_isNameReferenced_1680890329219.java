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

public class NodeUtil_isNameReferenced_1680890329219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3019;

    public NodeUtil_isNameReferenced_1680890329219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3032 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3042 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3019, term3019.getClass(), "type", 537273345);
        setIntField(term3021, term3021.getClass(), "type", -441333794);
        setIntField(term3023, term3023.getClass(), "type", 0);
        setField(term3023, term3023.getClass(), "next", null);
        setField(term3023, term3023.getClass(), "first", null);
        setField(term3023, term3023.getClass(), "last", null);
        setField(term3023, term3023.getClass(), "propListHead", null);
        setIntField(term3023, term3023.getClass(), "sourcePosition", 0);
        setField(term3023, term3023.getClass(), "jsType", null);
        setField(term3023, term3023.getClass(), "parent", null);
        setField(term3021, term3021.getClass(), "next", term3023);
        setIntField(term3026, term3026.getClass(), "type", 0);
        setField(term3026, term3026.getClass(), "next", null);
        setField(term3026, term3026.getClass(), "first", null);
        setField(term3026, term3026.getClass(), "last", null);
        setField(term3026, term3026.getClass(), "propListHead", null);
        setIntField(term3026, term3026.getClass(), "sourcePosition", 0);
        setField(term3026, term3026.getClass(), "jsType", null);
        setField(term3026, term3026.getClass(), "parent", null);
        setField(term3021, term3021.getClass(), "first", term3026);
        setIntField(term3029, term3029.getClass(), "type", 0);
        setField(term3029, term3029.getClass(), "next", null);
        setField(term3029, term3029.getClass(), "first", null);
        setField(term3029, term3029.getClass(), "last", null);
        setField(term3029, term3029.getClass(), "propListHead", null);
        setIntField(term3029, term3029.getClass(), "sourcePosition", 0);
        setField(term3029, term3029.getClass(), "jsType", null);
        setField(term3029, term3029.getClass(), "parent", null);
        setField(term3021, term3021.getClass(), "last", term3029);
        setField(term3032, term3032.getClass(), "next", null);
        setIntField(term3032, term3032.getClass(), "type", 0);
        setIntField(term3032, term3032.getClass(), "intValue", 0);
        setField(term3032, term3032.getClass(), "objectValue", null);
        setField(term3021, term3021.getClass(), "propListHead", term3032);
        setIntField(term3021, term3021.getClass(), "sourcePosition", -742476678);
        setField(term3021, term3021.getClass(), "jsType", null);
        setField(term3021, term3021.getClass(), "parent", null);
        setField(term3019, term3019.getClass(), "next", term3021);
        setIntField(term3036, term3036.getClass(), "type", 0);
        setField(term3036, term3036.getClass(), "next", null);
        setField(term3036, term3036.getClass(), "first", null);
        setField(term3036, term3036.getClass(), "last", null);
        setField(term3036, term3036.getClass(), "propListHead", null);
        setIntField(term3036, term3036.getClass(), "sourcePosition", 0);
        setField(term3036, term3036.getClass(), "jsType", null);
        setField(term3036, term3036.getClass(), "parent", null);
        setField(term3019, term3019.getClass(), "first", term3036);
        setIntField(term3039, term3039.getClass(), "type", 0);
        setField(term3039, term3039.getClass(), "next", null);
        setField(term3039, term3039.getClass(), "first", null);
        setField(term3039, term3039.getClass(), "last", null);
        setField(term3039, term3039.getClass(), "propListHead", null);
        setIntField(term3039, term3039.getClass(), "sourcePosition", 0);
        setField(term3039, term3039.getClass(), "jsType", null);
        setField(term3039, term3039.getClass(), "parent", null);
        setField(term3019, term3019.getClass(), "last", term3039);
        setField(term3042, term3042.getClass(), "next", null);
        setIntField(term3042, term3042.getClass(), "type", 0);
        setIntField(term3042, term3042.getClass(), "intValue", 0);
        setField(term3042, term3042.getClass(), "objectValue", null);
        setField(term3019, term3019.getClass(), "propListHead", term3042);
        setIntField(term3019, term3019.getClass(), "sourcePosition", -824369460);
        setField(term3019, term3019.getClass(), "jsType", null);
        setField(term3019, term3019.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3019;
        args[1] = "eZFUvlxvGV";
        args[2] = null;
        try {
            callMethod(klass, "isNameReferenced", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


