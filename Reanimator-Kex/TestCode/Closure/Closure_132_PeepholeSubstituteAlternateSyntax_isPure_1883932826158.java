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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35987;
     Object term36057;
     Object term61329;
     Object term61330;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35987 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setField(term35987, term35987.getClass(), "compiler", null);
        term36057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36057, term36057.getClass(), "type", 95);
        setIntField(term36127, term36127.getClass(), "type", 2);
        setIntField(term36197, term36197.getClass(), "type", 1);
        setField(term36197, term36197.getClass(), "first", null);
        setField(term36197, term36197.getClass(), "next", null);
        setField(term36127, term36127.getClass(), "first", term36197);
        setIntField(term36267, term36267.getClass(), "type", 0);
        setField(term36267, term36267.getClass(), "first", null);
        setField(term36267, term36267.getClass(), "next", null);
        setField(term36127, term36127.getClass(), "next", term36267);
        setField(term36057, term36057.getClass(), "first", term36127);
        term61329 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term61329, term61329.getClass(), "late", false);
        setIntField(term61329, term61329.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term61329, term61329.getClass(), "compiler", null);
        term61330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61330, term61330.getClass(), "type", 95);
        setField(term61330, term61330.getClass(), "next", null);
        setIntField(term61331, term61331.getClass(), "type", 2);
        setIntField(term61332, term61332.getClass(), "type", 0);
        setField(term61332, term61332.getClass(), "next", null);
        setField(term61332, term61332.getClass(), "first", null);
        setField(term61332, term61332.getClass(), "last", null);
        setField(term61332, term61332.getClass(), "propListHead", null);
        setIntField(term61332, term61332.getClass(), "sourcePosition", 0);
        setField(term61332, term61332.getClass(), "jsType", null);
        setField(term61332, term61332.getClass(), "parent", null);
        setField(term61331, term61331.getClass(), "next", term61332);
        setIntField(term61333, term61333.getClass(), "type", 1);
        setField(term61333, term61333.getClass(), "next", null);
        setField(term61333, term61333.getClass(), "first", null);
        setField(term61333, term61333.getClass(), "last", null);
        setField(term61333, term61333.getClass(), "propListHead", null);
        setIntField(term61333, term61333.getClass(), "sourcePosition", 0);
        setField(term61333, term61333.getClass(), "jsType", null);
        setField(term61333, term61333.getClass(), "parent", null);
        setField(term61331, term61331.getClass(), "first", term61333);
        setField(term61331, term61331.getClass(), "last", null);
        setField(term61331, term61331.getClass(), "propListHead", null);
        setIntField(term61331, term61331.getClass(), "sourcePosition", 0);
        setField(term61331, term61331.getClass(), "jsType", null);
        setField(term61331, term61331.getClass(), "parent", null);
        setField(term61330, term61330.getClass(), "first", term61331);
        setField(term61330, term61330.getClass(), "last", null);
        setField(term61330, term61330.getClass(), "propListHead", null);
        setIntField(term61330, term61330.getClass(), "sourcePosition", 0);
        setField(term61330, term61330.getClass(), "jsType", null);
        setField(term61330, term61330.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36057;
        Object retValue = callMethod(klass, "isPure", argTypes, term35987, args);
        assertTrue(recursiveEquals(term35987, term61329));
        assertTrue(recursiveEquals(term36057, term61330));
        assertTrue(recursiveEquals(retValue, false));
    }

};


