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

public class FoldConstants_tryFoldBlock_1167048042342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94731;
     Object term94801;
     Object term95707;
     Object term95708;

    public FoldConstants_tryFoldBlock_1167048042342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94731 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term94801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term95011, term95011.getClass(), "next", term95081);
        setIntField(term95011, term95011.getClass(), "type", 48);
        setField(term94941, term94941.getClass(), "next", term95011);
        setIntField(term94941, term94941.getClass(), "type", 78);
        setField(term94871, term94871.getClass(), "next", term94941);
        setIntField(term94871, term94871.getClass(), "type", 82);
        setField(term94801, term94801.getClass(), "first", term94871);
        term95707 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term95707, term95707.getClass(), "compiler", null);
        term95708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term95708, term95708.getClass(), "type", 0);
        setField(term95708, term95708.getClass(), "next", null);
        setIntField(term95709, term95709.getClass(), "type", 82);
        setIntField(term95710, term95710.getClass(), "type", 78);
        setIntField(term95711, term95711.getClass(), "type", 48);
        setIntField(term95712, term95712.getClass(), "type", 0);
        setField(term95712, term95712.getClass(), "next", null);
        setField(term95712, term95712.getClass(), "first", null);
        setField(term95712, term95712.getClass(), "last", null);
        setField(term95712, term95712.getClass(), "propListHead", null);
        setIntField(term95712, term95712.getClass(), "sourcePosition", 0);
        setField(term95712, term95712.getClass(), "jsType", null);
        setField(term95712, term95712.getClass(), "parent", null);
        setField(term95711, term95711.getClass(), "next", term95712);
        setField(term95711, term95711.getClass(), "first", null);
        setField(term95711, term95711.getClass(), "last", null);
        setField(term95711, term95711.getClass(), "propListHead", null);
        setIntField(term95711, term95711.getClass(), "sourcePosition", 0);
        setField(term95711, term95711.getClass(), "jsType", null);
        setField(term95711, term95711.getClass(), "parent", null);
        setField(term95710, term95710.getClass(), "next", term95711);
        setField(term95710, term95710.getClass(), "first", null);
        setField(term95710, term95710.getClass(), "last", null);
        setField(term95710, term95710.getClass(), "propListHead", null);
        setIntField(term95710, term95710.getClass(), "sourcePosition", 0);
        setField(term95710, term95710.getClass(), "jsType", null);
        setField(term95710, term95710.getClass(), "parent", null);
        setField(term95709, term95709.getClass(), "next", term95710);
        setField(term95709, term95709.getClass(), "first", null);
        setField(term95709, term95709.getClass(), "last", null);
        setField(term95709, term95709.getClass(), "propListHead", null);
        setIntField(term95709, term95709.getClass(), "sourcePosition", 0);
        setField(term95709, term95709.getClass(), "jsType", null);
        setField(term95709, term95709.getClass(), "parent", null);
        setField(term95708, term95708.getClass(), "first", term95709);
        setField(term95708, term95708.getClass(), "last", null);
        setField(term95708, term95708.getClass(), "propListHead", null);
        setIntField(term95708, term95708.getClass(), "sourcePosition", 0);
        setField(term95708, term95708.getClass(), "jsType", null);
        setField(term95708, term95708.getClass(), "parent", null);
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
        args[1] = term94801;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term94731, args);
        assertTrue(recursiveEquals(term94731, term95707));
        assertTrue(recursiveEquals(term94801, null));
    }

};


