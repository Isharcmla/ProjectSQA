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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FoldConstants_tryFoldBlock_1167048042327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89826;
     Object term89896;

    public FoldConstants_tryFoldBlock_1167048042327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89826 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term89896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term90106, term90106.getClass(), "next", term90176);
        setIntField(term90106, term90106.getClass(), "type", 92);
        setField(term90036, term90036.getClass(), "next", term90106);
        setIntField(term90036, term90036.getClass(), "type", 72);
        setField(term89966, term89966.getClass(), "next", term90036);
        setIntField(term89966, term89966.getClass(), "type", 75);
        setField(term89896, term89896.getClass(), "first", term89966);
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
        args[1] = term89896;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term89826, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


