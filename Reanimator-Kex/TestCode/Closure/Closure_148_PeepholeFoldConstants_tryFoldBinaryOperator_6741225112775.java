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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term800476;
     Object term800568;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term800476 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term800568 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term800660 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term800752 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term800844 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term800752, term800752.getClass(), "type", 64);
        setField(term800660, term800660.getClass(), "next", term800752);
        setIntField(term800660, term800660.getClass(), "type", 93);
        setField(term800568, term800568.getClass(), "first", term800660);
        setIntField(term800568, term800568.getClass(), "type", 100);
        setIntField(term800844, term800844.getClass(), "type", 114);
        setField(term800568, term800568.getClass(), "parent", term800844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term800568;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term800476, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


