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

public class FoldConstants_tryFoldBlock_1167048042436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130327;
     Object term130397;

    public FoldConstants_tryFoldBlock_1167048042436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130327 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term130397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term130677, term130677.getClass(), "next", term130747);
        setIntField(term130677, term130677.getClass(), "type", 60);
        setField(term130607, term130607.getClass(), "next", term130677);
        setIntField(term130607, term130607.getClass(), "type", 109);
        setField(term130537, term130537.getClass(), "next", term130607);
        setIntField(term130537, term130537.getClass(), "type", 54);
        setField(term130467, term130467.getClass(), "next", term130537);
        setIntField(term130467, term130467.getClass(), "type", 60);
        setField(term130397, term130397.getClass(), "first", term130467);
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
        args[1] = term130397;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term130327, args);
    }

};


