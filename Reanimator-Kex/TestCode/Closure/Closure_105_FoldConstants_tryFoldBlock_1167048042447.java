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

public class FoldConstants_tryFoldBlock_1167048042447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135556;
     Object term135626;

    public FoldConstants_tryFoldBlock_1167048042447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135556 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term135626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term135906, term135906.getClass(), "next", term135976);
        setIntField(term135906, term135906.getClass(), "type", 50);
        setField(term135836, term135836.getClass(), "next", term135906);
        setIntField(term135836, term135836.getClass(), "type", 74);
        setField(term135766, term135766.getClass(), "next", term135836);
        setIntField(term135766, term135766.getClass(), "type", 79);
        setField(term135696, term135696.getClass(), "next", term135766);
        setIntField(term135696, term135696.getClass(), "type", 60);
        setField(term135626, term135626.getClass(), "first", term135696);
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
        args[1] = term135626;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term135556, args);
    }

};


