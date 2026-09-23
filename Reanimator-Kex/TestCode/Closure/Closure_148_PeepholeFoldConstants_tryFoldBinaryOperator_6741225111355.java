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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329486;
     Object term329578;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329486 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term329578 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term329664 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term329734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term329820 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term329664, term329664.getClass(), "next", term329734);
        setIntField(term329664, term329664.getClass(), "type", 64);
        setField(term329578, term329578.getClass(), "first", term329664);
        setIntField(term329578, term329578.getClass(), "type", 101);
        setField(term329578, term329578.getClass(), "parent", term329820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term329578;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term329486, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


