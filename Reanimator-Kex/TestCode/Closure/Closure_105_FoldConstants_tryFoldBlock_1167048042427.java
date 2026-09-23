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

public class FoldConstants_tryFoldBlock_1167048042427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125354;
     Object term125424;

    public FoldConstants_tryFoldBlock_1167048042427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125354 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term125424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term125634, term125634.getClass(), "next", term125704);
        setIntField(term125634, term125634.getClass(), "type", 57);
        setField(term125564, term125564.getClass(), "next", term125634);
        setIntField(term125564, term125564.getClass(), "type", 35);
        setIntField(term125774, term125774.getClass(), "type", 129);
        setField(term125564, term125564.getClass(), "first", term125774);
        setField(term125494, term125494.getClass(), "next", term125564);
        setIntField(term125494, term125494.getClass(), "type", 129);
        setField(term125424, term125424.getClass(), "first", term125494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term125424;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term125354, args);
    }

};


