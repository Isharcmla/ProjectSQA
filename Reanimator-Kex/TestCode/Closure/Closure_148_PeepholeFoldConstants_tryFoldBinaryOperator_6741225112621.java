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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term745924;
     Object term746016;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term745924 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term746016 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term746108 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term746200 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term746292 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term746200, term746200.getClass(), "type", 63);
        setField(term746108, term746108.getClass(), "next", term746200);
        setIntField(term746108, term746108.getClass(), "type", 0);
        setField(term746016, term746016.getClass(), "first", term746108);
        setIntField(term746016, term746016.getClass(), "type", 101);
        setIntField(term746292, term746292.getClass(), "type", 108);
        setField(term746016, term746016.getClass(), "parent", term746292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term746016;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term745924, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


