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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608132;
     Object term608224;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term608132 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term608224 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term608310 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term608402 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term608402, term608402.getClass(), "type", 63);
        setField(term608310, term608310.getClass(), "next", term608402);
        setIntField(term608310, term608310.getClass(), "type", 0);
        setField(term608224, term608224.getClass(), "first", term608310);
        setIntField(term608224, term608224.getClass(), "type", 101);
        setField(term608224, term608224.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term608224;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term608132, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


