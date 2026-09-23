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

public class PeepholeSubstituteAlternateSyntax_getBlockReturnExpression_137116453874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term807;
     Object term810;

    public PeepholeSubstituteAlternateSyntax_getBlockReturnExpression_137116453874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term807 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term807, term807.getClass(), "late", false);
        setIntField(term807, term807.getClass(), "STRING_SPLIT_OVERHEAD", -1464172784);
        setField(term807, term807.getClass(), "compiler", null);
        term810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term810, term810.getClass(), "type", 32185364);
        setIntField(term812, term812.getClass(), "type", 1768204942);
        setIntField(term814, term814.getClass(), "type", 1252951645);
        setIntField(term816, term816.getClass(), "type", 574481092);
        setIntField(term818, term818.getClass(), "type", -310528004);
        setField(term818, term818.getClass(), "next", null);
        setField(term818, term818.getClass(), "first", null);
        setField(term818, term818.getClass(), "last", null);
        setField(term818, term818.getClass(), "propListHead", null);
        setIntField(term818, term818.getClass(), "sourcePosition", 0);
        setField(term818, term818.getClass(), "jsType", null);
        setField(term818, term818.getClass(), "parent", null);
        setField(term816, term816.getClass(), "next", term818);
        setIntField(term821, term821.getClass(), "type", -634976996);
        setField(term821, term821.getClass(), "next", null);
        setField(term821, term821.getClass(), "first", null);
        setField(term821, term821.getClass(), "last", term818);
        setField(term821, term821.getClass(), "propListHead", null);
        setIntField(term821, term821.getClass(), "sourcePosition", 0);
        setField(term821, term821.getClass(), "jsType", null);
        setField(term821, term821.getClass(), "parent", null);
        setField(term816, term816.getClass(), "first", term821);
        setField(term816, term816.getClass(), "last", term814);
        setField(term816, term816.getClass(), "propListHead", null);
        setIntField(term816, term816.getClass(), "sourcePosition", 0);
        setField(term816, term816.getClass(), "jsType", null);
        setField(term816, term816.getClass(), "parent", null);
        setField(term814, term814.getClass(), "next", term816);
        setField(term814, term814.getClass(), "first", term818);
        setIntField(term825, term825.getClass(), "type", -49052672);
        setIntField(term827, term827.getClass(), "type", 339372704);
        setField(term827, term827.getClass(), "next", null);
        setField(term827, term827.getClass(), "first", term821);
        setField(term827, term827.getClass(), "last", term816);
        setField(term827, term827.getClass(), "propListHead", null);
        setIntField(term827, term827.getClass(), "sourcePosition", 0);
        setField(term827, term827.getClass(), "jsType", null);
        setField(term827, term827.getClass(), "parent", null);
        setField(term825, term825.getClass(), "next", term827);
        setField(term825, term825.getClass(), "first", term812);
        setField(term825, term825.getClass(), "last", term812);
        setField(term825, term825.getClass(), "propListHead", null);
        setIntField(term825, term825.getClass(), "sourcePosition", 0);
        setField(term825, term825.getClass(), "jsType", null);
        setField(term825, term825.getClass(), "parent", null);
        setField(term814, term814.getClass(), "last", term825);
        setField(term814, term814.getClass(), "propListHead", null);
        setIntField(term814, term814.getClass(), "sourcePosition", 0);
        setField(term814, term814.getClass(), "jsType", null);
        setField(term814, term814.getClass(), "parent", null);
        setField(term812, term812.getClass(), "next", term814);
        setIntField(term832, term832.getClass(), "type", -851097944);
        setField(term832, term832.getClass(), "next", term825);
        setField(term832, term832.getClass(), "first", term827);
        setField(term832, term832.getClass(), "last", term810);
        setField(term832, term832.getClass(), "propListHead", null);
        setIntField(term832, term832.getClass(), "sourcePosition", 0);
        setField(term832, term832.getClass(), "jsType", null);
        setField(term832, term832.getClass(), "parent", null);
        setField(term812, term812.getClass(), "first", term832);
        setField(term812, term812.getClass(), "last", term832);
        setField(term812, term812.getClass(), "propListHead", null);
        setIntField(term812, term812.getClass(), "sourcePosition", 0);
        setField(term812, term812.getClass(), "jsType", null);
        setField(term812, term812.getClass(), "parent", null);
        setField(term810, term810.getClass(), "next", term812);
        setField(term810, term810.getClass(), "first", term816);
        setField(term810, term810.getClass(), "last", term818);
        setField(term810, term810.getClass(), "propListHead", null);
        setIntField(term810, term810.getClass(), "sourcePosition", 0);
        setField(term810, term810.getClass(), "jsType", null);
        setField(term810, term810.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term810;
        try {
            callMethod(klass, "getBlockReturnExpression", argTypes, term807, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


