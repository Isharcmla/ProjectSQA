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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445645;
     Object term445715;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term445645 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term445715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term445805 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term445897 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term445897, term445897.getClass(), "type", 47);
        setField(term445805, term445805.getClass(), "next", term445897);
        setIntField(term445805, term445805.getClass(), "type", 0);
        setField(term445715, term445715.getClass(), "first", term445805);
        setIntField(term445715, term445715.getClass(), "type", 101);
        setField(term445715, term445715.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term445715;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term445645, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


