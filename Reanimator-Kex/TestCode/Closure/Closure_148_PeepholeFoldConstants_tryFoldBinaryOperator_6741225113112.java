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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term920519;
     Object term920611;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term920519 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term920611 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term920703 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term920789 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term920789, term920789.getClass(), "type", 63);
        setField(term920703, term920703.getClass(), "next", term920789);
        setIntField(term920703, term920703.getClass(), "type", 0);
        setField(term920611, term920611.getClass(), "first", term920703);
        setIntField(term920611, term920611.getClass(), "type", 100);
        setField(term920611, term920611.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term920611;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term920519, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


