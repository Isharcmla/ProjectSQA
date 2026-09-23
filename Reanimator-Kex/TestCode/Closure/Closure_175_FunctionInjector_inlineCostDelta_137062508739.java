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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class FunctionInjector_inlineCostDelta_137062508739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1906;
     Object term1933;
     Object enum4;

    public FunctionInjector_inlineCostDelta_137062508739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1906, term1906.getClass(), "type", 1008080511);
        setIntField(term1908, term1908.getClass(), "type", 1935707624);
        setIntField(term1910, term1910.getClass(), "type", 1507074215);
        setIntField(term1912, term1912.getClass(), "type", -282881827);
        setIntField(term1914, term1914.getClass(), "type", -1183353915);
        setField(term1914, term1914.getClass(), "next", null);
        setField(term1914, term1914.getClass(), "first", null);
        setField(term1914, term1914.getClass(), "last", null);
        setField(term1914, term1914.getClass(), "propListHead", null);
        setIntField(term1914, term1914.getClass(), "sourcePosition", 0);
        setField(term1914, term1914.getClass(), "jsType", null);
        setField(term1914, term1914.getClass(), "parent", null);
        setField(term1912, term1912.getClass(), "next", term1914);
        setIntField(term1917, term1917.getClass(), "type", -420030135);
        setField(term1917, term1917.getClass(), "next", null);
        setField(term1917, term1917.getClass(), "first", null);
        setField(term1917, term1917.getClass(), "last", term1914);
        setField(term1917, term1917.getClass(), "propListHead", null);
        setIntField(term1917, term1917.getClass(), "sourcePosition", 0);
        setField(term1917, term1917.getClass(), "jsType", null);
        setField(term1917, term1917.getClass(), "parent", null);
        setField(term1912, term1912.getClass(), "first", term1917);
        setField(term1912, term1912.getClass(), "last", term1910);
        setField(term1912, term1912.getClass(), "propListHead", null);
        setIntField(term1912, term1912.getClass(), "sourcePosition", 0);
        setField(term1912, term1912.getClass(), "jsType", null);
        setField(term1912, term1912.getClass(), "parent", null);
        setField(term1910, term1910.getClass(), "next", term1912);
        setField(term1910, term1910.getClass(), "first", term1914);
        setIntField(term1921, term1921.getClass(), "type", -1497710478);
        setIntField(term1923, term1923.getClass(), "type", 49950830);
        setField(term1923, term1923.getClass(), "next", null);
        setField(term1923, term1923.getClass(), "first", term1917);
        setField(term1923, term1923.getClass(), "last", term1912);
        setField(term1923, term1923.getClass(), "propListHead", null);
        setIntField(term1923, term1923.getClass(), "sourcePosition", 0);
        setField(term1923, term1923.getClass(), "jsType", null);
        setField(term1923, term1923.getClass(), "parent", null);
        setField(term1921, term1921.getClass(), "next", term1923);
        setField(term1921, term1921.getClass(), "first", term1908);
        setField(term1921, term1921.getClass(), "last", term1908);
        setField(term1921, term1921.getClass(), "propListHead", null);
        setIntField(term1921, term1921.getClass(), "sourcePosition", 0);
        setField(term1921, term1921.getClass(), "jsType", null);
        setField(term1921, term1921.getClass(), "parent", null);
        setField(term1910, term1910.getClass(), "last", term1921);
        setField(term1910, term1910.getClass(), "propListHead", null);
        setIntField(term1910, term1910.getClass(), "sourcePosition", 0);
        setField(term1910, term1910.getClass(), "jsType", null);
        setField(term1910, term1910.getClass(), "parent", null);
        setField(term1908, term1908.getClass(), "next", term1910);
        setIntField(term1928, term1928.getClass(), "type", -525257914);
        setField(term1928, term1928.getClass(), "next", term1921);
        setField(term1928, term1928.getClass(), "first", term1923);
        setField(term1928, term1928.getClass(), "last", term1906);
        setField(term1928, term1928.getClass(), "propListHead", null);
        setIntField(term1928, term1928.getClass(), "sourcePosition", 0);
        setField(term1928, term1928.getClass(), "jsType", null);
        setField(term1928, term1928.getClass(), "parent", null);
        setField(term1908, term1908.getClass(), "first", term1928);
        setField(term1908, term1908.getClass(), "last", term1928);
        setField(term1908, term1908.getClass(), "propListHead", null);
        setIntField(term1908, term1908.getClass(), "sourcePosition", 0);
        setField(term1908, term1908.getClass(), "jsType", null);
        setField(term1908, term1908.getClass(), "parent", null);
        setField(term1906, term1906.getClass(), "next", term1908);
        setField(term1906, term1906.getClass(), "first", term1912);
        setField(term1906, term1906.getClass(), "last", term1914);
        setField(term1906, term1906.getClass(), "propListHead", null);
        setIntField(term1906, term1906.getClass(), "sourcePosition", 0);
        setField(term1906, term1906.getClass(), "jsType", null);
        setField(term1906, term1906.getClass(), "parent", null);
        HashMap term1934 = new HashMap();
        Set<Object> term8051 =  ((Map) term1934).keySet();
        term1933 = new HashSet((Collection<? extends Object>) term8051);
        Class<? extends Object> term8053 = Class.forName((String) "com.google.javascript.jscomp.FunctionInjector$InliningMode");
        Field term8052 = ((Class) term8053).getDeclaredField((String) "DIRECT");
        ((Field) term8052).setAccessible(true);
        enum4 = ((Field) term8052).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.FunctionInjector$InliningMode");
        Object[] args = new Object[3];
        args[0] = term1906;
        args[1] = term1933;
        args[2] = enum4;
        try {
            callMethod(klass, "inlineCostDelta", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


