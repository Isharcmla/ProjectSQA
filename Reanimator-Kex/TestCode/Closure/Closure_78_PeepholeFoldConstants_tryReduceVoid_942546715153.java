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

public class PeepholeFoldConstants_tryReduceVoid_942546715153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25068;
     Object term25228;
     Object term25829;
     Object term25831;
     Object term25802;

    public PeepholeFoldConstants_tryReduceVoid_942546715153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25068 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term25158 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term25158, term25158.getClass(), "compiler", null);
        setField(term25068, term25068.getClass(), "currentTraversal", term25158);
        term25228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25298, term25298.getClass(), "type", 55);
        setField(term25228, term25228.getClass(), "first", term25298);
        setIntField(term25228, term25228.getClass(), "type", 55);
        term25829 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term25830 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term25830, term25830.getClass(), "compiler", null);
        setField(term25830, term25830.getClass(), "callback", null);
        setField(term25830, term25830.getClass(), "curNode", null);
        setField(term25830, term25830.getClass(), "scopes", null);
        setField(term25830, term25830.getClass(), "scopeRoots", null);
        setField(term25830, term25830.getClass(), "cfgs", null);
        setField(term25830, term25830.getClass(), "sourceName", null);
        setField(term25830, term25830.getClass(), "scopeCreator", null);
        setField(term25830, term25830.getClass(), "scopeCallback", null);
        setField(term25829, term25829.getClass(), "currentTraversal", term25830);
        term25831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25831, term25831.getClass(), "type", 55);
        setField(term25831, term25831.getClass(), "next", null);
        setIntField(term25832, term25832.getClass(), "type", 55);
        setField(term25832, term25832.getClass(), "next", null);
        setField(term25832, term25832.getClass(), "first", null);
        setField(term25832, term25832.getClass(), "last", null);
        setField(term25832, term25832.getClass(), "propListHead", null);
        setIntField(term25832, term25832.getClass(), "sourcePosition", 0);
        setField(term25832, term25832.getClass(), "jsType", null);
        setField(term25832, term25832.getClass(), "parent", null);
        setField(term25831, term25831.getClass(), "first", term25832);
        setField(term25831, term25831.getClass(), "last", null);
        setField(term25831, term25831.getClass(), "propListHead", null);
        setIntField(term25831, term25831.getClass(), "sourcePosition", 0);
        setField(term25831, term25831.getClass(), "jsType", null);
        setField(term25831, term25831.getClass(), "parent", null);
        term25802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25802, term25802.getClass(), "type", 55);
        setField(term25802, term25802.getClass(), "next", null);
        setIntField(term25804, term25804.getClass(), "type", 55);
        setField(term25804, term25804.getClass(), "next", null);
        setField(term25804, term25804.getClass(), "first", null);
        setField(term25804, term25804.getClass(), "last", null);
        setField(term25804, term25804.getClass(), "propListHead", null);
        setIntField(term25804, term25804.getClass(), "sourcePosition", 0);
        setField(term25804, term25804.getClass(), "jsType", null);
        setField(term25804, term25804.getClass(), "parent", null);
        setField(term25802, term25802.getClass(), "first", term25804);
        setField(term25802, term25802.getClass(), "last", null);
        setField(term25802, term25802.getClass(), "propListHead", null);
        setIntField(term25802, term25802.getClass(), "sourcePosition", 0);
        setField(term25802, term25802.getClass(), "jsType", null);
        setField(term25802, term25802.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25228;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term25068, args);
        assertTrue(recursiveEquals(term25068, term25829));
        assertTrue(recursiveEquals(term25228, term25831));
        assertTrue(recursiveEquals(retValue, term25802));
    }

};


