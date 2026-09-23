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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715458;
     Object term715550;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term715458 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term715550 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term715642 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term715734 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term715826 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term715642, term715642.getClass(), "next", term715734);
        setIntField(term715642, term715642.getClass(), "type", 63);
        setField(term715550, term715550.getClass(), "first", term715642);
        setIntField(term715550, term715550.getClass(), "type", 100);
        setField(term715550, term715550.getClass(), "parent", term715826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term715550;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term715458, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


