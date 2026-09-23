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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45561;
     Object term45631;
     Object term45692;
     Object term45693;
     Object term45673;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45561 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term45631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term45631, term45631.getClass(), "first", term45631);
        setField(term45631, term45631.getClass(), "next", term45631);
        setIntField(term45631, term45631.getClass(), "type", 22);
        term45692 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term45692, term45692.getClass(), "currentTraversal", null);
        term45693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45693, term45693.getClass(), "type", 22);
        setField(term45693, term45693.getClass(), "next", term45693);
        setField(term45693, term45693.getClass(), "first", term45693);
        setField(term45693, term45693.getClass(), "last", null);
        setField(term45693, term45693.getClass(), "propListHead", null);
        setIntField(term45693, term45693.getClass(), "sourcePosition", 0);
        setField(term45693, term45693.getClass(), "jsType", null);
        setField(term45693, term45693.getClass(), "parent", null);
        term45673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45673, term45673.getClass(), "type", 22);
        setField(term45673, term45673.getClass(), "next", term45673);
        setField(term45673, term45673.getClass(), "first", term45673);
        setField(term45673, term45673.getClass(), "last", null);
        setField(term45673, term45673.getClass(), "propListHead", null);
        setIntField(term45673, term45673.getClass(), "sourcePosition", 0);
        setField(term45673, term45673.getClass(), "jsType", null);
        setField(term45673, term45673.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term45631;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term45561, args);
        assertTrue(recursiveEquals(term45561, term45692));
        assertTrue(recursiveEquals(term45631, term45693));
        assertTrue(recursiveEquals(retValue, term45673));
    }

};


