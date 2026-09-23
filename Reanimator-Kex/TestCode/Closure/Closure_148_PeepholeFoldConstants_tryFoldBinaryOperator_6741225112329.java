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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term644144;
     Object term644236;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term644144 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term644236 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term644328 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term644420 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term644420, term644420.getClass(), "type", 44);
        setField(term644328, term644328.getClass(), "next", term644420);
        setIntField(term644328, term644328.getClass(), "type", 0);
        setField(term644236, term644236.getClass(), "first", term644328);
        setIntField(term644236, term644236.getClass(), "type", 101);
        setField(term644236, term644236.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term644236;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term644144, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


