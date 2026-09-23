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

public class DevirtualizePrototypeMethods_process_131641927531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5977;
     Object term6047;
     Object term6187;

    public DevirtualizePrototypeMethods_process_131641927531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5977 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        setField(term5977, term5977.getClass(), "compiler", null);
        term6047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6047, term6047.getClass(), "type", 0);
        setField(term6117, term6117.getClass(), "next", null);
        setIntField(term6117, term6117.getClass(), "type", 0);
        setField(term6117, term6117.getClass(), "first", null);
        setField(term6047, term6047.getClass(), "first", term6117);
        term6187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6187, term6187.getClass(), "type", 0);
        setField(term6257, term6257.getClass(), "next", null);
        setIntField(term6257, term6257.getClass(), "type", 0);
        setField(term6257, term6257.getClass(), "first", null);
        setField(term6187, term6187.getClass(), "first", term6257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term6047;
        args[1] = term6187;
        callMethod(klass, "process", argTypes, term5977, args);
    }

};


