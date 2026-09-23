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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51521;
     Object term51591;
     Object term79261;
     Object term79262;
     Object term79242;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51521 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term51591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term51591, term51591.getClass(), "first", term51591);
        setField(term51591, term51591.getClass(), "next", term51591);
        setIntField(term51591, term51591.getClass(), "type", 35);
        term79261 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term79261, term79261.getClass(), "currentTraversal", null);
        term79262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79262, term79262.getClass(), "type", 35);
        setField(term79262, term79262.getClass(), "next", term79262);
        setField(term79262, term79262.getClass(), "first", term79262);
        setField(term79262, term79262.getClass(), "last", null);
        setField(term79262, term79262.getClass(), "propListHead", null);
        setIntField(term79262, term79262.getClass(), "sourcePosition", 0);
        setField(term79262, term79262.getClass(), "jsType", null);
        setField(term79262, term79262.getClass(), "parent", null);
        term79242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79242, term79242.getClass(), "type", 35);
        setField(term79242, term79242.getClass(), "next", term79242);
        setField(term79242, term79242.getClass(), "first", term79242);
        setField(term79242, term79242.getClass(), "last", null);
        setField(term79242, term79242.getClass(), "propListHead", null);
        setIntField(term79242, term79242.getClass(), "sourcePosition", 0);
        setField(term79242, term79242.getClass(), "jsType", null);
        setField(term79242, term79242.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term51591;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term51521, args);
        assertTrue(recursiveEquals(term51521, term79261));
        assertTrue(recursiveEquals(term51591, term79262));
        assertTrue(recursiveEquals(retValue, term79242));
    }

};


