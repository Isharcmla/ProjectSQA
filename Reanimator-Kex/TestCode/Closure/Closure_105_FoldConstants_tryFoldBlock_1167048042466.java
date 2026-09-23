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

public class FoldConstants_tryFoldBlock_1167048042466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144992;
     Object term145062;

    public FoldConstants_tryFoldBlock_1167048042466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144992 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term145062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term145342, term145342.getClass(), "next", term145412);
        setIntField(term145342, term145342.getClass(), "type", 72);
        setField(term145272, term145272.getClass(), "next", term145342);
        setIntField(term145272, term145272.getClass(), "type", 109);
        setField(term145202, term145202.getClass(), "next", term145272);
        setIntField(term145202, term145202.getClass(), "type", 54);
        setField(term145132, term145132.getClass(), "next", term145202);
        setIntField(term145132, term145132.getClass(), "type", 60);
        setField(term145062, term145062.getClass(), "first", term145132);
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
        args[1] = term145062;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term144992, args);
    }

};


