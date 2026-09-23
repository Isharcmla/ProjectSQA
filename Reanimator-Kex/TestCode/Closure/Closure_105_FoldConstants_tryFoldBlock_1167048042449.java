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

public class FoldConstants_tryFoldBlock_1167048042449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136704;
     Object term136774;

    public FoldConstants_tryFoldBlock_1167048042449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136704 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term136774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term136984, term136984.getClass(), "next", term137054);
        setIntField(term136984, term136984.getClass(), "type", 85);
        setField(term136914, term136914.getClass(), "next", term136984);
        setIntField(term136914, term136914.getClass(), "type", 87);
        setIntField(term137124, term137124.getClass(), "type", 75);
        setField(term136914, term136914.getClass(), "first", term137124);
        setField(term136844, term136844.getClass(), "next", term136914);
        setIntField(term136844, term136844.getClass(), "type", 75);
        setField(term136774, term136774.getClass(), "first", term136844);
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
        args[1] = term136774;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term136704, args);
    }

};


