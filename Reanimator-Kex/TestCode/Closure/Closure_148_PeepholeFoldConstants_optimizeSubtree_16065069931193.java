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

public class PeepholeFoldConstants_optimizeSubtree_16065069931193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282360;
     Object term282430;

    public PeepholeFoldConstants_optimizeSubtree_16065069931193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282360 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term282430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term282500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term282570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term282430, term282430.getClass(), "type", 33);
        setIntField(term282570, term282570.getClass(), "type", 40);
        setField(term282500, term282500.getClass(), "next", term282570);
        setField(term282430, term282430.getClass(), "first", term282500);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term282430;
        try {
            callMethod(klass, "optimizeSubtree", argTypes, term282360, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


