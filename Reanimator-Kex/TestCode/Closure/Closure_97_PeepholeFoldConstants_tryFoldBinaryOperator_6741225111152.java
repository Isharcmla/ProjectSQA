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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354602;
     Object term354688;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354602 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term354688 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term354774 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term354866 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term354866, term354866.getClass(), "type", 39);
        setField(term354774, term354774.getClass(), "next", term354866);
        setIntField(term354774, term354774.getClass(), "type", 39);
        setField(term354688, term354688.getClass(), "first", term354774);
        setIntField(term354688, term354688.getClass(), "type", 11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term354688;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term354602, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


