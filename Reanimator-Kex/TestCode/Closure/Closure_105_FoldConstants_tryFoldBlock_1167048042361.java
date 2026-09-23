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

public class FoldConstants_tryFoldBlock_1167048042361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100937;
     Object term101007;

    public FoldConstants_tryFoldBlock_1167048042361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100937 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term101007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term101287, term101287.getClass(), "next", term101357);
        setIntField(term101287, term101287.getClass(), "type", 122);
        setField(term101217, term101217.getClass(), "next", term101287);
        setIntField(term101217, term101217.getClass(), "type", 127);
        setField(term101147, term101147.getClass(), "next", term101217);
        setIntField(term101147, term101147.getClass(), "type", 78);
        setField(term101077, term101077.getClass(), "next", term101147);
        setIntField(term101077, term101077.getClass(), "type", 82);
        setField(term101007, term101007.getClass(), "first", term101077);
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
        args[1] = term101007;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term100937, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


