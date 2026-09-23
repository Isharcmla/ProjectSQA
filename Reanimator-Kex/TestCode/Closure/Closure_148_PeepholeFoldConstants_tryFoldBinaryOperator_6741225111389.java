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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339814;
     Object term339900;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term339814 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term339900 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term339986 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term340078 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term340078, term340078.getClass(), "type", 63);
        setField(term339986, term339986.getClass(), "next", term340078);
        setIntField(term339986, term339986.getClass(), "type", 0);
        setField(term339900, term339900.getClass(), "first", term339986);
        setIntField(term339900, term339900.getClass(), "type", 101);
        setField(term339900, term339900.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term339900;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term339814, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


