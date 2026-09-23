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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44323;
     Object term44393;
     Object term45236;
     Object term45237;
     Object term45221;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44323 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term44393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44393, term44393.getClass(), "first", term44393);
        setField(term44393, term44393.getClass(), "next", term44393);
        setIntField(term44393, term44393.getClass(), "type", 23);
        term45236 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term45236, term45236.getClass(), "currentTraversal", null);
        term45237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45237, term45237.getClass(), "type", 23);
        setField(term45237, term45237.getClass(), "next", term45237);
        setField(term45237, term45237.getClass(), "first", term45237);
        setField(term45237, term45237.getClass(), "last", null);
        setField(term45237, term45237.getClass(), "propListHead", null);
        setIntField(term45237, term45237.getClass(), "sourcePosition", 0);
        setField(term45237, term45237.getClass(), "jsType", null);
        setField(term45237, term45237.getClass(), "parent", null);
        term45221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45221, term45221.getClass(), "type", 23);
        setField(term45221, term45221.getClass(), "next", term45221);
        setField(term45221, term45221.getClass(), "first", term45221);
        setField(term45221, term45221.getClass(), "last", null);
        setField(term45221, term45221.getClass(), "propListHead", null);
        setIntField(term45221, term45221.getClass(), "sourcePosition", 0);
        setField(term45221, term45221.getClass(), "jsType", null);
        setField(term45221, term45221.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44393;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term44323, args);
        assertTrue(recursiveEquals(term44323, term45236));
        assertTrue(recursiveEquals(term44393, term45237));
        assertTrue(recursiveEquals(retValue, term45221));
    }

};


