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

public class PeepholeFoldConstants_tryReduceVoid_942546715137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24402;
     Object term24562;
     Object term24931;
     Object term24933;
     Object term24904;

    public PeepholeFoldConstants_tryReduceVoid_942546715137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24402 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term24492 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term24492, term24492.getClass(), "compiler", null);
        setField(term24402, term24402.getClass(), "currentTraversal", term24492);
        term24562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24632, term24632.getClass(), "type", 123);
        setField(term24562, term24562.getClass(), "first", term24632);
        setIntField(term24562, term24562.getClass(), "type", 123);
        term24931 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term24932 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term24932, term24932.getClass(), "compiler", null);
        setField(term24932, term24932.getClass(), "callback", null);
        setField(term24932, term24932.getClass(), "curNode", null);
        setField(term24932, term24932.getClass(), "scopes", null);
        setField(term24932, term24932.getClass(), "scopeRoots", null);
        setField(term24932, term24932.getClass(), "cfgs", null);
        setField(term24932, term24932.getClass(), "sourceName", null);
        setField(term24932, term24932.getClass(), "scopeCreator", null);
        setField(term24932, term24932.getClass(), "scopeCallback", null);
        setField(term24931, term24931.getClass(), "currentTraversal", term24932);
        term24933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24933, term24933.getClass(), "type", 123);
        setField(term24933, term24933.getClass(), "next", null);
        setIntField(term24934, term24934.getClass(), "type", 123);
        setField(term24934, term24934.getClass(), "next", null);
        setField(term24934, term24934.getClass(), "first", null);
        setField(term24934, term24934.getClass(), "last", null);
        setField(term24934, term24934.getClass(), "propListHead", null);
        setIntField(term24934, term24934.getClass(), "sourcePosition", 0);
        setField(term24934, term24934.getClass(), "jsType", null);
        setField(term24934, term24934.getClass(), "parent", null);
        setField(term24933, term24933.getClass(), "first", term24934);
        setField(term24933, term24933.getClass(), "last", null);
        setField(term24933, term24933.getClass(), "propListHead", null);
        setIntField(term24933, term24933.getClass(), "sourcePosition", 0);
        setField(term24933, term24933.getClass(), "jsType", null);
        setField(term24933, term24933.getClass(), "parent", null);
        term24904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24904, term24904.getClass(), "type", 123);
        setField(term24904, term24904.getClass(), "next", null);
        setIntField(term24906, term24906.getClass(), "type", 123);
        setField(term24906, term24906.getClass(), "next", null);
        setField(term24906, term24906.getClass(), "first", null);
        setField(term24906, term24906.getClass(), "last", null);
        setField(term24906, term24906.getClass(), "propListHead", null);
        setIntField(term24906, term24906.getClass(), "sourcePosition", 0);
        setField(term24906, term24906.getClass(), "jsType", null);
        setField(term24906, term24906.getClass(), "parent", null);
        setField(term24904, term24904.getClass(), "first", term24906);
        setField(term24904, term24904.getClass(), "last", null);
        setField(term24904, term24904.getClass(), "propListHead", null);
        setIntField(term24904, term24904.getClass(), "sourcePosition", 0);
        setField(term24904, term24904.getClass(), "jsType", null);
        setField(term24904, term24904.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24562;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term24402, args);
        assertTrue(recursiveEquals(term24402, term24931));
        assertTrue(recursiveEquals(term24562, term24933));
        assertTrue(recursiveEquals(retValue, term24904));
    }

};


