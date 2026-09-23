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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419224;
     Object term419316;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term419224 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term419316 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term419408 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term419500 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term419500, term419500.getClass(), "type", 44);
        setField(term419408, term419408.getClass(), "next", term419500);
        setIntField(term419408, term419408.getClass(), "type", 0);
        setField(term419316, term419316.getClass(), "first", term419408);
        setIntField(term419316, term419316.getClass(), "type", 101);
        setField(term419316, term419316.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term419316;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term419224, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


