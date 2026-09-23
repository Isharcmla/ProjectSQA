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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89137;
     Object term89207;
     Object term89540;
     Object term89541;
     Object term89518;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89137 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term89207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term89207, term89207.getClass(), "first", term89207);
        setField(term89207, term89207.getClass(), "next", term89207);
        setIntField(term89207, term89207.getClass(), "type", 46);
        term89540 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term89540, term89540.getClass(), "currentTraversal", null);
        term89541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89541, term89541.getClass(), "type", 46);
        setField(term89541, term89541.getClass(), "next", term89541);
        setField(term89541, term89541.getClass(), "first", term89541);
        setField(term89541, term89541.getClass(), "last", null);
        setField(term89541, term89541.getClass(), "propListHead", null);
        setIntField(term89541, term89541.getClass(), "sourcePosition", 0);
        setField(term89541, term89541.getClass(), "jsType", null);
        setField(term89541, term89541.getClass(), "parent", null);
        term89518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89518, term89518.getClass(), "type", 46);
        setField(term89518, term89518.getClass(), "next", term89518);
        setField(term89518, term89518.getClass(), "first", term89518);
        setField(term89518, term89518.getClass(), "last", null);
        setField(term89518, term89518.getClass(), "propListHead", null);
        setIntField(term89518, term89518.getClass(), "sourcePosition", 0);
        setField(term89518, term89518.getClass(), "jsType", null);
        setField(term89518, term89518.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term89207;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term89137, args);
        assertTrue(recursiveEquals(term89137, term89540));
        assertTrue(recursiveEquals(term89207, term89541));
        assertTrue(recursiveEquals(retValue, term89518));
    }

};


