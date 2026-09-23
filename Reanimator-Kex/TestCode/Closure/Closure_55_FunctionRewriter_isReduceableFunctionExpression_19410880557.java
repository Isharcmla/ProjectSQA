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

public class FunctionRewriter_isReduceableFunctionExpression_19410880557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term1917;

    public FunctionRewriter_isReduceableFunctionExpression_19410880557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45, term45.getClass(), "type", -117576464);
        setIntField(term47, term47.getClass(), "type", 865208305);
        setIntField(term49, term49.getClass(), "type", 0);
        setField(term49, term49.getClass(), "next", null);
        setField(term49, term49.getClass(), "first", null);
        setField(term49, term49.getClass(), "last", null);
        setField(term49, term49.getClass(), "propListHead", null);
        setIntField(term49, term49.getClass(), "sourcePosition", 0);
        setField(term49, term49.getClass(), "jsType", null);
        setField(term49, term49.getClass(), "parent", null);
        setField(term47, term47.getClass(), "next", term49);
        setIntField(term52, term52.getClass(), "type", 0);
        setField(term52, term52.getClass(), "next", null);
        setField(term52, term52.getClass(), "first", null);
        setField(term52, term52.getClass(), "last", null);
        setField(term52, term52.getClass(), "propListHead", null);
        setIntField(term52, term52.getClass(), "sourcePosition", 0);
        setField(term52, term52.getClass(), "jsType", null);
        setField(term52, term52.getClass(), "parent", null);
        setField(term47, term47.getClass(), "first", term52);
        setIntField(term55, term55.getClass(), "type", 0);
        setField(term55, term55.getClass(), "next", null);
        setField(term55, term55.getClass(), "first", null);
        setField(term55, term55.getClass(), "last", null);
        setField(term55, term55.getClass(), "propListHead", null);
        setIntField(term55, term55.getClass(), "sourcePosition", 0);
        setField(term55, term55.getClass(), "jsType", null);
        setField(term55, term55.getClass(), "parent", null);
        setField(term47, term47.getClass(), "last", term55);
        setField(term47, term47.getClass(), "propListHead", null);
        setIntField(term47, term47.getClass(), "sourcePosition", 0);
        setField(term47, term47.getClass(), "jsType", null);
        setField(term47, term47.getClass(), "parent", null);
        setField(term45, term45.getClass(), "next", term47);
        setIntField(term59, term59.getClass(), "type", 0);
        setField(term59, term59.getClass(), "next", null);
        setField(term59, term59.getClass(), "first", null);
        setField(term59, term59.getClass(), "last", null);
        setField(term59, term59.getClass(), "propListHead", null);
        setIntField(term59, term59.getClass(), "sourcePosition", 0);
        setField(term59, term59.getClass(), "jsType", null);
        setField(term59, term59.getClass(), "parent", null);
        setField(term45, term45.getClass(), "first", term59);
        setIntField(term62, term62.getClass(), "type", 0);
        setField(term62, term62.getClass(), "next", null);
        setField(term62, term62.getClass(), "first", null);
        setField(term62, term62.getClass(), "last", null);
        setField(term62, term62.getClass(), "propListHead", null);
        setIntField(term62, term62.getClass(), "sourcePosition", 0);
        setField(term62, term62.getClass(), "jsType", null);
        setField(term62, term62.getClass(), "parent", null);
        setField(term45, term45.getClass(), "last", term62);
        setField(term45, term45.getClass(), "propListHead", null);
        setIntField(term45, term45.getClass(), "sourcePosition", 0);
        setField(term45, term45.getClass(), "jsType", null);
        setField(term45, term45.getClass(), "parent", null);
        term1917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1917, term1917.getClass(), "type", -117576464);
        setIntField(term1918, term1918.getClass(), "type", 865208305);
        setIntField(term1919, term1919.getClass(), "type", 0);
        setField(term1919, term1919.getClass(), "next", null);
        setField(term1919, term1919.getClass(), "first", null);
        setField(term1919, term1919.getClass(), "last", null);
        setField(term1919, term1919.getClass(), "propListHead", null);
        setIntField(term1919, term1919.getClass(), "sourcePosition", 0);
        setField(term1919, term1919.getClass(), "jsType", null);
        setField(term1919, term1919.getClass(), "parent", null);
        setField(term1918, term1918.getClass(), "next", term1919);
        setIntField(term1920, term1920.getClass(), "type", 0);
        setField(term1920, term1920.getClass(), "next", null);
        setField(term1920, term1920.getClass(), "first", null);
        setField(term1920, term1920.getClass(), "last", null);
        setField(term1920, term1920.getClass(), "propListHead", null);
        setIntField(term1920, term1920.getClass(), "sourcePosition", 0);
        setField(term1920, term1920.getClass(), "jsType", null);
        setField(term1920, term1920.getClass(), "parent", null);
        setField(term1918, term1918.getClass(), "first", term1920);
        setIntField(term1921, term1921.getClass(), "type", 0);
        setField(term1921, term1921.getClass(), "next", null);
        setField(term1921, term1921.getClass(), "first", null);
        setField(term1921, term1921.getClass(), "last", null);
        setField(term1921, term1921.getClass(), "propListHead", null);
        setIntField(term1921, term1921.getClass(), "sourcePosition", 0);
        setField(term1921, term1921.getClass(), "jsType", null);
        setField(term1921, term1921.getClass(), "parent", null);
        setField(term1918, term1918.getClass(), "last", term1921);
        setField(term1918, term1918.getClass(), "propListHead", null);
        setIntField(term1918, term1918.getClass(), "sourcePosition", 0);
        setField(term1918, term1918.getClass(), "jsType", null);
        setField(term1918, term1918.getClass(), "parent", null);
        setField(term1917, term1917.getClass(), "next", term1918);
        setIntField(term1922, term1922.getClass(), "type", 0);
        setField(term1922, term1922.getClass(), "next", null);
        setField(term1922, term1922.getClass(), "first", null);
        setField(term1922, term1922.getClass(), "last", null);
        setField(term1922, term1922.getClass(), "propListHead", null);
        setIntField(term1922, term1922.getClass(), "sourcePosition", 0);
        setField(term1922, term1922.getClass(), "jsType", null);
        setField(term1922, term1922.getClass(), "parent", null);
        setField(term1917, term1917.getClass(), "first", term1922);
        setIntField(term1923, term1923.getClass(), "type", 0);
        setField(term1923, term1923.getClass(), "next", null);
        setField(term1923, term1923.getClass(), "first", null);
        setField(term1923, term1923.getClass(), "last", null);
        setField(term1923, term1923.getClass(), "propListHead", null);
        setIntField(term1923, term1923.getClass(), "sourcePosition", 0);
        setField(term1923, term1923.getClass(), "jsType", null);
        setField(term1923, term1923.getClass(), "parent", null);
        setField(term1917, term1917.getClass(), "last", term1923);
        setField(term1917, term1917.getClass(), "propListHead", null);
        setIntField(term1917, term1917.getClass(), "sourcePosition", 0);
        setField(term1917, term1917.getClass(), "jsType", null);
        setField(term1917, term1917.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term45;
        callMethod(klass, "isReduceableFunctionExpression", argTypes, null, args);
        assertTrue(recursiveEquals(term45, term1917));
    }

};


