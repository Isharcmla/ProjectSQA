package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_defaultCase_182453278895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term867;

    public IR_defaultCase_182453278895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term867, term867.getClass(), "type", 278355793);
        setIntField(term869, term869.getClass(), "type", -310648604);
        setIntField(term871, term871.getClass(), "type", -648200466);
        setIntField(term873, term873.getClass(), "type", 2007134147);
        setIntField(term875, term875.getClass(), "type", 993388358);
        setField(term875, term875.getClass(), "next", null);
        setField(term875, term875.getClass(), "first", null);
        setField(term875, term875.getClass(), "last", null);
        setField(term875, term875.getClass(), "propListHead", null);
        setIntField(term875, term875.getClass(), "sourcePosition", 0);
        setField(term875, term875.getClass(), "jsType", null);
        setField(term875, term875.getClass(), "parent", null);
        setField(term873, term873.getClass(), "next", term875);
        setIntField(term878, term878.getClass(), "type", -765191335);
        setField(term878, term878.getClass(), "next", null);
        setField(term878, term878.getClass(), "first", null);
        setField(term878, term878.getClass(), "last", term875);
        setField(term878, term878.getClass(), "propListHead", null);
        setIntField(term878, term878.getClass(), "sourcePosition", 0);
        setField(term878, term878.getClass(), "jsType", null);
        setField(term878, term878.getClass(), "parent", null);
        setField(term873, term873.getClass(), "first", term878);
        setField(term873, term873.getClass(), "last", term871);
        setField(term873, term873.getClass(), "propListHead", null);
        setIntField(term873, term873.getClass(), "sourcePosition", 0);
        setField(term873, term873.getClass(), "jsType", null);
        setField(term873, term873.getClass(), "parent", null);
        setField(term871, term871.getClass(), "next", term873);
        setField(term871, term871.getClass(), "first", term875);
        setIntField(term882, term882.getClass(), "type", 1295839803);
        setIntField(term884, term884.getClass(), "type", -1891015523);
        setField(term884, term884.getClass(), "next", null);
        setField(term884, term884.getClass(), "first", term878);
        setField(term884, term884.getClass(), "last", term873);
        setField(term884, term884.getClass(), "propListHead", null);
        setIntField(term884, term884.getClass(), "sourcePosition", 0);
        setField(term884, term884.getClass(), "jsType", null);
        setField(term884, term884.getClass(), "parent", null);
        setField(term882, term882.getClass(), "next", term884);
        setField(term882, term882.getClass(), "first", term869);
        setField(term882, term882.getClass(), "last", term869);
        setField(term882, term882.getClass(), "propListHead", null);
        setIntField(term882, term882.getClass(), "sourcePosition", 0);
        setField(term882, term882.getClass(), "jsType", null);
        setField(term882, term882.getClass(), "parent", null);
        setField(term871, term871.getClass(), "last", term882);
        setField(term871, term871.getClass(), "propListHead", null);
        setIntField(term871, term871.getClass(), "sourcePosition", 0);
        setField(term871, term871.getClass(), "jsType", null);
        setField(term871, term871.getClass(), "parent", null);
        setField(term869, term869.getClass(), "next", term871);
        setIntField(term889, term889.getClass(), "type", -1560631747);
        setField(term889, term889.getClass(), "next", term882);
        setField(term889, term889.getClass(), "first", term884);
        setField(term889, term889.getClass(), "last", term867);
        setField(term889, term889.getClass(), "propListHead", null);
        setIntField(term889, term889.getClass(), "sourcePosition", 0);
        setField(term889, term889.getClass(), "jsType", null);
        setField(term889, term889.getClass(), "parent", null);
        setField(term869, term869.getClass(), "first", term889);
        setField(term869, term869.getClass(), "last", term889);
        setField(term869, term869.getClass(), "propListHead", null);
        setIntField(term869, term869.getClass(), "sourcePosition", 0);
        setField(term869, term869.getClass(), "jsType", null);
        setField(term869, term869.getClass(), "parent", null);
        setField(term867, term867.getClass(), "next", term869);
        setField(term867, term867.getClass(), "first", term873);
        setField(term867, term867.getClass(), "last", term875);
        setField(term867, term867.getClass(), "propListHead", null);
        setIntField(term867, term867.getClass(), "sourcePosition", 0);
        setField(term867, term867.getClass(), "jsType", null);
        setField(term867, term867.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term867;
        try {
            callMethod(klass, "defaultCase", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


