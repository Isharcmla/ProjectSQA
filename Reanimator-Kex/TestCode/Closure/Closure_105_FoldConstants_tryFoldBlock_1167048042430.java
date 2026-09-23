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

public class FoldConstants_tryFoldBlock_1167048042430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127171;
     Object term127241;

    public FoldConstants_tryFoldBlock_1167048042430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127171 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term127241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term127521, term127521.getClass(), "next", term127591);
        setIntField(term127521, term127521.getClass(), "type", 70);
        setField(term127451, term127451.getClass(), "next", term127521);
        setIntField(term127451, term127451.getClass(), "type", 68);
        setField(term127381, term127381.getClass(), "next", term127451);
        setIntField(term127381, term127381.getClass(), "type", 81);
        setField(term127311, term127311.getClass(), "next", term127381);
        setIntField(term127311, term127311.getClass(), "type", 103);
        setField(term127241, term127241.getClass(), "first", term127311);
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
        args[1] = term127241;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term127171, args);
    }

};


