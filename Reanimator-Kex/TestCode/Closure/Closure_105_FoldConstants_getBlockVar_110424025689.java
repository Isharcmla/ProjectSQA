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

public class FoldConstants_getBlockVar_110424025689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5113;
     Object term5114;

    public FoldConstants_getBlockVar_110424025689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5113 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term5113, term5113.getClass(), "compiler", null);
        term5114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5127 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5137 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5114, term5114.getClass(), "type", 1369020869);
        setIntField(term5116, term5116.getClass(), "type", -1201819537);
        setIntField(term5118, term5118.getClass(), "type", 0);
        setField(term5118, term5118.getClass(), "next", null);
        setField(term5118, term5118.getClass(), "first", null);
        setField(term5118, term5118.getClass(), "last", null);
        setField(term5118, term5118.getClass(), "propListHead", null);
        setIntField(term5118, term5118.getClass(), "sourcePosition", 0);
        setField(term5118, term5118.getClass(), "jsType", null);
        setField(term5118, term5118.getClass(), "parent", null);
        setField(term5116, term5116.getClass(), "next", term5118);
        setIntField(term5121, term5121.getClass(), "type", 0);
        setField(term5121, term5121.getClass(), "next", null);
        setField(term5121, term5121.getClass(), "first", null);
        setField(term5121, term5121.getClass(), "last", null);
        setField(term5121, term5121.getClass(), "propListHead", null);
        setIntField(term5121, term5121.getClass(), "sourcePosition", 0);
        setField(term5121, term5121.getClass(), "jsType", null);
        setField(term5121, term5121.getClass(), "parent", null);
        setField(term5116, term5116.getClass(), "first", term5121);
        setIntField(term5124, term5124.getClass(), "type", 0);
        setField(term5124, term5124.getClass(), "next", null);
        setField(term5124, term5124.getClass(), "first", null);
        setField(term5124, term5124.getClass(), "last", null);
        setField(term5124, term5124.getClass(), "propListHead", null);
        setIntField(term5124, term5124.getClass(), "sourcePosition", 0);
        setField(term5124, term5124.getClass(), "jsType", null);
        setField(term5124, term5124.getClass(), "parent", null);
        setField(term5116, term5116.getClass(), "last", term5124);
        setField(term5127, term5127.getClass(), "next", null);
        setIntField(term5127, term5127.getClass(), "type", 0);
        setIntField(term5127, term5127.getClass(), "intValue", 0);
        setField(term5127, term5127.getClass(), "objectValue", null);
        setField(term5116, term5116.getClass(), "propListHead", term5127);
        setIntField(term5116, term5116.getClass(), "sourcePosition", -755209283);
        setField(term5116, term5116.getClass(), "jsType", null);
        setField(term5116, term5116.getClass(), "parent", null);
        setField(term5114, term5114.getClass(), "next", term5116);
        setIntField(term5131, term5131.getClass(), "type", 0);
        setField(term5131, term5131.getClass(), "next", null);
        setField(term5131, term5131.getClass(), "first", null);
        setField(term5131, term5131.getClass(), "last", null);
        setField(term5131, term5131.getClass(), "propListHead", null);
        setIntField(term5131, term5131.getClass(), "sourcePosition", 0);
        setField(term5131, term5131.getClass(), "jsType", null);
        setField(term5131, term5131.getClass(), "parent", null);
        setField(term5114, term5114.getClass(), "first", term5131);
        setIntField(term5134, term5134.getClass(), "type", 0);
        setField(term5134, term5134.getClass(), "next", null);
        setField(term5134, term5134.getClass(), "first", null);
        setField(term5134, term5134.getClass(), "last", null);
        setField(term5134, term5134.getClass(), "propListHead", null);
        setIntField(term5134, term5134.getClass(), "sourcePosition", 0);
        setField(term5134, term5134.getClass(), "jsType", null);
        setField(term5134, term5134.getClass(), "parent", null);
        setField(term5114, term5114.getClass(), "last", term5134);
        setField(term5137, term5137.getClass(), "next", null);
        setIntField(term5137, term5137.getClass(), "type", 0);
        setIntField(term5137, term5137.getClass(), "intValue", 0);
        setField(term5137, term5137.getClass(), "objectValue", null);
        setField(term5114, term5114.getClass(), "propListHead", term5137);
        setIntField(term5114, term5114.getClass(), "sourcePosition", -616562794);
        setField(term5114, term5114.getClass(), "jsType", null);
        setField(term5114, term5114.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5114;
        try {
            callMethod(klass, "getBlockVar", argTypes, term5113, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


