package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class IR_arraylit_1255594251003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160055;
     Object term160482;
     Object term160449;

    public IR_arraylit_1255594251003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160055 = (Object[]) newArray("com.google.javascript.rhino.Node", 1);
        Object term160164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term160164, term160164.getClass(), "type", 20);
        setField(term160164, term160164.getClass(), "parent", null);
        setField(term160164, term160164.getClass(), "next", null);
        setElement(term160055, 0, term160164);
        term160482 = (Object[]) newArray("com.google.javascript.rhino.Node", 1);
        Object term160483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term160484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term160483, term160483.getClass(), "type", 20);
        setField(term160483, term160483.getClass(), "next", null);
        setField(term160483, term160483.getClass(), "first", null);
        setField(term160483, term160483.getClass(), "last", null);
        setField(term160483, term160483.getClass(), "propListHead", null);
        setIntField(term160483, term160483.getClass(), "sourcePosition", 0);
        setField(term160483, term160483.getClass(), "jsType", null);
        setIntField(term160484, term160484.getClass(), "type", 63);
        setField(term160484, term160484.getClass(), "next", null);
        setField(term160484, term160484.getClass(), "first", term160483);
        setField(term160484, term160484.getClass(), "last", term160483);
        setField(term160484, term160484.getClass(), "propListHead", null);
        setIntField(term160484, term160484.getClass(), "sourcePosition", -1);
        setField(term160484, term160484.getClass(), "jsType", null);
        setField(term160484, term160484.getClass(), "parent", null);
        setField(term160483, term160483.getClass(), "parent", term160484);
        setElement(term160482, 0, term160483);
        term160449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term160451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term160449, term160449.getClass(), "type", 63);
        setField(term160449, term160449.getClass(), "next", null);
        setIntField(term160451, term160451.getClass(), "type", 20);
        setField(term160451, term160451.getClass(), "next", null);
        setField(term160451, term160451.getClass(), "first", null);
        setField(term160451, term160451.getClass(), "last", null);
        setField(term160451, term160451.getClass(), "propListHead", null);
        setIntField(term160451, term160451.getClass(), "sourcePosition", 0);
        setField(term160451, term160451.getClass(), "jsType", null);
        setField(term160451, term160451.getClass(), "parent", term160449);
        setField(term160449, term160449.getClass(), "first", term160451);
        setField(term160449, term160449.getClass(), "last", term160451);
        setField(term160449, term160449.getClass(), "propListHead", null);
        setIntField(term160449, term160449.getClass(), "sourcePosition", -1);
        setField(term160449, term160449.getClass(), "jsType", null);
        setField(term160449, term160449.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term160055;
        Object retValue = callMethod(klass, "arraylit", argTypes, null, args);
        assertTrue(recursiveEquals(term160055, term160482));
        assertTrue(recursiveEquals(retValue, term160449));
    }

};


