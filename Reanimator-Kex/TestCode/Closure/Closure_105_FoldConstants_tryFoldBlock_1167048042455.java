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

public class FoldConstants_tryFoldBlock_1167048042455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139771;
     Object term139841;

    public FoldConstants_tryFoldBlock_1167048042455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139771 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term139841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term140121, term140121.getClass(), "next", term140191);
        setIntField(term140121, term140121.getClass(), "type", 93);
        setField(term140051, term140051.getClass(), "next", term140121);
        setIntField(term140051, term140051.getClass(), "type", 48);
        setField(term139981, term139981.getClass(), "next", term140051);
        setIntField(term139981, term139981.getClass(), "type", 78);
        setField(term139911, term139911.getClass(), "next", term139981);
        setIntField(term139911, term139911.getClass(), "type", 82);
        setField(term139841, term139841.getClass(), "first", term139911);
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
        args[1] = term139841;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term139771, args);
    }

};


