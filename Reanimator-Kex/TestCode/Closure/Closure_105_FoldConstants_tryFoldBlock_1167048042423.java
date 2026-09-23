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

public class FoldConstants_tryFoldBlock_1167048042423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123260;
     Object term123330;

    public FoldConstants_tryFoldBlock_1167048042423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123260 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term123330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term123610, term123610.getClass(), "next", term123680);
        setIntField(term123610, term123610.getClass(), "type", 46);
        setField(term123540, term123540.getClass(), "next", term123610);
        setIntField(term123540, term123540.getClass(), "type", 126);
        setField(term123470, term123470.getClass(), "next", term123540);
        setIntField(term123470, term123470.getClass(), "type", 96);
        setIntField(term123750, term123750.getClass(), "type", 129);
        setField(term123470, term123470.getClass(), "first", term123750);
        setField(term123400, term123400.getClass(), "next", term123470);
        setIntField(term123400, term123400.getClass(), "type", 129);
        setField(term123330, term123330.getClass(), "first", term123400);
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
        args[1] = term123330;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term123260, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


