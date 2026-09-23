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

public class ScopedAliases_process_840655313303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198143;
     Object term198213;
     Object term199030;
     Object term199031;

    public ScopedAliases_process_840655313303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198143 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term198143, term198143.getClass(), "compiler", null);
        term198213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term198213, term198213.getClass(), "type", 37);
        setField(term198213, term198213.getClass(), "parent", null);
        setField(term198353, term198353.getClass(), "next", null);
        setIntField(term198353, term198353.getClass(), "type", 0);
        setField(term198353, term198353.getClass(), "first", null);
        setField(term198283, term198283.getClass(), "next", term198353);
        setIntField(term198283, term198283.getClass(), "type", 0);
        setField(term198423, term198423.getClass(), "next", null);
        setIntField(term198423, term198423.getClass(), "type", 0);
        setField(term198423, term198423.getClass(), "first", null);
        setField(term198283, term198283.getClass(), "first", term198423);
        setField(term198213, term198213.getClass(), "first", term198283);
        term199030 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term199030, term199030.getClass(), "compiler", null);
        setField(term199030, term199030.getClass(), "preprocessorSymbolTable", null);
        setField(term199030, term199030.getClass(), "transformationHandler", null);
        term199031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term199032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term199033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term199034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term199031, term199031.getClass(), "type", 37);
        setField(term199031, term199031.getClass(), "next", null);
        setIntField(term199032, term199032.getClass(), "type", 0);
        setIntField(term199033, term199033.getClass(), "type", 0);
        setField(term199033, term199033.getClass(), "next", null);
        setField(term199033, term199033.getClass(), "first", null);
        setField(term199033, term199033.getClass(), "last", null);
        setField(term199033, term199033.getClass(), "propListHead", null);
        setIntField(term199033, term199033.getClass(), "sourcePosition", 0);
        setField(term199033, term199033.getClass(), "jsType", null);
        setField(term199033, term199033.getClass(), "parent", null);
        setField(term199032, term199032.getClass(), "next", term199033);
        setIntField(term199034, term199034.getClass(), "type", 0);
        setField(term199034, term199034.getClass(), "next", null);
        setField(term199034, term199034.getClass(), "first", null);
        setField(term199034, term199034.getClass(), "last", null);
        setField(term199034, term199034.getClass(), "propListHead", null);
        setIntField(term199034, term199034.getClass(), "sourcePosition", 0);
        setField(term199034, term199034.getClass(), "jsType", null);
        setField(term199034, term199034.getClass(), "parent", null);
        setField(term199032, term199032.getClass(), "first", term199034);
        setField(term199032, term199032.getClass(), "last", null);
        setField(term199032, term199032.getClass(), "propListHead", null);
        setIntField(term199032, term199032.getClass(), "sourcePosition", 0);
        setField(term199032, term199032.getClass(), "jsType", null);
        setField(term199032, term199032.getClass(), "parent", null);
        setField(term199031, term199031.getClass(), "first", term199032);
        setField(term199031, term199031.getClass(), "last", null);
        setField(term199031, term199031.getClass(), "propListHead", null);
        setIntField(term199031, term199031.getClass(), "sourcePosition", 0);
        setField(term199031, term199031.getClass(), "jsType", null);
        setField(term199031, term199031.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term198213;
        callMethod(klass, "process", argTypes, term198143, args);
        assertTrue(recursiveEquals(term198143, term199030));
        assertTrue(recursiveEquals(term198213, null));
    }

};


