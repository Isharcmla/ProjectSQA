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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term776589;
     Object term776681;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term776589 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term776681 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term776773 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term776865 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term776957 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term776865, term776865.getClass(), "type", 63);
        setField(term776773, term776773.getClass(), "next", term776865);
        setIntField(term776773, term776773.getClass(), "type", 0);
        setField(term776681, term776681.getClass(), "first", term776773);
        setIntField(term776681, term776681.getClass(), "type", 101);
        setIntField(term776957, term776957.getClass(), "type", 114);
        setField(term776681, term776681.getClass(), "parent", term776957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term776681;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term776589, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


