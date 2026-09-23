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

public class FoldConstants_tryFoldBlock_1167048042425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124496;
     Object term124566;

    public FoldConstants_tryFoldBlock_1167048042425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124496 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term124566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term124636, term124636.getClass(), "next", term124566);
        setIntField(term124636, term124636.getClass(), "type", 82);
        setField(term124566, term124566.getClass(), "first", term124636);
        setField(term124566, term124566.getClass(), "next", term124706);
        setIntField(term124566, term124566.getClass(), "type", 109);
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
        args[1] = term124566;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term124496, args);
    }

};


