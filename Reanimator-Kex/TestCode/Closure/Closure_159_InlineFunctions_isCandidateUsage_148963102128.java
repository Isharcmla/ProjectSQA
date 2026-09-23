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

public class InlineFunctions_isCandidateUsage_148963102128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474;

    public InlineFunctions_isCandidateUsage_148963102128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term487 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term497 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term474, term474.getClass(), "type", -1963434938);
        setIntField(term476, term476.getClass(), "type", 1072005683);
        setIntField(term478, term478.getClass(), "type", 0);
        setField(term478, term478.getClass(), "next", null);
        setField(term478, term478.getClass(), "first", null);
        setField(term478, term478.getClass(), "last", null);
        setField(term478, term478.getClass(), "propListHead", null);
        setIntField(term478, term478.getClass(), "sourcePosition", 0);
        setField(term478, term478.getClass(), "jsType", null);
        setField(term478, term478.getClass(), "parent", null);
        setField(term476, term476.getClass(), "next", term478);
        setIntField(term481, term481.getClass(), "type", 0);
        setField(term481, term481.getClass(), "next", null);
        setField(term481, term481.getClass(), "first", null);
        setField(term481, term481.getClass(), "last", null);
        setField(term481, term481.getClass(), "propListHead", null);
        setIntField(term481, term481.getClass(), "sourcePosition", 0);
        setField(term481, term481.getClass(), "jsType", null);
        setField(term481, term481.getClass(), "parent", null);
        setField(term476, term476.getClass(), "first", term481);
        setIntField(term484, term484.getClass(), "type", 0);
        setField(term484, term484.getClass(), "next", null);
        setField(term484, term484.getClass(), "first", null);
        setField(term484, term484.getClass(), "last", null);
        setField(term484, term484.getClass(), "propListHead", null);
        setIntField(term484, term484.getClass(), "sourcePosition", 0);
        setField(term484, term484.getClass(), "jsType", null);
        setField(term484, term484.getClass(), "parent", null);
        setField(term476, term476.getClass(), "last", term484);
        setField(term487, term487.getClass(), "next", null);
        setIntField(term487, term487.getClass(), "type", 0);
        setIntField(term487, term487.getClass(), "intValue", 0);
        setField(term487, term487.getClass(), "objectValue", null);
        setField(term476, term476.getClass(), "propListHead", term487);
        setIntField(term476, term476.getClass(), "sourcePosition", 568954359);
        setField(term476, term476.getClass(), "jsType", null);
        setField(term476, term476.getClass(), "parent", null);
        setField(term474, term474.getClass(), "next", term476);
        setIntField(term491, term491.getClass(), "type", 0);
        setField(term491, term491.getClass(), "next", null);
        setField(term491, term491.getClass(), "first", null);
        setField(term491, term491.getClass(), "last", null);
        setField(term491, term491.getClass(), "propListHead", null);
        setIntField(term491, term491.getClass(), "sourcePosition", 0);
        setField(term491, term491.getClass(), "jsType", null);
        setField(term491, term491.getClass(), "parent", null);
        setField(term474, term474.getClass(), "first", term491);
        setIntField(term494, term494.getClass(), "type", 0);
        setField(term494, term494.getClass(), "next", null);
        setField(term494, term494.getClass(), "first", null);
        setField(term494, term494.getClass(), "last", null);
        setField(term494, term494.getClass(), "propListHead", null);
        setIntField(term494, term494.getClass(), "sourcePosition", 0);
        setField(term494, term494.getClass(), "jsType", null);
        setField(term494, term494.getClass(), "parent", null);
        setField(term474, term474.getClass(), "last", term494);
        setField(term497, term497.getClass(), "next", null);
        setIntField(term497, term497.getClass(), "type", 0);
        setIntField(term497, term497.getClass(), "intValue", 0);
        setField(term497, term497.getClass(), "objectValue", null);
        setField(term474, term474.getClass(), "propListHead", term497);
        setIntField(term474, term474.getClass(), "sourcePosition", 53410913);
        setField(term474, term474.getClass(), "jsType", null);
        setField(term474, term474.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term474;
        try {
            callMethod(klass, "isCandidateUsage", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


