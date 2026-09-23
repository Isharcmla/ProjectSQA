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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199492;
     Object term199584;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199492 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term199584 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term199676 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term199768 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term199768, term199768.getClass(), "type", 39);
        setField(term199676, term199676.getClass(), "next", term199768);
        setIntField(term199676, term199676.getClass(), "type", 39);
        setField(term199584, term199584.getClass(), "first", term199676);
        setIntField(term199584, term199584.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term199584;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term199492, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


