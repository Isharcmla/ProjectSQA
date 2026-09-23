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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term726706;
     Object term726798;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term726706 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term726798 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term726868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726960 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term726960, term726960.getClass(), "type", 44);
        setField(term726868, term726868.getClass(), "next", term726960);
        setIntField(term726868, term726868.getClass(), "type", 0);
        setField(term726798, term726798.getClass(), "first", term726868);
        setIntField(term726798, term726798.getClass(), "type", 101);
        setField(term726798, term726798.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term726798;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term726706, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


