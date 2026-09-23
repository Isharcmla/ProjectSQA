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

public class FoldConstants_tryFoldBlock_1167048042435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129823;
     Object term129893;

    public FoldConstants_tryFoldBlock_1167048042435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129823 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term129893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term130103, term130103.getClass(), "next", term130173);
        setIntField(term130103, term130103.getClass(), "type", 68);
        setField(term130033, term130033.getClass(), "next", term130103);
        setIntField(term130033, term130033.getClass(), "type", 56);
        setField(term129963, term129963.getClass(), "next", term130033);
        setIntField(term129963, term129963.getClass(), "type", 129);
        setField(term129893, term129893.getClass(), "first", term129963);
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
        args[1] = term129893;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term129823, args);
    }

};


