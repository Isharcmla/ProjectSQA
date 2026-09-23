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

public class CodeGenerator_add_135852843040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116;
     Object term127;
     Object enum9;

    public CodeGenerator_add_135852843040() {
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
        Object term133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term127, term127.getClass(), "type", 1725571209);
        setIntField(term129, term129.getClass(), "type", -522618178);
        setIntField(term131, term131.getClass(), "type", 1134449235);
        setIntField(term133, term133.getClass(), "type", -883034806);
        setIntField(term135, term135.getClass(), "type", 1585847225);
        setField(term135, term135.getClass(), "next", null);
        setField(term135, term135.getClass(), "first", null);
        setField(term135, term135.getClass(), "last", null);
        setField(term135, term135.getClass(), "propListHead", null);
        setIntField(term135, term135.getClass(), "sourcePosition", 0);
        setField(term135, term135.getClass(), "jsType", null);
        setField(term135, term135.getClass(), "parent", null);
        setField(term133, term133.getClass(), "next", term135);
        setIntField(term138, term138.getClass(), "type", 597278769);
        setField(term138, term138.getClass(), "next", null);
        setField(term138, term138.getClass(), "first", null);
        setField(term138, term138.getClass(), "last", term135);
        setField(term138, term138.getClass(), "propListHead", null);
        setIntField(term138, term138.getClass(), "sourcePosition", 0);
        setField(term138, term138.getClass(), "jsType", null);
        setField(term138, term138.getClass(), "parent", null);
        setField(term133, term133.getClass(), "first", term138);
        setField(term133, term133.getClass(), "last", term131);
        setField(term133, term133.getClass(), "propListHead", null);
        setIntField(term133, term133.getClass(), "sourcePosition", 0);
        setField(term133, term133.getClass(), "jsType", null);
        setField(term133, term133.getClass(), "parent", null);
        setField(term131, term131.getClass(), "next", term133);
        setField(term131, term131.getClass(), "first", term135);
        setIntField(term142, term142.getClass(), "type", -1456670397);
        setIntField(term144, term144.getClass(), "type", 1622346318);
        setField(term144, term144.getClass(), "next", null);
        setField(term144, term144.getClass(), "first", term138);
        setField(term144, term144.getClass(), "last", term133);
        setField(term144, term144.getClass(), "propListHead", null);
        setIntField(term144, term144.getClass(), "sourcePosition", 0);
        setField(term144, term144.getClass(), "jsType", null);
        setField(term144, term144.getClass(), "parent", null);
        setField(term142, term142.getClass(), "next", term144);
        setField(term142, term142.getClass(), "first", term129);
        setField(term142, term142.getClass(), "last", term129);
        setField(term142, term142.getClass(), "propListHead", null);
        setIntField(term142, term142.getClass(), "sourcePosition", 0);
        setField(term142, term142.getClass(), "jsType", null);
        setField(term142, term142.getClass(), "parent", null);
        setField(term131, term131.getClass(), "last", term142);
        setField(term131, term131.getClass(), "propListHead", null);
        setIntField(term131, term131.getClass(), "sourcePosition", 0);
        setField(term131, term131.getClass(), "jsType", null);
        setField(term131, term131.getClass(), "parent", null);
        setField(term129, term129.getClass(), "next", term131);
        setIntField(term149, term149.getClass(), "type", 1048535127);
        setField(term149, term149.getClass(), "next", term142);
        setField(term149, term149.getClass(), "first", term144);
        setField(term149, term149.getClass(), "last", term127);
        setField(term149, term149.getClass(), "propListHead", null);
        setIntField(term149, term149.getClass(), "sourcePosition", 0);
        setField(term149, term149.getClass(), "jsType", null);
        setField(term149, term149.getClass(), "parent", null);
        setField(term129, term129.getClass(), "first", term149);
        setField(term129, term129.getClass(), "last", term149);
        setField(term129, term129.getClass(), "propListHead", null);
        setIntField(term129, term129.getClass(), "sourcePosition", 0);
        setField(term129, term129.getClass(), "jsType", null);
        setField(term129, term129.getClass(), "parent", null);
        setField(term127, term127.getClass(), "next", term129);
        setField(term127, term127.getClass(), "first", term133);
        setField(term127, term127.getClass(), "last", term135);
        setField(term127, term127.getClass(), "propListHead", null);
        setIntField(term127, term127.getClass(), "sourcePosition", 0);
        setField(term127, term127.getClass(), "jsType", null);
        setField(term127, term127.getClass(), "parent", null);
        Class<? extends Object> term5295 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term5294 = ((Class) term5295).getDeclaredField((String) "BEFORE_DANGLING_ELSE");
        ((Field) term5294).setAccessible(true);
        enum9 = ((Field) term5294).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[2];
        args[0] = term127;
        args[1] = enum9;
        try {
            callMethod(klass, "add", argTypes, term116, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


