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

public class FoldConstants_tryFoldBlock_1167048042441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132943;
     Object term133013;

    public FoldConstants_tryFoldBlock_1167048042441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132943 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term133013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term133223, term133223.getClass(), "next", term133293);
        setIntField(term133223, term133223.getClass(), "type", 33);
        setField(term133153, term133153.getClass(), "next", term133223);
        setIntField(term133153, term133153.getClass(), "type", 69);
        setField(term133083, term133083.getClass(), "next", term133153);
        setIntField(term133083, term133083.getClass(), "type", 60);
        setField(term133013, term133013.getClass(), "first", term133083);
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
        args[1] = term133013;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term132943, args);
    }

};


