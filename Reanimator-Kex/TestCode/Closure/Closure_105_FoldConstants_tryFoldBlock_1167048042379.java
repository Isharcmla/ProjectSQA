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

public class FoldConstants_tryFoldBlock_1167048042379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107701;
     Object term107771;

    public FoldConstants_tryFoldBlock_1167048042379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107701 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term107771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term107981, term107981.getClass(), "next", term108051);
        setIntField(term107981, term107981.getClass(), "type", 95);
        setField(term107911, term107911.getClass(), "next", term107981);
        setIntField(term107911, term107911.getClass(), "type", 102);
        setField(term107841, term107841.getClass(), "next", term107911);
        setIntField(term107841, term107841.getClass(), "type", 75);
        setField(term107771, term107771.getClass(), "first", term107841);
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
        args[1] = term107771;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term107701, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


