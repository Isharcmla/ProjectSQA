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

public class NodeUtil_getBestLValue_1191268575315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4885;

    public NodeUtil_getBestLValue_1191268575315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4885, term4885.getClass(), "type", 680714112);
        setIntField(term4887, term4887.getClass(), "type", 385297023);
        setIntField(term4889, term4889.getClass(), "type", -134092543);
        setIntField(term4891, term4891.getClass(), "type", -1703642288);
        setIntField(term4893, term4893.getClass(), "type", 2075139747);
        setField(term4893, term4893.getClass(), "next", null);
        setField(term4893, term4893.getClass(), "first", null);
        setField(term4893, term4893.getClass(), "last", null);
        setField(term4893, term4893.getClass(), "propListHead", null);
        setIntField(term4893, term4893.getClass(), "sourcePosition", 0);
        setField(term4893, term4893.getClass(), "jsType", null);
        setField(term4893, term4893.getClass(), "parent", null);
        setField(term4891, term4891.getClass(), "next", term4893);
        setIntField(term4896, term4896.getClass(), "type", 2092881418);
        setField(term4896, term4896.getClass(), "next", null);
        setField(term4896, term4896.getClass(), "first", null);
        setField(term4896, term4896.getClass(), "last", term4893);
        setField(term4896, term4896.getClass(), "propListHead", null);
        setIntField(term4896, term4896.getClass(), "sourcePosition", 0);
        setField(term4896, term4896.getClass(), "jsType", null);
        setField(term4896, term4896.getClass(), "parent", null);
        setField(term4891, term4891.getClass(), "first", term4896);
        setField(term4891, term4891.getClass(), "last", term4889);
        setField(term4891, term4891.getClass(), "propListHead", null);
        setIntField(term4891, term4891.getClass(), "sourcePosition", 0);
        setField(term4891, term4891.getClass(), "jsType", null);
        setField(term4891, term4891.getClass(), "parent", null);
        setField(term4889, term4889.getClass(), "next", term4891);
        setField(term4889, term4889.getClass(), "first", term4893);
        setIntField(term4900, term4900.getClass(), "type", 1084102599);
        setIntField(term4902, term4902.getClass(), "type", -1743503755);
        setField(term4902, term4902.getClass(), "next", null);
        setField(term4902, term4902.getClass(), "first", term4896);
        setField(term4902, term4902.getClass(), "last", term4891);
        setField(term4902, term4902.getClass(), "propListHead", null);
        setIntField(term4902, term4902.getClass(), "sourcePosition", 0);
        setField(term4902, term4902.getClass(), "jsType", null);
        setField(term4902, term4902.getClass(), "parent", null);
        setField(term4900, term4900.getClass(), "next", term4902);
        setField(term4900, term4900.getClass(), "first", term4887);
        setField(term4900, term4900.getClass(), "last", term4887);
        setField(term4900, term4900.getClass(), "propListHead", null);
        setIntField(term4900, term4900.getClass(), "sourcePosition", 0);
        setField(term4900, term4900.getClass(), "jsType", null);
        setField(term4900, term4900.getClass(), "parent", null);
        setField(term4889, term4889.getClass(), "last", term4900);
        setField(term4889, term4889.getClass(), "propListHead", null);
        setIntField(term4889, term4889.getClass(), "sourcePosition", 0);
        setField(term4889, term4889.getClass(), "jsType", null);
        setField(term4889, term4889.getClass(), "parent", null);
        setField(term4887, term4887.getClass(), "next", term4889);
        setIntField(term4907, term4907.getClass(), "type", 1641342112);
        setField(term4907, term4907.getClass(), "next", term4900);
        setField(term4907, term4907.getClass(), "first", term4902);
        setField(term4907, term4907.getClass(), "last", term4885);
        setField(term4907, term4907.getClass(), "propListHead", null);
        setIntField(term4907, term4907.getClass(), "sourcePosition", 0);
        setField(term4907, term4907.getClass(), "jsType", null);
        setField(term4907, term4907.getClass(), "parent", null);
        setField(term4887, term4887.getClass(), "first", term4907);
        setField(term4887, term4887.getClass(), "last", term4907);
        setField(term4887, term4887.getClass(), "propListHead", null);
        setIntField(term4887, term4887.getClass(), "sourcePosition", 0);
        setField(term4887, term4887.getClass(), "jsType", null);
        setField(term4887, term4887.getClass(), "parent", null);
        setField(term4885, term4885.getClass(), "next", term4887);
        setField(term4885, term4885.getClass(), "first", term4891);
        setField(term4885, term4885.getClass(), "last", term4893);
        setField(term4885, term4885.getClass(), "propListHead", null);
        setIntField(term4885, term4885.getClass(), "sourcePosition", 0);
        setField(term4885, term4885.getClass(), "jsType", null);
        setField(term4885, term4885.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4885;
        try {
            callMethod(klass, "getBestLValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


