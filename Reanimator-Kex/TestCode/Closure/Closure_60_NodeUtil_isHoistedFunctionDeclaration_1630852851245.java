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

public class NodeUtil_isHoistedFunctionDeclaration_1630852851245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1897;
     Object term14270;

    public NodeUtil_isHoistedFunctionDeclaration_1630852851245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1897, term1897.getClass(), "type", -284885486);
        setIntField(term1899, term1899.getClass(), "type", 915367534);
        setIntField(term1901, term1901.getClass(), "type", 0);
        setField(term1901, term1901.getClass(), "next", null);
        setField(term1901, term1901.getClass(), "first", null);
        setField(term1901, term1901.getClass(), "last", null);
        setField(term1901, term1901.getClass(), "propListHead", null);
        setIntField(term1901, term1901.getClass(), "sourcePosition", 0);
        setField(term1901, term1901.getClass(), "jsType", null);
        setField(term1901, term1901.getClass(), "parent", null);
        setField(term1899, term1899.getClass(), "next", term1901);
        setIntField(term1904, term1904.getClass(), "type", 0);
        setField(term1904, term1904.getClass(), "next", null);
        setField(term1904, term1904.getClass(), "first", null);
        setField(term1904, term1904.getClass(), "last", null);
        setField(term1904, term1904.getClass(), "propListHead", null);
        setIntField(term1904, term1904.getClass(), "sourcePosition", 0);
        setField(term1904, term1904.getClass(), "jsType", null);
        setField(term1904, term1904.getClass(), "parent", null);
        setField(term1899, term1899.getClass(), "first", term1904);
        setIntField(term1907, term1907.getClass(), "type", 0);
        setField(term1907, term1907.getClass(), "next", null);
        setField(term1907, term1907.getClass(), "first", null);
        setField(term1907, term1907.getClass(), "last", null);
        setField(term1907, term1907.getClass(), "propListHead", null);
        setIntField(term1907, term1907.getClass(), "sourcePosition", 0);
        setField(term1907, term1907.getClass(), "jsType", null);
        setField(term1907, term1907.getClass(), "parent", null);
        setField(term1899, term1899.getClass(), "last", term1907);
        setField(term1899, term1899.getClass(), "propListHead", null);
        setIntField(term1899, term1899.getClass(), "sourcePosition", 0);
        setField(term1899, term1899.getClass(), "jsType", null);
        setField(term1899, term1899.getClass(), "parent", null);
        setField(term1897, term1897.getClass(), "next", term1899);
        setIntField(term1911, term1911.getClass(), "type", 0);
        setField(term1911, term1911.getClass(), "next", null);
        setField(term1911, term1911.getClass(), "first", null);
        setField(term1911, term1911.getClass(), "last", null);
        setField(term1911, term1911.getClass(), "propListHead", null);
        setIntField(term1911, term1911.getClass(), "sourcePosition", 0);
        setField(term1911, term1911.getClass(), "jsType", null);
        setField(term1911, term1911.getClass(), "parent", null);
        setField(term1897, term1897.getClass(), "first", term1911);
        setIntField(term1914, term1914.getClass(), "type", 0);
        setField(term1914, term1914.getClass(), "next", null);
        setField(term1914, term1914.getClass(), "first", null);
        setField(term1914, term1914.getClass(), "last", null);
        setField(term1914, term1914.getClass(), "propListHead", null);
        setIntField(term1914, term1914.getClass(), "sourcePosition", 0);
        setField(term1914, term1914.getClass(), "jsType", null);
        setField(term1914, term1914.getClass(), "parent", null);
        setField(term1897, term1897.getClass(), "last", term1914);
        setField(term1897, term1897.getClass(), "propListHead", null);
        setIntField(term1897, term1897.getClass(), "sourcePosition", 0);
        setField(term1897, term1897.getClass(), "jsType", null);
        setField(term1897, term1897.getClass(), "parent", null);
        term14270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14270, term14270.getClass(), "type", -284885486);
        setIntField(term14271, term14271.getClass(), "type", 915367534);
        setIntField(term14272, term14272.getClass(), "type", 0);
        setField(term14272, term14272.getClass(), "next", null);
        setField(term14272, term14272.getClass(), "first", null);
        setField(term14272, term14272.getClass(), "last", null);
        setField(term14272, term14272.getClass(), "propListHead", null);
        setIntField(term14272, term14272.getClass(), "sourcePosition", 0);
        setField(term14272, term14272.getClass(), "jsType", null);
        setField(term14272, term14272.getClass(), "parent", null);
        setField(term14271, term14271.getClass(), "next", term14272);
        setIntField(term14273, term14273.getClass(), "type", 0);
        setField(term14273, term14273.getClass(), "next", null);
        setField(term14273, term14273.getClass(), "first", null);
        setField(term14273, term14273.getClass(), "last", null);
        setField(term14273, term14273.getClass(), "propListHead", null);
        setIntField(term14273, term14273.getClass(), "sourcePosition", 0);
        setField(term14273, term14273.getClass(), "jsType", null);
        setField(term14273, term14273.getClass(), "parent", null);
        setField(term14271, term14271.getClass(), "first", term14273);
        setIntField(term14274, term14274.getClass(), "type", 0);
        setField(term14274, term14274.getClass(), "next", null);
        setField(term14274, term14274.getClass(), "first", null);
        setField(term14274, term14274.getClass(), "last", null);
        setField(term14274, term14274.getClass(), "propListHead", null);
        setIntField(term14274, term14274.getClass(), "sourcePosition", 0);
        setField(term14274, term14274.getClass(), "jsType", null);
        setField(term14274, term14274.getClass(), "parent", null);
        setField(term14271, term14271.getClass(), "last", term14274);
        setField(term14271, term14271.getClass(), "propListHead", null);
        setIntField(term14271, term14271.getClass(), "sourcePosition", 0);
        setField(term14271, term14271.getClass(), "jsType", null);
        setField(term14271, term14271.getClass(), "parent", null);
        setField(term14270, term14270.getClass(), "next", term14271);
        setIntField(term14275, term14275.getClass(), "type", 0);
        setField(term14275, term14275.getClass(), "next", null);
        setField(term14275, term14275.getClass(), "first", null);
        setField(term14275, term14275.getClass(), "last", null);
        setField(term14275, term14275.getClass(), "propListHead", null);
        setIntField(term14275, term14275.getClass(), "sourcePosition", 0);
        setField(term14275, term14275.getClass(), "jsType", null);
        setField(term14275, term14275.getClass(), "parent", null);
        setField(term14270, term14270.getClass(), "first", term14275);
        setIntField(term14276, term14276.getClass(), "type", 0);
        setField(term14276, term14276.getClass(), "next", null);
        setField(term14276, term14276.getClass(), "first", null);
        setField(term14276, term14276.getClass(), "last", null);
        setField(term14276, term14276.getClass(), "propListHead", null);
        setIntField(term14276, term14276.getClass(), "sourcePosition", 0);
        setField(term14276, term14276.getClass(), "jsType", null);
        setField(term14276, term14276.getClass(), "parent", null);
        setField(term14270, term14270.getClass(), "last", term14276);
        setField(term14270, term14270.getClass(), "propListHead", null);
        setIntField(term14270, term14270.getClass(), "sourcePosition", 0);
        setField(term14270, term14270.getClass(), "jsType", null);
        setField(term14270, term14270.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1897;
        Object retValue = callMethod(klass, "isHoistedFunctionDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term1897, term14270));
        assertTrue(recursiveEquals(retValue, false));
    }

};


