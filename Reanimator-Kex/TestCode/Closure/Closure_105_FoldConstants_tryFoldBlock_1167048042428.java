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

public class FoldConstants_tryFoldBlock_1167048042428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125929;
     Object term125999;

    public FoldConstants_tryFoldBlock_1167048042428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125929 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term125999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term126279, term126279.getClass(), "next", term126349);
        setIntField(term126279, term126279.getClass(), "type", 79);
        setField(term126209, term126209.getClass(), "next", term126279);
        setIntField(term126209, term126209.getClass(), "type", 73);
        setField(term126139, term126139.getClass(), "next", term126209);
        setIntField(term126139, term126139.getClass(), "type", 81);
        setField(term126069, term126069.getClass(), "next", term126139);
        setIntField(term126069, term126069.getClass(), "type", 103);
        setField(term125999, term125999.getClass(), "first", term126069);
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
        args[1] = term125999;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term125929, args);
    }

};


