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

public class FoldConstants_tryFoldBlock_1167048042461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142727;
     Object term142797;

    public FoldConstants_tryFoldBlock_1167048042461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142727 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term142797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term142867, term142867.getClass(), "next", term142797);
        setIntField(term142867, term142867.getClass(), "type", 60);
        setField(term142797, term142797.getClass(), "first", term142867);
        setField(term142797, term142797.getClass(), "next", term142937);
        setIntField(term142797, term142797.getClass(), "type", 85);
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
        args[1] = term142797;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term142727, args);
    }

};


