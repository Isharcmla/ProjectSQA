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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12108;
     Object term12178;
     Object term13171;
     Object term13172;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12108 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term12178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12178, term12178.getClass(), "type", 114);
        setIntField(term12248, term12248.getClass(), "type", 2);
        setIntField(term12318, term12318.getClass(), "type", 1);
        setField(term12318, term12318.getClass(), "first", null);
        setField(term12318, term12318.getClass(), "next", null);
        setField(term12248, term12248.getClass(), "first", term12318);
        setIntField(term12388, term12388.getClass(), "type", 0);
        setField(term12388, term12388.getClass(), "first", null);
        setField(term12388, term12388.getClass(), "next", null);
        setField(term12248, term12248.getClass(), "next", term12388);
        setField(term12178, term12178.getClass(), "first", term12248);
        term13171 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term13171, term13171.getClass(), "late", false);
        setIntField(term13171, term13171.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term13171, term13171.getClass(), "compiler", null);
        term13172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13172, term13172.getClass(), "type", 114);
        setField(term13172, term13172.getClass(), "next", null);
        setIntField(term13173, term13173.getClass(), "type", 2);
        setIntField(term13174, term13174.getClass(), "type", 0);
        setField(term13174, term13174.getClass(), "next", null);
        setField(term13174, term13174.getClass(), "first", null);
        setField(term13174, term13174.getClass(), "last", null);
        setField(term13174, term13174.getClass(), "propListHead", null);
        setIntField(term13174, term13174.getClass(), "sourcePosition", 0);
        setField(term13174, term13174.getClass(), "jsType", null);
        setField(term13174, term13174.getClass(), "parent", null);
        setField(term13173, term13173.getClass(), "next", term13174);
        setIntField(term13175, term13175.getClass(), "type", 1);
        setField(term13175, term13175.getClass(), "next", null);
        setField(term13175, term13175.getClass(), "first", null);
        setField(term13175, term13175.getClass(), "last", null);
        setField(term13175, term13175.getClass(), "propListHead", null);
        setIntField(term13175, term13175.getClass(), "sourcePosition", 0);
        setField(term13175, term13175.getClass(), "jsType", null);
        setField(term13175, term13175.getClass(), "parent", null);
        setField(term13173, term13173.getClass(), "first", term13175);
        setField(term13173, term13173.getClass(), "last", null);
        setField(term13173, term13173.getClass(), "propListHead", null);
        setIntField(term13173, term13173.getClass(), "sourcePosition", 0);
        setField(term13173, term13173.getClass(), "jsType", null);
        setField(term13173, term13173.getClass(), "parent", null);
        setField(term13172, term13172.getClass(), "first", term13173);
        setField(term13172, term13172.getClass(), "last", null);
        setField(term13172, term13172.getClass(), "propListHead", null);
        setIntField(term13172, term13172.getClass(), "sourcePosition", 0);
        setField(term13172, term13172.getClass(), "jsType", null);
        setField(term13172, term13172.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12178;
        Object retValue = callMethod(klass, "isPure", argTypes, term12108, args);
        assertTrue(recursiveEquals(term12108, term13171));
        assertTrue(recursiveEquals(term12178, term13172));
        assertTrue(recursiveEquals(retValue, false));
    }

};


