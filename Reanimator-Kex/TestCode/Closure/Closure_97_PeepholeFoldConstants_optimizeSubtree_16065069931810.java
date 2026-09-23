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

public class PeepholeFoldConstants_optimizeSubtree_16065069931810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term702833;
     Object term702919;

    public PeepholeFoldConstants_optimizeSubtree_16065069931810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term702833 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term702919 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term703005 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term703097 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term702919, term702919.getClass(), "type", 35);
        setIntField(term703097, term703097.getClass(), "type", 39);
        setDoubleField(term703097, term703097.getClass(), "number", -4.490080994501591E18);
        setField(term703005, term703005.getClass(), "next", term703097);
        setIntField(term703005, term703005.getClass(), "type", 63);
        setField(term702919, term702919.getClass(), "first", term703005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term702919;
        try {
            callMethod(klass, "optimizeSubtree", argTypes, term702833, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


