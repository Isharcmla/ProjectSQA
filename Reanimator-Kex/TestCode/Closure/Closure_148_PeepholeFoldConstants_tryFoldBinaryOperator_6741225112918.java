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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term852875;
     Object term852967;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term852875 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term852967 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term853057 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term853149 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term853241 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term853149, term853149.getClass(), "type", 64);
        setField(term853057, term853057.getClass(), "next", term853149);
        setIntField(term853057, term853057.getClass(), "type", 0);
        setField(term852967, term852967.getClass(), "first", term853057);
        setIntField(term852967, term852967.getClass(), "type", 101);
        setIntField(term853241, term853241.getClass(), "type", 113);
        setField(term852967, term852967.getClass(), "parent", term853241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term852967;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term852875, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


