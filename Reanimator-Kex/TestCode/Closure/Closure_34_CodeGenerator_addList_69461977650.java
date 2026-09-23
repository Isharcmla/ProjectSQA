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
import java.util.HashMap;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;

public class CodeGenerator_addList_69461977650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2186;
     Object term2197;
     Object term2224;
     Object enum14;

    public CodeGenerator_addList_69461977650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2187 = new HashMap();
        term2186 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2186, term2186.getClass(), "ESCAPED_JS_STRINGS", term2187);
        setField(term2186, term2186.getClass(), "cc", null);
        setField(term2186, term2186.getClass(), "outputCharsetEncoder", null);
        term2197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2197, term2197.getClass(), "type", 941650513);
        setIntField(term2199, term2199.getClass(), "type", 444029505);
        setIntField(term2201, term2201.getClass(), "type", -1034506028);
        setIntField(term2203, term2203.getClass(), "type", -1263114719);
        setIntField(term2205, term2205.getClass(), "type", -894662986);
        setField(term2205, term2205.getClass(), "next", null);
        setField(term2205, term2205.getClass(), "first", null);
        setField(term2205, term2205.getClass(), "last", null);
        setField(term2205, term2205.getClass(), "propListHead", null);
        setIntField(term2205, term2205.getClass(), "sourcePosition", 0);
        setField(term2205, term2205.getClass(), "jsType", null);
        setField(term2205, term2205.getClass(), "parent", null);
        setField(term2203, term2203.getClass(), "next", term2205);
        setIntField(term2208, term2208.getClass(), "type", 304775596);
        setField(term2208, term2208.getClass(), "next", null);
        setField(term2208, term2208.getClass(), "first", null);
        setField(term2208, term2208.getClass(), "last", term2205);
        setField(term2208, term2208.getClass(), "propListHead", null);
        setIntField(term2208, term2208.getClass(), "sourcePosition", 0);
        setField(term2208, term2208.getClass(), "jsType", null);
        setField(term2208, term2208.getClass(), "parent", null);
        setField(term2203, term2203.getClass(), "first", term2208);
        setField(term2203, term2203.getClass(), "last", term2201);
        setField(term2203, term2203.getClass(), "propListHead", null);
        setIntField(term2203, term2203.getClass(), "sourcePosition", 0);
        setField(term2203, term2203.getClass(), "jsType", null);
        setField(term2203, term2203.getClass(), "parent", null);
        setField(term2201, term2201.getClass(), "next", term2203);
        setField(term2201, term2201.getClass(), "first", term2205);
        setIntField(term2212, term2212.getClass(), "type", -1888585309);
        setIntField(term2214, term2214.getClass(), "type", 683666002);
        setField(term2214, term2214.getClass(), "next", null);
        setField(term2214, term2214.getClass(), "first", term2208);
        setField(term2214, term2214.getClass(), "last", term2203);
        setField(term2214, term2214.getClass(), "propListHead", null);
        setIntField(term2214, term2214.getClass(), "sourcePosition", 0);
        setField(term2214, term2214.getClass(), "jsType", null);
        setField(term2214, term2214.getClass(), "parent", null);
        setField(term2212, term2212.getClass(), "next", term2214);
        setField(term2212, term2212.getClass(), "first", term2199);
        setField(term2212, term2212.getClass(), "last", term2199);
        setField(term2212, term2212.getClass(), "propListHead", null);
        setIntField(term2212, term2212.getClass(), "sourcePosition", 0);
        setField(term2212, term2212.getClass(), "jsType", null);
        setField(term2212, term2212.getClass(), "parent", null);
        setField(term2201, term2201.getClass(), "last", term2212);
        setField(term2201, term2201.getClass(), "propListHead", null);
        setIntField(term2201, term2201.getClass(), "sourcePosition", 0);
        setField(term2201, term2201.getClass(), "jsType", null);
        setField(term2201, term2201.getClass(), "parent", null);
        setField(term2199, term2199.getClass(), "next", term2201);
        setIntField(term2219, term2219.getClass(), "type", 1596213415);
        setField(term2219, term2219.getClass(), "next", term2212);
        setField(term2219, term2219.getClass(), "first", term2214);
        setField(term2219, term2219.getClass(), "last", term2197);
        setField(term2219, term2219.getClass(), "propListHead", null);
        setIntField(term2219, term2219.getClass(), "sourcePosition", 0);
        setField(term2219, term2219.getClass(), "jsType", null);
        setField(term2219, term2219.getClass(), "parent", null);
        setField(term2199, term2199.getClass(), "first", term2219);
        setField(term2199, term2199.getClass(), "last", term2219);
        setField(term2199, term2199.getClass(), "propListHead", null);
        setIntField(term2199, term2199.getClass(), "sourcePosition", 0);
        setField(term2199, term2199.getClass(), "jsType", null);
        setField(term2199, term2199.getClass(), "parent", null);
        setField(term2197, term2197.getClass(), "next", term2199);
        setField(term2197, term2197.getClass(), "first", term2203);
        setField(term2197, term2197.getClass(), "last", term2205);
        setField(term2197, term2197.getClass(), "propListHead", null);
        setIntField(term2197, term2197.getClass(), "sourcePosition", 0);
        setField(term2197, term2197.getClass(), "jsType", null);
        setField(term2197, term2197.getClass(), "parent", null);
        term2224 = new Boolean(false);
        Class<? extends Object> term8759 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term8758 = ((Class) term8759).getDeclaredField((String) "BEFORE_DANGLING_ELSE");
        ((Field) term8758).setAccessible(true);
        enum14 = ((Field) term8758).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term2197;
        args[1] = term2224;
        args[2] = enum14;
        try {
            callMethod(klass, "addList", argTypes, term2186, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


