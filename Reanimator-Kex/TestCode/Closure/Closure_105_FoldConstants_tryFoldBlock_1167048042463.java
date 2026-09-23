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

public class FoldConstants_tryFoldBlock_1167048042463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143647;
     Object term143717;

    public FoldConstants_tryFoldBlock_1167048042463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143647 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term143717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term143787, term143787.getClass(), "next", term143717);
        setIntField(term143787, term143787.getClass(), "type", 107);
        setField(term143717, term143717.getClass(), "first", term143787);
        setField(term143717, term143717.getClass(), "next", term143857);
        setIntField(term143717, term143717.getClass(), "type", 36);
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
        args[1] = term143717;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term143647, args);
    }

};


