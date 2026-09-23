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

public class PeepholeFoldConstants_tryReduceVoid_942546715108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19092;
     Object term19252;

    public PeepholeFoldConstants_tryReduceVoid_942546715108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19092 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term19182 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term19182, term19182.getClass(), "compiler", null);
        setField(term19092, term19092.getClass(), "currentTraversal", term19182);
        term19252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19322, term19322.getClass(), "type", 91);
        setField(term19252, term19252.getClass(), "first", term19322);
        setIntField(term19252, term19252.getClass(), "type", 91);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19252;
        try {
            callMethod(klass, "tryReduceVoid", argTypes, term19092, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


