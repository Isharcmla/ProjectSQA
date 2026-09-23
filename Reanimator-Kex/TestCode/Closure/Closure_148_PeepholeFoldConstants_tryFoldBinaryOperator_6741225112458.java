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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term687465;
     Object term687557;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term687465 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term687557 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term687649 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term687741 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term687833 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term687649, term687649.getClass(), "next", term687741);
        setIntField(term687649, term687649.getClass(), "type", 44);
        setField(term687557, term687557.getClass(), "first", term687649);
        setIntField(term687557, term687557.getClass(), "type", 100);
        setField(term687557, term687557.getClass(), "parent", term687833);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term687557;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term687465, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


