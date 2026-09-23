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

public class CodeGenerator_add_135852843040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76;
     Object term77;
     Object enum8;

    public CodeGenerator_add_135852843040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term76, term76.getClass(), "cc", null);
        setField(term76, term76.getClass(), "outputCharsetEncoder", null);
        term77 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term94 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term77, term77.getClass(), "type", 597278769);
        setIntField(term79, term79.getClass(), "type", 1048535127);
        setIntField(term81, term81.getClass(), "type", 0);
        setField(term81, term81.getClass(), "next", null);
        setField(term81, term81.getClass(), "first", null);
        setField(term81, term81.getClass(), "last", null);
        setField(term81, term81.getClass(), "propListHead", null);
        setIntField(term81, term81.getClass(), "sourcePosition", 0);
        setField(term81, term81.getClass(), "jsType", null);
        setField(term81, term81.getClass(), "parent", null);
        setField(term79, term79.getClass(), "next", term81);
        setIntField(term84, term84.getClass(), "type", 0);
        setField(term84, term84.getClass(), "next", null);
        setField(term84, term84.getClass(), "first", null);
        setField(term84, term84.getClass(), "last", null);
        setField(term84, term84.getClass(), "propListHead", null);
        setIntField(term84, term84.getClass(), "sourcePosition", 0);
        setField(term84, term84.getClass(), "jsType", null);
        setField(term84, term84.getClass(), "parent", null);
        setField(term79, term79.getClass(), "first", term84);
        setIntField(term87, term87.getClass(), "type", 0);
        setField(term87, term87.getClass(), "next", null);
        setField(term87, term87.getClass(), "first", null);
        setField(term87, term87.getClass(), "last", null);
        setField(term87, term87.getClass(), "propListHead", null);
        setIntField(term87, term87.getClass(), "sourcePosition", 0);
        setField(term87, term87.getClass(), "jsType", null);
        setField(term87, term87.getClass(), "parent", null);
        setField(term79, term79.getClass(), "last", term87);
        setField(term90, term90.getClass(), "next", null);
        setIntField(term90, term90.getClass(), "type", 0);
        setIntField(term90, term90.getClass(), "intValue", 0);
        setField(term90, term90.getClass(), "objectValue", null);
        setField(term79, term79.getClass(), "propListHead", term90);
        setIntField(term79, term79.getClass(), "sourcePosition", -2068769794);
        setField(term79, term79.getClass(), "jsType", null);
        setField(term79, term79.getClass(), "parent", null);
        setField(term77, term77.getClass(), "next", term79);
        setIntField(term94, term94.getClass(), "type", 0);
        setField(term94, term94.getClass(), "next", null);
        setField(term94, term94.getClass(), "first", null);
        setField(term94, term94.getClass(), "last", null);
        setField(term94, term94.getClass(), "propListHead", null);
        setIntField(term94, term94.getClass(), "sourcePosition", 0);
        setField(term94, term94.getClass(), "jsType", null);
        setField(term94, term94.getClass(), "parent", null);
        setField(term77, term77.getClass(), "first", term94);
        setIntField(term97, term97.getClass(), "type", 0);
        setField(term97, term97.getClass(), "next", null);
        setField(term97, term97.getClass(), "first", null);
        setField(term97, term97.getClass(), "last", null);
        setField(term97, term97.getClass(), "propListHead", null);
        setIntField(term97, term97.getClass(), "sourcePosition", 0);
        setField(term97, term97.getClass(), "jsType", null);
        setField(term97, term97.getClass(), "parent", null);
        setField(term77, term77.getClass(), "last", term97);
        setField(term100, term100.getClass(), "next", null);
        setIntField(term100, term100.getClass(), "type", 0);
        setIntField(term100, term100.getClass(), "intValue", 0);
        setField(term100, term100.getClass(), "objectValue", null);
        setField(term77, term77.getClass(), "propListHead", term100);
        setIntField(term77, term77.getClass(), "sourcePosition", -117576464);
        setField(term77, term77.getClass(), "jsType", null);
        setField(term77, term77.getClass(), "parent", null);
        Class<? extends Object> term4729 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term4728 = ((Class) term4729).getDeclaredField((String) "BEFORE_DANGLING_ELSE");
        ((Field) term4728).setAccessible(true);
        enum8 = ((Field) term4728).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[2];
        args[0] = term77;
        args[1] = enum8;
        try {
            callMethod(klass, "add", argTypes, term76, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


