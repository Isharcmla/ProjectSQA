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

public class FoldConstants_tryFoldBlock_1167048042438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131235;
     Object term131305;

    public FoldConstants_tryFoldBlock_1167048042438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131235 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term131305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term131585, term131585.getClass(), "next", term131655);
        setIntField(term131585, term131585.getClass(), "type", 46);
        setField(term131515, term131515.getClass(), "next", term131585);
        setIntField(term131515, term131515.getClass(), "type", 31);
        setField(term131445, term131445.getClass(), "next", term131515);
        setIntField(term131445, term131445.getClass(), "type", 81);
        setField(term131375, term131375.getClass(), "next", term131445);
        setIntField(term131375, term131375.getClass(), "type", 60);
        setField(term131305, term131305.getClass(), "first", term131375);
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
        args[1] = term131305;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term131235, args);
    }

};


