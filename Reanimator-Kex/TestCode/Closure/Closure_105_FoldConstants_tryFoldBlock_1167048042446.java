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

public class FoldConstants_tryFoldBlock_1167048042446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135051;
     Object term135121;

    public FoldConstants_tryFoldBlock_1167048042446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135051 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term135121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term135331, term135331.getClass(), "next", term135401);
        setIntField(term135331, term135331.getClass(), "type", 34);
        setField(term135261, term135261.getClass(), "next", term135331);
        setIntField(term135261, term135261.getClass(), "type", 127);
        setField(term135191, term135191.getClass(), "next", term135261);
        setIntField(term135191, term135191.getClass(), "type", 103);
        setField(term135121, term135121.getClass(), "first", term135191);
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
        args[1] = term135121;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term135051, args);
    }

};


