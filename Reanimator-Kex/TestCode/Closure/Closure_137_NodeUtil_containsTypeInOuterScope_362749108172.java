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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.lang.Integer;

public class NodeUtil_containsTypeInOuterScope_362749108172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1893;
     Object term1920;
     Object term10894;

    public NodeUtil_containsTypeInOuterScope_362749108172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1906 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1916 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1893, term1893.getClass(), "type", -944986533);
        setIntField(term1895, term1895.getClass(), "type", -1165271567);
        setIntField(term1897, term1897.getClass(), "type", 0);
        setField(term1897, term1897.getClass(), "next", null);
        setField(term1897, term1897.getClass(), "first", null);
        setField(term1897, term1897.getClass(), "last", null);
        setField(term1897, term1897.getClass(), "propListHead", null);
        setIntField(term1897, term1897.getClass(), "sourcePosition", 0);
        setField(term1897, term1897.getClass(), "jsType", null);
        setField(term1897, term1897.getClass(), "parent", null);
        setField(term1895, term1895.getClass(), "next", term1897);
        setIntField(term1900, term1900.getClass(), "type", 0);
        setField(term1900, term1900.getClass(), "next", null);
        setField(term1900, term1900.getClass(), "first", null);
        setField(term1900, term1900.getClass(), "last", null);
        setField(term1900, term1900.getClass(), "propListHead", null);
        setIntField(term1900, term1900.getClass(), "sourcePosition", 0);
        setField(term1900, term1900.getClass(), "jsType", null);
        setField(term1900, term1900.getClass(), "parent", null);
        setField(term1895, term1895.getClass(), "first", term1900);
        setIntField(term1903, term1903.getClass(), "type", 0);
        setField(term1903, term1903.getClass(), "next", null);
        setField(term1903, term1903.getClass(), "first", null);
        setField(term1903, term1903.getClass(), "last", null);
        setField(term1903, term1903.getClass(), "propListHead", null);
        setIntField(term1903, term1903.getClass(), "sourcePosition", 0);
        setField(term1903, term1903.getClass(), "jsType", null);
        setField(term1903, term1903.getClass(), "parent", null);
        setField(term1895, term1895.getClass(), "last", term1903);
        setField(term1906, term1906.getClass(), "next", null);
        setIntField(term1906, term1906.getClass(), "type", 0);
        setIntField(term1906, term1906.getClass(), "intValue", 0);
        setField(term1906, term1906.getClass(), "objectValue", null);
        setField(term1895, term1895.getClass(), "propListHead", term1906);
        setIntField(term1895, term1895.getClass(), "sourcePosition", -642716895);
        setField(term1895, term1895.getClass(), "jsType", null);
        setField(term1895, term1895.getClass(), "parent", null);
        setField(term1893, term1893.getClass(), "next", term1895);
        setIntField(term1910, term1910.getClass(), "type", 0);
        setField(term1910, term1910.getClass(), "next", null);
        setField(term1910, term1910.getClass(), "first", null);
        setField(term1910, term1910.getClass(), "last", null);
        setField(term1910, term1910.getClass(), "propListHead", null);
        setIntField(term1910, term1910.getClass(), "sourcePosition", 0);
        setField(term1910, term1910.getClass(), "jsType", null);
        setField(term1910, term1910.getClass(), "parent", null);
        setField(term1893, term1893.getClass(), "first", term1910);
        setIntField(term1913, term1913.getClass(), "type", 0);
        setField(term1913, term1913.getClass(), "next", null);
        setField(term1913, term1913.getClass(), "first", null);
        setField(term1913, term1913.getClass(), "last", null);
        setField(term1913, term1913.getClass(), "propListHead", null);
        setIntField(term1913, term1913.getClass(), "sourcePosition", 0);
        setField(term1913, term1913.getClass(), "jsType", null);
        setField(term1913, term1913.getClass(), "parent", null);
        setField(term1893, term1893.getClass(), "last", term1913);
        setField(term1916, term1916.getClass(), "next", null);
        setIntField(term1916, term1916.getClass(), "type", 0);
        setIntField(term1916, term1916.getClass(), "intValue", 0);
        setField(term1916, term1916.getClass(), "objectValue", null);
        setField(term1893, term1893.getClass(), "propListHead", term1916);
        setIntField(term1893, term1893.getClass(), "sourcePosition", 1743398246);
        setField(term1893, term1893.getClass(), "jsType", null);
        setField(term1893, term1893.getClass(), "parent", null);
        term1920 = new Integer(-934658823);
        term10894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10899 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10902 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10894, term10894.getClass(), "type", -944986533);
        setIntField(term10895, term10895.getClass(), "type", -1165271567);
        setIntField(term10896, term10896.getClass(), "type", 0);
        setField(term10896, term10896.getClass(), "next", null);
        setField(term10896, term10896.getClass(), "first", null);
        setField(term10896, term10896.getClass(), "last", null);
        setField(term10896, term10896.getClass(), "propListHead", null);
        setIntField(term10896, term10896.getClass(), "sourcePosition", 0);
        setField(term10896, term10896.getClass(), "jsType", null);
        setField(term10896, term10896.getClass(), "parent", null);
        setField(term10895, term10895.getClass(), "next", term10896);
        setIntField(term10897, term10897.getClass(), "type", 0);
        setField(term10897, term10897.getClass(), "next", null);
        setField(term10897, term10897.getClass(), "first", null);
        setField(term10897, term10897.getClass(), "last", null);
        setField(term10897, term10897.getClass(), "propListHead", null);
        setIntField(term10897, term10897.getClass(), "sourcePosition", 0);
        setField(term10897, term10897.getClass(), "jsType", null);
        setField(term10897, term10897.getClass(), "parent", null);
        setField(term10895, term10895.getClass(), "first", term10897);
        setIntField(term10898, term10898.getClass(), "type", 0);
        setField(term10898, term10898.getClass(), "next", null);
        setField(term10898, term10898.getClass(), "first", null);
        setField(term10898, term10898.getClass(), "last", null);
        setField(term10898, term10898.getClass(), "propListHead", null);
        setIntField(term10898, term10898.getClass(), "sourcePosition", 0);
        setField(term10898, term10898.getClass(), "jsType", null);
        setField(term10898, term10898.getClass(), "parent", null);
        setField(term10895, term10895.getClass(), "last", term10898);
        setField(term10899, term10899.getClass(), "next", null);
        setIntField(term10899, term10899.getClass(), "type", 0);
        setIntField(term10899, term10899.getClass(), "intValue", 0);
        setField(term10899, term10899.getClass(), "objectValue", null);
        setField(term10895, term10895.getClass(), "propListHead", term10899);
        setIntField(term10895, term10895.getClass(), "sourcePosition", -642716895);
        setField(term10895, term10895.getClass(), "jsType", null);
        setField(term10895, term10895.getClass(), "parent", null);
        setField(term10894, term10894.getClass(), "next", term10895);
        setIntField(term10900, term10900.getClass(), "type", 0);
        setField(term10900, term10900.getClass(), "next", null);
        setField(term10900, term10900.getClass(), "first", null);
        setField(term10900, term10900.getClass(), "last", null);
        setField(term10900, term10900.getClass(), "propListHead", null);
        setIntField(term10900, term10900.getClass(), "sourcePosition", 0);
        setField(term10900, term10900.getClass(), "jsType", null);
        setField(term10900, term10900.getClass(), "parent", null);
        setField(term10894, term10894.getClass(), "first", term10900);
        setIntField(term10901, term10901.getClass(), "type", 0);
        setField(term10901, term10901.getClass(), "next", null);
        setField(term10901, term10901.getClass(), "first", null);
        setField(term10901, term10901.getClass(), "last", null);
        setField(term10901, term10901.getClass(), "propListHead", null);
        setIntField(term10901, term10901.getClass(), "sourcePosition", 0);
        setField(term10901, term10901.getClass(), "jsType", null);
        setField(term10901, term10901.getClass(), "parent", null);
        setField(term10894, term10894.getClass(), "last", term10901);
        setField(term10902, term10902.getClass(), "next", null);
        setIntField(term10902, term10902.getClass(), "type", 0);
        setIntField(term10902, term10902.getClass(), "intValue", 0);
        setField(term10902, term10902.getClass(), "objectValue", null);
        setField(term10894, term10894.getClass(), "propListHead", term10902);
        setIntField(term10894, term10894.getClass(), "sourcePosition", 1743398246);
        setField(term10894, term10894.getClass(), "jsType", null);
        setField(term10894, term10894.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1893;
        args[1] = term1920;
        callMethod(klass, "containsTypeInOuterScope", argTypes, null, args);
        assertTrue(recursiveEquals(term1893, -934658823));
        assertTrue(recursiveEquals(term1920, term10894));
    }

};


