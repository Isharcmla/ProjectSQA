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

public class PeepholeFoldConstants_tryReduceVoid_942546715205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33364;
     Object term33524;

    public PeepholeFoldConstants_tryReduceVoid_942546715205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33364 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term33454 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term33454, term33454.getClass(), "compiler", null);
        setField(term33364, term33364.getClass(), "currentTraversal", term33454);
        term33524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33594, term33594.getClass(), "type", 92);
        setField(term33524, term33524.getClass(), "first", term33594);
        setIntField(term33524, term33524.getClass(), "type", 92);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term33524;
        try {
            callMethod(klass, "tryReduceVoid", argTypes, term33364, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


