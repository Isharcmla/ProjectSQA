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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term678361;
     Object term678453;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term678361 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term678453 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term678539 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term678539, term678539.getClass(), "next", term678539);
        setIntField(term678539, term678539.getClass(), "type", 63);
        setField(term678453, term678453.getClass(), "first", term678539);
        setIntField(term678453, term678453.getClass(), "type", 101);
        setField(term678453, term678453.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term678453;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term678361, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


