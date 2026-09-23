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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term859048;
     Object term859140;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term859048 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term859140 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term859232 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term859324 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term859324, term859324.getClass(), "type", 63);
        setField(term859232, term859232.getClass(), "next", term859324);
        setIntField(term859232, term859232.getClass(), "type", 0);
        setField(term859140, term859140.getClass(), "first", term859232);
        setIntField(term859140, term859140.getClass(), "type", 101);
        setField(term859140, term859140.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term859140;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term859048, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


