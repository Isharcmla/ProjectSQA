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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term664887;
     Object term664973;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term664887 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term664973 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term665059 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term665129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term665215 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term665059, term665059.getClass(), "next", term665129);
        setIntField(term665059, term665059.getClass(), "type", 63);
        setField(term664973, term664973.getClass(), "first", term665059);
        setIntField(term664973, term664973.getClass(), "type", 101);
        setField(term664973, term664973.getClass(), "parent", term665215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term664973;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term664887, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


