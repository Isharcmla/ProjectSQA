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

public class FoldConstants_tryFoldBlock_1167048042458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141189;
     Object term141259;

    public FoldConstants_tryFoldBlock_1167048042458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141189 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term141259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term141469, term141469.getClass(), "next", term141539);
        setIntField(term141469, term141469.getClass(), "type", 69);
        setField(term141399, term141399.getClass(), "next", term141469);
        setIntField(term141399, term141399.getClass(), "type", 54);
        setField(term141329, term141329.getClass(), "next", term141399);
        setIntField(term141329, term141329.getClass(), "type", 112);
        setField(term141259, term141259.getClass(), "first", term141329);
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
        args[1] = term141259;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term141189, args);
    }

};


