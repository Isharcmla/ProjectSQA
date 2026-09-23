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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561943;
     Object term562035;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561943 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term562035 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term562127 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term562213 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term562213, term562213.getClass(), "type", 39);
        setField(term562127, term562127.getClass(), "next", term562213);
        setIntField(term562127, term562127.getClass(), "type", 39);
        setField(term562035, term562035.getClass(), "first", term562127);
        setIntField(term562035, term562035.getClass(), "type", 11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term562035;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term561943, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


