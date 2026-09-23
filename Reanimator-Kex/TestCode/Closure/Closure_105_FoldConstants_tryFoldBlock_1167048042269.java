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

public class FoldConstants_tryFoldBlock_1167048042269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72081;
     Object term72151;
     Object term72417;
     Object term72418;

    public FoldConstants_tryFoldBlock_1167048042269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72081 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term72151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term72221, term72221.getClass(), "next", term72151);
        setIntField(term72221, term72221.getClass(), "type", 82);
        setField(term72151, term72151.getClass(), "first", term72221);
        setField(term72151, term72151.getClass(), "next", term72291);
        setIntField(term72151, term72151.getClass(), "type", 33);
        term72417 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term72417, term72417.getClass(), "compiler", null);
        term72418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term72418, term72418.getClass(), "type", 33);
        setIntField(term72419, term72419.getClass(), "type", 0);
        setField(term72419, term72419.getClass(), "next", null);
        setField(term72419, term72419.getClass(), "first", null);
        setField(term72419, term72419.getClass(), "last", null);
        setField(term72419, term72419.getClass(), "propListHead", null);
        setIntField(term72419, term72419.getClass(), "sourcePosition", 0);
        setField(term72419, term72419.getClass(), "jsType", null);
        setField(term72419, term72419.getClass(), "parent", null);
        setField(term72418, term72418.getClass(), "next", term72419);
        setIntField(term72420, term72420.getClass(), "type", 82);
        setField(term72420, term72420.getClass(), "next", term72418);
        setField(term72420, term72420.getClass(), "first", null);
        setField(term72420, term72420.getClass(), "last", null);
        setField(term72420, term72420.getClass(), "propListHead", null);
        setIntField(term72420, term72420.getClass(), "sourcePosition", 0);
        setField(term72420, term72420.getClass(), "jsType", null);
        setField(term72420, term72420.getClass(), "parent", null);
        setField(term72418, term72418.getClass(), "first", term72420);
        setField(term72418, term72418.getClass(), "last", null);
        setField(term72418, term72418.getClass(), "propListHead", null);
        setIntField(term72418, term72418.getClass(), "sourcePosition", 0);
        setField(term72418, term72418.getClass(), "jsType", null);
        setField(term72418, term72418.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term72151;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term72081, args);
        assertTrue(recursiveEquals(term72081, term72417));
        assertTrue(recursiveEquals(term72151, null));
    }

};


