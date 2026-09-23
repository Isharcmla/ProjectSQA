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

public class PeepholeSubstituteAlternateSyntax_getBlockExpression_178752834270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term687;
     Object term690;

    public PeepholeSubstituteAlternateSyntax_getBlockExpression_178752834270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term687 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term687, term687.getClass(), "late", true);
        setIntField(term687, term687.getClass(), "STRING_SPLIT_OVERHEAD", 1008080511);
        setField(term687, term687.getClass(), "compiler", null);
        term690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term690, term690.getClass(), "type", 1935707624);
        setIntField(term692, term692.getClass(), "type", 1507074215);
        setIntField(term694, term694.getClass(), "type", -282881827);
        setIntField(term696, term696.getClass(), "type", -1183353915);
        setIntField(term698, term698.getClass(), "type", -420030135);
        setField(term698, term698.getClass(), "next", null);
        setField(term698, term698.getClass(), "first", null);
        setField(term698, term698.getClass(), "last", null);
        setField(term698, term698.getClass(), "propListHead", null);
        setIntField(term698, term698.getClass(), "sourcePosition", 0);
        setField(term698, term698.getClass(), "jsType", null);
        setField(term698, term698.getClass(), "parent", null);
        setField(term696, term696.getClass(), "next", term698);
        setIntField(term701, term701.getClass(), "type", 267763294);
        setField(term701, term701.getClass(), "next", null);
        setField(term701, term701.getClass(), "first", null);
        setField(term701, term701.getClass(), "last", term698);
        setField(term701, term701.getClass(), "propListHead", null);
        setIntField(term701, term701.getClass(), "sourcePosition", 0);
        setField(term701, term701.getClass(), "jsType", null);
        setField(term701, term701.getClass(), "parent", null);
        setField(term696, term696.getClass(), "first", term701);
        setField(term696, term696.getClass(), "last", term694);
        setField(term696, term696.getClass(), "propListHead", null);
        setIntField(term696, term696.getClass(), "sourcePosition", 0);
        setField(term696, term696.getClass(), "jsType", null);
        setField(term696, term696.getClass(), "parent", null);
        setField(term694, term694.getClass(), "next", term696);
        setField(term694, term694.getClass(), "first", term698);
        setIntField(term705, term705.getClass(), "type", 49950830);
        setIntField(term707, term707.getClass(), "type", -525257914);
        setField(term707, term707.getClass(), "next", null);
        setField(term707, term707.getClass(), "first", term701);
        setField(term707, term707.getClass(), "last", term696);
        setField(term707, term707.getClass(), "propListHead", null);
        setIntField(term707, term707.getClass(), "sourcePosition", 0);
        setField(term707, term707.getClass(), "jsType", null);
        setField(term707, term707.getClass(), "parent", null);
        setField(term705, term705.getClass(), "next", term707);
        setField(term705, term705.getClass(), "first", term692);
        setField(term705, term705.getClass(), "last", term692);
        setField(term705, term705.getClass(), "propListHead", null);
        setIntField(term705, term705.getClass(), "sourcePosition", 0);
        setField(term705, term705.getClass(), "jsType", null);
        setField(term705, term705.getClass(), "parent", null);
        setField(term694, term694.getClass(), "last", term705);
        setField(term694, term694.getClass(), "propListHead", null);
        setIntField(term694, term694.getClass(), "sourcePosition", 0);
        setField(term694, term694.getClass(), "jsType", null);
        setField(term694, term694.getClass(), "parent", null);
        setField(term692, term692.getClass(), "next", term694);
        setIntField(term712, term712.getClass(), "type", 147209682);
        setField(term712, term712.getClass(), "next", term705);
        setField(term712, term712.getClass(), "first", term707);
        setField(term712, term712.getClass(), "last", term690);
        setField(term712, term712.getClass(), "propListHead", null);
        setIntField(term712, term712.getClass(), "sourcePosition", 0);
        setField(term712, term712.getClass(), "jsType", null);
        setField(term712, term712.getClass(), "parent", null);
        setField(term692, term692.getClass(), "first", term712);
        setField(term692, term692.getClass(), "last", term712);
        setField(term692, term692.getClass(), "propListHead", null);
        setIntField(term692, term692.getClass(), "sourcePosition", 0);
        setField(term692, term692.getClass(), "jsType", null);
        setField(term692, term692.getClass(), "parent", null);
        setField(term690, term690.getClass(), "next", term692);
        setField(term690, term690.getClass(), "first", term696);
        setField(term690, term690.getClass(), "last", term698);
        setField(term690, term690.getClass(), "propListHead", null);
        setIntField(term690, term690.getClass(), "sourcePosition", 0);
        setField(term690, term690.getClass(), "jsType", null);
        setField(term690, term690.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term690;
        try {
            callMethod(klass, "getBlockExpression", argTypes, term687, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


