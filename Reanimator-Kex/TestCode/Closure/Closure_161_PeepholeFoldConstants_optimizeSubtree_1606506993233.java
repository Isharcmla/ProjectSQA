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

public class PeepholeFoldConstants_optimizeSubtree_1606506993233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37127;
     Object term37197;

    public PeepholeFoldConstants_optimizeSubtree_1606506993233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37127 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term37197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37197, term37197.getClass(), "type", 94);
        setIntField(term37267, term37267.getClass(), "type", 98);
        setField(term37197, term37197.getClass(), "last", term37267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37197;
        callMethod(klass, "optimizeSubtree", argTypes, term37127, args);
    }

};


