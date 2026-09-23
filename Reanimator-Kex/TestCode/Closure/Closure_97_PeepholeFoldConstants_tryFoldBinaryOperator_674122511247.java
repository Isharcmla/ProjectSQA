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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49032;
     Object term49102;
     Object term49484;
     Object term49485;
     Object term49462;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49032 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term49102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49102, term49102.getClass(), "first", term49102);
        setField(term49102, term49102.getClass(), "next", term49102);
        setIntField(term49102, term49102.getClass(), "type", 17);
        term49484 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term49484, term49484.getClass(), "currentTraversal", null);
        term49485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49485, term49485.getClass(), "type", 17);
        setField(term49485, term49485.getClass(), "next", term49485);
        setField(term49485, term49485.getClass(), "first", term49485);
        setField(term49485, term49485.getClass(), "last", null);
        setField(term49485, term49485.getClass(), "propListHead", null);
        setIntField(term49485, term49485.getClass(), "sourcePosition", 0);
        setField(term49485, term49485.getClass(), "jsType", null);
        setField(term49485, term49485.getClass(), "parent", null);
        term49462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49462, term49462.getClass(), "type", 17);
        setField(term49462, term49462.getClass(), "next", term49462);
        setField(term49462, term49462.getClass(), "first", term49462);
        setField(term49462, term49462.getClass(), "last", null);
        setField(term49462, term49462.getClass(), "propListHead", null);
        setIntField(term49462, term49462.getClass(), "sourcePosition", 0);
        setField(term49462, term49462.getClass(), "jsType", null);
        setField(term49462, term49462.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term49102;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term49032, args);
        assertTrue(recursiveEquals(term49032, term49484));
        assertTrue(recursiveEquals(term49102, term49485));
        assertTrue(recursiveEquals(retValue, term49462));
    }

};


