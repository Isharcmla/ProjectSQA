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

public class IR_voidNode_54812825119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1912;

    public IR_voidNode_54812825119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1912, term1912.getClass(), "type", -271094506);
        setIntField(term1914, term1914.getClass(), "type", 455632030);
        setIntField(term1916, term1916.getClass(), "type", -1632929393);
        setIntField(term1918, term1918.getClass(), "type", -431440129);
        setIntField(term1920, term1920.getClass(), "type", -763576148);
        setField(term1920, term1920.getClass(), "next", null);
        setField(term1920, term1920.getClass(), "first", null);
        setField(term1920, term1920.getClass(), "last", null);
        setField(term1920, term1920.getClass(), "propListHead", null);
        setIntField(term1920, term1920.getClass(), "sourcePosition", 0);
        setField(term1920, term1920.getClass(), "jsType", null);
        setField(term1920, term1920.getClass(), "parent", null);
        setField(term1918, term1918.getClass(), "next", term1920);
        setIntField(term1923, term1923.getClass(), "type", 1568948514);
        setField(term1923, term1923.getClass(), "next", null);
        setField(term1923, term1923.getClass(), "first", null);
        setField(term1923, term1923.getClass(), "last", term1920);
        setField(term1923, term1923.getClass(), "propListHead", null);
        setIntField(term1923, term1923.getClass(), "sourcePosition", 0);
        setField(term1923, term1923.getClass(), "jsType", null);
        setField(term1923, term1923.getClass(), "parent", null);
        setField(term1918, term1918.getClass(), "first", term1923);
        setField(term1918, term1918.getClass(), "last", term1916);
        setField(term1918, term1918.getClass(), "propListHead", null);
        setIntField(term1918, term1918.getClass(), "sourcePosition", 0);
        setField(term1918, term1918.getClass(), "jsType", null);
        setField(term1918, term1918.getClass(), "parent", null);
        setField(term1916, term1916.getClass(), "next", term1918);
        setField(term1916, term1916.getClass(), "first", term1920);
        setIntField(term1927, term1927.getClass(), "type", 452088587);
        setIntField(term1929, term1929.getClass(), "type", -1630069454);
        setField(term1929, term1929.getClass(), "next", null);
        setField(term1929, term1929.getClass(), "first", term1923);
        setField(term1929, term1929.getClass(), "last", term1918);
        setField(term1929, term1929.getClass(), "propListHead", null);
        setIntField(term1929, term1929.getClass(), "sourcePosition", 0);
        setField(term1929, term1929.getClass(), "jsType", null);
        setField(term1929, term1929.getClass(), "parent", null);
        setField(term1927, term1927.getClass(), "next", term1929);
        setField(term1927, term1927.getClass(), "first", term1914);
        setField(term1927, term1927.getClass(), "last", term1914);
        setField(term1927, term1927.getClass(), "propListHead", null);
        setIntField(term1927, term1927.getClass(), "sourcePosition", 0);
        setField(term1927, term1927.getClass(), "jsType", null);
        setField(term1927, term1927.getClass(), "parent", null);
        setField(term1916, term1916.getClass(), "last", term1927);
        setField(term1916, term1916.getClass(), "propListHead", null);
        setIntField(term1916, term1916.getClass(), "sourcePosition", 0);
        setField(term1916, term1916.getClass(), "jsType", null);
        setField(term1916, term1916.getClass(), "parent", null);
        setField(term1914, term1914.getClass(), "next", term1916);
        setIntField(term1934, term1934.getClass(), "type", 1499735894);
        setField(term1934, term1934.getClass(), "next", term1927);
        setField(term1934, term1934.getClass(), "first", term1929);
        setField(term1934, term1934.getClass(), "last", term1912);
        setField(term1934, term1934.getClass(), "propListHead", null);
        setIntField(term1934, term1934.getClass(), "sourcePosition", 0);
        setField(term1934, term1934.getClass(), "jsType", null);
        setField(term1934, term1934.getClass(), "parent", null);
        setField(term1914, term1914.getClass(), "first", term1934);
        setField(term1914, term1914.getClass(), "last", term1934);
        setField(term1914, term1914.getClass(), "propListHead", null);
        setIntField(term1914, term1914.getClass(), "sourcePosition", 0);
        setField(term1914, term1914.getClass(), "jsType", null);
        setField(term1914, term1914.getClass(), "parent", null);
        setField(term1912, term1912.getClass(), "next", term1914);
        setField(term1912, term1912.getClass(), "first", term1918);
        setField(term1912, term1912.getClass(), "last", term1920);
        setField(term1912, term1912.getClass(), "propListHead", null);
        setIntField(term1912, term1912.getClass(), "sourcePosition", 0);
        setField(term1912, term1912.getClass(), "jsType", null);
        setField(term1912, term1912.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1912;
        try {
            callMethod(klass, "voidNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


