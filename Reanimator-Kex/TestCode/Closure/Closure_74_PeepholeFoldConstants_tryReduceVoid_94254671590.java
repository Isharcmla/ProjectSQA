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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryReduceVoid_94254671590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16051;
     Object term16211;

    public PeepholeFoldConstants_tryReduceVoid_94254671590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16051 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term16141 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term16141, term16141.getClass(), "compiler", null);
        setField(term16051, term16051.getClass(), "currentTraversal", term16141);
        term16211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16281, term16281.getClass(), "type", 122);
        setField(term16211, term16211.getClass(), "first", term16281);
        setIntField(term16211, term16211.getClass(), "type", 122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term16211;
        try {
            callMethod(klass, "tryReduceVoid", argTypes, term16051, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


