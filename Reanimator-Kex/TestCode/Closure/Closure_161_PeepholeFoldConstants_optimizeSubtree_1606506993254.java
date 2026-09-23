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

public class PeepholeFoldConstants_optimizeSubtree_1606506993254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41722;
     Object term41792;

    public PeepholeFoldConstants_optimizeSubtree_1606506993254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41722 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term41792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41792, term41792.getClass(), "type", 94);
        setIntField(term41862, term41862.getClass(), "type", 94);
        setField(term41792, term41792.getClass(), "last", term41862);
        setField(term41792, term41792.getClass(), "first", term41932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41792;
        callMethod(klass, "optimizeSubtree", argTypes, term41722, args);
    }

};


