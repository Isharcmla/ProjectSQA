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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307181;
     Object term307273;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307181 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term307273 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term307365 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term307457 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term307457, term307457.getClass(), "type", 63);
        setField(term307365, term307365.getClass(), "next", term307457);
        setIntField(term307365, term307365.getClass(), "type", 0);
        setField(term307273, term307273.getClass(), "first", term307365);
        setIntField(term307273, term307273.getClass(), "type", 101);
        setField(term307273, term307273.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term307273;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term307181, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


