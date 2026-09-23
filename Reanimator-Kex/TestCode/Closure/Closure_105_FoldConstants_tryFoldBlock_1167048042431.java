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

public class FoldConstants_tryFoldBlock_1167048042431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127746;
     Object term127816;

    public FoldConstants_tryFoldBlock_1167048042431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127746 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term127816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term128096, term128096.getClass(), "next", term128166);
        setIntField(term128096, term128096.getClass(), "type", 86);
        setField(term128026, term128026.getClass(), "next", term128096);
        setIntField(term128026, term128026.getClass(), "type", 128);
        setField(term127956, term127956.getClass(), "next", term128026);
        setIntField(term127956, term127956.getClass(), "type", 81);
        setField(term127886, term127886.getClass(), "next", term127956);
        setIntField(term127886, term127886.getClass(), "type", 60);
        setField(term127816, term127816.getClass(), "first", term127886);
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
        args[1] = term127816;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term127746, args);
    }

};


