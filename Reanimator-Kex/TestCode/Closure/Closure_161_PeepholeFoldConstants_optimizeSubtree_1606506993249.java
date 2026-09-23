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

public class PeepholeFoldConstants_optimizeSubtree_1606506993249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40643;
     Object term40735;

    public PeepholeFoldConstants_optimizeSubtree_1606506993249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40643 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term40735 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40827 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term40735, term40735.getClass(), "type", 92);
        setField(term40735, term40735.getClass(), "last", term40827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40735;
        callMethod(klass, "optimizeSubtree", argTypes, term40643, args);
    }

};


