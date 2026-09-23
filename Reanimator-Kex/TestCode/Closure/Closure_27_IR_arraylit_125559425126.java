package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_arraylit_125559425126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2156;

    public IR_arraylit_125559425126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2156 = (Object[]) newArray("com.google.javascript.rhino.Node", 9);
        Object term2157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2157, term2157.getClass(), "type", 532666604);
        setIntField(term2159, term2159.getClass(), "type", -13725716);
        setIntField(term2161, term2161.getClass(), "type", -1695750603);
        setIntField(term2163, term2163.getClass(), "type", 63677360);
        setField(term2163, term2163.getClass(), "next", null);
        setField(term2163, term2163.getClass(), "first", null);
        setField(term2163, term2163.getClass(), "last", term2161);
        setField(term2163, term2163.getClass(), "propListHead", null);
        setIntField(term2163, term2163.getClass(), "sourcePosition", 0);
        setField(term2163, term2163.getClass(), "jsType", null);
        setField(term2163, term2163.getClass(), "parent", null);
        setField(term2161, term2161.getClass(), "next", term2163);
        setIntField(term2166, term2166.getClass(), "type", 1478914037);
        setField(term2166, term2166.getClass(), "next", null);
        setField(term2166, term2166.getClass(), "first", null);
        setField(term2166, term2166.getClass(), "last", null);
        setField(term2166, term2166.getClass(), "propListHead", null);
        setIntField(term2166, term2166.getClass(), "sourcePosition", 0);
        setField(term2166, term2166.getClass(), "jsType", null);
        setField(term2166, term2166.getClass(), "parent", null);
        setField(term2161, term2161.getClass(), "first", term2166);
        setIntField(term2169, term2169.getClass(), "type", -1398142433);
        setField(term2169, term2169.getClass(), "next", null);
        setField(term2169, term2169.getClass(), "first", term2159);
        setField(term2169, term2169.getClass(), "last", term2159);
        setField(term2169, term2169.getClass(), "propListHead", null);
        setIntField(term2169, term2169.getClass(), "sourcePosition", 0);
        setField(term2169, term2169.getClass(), "jsType", null);
        setField(term2169, term2169.getClass(), "parent", null);
        setField(term2161, term2161.getClass(), "last", term2169);
        setField(term2161, term2161.getClass(), "propListHead", null);
        setIntField(term2161, term2161.getClass(), "sourcePosition", 0);
        setField(term2161, term2161.getClass(), "jsType", null);
        setField(term2161, term2161.getClass(), "parent", null);
        setField(term2159, term2159.getClass(), "next", term2161);
        setIntField(term2173, term2173.getClass(), "type", 2073858334);
        setField(term2173, term2173.getClass(), "next", term2169);
        setIntField(term2175, term2175.getClass(), "type", -1112119058);
        setField(term2175, term2175.getClass(), "next", term2173);
        setField(term2175, term2175.getClass(), "first", null);
        setField(term2175, term2175.getClass(), "last", term2163);
        setField(term2175, term2175.getClass(), "propListHead", null);
        setIntField(term2175, term2175.getClass(), "sourcePosition", 0);
        setField(term2175, term2175.getClass(), "jsType", null);
        setField(term2175, term2175.getClass(), "parent", null);
        setField(term2173, term2173.getClass(), "first", term2175);
        setField(term2173, term2173.getClass(), "last", term2157);
        setField(term2173, term2173.getClass(), "propListHead", null);
        setIntField(term2173, term2173.getClass(), "sourcePosition", 0);
        setField(term2173, term2173.getClass(), "jsType", null);
        setField(term2173, term2173.getClass(), "parent", null);
        setField(term2159, term2159.getClass(), "first", term2173);
        setField(term2159, term2159.getClass(), "last", term2173);
        setField(term2159, term2159.getClass(), "propListHead", null);
        setIntField(term2159, term2159.getClass(), "sourcePosition", 0);
        setField(term2159, term2159.getClass(), "jsType", null);
        setField(term2159, term2159.getClass(), "parent", null);
        setField(term2157, term2157.getClass(), "next", term2159);
        setField(term2157, term2157.getClass(), "first", term2163);
        setField(term2157, term2157.getClass(), "last", term2166);
        setField(term2157, term2157.getClass(), "propListHead", null);
        setIntField(term2157, term2157.getClass(), "sourcePosition", 0);
        setField(term2157, term2157.getClass(), "jsType", null);
        setField(term2157, term2157.getClass(), "parent", null);
        setElement(term2156, 0, term2157);
        setElement(term2156, 1, term2166);
        setElement(term2156, 2, term2159);
        setIntField(term2181, term2181.getClass(), "type", 1460702778);
        setField(term2181, term2181.getClass(), "next", term2169);
        setField(term2181, term2181.getClass(), "first", term2173);
        setField(term2181, term2181.getClass(), "last", term2169);
        setField(term2181, term2181.getClass(), "propListHead", null);
        setIntField(term2181, term2181.getClass(), "sourcePosition", 0);
        setField(term2181, term2181.getClass(), "jsType", null);
        setField(term2181, term2181.getClass(), "parent", null);
        setElement(term2156, 3, term2181);
        setElement(term2156, 4, term2181);
        setElement(term2156, 5, term2175);
        setElement(term2156, 6, term2173);
        setElement(term2156, 7, term2161);
        setElement(term2156, 8, term2181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2156;
        try {
            callMethod(klass, "arraylit", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


