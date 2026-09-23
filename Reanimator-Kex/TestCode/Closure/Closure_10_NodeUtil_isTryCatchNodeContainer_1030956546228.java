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

public class NodeUtil_isTryCatchNodeContainer_1030956546228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1896;

    public NodeUtil_isTryCatchNodeContainer_1030956546228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1896, term1896.getClass(), "type", 1104108112);
        setIntField(term1898, term1898.getClass(), "type", 1648665618);
        setIntField(term1900, term1900.getClass(), "type", 633765954);
        setIntField(term1902, term1902.getClass(), "type", 269110087);
        setIntField(term1904, term1904.getClass(), "type", 1545119095);
        setField(term1904, term1904.getClass(), "next", null);
        setField(term1904, term1904.getClass(), "first", null);
        setField(term1904, term1904.getClass(), "last", null);
        setField(term1904, term1904.getClass(), "propListHead", null);
        setIntField(term1904, term1904.getClass(), "sourcePosition", 0);
        setField(term1904, term1904.getClass(), "jsType", null);
        setField(term1904, term1904.getClass(), "parent", null);
        setField(term1902, term1902.getClass(), "next", term1904);
        setIntField(term1907, term1907.getClass(), "type", 1671229683);
        setField(term1907, term1907.getClass(), "next", null);
        setField(term1907, term1907.getClass(), "first", null);
        setField(term1907, term1907.getClass(), "last", term1904);
        setField(term1907, term1907.getClass(), "propListHead", null);
        setIntField(term1907, term1907.getClass(), "sourcePosition", 0);
        setField(term1907, term1907.getClass(), "jsType", null);
        setField(term1907, term1907.getClass(), "parent", null);
        setField(term1902, term1902.getClass(), "first", term1907);
        setField(term1902, term1902.getClass(), "last", term1900);
        setField(term1902, term1902.getClass(), "propListHead", null);
        setIntField(term1902, term1902.getClass(), "sourcePosition", 0);
        setField(term1902, term1902.getClass(), "jsType", null);
        setField(term1902, term1902.getClass(), "parent", null);
        setField(term1900, term1900.getClass(), "next", term1902);
        setField(term1900, term1900.getClass(), "first", term1904);
        setIntField(term1911, term1911.getClass(), "type", -514195141);
        setIntField(term1913, term1913.getClass(), "type", -297946422);
        setField(term1913, term1913.getClass(), "next", null);
        setField(term1913, term1913.getClass(), "first", term1907);
        setField(term1913, term1913.getClass(), "last", term1902);
        setField(term1913, term1913.getClass(), "propListHead", null);
        setIntField(term1913, term1913.getClass(), "sourcePosition", 0);
        setField(term1913, term1913.getClass(), "jsType", null);
        setField(term1913, term1913.getClass(), "parent", null);
        setField(term1911, term1911.getClass(), "next", term1913);
        setField(term1911, term1911.getClass(), "first", term1898);
        setField(term1911, term1911.getClass(), "last", term1898);
        setField(term1911, term1911.getClass(), "propListHead", null);
        setIntField(term1911, term1911.getClass(), "sourcePosition", 0);
        setField(term1911, term1911.getClass(), "jsType", null);
        setField(term1911, term1911.getClass(), "parent", null);
        setField(term1900, term1900.getClass(), "last", term1911);
        setField(term1900, term1900.getClass(), "propListHead", null);
        setIntField(term1900, term1900.getClass(), "sourcePosition", 0);
        setField(term1900, term1900.getClass(), "jsType", null);
        setField(term1900, term1900.getClass(), "parent", null);
        setField(term1898, term1898.getClass(), "next", term1900);
        setIntField(term1918, term1918.getClass(), "type", 385463636);
        setField(term1918, term1918.getClass(), "next", term1911);
        setField(term1918, term1918.getClass(), "first", term1913);
        setField(term1918, term1918.getClass(), "last", term1896);
        setField(term1918, term1918.getClass(), "propListHead", null);
        setIntField(term1918, term1918.getClass(), "sourcePosition", 0);
        setField(term1918, term1918.getClass(), "jsType", null);
        setField(term1918, term1918.getClass(), "parent", null);
        setField(term1898, term1898.getClass(), "first", term1918);
        setField(term1898, term1898.getClass(), "last", term1918);
        setField(term1898, term1898.getClass(), "propListHead", null);
        setIntField(term1898, term1898.getClass(), "sourcePosition", 0);
        setField(term1898, term1898.getClass(), "jsType", null);
        setField(term1898, term1898.getClass(), "parent", null);
        setField(term1896, term1896.getClass(), "next", term1898);
        setField(term1896, term1896.getClass(), "first", term1902);
        setField(term1896, term1896.getClass(), "last", term1904);
        setField(term1896, term1896.getClass(), "propListHead", null);
        setIntField(term1896, term1896.getClass(), "sourcePosition", 0);
        setField(term1896, term1896.getClass(), "jsType", null);
        setField(term1896, term1896.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1896;
        try {
            callMethod(klass, "isTryCatchNodeContainer", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


