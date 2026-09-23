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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class InlineFunctions_hasLocalNames_51818255625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302;
     Object term333;

    public InlineFunctions_hasLocalNames_51818255625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term303 = new HashMap();
        HashMap term318 = new HashMap();
        term302 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term302, term302.getClass(), "fns", term303);
        setField(term302, term302.getClass(), "anonFns", term318);
        setField(term302, term302.getClass(), "compiler", null);
        setField(term302, term302.getClass(), "injector", null);
        setBooleanField(term302, term302.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term302, term302.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term302, term302.getClass(), "inlineLocalFunctions", false);
        setField(term302, term302.getClass(), "specializationState", null);
        term333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term346 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term356 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term333, term333.getClass(), "type", 1114000454);
        setIntField(term335, term335.getClass(), "type", -505439934);
        setIntField(term337, term337.getClass(), "type", 0);
        setField(term337, term337.getClass(), "next", null);
        setField(term337, term337.getClass(), "first", null);
        setField(term337, term337.getClass(), "last", null);
        setField(term337, term337.getClass(), "propListHead", null);
        setIntField(term337, term337.getClass(), "sourcePosition", 0);
        setField(term337, term337.getClass(), "jsType", null);
        setField(term337, term337.getClass(), "parent", null);
        setField(term335, term335.getClass(), "next", term337);
        setIntField(term340, term340.getClass(), "type", 0);
        setField(term340, term340.getClass(), "next", null);
        setField(term340, term340.getClass(), "first", null);
        setField(term340, term340.getClass(), "last", null);
        setField(term340, term340.getClass(), "propListHead", null);
        setIntField(term340, term340.getClass(), "sourcePosition", 0);
        setField(term340, term340.getClass(), "jsType", null);
        setField(term340, term340.getClass(), "parent", null);
        setField(term335, term335.getClass(), "first", term340);
        setIntField(term343, term343.getClass(), "type", 0);
        setField(term343, term343.getClass(), "next", null);
        setField(term343, term343.getClass(), "first", null);
        setField(term343, term343.getClass(), "last", null);
        setField(term343, term343.getClass(), "propListHead", null);
        setIntField(term343, term343.getClass(), "sourcePosition", 0);
        setField(term343, term343.getClass(), "jsType", null);
        setField(term343, term343.getClass(), "parent", null);
        setField(term335, term335.getClass(), "last", term343);
        setField(term346, term346.getClass(), "next", null);
        setIntField(term346, term346.getClass(), "type", 0);
        setIntField(term346, term346.getClass(), "intValue", 0);
        setField(term346, term346.getClass(), "objectValue", null);
        setField(term335, term335.getClass(), "propListHead", term346);
        setIntField(term335, term335.getClass(), "sourcePosition", 444029505);
        setField(term335, term335.getClass(), "jsType", null);
        setField(term335, term335.getClass(), "parent", null);
        setField(term333, term333.getClass(), "next", term335);
        setIntField(term350, term350.getClass(), "type", 0);
        setField(term350, term350.getClass(), "next", null);
        setField(term350, term350.getClass(), "first", null);
        setField(term350, term350.getClass(), "last", null);
        setField(term350, term350.getClass(), "propListHead", null);
        setIntField(term350, term350.getClass(), "sourcePosition", 0);
        setField(term350, term350.getClass(), "jsType", null);
        setField(term350, term350.getClass(), "parent", null);
        setField(term333, term333.getClass(), "first", term350);
        setIntField(term353, term353.getClass(), "type", 0);
        setField(term353, term353.getClass(), "next", null);
        setField(term353, term353.getClass(), "first", null);
        setField(term353, term353.getClass(), "last", null);
        setField(term353, term353.getClass(), "propListHead", null);
        setIntField(term353, term353.getClass(), "sourcePosition", 0);
        setField(term353, term353.getClass(), "jsType", null);
        setField(term353, term353.getClass(), "parent", null);
        setField(term333, term333.getClass(), "last", term353);
        setField(term356, term356.getClass(), "next", null);
        setIntField(term356, term356.getClass(), "type", 0);
        setIntField(term356, term356.getClass(), "intValue", 0);
        setField(term356, term356.getClass(), "objectValue", null);
        setField(term333, term333.getClass(), "propListHead", term356);
        setIntField(term333, term333.getClass(), "sourcePosition", -1034506028);
        setField(term333, term333.getClass(), "jsType", null);
        setField(term333, term333.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term333;
        try {
            callMethod(klass, "hasLocalNames", argTypes, term302, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


