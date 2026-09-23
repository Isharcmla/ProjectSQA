package com.google.javascript.rhino.jstype;

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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArrowType_getGreatestSubtype_196319664021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390;

    public ArrowType_getGreatestSubtype_196319664021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term391, term391.getClass(), "type", -1547384488);
        setIntField(term393, term393.getClass(), "type", 1442160736);
        setIntField(term395, term395.getClass(), "type", 1114000454);
        setIntField(term397, term397.getClass(), "type", -556405712);
        setField(term397, term397.getClass(), "next", null);
        setField(term397, term397.getClass(), "first", null);
        setField(term397, term397.getClass(), "last", null);
        setField(term397, term397.getClass(), "propListHead", null);
        setIntField(term397, term397.getClass(), "sourcePosition", 0);
        setField(term397, term397.getClass(), "jsType", null);
        setField(term397, term397.getClass(), "parent", null);
        setField(term395, term395.getClass(), "next", term397);
        setIntField(term400, term400.getClass(), "type", -344842608);
        setField(term400, term400.getClass(), "next", null);
        setField(term400, term400.getClass(), "first", term391);
        setField(term400, term400.getClass(), "last", null);
        setField(term400, term400.getClass(), "propListHead", null);
        setIntField(term400, term400.getClass(), "sourcePosition", 0);
        setField(term400, term400.getClass(), "jsType", null);
        setField(term400, term400.getClass(), "parent", null);
        setField(term395, term395.getClass(), "first", term400);
        setIntField(term403, term403.getClass(), "type", -1845499264);
        setField(term403, term403.getClass(), "next", null);
        setField(term403, term403.getClass(), "first", term393);
        setField(term403, term403.getClass(), "last", null);
        setField(term403, term403.getClass(), "propListHead", null);
        setIntField(term403, term403.getClass(), "sourcePosition", 0);
        setField(term403, term403.getClass(), "jsType", null);
        setField(term403, term403.getClass(), "parent", null);
        setField(term395, term395.getClass(), "last", term403);
        setField(term395, term395.getClass(), "propListHead", null);
        setIntField(term395, term395.getClass(), "sourcePosition", 0);
        setField(term395, term395.getClass(), "jsType", null);
        setField(term395, term395.getClass(), "parent", null);
        setField(term393, term393.getClass(), "next", term395);
        setField(term393, term393.getClass(), "first", term395);
        setIntField(term407, term407.getClass(), "type", -1772434990);
        setField(term407, term407.getClass(), "next", term403);
        setField(term407, term407.getClass(), "first", term400);
        setField(term407, term407.getClass(), "last", term400);
        setField(term407, term407.getClass(), "propListHead", null);
        setIntField(term407, term407.getClass(), "sourcePosition", 0);
        setField(term407, term407.getClass(), "jsType", null);
        setField(term407, term407.getClass(), "parent", null);
        setField(term393, term393.getClass(), "last", term407);
        setField(term393, term393.getClass(), "propListHead", null);
        setIntField(term393, term393.getClass(), "sourcePosition", 0);
        setField(term393, term393.getClass(), "jsType", null);
        setField(term393, term393.getClass(), "parent", null);
        setField(term391, term391.getClass(), "next", term393);
        setField(term391, term391.getClass(), "first", term400);
        setIntField(term411, term411.getClass(), "type", 0);
        setField(term411, term411.getClass(), "next", null);
        setField(term411, term411.getClass(), "first", null);
        setField(term411, term411.getClass(), "last", null);
        setField(term411, term411.getClass(), "propListHead", null);
        setIntField(term411, term411.getClass(), "sourcePosition", 0);
        setField(term411, term411.getClass(), "jsType", null);
        setField(term411, term411.getClass(), "parent", null);
        setField(term391, term391.getClass(), "last", term411);
        setField(term391, term391.getClass(), "propListHead", null);
        setIntField(term391, term391.getClass(), "sourcePosition", 0);
        setField(term391, term391.getClass(), "jsType", null);
        setField(term391, term391.getClass(), "parent", null);
        setField(term390, term390.getClass(), "parameters", term391);
        setField(term390, term390.getClass(), "returnType", null);
        setBooleanField(term390, term390.getClass(), "returnTypeInferred", false);
        setBooleanField(term390, term390.getClass(), "resolved", false);
        setField(term390, term390.getClass(), "resolveResult", null);
        setField(term390, term390.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term390, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


