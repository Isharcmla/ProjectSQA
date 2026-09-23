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

public class FoldConstants_tryFoldBlock_1167048042450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137264;
     Object term137334;

    public FoldConstants_tryFoldBlock_1167048042450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137264 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term137334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term137544, term137544.getClass(), "next", term137614);
        setIntField(term137544, term137544.getClass(), "type", 102);
        setField(term137474, term137474.getClass(), "next", term137544);
        setIntField(term137474, term137474.getClass(), "type", 34);
        setField(term137404, term137404.getClass(), "next", term137474);
        setIntField(term137404, term137404.getClass(), "type", 75);
        setField(term137334, term137334.getClass(), "first", term137404);
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
        args[1] = term137334;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term137264, args);
    }

};


