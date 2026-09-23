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

public class FoldConstants_tryFoldBlock_1167048042432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128306;
     Object term128376;

    public FoldConstants_tryFoldBlock_1167048042432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128306 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term128376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term128586, term128586.getClass(), "next", term128656);
        setIntField(term128586, term128586.getClass(), "type", 62);
        setField(term128516, term128516.getClass(), "next", term128586);
        setIntField(term128516, term128516.getClass(), "type", 74);
        setField(term128446, term128446.getClass(), "next", term128516);
        setIntField(term128446, term128446.getClass(), "type", 112);
        setField(term128376, term128376.getClass(), "first", term128446);
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
        args[1] = term128376;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term128306, args);
    }

};


