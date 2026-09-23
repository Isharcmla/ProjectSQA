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

public class FoldConstants_tryFoldBlock_1167048042457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140629;
     Object term140699;

    public FoldConstants_tryFoldBlock_1167048042457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140629 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term140699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term140909, term140909.getClass(), "next", term140979);
        setIntField(term140909, term140909.getClass(), "type", 52);
        setField(term140839, term140839.getClass(), "next", term140909);
        setIntField(term140839, term140839.getClass(), "type", 89);
        setIntField(term141049, term141049.getClass(), "type", 48);
        setField(term140839, term140839.getClass(), "first", term141049);
        setField(term140769, term140769.getClass(), "next", term140839);
        setIntField(term140769, term140769.getClass(), "type", 48);
        setField(term140699, term140699.getClass(), "first", term140769);
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
        args[1] = term140699;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term140629, args);
    }

};


