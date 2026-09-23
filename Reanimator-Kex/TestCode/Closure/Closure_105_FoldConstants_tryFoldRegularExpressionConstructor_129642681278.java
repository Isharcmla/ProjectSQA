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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class FoldConstants_tryFoldRegularExpressionConstructor_129642681278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74162;
     Object term74232;
     Object term74743;
     Object term74744;

    public FoldConstants_tryFoldRegularExpressionConstructor_129642681278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74162 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term74232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term74232, term74232.getClass(), "first", term74232);
        setField(term74232, term74232.getClass(), "next", term74232);
        term74743 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term74743, term74743.getClass(), "compiler", null);
        term74744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74744, term74744.getClass(), "type", 0);
        setField(term74744, term74744.getClass(), "next", term74744);
        setField(term74744, term74744.getClass(), "first", term74744);
        setField(term74744, term74744.getClass(), "last", null);
        setField(term74744, term74744.getClass(), "propListHead", null);
        setIntField(term74744, term74744.getClass(), "sourcePosition", 0);
        setField(term74744, term74744.getClass(), "jsType", null);
        setField(term74744, term74744.getClass(), "parent", null);
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
        args[1] = term74232;
        args[2] = null;
        callMethod(klass, "tryFoldRegularExpressionConstructor", argTypes, term74162, args);
        assertTrue(recursiveEquals(term74162, term74743));
        assertTrue(recursiveEquals(term74232, null));
    }

};


