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

public class TypeInference_traverseGetElem_100203513277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273993;
     Object term274063;

    public TypeInference_traverseGetElem_100203513277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273993 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term274063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term274133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term274203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term274273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term274343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term274413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term274483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term274553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term274623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term274693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term274763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term274833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term274903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term274973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term275043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term275113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term275183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term275253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term275323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term275393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term275463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term275533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term274133, term274133.getClass(), "type", 98);
        setField(term274203, term274203.getClass(), "next", null);
        setIntField(term274203, term274203.getClass(), "type", 98);
        setField(term274273, term274273.getClass(), "next", null);
        setIntField(term274273, term274273.getClass(), "type", 98);
        setField(term274343, term274343.getClass(), "next", null);
        setIntField(term274343, term274343.getClass(), "type", 98);
        setField(term274413, term274413.getClass(), "next", null);
        setIntField(term274413, term274413.getClass(), "type", 98);
        setField(term274483, term274483.getClass(), "next", null);
        setIntField(term274483, term274483.getClass(), "type", 98);
        setField(term274553, term274553.getClass(), "next", null);
        setIntField(term274553, term274553.getClass(), "type", 98);
        setField(term274623, term274623.getClass(), "next", null);
        setIntField(term274623, term274623.getClass(), "type", 98);
        setField(term274693, term274693.getClass(), "next", null);
        setIntField(term274693, term274693.getClass(), "type", 98);
        setField(term274763, term274763.getClass(), "next", null);
        setIntField(term274763, term274763.getClass(), "type", 98);
        setField(term274833, term274833.getClass(), "next", null);
        setIntField(term274833, term274833.getClass(), "type", 98);
        setField(term274903, term274903.getClass(), "next", null);
        setIntField(term274903, term274903.getClass(), "type", 98);
        setField(term274973, term274973.getClass(), "next", null);
        setIntField(term274973, term274973.getClass(), "type", 98);
        setField(term275043, term275043.getClass(), "next", null);
        setIntField(term275043, term275043.getClass(), "type", 98);
        setField(term275113, term275113.getClass(), "next", null);
        setIntField(term275113, term275113.getClass(), "type", 98);
        setField(term275183, term275183.getClass(), "next", null);
        setIntField(term275183, term275183.getClass(), "type", 98);
        setField(term275253, term275253.getClass(), "next", null);
        setIntField(term275253, term275253.getClass(), "type", 98);
        setField(term275323, term275323.getClass(), "next", null);
        setIntField(term275323, term275323.getClass(), "type", 98);
        setField(term275393, term275393.getClass(), "next", null);
        setIntField(term275393, term275393.getClass(), "type", 98);
        setField(term275463, term275463.getClass(), "next", null);
        setIntField(term275463, term275463.getClass(), "type", 98);
        setField(term275533, term275533.getClass(), "next", null);
        setIntField(term275533, term275533.getClass(), "type", 103);
        setField(term275463, term275463.getClass(), "first", term275533);
        setField(term275463, term275463.getClass(), "last", null);
        setField(term275393, term275393.getClass(), "first", term275463);
        setField(term275393, term275393.getClass(), "last", null);
        setField(term275323, term275323.getClass(), "first", term275393);
        setField(term275323, term275323.getClass(), "last", null);
        setField(term275253, term275253.getClass(), "first", term275323);
        setField(term275253, term275253.getClass(), "last", null);
        setField(term275183, term275183.getClass(), "first", term275253);
        setField(term275183, term275183.getClass(), "last", null);
        setField(term275113, term275113.getClass(), "first", term275183);
        setField(term275113, term275113.getClass(), "last", null);
        setField(term275043, term275043.getClass(), "first", term275113);
        setField(term275043, term275043.getClass(), "last", null);
        setField(term274973, term274973.getClass(), "first", term275043);
        setField(term274973, term274973.getClass(), "last", null);
        setField(term274903, term274903.getClass(), "first", term274973);
        setField(term274903, term274903.getClass(), "last", null);
        setField(term274833, term274833.getClass(), "first", term274903);
        setField(term274833, term274833.getClass(), "last", null);
        setField(term274763, term274763.getClass(), "first", term274833);
        setField(term274763, term274763.getClass(), "last", null);
        setField(term274693, term274693.getClass(), "first", term274763);
        setField(term274693, term274693.getClass(), "last", null);
        setField(term274623, term274623.getClass(), "first", term274693);
        setField(term274623, term274623.getClass(), "last", null);
        setField(term274553, term274553.getClass(), "first", term274623);
        setField(term274553, term274553.getClass(), "last", null);
        setField(term274483, term274483.getClass(), "first", term274553);
        setField(term274483, term274483.getClass(), "last", null);
        setField(term274413, term274413.getClass(), "first", term274483);
        setField(term274413, term274413.getClass(), "last", null);
        setField(term274343, term274343.getClass(), "first", term274413);
        setField(term274343, term274343.getClass(), "last", null);
        setField(term274273, term274273.getClass(), "first", term274343);
        setField(term274273, term274273.getClass(), "last", null);
        setField(term274203, term274203.getClass(), "first", term274273);
        setField(term274203, term274203.getClass(), "last", null);
        setField(term274133, term274133.getClass(), "first", term274203);
        setField(term274133, term274133.getClass(), "last", null);
        setField(term274063, term274063.getClass(), "first", term274133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term274063;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term273993, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


