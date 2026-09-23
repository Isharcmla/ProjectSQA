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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324204;
     Object term324296;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term324204 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term324296 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term324366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term324458 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term324458, term324458.getClass(), "type", 64);
        setField(term324366, term324366.getClass(), "next", term324458);
        setIntField(term324366, term324366.getClass(), "type", 0);
        setField(term324296, term324296.getClass(), "first", term324366);
        setIntField(term324296, term324296.getClass(), "type", 101);
        setField(term324296, term324296.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term324296;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term324204, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


