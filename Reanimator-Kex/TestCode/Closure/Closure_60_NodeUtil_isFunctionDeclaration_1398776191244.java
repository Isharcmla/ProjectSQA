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

public class NodeUtil_isFunctionDeclaration_1398776191244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1876;
     Object term14236;

    public NodeUtil_isFunctionDeclaration_1398776191244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1876, term1876.getClass(), "type", -355769268);
        setIntField(term1878, term1878.getClass(), "type", -95969566);
        setIntField(term1880, term1880.getClass(), "type", 0);
        setField(term1880, term1880.getClass(), "next", null);
        setField(term1880, term1880.getClass(), "first", null);
        setField(term1880, term1880.getClass(), "last", null);
        setField(term1880, term1880.getClass(), "propListHead", null);
        setIntField(term1880, term1880.getClass(), "sourcePosition", 0);
        setField(term1880, term1880.getClass(), "jsType", null);
        setField(term1880, term1880.getClass(), "parent", null);
        setField(term1878, term1878.getClass(), "next", term1880);
        setIntField(term1883, term1883.getClass(), "type", 0);
        setField(term1883, term1883.getClass(), "next", null);
        setField(term1883, term1883.getClass(), "first", null);
        setField(term1883, term1883.getClass(), "last", null);
        setField(term1883, term1883.getClass(), "propListHead", null);
        setIntField(term1883, term1883.getClass(), "sourcePosition", 0);
        setField(term1883, term1883.getClass(), "jsType", null);
        setField(term1883, term1883.getClass(), "parent", null);
        setField(term1878, term1878.getClass(), "first", term1883);
        setIntField(term1886, term1886.getClass(), "type", 0);
        setField(term1886, term1886.getClass(), "next", null);
        setField(term1886, term1886.getClass(), "first", null);
        setField(term1886, term1886.getClass(), "last", null);
        setField(term1886, term1886.getClass(), "propListHead", null);
        setIntField(term1886, term1886.getClass(), "sourcePosition", 0);
        setField(term1886, term1886.getClass(), "jsType", null);
        setField(term1886, term1886.getClass(), "parent", null);
        setField(term1878, term1878.getClass(), "last", term1886);
        setField(term1878, term1878.getClass(), "propListHead", null);
        setIntField(term1878, term1878.getClass(), "sourcePosition", 0);
        setField(term1878, term1878.getClass(), "jsType", null);
        setField(term1878, term1878.getClass(), "parent", null);
        setField(term1876, term1876.getClass(), "next", term1878);
        setIntField(term1890, term1890.getClass(), "type", 0);
        setField(term1890, term1890.getClass(), "next", null);
        setField(term1890, term1890.getClass(), "first", null);
        setField(term1890, term1890.getClass(), "last", null);
        setField(term1890, term1890.getClass(), "propListHead", null);
        setIntField(term1890, term1890.getClass(), "sourcePosition", 0);
        setField(term1890, term1890.getClass(), "jsType", null);
        setField(term1890, term1890.getClass(), "parent", null);
        setField(term1876, term1876.getClass(), "first", term1890);
        setIntField(term1893, term1893.getClass(), "type", 0);
        setField(term1893, term1893.getClass(), "next", null);
        setField(term1893, term1893.getClass(), "first", null);
        setField(term1893, term1893.getClass(), "last", null);
        setField(term1893, term1893.getClass(), "propListHead", null);
        setIntField(term1893, term1893.getClass(), "sourcePosition", 0);
        setField(term1893, term1893.getClass(), "jsType", null);
        setField(term1893, term1893.getClass(), "parent", null);
        setField(term1876, term1876.getClass(), "last", term1893);
        setField(term1876, term1876.getClass(), "propListHead", null);
        setIntField(term1876, term1876.getClass(), "sourcePosition", 0);
        setField(term1876, term1876.getClass(), "jsType", null);
        setField(term1876, term1876.getClass(), "parent", null);
        term14236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14236, term14236.getClass(), "type", -355769268);
        setIntField(term14237, term14237.getClass(), "type", -95969566);
        setIntField(term14238, term14238.getClass(), "type", 0);
        setField(term14238, term14238.getClass(), "next", null);
        setField(term14238, term14238.getClass(), "first", null);
        setField(term14238, term14238.getClass(), "last", null);
        setField(term14238, term14238.getClass(), "propListHead", null);
        setIntField(term14238, term14238.getClass(), "sourcePosition", 0);
        setField(term14238, term14238.getClass(), "jsType", null);
        setField(term14238, term14238.getClass(), "parent", null);
        setField(term14237, term14237.getClass(), "next", term14238);
        setIntField(term14239, term14239.getClass(), "type", 0);
        setField(term14239, term14239.getClass(), "next", null);
        setField(term14239, term14239.getClass(), "first", null);
        setField(term14239, term14239.getClass(), "last", null);
        setField(term14239, term14239.getClass(), "propListHead", null);
        setIntField(term14239, term14239.getClass(), "sourcePosition", 0);
        setField(term14239, term14239.getClass(), "jsType", null);
        setField(term14239, term14239.getClass(), "parent", null);
        setField(term14237, term14237.getClass(), "first", term14239);
        setIntField(term14240, term14240.getClass(), "type", 0);
        setField(term14240, term14240.getClass(), "next", null);
        setField(term14240, term14240.getClass(), "first", null);
        setField(term14240, term14240.getClass(), "last", null);
        setField(term14240, term14240.getClass(), "propListHead", null);
        setIntField(term14240, term14240.getClass(), "sourcePosition", 0);
        setField(term14240, term14240.getClass(), "jsType", null);
        setField(term14240, term14240.getClass(), "parent", null);
        setField(term14237, term14237.getClass(), "last", term14240);
        setField(term14237, term14237.getClass(), "propListHead", null);
        setIntField(term14237, term14237.getClass(), "sourcePosition", 0);
        setField(term14237, term14237.getClass(), "jsType", null);
        setField(term14237, term14237.getClass(), "parent", null);
        setField(term14236, term14236.getClass(), "next", term14237);
        setIntField(term14241, term14241.getClass(), "type", 0);
        setField(term14241, term14241.getClass(), "next", null);
        setField(term14241, term14241.getClass(), "first", null);
        setField(term14241, term14241.getClass(), "last", null);
        setField(term14241, term14241.getClass(), "propListHead", null);
        setIntField(term14241, term14241.getClass(), "sourcePosition", 0);
        setField(term14241, term14241.getClass(), "jsType", null);
        setField(term14241, term14241.getClass(), "parent", null);
        setField(term14236, term14236.getClass(), "first", term14241);
        setIntField(term14242, term14242.getClass(), "type", 0);
        setField(term14242, term14242.getClass(), "next", null);
        setField(term14242, term14242.getClass(), "first", null);
        setField(term14242, term14242.getClass(), "last", null);
        setField(term14242, term14242.getClass(), "propListHead", null);
        setIntField(term14242, term14242.getClass(), "sourcePosition", 0);
        setField(term14242, term14242.getClass(), "jsType", null);
        setField(term14242, term14242.getClass(), "parent", null);
        setField(term14236, term14236.getClass(), "last", term14242);
        setField(term14236, term14236.getClass(), "propListHead", null);
        setIntField(term14236, term14236.getClass(), "sourcePosition", 0);
        setField(term14236, term14236.getClass(), "jsType", null);
        setField(term14236, term14236.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1876;
        Object retValue = callMethod(klass, "isFunctionDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term1876, term14236));
        assertTrue(recursiveEquals(retValue, false));
    }

};


