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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196237;
     Object term196329;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196237 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term196329 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term196421 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term196513 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term196513, term196513.getClass(), "type", 39);
        setDoubleField(term196513, term196513.getClass(), "number", -4.490080994501591E18);
        setField(term196421, term196421.getClass(), "next", term196513);
        setIntField(term196421, term196421.getClass(), "type", 63);
        setField(term196329, term196329.getClass(), "first", term196421);
        setIntField(term196329, term196329.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term196329;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term196237, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


