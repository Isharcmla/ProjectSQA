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

public class NodeUtil_hasFinally_1906674990203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3035;

    public NodeUtil_hasFinally_1906674990203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3048 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3058 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3035, term3035.getClass(), "type", 1624820010);
        setIntField(term3037, term3037.getClass(), "type", -1341357647);
        setIntField(term3039, term3039.getClass(), "type", 0);
        setField(term3039, term3039.getClass(), "next", null);
        setField(term3039, term3039.getClass(), "first", null);
        setField(term3039, term3039.getClass(), "last", null);
        setField(term3039, term3039.getClass(), "propListHead", null);
        setIntField(term3039, term3039.getClass(), "sourcePosition", 0);
        setField(term3039, term3039.getClass(), "jsType", null);
        setField(term3039, term3039.getClass(), "parent", null);
        setField(term3037, term3037.getClass(), "next", term3039);
        setIntField(term3042, term3042.getClass(), "type", 0);
        setField(term3042, term3042.getClass(), "next", null);
        setField(term3042, term3042.getClass(), "first", null);
        setField(term3042, term3042.getClass(), "last", null);
        setField(term3042, term3042.getClass(), "propListHead", null);
        setIntField(term3042, term3042.getClass(), "sourcePosition", 0);
        setField(term3042, term3042.getClass(), "jsType", null);
        setField(term3042, term3042.getClass(), "parent", null);
        setField(term3037, term3037.getClass(), "first", term3042);
        setIntField(term3045, term3045.getClass(), "type", 0);
        setField(term3045, term3045.getClass(), "next", null);
        setField(term3045, term3045.getClass(), "first", null);
        setField(term3045, term3045.getClass(), "last", null);
        setField(term3045, term3045.getClass(), "propListHead", null);
        setIntField(term3045, term3045.getClass(), "sourcePosition", 0);
        setField(term3045, term3045.getClass(), "jsType", null);
        setField(term3045, term3045.getClass(), "parent", null);
        setField(term3037, term3037.getClass(), "last", term3045);
        setField(term3048, term3048.getClass(), "next", null);
        setIntField(term3048, term3048.getClass(), "type", 0);
        setIntField(term3048, term3048.getClass(), "intValue", 0);
        setField(term3048, term3048.getClass(), "objectValue", null);
        setField(term3037, term3037.getClass(), "propListHead", term3048);
        setIntField(term3037, term3037.getClass(), "sourcePosition", 338519695);
        setField(term3037, term3037.getClass(), "jsType", null);
        setField(term3037, term3037.getClass(), "parent", null);
        setField(term3035, term3035.getClass(), "next", term3037);
        setIntField(term3052, term3052.getClass(), "type", 0);
        setField(term3052, term3052.getClass(), "next", null);
        setField(term3052, term3052.getClass(), "first", null);
        setField(term3052, term3052.getClass(), "last", null);
        setField(term3052, term3052.getClass(), "propListHead", null);
        setIntField(term3052, term3052.getClass(), "sourcePosition", 0);
        setField(term3052, term3052.getClass(), "jsType", null);
        setField(term3052, term3052.getClass(), "parent", null);
        setField(term3035, term3035.getClass(), "first", term3052);
        setIntField(term3055, term3055.getClass(), "type", 0);
        setField(term3055, term3055.getClass(), "next", null);
        setField(term3055, term3055.getClass(), "first", null);
        setField(term3055, term3055.getClass(), "last", null);
        setField(term3055, term3055.getClass(), "propListHead", null);
        setIntField(term3055, term3055.getClass(), "sourcePosition", 0);
        setField(term3055, term3055.getClass(), "jsType", null);
        setField(term3055, term3055.getClass(), "parent", null);
        setField(term3035, term3035.getClass(), "last", term3055);
        setField(term3058, term3058.getClass(), "next", null);
        setIntField(term3058, term3058.getClass(), "type", 0);
        setIntField(term3058, term3058.getClass(), "intValue", 0);
        setField(term3058, term3058.getClass(), "objectValue", null);
        setField(term3035, term3035.getClass(), "propListHead", term3058);
        setIntField(term3035, term3035.getClass(), "sourcePosition", 2025566580);
        setField(term3035, term3035.getClass(), "jsType", null);
        setField(term3035, term3035.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3035;
        try {
            callMethod(klass, "hasFinally", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


