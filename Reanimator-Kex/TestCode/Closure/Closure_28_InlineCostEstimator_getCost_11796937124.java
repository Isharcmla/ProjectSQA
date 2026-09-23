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

public class InlineCostEstimator_getCost_11796937124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public InlineCostEstimator_getCost_11796937124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1, term1.getClass(), "type", 568599855);
        setIntField(term3, term3.getClass(), "type", 1162663216);
        setIntField(term5, term5.getClass(), "type", 1484323161);
        setIntField(term7, term7.getClass(), "type", 391863371);
        setIntField(term9, term9.getClass(), "type", -1922583790);
        setField(term9, term9.getClass(), "next", null);
        setField(term9, term9.getClass(), "first", null);
        setField(term9, term9.getClass(), "last", null);
        setField(term9, term9.getClass(), "propListHead", null);
        setIntField(term9, term9.getClass(), "sourcePosition", 0);
        setField(term9, term9.getClass(), "jsType", null);
        setField(term9, term9.getClass(), "parent", null);
        setField(term7, term7.getClass(), "next", term9);
        setIntField(term12, term12.getClass(), "type", -616727354);
        setField(term12, term12.getClass(), "next", null);
        setField(term12, term12.getClass(), "first", null);
        setField(term12, term12.getClass(), "last", term9);
        setField(term12, term12.getClass(), "propListHead", null);
        setIntField(term12, term12.getClass(), "sourcePosition", 0);
        setField(term12, term12.getClass(), "jsType", null);
        setField(term12, term12.getClass(), "parent", null);
        setField(term7, term7.getClass(), "first", term12);
        setField(term7, term7.getClass(), "last", term5);
        setField(term7, term7.getClass(), "propListHead", null);
        setIntField(term7, term7.getClass(), "sourcePosition", 0);
        setField(term7, term7.getClass(), "jsType", null);
        setField(term7, term7.getClass(), "parent", null);
        setField(term5, term5.getClass(), "next", term7);
        setField(term5, term5.getClass(), "first", term9);
        setIntField(term16, term16.getClass(), "type", -2038273078);
        setIntField(term18, term18.getClass(), "type", 1227103734);
        setField(term18, term18.getClass(), "next", null);
        setField(term18, term18.getClass(), "first", term12);
        setField(term18, term18.getClass(), "last", term7);
        setField(term18, term18.getClass(), "propListHead", null);
        setIntField(term18, term18.getClass(), "sourcePosition", 0);
        setField(term18, term18.getClass(), "jsType", null);
        setField(term18, term18.getClass(), "parent", null);
        setField(term16, term16.getClass(), "next", term18);
        setField(term16, term16.getClass(), "first", term3);
        setField(term16, term16.getClass(), "last", term3);
        setField(term16, term16.getClass(), "propListHead", null);
        setIntField(term16, term16.getClass(), "sourcePosition", 0);
        setField(term16, term16.getClass(), "jsType", null);
        setField(term16, term16.getClass(), "parent", null);
        setField(term5, term5.getClass(), "last", term16);
        setField(term5, term5.getClass(), "propListHead", null);
        setIntField(term5, term5.getClass(), "sourcePosition", 0);
        setField(term5, term5.getClass(), "jsType", null);
        setField(term5, term5.getClass(), "parent", null);
        setField(term3, term3.getClass(), "next", term5);
        setIntField(term23, term23.getClass(), "type", -1339778481);
        setField(term23, term23.getClass(), "next", term16);
        setField(term23, term23.getClass(), "first", term18);
        setField(term23, term23.getClass(), "last", term1);
        setField(term23, term23.getClass(), "propListHead", null);
        setIntField(term23, term23.getClass(), "sourcePosition", 0);
        setField(term23, term23.getClass(), "jsType", null);
        setField(term23, term23.getClass(), "parent", null);
        setField(term3, term3.getClass(), "first", term23);
        setField(term3, term3.getClass(), "last", term23);
        setField(term3, term3.getClass(), "propListHead", null);
        setIntField(term3, term3.getClass(), "sourcePosition", 0);
        setField(term3, term3.getClass(), "jsType", null);
        setField(term3, term3.getClass(), "parent", null);
        setField(term1, term1.getClass(), "next", term3);
        setField(term1, term1.getClass(), "first", term7);
        setField(term1, term1.getClass(), "last", term9);
        setField(term1, term1.getClass(), "propListHead", null);
        setIntField(term1, term1.getClass(), "sourcePosition", 0);
        setField(term1, term1.getClass(), "jsType", null);
        setField(term1, term1.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1;
        try {
            callMethod(klass, "getCost", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


