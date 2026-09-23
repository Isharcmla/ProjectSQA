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

public class CodeGenerator_add_135852843041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110;
     Object term121;
     Object enum8;

    public CodeGenerator_add_135852843041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term111 = new HashMap();
        term110 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term110, term110.getClass(), "ESCAPED_JS_STRINGS", term111);
        setField(term110, term110.getClass(), "cc", null);
        setField(term110, term110.getClass(), "outputCharsetEncoder", null);
        term121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term121, term121.getClass(), "type", -883034806);
        setIntField(term123, term123.getClass(), "type", -1456670397);
        setIntField(term125, term125.getClass(), "type", 0);
        setField(term125, term125.getClass(), "next", null);
        setField(term125, term125.getClass(), "first", null);
        setField(term125, term125.getClass(), "last", null);
        setField(term125, term125.getClass(), "propListHead", null);
        setIntField(term125, term125.getClass(), "sourcePosition", 0);
        setField(term125, term125.getClass(), "jsType", null);
        setField(term125, term125.getClass(), "parent", null);
        setField(term123, term123.getClass(), "next", term125);
        setIntField(term128, term128.getClass(), "type", 0);
        setField(term128, term128.getClass(), "next", null);
        setField(term128, term128.getClass(), "first", null);
        setField(term128, term128.getClass(), "last", null);
        setField(term128, term128.getClass(), "propListHead", null);
        setIntField(term128, term128.getClass(), "sourcePosition", 0);
        setField(term128, term128.getClass(), "jsType", null);
        setField(term128, term128.getClass(), "parent", null);
        setField(term123, term123.getClass(), "first", term128);
        setIntField(term131, term131.getClass(), "type", 0);
        setField(term131, term131.getClass(), "next", null);
        setField(term131, term131.getClass(), "first", null);
        setField(term131, term131.getClass(), "last", null);
        setField(term131, term131.getClass(), "propListHead", null);
        setIntField(term131, term131.getClass(), "sourcePosition", 0);
        setField(term131, term131.getClass(), "jsType", null);
        setField(term131, term131.getClass(), "parent", null);
        setField(term123, term123.getClass(), "last", term131);
        setField(term123, term123.getClass(), "propListHead", null);
        setIntField(term123, term123.getClass(), "sourcePosition", 0);
        setField(term123, term123.getClass(), "jsType", null);
        setField(term123, term123.getClass(), "parent", null);
        setField(term121, term121.getClass(), "next", term123);
        setIntField(term135, term135.getClass(), "type", 0);
        setField(term135, term135.getClass(), "next", null);
        setField(term135, term135.getClass(), "first", null);
        setField(term135, term135.getClass(), "last", null);
        setField(term135, term135.getClass(), "propListHead", null);
        setIntField(term135, term135.getClass(), "sourcePosition", 0);
        setField(term135, term135.getClass(), "jsType", null);
        setField(term135, term135.getClass(), "parent", null);
        setField(term121, term121.getClass(), "first", term135);
        setIntField(term138, term138.getClass(), "type", 0);
        setField(term138, term138.getClass(), "next", null);
        setField(term138, term138.getClass(), "first", null);
        setField(term138, term138.getClass(), "last", null);
        setField(term138, term138.getClass(), "propListHead", null);
        setIntField(term138, term138.getClass(), "sourcePosition", 0);
        setField(term138, term138.getClass(), "jsType", null);
        setField(term138, term138.getClass(), "parent", null);
        setField(term121, term121.getClass(), "last", term138);
        setField(term121, term121.getClass(), "propListHead", null);
        setIntField(term121, term121.getClass(), "sourcePosition", 0);
        setField(term121, term121.getClass(), "jsType", null);
        setField(term121, term121.getClass(), "parent", null);
        Class<? extends Object> term4892 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term4891 = ((Class) term4892).getDeclaredField((String) "BEFORE_DANGLING_ELSE");
        ((Field) term4891).setAccessible(true);
        enum8 = ((Field) term4891).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[2];
        args[0] = term121;
        args[1] = enum8;
        try {
            callMethod(klass, "add", argTypes, term110, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


