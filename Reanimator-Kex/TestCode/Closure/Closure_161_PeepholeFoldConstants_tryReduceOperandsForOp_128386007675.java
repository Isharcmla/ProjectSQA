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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class PeepholeFoldConstants_tryReduceOperandsForOp_128386007675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12027;
     Object term12097;
     Object term12150;
     Object term12151;

    public PeepholeFoldConstants_tryReduceOperandsForOp_128386007675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12027 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term12097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12097, term12097.getClass(), "type", 11);
        term12150 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term12150, term12150.getClass(), "currentTraversal", null);
        term12151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12151, term12151.getClass(), "type", 11);
        setField(term12151, term12151.getClass(), "next", null);
        setField(term12151, term12151.getClass(), "first", null);
        setField(term12151, term12151.getClass(), "last", null);
        setField(term12151, term12151.getClass(), "propListHead", null);
        setIntField(term12151, term12151.getClass(), "sourcePosition", 0);
        setField(term12151, term12151.getClass(), "jsType", null);
        setField(term12151, term12151.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12097;
        callMethod(klass, "tryReduceOperandsForOp", argTypes, term12027, args);
        assertTrue(recursiveEquals(term12027, term12150));
        assertTrue(recursiveEquals(term12097, term12151));
    }

};


