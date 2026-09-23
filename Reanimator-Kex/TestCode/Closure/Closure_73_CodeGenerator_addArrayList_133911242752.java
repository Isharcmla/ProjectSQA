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
import java.lang.Error;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CodeGenerator_addArrayList_133911242752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2100;
     Object term2101;

    public CodeGenerator_addArrayList_133911242752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2100 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2100, term2100.getClass(), "cc", null);
        setField(term2100, term2100.getClass(), "outputCharsetEncoder", null);
        term2101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2114 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2124 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2101, term2101.getClass(), "type", -2015048153);
        setIntField(term2103, term2103.getClass(), "type", -1565502840);
        setIntField(term2105, term2105.getClass(), "type", 0);
        setField(term2105, term2105.getClass(), "next", null);
        setField(term2105, term2105.getClass(), "first", null);
        setField(term2105, term2105.getClass(), "last", null);
        setField(term2105, term2105.getClass(), "propListHead", null);
        setIntField(term2105, term2105.getClass(), "sourcePosition", 0);
        setField(term2105, term2105.getClass(), "jsType", null);
        setField(term2105, term2105.getClass(), "parent", null);
        setField(term2103, term2103.getClass(), "next", term2105);
        setIntField(term2108, term2108.getClass(), "type", 0);
        setField(term2108, term2108.getClass(), "next", null);
        setField(term2108, term2108.getClass(), "first", null);
        setField(term2108, term2108.getClass(), "last", null);
        setField(term2108, term2108.getClass(), "propListHead", null);
        setIntField(term2108, term2108.getClass(), "sourcePosition", 0);
        setField(term2108, term2108.getClass(), "jsType", null);
        setField(term2108, term2108.getClass(), "parent", null);
        setField(term2103, term2103.getClass(), "first", term2108);
        setIntField(term2111, term2111.getClass(), "type", 0);
        setField(term2111, term2111.getClass(), "next", null);
        setField(term2111, term2111.getClass(), "first", null);
        setField(term2111, term2111.getClass(), "last", null);
        setField(term2111, term2111.getClass(), "propListHead", null);
        setIntField(term2111, term2111.getClass(), "sourcePosition", 0);
        setField(term2111, term2111.getClass(), "jsType", null);
        setField(term2111, term2111.getClass(), "parent", null);
        setField(term2103, term2103.getClass(), "last", term2111);
        setField(term2114, term2114.getClass(), "next", null);
        setIntField(term2114, term2114.getClass(), "type", 0);
        setIntField(term2114, term2114.getClass(), "intValue", 0);
        setField(term2114, term2114.getClass(), "objectValue", null);
        setField(term2103, term2103.getClass(), "propListHead", term2114);
        setIntField(term2103, term2103.getClass(), "sourcePosition", -25637976);
        setField(term2103, term2103.getClass(), "jsType", null);
        setField(term2103, term2103.getClass(), "parent", null);
        setField(term2101, term2101.getClass(), "next", term2103);
        setIntField(term2118, term2118.getClass(), "type", 0);
        setField(term2118, term2118.getClass(), "next", null);
        setField(term2118, term2118.getClass(), "first", null);
        setField(term2118, term2118.getClass(), "last", null);
        setField(term2118, term2118.getClass(), "propListHead", null);
        setIntField(term2118, term2118.getClass(), "sourcePosition", 0);
        setField(term2118, term2118.getClass(), "jsType", null);
        setField(term2118, term2118.getClass(), "parent", null);
        setField(term2101, term2101.getClass(), "first", term2118);
        setIntField(term2121, term2121.getClass(), "type", 0);
        setField(term2121, term2121.getClass(), "next", null);
        setField(term2121, term2121.getClass(), "first", null);
        setField(term2121, term2121.getClass(), "last", null);
        setField(term2121, term2121.getClass(), "propListHead", null);
        setIntField(term2121, term2121.getClass(), "sourcePosition", 0);
        setField(term2121, term2121.getClass(), "jsType", null);
        setField(term2121, term2121.getClass(), "parent", null);
        setField(term2101, term2101.getClass(), "last", term2121);
        setField(term2124, term2124.getClass(), "next", null);
        setIntField(term2124, term2124.getClass(), "type", 0);
        setIntField(term2124, term2124.getClass(), "intValue", 0);
        setField(term2124, term2124.getClass(), "objectValue", null);
        setField(term2101, term2101.getClass(), "propListHead", term2124);
        setIntField(term2101, term2101.getClass(), "sourcePosition", 1555897383);
        setField(term2101, term2101.getClass(), "jsType", null);
        setField(term2101, term2101.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2101;
        try {
            callMethod(klass, "addArrayList", argTypes, term2100, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


