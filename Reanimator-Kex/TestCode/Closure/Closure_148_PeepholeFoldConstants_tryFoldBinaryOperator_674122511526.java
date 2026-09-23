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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112041;
     Object term112127;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112041 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term112127 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term112213 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term112299 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term112385 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term112455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term112385, term112385.getClass(), "next", term112455);
        setField(term112299, term112299.getClass(), "first", term112385);
        setField(term112299, term112299.getClass(), "last", term112455);
        setField(term112213, term112213.getClass(), "next", term112299);
        setIntField(term112213, term112213.getClass(), "type", 88);
        setField(term112127, term112127.getClass(), "first", term112213);
        setIntField(term112127, term112127.getClass(), "type", 86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term112127;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term112041, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


