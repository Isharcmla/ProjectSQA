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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42516;
     Object term42586;
     Object term42628;
     Object term42629;
     Object term42609;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42516 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term42586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42586, term42586.getClass(), "first", term42586);
        setField(term42586, term42586.getClass(), "next", term42586);
        setIntField(term42586, term42586.getClass(), "type", 24);
        term42628 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term42628, term42628.getClass(), "currentTraversal", null);
        term42629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42629, term42629.getClass(), "type", 24);
        setField(term42629, term42629.getClass(), "next", term42629);
        setField(term42629, term42629.getClass(), "first", term42629);
        setField(term42629, term42629.getClass(), "last", null);
        setField(term42629, term42629.getClass(), "propListHead", null);
        setIntField(term42629, term42629.getClass(), "sourcePosition", 0);
        setField(term42629, term42629.getClass(), "jsType", null);
        setField(term42629, term42629.getClass(), "parent", null);
        term42609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42609, term42609.getClass(), "type", 24);
        setField(term42609, term42609.getClass(), "next", term42609);
        setField(term42609, term42609.getClass(), "first", term42609);
        setField(term42609, term42609.getClass(), "last", null);
        setField(term42609, term42609.getClass(), "propListHead", null);
        setIntField(term42609, term42609.getClass(), "sourcePosition", 0);
        setField(term42609, term42609.getClass(), "jsType", null);
        setField(term42609, term42609.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42586;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term42516, args);
        assertTrue(recursiveEquals(term42516, term42628));
        assertTrue(recursiveEquals(term42586, term42629));
        assertTrue(recursiveEquals(retValue, term42609));
    }

};


