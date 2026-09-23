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

public class NodeUtil_isThis_1377192847241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1813;
     Object term14182;

    public NodeUtil_isThis_1377192847241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1813, term1813.getClass(), "type", -1911972560);
        setIntField(term1815, term1815.getClass(), "type", 1632177303);
        setIntField(term1817, term1817.getClass(), "type", 0);
        setField(term1817, term1817.getClass(), "next", null);
        setField(term1817, term1817.getClass(), "first", null);
        setField(term1817, term1817.getClass(), "last", null);
        setField(term1817, term1817.getClass(), "propListHead", null);
        setIntField(term1817, term1817.getClass(), "sourcePosition", 0);
        setField(term1817, term1817.getClass(), "jsType", null);
        setField(term1817, term1817.getClass(), "parent", null);
        setField(term1815, term1815.getClass(), "next", term1817);
        setIntField(term1820, term1820.getClass(), "type", 0);
        setField(term1820, term1820.getClass(), "next", null);
        setField(term1820, term1820.getClass(), "first", null);
        setField(term1820, term1820.getClass(), "last", null);
        setField(term1820, term1820.getClass(), "propListHead", null);
        setIntField(term1820, term1820.getClass(), "sourcePosition", 0);
        setField(term1820, term1820.getClass(), "jsType", null);
        setField(term1820, term1820.getClass(), "parent", null);
        setField(term1815, term1815.getClass(), "first", term1820);
        setIntField(term1823, term1823.getClass(), "type", 0);
        setField(term1823, term1823.getClass(), "next", null);
        setField(term1823, term1823.getClass(), "first", null);
        setField(term1823, term1823.getClass(), "last", null);
        setField(term1823, term1823.getClass(), "propListHead", null);
        setIntField(term1823, term1823.getClass(), "sourcePosition", 0);
        setField(term1823, term1823.getClass(), "jsType", null);
        setField(term1823, term1823.getClass(), "parent", null);
        setField(term1815, term1815.getClass(), "last", term1823);
        setField(term1815, term1815.getClass(), "propListHead", null);
        setIntField(term1815, term1815.getClass(), "sourcePosition", 0);
        setField(term1815, term1815.getClass(), "jsType", null);
        setField(term1815, term1815.getClass(), "parent", null);
        setField(term1813, term1813.getClass(), "next", term1815);
        setIntField(term1827, term1827.getClass(), "type", 0);
        setField(term1827, term1827.getClass(), "next", null);
        setField(term1827, term1827.getClass(), "first", null);
        setField(term1827, term1827.getClass(), "last", null);
        setField(term1827, term1827.getClass(), "propListHead", null);
        setIntField(term1827, term1827.getClass(), "sourcePosition", 0);
        setField(term1827, term1827.getClass(), "jsType", null);
        setField(term1827, term1827.getClass(), "parent", null);
        setField(term1813, term1813.getClass(), "first", term1827);
        setIntField(term1830, term1830.getClass(), "type", 0);
        setField(term1830, term1830.getClass(), "next", null);
        setField(term1830, term1830.getClass(), "first", null);
        setField(term1830, term1830.getClass(), "last", null);
        setField(term1830, term1830.getClass(), "propListHead", null);
        setIntField(term1830, term1830.getClass(), "sourcePosition", 0);
        setField(term1830, term1830.getClass(), "jsType", null);
        setField(term1830, term1830.getClass(), "parent", null);
        setField(term1813, term1813.getClass(), "last", term1830);
        setField(term1813, term1813.getClass(), "propListHead", null);
        setIntField(term1813, term1813.getClass(), "sourcePosition", 0);
        setField(term1813, term1813.getClass(), "jsType", null);
        setField(term1813, term1813.getClass(), "parent", null);
        term14182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14182, term14182.getClass(), "type", -1911972560);
        setIntField(term14183, term14183.getClass(), "type", 1632177303);
        setIntField(term14184, term14184.getClass(), "type", 0);
        setField(term14184, term14184.getClass(), "next", null);
        setField(term14184, term14184.getClass(), "first", null);
        setField(term14184, term14184.getClass(), "last", null);
        setField(term14184, term14184.getClass(), "propListHead", null);
        setIntField(term14184, term14184.getClass(), "sourcePosition", 0);
        setField(term14184, term14184.getClass(), "jsType", null);
        setField(term14184, term14184.getClass(), "parent", null);
        setField(term14183, term14183.getClass(), "next", term14184);
        setIntField(term14185, term14185.getClass(), "type", 0);
        setField(term14185, term14185.getClass(), "next", null);
        setField(term14185, term14185.getClass(), "first", null);
        setField(term14185, term14185.getClass(), "last", null);
        setField(term14185, term14185.getClass(), "propListHead", null);
        setIntField(term14185, term14185.getClass(), "sourcePosition", 0);
        setField(term14185, term14185.getClass(), "jsType", null);
        setField(term14185, term14185.getClass(), "parent", null);
        setField(term14183, term14183.getClass(), "first", term14185);
        setIntField(term14186, term14186.getClass(), "type", 0);
        setField(term14186, term14186.getClass(), "next", null);
        setField(term14186, term14186.getClass(), "first", null);
        setField(term14186, term14186.getClass(), "last", null);
        setField(term14186, term14186.getClass(), "propListHead", null);
        setIntField(term14186, term14186.getClass(), "sourcePosition", 0);
        setField(term14186, term14186.getClass(), "jsType", null);
        setField(term14186, term14186.getClass(), "parent", null);
        setField(term14183, term14183.getClass(), "last", term14186);
        setField(term14183, term14183.getClass(), "propListHead", null);
        setIntField(term14183, term14183.getClass(), "sourcePosition", 0);
        setField(term14183, term14183.getClass(), "jsType", null);
        setField(term14183, term14183.getClass(), "parent", null);
        setField(term14182, term14182.getClass(), "next", term14183);
        setIntField(term14187, term14187.getClass(), "type", 0);
        setField(term14187, term14187.getClass(), "next", null);
        setField(term14187, term14187.getClass(), "first", null);
        setField(term14187, term14187.getClass(), "last", null);
        setField(term14187, term14187.getClass(), "propListHead", null);
        setIntField(term14187, term14187.getClass(), "sourcePosition", 0);
        setField(term14187, term14187.getClass(), "jsType", null);
        setField(term14187, term14187.getClass(), "parent", null);
        setField(term14182, term14182.getClass(), "first", term14187);
        setIntField(term14188, term14188.getClass(), "type", 0);
        setField(term14188, term14188.getClass(), "next", null);
        setField(term14188, term14188.getClass(), "first", null);
        setField(term14188, term14188.getClass(), "last", null);
        setField(term14188, term14188.getClass(), "propListHead", null);
        setIntField(term14188, term14188.getClass(), "sourcePosition", 0);
        setField(term14188, term14188.getClass(), "jsType", null);
        setField(term14188, term14188.getClass(), "parent", null);
        setField(term14182, term14182.getClass(), "last", term14188);
        setField(term14182, term14182.getClass(), "propListHead", null);
        setIntField(term14182, term14182.getClass(), "sourcePosition", 0);
        setField(term14182, term14182.getClass(), "jsType", null);
        setField(term14182, term14182.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1813;
        Object retValue = callMethod(klass, "isThis", argTypes, null, args);
        assertTrue(recursiveEquals(term1813, term14182));
        assertTrue(recursiveEquals(retValue, false));
    }

};


