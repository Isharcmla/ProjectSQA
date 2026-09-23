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

public class FoldConstants_tryFoldBlock_1167048042465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144487;
     Object term144557;

    public FoldConstants_tryFoldBlock_1167048042465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144487 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term144557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term144767, term144767.getClass(), "next", term144837);
        setIntField(term144767, term144767.getClass(), "type", 80);
        setField(term144697, term144697.getClass(), "next", term144767);
        setIntField(term144697, term144697.getClass(), "type", 102);
        setField(term144627, term144627.getClass(), "next", term144697);
        setIntField(term144627, term144627.getClass(), "type", 75);
        setField(term144557, term144557.getClass(), "first", term144627);
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
        args[1] = term144557;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term144487, args);
    }

};


