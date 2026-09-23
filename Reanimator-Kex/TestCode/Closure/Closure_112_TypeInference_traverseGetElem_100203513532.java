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

public class TypeInference_traverseGetElem_100203513532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2977634;
     Object term2977704;

    public TypeInference_traverseGetElem_100203513532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2977634 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2977704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2977774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2977844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2977914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2977984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2979034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2979104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2979174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2979244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2979314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2979384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2979454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2979524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2979594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2979664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2977774, term2977774.getClass(), "type", 98);
        setField(term2977844, term2977844.getClass(), "next", term2977914);
        setIntField(term2977844, term2977844.getClass(), "type", 98);
        setField(term2977984, term2977984.getClass(), "next", term2978054);
        setIntField(term2977984, term2977984.getClass(), "type", 98);
        setField(term2978124, term2978124.getClass(), "next", term2978194);
        setIntField(term2978124, term2978124.getClass(), "type", 98);
        setField(term2978264, term2978264.getClass(), "next", term2978334);
        setIntField(term2978264, term2978264.getClass(), "type", 98);
        setField(term2978404, term2978404.getClass(), "next", term2978334);
        setIntField(term2978404, term2978404.getClass(), "type", 98);
        setField(term2978474, term2978474.getClass(), "next", term2978194);
        setIntField(term2978474, term2978474.getClass(), "type", 98);
        setField(term2978544, term2978544.getClass(), "next", term2978614);
        setIntField(term2978544, term2978544.getClass(), "type", 98);
        setField(term2978684, term2978684.getClass(), "next", term2978334);
        setIntField(term2978684, term2978684.getClass(), "type", 98);
        setField(term2978754, term2978754.getClass(), "next", term2978824);
        setIntField(term2978754, term2978754.getClass(), "type", 98);
        setField(term2978894, term2978894.getClass(), "next", term2978964);
        setIntField(term2978894, term2978894.getClass(), "type", 34);
        setField(term2978754, term2978754.getClass(), "first", term2978894);
        setField(term2978754, term2978754.getClass(), "last", term2979034);
        setField(term2978684, term2978684.getClass(), "first", term2978754);
        setField(term2978684, term2978684.getClass(), "last", term2979104);
        setField(term2978544, term2978544.getClass(), "first", term2978684);
        setField(term2978544, term2978544.getClass(), "last", term2979174);
        setField(term2978474, term2978474.getClass(), "first", term2978544);
        setField(term2978474, term2978474.getClass(), "last", term2979244);
        setField(term2978404, term2978404.getClass(), "first", term2978474);
        setField(term2978404, term2978404.getClass(), "last", term2979314);
        setField(term2978264, term2978264.getClass(), "first", term2978404);
        setField(term2978264, term2978264.getClass(), "last", term2979384);
        setField(term2978124, term2978124.getClass(), "first", term2978264);
        setField(term2978124, term2978124.getClass(), "last", term2979454);
        setField(term2977984, term2977984.getClass(), "first", term2978124);
        setField(term2977984, term2977984.getClass(), "last", term2979524);
        setField(term2977844, term2977844.getClass(), "first", term2977984);
        setField(term2977844, term2977844.getClass(), "last", term2979594);
        setField(term2977774, term2977774.getClass(), "first", term2977844);
        setField(term2977774, term2977774.getClass(), "last", term2979664);
        setField(term2977704, term2977704.getClass(), "first", term2977774);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2977704;
        args[1] = null;
        callMethod(klass, "traverseGetElem", argTypes, term2977634, args);
    }

};


