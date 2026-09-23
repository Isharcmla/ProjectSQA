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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FoldConstants_getBlockExpression_79506374385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5001;
     Object term5002;

    public FoldConstants_getBlockExpression_79506374385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5001 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term5001, term5001.getClass(), "compiler", null);
        term5002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5015 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5025 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5002, term5002.getClass(), "type", -1652588127);
        setIntField(term5004, term5004.getClass(), "type", 1763217806);
        setIntField(term5006, term5006.getClass(), "type", 0);
        setField(term5006, term5006.getClass(), "next", null);
        setField(term5006, term5006.getClass(), "first", null);
        setField(term5006, term5006.getClass(), "last", null);
        setField(term5006, term5006.getClass(), "propListHead", null);
        setIntField(term5006, term5006.getClass(), "sourcePosition", 0);
        setField(term5006, term5006.getClass(), "jsType", null);
        setField(term5006, term5006.getClass(), "parent", null);
        setField(term5004, term5004.getClass(), "next", term5006);
        setIntField(term5009, term5009.getClass(), "type", 0);
        setField(term5009, term5009.getClass(), "next", null);
        setField(term5009, term5009.getClass(), "first", null);
        setField(term5009, term5009.getClass(), "last", null);
        setField(term5009, term5009.getClass(), "propListHead", null);
        setIntField(term5009, term5009.getClass(), "sourcePosition", 0);
        setField(term5009, term5009.getClass(), "jsType", null);
        setField(term5009, term5009.getClass(), "parent", null);
        setField(term5004, term5004.getClass(), "first", term5009);
        setIntField(term5012, term5012.getClass(), "type", 0);
        setField(term5012, term5012.getClass(), "next", null);
        setField(term5012, term5012.getClass(), "first", null);
        setField(term5012, term5012.getClass(), "last", null);
        setField(term5012, term5012.getClass(), "propListHead", null);
        setIntField(term5012, term5012.getClass(), "sourcePosition", 0);
        setField(term5012, term5012.getClass(), "jsType", null);
        setField(term5012, term5012.getClass(), "parent", null);
        setField(term5004, term5004.getClass(), "last", term5012);
        setField(term5015, term5015.getClass(), "next", null);
        setIntField(term5015, term5015.getClass(), "type", 0);
        setIntField(term5015, term5015.getClass(), "intValue", 0);
        setField(term5015, term5015.getClass(), "objectValue", null);
        setField(term5004, term5004.getClass(), "propListHead", term5015);
        setIntField(term5004, term5004.getClass(), "sourcePosition", 522440332);
        setField(term5004, term5004.getClass(), "jsType", null);
        setField(term5004, term5004.getClass(), "parent", null);
        setField(term5002, term5002.getClass(), "next", term5004);
        setIntField(term5019, term5019.getClass(), "type", 0);
        setField(term5019, term5019.getClass(), "next", null);
        setField(term5019, term5019.getClass(), "first", null);
        setField(term5019, term5019.getClass(), "last", null);
        setField(term5019, term5019.getClass(), "propListHead", null);
        setIntField(term5019, term5019.getClass(), "sourcePosition", 0);
        setField(term5019, term5019.getClass(), "jsType", null);
        setField(term5019, term5019.getClass(), "parent", null);
        setField(term5002, term5002.getClass(), "first", term5019);
        setIntField(term5022, term5022.getClass(), "type", 0);
        setField(term5022, term5022.getClass(), "next", null);
        setField(term5022, term5022.getClass(), "first", null);
        setField(term5022, term5022.getClass(), "last", null);
        setField(term5022, term5022.getClass(), "propListHead", null);
        setIntField(term5022, term5022.getClass(), "sourcePosition", 0);
        setField(term5022, term5022.getClass(), "jsType", null);
        setField(term5022, term5022.getClass(), "parent", null);
        setField(term5002, term5002.getClass(), "last", term5022);
        setField(term5025, term5025.getClass(), "next", null);
        setIntField(term5025, term5025.getClass(), "type", 0);
        setIntField(term5025, term5025.getClass(), "intValue", 0);
        setField(term5025, term5025.getClass(), "objectValue", null);
        setField(term5002, term5002.getClass(), "propListHead", term5025);
        setIntField(term5002, term5002.getClass(), "sourcePosition", 1516598327);
        setField(term5002, term5002.getClass(), "jsType", null);
        setField(term5002, term5002.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5002;
        try {
            callMethod(klass, "getBlockExpression", argTypes, term5001, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


