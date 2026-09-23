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

public class FoldConstants_tryFoldBlock_1167048042267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71238;
     Object term71308;

    public FoldConstants_tryFoldBlock_1167048042267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71238 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term71308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term71518, term71518.getClass(), "next", term71588);
        setIntField(term71518, term71518.getClass(), "type", 33);
        setField(term71448, term71448.getClass(), "next", term71518);
        setIntField(term71448, term71448.getClass(), "type", 54);
        setField(term71378, term71378.getClass(), "next", term71448);
        setIntField(term71378, term71378.getClass(), "type", 60);
        setField(term71308, term71308.getClass(), "first", term71378);
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
        args[1] = term71308;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term71238, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


