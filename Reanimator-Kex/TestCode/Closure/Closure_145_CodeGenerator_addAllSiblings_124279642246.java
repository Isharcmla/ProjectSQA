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

public class CodeGenerator_addAllSiblings_124279642246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2094;
     Object term2095;

    public CodeGenerator_addAllSiblings_124279642246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2094 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2094, term2094.getClass(), "cc", null);
        setField(term2094, term2094.getClass(), "outputCharsetEncoder", null);
        term2095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2108 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2118 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2095, term2095.getClass(), "type", 1598895173);
        setIntField(term2097, term2097.getClass(), "type", 1953277050);
        setIntField(term2099, term2099.getClass(), "type", 0);
        setField(term2099, term2099.getClass(), "next", null);
        setField(term2099, term2099.getClass(), "first", null);
        setField(term2099, term2099.getClass(), "last", null);
        setField(term2099, term2099.getClass(), "propListHead", null);
        setIntField(term2099, term2099.getClass(), "sourcePosition", 0);
        setField(term2099, term2099.getClass(), "jsType", null);
        setField(term2099, term2099.getClass(), "parent", null);
        setField(term2097, term2097.getClass(), "next", term2099);
        setIntField(term2102, term2102.getClass(), "type", 0);
        setField(term2102, term2102.getClass(), "next", null);
        setField(term2102, term2102.getClass(), "first", null);
        setField(term2102, term2102.getClass(), "last", null);
        setField(term2102, term2102.getClass(), "propListHead", null);
        setIntField(term2102, term2102.getClass(), "sourcePosition", 0);
        setField(term2102, term2102.getClass(), "jsType", null);
        setField(term2102, term2102.getClass(), "parent", null);
        setField(term2097, term2097.getClass(), "first", term2102);
        setIntField(term2105, term2105.getClass(), "type", 0);
        setField(term2105, term2105.getClass(), "next", null);
        setField(term2105, term2105.getClass(), "first", null);
        setField(term2105, term2105.getClass(), "last", null);
        setField(term2105, term2105.getClass(), "propListHead", null);
        setIntField(term2105, term2105.getClass(), "sourcePosition", 0);
        setField(term2105, term2105.getClass(), "jsType", null);
        setField(term2105, term2105.getClass(), "parent", null);
        setField(term2097, term2097.getClass(), "last", term2105);
        setField(term2108, term2108.getClass(), "next", null);
        setIntField(term2108, term2108.getClass(), "type", 0);
        setIntField(term2108, term2108.getClass(), "intValue", 0);
        setField(term2108, term2108.getClass(), "objectValue", null);
        setField(term2097, term2097.getClass(), "propListHead", term2108);
        setIntField(term2097, term2097.getClass(), "sourcePosition", 1398204340);
        setField(term2097, term2097.getClass(), "jsType", null);
        setField(term2097, term2097.getClass(), "parent", null);
        setField(term2095, term2095.getClass(), "next", term2097);
        setIntField(term2112, term2112.getClass(), "type", 0);
        setField(term2112, term2112.getClass(), "next", null);
        setField(term2112, term2112.getClass(), "first", null);
        setField(term2112, term2112.getClass(), "last", null);
        setField(term2112, term2112.getClass(), "propListHead", null);
        setIntField(term2112, term2112.getClass(), "sourcePosition", 0);
        setField(term2112, term2112.getClass(), "jsType", null);
        setField(term2112, term2112.getClass(), "parent", null);
        setField(term2095, term2095.getClass(), "first", term2112);
        setIntField(term2115, term2115.getClass(), "type", 0);
        setField(term2115, term2115.getClass(), "next", null);
        setField(term2115, term2115.getClass(), "first", null);
        setField(term2115, term2115.getClass(), "last", null);
        setField(term2115, term2115.getClass(), "propListHead", null);
        setIntField(term2115, term2115.getClass(), "sourcePosition", 0);
        setField(term2115, term2115.getClass(), "jsType", null);
        setField(term2115, term2115.getClass(), "parent", null);
        setField(term2095, term2095.getClass(), "last", term2115);
        setField(term2118, term2118.getClass(), "next", null);
        setIntField(term2118, term2118.getClass(), "type", 0);
        setIntField(term2118, term2118.getClass(), "intValue", 0);
        setField(term2118, term2118.getClass(), "objectValue", null);
        setField(term2095, term2095.getClass(), "propListHead", term2118);
        setIntField(term2095, term2095.getClass(), "sourcePosition", 229204365);
        setField(term2095, term2095.getClass(), "jsType", null);
        setField(term2095, term2095.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2095;
        try {
            callMethod(klass, "addAllSiblings", argTypes, term2094, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


