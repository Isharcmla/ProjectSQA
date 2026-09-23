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

public class NodeUtil_getCatchBlock_1684668872206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3089;

    public NodeUtil_getCatchBlock_1684668872206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3102 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3112 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3089, term3089.getClass(), "type", 1112256038);
        setIntField(term3091, term3091.getClass(), "type", -742476678);
        setIntField(term3093, term3093.getClass(), "type", 0);
        setField(term3093, term3093.getClass(), "next", null);
        setField(term3093, term3093.getClass(), "first", null);
        setField(term3093, term3093.getClass(), "last", null);
        setField(term3093, term3093.getClass(), "propListHead", null);
        setIntField(term3093, term3093.getClass(), "sourcePosition", 0);
        setField(term3093, term3093.getClass(), "jsType", null);
        setField(term3093, term3093.getClass(), "parent", null);
        setField(term3091, term3091.getClass(), "next", term3093);
        setIntField(term3096, term3096.getClass(), "type", 0);
        setField(term3096, term3096.getClass(), "next", null);
        setField(term3096, term3096.getClass(), "first", null);
        setField(term3096, term3096.getClass(), "last", null);
        setField(term3096, term3096.getClass(), "propListHead", null);
        setIntField(term3096, term3096.getClass(), "sourcePosition", 0);
        setField(term3096, term3096.getClass(), "jsType", null);
        setField(term3096, term3096.getClass(), "parent", null);
        setField(term3091, term3091.getClass(), "first", term3096);
        setIntField(term3099, term3099.getClass(), "type", 0);
        setField(term3099, term3099.getClass(), "next", null);
        setField(term3099, term3099.getClass(), "first", null);
        setField(term3099, term3099.getClass(), "last", null);
        setField(term3099, term3099.getClass(), "propListHead", null);
        setIntField(term3099, term3099.getClass(), "sourcePosition", 0);
        setField(term3099, term3099.getClass(), "jsType", null);
        setField(term3099, term3099.getClass(), "parent", null);
        setField(term3091, term3091.getClass(), "last", term3099);
        setField(term3102, term3102.getClass(), "next", null);
        setIntField(term3102, term3102.getClass(), "type", 0);
        setIntField(term3102, term3102.getClass(), "intValue", 0);
        setField(term3102, term3102.getClass(), "objectValue", null);
        setField(term3091, term3091.getClass(), "propListHead", term3102);
        setIntField(term3091, term3091.getClass(), "sourcePosition", -1147965121);
        setField(term3091, term3091.getClass(), "jsType", null);
        setField(term3091, term3091.getClass(), "parent", null);
        setField(term3089, term3089.getClass(), "next", term3091);
        setIntField(term3106, term3106.getClass(), "type", 0);
        setField(term3106, term3106.getClass(), "next", null);
        setField(term3106, term3106.getClass(), "first", null);
        setField(term3106, term3106.getClass(), "last", null);
        setField(term3106, term3106.getClass(), "propListHead", null);
        setIntField(term3106, term3106.getClass(), "sourcePosition", 0);
        setField(term3106, term3106.getClass(), "jsType", null);
        setField(term3106, term3106.getClass(), "parent", null);
        setField(term3089, term3089.getClass(), "first", term3106);
        setIntField(term3109, term3109.getClass(), "type", 0);
        setField(term3109, term3109.getClass(), "next", null);
        setField(term3109, term3109.getClass(), "first", null);
        setField(term3109, term3109.getClass(), "last", null);
        setField(term3109, term3109.getClass(), "propListHead", null);
        setIntField(term3109, term3109.getClass(), "sourcePosition", 0);
        setField(term3109, term3109.getClass(), "jsType", null);
        setField(term3109, term3109.getClass(), "parent", null);
        setField(term3089, term3089.getClass(), "last", term3109);
        setField(term3112, term3112.getClass(), "next", null);
        setIntField(term3112, term3112.getClass(), "type", 0);
        setIntField(term3112, term3112.getClass(), "intValue", 0);
        setField(term3112, term3112.getClass(), "objectValue", null);
        setField(term3089, term3089.getClass(), "propListHead", term3112);
        setIntField(term3089, term3089.getClass(), "sourcePosition", -867099093);
        setField(term3089, term3089.getClass(), "jsType", null);
        setField(term3089, term3089.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3089;
        try {
            callMethod(klass, "getCatchBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


