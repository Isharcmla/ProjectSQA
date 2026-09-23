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

public class FoldConstants_tryFoldBlock_1167048042433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128824;
     Object term128894;

    public FoldConstants_tryFoldBlock_1167048042433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128824 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term128894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term129174, term129174.getClass(), "next", term129244);
        setIntField(term129174, term129174.getClass(), "type", 113);
        setField(term129104, term129104.getClass(), "next", term129174);
        setIntField(term129104, term129104.getClass(), "type", 36);
        setField(term129034, term129034.getClass(), "next", term129104);
        setIntField(term129034, term129034.getClass(), "type", 91);
        setIntField(term129314, term129314.getClass(), "type", 129);
        setField(term129034, term129034.getClass(), "first", term129314);
        setField(term128964, term128964.getClass(), "next", term129034);
        setIntField(term128964, term128964.getClass(), "type", 129);
        setField(term128894, term128894.getClass(), "first", term128964);
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
        args[1] = term128894;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term128824, args);
    }

};


