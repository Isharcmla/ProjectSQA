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

public class CodeConsumer_endSourceMapping_205899348232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;

    public CodeConsumer_endSourceMapping_205899348232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28, term28.getClass(), "type", 1725571209);
        setIntField(term30, term30.getClass(), "type", -522618178);
        setIntField(term32, term32.getClass(), "type", 1134449235);
        setIntField(term34, term34.getClass(), "type", -883034806);
        setIntField(term36, term36.getClass(), "type", 1585847225);
        setField(term36, term36.getClass(), "next", null);
        setField(term36, term36.getClass(), "first", null);
        setField(term36, term36.getClass(), "last", null);
        setField(term36, term36.getClass(), "propListHead", null);
        setIntField(term36, term36.getClass(), "sourcePosition", 0);
        setField(term36, term36.getClass(), "jsType", null);
        setField(term36, term36.getClass(), "parent", null);
        setField(term34, term34.getClass(), "next", term36);
        setIntField(term39, term39.getClass(), "type", 597278769);
        setField(term39, term39.getClass(), "next", null);
        setField(term39, term39.getClass(), "first", null);
        setField(term39, term39.getClass(), "last", term36);
        setField(term39, term39.getClass(), "propListHead", null);
        setIntField(term39, term39.getClass(), "sourcePosition", 0);
        setField(term39, term39.getClass(), "jsType", null);
        setField(term39, term39.getClass(), "parent", null);
        setField(term34, term34.getClass(), "first", term39);
        setField(term34, term34.getClass(), "last", term32);
        setField(term34, term34.getClass(), "propListHead", null);
        setIntField(term34, term34.getClass(), "sourcePosition", 0);
        setField(term34, term34.getClass(), "jsType", null);
        setField(term34, term34.getClass(), "parent", null);
        setField(term32, term32.getClass(), "next", term34);
        setField(term32, term32.getClass(), "first", term36);
        setIntField(term43, term43.getClass(), "type", -1456670397);
        setIntField(term45, term45.getClass(), "type", 1622346318);
        setField(term45, term45.getClass(), "next", null);
        setField(term45, term45.getClass(), "first", term39);
        setField(term45, term45.getClass(), "last", term34);
        setField(term45, term45.getClass(), "propListHead", null);
        setIntField(term45, term45.getClass(), "sourcePosition", 0);
        setField(term45, term45.getClass(), "jsType", null);
        setField(term45, term45.getClass(), "parent", null);
        setField(term43, term43.getClass(), "next", term45);
        setField(term43, term43.getClass(), "first", term30);
        setField(term43, term43.getClass(), "last", term30);
        setField(term43, term43.getClass(), "propListHead", null);
        setIntField(term43, term43.getClass(), "sourcePosition", 0);
        setField(term43, term43.getClass(), "jsType", null);
        setField(term43, term43.getClass(), "parent", null);
        setField(term32, term32.getClass(), "last", term43);
        setField(term32, term32.getClass(), "propListHead", null);
        setIntField(term32, term32.getClass(), "sourcePosition", 0);
        setField(term32, term32.getClass(), "jsType", null);
        setField(term32, term32.getClass(), "parent", null);
        setField(term30, term30.getClass(), "next", term32);
        setIntField(term50, term50.getClass(), "type", 1048535127);
        setField(term50, term50.getClass(), "next", term43);
        setField(term50, term50.getClass(), "first", term45);
        setField(term50, term50.getClass(), "last", term28);
        setField(term50, term50.getClass(), "propListHead", null);
        setIntField(term50, term50.getClass(), "sourcePosition", 0);
        setField(term50, term50.getClass(), "jsType", null);
        setField(term50, term50.getClass(), "parent", null);
        setField(term30, term30.getClass(), "first", term50);
        setField(term30, term30.getClass(), "last", term50);
        setField(term30, term30.getClass(), "propListHead", null);
        setIntField(term30, term30.getClass(), "sourcePosition", 0);
        setField(term30, term30.getClass(), "jsType", null);
        setField(term30, term30.getClass(), "parent", null);
        setField(term28, term28.getClass(), "next", term30);
        setField(term28, term28.getClass(), "first", term34);
        setField(term28, term28.getClass(), "last", term36);
        setField(term28, term28.getClass(), "propListHead", null);
        setIntField(term28, term28.getClass(), "sourcePosition", 0);
        setField(term28, term28.getClass(), "jsType", null);
        setField(term28, term28.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeConsumer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28;
        try {
            callMethod(klass, "endSourceMapping", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


