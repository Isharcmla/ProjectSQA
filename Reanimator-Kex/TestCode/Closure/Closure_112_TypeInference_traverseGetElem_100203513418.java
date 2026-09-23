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

public class TypeInference_traverseGetElem_100203513418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1292563;
     Object term1292633;

    public TypeInference_traverseGetElem_100203513418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1292563 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1292633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1292703, term1292703.getClass(), "type", 98);
        setField(term1292773, term1292773.getClass(), "next", null);
        setIntField(term1292773, term1292773.getClass(), "type", 98);
        setField(term1292843, term1292843.getClass(), "next", null);
        setIntField(term1292843, term1292843.getClass(), "type", 98);
        setField(term1292913, term1292913.getClass(), "next", null);
        setIntField(term1292913, term1292913.getClass(), "type", 98);
        setField(term1292983, term1292983.getClass(), "next", null);
        setIntField(term1292983, term1292983.getClass(), "type", 98);
        setField(term1293053, term1293053.getClass(), "next", null);
        setIntField(term1293053, term1293053.getClass(), "type", 98);
        setField(term1293123, term1293123.getClass(), "next", null);
        setIntField(term1293123, term1293123.getClass(), "type", 98);
        setField(term1293193, term1293193.getClass(), "next", null);
        setIntField(term1293193, term1293193.getClass(), "type", 98);
        setField(term1293263, term1293263.getClass(), "next", null);
        setIntField(term1293263, term1293263.getClass(), "type", 98);
        setField(term1293333, term1293333.getClass(), "next", null);
        setIntField(term1293333, term1293333.getClass(), "type", 98);
        setField(term1293403, term1293403.getClass(), "next", null);
        setIntField(term1293403, term1293403.getClass(), "type", 98);
        setField(term1293473, term1293473.getClass(), "next", null);
        setIntField(term1293473, term1293473.getClass(), "type", 98);
        setField(term1293543, term1293543.getClass(), "next", null);
        setIntField(term1293543, term1293543.getClass(), "type", 98);
        setField(term1293613, term1293613.getClass(), "next", null);
        setIntField(term1293613, term1293613.getClass(), "type", 98);
        setField(term1293683, term1293683.getClass(), "next", null);
        setIntField(term1293683, term1293683.getClass(), "type", 98);
        setField(term1293753, term1293753.getClass(), "next", null);
        setIntField(term1293753, term1293753.getClass(), "type", 98);
        setField(term1293823, term1293823.getClass(), "next", null);
        setIntField(term1293823, term1293823.getClass(), "type", 98);
        setField(term1293893, term1293893.getClass(), "next", null);
        setIntField(term1293893, term1293893.getClass(), "type", 150);
        setField(term1293823, term1293823.getClass(), "first", term1293893);
        setField(term1293823, term1293823.getClass(), "last", null);
        setField(term1293753, term1293753.getClass(), "first", term1293823);
        setField(term1293753, term1293753.getClass(), "last", null);
        setField(term1293683, term1293683.getClass(), "first", term1293753);
        setField(term1293683, term1293683.getClass(), "last", null);
        setField(term1293613, term1293613.getClass(), "first", term1293683);
        setField(term1293613, term1293613.getClass(), "last", null);
        setField(term1293543, term1293543.getClass(), "first", term1293613);
        setField(term1293543, term1293543.getClass(), "last", null);
        setField(term1293473, term1293473.getClass(), "first", term1293543);
        setField(term1293473, term1293473.getClass(), "last", null);
        setField(term1293403, term1293403.getClass(), "first", term1293473);
        setField(term1293403, term1293403.getClass(), "last", null);
        setField(term1293333, term1293333.getClass(), "first", term1293403);
        setField(term1293333, term1293333.getClass(), "last", null);
        setField(term1293263, term1293263.getClass(), "first", term1293333);
        setField(term1293263, term1293263.getClass(), "last", null);
        setField(term1293193, term1293193.getClass(), "first", term1293263);
        setField(term1293193, term1293193.getClass(), "last", null);
        setField(term1293123, term1293123.getClass(), "first", term1293193);
        setField(term1293123, term1293123.getClass(), "last", null);
        setField(term1293053, term1293053.getClass(), "first", term1293123);
        setField(term1293053, term1293053.getClass(), "last", term1293893);
        setField(term1292983, term1292983.getClass(), "first", term1293053);
        setField(term1292983, term1292983.getClass(), "last", null);
        setField(term1292913, term1292913.getClass(), "first", term1292983);
        setField(term1292913, term1292913.getClass(), "last", null);
        setField(term1292843, term1292843.getClass(), "first", term1292913);
        setField(term1292843, term1292843.getClass(), "last", null);
        setField(term1292773, term1292773.getClass(), "first", term1292843);
        setField(term1292773, term1292773.getClass(), "last", null);
        setField(term1292703, term1292703.getClass(), "first", term1292773);
        setField(term1292703, term1292703.getClass(), "last", null);
        setField(term1292633, term1292633.getClass(), "first", term1292703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1292633;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term1292563, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


