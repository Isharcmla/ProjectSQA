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

public class FoldConstants_getBlockReturnExpression_34121067387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5057;
     Object term5058;

    public FoldConstants_getBlockReturnExpression_34121067387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5057 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term5057, term5057.getClass(), "compiler", null);
        term5058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5071 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5081 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5058, term5058.getClass(), "type", 1094297953);
        setIntField(term5060, term5060.getClass(), "type", -777833461);
        setIntField(term5062, term5062.getClass(), "type", 0);
        setField(term5062, term5062.getClass(), "next", null);
        setField(term5062, term5062.getClass(), "first", null);
        setField(term5062, term5062.getClass(), "last", null);
        setField(term5062, term5062.getClass(), "propListHead", null);
        setIntField(term5062, term5062.getClass(), "sourcePosition", 0);
        setField(term5062, term5062.getClass(), "jsType", null);
        setField(term5062, term5062.getClass(), "parent", null);
        setField(term5060, term5060.getClass(), "next", term5062);
        setIntField(term5065, term5065.getClass(), "type", 0);
        setField(term5065, term5065.getClass(), "next", null);
        setField(term5065, term5065.getClass(), "first", null);
        setField(term5065, term5065.getClass(), "last", null);
        setField(term5065, term5065.getClass(), "propListHead", null);
        setIntField(term5065, term5065.getClass(), "sourcePosition", 0);
        setField(term5065, term5065.getClass(), "jsType", null);
        setField(term5065, term5065.getClass(), "parent", null);
        setField(term5060, term5060.getClass(), "first", term5065);
        setIntField(term5068, term5068.getClass(), "type", 0);
        setField(term5068, term5068.getClass(), "next", null);
        setField(term5068, term5068.getClass(), "first", null);
        setField(term5068, term5068.getClass(), "last", null);
        setField(term5068, term5068.getClass(), "propListHead", null);
        setIntField(term5068, term5068.getClass(), "sourcePosition", 0);
        setField(term5068, term5068.getClass(), "jsType", null);
        setField(term5068, term5068.getClass(), "parent", null);
        setField(term5060, term5060.getClass(), "last", term5068);
        setField(term5071, term5071.getClass(), "next", null);
        setIntField(term5071, term5071.getClass(), "type", 0);
        setIntField(term5071, term5071.getClass(), "intValue", 0);
        setField(term5071, term5071.getClass(), "objectValue", null);
        setField(term5060, term5060.getClass(), "propListHead", term5071);
        setIntField(term5060, term5060.getClass(), "sourcePosition", -1796760393);
        setField(term5060, term5060.getClass(), "jsType", null);
        setField(term5060, term5060.getClass(), "parent", null);
        setField(term5058, term5058.getClass(), "next", term5060);
        setIntField(term5075, term5075.getClass(), "type", 0);
        setField(term5075, term5075.getClass(), "next", null);
        setField(term5075, term5075.getClass(), "first", null);
        setField(term5075, term5075.getClass(), "last", null);
        setField(term5075, term5075.getClass(), "propListHead", null);
        setIntField(term5075, term5075.getClass(), "sourcePosition", 0);
        setField(term5075, term5075.getClass(), "jsType", null);
        setField(term5075, term5075.getClass(), "parent", null);
        setField(term5058, term5058.getClass(), "first", term5075);
        setIntField(term5078, term5078.getClass(), "type", 0);
        setField(term5078, term5078.getClass(), "next", null);
        setField(term5078, term5078.getClass(), "first", null);
        setField(term5078, term5078.getClass(), "last", null);
        setField(term5078, term5078.getClass(), "propListHead", null);
        setIntField(term5078, term5078.getClass(), "sourcePosition", 0);
        setField(term5078, term5078.getClass(), "jsType", null);
        setField(term5078, term5078.getClass(), "parent", null);
        setField(term5058, term5058.getClass(), "last", term5078);
        setField(term5081, term5081.getClass(), "next", null);
        setIntField(term5081, term5081.getClass(), "type", 0);
        setIntField(term5081, term5081.getClass(), "intValue", 0);
        setField(term5081, term5081.getClass(), "objectValue", null);
        setField(term5058, term5058.getClass(), "propListHead", term5081);
        setIntField(term5058, term5058.getClass(), "sourcePosition", -2099267271);
        setField(term5058, term5058.getClass(), "jsType", null);
        setField(term5058, term5058.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5058;
        try {
            callMethod(klass, "getBlockReturnExpression", argTypes, term5057, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


