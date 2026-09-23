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

public class Node_setQuotedString_1374182089356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5902;

    public Node_setQuotedString_1374182089356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5902, term5902.getClass(), "type", 1176415280);
        setIntField(term5904, term5904.getClass(), "type", -1272714687);
        setIntField(term5906, term5906.getClass(), "type", -762778853);
        setIntField(term5908, term5908.getClass(), "type", 946727239);
        setIntField(term5910, term5910.getClass(), "type", 349182490);
        setField(term5910, term5910.getClass(), "next", null);
        setField(term5910, term5910.getClass(), "first", null);
        setField(term5910, term5910.getClass(), "last", null);
        setField(term5910, term5910.getClass(), "propListHead", null);
        setIntField(term5910, term5910.getClass(), "sourcePosition", 0);
        setField(term5910, term5910.getClass(), "jsType", null);
        setField(term5910, term5910.getClass(), "parent", null);
        setField(term5908, term5908.getClass(), "next", term5910);
        setIntField(term5913, term5913.getClass(), "type", -353671511);
        setField(term5913, term5913.getClass(), "next", null);
        setField(term5913, term5913.getClass(), "first", null);
        setField(term5913, term5913.getClass(), "last", term5910);
        setField(term5913, term5913.getClass(), "propListHead", null);
        setIntField(term5913, term5913.getClass(), "sourcePosition", 0);
        setField(term5913, term5913.getClass(), "jsType", null);
        setField(term5913, term5913.getClass(), "parent", null);
        setField(term5908, term5908.getClass(), "first", term5913);
        setField(term5908, term5908.getClass(), "last", term5906);
        setField(term5908, term5908.getClass(), "propListHead", null);
        setIntField(term5908, term5908.getClass(), "sourcePosition", 0);
        setField(term5908, term5908.getClass(), "jsType", null);
        setField(term5908, term5908.getClass(), "parent", null);
        setField(term5906, term5906.getClass(), "next", term5908);
        setField(term5906, term5906.getClass(), "first", term5910);
        setIntField(term5917, term5917.getClass(), "type", -690367798);
        setIntField(term5919, term5919.getClass(), "type", 1863738073);
        setField(term5919, term5919.getClass(), "next", null);
        setField(term5919, term5919.getClass(), "first", term5913);
        setField(term5919, term5919.getClass(), "last", term5908);
        setField(term5919, term5919.getClass(), "propListHead", null);
        setIntField(term5919, term5919.getClass(), "sourcePosition", 0);
        setField(term5919, term5919.getClass(), "jsType", null);
        setField(term5919, term5919.getClass(), "parent", null);
        setField(term5917, term5917.getClass(), "next", term5919);
        setField(term5917, term5917.getClass(), "first", term5904);
        setField(term5917, term5917.getClass(), "last", term5904);
        setField(term5917, term5917.getClass(), "propListHead", null);
        setIntField(term5917, term5917.getClass(), "sourcePosition", 0);
        setField(term5917, term5917.getClass(), "jsType", null);
        setField(term5917, term5917.getClass(), "parent", null);
        setField(term5906, term5906.getClass(), "last", term5917);
        setField(term5906, term5906.getClass(), "propListHead", null);
        setIntField(term5906, term5906.getClass(), "sourcePosition", 0);
        setField(term5906, term5906.getClass(), "jsType", null);
        setField(term5906, term5906.getClass(), "parent", null);
        setField(term5904, term5904.getClass(), "next", term5906);
        setIntField(term5924, term5924.getClass(), "type", 2009028243);
        setField(term5924, term5924.getClass(), "next", term5917);
        setField(term5924, term5924.getClass(), "first", term5919);
        setField(term5924, term5924.getClass(), "last", term5902);
        setField(term5924, term5924.getClass(), "propListHead", null);
        setIntField(term5924, term5924.getClass(), "sourcePosition", 0);
        setField(term5924, term5924.getClass(), "jsType", null);
        setField(term5924, term5924.getClass(), "parent", null);
        setField(term5904, term5904.getClass(), "first", term5924);
        setField(term5904, term5904.getClass(), "last", term5924);
        setField(term5904, term5904.getClass(), "propListHead", null);
        setIntField(term5904, term5904.getClass(), "sourcePosition", 0);
        setField(term5904, term5904.getClass(), "jsType", null);
        setField(term5904, term5904.getClass(), "parent", null);
        setField(term5902, term5902.getClass(), "next", term5904);
        setField(term5902, term5902.getClass(), "first", term5908);
        setField(term5902, term5902.getClass(), "last", term5910);
        setField(term5902, term5902.getClass(), "propListHead", null);
        setIntField(term5902, term5902.getClass(), "sourcePosition", 0);
        setField(term5902, term5902.getClass(), "jsType", null);
        setField(term5902, term5902.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "setQuotedString", argTypes, term5902, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


