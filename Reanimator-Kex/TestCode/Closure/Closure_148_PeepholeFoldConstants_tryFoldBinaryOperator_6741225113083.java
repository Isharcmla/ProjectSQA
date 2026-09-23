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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term910179;
     Object term910271;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term910179 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term910271 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term910363 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term910455 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term910547 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term910455, term910455.getClass(), "type", 64);
        setField(term910363, term910363.getClass(), "next", term910455);
        setIntField(term910363, term910363.getClass(), "type", 0);
        setField(term910271, term910271.getClass(), "first", term910363);
        setIntField(term910271, term910271.getClass(), "type", 101);
        setIntField(term910547, term910547.getClass(), "type", 114);
        setField(term910271, term910271.getClass(), "parent", term910547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term910271;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term910179, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


