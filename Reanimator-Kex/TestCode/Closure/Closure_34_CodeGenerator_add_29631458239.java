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

public class CodeGenerator_add_29631458239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term89;

    public CodeGenerator_add_29631458239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term79 = new HashMap();
        term78 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term78, term78.getClass(), "ESCAPED_JS_STRINGS", term79);
        setField(term78, term78.getClass(), "cc", null);
        setField(term78, term78.getClass(), "outputCharsetEncoder", null);
        term89 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89, term89.getClass(), "type", 568599855);
        setIntField(term91, term91.getClass(), "type", 1162663216);
        setIntField(term93, term93.getClass(), "type", 1484323161);
        setIntField(term95, term95.getClass(), "type", 391863371);
        setIntField(term97, term97.getClass(), "type", -1922583790);
        setField(term97, term97.getClass(), "next", null);
        setField(term97, term97.getClass(), "first", null);
        setField(term97, term97.getClass(), "last", null);
        setField(term97, term97.getClass(), "propListHead", null);
        setIntField(term97, term97.getClass(), "sourcePosition", 0);
        setField(term97, term97.getClass(), "jsType", null);
        setField(term97, term97.getClass(), "parent", null);
        setField(term95, term95.getClass(), "next", term97);
        setIntField(term100, term100.getClass(), "type", -616727354);
        setField(term100, term100.getClass(), "next", null);
        setField(term100, term100.getClass(), "first", null);
        setField(term100, term100.getClass(), "last", term97);
        setField(term100, term100.getClass(), "propListHead", null);
        setIntField(term100, term100.getClass(), "sourcePosition", 0);
        setField(term100, term100.getClass(), "jsType", null);
        setField(term100, term100.getClass(), "parent", null);
        setField(term95, term95.getClass(), "first", term100);
        setField(term95, term95.getClass(), "last", term93);
        setField(term95, term95.getClass(), "propListHead", null);
        setIntField(term95, term95.getClass(), "sourcePosition", 0);
        setField(term95, term95.getClass(), "jsType", null);
        setField(term95, term95.getClass(), "parent", null);
        setField(term93, term93.getClass(), "next", term95);
        setField(term93, term93.getClass(), "first", term97);
        setIntField(term104, term104.getClass(), "type", -2038273078);
        setIntField(term106, term106.getClass(), "type", 1227103734);
        setField(term106, term106.getClass(), "next", null);
        setField(term106, term106.getClass(), "first", term100);
        setField(term106, term106.getClass(), "last", term95);
        setField(term106, term106.getClass(), "propListHead", null);
        setIntField(term106, term106.getClass(), "sourcePosition", 0);
        setField(term106, term106.getClass(), "jsType", null);
        setField(term106, term106.getClass(), "parent", null);
        setField(term104, term104.getClass(), "next", term106);
        setField(term104, term104.getClass(), "first", term91);
        setField(term104, term104.getClass(), "last", term91);
        setField(term104, term104.getClass(), "propListHead", null);
        setIntField(term104, term104.getClass(), "sourcePosition", 0);
        setField(term104, term104.getClass(), "jsType", null);
        setField(term104, term104.getClass(), "parent", null);
        setField(term93, term93.getClass(), "last", term104);
        setField(term93, term93.getClass(), "propListHead", null);
        setIntField(term93, term93.getClass(), "sourcePosition", 0);
        setField(term93, term93.getClass(), "jsType", null);
        setField(term93, term93.getClass(), "parent", null);
        setField(term91, term91.getClass(), "next", term93);
        setIntField(term111, term111.getClass(), "type", -1339778481);
        setField(term111, term111.getClass(), "next", term104);
        setField(term111, term111.getClass(), "first", term106);
        setField(term111, term111.getClass(), "last", term89);
        setField(term111, term111.getClass(), "propListHead", null);
        setIntField(term111, term111.getClass(), "sourcePosition", 0);
        setField(term111, term111.getClass(), "jsType", null);
        setField(term111, term111.getClass(), "parent", null);
        setField(term91, term91.getClass(), "first", term111);
        setField(term91, term91.getClass(), "last", term111);
        setField(term91, term91.getClass(), "propListHead", null);
        setIntField(term91, term91.getClass(), "sourcePosition", 0);
        setField(term91, term91.getClass(), "jsType", null);
        setField(term91, term91.getClass(), "parent", null);
        setField(term89, term89.getClass(), "next", term91);
        setField(term89, term89.getClass(), "first", term95);
        setField(term89, term89.getClass(), "last", term97);
        setField(term89, term89.getClass(), "propListHead", null);
        setIntField(term89, term89.getClass(), "sourcePosition", 0);
        setField(term89, term89.getClass(), "jsType", null);
        setField(term89, term89.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term89;
        try {
            callMethod(klass, "add", argTypes, term78, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


