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

public class Normalize_process_1693239666161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2240883;
     Object term2241055;

    public Normalize_process_1693239666161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2240883 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2240963 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2240883, term2240883.getClass(), "compiler", term2240963);
        setBooleanField(term2240883, term2240883.getClass(), "assertOnChange", false);
        term2241055 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2241147 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2241239 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2241331 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2241055, term2241055.getClass(), "type", 0);
        setField(term2241239, term2241239.getClass(), "next", term2241331);
        setIntField(term2241239, term2241239.getClass(), "type", 125);
        setField(term2241147, term2241147.getClass(), "next", term2241239);
        setIntField(term2241147, term2241147.getClass(), "type", 132);
        setField(term2241147, term2241147.getClass(), "propListHead", null);
        setField(term2241147, term2241147.getClass(), "first", null);
        setField(term2241055, term2241055.getClass(), "first", term2241147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2241055;
        callMethod(klass, "process", argTypes, term2240883, args);
    }

};


