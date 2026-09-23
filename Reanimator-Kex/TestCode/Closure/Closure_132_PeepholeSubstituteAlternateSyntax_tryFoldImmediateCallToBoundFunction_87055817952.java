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
import java.lang.Object;

public class PeepholeSubstituteAlternateSyntax_tryFoldImmediateCallToBoundFunction_87055817952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;
     Object term96;

    public PeepholeSubstituteAlternateSyntax_tryFoldImmediateCallToBoundFunction_87055817952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term93, term93.getClass(), "late", true);
        setIntField(term93, term93.getClass(), "STRING_SPLIT_OVERHEAD", -226514366);
        setField(term93, term93.getClass(), "compiler", null);
        term96 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term96, term96.getClass(), "type", 1193880199);
        setIntField(term98, term98.getClass(), "type", -1087774327);
        setIntField(term100, term100.getClass(), "type", -1530420153);
        setIntField(term102, term102.getClass(), "type", -469968304);
        setIntField(term104, term104.getClass(), "type", -1145578966);
        setField(term104, term104.getClass(), "next", null);
        setField(term104, term104.getClass(), "first", null);
        setField(term104, term104.getClass(), "last", null);
        setField(term104, term104.getClass(), "propListHead", null);
        setIntField(term104, term104.getClass(), "sourcePosition", 0);
        setField(term104, term104.getClass(), "jsType", null);
        setField(term104, term104.getClass(), "parent", null);
        setField(term102, term102.getClass(), "next", term104);
        setIntField(term107, term107.getClass(), "type", 679763016);
        setField(term107, term107.getClass(), "next", null);
        setField(term107, term107.getClass(), "first", null);
        setField(term107, term107.getClass(), "last", term104);
        setField(term107, term107.getClass(), "propListHead", null);
        setIntField(term107, term107.getClass(), "sourcePosition", 0);
        setField(term107, term107.getClass(), "jsType", null);
        setField(term107, term107.getClass(), "parent", null);
        setField(term102, term102.getClass(), "first", term107);
        setField(term102, term102.getClass(), "last", term100);
        setField(term102, term102.getClass(), "propListHead", null);
        setIntField(term102, term102.getClass(), "sourcePosition", 0);
        setField(term102, term102.getClass(), "jsType", null);
        setField(term102, term102.getClass(), "parent", null);
        setField(term100, term100.getClass(), "next", term102);
        setField(term100, term100.getClass(), "first", term104);
        setIntField(term111, term111.getClass(), "type", 767834723);
        setIntField(term113, term113.getClass(), "type", -602026508);
        setField(term113, term113.getClass(), "next", null);
        setField(term113, term113.getClass(), "first", term107);
        setField(term113, term113.getClass(), "last", term102);
        setField(term113, term113.getClass(), "propListHead", null);
        setIntField(term113, term113.getClass(), "sourcePosition", 0);
        setField(term113, term113.getClass(), "jsType", null);
        setField(term113, term113.getClass(), "parent", null);
        setField(term111, term111.getClass(), "next", term113);
        setField(term111, term111.getClass(), "first", term98);
        setField(term111, term111.getClass(), "last", term98);
        setField(term111, term111.getClass(), "propListHead", null);
        setIntField(term111, term111.getClass(), "sourcePosition", 0);
        setField(term111, term111.getClass(), "jsType", null);
        setField(term111, term111.getClass(), "parent", null);
        setField(term100, term100.getClass(), "last", term111);
        setField(term100, term100.getClass(), "propListHead", null);
        setIntField(term100, term100.getClass(), "sourcePosition", 0);
        setField(term100, term100.getClass(), "jsType", null);
        setField(term100, term100.getClass(), "parent", null);
        setField(term98, term98.getClass(), "next", term100);
        setIntField(term118, term118.getClass(), "type", -157887805);
        setField(term118, term118.getClass(), "next", term111);
        setField(term118, term118.getClass(), "first", term113);
        setField(term118, term118.getClass(), "last", term96);
        setField(term118, term118.getClass(), "propListHead", null);
        setIntField(term118, term118.getClass(), "sourcePosition", 0);
        setField(term118, term118.getClass(), "jsType", null);
        setField(term118, term118.getClass(), "parent", null);
        setField(term98, term98.getClass(), "first", term118);
        setField(term98, term98.getClass(), "last", term118);
        setField(term98, term98.getClass(), "propListHead", null);
        setIntField(term98, term98.getClass(), "sourcePosition", 0);
        setField(term98, term98.getClass(), "jsType", null);
        setField(term98, term98.getClass(), "parent", null);
        setField(term96, term96.getClass(), "next", term98);
        setField(term96, term96.getClass(), "first", term102);
        setField(term96, term96.getClass(), "last", term104);
        setField(term96, term96.getClass(), "propListHead", null);
        setIntField(term96, term96.getClass(), "sourcePosition", 0);
        setField(term96, term96.getClass(), "jsType", null);
        setField(term96, term96.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term96;
        try {
            callMethod(klass, "tryFoldImmediateCallToBoundFunction", argTypes, term93, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


