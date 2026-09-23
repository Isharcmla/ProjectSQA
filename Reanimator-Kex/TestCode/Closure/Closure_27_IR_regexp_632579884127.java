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

public class IR_regexp_632579884127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2184;

    public IR_regexp_632579884127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2184, term2184.getClass(), "type", -1693535639);
        setIntField(term2186, term2186.getClass(), "type", 1344744036);
        setIntField(term2188, term2188.getClass(), "type", -98060427);
        setIntField(term2190, term2190.getClass(), "type", -1272268399);
        setIntField(term2192, term2192.getClass(), "type", 1120271104);
        setField(term2192, term2192.getClass(), "next", null);
        setField(term2192, term2192.getClass(), "first", null);
        setField(term2192, term2192.getClass(), "last", null);
        setField(term2192, term2192.getClass(), "propListHead", null);
        setIntField(term2192, term2192.getClass(), "sourcePosition", 0);
        setField(term2192, term2192.getClass(), "jsType", null);
        setField(term2192, term2192.getClass(), "parent", null);
        setField(term2190, term2190.getClass(), "next", term2192);
        setIntField(term2195, term2195.getClass(), "type", -128435804);
        setField(term2195, term2195.getClass(), "next", null);
        setField(term2195, term2195.getClass(), "first", null);
        setField(term2195, term2195.getClass(), "last", term2192);
        setField(term2195, term2195.getClass(), "propListHead", null);
        setIntField(term2195, term2195.getClass(), "sourcePosition", 0);
        setField(term2195, term2195.getClass(), "jsType", null);
        setField(term2195, term2195.getClass(), "parent", null);
        setField(term2190, term2190.getClass(), "first", term2195);
        setField(term2190, term2190.getClass(), "last", term2188);
        setField(term2190, term2190.getClass(), "propListHead", null);
        setIntField(term2190, term2190.getClass(), "sourcePosition", 0);
        setField(term2190, term2190.getClass(), "jsType", null);
        setField(term2190, term2190.getClass(), "parent", null);
        setField(term2188, term2188.getClass(), "next", term2190);
        setField(term2188, term2188.getClass(), "first", term2192);
        setIntField(term2199, term2199.getClass(), "type", 2118747457);
        setIntField(term2201, term2201.getClass(), "type", 1868344256);
        setField(term2201, term2201.getClass(), "next", null);
        setField(term2201, term2201.getClass(), "first", term2195);
        setField(term2201, term2201.getClass(), "last", term2190);
        setField(term2201, term2201.getClass(), "propListHead", null);
        setIntField(term2201, term2201.getClass(), "sourcePosition", 0);
        setField(term2201, term2201.getClass(), "jsType", null);
        setField(term2201, term2201.getClass(), "parent", null);
        setField(term2199, term2199.getClass(), "next", term2201);
        setField(term2199, term2199.getClass(), "first", term2186);
        setField(term2199, term2199.getClass(), "last", term2186);
        setField(term2199, term2199.getClass(), "propListHead", null);
        setIntField(term2199, term2199.getClass(), "sourcePosition", 0);
        setField(term2199, term2199.getClass(), "jsType", null);
        setField(term2199, term2199.getClass(), "parent", null);
        setField(term2188, term2188.getClass(), "last", term2199);
        setField(term2188, term2188.getClass(), "propListHead", null);
        setIntField(term2188, term2188.getClass(), "sourcePosition", 0);
        setField(term2188, term2188.getClass(), "jsType", null);
        setField(term2188, term2188.getClass(), "parent", null);
        setField(term2186, term2186.getClass(), "next", term2188);
        setIntField(term2206, term2206.getClass(), "type", 1857693976);
        setField(term2206, term2206.getClass(), "next", term2199);
        setField(term2206, term2206.getClass(), "first", term2201);
        setField(term2206, term2206.getClass(), "last", term2184);
        setField(term2206, term2206.getClass(), "propListHead", null);
        setIntField(term2206, term2206.getClass(), "sourcePosition", 0);
        setField(term2206, term2206.getClass(), "jsType", null);
        setField(term2206, term2206.getClass(), "parent", null);
        setField(term2186, term2186.getClass(), "first", term2206);
        setField(term2186, term2186.getClass(), "last", term2206);
        setField(term2186, term2186.getClass(), "propListHead", null);
        setIntField(term2186, term2186.getClass(), "sourcePosition", 0);
        setField(term2186, term2186.getClass(), "jsType", null);
        setField(term2186, term2186.getClass(), "parent", null);
        setField(term2184, term2184.getClass(), "next", term2186);
        setField(term2184, term2184.getClass(), "first", term2190);
        setField(term2184, term2184.getClass(), "last", term2192);
        setField(term2184, term2184.getClass(), "propListHead", null);
        setIntField(term2184, term2184.getClass(), "sourcePosition", 0);
        setField(term2184, term2184.getClass(), "jsType", null);
        setField(term2184, term2184.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2184;
        try {
            callMethod(klass, "regexp", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


