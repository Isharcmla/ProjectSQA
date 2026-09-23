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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352989;
     Object term353075;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352989 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term353075 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term353161 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term353247 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term353247, term353247.getClass(), "type", 47);
        setField(term353161, term353161.getClass(), "next", term353247);
        setIntField(term353161, term353161.getClass(), "type", 0);
        setField(term353075, term353075.getClass(), "first", term353161);
        setIntField(term353075, term353075.getClass(), "type", 101);
        setField(term353075, term353075.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term353075;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term352989, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


