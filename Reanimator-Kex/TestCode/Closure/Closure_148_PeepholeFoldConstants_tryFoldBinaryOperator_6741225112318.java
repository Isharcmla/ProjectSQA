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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term640191;
     Object term640283;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term640191 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term640283 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term640375 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term640467 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term640559 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term640375, term640375.getClass(), "next", term640467);
        setIntField(term640375, term640375.getClass(), "type", 63);
        setField(term640283, term640283.getClass(), "first", term640375);
        setIntField(term640283, term640283.getClass(), "type", 101);
        setField(term640283, term640283.getClass(), "parent", term640559);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term640283;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term640191, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


