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

public class FoldConstants_tryFoldBlock_1167048042462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143104;
     Object term143174;

    public FoldConstants_tryFoldBlock_1167048042462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143104 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term143174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term143524, term143524.getClass(), "next", term143524);
        setIntField(term143524, term143524.getClass(), "type", 102);
        setField(term143454, term143454.getClass(), "next", term143524);
        setIntField(term143454, term143454.getClass(), "type", 119);
        setField(term143384, term143384.getClass(), "next", term143454);
        setIntField(term143384, term143384.getClass(), "type", 65);
        setField(term143314, term143314.getClass(), "next", term143384);
        setIntField(term143314, term143314.getClass(), "type", 112);
        setField(term143244, term143244.getClass(), "next", term143314);
        setIntField(term143244, term143244.getClass(), "type", 112);
        setField(term143174, term143174.getClass(), "first", term143244);
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
        args[1] = term143174;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term143104, args);
    }

};


