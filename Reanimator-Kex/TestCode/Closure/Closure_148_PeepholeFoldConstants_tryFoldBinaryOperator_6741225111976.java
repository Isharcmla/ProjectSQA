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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term527616;
     Object term527702;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term527616 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term527702 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term527788 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term527874 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term527874, term527874.getClass(), "type", 47);
        setField(term527788, term527788.getClass(), "next", term527874);
        setIntField(term527788, term527788.getClass(), "type", 0);
        setField(term527702, term527702.getClass(), "first", term527788);
        setIntField(term527702, term527702.getClass(), "type", 100);
        setField(term527702, term527702.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term527702;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term527616, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


