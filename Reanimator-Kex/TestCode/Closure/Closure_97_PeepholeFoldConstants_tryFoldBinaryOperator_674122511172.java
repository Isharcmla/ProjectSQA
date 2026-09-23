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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33088;
     Object term33158;
     Object term33227;
     Object term33228;
     Object term33197;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33088 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term33158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term33158, term33158.getClass(), "first", term33158);
        setField(term33158, term33158.getClass(), "next", term33158);
        setIntField(term33158, term33158.getClass(), "type", 21);
        term33227 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term33227, term33227.getClass(), "currentTraversal", null);
        term33228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33228, term33228.getClass(), "type", 21);
        setField(term33228, term33228.getClass(), "next", term33228);
        setField(term33228, term33228.getClass(), "first", term33228);
        setField(term33228, term33228.getClass(), "last", null);
        setField(term33228, term33228.getClass(), "propListHead", null);
        setIntField(term33228, term33228.getClass(), "sourcePosition", 0);
        setField(term33228, term33228.getClass(), "jsType", null);
        setField(term33228, term33228.getClass(), "parent", null);
        term33197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33197, term33197.getClass(), "type", 21);
        setField(term33197, term33197.getClass(), "next", term33197);
        setField(term33197, term33197.getClass(), "first", term33197);
        setField(term33197, term33197.getClass(), "last", null);
        setField(term33197, term33197.getClass(), "propListHead", null);
        setIntField(term33197, term33197.getClass(), "sourcePosition", 0);
        setField(term33197, term33197.getClass(), "jsType", null);
        setField(term33197, term33197.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term33158;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term33088, args);
        assertTrue(recursiveEquals(term33088, term33227));
        assertTrue(recursiveEquals(term33158, term33228));
        assertTrue(recursiveEquals(retValue, term33197));
    }

};


