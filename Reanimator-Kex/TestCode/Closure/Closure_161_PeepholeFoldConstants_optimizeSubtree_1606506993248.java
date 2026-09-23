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

public class PeepholeFoldConstants_optimizeSubtree_1606506993248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40379;
     Object term40449;

    public PeepholeFoldConstants_optimizeSubtree_1606506993248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40379 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term40449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40449, term40449.getClass(), "type", 92);
        setIntField(term40519, term40519.getClass(), "type", 39);
        setField(term40449, term40449.getClass(), "last", term40519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40449;
        callMethod(klass, "optimizeSubtree", argTypes, term40379, args);
    }

};


