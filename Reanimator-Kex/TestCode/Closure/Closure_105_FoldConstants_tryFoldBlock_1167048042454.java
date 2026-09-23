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

public class FoldConstants_tryFoldBlock_1167048042454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139196;
     Object term139266;

    public FoldConstants_tryFoldBlock_1167048042454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139196 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term139266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term139546, term139546.getClass(), "next", term139616);
        setIntField(term139546, term139546.getClass(), "type", 104);
        setField(term139476, term139476.getClass(), "next", term139546);
        setIntField(term139476, term139476.getClass(), "type", 109);
        setField(term139406, term139406.getClass(), "next", term139476);
        setIntField(term139406, term139406.getClass(), "type", 54);
        setField(term139336, term139336.getClass(), "next", term139406);
        setIntField(term139336, term139336.getClass(), "type", 60);
        setField(term139266, term139266.getClass(), "first", term139336);
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
        args[1] = term139266;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term139196, args);
    }

};


