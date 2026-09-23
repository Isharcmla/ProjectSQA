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
import java.lang.Integer;

public class CodeGenerator_getNonEmptyChildCount_147325746228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7626;
     Object term7653;

    public CodeGenerator_getNonEmptyChildCount_147325746228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7626, term7626.getClass(), "type", 9726679);
        setIntField(term7628, term7628.getClass(), "type", -25637976);
        setIntField(term7630, term7630.getClass(), "type", 1555897383);
        setIntField(term7632, term7632.getClass(), "type", 202001407);
        setIntField(term7634, term7634.getClass(), "type", 158873461);
        setField(term7634, term7634.getClass(), "next", null);
        setField(term7634, term7634.getClass(), "first", null);
        setField(term7634, term7634.getClass(), "last", null);
        setField(term7634, term7634.getClass(), "propListHead", null);
        setIntField(term7634, term7634.getClass(), "sourcePosition", 0);
        setField(term7634, term7634.getClass(), "jsType", null);
        setField(term7634, term7634.getClass(), "parent", null);
        setField(term7632, term7632.getClass(), "next", term7634);
        setIntField(term7637, term7637.getClass(), "type", -430151637);
        setField(term7637, term7637.getClass(), "next", null);
        setField(term7637, term7637.getClass(), "first", null);
        setField(term7637, term7637.getClass(), "last", term7634);
        setField(term7637, term7637.getClass(), "propListHead", null);
        setIntField(term7637, term7637.getClass(), "sourcePosition", 0);
        setField(term7637, term7637.getClass(), "jsType", null);
        setField(term7637, term7637.getClass(), "parent", null);
        setField(term7632, term7632.getClass(), "first", term7637);
        setField(term7632, term7632.getClass(), "last", term7630);
        setField(term7632, term7632.getClass(), "propListHead", null);
        setIntField(term7632, term7632.getClass(), "sourcePosition", 0);
        setField(term7632, term7632.getClass(), "jsType", null);
        setField(term7632, term7632.getClass(), "parent", null);
        setField(term7630, term7630.getClass(), "next", term7632);
        setField(term7630, term7630.getClass(), "first", term7634);
        setIntField(term7641, term7641.getClass(), "type", 98922530);
        setIntField(term7643, term7643.getClass(), "type", -1388471422);
        setField(term7643, term7643.getClass(), "next", null);
        setField(term7643, term7643.getClass(), "first", term7637);
        setField(term7643, term7643.getClass(), "last", term7632);
        setField(term7643, term7643.getClass(), "propListHead", null);
        setIntField(term7643, term7643.getClass(), "sourcePosition", 0);
        setField(term7643, term7643.getClass(), "jsType", null);
        setField(term7643, term7643.getClass(), "parent", null);
        setField(term7641, term7641.getClass(), "next", term7643);
        setField(term7641, term7641.getClass(), "first", term7628);
        setField(term7641, term7641.getClass(), "last", term7628);
        setField(term7641, term7641.getClass(), "propListHead", null);
        setIntField(term7641, term7641.getClass(), "sourcePosition", 0);
        setField(term7641, term7641.getClass(), "jsType", null);
        setField(term7641, term7641.getClass(), "parent", null);
        setField(term7630, term7630.getClass(), "last", term7641);
        setField(term7630, term7630.getClass(), "propListHead", null);
        setIntField(term7630, term7630.getClass(), "sourcePosition", 0);
        setField(term7630, term7630.getClass(), "jsType", null);
        setField(term7630, term7630.getClass(), "parent", null);
        setField(term7628, term7628.getClass(), "next", term7630);
        setIntField(term7648, term7648.getClass(), "type", -1498296052);
        setField(term7648, term7648.getClass(), "next", term7641);
        setField(term7648, term7648.getClass(), "first", term7643);
        setField(term7648, term7648.getClass(), "last", term7626);
        setField(term7648, term7648.getClass(), "propListHead", null);
        setIntField(term7648, term7648.getClass(), "sourcePosition", 0);
        setField(term7648, term7648.getClass(), "jsType", null);
        setField(term7648, term7648.getClass(), "parent", null);
        setField(term7628, term7628.getClass(), "first", term7648);
        setField(term7628, term7628.getClass(), "last", term7648);
        setField(term7628, term7628.getClass(), "propListHead", null);
        setIntField(term7628, term7628.getClass(), "sourcePosition", 0);
        setField(term7628, term7628.getClass(), "jsType", null);
        setField(term7628, term7628.getClass(), "parent", null);
        setField(term7626, term7626.getClass(), "next", term7628);
        setField(term7626, term7626.getClass(), "first", term7632);
        setField(term7626, term7626.getClass(), "last", term7634);
        setField(term7626, term7626.getClass(), "propListHead", null);
        setIntField(term7626, term7626.getClass(), "sourcePosition", 0);
        setField(term7626, term7626.getClass(), "jsType", null);
        setField(term7626, term7626.getClass(), "parent", null);
        term7653 = new Integer(2098647989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term7626;
        args[1] = term7653;
        callMethod(klass, "getNonEmptyChildCount", argTypes, null, args);
    }

};


