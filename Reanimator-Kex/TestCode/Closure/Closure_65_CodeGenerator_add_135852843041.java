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
     Object term116;
     Object term127;
     Object enum8;

    public CodeGenerator_add_135852843041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term117 = new HashMap();
        term116 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term116, term116.getClass(), "ESCAPED_JS_STRINGS", term117);
        setField(term116, term116.getClass(), "cc", null);
        setField(term116, term116.getClass(), "outputCharsetEncoder", null);
        term127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term127, term127.getClass(), "type", 597278769);
        setIntField(term129, term129.getClass(), "type", 1048535127);
        setIntField(term131, term131.getClass(), "type", 0);
        setField(term131, term131.getClass(), "next", null);
        setField(term131, term131.getClass(), "first", null);
        setField(term131, term131.getClass(), "last", null);
        setField(term131, term131.getClass(), "propListHead", null);
        setIntField(term131, term131.getClass(), "sourcePosition", 0);
        setField(term131, term131.getClass(), "jsType", null);
        setField(term131, term131.getClass(), "parent", null);
        setField(term129, term129.getClass(), "next", term131);
        setIntField(term134, term134.getClass(), "type", 0);
        setField(term134, term134.getClass(), "next", null);
        setField(term134, term134.getClass(), "first", null);
        setField(term134, term134.getClass(), "last", null);
        setField(term134, term134.getClass(), "propListHead", null);
        setIntField(term134, term134.getClass(), "sourcePosition", 0);
        setField(term134, term134.getClass(), "jsType", null);
        setField(term134, term134.getClass(), "parent", null);
        setField(term129, term129.getClass(), "first", term134);
        setIntField(term137, term137.getClass(), "type", 0);
        setField(term137, term137.getClass(), "next", null);
        setField(term137, term137.getClass(), "first", null);
        setField(term137, term137.getClass(), "last", null);
        setField(term137, term137.getClass(), "propListHead", null);
        setIntField(term137, term137.getClass(), "sourcePosition", 0);
        setField(term137, term137.getClass(), "jsType", null);
        setField(term137, term137.getClass(), "parent", null);
        setField(term129, term129.getClass(), "last", term137);
        setField(term140, term140.getClass(), "next", null);
        setIntField(term140, term140.getClass(), "type", 0);
        setIntField(term140, term140.getClass(), "intValue", 0);
        setField(term140, term140.getClass(), "objectValue", null);
        setField(term129, term129.getClass(), "propListHead", term140);
        setIntField(term129, term129.getClass(), "sourcePosition", -2068769794);
        setField(term129, term129.getClass(), "jsType", null);
        setField(term129, term129.getClass(), "parent", null);
        setField(term127, term127.getClass(), "next", term129);
        setIntField(term144, term144.getClass(), "type", 0);
        setField(term144, term144.getClass(), "next", null);
        setField(term144, term144.getClass(), "first", null);
        setField(term144, term144.getClass(), "last", null);
        setField(term144, term144.getClass(), "propListHead", null);
        setIntField(term144, term144.getClass(), "sourcePosition", 0);
        setField(term144, term144.getClass(), "jsType", null);
        setField(term144, term144.getClass(), "parent", null);
        setField(term127, term127.getClass(), "first", term144);
        setIntField(term147, term147.getClass(), "type", 0);
        setField(term147, term147.getClass(), "next", null);
        setField(term147, term147.getClass(), "first", null);
        setField(term147, term147.getClass(), "last", null);
        setField(term147, term147.getClass(), "propListHead", null);
        setIntField(term147, term147.getClass(), "sourcePosition", 0);
        setField(term147, term147.getClass(), "jsType", null);
        setField(term147, term147.getClass(), "parent", null);
        setField(term127, term127.getClass(), "last", term147);
        setField(term150, term150.getClass(), "next", null);
        setIntField(term150, term150.getClass(), "type", 0);
        setIntField(term150, term150.getClass(), "intValue", 0);
        setField(term150, term150.getClass(), "objectValue", null);
        setField(term127, term127.getClass(), "propListHead", term150);
        setIntField(term127, term127.getClass(), "sourcePosition", -117576464);
        setField(term127, term127.getClass(), "jsType", null);
        setField(term127, term127.getClass(), "parent", null);
        Class<? extends Object> term5009 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term5008 = ((Class) term5009).getDeclaredField((String) "BEFORE_DANGLING_ELSE");
        ((Field) term5008).setAccessible(true);
        enum8 = ((Field) term5008).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[2];
        args[0] = term127;
        args[1] = enum8;
        try {
            callMethod(klass, "add", argTypes, term116, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


