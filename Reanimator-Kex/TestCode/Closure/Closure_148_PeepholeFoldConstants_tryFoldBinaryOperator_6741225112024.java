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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543042;
     Object term543134;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term543042 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term543134 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term543226 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term543312 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term543312, term543312.getClass(), "type", 44);
        setField(term543226, term543226.getClass(), "next", term543312);
        setIntField(term543226, term543226.getClass(), "type", 0);
        setField(term543134, term543134.getClass(), "first", term543226);
        setIntField(term543134, term543134.getClass(), "type", 100);
        setField(term543134, term543134.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term543134;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term543042, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


