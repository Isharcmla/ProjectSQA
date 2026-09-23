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

public class FoldConstants_tryFoldBlock_1167048042429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126519;
     Object term126589;

    public FoldConstants_tryFoldBlock_1167048042429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126519 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term126589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term126939, term126939.getClass(), "next", term127009);
        setIntField(term126939, term126939.getClass(), "type", 69);
        setField(term126869, term126869.getClass(), "next", term126939);
        setIntField(term126869, term126869.getClass(), "type", 114);
        setField(term126799, term126799.getClass(), "next", term126869);
        setIntField(term126799, term126799.getClass(), "type", 127);
        setField(term126729, term126729.getClass(), "next", term126799);
        setIntField(term126729, term126729.getClass(), "type", 78);
        setField(term126659, term126659.getClass(), "next", term126729);
        setIntField(term126659, term126659.getClass(), "type", 82);
        setField(term126589, term126589.getClass(), "first", term126659);
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
        args[1] = term126589;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term126519, args);
    }

};


