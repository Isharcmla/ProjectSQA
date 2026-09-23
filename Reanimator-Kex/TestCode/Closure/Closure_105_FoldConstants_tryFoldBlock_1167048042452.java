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

public class FoldConstants_tryFoldBlock_1167048042452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138259;
     Object term138329;

    public FoldConstants_tryFoldBlock_1167048042452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138259 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term138329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term138609, term138609.getClass(), "next", term138679);
        setIntField(term138609, term138609.getClass(), "type", 128);
        setField(term138539, term138539.getClass(), "next", term138609);
        setIntField(term138539, term138539.getClass(), "type", 56);
        setField(term138469, term138469.getClass(), "next", term138539);
        setIntField(term138469, term138469.getClass(), "type", 99);
        setField(term138399, term138399.getClass(), "next", term138469);
        setIntField(term138399, term138399.getClass(), "type", 107);
        setField(term138329, term138329.getClass(), "first", term138399);
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
        args[1] = term138329;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term138259, args);
    }

};


