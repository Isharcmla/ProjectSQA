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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61747;
     Object term61817;
     Object term62136;
     Object term62137;
     Object term62089;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61747 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term61817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61957, term61957.getClass(), "type", 16);
        setField(term61887, term61887.getClass(), "next", term61957);
        setIntField(term61887, term61887.getClass(), "type", 42);
        setField(term61817, term61817.getClass(), "first", term61887);
        setIntField(term61817, term61817.getClass(), "type", 16);
        term62136 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term62136, term62136.getClass(), "currentTraversal", null);
        term62137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62137, term62137.getClass(), "type", 16);
        setField(term62137, term62137.getClass(), "next", null);
        setIntField(term62138, term62138.getClass(), "type", 42);
        setIntField(term62139, term62139.getClass(), "type", 16);
        setField(term62139, term62139.getClass(), "next", null);
        setField(term62139, term62139.getClass(), "first", null);
        setField(term62139, term62139.getClass(), "last", null);
        setField(term62139, term62139.getClass(), "propListHead", null);
        setIntField(term62139, term62139.getClass(), "sourcePosition", 0);
        setField(term62139, term62139.getClass(), "jsType", null);
        setField(term62139, term62139.getClass(), "parent", null);
        setField(term62138, term62138.getClass(), "next", term62139);
        setField(term62138, term62138.getClass(), "first", null);
        setField(term62138, term62138.getClass(), "last", null);
        setField(term62138, term62138.getClass(), "propListHead", null);
        setIntField(term62138, term62138.getClass(), "sourcePosition", 0);
        setField(term62138, term62138.getClass(), "jsType", null);
        setField(term62138, term62138.getClass(), "parent", null);
        setField(term62137, term62137.getClass(), "first", term62138);
        setField(term62137, term62137.getClass(), "last", null);
        setField(term62137, term62137.getClass(), "propListHead", null);
        setIntField(term62137, term62137.getClass(), "sourcePosition", 0);
        setField(term62137, term62137.getClass(), "jsType", null);
        setField(term62137, term62137.getClass(), "parent", null);
        term62089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62089, term62089.getClass(), "type", 16);
        setField(term62089, term62089.getClass(), "next", null);
        setIntField(term62091, term62091.getClass(), "type", 42);
        setIntField(term62093, term62093.getClass(), "type", 16);
        setField(term62093, term62093.getClass(), "next", null);
        setField(term62093, term62093.getClass(), "first", null);
        setField(term62093, term62093.getClass(), "last", null);
        setField(term62093, term62093.getClass(), "propListHead", null);
        setIntField(term62093, term62093.getClass(), "sourcePosition", 0);
        setField(term62093, term62093.getClass(), "jsType", null);
        setField(term62093, term62093.getClass(), "parent", null);
        setField(term62091, term62091.getClass(), "next", term62093);
        setField(term62091, term62091.getClass(), "first", null);
        setField(term62091, term62091.getClass(), "last", null);
        setField(term62091, term62091.getClass(), "propListHead", null);
        setIntField(term62091, term62091.getClass(), "sourcePosition", 0);
        setField(term62091, term62091.getClass(), "jsType", null);
        setField(term62091, term62091.getClass(), "parent", null);
        setField(term62089, term62089.getClass(), "first", term62091);
        setField(term62089, term62089.getClass(), "last", null);
        setField(term62089, term62089.getClass(), "propListHead", null);
        setIntField(term62089, term62089.getClass(), "sourcePosition", 0);
        setField(term62089, term62089.getClass(), "jsType", null);
        setField(term62089, term62089.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term61817;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term61747, args);
        assertTrue(recursiveEquals(term61747, term62136));
        assertTrue(recursiveEquals(term61817, term62137));
        assertTrue(recursiveEquals(retValue, term62089));
    }

};


