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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297076;
     Object term297168;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297076 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term297168 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term297260 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term297168, term297168.getClass(), "first", term297168);
        setIntField(term297260, term297260.getClass(), "type", 40);
        setField(term297168, term297168.getClass(), "next", term297260);
        setIntField(term297168, term297168.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term297168;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term297076, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


