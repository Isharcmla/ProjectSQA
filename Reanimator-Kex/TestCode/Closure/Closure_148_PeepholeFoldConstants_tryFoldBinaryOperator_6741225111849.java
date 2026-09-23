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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term485104;
     Object term485190;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term485104 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term485190 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term485276 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term485362 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term485454 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term485362, term485362.getClass(), "type", 63);
        setField(term485276, term485276.getClass(), "next", term485362);
        setIntField(term485276, term485276.getClass(), "type", 0);
        setField(term485190, term485190.getClass(), "first", term485276);
        setIntField(term485190, term485190.getClass(), "type", 101);
        setIntField(term485454, term485454.getClass(), "type", 114);
        setField(term485190, term485190.getClass(), "parent", term485454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term485190;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term485104, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


