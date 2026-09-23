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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_newVarNode_930235028283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2974;

    public NodeUtil_newVarNode_930235028283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2974, term2974.getClass(), "type", 823179298);
        setIntField(term2976, term2976.getClass(), "type", 932810106);
        setIntField(term2978, term2978.getClass(), "type", 0);
        setField(term2978, term2978.getClass(), "next", null);
        setField(term2978, term2978.getClass(), "first", null);
        setField(term2978, term2978.getClass(), "last", null);
        setField(term2978, term2978.getClass(), "propListHead", null);
        setIntField(term2978, term2978.getClass(), "sourcePosition", 0);
        setField(term2978, term2978.getClass(), "jsType", null);
        setField(term2978, term2978.getClass(), "parent", null);
        setField(term2976, term2976.getClass(), "next", term2978);
        setIntField(term2981, term2981.getClass(), "type", 0);
        setField(term2981, term2981.getClass(), "next", null);
        setField(term2981, term2981.getClass(), "first", null);
        setField(term2981, term2981.getClass(), "last", null);
        setField(term2981, term2981.getClass(), "propListHead", null);
        setIntField(term2981, term2981.getClass(), "sourcePosition", 0);
        setField(term2981, term2981.getClass(), "jsType", null);
        setField(term2981, term2981.getClass(), "parent", null);
        setField(term2976, term2976.getClass(), "first", term2981);
        setIntField(term2984, term2984.getClass(), "type", 0);
        setField(term2984, term2984.getClass(), "next", null);
        setField(term2984, term2984.getClass(), "first", null);
        setField(term2984, term2984.getClass(), "last", null);
        setField(term2984, term2984.getClass(), "propListHead", null);
        setIntField(term2984, term2984.getClass(), "sourcePosition", 0);
        setField(term2984, term2984.getClass(), "jsType", null);
        setField(term2984, term2984.getClass(), "parent", null);
        setField(term2976, term2976.getClass(), "last", term2984);
        setField(term2976, term2976.getClass(), "propListHead", null);
        setIntField(term2976, term2976.getClass(), "sourcePosition", 0);
        setField(term2976, term2976.getClass(), "jsType", null);
        setField(term2976, term2976.getClass(), "parent", null);
        setField(term2974, term2974.getClass(), "next", term2976);
        setIntField(term2988, term2988.getClass(), "type", 0);
        setField(term2988, term2988.getClass(), "next", null);
        setField(term2988, term2988.getClass(), "first", null);
        setField(term2988, term2988.getClass(), "last", null);
        setField(term2988, term2988.getClass(), "propListHead", null);
        setIntField(term2988, term2988.getClass(), "sourcePosition", 0);
        setField(term2988, term2988.getClass(), "jsType", null);
        setField(term2988, term2988.getClass(), "parent", null);
        setField(term2974, term2974.getClass(), "first", term2988);
        setIntField(term2991, term2991.getClass(), "type", 0);
        setField(term2991, term2991.getClass(), "next", null);
        setField(term2991, term2991.getClass(), "first", null);
        setField(term2991, term2991.getClass(), "last", null);
        setField(term2991, term2991.getClass(), "propListHead", null);
        setIntField(term2991, term2991.getClass(), "sourcePosition", 0);
        setField(term2991, term2991.getClass(), "jsType", null);
        setField(term2991, term2991.getClass(), "parent", null);
        setField(term2974, term2974.getClass(), "last", term2991);
        setField(term2974, term2974.getClass(), "propListHead", null);
        setIntField(term2974, term2974.getClass(), "sourcePosition", 0);
        setField(term2974, term2974.getClass(), "jsType", null);
        setField(term2974, term2974.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = "vrQLuWIDJX";
        args[1] = term2974;
        try {
            callMethod(klass, "newVarNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


