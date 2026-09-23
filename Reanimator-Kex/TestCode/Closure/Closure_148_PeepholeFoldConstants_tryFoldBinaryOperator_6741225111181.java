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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279163;
     Object term279249;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279163 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term279249 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term279335 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term279421 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term279421, term279421.getClass(), "type", 40);
        setField(term279335, term279335.getClass(), "next", term279421);
        setField(term279249, term279249.getClass(), "first", term279335);
        setIntField(term279249, term279249.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term279249;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term279163, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


