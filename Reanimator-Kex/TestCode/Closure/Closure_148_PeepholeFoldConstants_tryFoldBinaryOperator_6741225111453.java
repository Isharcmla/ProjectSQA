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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359175;
     Object term359261;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359175 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term359261 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term359347 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term359433 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term359519 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term359347, term359347.getClass(), "next", term359433);
        setIntField(term359347, term359347.getClass(), "type", 47);
        setField(term359261, term359261.getClass(), "first", term359347);
        setIntField(term359261, term359261.getClass(), "type", 101);
        setField(term359261, term359261.getClass(), "parent", term359519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term359261;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term359175, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


