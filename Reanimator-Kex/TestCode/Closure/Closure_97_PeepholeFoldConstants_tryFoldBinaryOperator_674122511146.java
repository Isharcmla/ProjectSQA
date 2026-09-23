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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28644;
     Object term28714;
     Object term28759;
     Object term28760;
     Object term28718;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28644 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term28714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term28714, term28714.getClass(), "first", term28714);
        setField(term28714, term28714.getClass(), "next", term28714);
        setIntField(term28714, term28714.getClass(), "type", 100);
        term28759 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term28759, term28759.getClass(), "currentTraversal", null);
        term28760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28760, term28760.getClass(), "type", 100);
        setField(term28760, term28760.getClass(), "next", term28760);
        setField(term28760, term28760.getClass(), "first", term28760);
        setField(term28760, term28760.getClass(), "last", null);
        setField(term28760, term28760.getClass(), "propListHead", null);
        setIntField(term28760, term28760.getClass(), "sourcePosition", 0);
        setField(term28760, term28760.getClass(), "jsType", null);
        setField(term28760, term28760.getClass(), "parent", null);
        term28718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28718, term28718.getClass(), "type", 100);
        setField(term28718, term28718.getClass(), "next", term28718);
        setField(term28718, term28718.getClass(), "first", term28718);
        setField(term28718, term28718.getClass(), "last", null);
        setField(term28718, term28718.getClass(), "propListHead", null);
        setIntField(term28718, term28718.getClass(), "sourcePosition", 0);
        setField(term28718, term28718.getClass(), "jsType", null);
        setField(term28718, term28718.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28714;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term28644, args);
        assertTrue(recursiveEquals(term28644, term28759));
        assertTrue(recursiveEquals(term28714, term28760));
        assertTrue(recursiveEquals(retValue, term28718));
    }

};


