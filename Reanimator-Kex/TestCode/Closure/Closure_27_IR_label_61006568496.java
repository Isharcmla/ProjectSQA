package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_label_61006568496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term894;
     Object term921;

    public IR_label_61006568496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term894, term894.getClass(), "type", 1215150180);
        setIntField(term896, term896.getClass(), "type", -1422859977);
        setIntField(term898, term898.getClass(), "type", -1972436591);
        setIntField(term900, term900.getClass(), "type", 68922753);
        setIntField(term902, term902.getClass(), "type", -220791533);
        setField(term902, term902.getClass(), "next", null);
        setField(term902, term902.getClass(), "first", null);
        setField(term902, term902.getClass(), "last", null);
        setField(term902, term902.getClass(), "propListHead", null);
        setIntField(term902, term902.getClass(), "sourcePosition", 0);
        setField(term902, term902.getClass(), "jsType", null);
        setField(term902, term902.getClass(), "parent", null);
        setField(term900, term900.getClass(), "next", term902);
        setIntField(term905, term905.getClass(), "type", 1741500243);
        setField(term905, term905.getClass(), "next", null);
        setField(term905, term905.getClass(), "first", null);
        setField(term905, term905.getClass(), "last", term902);
        setField(term905, term905.getClass(), "propListHead", null);
        setIntField(term905, term905.getClass(), "sourcePosition", 0);
        setField(term905, term905.getClass(), "jsType", null);
        setField(term905, term905.getClass(), "parent", null);
        setField(term900, term900.getClass(), "first", term905);
        setField(term900, term900.getClass(), "last", term898);
        setField(term900, term900.getClass(), "propListHead", null);
        setIntField(term900, term900.getClass(), "sourcePosition", 0);
        setField(term900, term900.getClass(), "jsType", null);
        setField(term900, term900.getClass(), "parent", null);
        setField(term898, term898.getClass(), "next", term900);
        setField(term898, term898.getClass(), "first", term902);
        setIntField(term909, term909.getClass(), "type", -1127721881);
        setIntField(term911, term911.getClass(), "type", 1074848808);
        setField(term911, term911.getClass(), "next", null);
        setField(term911, term911.getClass(), "first", term905);
        setField(term911, term911.getClass(), "last", term900);
        setField(term911, term911.getClass(), "propListHead", null);
        setIntField(term911, term911.getClass(), "sourcePosition", 0);
        setField(term911, term911.getClass(), "jsType", null);
        setField(term911, term911.getClass(), "parent", null);
        setField(term909, term909.getClass(), "next", term911);
        setField(term909, term909.getClass(), "first", term896);
        setField(term909, term909.getClass(), "last", term896);
        setField(term909, term909.getClass(), "propListHead", null);
        setIntField(term909, term909.getClass(), "sourcePosition", 0);
        setField(term909, term909.getClass(), "jsType", null);
        setField(term909, term909.getClass(), "parent", null);
        setField(term898, term898.getClass(), "last", term909);
        setField(term898, term898.getClass(), "propListHead", null);
        setIntField(term898, term898.getClass(), "sourcePosition", 0);
        setField(term898, term898.getClass(), "jsType", null);
        setField(term898, term898.getClass(), "parent", null);
        setField(term896, term896.getClass(), "next", term898);
        setIntField(term916, term916.getClass(), "type", -146054762);
        setField(term916, term916.getClass(), "next", term909);
        setField(term916, term916.getClass(), "first", term911);
        setField(term916, term916.getClass(), "last", term894);
        setField(term916, term916.getClass(), "propListHead", null);
        setIntField(term916, term916.getClass(), "sourcePosition", 0);
        setField(term916, term916.getClass(), "jsType", null);
        setField(term916, term916.getClass(), "parent", null);
        setField(term896, term896.getClass(), "first", term916);
        setField(term896, term896.getClass(), "last", term916);
        setField(term896, term896.getClass(), "propListHead", null);
        setIntField(term896, term896.getClass(), "sourcePosition", 0);
        setField(term896, term896.getClass(), "jsType", null);
        setField(term896, term896.getClass(), "parent", null);
        setField(term894, term894.getClass(), "next", term896);
        setField(term894, term894.getClass(), "first", term900);
        setField(term894, term894.getClass(), "last", term902);
        setField(term894, term894.getClass(), "propListHead", null);
        setIntField(term894, term894.getClass(), "sourcePosition", 0);
        setField(term894, term894.getClass(), "jsType", null);
        setField(term894, term894.getClass(), "parent", null);
        term921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term921, term921.getClass(), "type", 798043553);
        setIntField(term923, term923.getClass(), "type", 533197381);
        setIntField(term925, term925.getClass(), "type", 1048271679);
        setIntField(term927, term927.getClass(), "type", -1529797673);
        setIntField(term929, term929.getClass(), "type", -868676396);
        setField(term929, term929.getClass(), "next", null);
        setField(term929, term929.getClass(), "first", null);
        setField(term929, term929.getClass(), "last", null);
        setField(term929, term929.getClass(), "propListHead", null);
        setIntField(term929, term929.getClass(), "sourcePosition", 0);
        setField(term929, term929.getClass(), "jsType", null);
        setField(term929, term929.getClass(), "parent", null);
        setField(term927, term927.getClass(), "next", term929);
        setIntField(term932, term932.getClass(), "type", 1922684808);
        setField(term932, term932.getClass(), "next", null);
        setField(term932, term932.getClass(), "first", null);
        setField(term932, term932.getClass(), "last", term929);
        setField(term932, term932.getClass(), "propListHead", null);
        setIntField(term932, term932.getClass(), "sourcePosition", 0);
        setField(term932, term932.getClass(), "jsType", null);
        setField(term932, term932.getClass(), "parent", null);
        setField(term927, term927.getClass(), "first", term932);
        setField(term927, term927.getClass(), "last", term925);
        setField(term927, term927.getClass(), "propListHead", null);
        setIntField(term927, term927.getClass(), "sourcePosition", 0);
        setField(term927, term927.getClass(), "jsType", null);
        setField(term927, term927.getClass(), "parent", null);
        setField(term925, term925.getClass(), "next", term927);
        setField(term925, term925.getClass(), "first", term929);
        setIntField(term936, term936.getClass(), "type", -288604325);
        setIntField(term938, term938.getClass(), "type", -1268314569);
        setField(term938, term938.getClass(), "next", null);
        setField(term938, term938.getClass(), "first", term932);
        setField(term938, term938.getClass(), "last", term927);
        setField(term938, term938.getClass(), "propListHead", null);
        setIntField(term938, term938.getClass(), "sourcePosition", 0);
        setField(term938, term938.getClass(), "jsType", null);
        setField(term938, term938.getClass(), "parent", null);
        setField(term936, term936.getClass(), "next", term938);
        setField(term936, term936.getClass(), "first", term923);
        setField(term936, term936.getClass(), "last", term923);
        setField(term936, term936.getClass(), "propListHead", null);
        setIntField(term936, term936.getClass(), "sourcePosition", 0);
        setField(term936, term936.getClass(), "jsType", null);
        setField(term936, term936.getClass(), "parent", null);
        setField(term925, term925.getClass(), "last", term936);
        setField(term925, term925.getClass(), "propListHead", null);
        setIntField(term925, term925.getClass(), "sourcePosition", 0);
        setField(term925, term925.getClass(), "jsType", null);
        setField(term925, term925.getClass(), "parent", null);
        setField(term923, term923.getClass(), "next", term925);
        setIntField(term943, term943.getClass(), "type", 877649659);
        setField(term943, term943.getClass(), "next", term936);
        setField(term943, term943.getClass(), "first", term938);
        setField(term943, term943.getClass(), "last", term921);
        setField(term943, term943.getClass(), "propListHead", null);
        setIntField(term943, term943.getClass(), "sourcePosition", 0);
        setField(term943, term943.getClass(), "jsType", null);
        setField(term943, term943.getClass(), "parent", null);
        setField(term923, term923.getClass(), "first", term943);
        setField(term923, term923.getClass(), "last", term943);
        setField(term923, term923.getClass(), "propListHead", null);
        setIntField(term923, term923.getClass(), "sourcePosition", 0);
        setField(term923, term923.getClass(), "jsType", null);
        setField(term923, term923.getClass(), "parent", null);
        setField(term921, term921.getClass(), "next", term923);
        setField(term921, term921.getClass(), "first", term927);
        setField(term921, term921.getClass(), "last", term929);
        setField(term921, term921.getClass(), "propListHead", null);
        setIntField(term921, term921.getClass(), "sourcePosition", 0);
        setField(term921, term921.getClass(), "jsType", null);
        setField(term921, term921.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term894;
        args[1] = term921;
        try {
            callMethod(klass, "label", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


