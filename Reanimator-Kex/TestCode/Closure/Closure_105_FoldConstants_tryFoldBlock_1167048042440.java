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

public class FoldConstants_tryFoldBlock_1167048042440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132383;
     Object term132453;

    public FoldConstants_tryFoldBlock_1167048042440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132383 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term132453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term132733, term132733.getClass(), "next", term132803);
        setIntField(term132733, term132733.getClass(), "type", 72);
        setField(term132663, term132663.getClass(), "next", term132733);
        setIntField(term132663, term132663.getClass(), "type", 127);
        setField(term132593, term132593.getClass(), "next", term132663);
        setIntField(term132593, term132593.getClass(), "type", 78);
        setField(term132523, term132523.getClass(), "next", term132593);
        setIntField(term132523, term132523.getClass(), "type", 82);
        setField(term132453, term132453.getClass(), "first", term132523);
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
        args[1] = term132453;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term132383, args);
    }

};


