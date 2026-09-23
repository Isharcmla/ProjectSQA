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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term628849;
     Object term628919;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term628849 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term628919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term629009 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term629101 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term629101, term629101.getClass(), "type", 44);
        setField(term629009, term629009.getClass(), "next", term629101);
        setIntField(term629009, term629009.getClass(), "type", 0);
        setField(term628919, term628919.getClass(), "first", term629009);
        setIntField(term628919, term628919.getClass(), "type", 101);
        setField(term628919, term628919.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term628919;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term628849, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


