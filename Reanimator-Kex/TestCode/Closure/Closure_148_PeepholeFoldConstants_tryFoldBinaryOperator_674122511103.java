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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18090;
     Object term18160;
     Object term18636;
     Object term18637;
     Object term18614;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18090 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term18160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18160, term18160.getClass(), "first", term18160);
        setField(term18160, term18160.getClass(), "next", term18160);
        setIntField(term18160, term18160.getClass(), "type", 46);
        term18636 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term18636, term18636.getClass(), "currentTraversal", null);
        term18637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18637, term18637.getClass(), "type", 46);
        setField(term18637, term18637.getClass(), "next", term18637);
        setField(term18637, term18637.getClass(), "first", term18637);
        setField(term18637, term18637.getClass(), "last", null);
        setField(term18637, term18637.getClass(), "propListHead", null);
        setIntField(term18637, term18637.getClass(), "sourcePosition", 0);
        setField(term18637, term18637.getClass(), "jsType", null);
        setField(term18637, term18637.getClass(), "parent", null);
        term18614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18614, term18614.getClass(), "type", 46);
        setField(term18614, term18614.getClass(), "next", term18614);
        setField(term18614, term18614.getClass(), "first", term18614);
        setField(term18614, term18614.getClass(), "last", null);
        setField(term18614, term18614.getClass(), "propListHead", null);
        setIntField(term18614, term18614.getClass(), "sourcePosition", 0);
        setField(term18614, term18614.getClass(), "jsType", null);
        setField(term18614, term18614.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18160;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term18090, args);
        assertTrue(recursiveEquals(term18090, term18636));
        assertTrue(recursiveEquals(term18160, term18637));
        assertTrue(recursiveEquals(retValue, term18614));
    }

};


