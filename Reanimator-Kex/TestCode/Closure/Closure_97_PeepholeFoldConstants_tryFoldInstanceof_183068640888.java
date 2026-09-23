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

public class PeepholeFoldConstants_tryFoldInstanceof_183068640888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16046;
     Object term16151;
     Object term16165;
     Object term16166;
     Object term16167;
     Object term16153;

    public PeepholeFoldConstants_tryFoldInstanceof_183068640888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16046 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term16151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16151, term16151.getClass(), "type", 52);
        term16165 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term16165, term16165.getClass(), "currentTraversal", null);
        term16166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16166, term16166.getClass(), "type", 52);
        setField(term16166, term16166.getClass(), "next", null);
        setField(term16166, term16166.getClass(), "first", null);
        setField(term16166, term16166.getClass(), "last", null);
        setField(term16166, term16166.getClass(), "propListHead", null);
        setIntField(term16166, term16166.getClass(), "sourcePosition", 0);
        setField(term16166, term16166.getClass(), "jsType", null);
        setField(term16166, term16166.getClass(), "parent", null);
        term16167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16167, term16167.getClass(), "type", 52);
        setField(term16167, term16167.getClass(), "next", null);
        setField(term16167, term16167.getClass(), "first", null);
        setField(term16167, term16167.getClass(), "last", null);
        setField(term16167, term16167.getClass(), "propListHead", null);
        setIntField(term16167, term16167.getClass(), "sourcePosition", 0);
        setField(term16167, term16167.getClass(), "jsType", null);
        setField(term16167, term16167.getClass(), "parent", null);
        term16153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16153, term16153.getClass(), "type", 52);
        setField(term16153, term16153.getClass(), "next", null);
        setField(term16153, term16153.getClass(), "first", null);
        setField(term16153, term16153.getClass(), "last", null);
        setField(term16153, term16153.getClass(), "propListHead", null);
        setIntField(term16153, term16153.getClass(), "sourcePosition", 0);
        setField(term16153, term16153.getClass(), "jsType", null);
        setField(term16153, term16153.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term16151;
        args[1] = term16151;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term16046, args);
        assertTrue(recursiveEquals(term16046, term16165));
        assertTrue(recursiveEquals(term16151, term16166));
        assertTrue(recursiveEquals(term16151, term16167));
        assertTrue(recursiveEquals(retValue, term16153));
    }

};


