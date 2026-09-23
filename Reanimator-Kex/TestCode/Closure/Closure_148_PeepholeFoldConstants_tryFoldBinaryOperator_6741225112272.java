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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624794;
     Object term624886;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term624794 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term624886 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term624978 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term625070 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term625162 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term624978, term624978.getClass(), "next", term625070);
        setIntField(term624978, term624978.getClass(), "type", 44);
        setField(term624886, term624886.getClass(), "first", term624978);
        setIntField(term624886, term624886.getClass(), "type", 101);
        setField(term624886, term624886.getClass(), "parent", term625162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term624886;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term624794, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


