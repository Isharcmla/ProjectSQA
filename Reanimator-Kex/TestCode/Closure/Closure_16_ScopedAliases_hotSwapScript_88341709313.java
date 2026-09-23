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

public class ScopedAliases_hotSwapScript_88341709313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206525;
     Object term206595;
     Object term207565;
     Object term207566;

    public ScopedAliases_hotSwapScript_88341709313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206525 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term206525, term206525.getClass(), "compiler", null);
        term206595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term206595, term206595.getClass(), "type", 0);
        setField(term206595, term206595.getClass(), "parent", null);
        setField(term206805, term206805.getClass(), "next", null);
        setIntField(term206805, term206805.getClass(), "type", 0);
        setField(term206805, term206805.getClass(), "first", null);
        setField(term206735, term206735.getClass(), "next", term206805);
        setIntField(term206735, term206735.getClass(), "type", 0);
        setField(term206735, term206735.getClass(), "first", null);
        setField(term206665, term206665.getClass(), "next", term206735);
        setIntField(term206665, term206665.getClass(), "type", 0);
        setField(term206875, term206875.getClass(), "next", null);
        setIntField(term206875, term206875.getClass(), "type", 0);
        setField(term206875, term206875.getClass(), "first", null);
        setField(term206665, term206665.getClass(), "first", term206875);
        setField(term206595, term206595.getClass(), "first", term206665);
        term207565 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term207565, term207565.getClass(), "compiler", null);
        setField(term207565, term207565.getClass(), "preprocessorSymbolTable", null);
        setField(term207565, term207565.getClass(), "transformationHandler", null);
        term207566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term207566, term207566.getClass(), "type", 0);
        setField(term207566, term207566.getClass(), "next", null);
        setIntField(term207567, term207567.getClass(), "type", 0);
        setIntField(term207568, term207568.getClass(), "type", 0);
        setIntField(term207569, term207569.getClass(), "type", 0);
        setField(term207569, term207569.getClass(), "next", null);
        setField(term207569, term207569.getClass(), "first", null);
        setField(term207569, term207569.getClass(), "last", null);
        setField(term207569, term207569.getClass(), "propListHead", null);
        setIntField(term207569, term207569.getClass(), "sourcePosition", 0);
        setField(term207569, term207569.getClass(), "jsType", null);
        setField(term207569, term207569.getClass(), "parent", null);
        setField(term207568, term207568.getClass(), "next", term207569);
        setField(term207568, term207568.getClass(), "first", null);
        setField(term207568, term207568.getClass(), "last", null);
        setField(term207568, term207568.getClass(), "propListHead", null);
        setIntField(term207568, term207568.getClass(), "sourcePosition", 0);
        setField(term207568, term207568.getClass(), "jsType", null);
        setField(term207568, term207568.getClass(), "parent", null);
        setField(term207567, term207567.getClass(), "next", term207568);
        setIntField(term207570, term207570.getClass(), "type", 0);
        setField(term207570, term207570.getClass(), "next", null);
        setField(term207570, term207570.getClass(), "first", null);
        setField(term207570, term207570.getClass(), "last", null);
        setField(term207570, term207570.getClass(), "propListHead", null);
        setIntField(term207570, term207570.getClass(), "sourcePosition", 0);
        setField(term207570, term207570.getClass(), "jsType", null);
        setField(term207570, term207570.getClass(), "parent", null);
        setField(term207567, term207567.getClass(), "first", term207570);
        setField(term207567, term207567.getClass(), "last", null);
        setField(term207567, term207567.getClass(), "propListHead", null);
        setIntField(term207567, term207567.getClass(), "sourcePosition", 0);
        setField(term207567, term207567.getClass(), "jsType", null);
        setField(term207567, term207567.getClass(), "parent", null);
        setField(term207566, term207566.getClass(), "first", term207567);
        setField(term207566, term207566.getClass(), "last", null);
        setField(term207566, term207566.getClass(), "propListHead", null);
        setIntField(term207566, term207566.getClass(), "sourcePosition", 0);
        setField(term207566, term207566.getClass(), "jsType", null);
        setField(term207566, term207566.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term206595;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term206525, args);
        assertTrue(recursiveEquals(term206525, term207565));
        assertTrue(recursiveEquals(term206595, term207566));
    }

};


