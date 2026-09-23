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

public class FoldConstants_tryFoldBlock_1167048042215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55173;
     Object term55243;

    public FoldConstants_tryFoldBlock_1167048042215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55173 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term55243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55453, term55453.getClass(), "next", term55523);
        setIntField(term55453, term55453.getClass(), "type", 89);
        setField(term55383, term55383.getClass(), "next", term55453);
        setIntField(term55383, term55383.getClass(), "type", 87);
        setIntField(term55593, term55593.getClass(), "type", 75);
        setField(term55383, term55383.getClass(), "first", term55593);
        setField(term55313, term55313.getClass(), "next", term55383);
        setIntField(term55313, term55313.getClass(), "type", 75);
        setField(term55243, term55243.getClass(), "first", term55313);
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
        args[1] = term55243;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term55173, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


