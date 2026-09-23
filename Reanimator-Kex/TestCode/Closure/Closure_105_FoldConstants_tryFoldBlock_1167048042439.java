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

public class FoldConstants_tryFoldBlock_1167048042439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131808;
     Object term131878;

    public FoldConstants_tryFoldBlock_1167048042439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131808 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term131878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term132088, term132088.getClass(), "next", term132158);
        setIntField(term132088, term132088.getClass(), "type", 128);
        setField(term132018, term132018.getClass(), "next", term132088);
        setIntField(term132018, term132018.getClass(), "type", 86);
        setIntField(term132228, term132228.getClass(), "type", 102);
        setField(term132018, term132018.getClass(), "first", term132228);
        setField(term131948, term131948.getClass(), "next", term132018);
        setIntField(term131948, term131948.getClass(), "type", 102);
        setField(term131878, term131878.getClass(), "first", term131948);
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
        args[1] = term131878;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term131808, args);
    }

};


