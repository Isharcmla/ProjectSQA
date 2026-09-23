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

public class CodeGenerator_addAllSiblings_124279642250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2112;
     Object term2113;

    public CodeGenerator_addAllSiblings_124279642250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2112 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2112, term2112.getClass(), "cc", null);
        setField(term2112, term2112.getClass(), "outputCharsetEncoder", null);
        term2113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2126 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2136 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2113, term2113.getClass(), "type", 1398204340);
        setIntField(term2115, term2115.getClass(), "type", 1384592638);
        setIntField(term2117, term2117.getClass(), "type", 0);
        setField(term2117, term2117.getClass(), "next", null);
        setField(term2117, term2117.getClass(), "first", null);
        setField(term2117, term2117.getClass(), "last", null);
        setField(term2117, term2117.getClass(), "propListHead", null);
        setIntField(term2117, term2117.getClass(), "sourcePosition", 0);
        setField(term2117, term2117.getClass(), "jsType", null);
        setField(term2117, term2117.getClass(), "parent", null);
        setField(term2115, term2115.getClass(), "next", term2117);
        setIntField(term2120, term2120.getClass(), "type", 0);
        setField(term2120, term2120.getClass(), "next", null);
        setField(term2120, term2120.getClass(), "first", null);
        setField(term2120, term2120.getClass(), "last", null);
        setField(term2120, term2120.getClass(), "propListHead", null);
        setIntField(term2120, term2120.getClass(), "sourcePosition", 0);
        setField(term2120, term2120.getClass(), "jsType", null);
        setField(term2120, term2120.getClass(), "parent", null);
        setField(term2115, term2115.getClass(), "first", term2120);
        setIntField(term2123, term2123.getClass(), "type", 0);
        setField(term2123, term2123.getClass(), "next", null);
        setField(term2123, term2123.getClass(), "first", null);
        setField(term2123, term2123.getClass(), "last", null);
        setField(term2123, term2123.getClass(), "propListHead", null);
        setIntField(term2123, term2123.getClass(), "sourcePosition", 0);
        setField(term2123, term2123.getClass(), "jsType", null);
        setField(term2123, term2123.getClass(), "parent", null);
        setField(term2115, term2115.getClass(), "last", term2123);
        setField(term2126, term2126.getClass(), "next", null);
        setIntField(term2126, term2126.getClass(), "type", 0);
        setIntField(term2126, term2126.getClass(), "intValue", 0);
        setField(term2126, term2126.getClass(), "objectValue", null);
        setField(term2115, term2115.getClass(), "propListHead", term2126);
        setIntField(term2115, term2115.getClass(), "sourcePosition", 1296895584);
        setField(term2115, term2115.getClass(), "jsType", null);
        setField(term2115, term2115.getClass(), "parent", null);
        setField(term2113, term2113.getClass(), "next", term2115);
        setIntField(term2130, term2130.getClass(), "type", 0);
        setField(term2130, term2130.getClass(), "next", null);
        setField(term2130, term2130.getClass(), "first", null);
        setField(term2130, term2130.getClass(), "last", null);
        setField(term2130, term2130.getClass(), "propListHead", null);
        setIntField(term2130, term2130.getClass(), "sourcePosition", 0);
        setField(term2130, term2130.getClass(), "jsType", null);
        setField(term2130, term2130.getClass(), "parent", null);
        setField(term2113, term2113.getClass(), "first", term2130);
        setIntField(term2133, term2133.getClass(), "type", 0);
        setField(term2133, term2133.getClass(), "next", null);
        setField(term2133, term2133.getClass(), "first", null);
        setField(term2133, term2133.getClass(), "last", null);
        setField(term2133, term2133.getClass(), "propListHead", null);
        setIntField(term2133, term2133.getClass(), "sourcePosition", 0);
        setField(term2133, term2133.getClass(), "jsType", null);
        setField(term2133, term2133.getClass(), "parent", null);
        setField(term2113, term2113.getClass(), "last", term2133);
        setField(term2136, term2136.getClass(), "next", null);
        setIntField(term2136, term2136.getClass(), "type", 0);
        setIntField(term2136, term2136.getClass(), "intValue", 0);
        setField(term2136, term2136.getClass(), "objectValue", null);
        setField(term2113, term2113.getClass(), "propListHead", term2136);
        setIntField(term2113, term2113.getClass(), "sourcePosition", 628918458);
        setField(term2113, term2113.getClass(), "jsType", null);
        setField(term2113, term2113.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2113;
        try {
            callMethod(klass, "addAllSiblings", argTypes, term2112, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


