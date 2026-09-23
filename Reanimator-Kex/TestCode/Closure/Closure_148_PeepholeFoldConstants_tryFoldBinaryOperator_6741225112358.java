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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653759;
     Object term653845;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653759 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term653845 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term653931 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term654017 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term654017, term654017.getClass(), "type", 63);
        setField(term653931, term653931.getClass(), "next", term654017);
        setIntField(term653931, term653931.getClass(), "type", 0);
        setField(term653845, term653845.getClass(), "first", term653931);
        setIntField(term653845, term653845.getClass(), "type", 100);
        setField(term653845, term653845.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term653845;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term653759, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


