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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14025;
     Object term14095;
     Object term14406;
     Object term14407;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14025 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term14095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14095, term14095.getClass(), "type", 152);
        setIntField(term14165, term14165.getClass(), "type", 2);
        setIntField(term14235, term14235.getClass(), "type", 1);
        setField(term14235, term14235.getClass(), "first", null);
        setField(term14235, term14235.getClass(), "next", null);
        setField(term14165, term14165.getClass(), "first", term14235);
        setIntField(term14305, term14305.getClass(), "type", 0);
        setField(term14305, term14305.getClass(), "first", null);
        setField(term14305, term14305.getClass(), "next", null);
        setField(term14165, term14165.getClass(), "next", term14305);
        setField(term14095, term14095.getClass(), "first", term14165);
        term14406 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term14406, term14406.getClass(), "late", false);
        setIntField(term14406, term14406.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term14406, term14406.getClass(), "compiler", null);
        term14407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14407, term14407.getClass(), "type", 152);
        setField(term14407, term14407.getClass(), "next", null);
        setIntField(term14408, term14408.getClass(), "type", 2);
        setIntField(term14409, term14409.getClass(), "type", 0);
        setField(term14409, term14409.getClass(), "next", null);
        setField(term14409, term14409.getClass(), "first", null);
        setField(term14409, term14409.getClass(), "last", null);
        setField(term14409, term14409.getClass(), "propListHead", null);
        setIntField(term14409, term14409.getClass(), "sourcePosition", 0);
        setField(term14409, term14409.getClass(), "jsType", null);
        setField(term14409, term14409.getClass(), "parent", null);
        setField(term14408, term14408.getClass(), "next", term14409);
        setIntField(term14410, term14410.getClass(), "type", 1);
        setField(term14410, term14410.getClass(), "next", null);
        setField(term14410, term14410.getClass(), "first", null);
        setField(term14410, term14410.getClass(), "last", null);
        setField(term14410, term14410.getClass(), "propListHead", null);
        setIntField(term14410, term14410.getClass(), "sourcePosition", 0);
        setField(term14410, term14410.getClass(), "jsType", null);
        setField(term14410, term14410.getClass(), "parent", null);
        setField(term14408, term14408.getClass(), "first", term14410);
        setField(term14408, term14408.getClass(), "last", null);
        setField(term14408, term14408.getClass(), "propListHead", null);
        setIntField(term14408, term14408.getClass(), "sourcePosition", 0);
        setField(term14408, term14408.getClass(), "jsType", null);
        setField(term14408, term14408.getClass(), "parent", null);
        setField(term14407, term14407.getClass(), "first", term14408);
        setField(term14407, term14407.getClass(), "last", null);
        setField(term14407, term14407.getClass(), "propListHead", null);
        setIntField(term14407, term14407.getClass(), "sourcePosition", 0);
        setField(term14407, term14407.getClass(), "jsType", null);
        setField(term14407, term14407.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14095;
        Object retValue = callMethod(klass, "isPure", argTypes, term14025, args);
        assertTrue(recursiveEquals(term14025, term14406));
        assertTrue(recursiveEquals(term14095, term14407));
        assertTrue(recursiveEquals(retValue, false));
    }

};


