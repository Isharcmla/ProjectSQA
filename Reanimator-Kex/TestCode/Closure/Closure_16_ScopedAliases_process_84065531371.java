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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ScopedAliases_process_84065531371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41612;
     Object term41682;
     Object term42241;
     Object term42242;

    public ScopedAliases_process_84065531371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41612 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term41612, term41612.getClass(), "compiler", null);
        term41682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41682, term41682.getClass(), "type", 0);
        setIntField(term41752, term41752.getClass(), "type", 0);
        setField(term41752, term41752.getClass(), "parent", null);
        setField(term41682, term41682.getClass(), "parent", term41752);
        setField(term41682, term41682.getClass(), "first", term41822);
        term42241 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term42241, term42241.getClass(), "compiler", null);
        setField(term42241, term42241.getClass(), "preprocessorSymbolTable", null);
        setField(term42241, term42241.getClass(), "transformationHandler", null);
        term42242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42242, term42242.getClass(), "type", 0);
        setField(term42242, term42242.getClass(), "next", null);
        setIntField(term42243, term42243.getClass(), "type", 0);
        setField(term42243, term42243.getClass(), "next", null);
        setField(term42243, term42243.getClass(), "first", null);
        setField(term42243, term42243.getClass(), "last", null);
        setField(term42243, term42243.getClass(), "propListHead", null);
        setIntField(term42243, term42243.getClass(), "sourcePosition", 0);
        setField(term42243, term42243.getClass(), "jsType", null);
        setField(term42243, term42243.getClass(), "parent", null);
        setField(term42242, term42242.getClass(), "first", term42243);
        setField(term42242, term42242.getClass(), "last", null);
        setField(term42242, term42242.getClass(), "propListHead", null);
        setIntField(term42242, term42242.getClass(), "sourcePosition", 0);
        setField(term42242, term42242.getClass(), "jsType", null);
        setIntField(term42244, term42244.getClass(), "type", 0);
        setField(term42244, term42244.getClass(), "next", null);
        setField(term42244, term42244.getClass(), "first", null);
        setField(term42244, term42244.getClass(), "last", null);
        setField(term42244, term42244.getClass(), "propListHead", null);
        setIntField(term42244, term42244.getClass(), "sourcePosition", 0);
        setField(term42244, term42244.getClass(), "jsType", null);
        setField(term42244, term42244.getClass(), "parent", null);
        setField(term42242, term42242.getClass(), "parent", term42244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term41682;
        callMethod(klass, "process", argTypes, term41612, args);
        assertTrue(recursiveEquals(term41612, term42241));
        assertTrue(recursiveEquals(term41682, null));
    }

};


