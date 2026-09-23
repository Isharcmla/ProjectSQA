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

public class FoldConstants_tryFoldBlock_1167048042282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75025;
     Object term75095;
     Object term76085;
     Object term76086;

    public FoldConstants_tryFoldBlock_1167048042282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75025 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term75095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75305, term75305.getClass(), "next", term75375);
        setIntField(term75305, term75305.getClass(), "type", 120);
        setField(term75235, term75235.getClass(), "next", term75305);
        setIntField(term75235, term75235.getClass(), "type", 81);
        setField(term75165, term75165.getClass(), "next", term75235);
        setIntField(term75165, term75165.getClass(), "type", 60);
        setField(term75095, term75095.getClass(), "first", term75165);
        term76085 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term76085, term76085.getClass(), "compiler", null);
        term76086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76086, term76086.getClass(), "type", 0);
        setField(term76086, term76086.getClass(), "next", null);
        setIntField(term76087, term76087.getClass(), "type", 60);
        setIntField(term76088, term76088.getClass(), "type", 81);
        setIntField(term76089, term76089.getClass(), "type", 120);
        setIntField(term76090, term76090.getClass(), "type", 0);
        setField(term76090, term76090.getClass(), "next", null);
        setField(term76090, term76090.getClass(), "first", null);
        setField(term76090, term76090.getClass(), "last", null);
        setField(term76090, term76090.getClass(), "propListHead", null);
        setIntField(term76090, term76090.getClass(), "sourcePosition", 0);
        setField(term76090, term76090.getClass(), "jsType", null);
        setField(term76090, term76090.getClass(), "parent", null);
        setField(term76089, term76089.getClass(), "next", term76090);
        setField(term76089, term76089.getClass(), "first", null);
        setField(term76089, term76089.getClass(), "last", null);
        setField(term76089, term76089.getClass(), "propListHead", null);
        setIntField(term76089, term76089.getClass(), "sourcePosition", 0);
        setField(term76089, term76089.getClass(), "jsType", null);
        setField(term76089, term76089.getClass(), "parent", null);
        setField(term76088, term76088.getClass(), "next", term76089);
        setField(term76088, term76088.getClass(), "first", null);
        setField(term76088, term76088.getClass(), "last", null);
        setField(term76088, term76088.getClass(), "propListHead", null);
        setIntField(term76088, term76088.getClass(), "sourcePosition", 0);
        setField(term76088, term76088.getClass(), "jsType", null);
        setField(term76088, term76088.getClass(), "parent", null);
        setField(term76087, term76087.getClass(), "next", term76088);
        setField(term76087, term76087.getClass(), "first", null);
        setField(term76087, term76087.getClass(), "last", null);
        setField(term76087, term76087.getClass(), "propListHead", null);
        setIntField(term76087, term76087.getClass(), "sourcePosition", 0);
        setField(term76087, term76087.getClass(), "jsType", null);
        setField(term76087, term76087.getClass(), "parent", null);
        setField(term76086, term76086.getClass(), "first", term76087);
        setField(term76086, term76086.getClass(), "last", null);
        setField(term76086, term76086.getClass(), "propListHead", null);
        setIntField(term76086, term76086.getClass(), "sourcePosition", 0);
        setField(term76086, term76086.getClass(), "jsType", null);
        setField(term76086, term76086.getClass(), "parent", null);
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
        args[1] = term75095;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term75025, args);
        assertTrue(recursiveEquals(term75025, term76085));
        assertTrue(recursiveEquals(term75095, null));
    }

};


