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

public class MethodCompilerPass_process_14196166203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term28;

    public MethodCompilerPass_process_14196166203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term18 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1, term1.getClass(), "type", 391863371);
        setIntField(term3, term3.getClass(), "type", -2038273078);
        setIntField(term5, term5.getClass(), "type", 0);
        setField(term5, term5.getClass(), "next", null);
        setField(term5, term5.getClass(), "first", null);
        setField(term5, term5.getClass(), "last", null);
        setField(term5, term5.getClass(), "propListHead", null);
        setIntField(term5, term5.getClass(), "sourcePosition", 0);
        setField(term5, term5.getClass(), "jsType", null);
        setField(term5, term5.getClass(), "parent", null);
        setField(term3, term3.getClass(), "next", term5);
        setIntField(term8, term8.getClass(), "type", 0);
        setField(term8, term8.getClass(), "next", null);
        setField(term8, term8.getClass(), "first", null);
        setField(term8, term8.getClass(), "last", null);
        setField(term8, term8.getClass(), "propListHead", null);
        setIntField(term8, term8.getClass(), "sourcePosition", 0);
        setField(term8, term8.getClass(), "jsType", null);
        setField(term8, term8.getClass(), "parent", null);
        setField(term3, term3.getClass(), "first", term8);
        setIntField(term11, term11.getClass(), "type", 0);
        setField(term11, term11.getClass(), "next", null);
        setField(term11, term11.getClass(), "first", null);
        setField(term11, term11.getClass(), "last", null);
        setField(term11, term11.getClass(), "propListHead", null);
        setIntField(term11, term11.getClass(), "sourcePosition", 0);
        setField(term11, term11.getClass(), "jsType", null);
        setField(term11, term11.getClass(), "parent", null);
        setField(term3, term3.getClass(), "last", term11);
        setField(term14, term14.getClass(), "next", null);
        setIntField(term14, term14.getClass(), "type", 0);
        setIntField(term14, term14.getClass(), "intValue", 0);
        setField(term14, term14.getClass(), "objectValue", null);
        setField(term3, term3.getClass(), "propListHead", term14);
        setIntField(term3, term3.getClass(), "sourcePosition", 1725571209);
        setField(term3, term3.getClass(), "jsType", null);
        setField(term3, term3.getClass(), "parent", null);
        setField(term1, term1.getClass(), "next", term3);
        setIntField(term18, term18.getClass(), "type", 0);
        setField(term18, term18.getClass(), "next", null);
        setField(term18, term18.getClass(), "first", null);
        setField(term18, term18.getClass(), "last", null);
        setField(term18, term18.getClass(), "propListHead", null);
        setIntField(term18, term18.getClass(), "sourcePosition", 0);
        setField(term18, term18.getClass(), "jsType", null);
        setField(term18, term18.getClass(), "parent", null);
        setField(term1, term1.getClass(), "first", term18);
        setIntField(term21, term21.getClass(), "type", 0);
        setField(term21, term21.getClass(), "next", null);
        setField(term21, term21.getClass(), "first", null);
        setField(term21, term21.getClass(), "last", null);
        setField(term21, term21.getClass(), "propListHead", null);
        setIntField(term21, term21.getClass(), "sourcePosition", 0);
        setField(term21, term21.getClass(), "jsType", null);
        setField(term21, term21.getClass(), "parent", null);
        setField(term1, term1.getClass(), "last", term21);
        setField(term24, term24.getClass(), "next", null);
        setIntField(term24, term24.getClass(), "type", 0);
        setIntField(term24, term24.getClass(), "intValue", 0);
        setField(term24, term24.getClass(), "objectValue", null);
        setField(term1, term1.getClass(), "propListHead", term24);
        setIntField(term1, term1.getClass(), "sourcePosition", -522618178);
        setField(term1, term1.getClass(), "jsType", null);
        setField(term1, term1.getClass(), "parent", null);
        term28 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term45 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term28, term28.getClass(), "type", 597278769);
        setIntField(term30, term30.getClass(), "type", 1048535127);
        setIntField(term32, term32.getClass(), "type", 0);
        setField(term32, term32.getClass(), "next", null);
        setField(term32, term32.getClass(), "first", null);
        setField(term32, term32.getClass(), "last", null);
        setField(term32, term32.getClass(), "propListHead", null);
        setIntField(term32, term32.getClass(), "sourcePosition", 0);
        setField(term32, term32.getClass(), "jsType", null);
        setField(term32, term32.getClass(), "parent", null);
        setField(term30, term30.getClass(), "next", term32);
        setIntField(term35, term35.getClass(), "type", 0);
        setField(term35, term35.getClass(), "next", null);
        setField(term35, term35.getClass(), "first", null);
        setField(term35, term35.getClass(), "last", null);
        setField(term35, term35.getClass(), "propListHead", null);
        setIntField(term35, term35.getClass(), "sourcePosition", 0);
        setField(term35, term35.getClass(), "jsType", null);
        setField(term35, term35.getClass(), "parent", null);
        setField(term30, term30.getClass(), "first", term35);
        setIntField(term38, term38.getClass(), "type", 0);
        setField(term38, term38.getClass(), "next", null);
        setField(term38, term38.getClass(), "first", null);
        setField(term38, term38.getClass(), "last", null);
        setField(term38, term38.getClass(), "propListHead", null);
        setIntField(term38, term38.getClass(), "sourcePosition", 0);
        setField(term38, term38.getClass(), "jsType", null);
        setField(term38, term38.getClass(), "parent", null);
        setField(term30, term30.getClass(), "last", term38);
        setField(term41, term41.getClass(), "next", null);
        setIntField(term41, term41.getClass(), "type", 0);
        setIntField(term41, term41.getClass(), "intValue", 0);
        setField(term41, term41.getClass(), "objectValue", null);
        setField(term30, term30.getClass(), "propListHead", term41);
        setIntField(term30, term30.getClass(), "sourcePosition", -2068769794);
        setField(term30, term30.getClass(), "jsType", null);
        setField(term30, term30.getClass(), "parent", null);
        setField(term28, term28.getClass(), "next", term30);
        setIntField(term45, term45.getClass(), "type", 0);
        setField(term45, term45.getClass(), "next", null);
        setField(term45, term45.getClass(), "first", null);
        setField(term45, term45.getClass(), "last", null);
        setField(term45, term45.getClass(), "propListHead", null);
        setIntField(term45, term45.getClass(), "sourcePosition", 0);
        setField(term45, term45.getClass(), "jsType", null);
        setField(term45, term45.getClass(), "parent", null);
        setField(term28, term28.getClass(), "first", term45);
        setIntField(term48, term48.getClass(), "type", 0);
        setField(term48, term48.getClass(), "next", null);
        setField(term48, term48.getClass(), "first", null);
        setField(term48, term48.getClass(), "last", null);
        setField(term48, term48.getClass(), "propListHead", null);
        setIntField(term48, term48.getClass(), "sourcePosition", 0);
        setField(term48, term48.getClass(), "jsType", null);
        setField(term48, term48.getClass(), "parent", null);
        setField(term28, term28.getClass(), "last", term48);
        setField(term51, term51.getClass(), "next", null);
        setIntField(term51, term51.getClass(), "type", 0);
        setIntField(term51, term51.getClass(), "intValue", 0);
        setField(term51, term51.getClass(), "objectValue", null);
        setField(term28, term28.getClass(), "propListHead", term51);
        setIntField(term28, term28.getClass(), "sourcePosition", -117576464);
        setField(term28, term28.getClass(), "jsType", null);
        setField(term28, term28.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term28;
        try {
            callMethod(klass, "process", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


