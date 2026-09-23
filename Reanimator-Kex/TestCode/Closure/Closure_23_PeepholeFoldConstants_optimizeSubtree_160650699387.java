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

public class PeepholeFoldConstants_optimizeSubtree_160650699387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10383;
     Object term10453;
     Object term11430;
     Object term11431;
     Object term11420;

    public PeepholeFoldConstants_optimizeSubtree_160650699387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10383 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term10453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10453, term10453.getClass(), "type", 69);
        term11430 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term11430, term11430.getClass(), "late", false);
        setField(term11430, term11430.getClass(), "compiler", null);
        term11431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11431, term11431.getClass(), "type", 69);
        setField(term11431, term11431.getClass(), "next", null);
        setField(term11431, term11431.getClass(), "first", null);
        setField(term11431, term11431.getClass(), "last", null);
        setField(term11431, term11431.getClass(), "propListHead", null);
        setIntField(term11431, term11431.getClass(), "sourcePosition", 0);
        setField(term11431, term11431.getClass(), "jsType", null);
        setField(term11431, term11431.getClass(), "parent", null);
        term11420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11420, term11420.getClass(), "type", 69);
        setField(term11420, term11420.getClass(), "next", null);
        setField(term11420, term11420.getClass(), "first", null);
        setField(term11420, term11420.getClass(), "last", null);
        setField(term11420, term11420.getClass(), "propListHead", null);
        setIntField(term11420, term11420.getClass(), "sourcePosition", 0);
        setField(term11420, term11420.getClass(), "jsType", null);
        setField(term11420, term11420.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10453;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term10383, args);
        assertTrue(recursiveEquals(term10383, term11430));
        assertTrue(recursiveEquals(term10453, term11431));
        assertTrue(recursiveEquals(retValue, term11420));
    }

};


