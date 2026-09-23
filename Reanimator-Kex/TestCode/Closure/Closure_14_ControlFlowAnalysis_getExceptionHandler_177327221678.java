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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ControlFlowAnalysis_getExceptionHandler_177327221678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3311;

    public ControlFlowAnalysis_getExceptionHandler_177327221678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3311, term3311.getClass(), "type", -712023865);
        setIntField(term3313, term3313.getClass(), "type", 613256157);
        setIntField(term3315, term3315.getClass(), "type", 454242689);
        setIntField(term3317, term3317.getClass(), "type", 1798354517);
        setIntField(term3319, term3319.getClass(), "type", -1495693617);
        setField(term3319, term3319.getClass(), "next", null);
        setField(term3319, term3319.getClass(), "first", null);
        setField(term3319, term3319.getClass(), "last", null);
        setField(term3319, term3319.getClass(), "propListHead", null);
        setIntField(term3319, term3319.getClass(), "sourcePosition", 0);
        setField(term3319, term3319.getClass(), "jsType", null);
        setField(term3319, term3319.getClass(), "parent", null);
        setField(term3317, term3317.getClass(), "next", term3319);
        setIntField(term3322, term3322.getClass(), "type", -890538258);
        setField(term3322, term3322.getClass(), "next", null);
        setField(term3322, term3322.getClass(), "first", null);
        setField(term3322, term3322.getClass(), "last", term3319);
        setField(term3322, term3322.getClass(), "propListHead", null);
        setIntField(term3322, term3322.getClass(), "sourcePosition", 0);
        setField(term3322, term3322.getClass(), "jsType", null);
        setField(term3322, term3322.getClass(), "parent", null);
        setField(term3317, term3317.getClass(), "first", term3322);
        setField(term3317, term3317.getClass(), "last", term3315);
        setField(term3317, term3317.getClass(), "propListHead", null);
        setIntField(term3317, term3317.getClass(), "sourcePosition", 0);
        setField(term3317, term3317.getClass(), "jsType", null);
        setField(term3317, term3317.getClass(), "parent", null);
        setField(term3315, term3315.getClass(), "next", term3317);
        setField(term3315, term3315.getClass(), "first", term3319);
        setIntField(term3326, term3326.getClass(), "type", -1458980236);
        setIntField(term3328, term3328.getClass(), "type", 890505372);
        setField(term3328, term3328.getClass(), "next", null);
        setField(term3328, term3328.getClass(), "first", term3322);
        setField(term3328, term3328.getClass(), "last", term3317);
        setField(term3328, term3328.getClass(), "propListHead", null);
        setIntField(term3328, term3328.getClass(), "sourcePosition", 0);
        setField(term3328, term3328.getClass(), "jsType", null);
        setField(term3328, term3328.getClass(), "parent", null);
        setField(term3326, term3326.getClass(), "next", term3328);
        setField(term3326, term3326.getClass(), "first", term3313);
        setField(term3326, term3326.getClass(), "last", term3313);
        setField(term3326, term3326.getClass(), "propListHead", null);
        setIntField(term3326, term3326.getClass(), "sourcePosition", 0);
        setField(term3326, term3326.getClass(), "jsType", null);
        setField(term3326, term3326.getClass(), "parent", null);
        setField(term3315, term3315.getClass(), "last", term3326);
        setField(term3315, term3315.getClass(), "propListHead", null);
        setIntField(term3315, term3315.getClass(), "sourcePosition", 0);
        setField(term3315, term3315.getClass(), "jsType", null);
        setField(term3315, term3315.getClass(), "parent", null);
        setField(term3313, term3313.getClass(), "next", term3315);
        setIntField(term3333, term3333.getClass(), "type", 2044137055);
        setField(term3333, term3333.getClass(), "next", term3326);
        setField(term3333, term3333.getClass(), "first", term3328);
        setField(term3333, term3333.getClass(), "last", term3311);
        setField(term3333, term3333.getClass(), "propListHead", null);
        setIntField(term3333, term3333.getClass(), "sourcePosition", 0);
        setField(term3333, term3333.getClass(), "jsType", null);
        setField(term3333, term3333.getClass(), "parent", null);
        setField(term3313, term3313.getClass(), "first", term3333);
        setField(term3313, term3313.getClass(), "last", term3333);
        setField(term3313, term3313.getClass(), "propListHead", null);
        setIntField(term3313, term3313.getClass(), "sourcePosition", 0);
        setField(term3313, term3313.getClass(), "jsType", null);
        setField(term3313, term3313.getClass(), "parent", null);
        setField(term3311, term3311.getClass(), "next", term3313);
        setField(term3311, term3311.getClass(), "first", term3317);
        setField(term3311, term3311.getClass(), "last", term3319);
        setField(term3311, term3311.getClass(), "propListHead", null);
        setIntField(term3311, term3311.getClass(), "sourcePosition", 0);
        setField(term3311, term3311.getClass(), "jsType", null);
        setField(term3311, term3311.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3311;
        try {
            callMethod(klass, "getExceptionHandler", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


