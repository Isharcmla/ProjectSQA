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
import java.lang.Boolean;

public class FunctionInjector_estimateCallCost_48231804838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1877;
     Object term1904;

    public FunctionInjector_estimateCallCost_48231804838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1877, term1877.getClass(), "type", -130649791);
        setIntField(term1879, term1879.getClass(), "type", 534834644);
        setIntField(term1881, term1881.getClass(), "type", 1959097203);
        setIntField(term1883, term1883.getClass(), "type", -209654048);
        setIntField(term1885, term1885.getClass(), "type", 477625804);
        setField(term1885, term1885.getClass(), "next", null);
        setField(term1885, term1885.getClass(), "first", null);
        setField(term1885, term1885.getClass(), "last", null);
        setField(term1885, term1885.getClass(), "propListHead", null);
        setIntField(term1885, term1885.getClass(), "sourcePosition", 0);
        setField(term1885, term1885.getClass(), "jsType", null);
        setField(term1885, term1885.getClass(), "parent", null);
        setField(term1883, term1883.getClass(), "next", term1885);
        setIntField(term1888, term1888.getClass(), "type", 252575029);
        setField(term1888, term1888.getClass(), "next", null);
        setField(term1888, term1888.getClass(), "first", null);
        setField(term1888, term1888.getClass(), "last", term1885);
        setField(term1888, term1888.getClass(), "propListHead", null);
        setIntField(term1888, term1888.getClass(), "sourcePosition", 0);
        setField(term1888, term1888.getClass(), "jsType", null);
        setField(term1888, term1888.getClass(), "parent", null);
        setField(term1883, term1883.getClass(), "first", term1888);
        setField(term1883, term1883.getClass(), "last", term1881);
        setField(term1883, term1883.getClass(), "propListHead", null);
        setIntField(term1883, term1883.getClass(), "sourcePosition", 0);
        setField(term1883, term1883.getClass(), "jsType", null);
        setField(term1883, term1883.getClass(), "parent", null);
        setField(term1881, term1881.getClass(), "next", term1883);
        setField(term1881, term1881.getClass(), "first", term1885);
        setIntField(term1892, term1892.getClass(), "type", 1460722225);
        setIntField(term1894, term1894.getClass(), "type", 1743224434);
        setField(term1894, term1894.getClass(), "next", null);
        setField(term1894, term1894.getClass(), "first", term1888);
        setField(term1894, term1894.getClass(), "last", term1883);
        setField(term1894, term1894.getClass(), "propListHead", null);
        setIntField(term1894, term1894.getClass(), "sourcePosition", 0);
        setField(term1894, term1894.getClass(), "jsType", null);
        setField(term1894, term1894.getClass(), "parent", null);
        setField(term1892, term1892.getClass(), "next", term1894);
        setField(term1892, term1892.getClass(), "first", term1879);
        setField(term1892, term1892.getClass(), "last", term1879);
        setField(term1892, term1892.getClass(), "propListHead", null);
        setIntField(term1892, term1892.getClass(), "sourcePosition", 0);
        setField(term1892, term1892.getClass(), "jsType", null);
        setField(term1892, term1892.getClass(), "parent", null);
        setField(term1881, term1881.getClass(), "last", term1892);
        setField(term1881, term1881.getClass(), "propListHead", null);
        setIntField(term1881, term1881.getClass(), "sourcePosition", 0);
        setField(term1881, term1881.getClass(), "jsType", null);
        setField(term1881, term1881.getClass(), "parent", null);
        setField(term1879, term1879.getClass(), "next", term1881);
        setIntField(term1899, term1899.getClass(), "type", 842904495);
        setField(term1899, term1899.getClass(), "next", term1892);
        setField(term1899, term1899.getClass(), "first", term1894);
        setField(term1899, term1899.getClass(), "last", term1877);
        setField(term1899, term1899.getClass(), "propListHead", null);
        setIntField(term1899, term1899.getClass(), "sourcePosition", 0);
        setField(term1899, term1899.getClass(), "jsType", null);
        setField(term1899, term1899.getClass(), "parent", null);
        setField(term1879, term1879.getClass(), "first", term1899);
        setField(term1879, term1879.getClass(), "last", term1899);
        setField(term1879, term1879.getClass(), "propListHead", null);
        setIntField(term1879, term1879.getClass(), "sourcePosition", 0);
        setField(term1879, term1879.getClass(), "jsType", null);
        setField(term1879, term1879.getClass(), "parent", null);
        setField(term1877, term1877.getClass(), "next", term1879);
        setField(term1877, term1877.getClass(), "first", term1883);
        setField(term1877, term1877.getClass(), "last", term1885);
        setField(term1877, term1877.getClass(), "propListHead", null);
        setIntField(term1877, term1877.getClass(), "sourcePosition", 0);
        setField(term1877, term1877.getClass(), "jsType", null);
        setField(term1877, term1877.getClass(), "parent", null);
        term1904 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1877;
        args[1] = term1904;
        try {
            callMethod(klass, "estimateCallCost", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


