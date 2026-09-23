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

public class FoldConstants_tryFoldBlock_1167048042426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124846;
     Object term124916;

    public FoldConstants_tryFoldBlock_1167048042426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124846 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term124916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term125126, term125126.getClass(), "next", term125196);
        setIntField(term125126, term125126.getClass(), "type", 85);
        setField(term125056, term125056.getClass(), "next", term125126);
        setIntField(term125056, term125056.getClass(), "type", 55);
        setField(term124986, term124986.getClass(), "next", term125056);
        setIntField(term124986, term124986.getClass(), "type", 31);
        setField(term124916, term124916.getClass(), "first", term124986);
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
        args[1] = term124916;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term124846, args);
    }

};


