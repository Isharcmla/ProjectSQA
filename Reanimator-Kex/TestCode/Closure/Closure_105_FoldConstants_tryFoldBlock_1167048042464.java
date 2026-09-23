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

public class FoldConstants_tryFoldBlock_1167048042464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143997;
     Object term144067;

    public FoldConstants_tryFoldBlock_1167048042464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143997 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term144067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term144277, term144277.getClass(), "next", term144347);
        setIntField(term144277, term144277.getClass(), "type", 53);
        setField(term144207, term144207.getClass(), "next", term144277);
        setIntField(term144207, term144207.getClass(), "type", 114);
        setField(term144137, term144137.getClass(), "next", term144207);
        setIntField(term144137, term144137.getClass(), "type", 82);
        setField(term144067, term144067.getClass(), "first", term144137);
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
        args[1] = term144067;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term143997, args);
    }

};


