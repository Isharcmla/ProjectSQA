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

public class CodeGenerator_addAllSiblings_124279642254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2156;
     Object term2157;

    public CodeGenerator_addAllSiblings_124279642254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2156 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2156, term2156.getClass(), "cc", null);
        setField(term2156, term2156.getClass(), "outputCharsetEncoder", null);
        term2157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2170 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2180 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2157, term2157.getClass(), "type", 1398204340);
        setIntField(term2159, term2159.getClass(), "type", 1384592638);
        setIntField(term2161, term2161.getClass(), "type", 0);
        setField(term2161, term2161.getClass(), "next", null);
        setField(term2161, term2161.getClass(), "first", null);
        setField(term2161, term2161.getClass(), "last", null);
        setField(term2161, term2161.getClass(), "propListHead", null);
        setIntField(term2161, term2161.getClass(), "sourcePosition", 0);
        setField(term2161, term2161.getClass(), "jsType", null);
        setField(term2161, term2161.getClass(), "parent", null);
        setField(term2159, term2159.getClass(), "next", term2161);
        setIntField(term2164, term2164.getClass(), "type", 0);
        setField(term2164, term2164.getClass(), "next", null);
        setField(term2164, term2164.getClass(), "first", null);
        setField(term2164, term2164.getClass(), "last", null);
        setField(term2164, term2164.getClass(), "propListHead", null);
        setIntField(term2164, term2164.getClass(), "sourcePosition", 0);
        setField(term2164, term2164.getClass(), "jsType", null);
        setField(term2164, term2164.getClass(), "parent", null);
        setField(term2159, term2159.getClass(), "first", term2164);
        setIntField(term2167, term2167.getClass(), "type", 0);
        setField(term2167, term2167.getClass(), "next", null);
        setField(term2167, term2167.getClass(), "first", null);
        setField(term2167, term2167.getClass(), "last", null);
        setField(term2167, term2167.getClass(), "propListHead", null);
        setIntField(term2167, term2167.getClass(), "sourcePosition", 0);
        setField(term2167, term2167.getClass(), "jsType", null);
        setField(term2167, term2167.getClass(), "parent", null);
        setField(term2159, term2159.getClass(), "last", term2167);
        setField(term2170, term2170.getClass(), "next", null);
        setIntField(term2170, term2170.getClass(), "type", 0);
        setIntField(term2170, term2170.getClass(), "intValue", 0);
        setField(term2170, term2170.getClass(), "objectValue", null);
        setField(term2159, term2159.getClass(), "propListHead", term2170);
        setIntField(term2159, term2159.getClass(), "sourcePosition", 1296895584);
        setField(term2159, term2159.getClass(), "jsType", null);
        setField(term2159, term2159.getClass(), "parent", null);
        setField(term2157, term2157.getClass(), "next", term2159);
        setIntField(term2174, term2174.getClass(), "type", 0);
        setField(term2174, term2174.getClass(), "next", null);
        setField(term2174, term2174.getClass(), "first", null);
        setField(term2174, term2174.getClass(), "last", null);
        setField(term2174, term2174.getClass(), "propListHead", null);
        setIntField(term2174, term2174.getClass(), "sourcePosition", 0);
        setField(term2174, term2174.getClass(), "jsType", null);
        setField(term2174, term2174.getClass(), "parent", null);
        setField(term2157, term2157.getClass(), "first", term2174);
        setIntField(term2177, term2177.getClass(), "type", 0);
        setField(term2177, term2177.getClass(), "next", null);
        setField(term2177, term2177.getClass(), "first", null);
        setField(term2177, term2177.getClass(), "last", null);
        setField(term2177, term2177.getClass(), "propListHead", null);
        setIntField(term2177, term2177.getClass(), "sourcePosition", 0);
        setField(term2177, term2177.getClass(), "jsType", null);
        setField(term2177, term2177.getClass(), "parent", null);
        setField(term2157, term2157.getClass(), "last", term2177);
        setField(term2180, term2180.getClass(), "next", null);
        setIntField(term2180, term2180.getClass(), "type", 0);
        setIntField(term2180, term2180.getClass(), "intValue", 0);
        setField(term2180, term2180.getClass(), "objectValue", null);
        setField(term2157, term2157.getClass(), "propListHead", term2180);
        setIntField(term2157, term2157.getClass(), "sourcePosition", 628918458);
        setField(term2157, term2157.getClass(), "jsType", null);
        setField(term2157, term2157.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2157;
        try {
            callMethod(klass, "addAllSiblings", argTypes, term2156, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


