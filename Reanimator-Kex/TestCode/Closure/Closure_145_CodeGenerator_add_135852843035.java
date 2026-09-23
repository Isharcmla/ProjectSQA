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
import java.lang.String;

public class CodeGenerator_add_135852843035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term76;
     Object enum8;

    public CodeGenerator_add_135852843035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term75, term75.getClass(), "cc", null);
        setField(term75, term75.getClass(), "outputCharsetEncoder", null);
        term76 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term93 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term76, term76.getClass(), "type", 597278769);
        setIntField(term78, term78.getClass(), "type", 1048535127);
        setIntField(term80, term80.getClass(), "type", 0);
        setField(term80, term80.getClass(), "next", null);
        setField(term80, term80.getClass(), "first", null);
        setField(term80, term80.getClass(), "last", null);
        setField(term80, term80.getClass(), "propListHead", null);
        setIntField(term80, term80.getClass(), "sourcePosition", 0);
        setField(term80, term80.getClass(), "jsType", null);
        setField(term80, term80.getClass(), "parent", null);
        setField(term78, term78.getClass(), "next", term80);
        setIntField(term83, term83.getClass(), "type", 0);
        setField(term83, term83.getClass(), "next", null);
        setField(term83, term83.getClass(), "first", null);
        setField(term83, term83.getClass(), "last", null);
        setField(term83, term83.getClass(), "propListHead", null);
        setIntField(term83, term83.getClass(), "sourcePosition", 0);
        setField(term83, term83.getClass(), "jsType", null);
        setField(term83, term83.getClass(), "parent", null);
        setField(term78, term78.getClass(), "first", term83);
        setIntField(term86, term86.getClass(), "type", 0);
        setField(term86, term86.getClass(), "next", null);
        setField(term86, term86.getClass(), "first", null);
        setField(term86, term86.getClass(), "last", null);
        setField(term86, term86.getClass(), "propListHead", null);
        setIntField(term86, term86.getClass(), "sourcePosition", 0);
        setField(term86, term86.getClass(), "jsType", null);
        setField(term86, term86.getClass(), "parent", null);
        setField(term78, term78.getClass(), "last", term86);
        setField(term89, term89.getClass(), "next", null);
        setIntField(term89, term89.getClass(), "type", 0);
        setIntField(term89, term89.getClass(), "intValue", 0);
        setField(term89, term89.getClass(), "objectValue", null);
        setField(term78, term78.getClass(), "propListHead", term89);
        setIntField(term78, term78.getClass(), "sourcePosition", -2068769794);
        setField(term78, term78.getClass(), "jsType", null);
        setField(term78, term78.getClass(), "parent", null);
        setField(term76, term76.getClass(), "next", term78);
        setIntField(term93, term93.getClass(), "type", 0);
        setField(term93, term93.getClass(), "next", null);
        setField(term93, term93.getClass(), "first", null);
        setField(term93, term93.getClass(), "last", null);
        setField(term93, term93.getClass(), "propListHead", null);
        setIntField(term93, term93.getClass(), "sourcePosition", 0);
        setField(term93, term93.getClass(), "jsType", null);
        setField(term93, term93.getClass(), "parent", null);
        setField(term76, term76.getClass(), "first", term93);
        setIntField(term96, term96.getClass(), "type", 0);
        setField(term96, term96.getClass(), "next", null);
        setField(term96, term96.getClass(), "first", null);
        setField(term96, term96.getClass(), "last", null);
        setField(term96, term96.getClass(), "propListHead", null);
        setIntField(term96, term96.getClass(), "sourcePosition", 0);
        setField(term96, term96.getClass(), "jsType", null);
        setField(term96, term96.getClass(), "parent", null);
        setField(term76, term76.getClass(), "last", term96);
        setField(term99, term99.getClass(), "next", null);
        setIntField(term99, term99.getClass(), "type", 0);
        setIntField(term99, term99.getClass(), "intValue", 0);
        setField(term99, term99.getClass(), "objectValue", null);
        setField(term76, term76.getClass(), "propListHead", term99);
        setIntField(term76, term76.getClass(), "sourcePosition", -117576464);
        setField(term76, term76.getClass(), "jsType", null);
        setField(term76, term76.getClass(), "parent", null);
        Class<? extends Object> term4419 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term4418 = ((Class) term4419).getDeclaredField((String) "BEFORE_DANGLING_ELSE");
        ((Field) term4418).setAccessible(true);
        enum8 = ((Field) term4418).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[2];
        args[0] = term76;
        args[1] = enum8;
        try {
            callMethod(klass, "add", argTypes, term75, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


