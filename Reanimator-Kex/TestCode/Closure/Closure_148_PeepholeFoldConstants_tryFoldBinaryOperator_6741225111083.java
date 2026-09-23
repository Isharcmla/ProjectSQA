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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253880;
     Object term253972;
     Object term254605;
     Object term254606;
     Object term254561;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253880 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term253972 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term254064 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term254156 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term254064, term254064.getClass(), "next", term254156);
        setIntField(term254064, term254064.getClass(), "type", 14);
        setField(term253972, term253972.getClass(), "first", term254064);
        setIntField(term253972, term253972.getClass(), "type", 14);
        term254605 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term254605, term254605.getClass(), "currentTraversal", null);
        term254606 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term254607 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term254608 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term254606, term254606.getClass(), "str", null);
        setIntField(term254606, term254606.getClass(), "type", 14);
        setField(term254606, term254606.getClass(), "next", null);
        setField(term254607, term254607.getClass(), "str", null);
        setIntField(term254607, term254607.getClass(), "type", 14);
        setField(term254608, term254608.getClass(), "str", null);
        setIntField(term254608, term254608.getClass(), "type", 0);
        setField(term254608, term254608.getClass(), "next", null);
        setField(term254608, term254608.getClass(), "first", null);
        setField(term254608, term254608.getClass(), "last", null);
        setField(term254608, term254608.getClass(), "propListHead", null);
        setIntField(term254608, term254608.getClass(), "sourcePosition", 0);
        setField(term254608, term254608.getClass(), "jsType", null);
        setField(term254608, term254608.getClass(), "parent", null);
        setField(term254607, term254607.getClass(), "next", term254608);
        setField(term254607, term254607.getClass(), "first", null);
        setField(term254607, term254607.getClass(), "last", null);
        setField(term254607, term254607.getClass(), "propListHead", null);
        setIntField(term254607, term254607.getClass(), "sourcePosition", 0);
        setField(term254607, term254607.getClass(), "jsType", null);
        setField(term254607, term254607.getClass(), "parent", null);
        setField(term254606, term254606.getClass(), "first", term254607);
        setField(term254606, term254606.getClass(), "last", null);
        setField(term254606, term254606.getClass(), "propListHead", null);
        setIntField(term254606, term254606.getClass(), "sourcePosition", 0);
        setField(term254606, term254606.getClass(), "jsType", null);
        setField(term254606, term254606.getClass(), "parent", null);
        term254561 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term254563 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term254565 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term254561, term254561.getClass(), "str", null);
        setIntField(term254561, term254561.getClass(), "type", 14);
        setField(term254561, term254561.getClass(), "next", null);
        setField(term254563, term254563.getClass(), "str", null);
        setIntField(term254563, term254563.getClass(), "type", 14);
        setField(term254565, term254565.getClass(), "str", null);
        setIntField(term254565, term254565.getClass(), "type", 0);
        setField(term254565, term254565.getClass(), "next", null);
        setField(term254565, term254565.getClass(), "first", null);
        setField(term254565, term254565.getClass(), "last", null);
        setField(term254565, term254565.getClass(), "propListHead", null);
        setIntField(term254565, term254565.getClass(), "sourcePosition", 0);
        setField(term254565, term254565.getClass(), "jsType", null);
        setField(term254565, term254565.getClass(), "parent", null);
        setField(term254563, term254563.getClass(), "next", term254565);
        setField(term254563, term254563.getClass(), "first", null);
        setField(term254563, term254563.getClass(), "last", null);
        setField(term254563, term254563.getClass(), "propListHead", null);
        setIntField(term254563, term254563.getClass(), "sourcePosition", 0);
        setField(term254563, term254563.getClass(), "jsType", null);
        setField(term254563, term254563.getClass(), "parent", null);
        setField(term254561, term254561.getClass(), "first", term254563);
        setField(term254561, term254561.getClass(), "last", null);
        setField(term254561, term254561.getClass(), "propListHead", null);
        setIntField(term254561, term254561.getClass(), "sourcePosition", 0);
        setField(term254561, term254561.getClass(), "jsType", null);
        setField(term254561, term254561.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term253972;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term253880, args);
        assertTrue(recursiveEquals(term253880, term254605));
        assertTrue(recursiveEquals(term253972, term254606));
        assertTrue(recursiveEquals(retValue, term254561));
    }

};


