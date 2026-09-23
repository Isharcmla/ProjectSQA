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
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class ProcessClosurePrimitives_init_114265507743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object enum26;

    public ProcessClosurePrimitives_init_114265507743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        Object term13 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1, term1.getClass(), "symbols", term2);
        setField(term1, term1.getClass(), "refs", null);
        setIntField(term13, term13.getClass(), "type", 568599855);
        setIntField(term15, term15.getClass(), "type", 1162663216);
        setIntField(term17, term17.getClass(), "type", 1484323161);
        setIntField(term19, term19.getClass(), "type", 391863371);
        setField(term19, term19.getClass(), "next", null);
        setField(term19, term19.getClass(), "first", term19);
        setField(term19, term19.getClass(), "last", term15);
        setField(term19, term19.getClass(), "propListHead", null);
        setIntField(term19, term19.getClass(), "sourcePosition", 0);
        setField(term19, term19.getClass(), "jsType", null);
        setField(term19, term19.getClass(), "parent", null);
        setField(term17, term17.getClass(), "next", term19);
        setField(term17, term17.getClass(), "first", term15);
        setIntField(term22, term22.getClass(), "type", 0);
        setField(term22, term22.getClass(), "next", null);
        setField(term22, term22.getClass(), "first", null);
        setField(term22, term22.getClass(), "last", null);
        setField(term22, term22.getClass(), "propListHead", null);
        setIntField(term22, term22.getClass(), "sourcePosition", 0);
        setField(term22, term22.getClass(), "jsType", null);
        setField(term22, term22.getClass(), "parent", null);
        setField(term17, term17.getClass(), "last", term22);
        setField(term17, term17.getClass(), "propListHead", null);
        setIntField(term17, term17.getClass(), "sourcePosition", 0);
        setField(term17, term17.getClass(), "jsType", null);
        setField(term17, term17.getClass(), "parent", null);
        setField(term15, term15.getClass(), "next", term17);
        setIntField(term26, term26.getClass(), "type", 0);
        setField(term26, term26.getClass(), "next", null);
        setField(term26, term26.getClass(), "first", null);
        setField(term26, term26.getClass(), "last", null);
        setField(term26, term26.getClass(), "propListHead", null);
        setIntField(term26, term26.getClass(), "sourcePosition", 0);
        setField(term26, term26.getClass(), "jsType", null);
        setField(term26, term26.getClass(), "parent", null);
        setField(term15, term15.getClass(), "first", term26);
        setField(term15, term15.getClass(), "last", term26);
        setField(term15, term15.getClass(), "propListHead", null);
        setIntField(term15, term15.getClass(), "sourcePosition", 0);
        setField(term15, term15.getClass(), "jsType", null);
        setField(term15, term15.getClass(), "parent", null);
        setField(term13, term13.getClass(), "next", term15);
        setIntField(term30, term30.getClass(), "type", -1922583790);
        setIntField(term32, term32.getClass(), "type", -616727354);
        setIntField(term34, term34.getClass(), "type", -1955890973);
        setField(term34, term34.getClass(), "next", term26);
        setField(term34, term34.getClass(), "first", null);
        setField(term34, term34.getClass(), "last", term22);
        setField(term34, term34.getClass(), "propListHead", null);
        setIntField(term34, term34.getClass(), "sourcePosition", 0);
        setField(term34, term34.getClass(), "jsType", null);
        setField(term34, term34.getClass(), "parent", null);
        setField(term32, term32.getClass(), "next", term34);
        setField(term32, term32.getClass(), "first", term26);
        setIntField(term37, term37.getClass(), "type", 0);
        setField(term37, term37.getClass(), "next", null);
        setField(term37, term37.getClass(), "first", null);
        setField(term37, term37.getClass(), "last", null);
        setField(term37, term37.getClass(), "propListHead", null);
        setIntField(term37, term37.getClass(), "sourcePosition", 0);
        setField(term37, term37.getClass(), "jsType", null);
        setField(term37, term37.getClass(), "parent", null);
        setField(term32, term32.getClass(), "last", term37);
        setField(term32, term32.getClass(), "propListHead", null);
        setIntField(term32, term32.getClass(), "sourcePosition", 0);
        setField(term32, term32.getClass(), "jsType", null);
        setField(term32, term32.getClass(), "parent", null);
        setField(term30, term30.getClass(), "next", term32);
        setField(term30, term30.getClass(), "first", term13);
        setField(term30, term30.getClass(), "last", term32);
        setField(term30, term30.getClass(), "propListHead", null);
        setIntField(term30, term30.getClass(), "sourcePosition", 0);
        setField(term30, term30.getClass(), "jsType", null);
        setField(term30, term30.getClass(), "parent", null);
        setField(term13, term13.getClass(), "first", term30);
        setField(term13, term13.getClass(), "last", term22);
        setField(term13, term13.getClass(), "propListHead", null);
        setIntField(term13, term13.getClass(), "sourcePosition", 0);
        setField(term13, term13.getClass(), "jsType", null);
        setField(term13, term13.getClass(), "parent", null);
        setField(term1, term1.getClass(), "root", term13);
        Class<? extends Object> term11445 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term11444 = ((Class) term11445).getDeclaredField((String) "WARNING");
        ((Field) term11444).setAccessible(true);
        enum26 = ((Field) term11444).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.PreprocessorSymbolTable");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1;
        args[2] = enum26;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


