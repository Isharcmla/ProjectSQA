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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119600;
     Object term119686;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119600 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term119686 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term119772 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term119858 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term119944 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term120014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term119944, term119944.getClass(), "next", term120014);
        setField(term119858, term119858.getClass(), "first", term119944);
        setField(term119858, term119858.getClass(), "last", term120014);
        setField(term119772, term119772.getClass(), "next", term119858);
        setIntField(term119772, term119772.getClass(), "type", 52);
        setField(term119686, term119686.getClass(), "first", term119772);
        setIntField(term119686, term119686.getClass(), "type", 86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term119686;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term119600, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


