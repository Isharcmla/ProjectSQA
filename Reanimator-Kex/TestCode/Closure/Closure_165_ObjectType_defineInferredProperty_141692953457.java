package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ObjectType_defineInferredProperty_141692953457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term689;

    public ObjectType_defineInferredProperty_141692953457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term689, term689.getClass(), "type", 1622346318);
        setIntField(term691, term691.getClass(), "type", 1048535127);
        setIntField(term693, term693.getClass(), "type", -655067527);
        setIntField(term695, term695.getClass(), "type", -6029667);
        setIntField(term697, term697.getClass(), "type", -2068769794);
        setField(term697, term697.getClass(), "next", null);
        setField(term697, term697.getClass(), "first", null);
        setField(term697, term697.getClass(), "last", null);
        setField(term697, term697.getClass(), "propListHead", null);
        setIntField(term697, term697.getClass(), "sourcePosition", 0);
        setField(term697, term697.getClass(), "jsType", null);
        setField(term697, term697.getClass(), "parent", null);
        setField(term695, term695.getClass(), "next", term697);
        setIntField(term700, term700.getClass(), "type", -117576464);
        setField(term700, term700.getClass(), "next", null);
        setField(term700, term700.getClass(), "first", null);
        setField(term700, term700.getClass(), "last", term697);
        setField(term700, term700.getClass(), "propListHead", null);
        setIntField(term700, term700.getClass(), "sourcePosition", 0);
        setField(term700, term700.getClass(), "jsType", null);
        setField(term700, term700.getClass(), "parent", null);
        setField(term695, term695.getClass(), "first", term700);
        setField(term695, term695.getClass(), "last", term693);
        setField(term695, term695.getClass(), "propListHead", null);
        setIntField(term695, term695.getClass(), "sourcePosition", 0);
        setField(term695, term695.getClass(), "jsType", null);
        setField(term695, term695.getClass(), "parent", null);
        setField(term693, term693.getClass(), "next", term695);
        setField(term693, term693.getClass(), "first", term697);
        setIntField(term704, term704.getClass(), "type", 1135664017);
        setIntField(term706, term706.getClass(), "type", 590364439);
        setField(term706, term706.getClass(), "next", null);
        setField(term706, term706.getClass(), "first", term700);
        setField(term706, term706.getClass(), "last", term695);
        setField(term706, term706.getClass(), "propListHead", null);
        setIntField(term706, term706.getClass(), "sourcePosition", 0);
        setField(term706, term706.getClass(), "jsType", null);
        setField(term706, term706.getClass(), "parent", null);
        setField(term704, term704.getClass(), "next", term706);
        setField(term704, term704.getClass(), "first", term691);
        setField(term704, term704.getClass(), "last", term691);
        setField(term704, term704.getClass(), "propListHead", null);
        setIntField(term704, term704.getClass(), "sourcePosition", 0);
        setField(term704, term704.getClass(), "jsType", null);
        setField(term704, term704.getClass(), "parent", null);
        setField(term693, term693.getClass(), "last", term704);
        setField(term693, term693.getClass(), "propListHead", null);
        setIntField(term693, term693.getClass(), "sourcePosition", 0);
        setField(term693, term693.getClass(), "jsType", null);
        setField(term693, term693.getClass(), "parent", null);
        setField(term691, term691.getClass(), "next", term693);
        setIntField(term711, term711.getClass(), "type", 865208305);
        setField(term711, term711.getClass(), "next", term704);
        setField(term711, term711.getClass(), "first", term706);
        setField(term711, term711.getClass(), "last", term689);
        setField(term711, term711.getClass(), "propListHead", null);
        setIntField(term711, term711.getClass(), "sourcePosition", 0);
        setField(term711, term711.getClass(), "jsType", null);
        setField(term711, term711.getClass(), "parent", null);
        setField(term691, term691.getClass(), "first", term711);
        setField(term691, term691.getClass(), "last", term711);
        setField(term691, term691.getClass(), "propListHead", null);
        setIntField(term691, term691.getClass(), "sourcePosition", 0);
        setField(term691, term691.getClass(), "jsType", null);
        setField(term691, term691.getClass(), "parent", null);
        setField(term689, term689.getClass(), "next", term691);
        setField(term689, term689.getClass(), "first", term695);
        setField(term689, term689.getClass(), "last", term697);
        setField(term689, term689.getClass(), "propListHead", null);
        setIntField(term689, term689.getClass(), "sourcePosition", 0);
        setField(term689, term689.getClass(), "jsType", null);
        setField(term689, term689.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = "TEParAifyi";
        args[1] = null;
        args[2] = term689;
        try {
            callMethod(klass, "defineInferredProperty", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


