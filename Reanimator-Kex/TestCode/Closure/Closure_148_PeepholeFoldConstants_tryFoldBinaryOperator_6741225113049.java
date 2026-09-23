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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term897332;
     Object term897424;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term897332 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term897424 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term897516 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term897608 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term897700 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term897608, term897608.getClass(), "type", 64);
        setField(term897516, term897516.getClass(), "next", term897608);
        setIntField(term897516, term897516.getClass(), "type", 0);
        setField(term897424, term897424.getClass(), "first", term897516);
        setIntField(term897424, term897424.getClass(), "type", 101);
        setIntField(term897700, term897700.getClass(), "type", 108);
        setField(term897424, term897424.getClass(), "parent", term897700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term897424;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term897332, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


