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

public class NodeUtil_isStatement_664352338224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1865;

    public NodeUtil_isStatement_664352338224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1878 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1888 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1865, term1865.getClass(), "type", -1112119058);
        setIntField(term1867, term1867.getClass(), "type", -98060427);
        setIntField(term1869, term1869.getClass(), "type", 0);
        setField(term1869, term1869.getClass(), "next", null);
        setField(term1869, term1869.getClass(), "first", null);
        setField(term1869, term1869.getClass(), "last", null);
        setField(term1869, term1869.getClass(), "propListHead", null);
        setIntField(term1869, term1869.getClass(), "sourcePosition", 0);
        setField(term1869, term1869.getClass(), "jsType", null);
        setField(term1869, term1869.getClass(), "parent", null);
        setField(term1867, term1867.getClass(), "next", term1869);
        setIntField(term1872, term1872.getClass(), "type", 0);
        setField(term1872, term1872.getClass(), "next", null);
        setField(term1872, term1872.getClass(), "first", null);
        setField(term1872, term1872.getClass(), "last", null);
        setField(term1872, term1872.getClass(), "propListHead", null);
        setIntField(term1872, term1872.getClass(), "sourcePosition", 0);
        setField(term1872, term1872.getClass(), "jsType", null);
        setField(term1872, term1872.getClass(), "parent", null);
        setField(term1867, term1867.getClass(), "first", term1872);
        setIntField(term1875, term1875.getClass(), "type", 0);
        setField(term1875, term1875.getClass(), "next", null);
        setField(term1875, term1875.getClass(), "first", null);
        setField(term1875, term1875.getClass(), "last", null);
        setField(term1875, term1875.getClass(), "propListHead", null);
        setIntField(term1875, term1875.getClass(), "sourcePosition", 0);
        setField(term1875, term1875.getClass(), "jsType", null);
        setField(term1875, term1875.getClass(), "parent", null);
        setField(term1867, term1867.getClass(), "last", term1875);
        setField(term1878, term1878.getClass(), "next", null);
        setIntField(term1878, term1878.getClass(), "type", 0);
        setIntField(term1878, term1878.getClass(), "intValue", 0);
        setField(term1878, term1878.getClass(), "objectValue", null);
        setField(term1867, term1867.getClass(), "propListHead", term1878);
        setIntField(term1867, term1867.getClass(), "sourcePosition", -128435804);
        setField(term1867, term1867.getClass(), "jsType", null);
        setField(term1867, term1867.getClass(), "parent", null);
        setField(term1865, term1865.getClass(), "next", term1867);
        setIntField(term1882, term1882.getClass(), "type", 0);
        setField(term1882, term1882.getClass(), "next", null);
        setField(term1882, term1882.getClass(), "first", null);
        setField(term1882, term1882.getClass(), "last", null);
        setField(term1882, term1882.getClass(), "propListHead", null);
        setIntField(term1882, term1882.getClass(), "sourcePosition", 0);
        setField(term1882, term1882.getClass(), "jsType", null);
        setField(term1882, term1882.getClass(), "parent", null);
        setField(term1865, term1865.getClass(), "first", term1882);
        setIntField(term1885, term1885.getClass(), "type", 0);
        setField(term1885, term1885.getClass(), "next", null);
        setField(term1885, term1885.getClass(), "first", null);
        setField(term1885, term1885.getClass(), "last", null);
        setField(term1885, term1885.getClass(), "propListHead", null);
        setIntField(term1885, term1885.getClass(), "sourcePosition", 0);
        setField(term1885, term1885.getClass(), "jsType", null);
        setField(term1885, term1885.getClass(), "parent", null);
        setField(term1865, term1865.getClass(), "last", term1885);
        setField(term1888, term1888.getClass(), "next", null);
        setIntField(term1888, term1888.getClass(), "type", 0);
        setIntField(term1888, term1888.getClass(), "intValue", 0);
        setField(term1888, term1888.getClass(), "objectValue", null);
        setField(term1865, term1865.getClass(), "propListHead", term1888);
        setIntField(term1865, term1865.getClass(), "sourcePosition", 2136158480);
        setField(term1865, term1865.getClass(), "jsType", null);
        setField(term1865, term1865.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1865;
        try {
            callMethod(klass, "isStatement", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


