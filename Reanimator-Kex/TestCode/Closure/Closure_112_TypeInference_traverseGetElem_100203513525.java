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

public class TypeInference_traverseGetElem_100203513525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2320243;
     Object term2320313;

    public TypeInference_traverseGetElem_100203513525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2320243 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2320313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2320383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2320453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2320523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2320593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2320663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2320733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2320803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2320873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2320943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2321013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2321083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2321153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2321223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2321293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2320383, term2320383.getClass(), "type", 98);
        setField(term2320453, term2320453.getClass(), "next", null);
        setIntField(term2320453, term2320453.getClass(), "type", 98);
        setField(term2320523, term2320523.getClass(), "next", null);
        setIntField(term2320523, term2320523.getClass(), "type", 98);
        setField(term2320593, term2320593.getClass(), "next", null);
        setIntField(term2320593, term2320593.getClass(), "type", 98);
        setField(term2320663, term2320663.getClass(), "next", null);
        setIntField(term2320663, term2320663.getClass(), "type", 98);
        setField(term2320733, term2320733.getClass(), "next", null);
        setIntField(term2320733, term2320733.getClass(), "type", 98);
        setField(term2320803, term2320803.getClass(), "next", null);
        setIntField(term2320803, term2320803.getClass(), "type", 98);
        setField(term2320873, term2320873.getClass(), "next", null);
        setIntField(term2320873, term2320873.getClass(), "type", 98);
        setField(term2320943, term2320943.getClass(), "next", null);
        setIntField(term2320943, term2320943.getClass(), "type", 98);
        setField(term2321013, term2321013.getClass(), "next", null);
        setIntField(term2321013, term2321013.getClass(), "type", 98);
        setField(term2321083, term2321083.getClass(), "next", null);
        setIntField(term2321083, term2321083.getClass(), "type", 98);
        setField(term2321153, term2321153.getClass(), "next", null);
        setIntField(term2321153, term2321153.getClass(), "type", 98);
        setField(term2321223, term2321223.getClass(), "next", null);
        setIntField(term2321223, term2321223.getClass(), "type", 98);
        setField(term2321293, term2321293.getClass(), "next", null);
        setIntField(term2321293, term2321293.getClass(), "type", 90);
        setField(term2321223, term2321223.getClass(), "first", term2321293);
        setField(term2321223, term2321223.getClass(), "last", null);
        setField(term2321153, term2321153.getClass(), "first", term2321223);
        setField(term2321153, term2321153.getClass(), "last", null);
        setField(term2321083, term2321083.getClass(), "first", term2321153);
        setField(term2321083, term2321083.getClass(), "last", null);
        setField(term2321013, term2321013.getClass(), "first", term2321083);
        setField(term2321013, term2321013.getClass(), "last", null);
        setField(term2320943, term2320943.getClass(), "first", term2321013);
        setField(term2320943, term2320943.getClass(), "last", null);
        setField(term2320873, term2320873.getClass(), "first", term2320943);
        setField(term2320873, term2320873.getClass(), "last", null);
        setField(term2320803, term2320803.getClass(), "first", term2320873);
        setField(term2320803, term2320803.getClass(), "last", null);
        setField(term2320733, term2320733.getClass(), "first", term2320803);
        setField(term2320733, term2320733.getClass(), "last", null);
        setField(term2320663, term2320663.getClass(), "first", term2320733);
        setField(term2320663, term2320663.getClass(), "last", null);
        setField(term2320593, term2320593.getClass(), "first", term2320663);
        setField(term2320593, term2320593.getClass(), "last", null);
        setField(term2320523, term2320523.getClass(), "first", term2320593);
        setField(term2320523, term2320523.getClass(), "last", null);
        setField(term2320453, term2320453.getClass(), "first", term2320523);
        setField(term2320453, term2320453.getClass(), "last", null);
        setField(term2320383, term2320383.getClass(), "first", term2320453);
        setField(term2320383, term2320383.getClass(), "last", null);
        setField(term2320313, term2320313.getClass(), "first", term2320383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2320313;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term2320243, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


