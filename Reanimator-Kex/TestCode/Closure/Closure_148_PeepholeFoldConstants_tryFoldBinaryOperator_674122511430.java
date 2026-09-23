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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87693;
     Object term87763;
     Object term88194;
     Object term88195;
     Object term88179;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87693 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term87763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term87763, term87763.getClass(), "first", term87763);
        setField(term87763, term87763.getClass(), "next", term87763);
        setIntField(term87763, term87763.getClass(), "type", 19);
        term88194 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term88194, term88194.getClass(), "currentTraversal", null);
        term88195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88195, term88195.getClass(), "type", 19);
        setField(term88195, term88195.getClass(), "next", term88195);
        setField(term88195, term88195.getClass(), "first", term88195);
        setField(term88195, term88195.getClass(), "last", null);
        setField(term88195, term88195.getClass(), "propListHead", null);
        setIntField(term88195, term88195.getClass(), "sourcePosition", 0);
        setField(term88195, term88195.getClass(), "jsType", null);
        setField(term88195, term88195.getClass(), "parent", null);
        term88179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88179, term88179.getClass(), "type", 19);
        setField(term88179, term88179.getClass(), "next", term88179);
        setField(term88179, term88179.getClass(), "first", term88179);
        setField(term88179, term88179.getClass(), "last", null);
        setField(term88179, term88179.getClass(), "propListHead", null);
        setIntField(term88179, term88179.getClass(), "sourcePosition", 0);
        setField(term88179, term88179.getClass(), "jsType", null);
        setField(term88179, term88179.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term87763;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term87693, args);
        assertTrue(recursiveEquals(term87693, term88194));
        assertTrue(recursiveEquals(term87763, term88195));
        assertTrue(recursiveEquals(retValue, term88179));
    }

};


