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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332464;
     Object term332550;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332464 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term332550 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term332636 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term332722 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term332722, term332722.getClass(), "type", 40);
        setField(term332636, term332636.getClass(), "next", term332722);
        setField(term332550, term332550.getClass(), "first", term332636);
        setIntField(term332550, term332550.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term332550;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term332464, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


