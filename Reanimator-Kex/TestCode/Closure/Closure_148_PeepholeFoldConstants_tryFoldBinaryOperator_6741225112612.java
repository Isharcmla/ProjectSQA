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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term742524;
     Object term742616;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term742524 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term742616 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term742702 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term742788 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term742858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term742788, term742788.getClass(), "type", 47);
        setField(term742702, term742702.getClass(), "next", term742788);
        setIntField(term742702, term742702.getClass(), "type", 0);
        setField(term742616, term742616.getClass(), "first", term742702);
        setIntField(term742616, term742616.getClass(), "type", 101);
        setIntField(term742858, term742858.getClass(), "type", 108);
        setField(term742616, term742616.getClass(), "parent", term742858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term742616;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term742524, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


