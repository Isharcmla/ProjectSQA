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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555438;
     Object term555508;
     Object term556166;
     Object term556167;
     Object term556104;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term555438 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term555508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term555578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term555648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term555648, term555648.getClass(), "type", 64);
        setField(term555578, term555578.getClass(), "next", term555648);
        setIntField(term555578, term555578.getClass(), "type", 0);
        setField(term555508, term555508.getClass(), "first", term555578);
        setIntField(term555508, term555508.getClass(), "type", 101);
        setField(term555508, term555508.getClass(), "parent", term555648);
        term556166 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term556166, term556166.getClass(), "currentTraversal", null);
        term556167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term556168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term556169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term556167, term556167.getClass(), "type", 101);
        setField(term556167, term556167.getClass(), "next", null);
        setIntField(term556168, term556168.getClass(), "type", 0);
        setIntField(term556169, term556169.getClass(), "type", 64);
        setField(term556169, term556169.getClass(), "next", null);
        setField(term556169, term556169.getClass(), "first", null);
        setField(term556169, term556169.getClass(), "last", null);
        setField(term556169, term556169.getClass(), "propListHead", null);
        setIntField(term556169, term556169.getClass(), "sourcePosition", 0);
        setField(term556169, term556169.getClass(), "jsType", null);
        setField(term556169, term556169.getClass(), "parent", null);
        setField(term556168, term556168.getClass(), "next", term556169);
        setField(term556168, term556168.getClass(), "first", null);
        setField(term556168, term556168.getClass(), "last", null);
        setField(term556168, term556168.getClass(), "propListHead", null);
        setIntField(term556168, term556168.getClass(), "sourcePosition", 0);
        setField(term556168, term556168.getClass(), "jsType", null);
        setField(term556168, term556168.getClass(), "parent", null);
        setField(term556167, term556167.getClass(), "first", term556168);
        setField(term556167, term556167.getClass(), "last", null);
        setField(term556167, term556167.getClass(), "propListHead", null);
        setIntField(term556167, term556167.getClass(), "sourcePosition", 0);
        setField(term556167, term556167.getClass(), "jsType", null);
        setField(term556167, term556167.getClass(), "parent", term556169);
        term556104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term556106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term556108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term556104, term556104.getClass(), "type", 101);
        setField(term556104, term556104.getClass(), "next", null);
        setIntField(term556106, term556106.getClass(), "type", 0);
        setIntField(term556108, term556108.getClass(), "type", 64);
        setField(term556108, term556108.getClass(), "next", null);
        setField(term556108, term556108.getClass(), "first", null);
        setField(term556108, term556108.getClass(), "last", null);
        setField(term556108, term556108.getClass(), "propListHead", null);
        setIntField(term556108, term556108.getClass(), "sourcePosition", 0);
        setField(term556108, term556108.getClass(), "jsType", null);
        setField(term556108, term556108.getClass(), "parent", null);
        setField(term556106, term556106.getClass(), "next", term556108);
        setField(term556106, term556106.getClass(), "first", null);
        setField(term556106, term556106.getClass(), "last", null);
        setField(term556106, term556106.getClass(), "propListHead", null);
        setIntField(term556106, term556106.getClass(), "sourcePosition", 0);
        setField(term556106, term556106.getClass(), "jsType", null);
        setField(term556106, term556106.getClass(), "parent", null);
        setField(term556104, term556104.getClass(), "first", term556106);
        setField(term556104, term556104.getClass(), "last", null);
        setField(term556104, term556104.getClass(), "propListHead", null);
        setIntField(term556104, term556104.getClass(), "sourcePosition", 0);
        setField(term556104, term556104.getClass(), "jsType", null);
        setField(term556104, term556104.getClass(), "parent", term556108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term555508;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term555438, args);
        assertTrue(recursiveEquals(term555438, term556166));
        assertTrue(recursiveEquals(term555508, term556167));
        assertTrue(recursiveEquals(retValue, term556104));
    }

};


