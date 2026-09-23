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

public class NodeUtil_isVarArgsFunction_179835621188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1896;

    public NodeUtil_isVarArgsFunction_179835621188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1909 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1919 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1896, term1896.getClass(), "type", 1632177303);
        setIntField(term1898, term1898.getClass(), "type", 297582552);
        setIntField(term1900, term1900.getClass(), "type", 0);
        setField(term1900, term1900.getClass(), "next", null);
        setField(term1900, term1900.getClass(), "first", null);
        setField(term1900, term1900.getClass(), "last", null);
        setField(term1900, term1900.getClass(), "propListHead", null);
        setIntField(term1900, term1900.getClass(), "sourcePosition", 0);
        setField(term1900, term1900.getClass(), "jsType", null);
        setField(term1900, term1900.getClass(), "parent", null);
        setField(term1898, term1898.getClass(), "next", term1900);
        setIntField(term1903, term1903.getClass(), "type", 0);
        setField(term1903, term1903.getClass(), "next", null);
        setField(term1903, term1903.getClass(), "first", null);
        setField(term1903, term1903.getClass(), "last", null);
        setField(term1903, term1903.getClass(), "propListHead", null);
        setIntField(term1903, term1903.getClass(), "sourcePosition", 0);
        setField(term1903, term1903.getClass(), "jsType", null);
        setField(term1903, term1903.getClass(), "parent", null);
        setField(term1898, term1898.getClass(), "first", term1903);
        setIntField(term1906, term1906.getClass(), "type", 0);
        setField(term1906, term1906.getClass(), "next", null);
        setField(term1906, term1906.getClass(), "first", null);
        setField(term1906, term1906.getClass(), "last", null);
        setField(term1906, term1906.getClass(), "propListHead", null);
        setIntField(term1906, term1906.getClass(), "sourcePosition", 0);
        setField(term1906, term1906.getClass(), "jsType", null);
        setField(term1906, term1906.getClass(), "parent", null);
        setField(term1898, term1898.getClass(), "last", term1906);
        setField(term1909, term1909.getClass(), "next", null);
        setIntField(term1909, term1909.getClass(), "type", 0);
        setIntField(term1909, term1909.getClass(), "intValue", 0);
        setField(term1909, term1909.getClass(), "objectValue", null);
        setField(term1898, term1898.getClass(), "propListHead", term1909);
        setIntField(term1898, term1898.getClass(), "sourcePosition", 2077491675);
        setField(term1898, term1898.getClass(), "jsType", null);
        setField(term1898, term1898.getClass(), "parent", null);
        setField(term1896, term1896.getClass(), "next", term1898);
        setIntField(term1913, term1913.getClass(), "type", 0);
        setField(term1913, term1913.getClass(), "next", null);
        setField(term1913, term1913.getClass(), "first", null);
        setField(term1913, term1913.getClass(), "last", null);
        setField(term1913, term1913.getClass(), "propListHead", null);
        setIntField(term1913, term1913.getClass(), "sourcePosition", 0);
        setField(term1913, term1913.getClass(), "jsType", null);
        setField(term1913, term1913.getClass(), "parent", null);
        setField(term1896, term1896.getClass(), "first", term1913);
        setIntField(term1916, term1916.getClass(), "type", 0);
        setField(term1916, term1916.getClass(), "next", null);
        setField(term1916, term1916.getClass(), "first", null);
        setField(term1916, term1916.getClass(), "last", null);
        setField(term1916, term1916.getClass(), "propListHead", null);
        setIntField(term1916, term1916.getClass(), "sourcePosition", 0);
        setField(term1916, term1916.getClass(), "jsType", null);
        setField(term1916, term1916.getClass(), "parent", null);
        setField(term1896, term1896.getClass(), "last", term1916);
        setField(term1919, term1919.getClass(), "next", null);
        setIntField(term1919, term1919.getClass(), "type", 0);
        setIntField(term1919, term1919.getClass(), "intValue", 0);
        setField(term1919, term1919.getClass(), "objectValue", null);
        setField(term1896, term1896.getClass(), "propListHead", term1919);
        setIntField(term1896, term1896.getClass(), "sourcePosition", -1728316609);
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
            callMethod(klass, "isVarArgsFunction", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


