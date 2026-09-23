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

public class PeepholeFoldConstants_tryReduceVoid_942546715127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18463;
     Object term18635;

    public PeepholeFoldConstants_tryReduceVoid_942546715127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18463 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term18543 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term18463, term18463.getClass(), "compiler", term18543);
        term18635 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term18727 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term18727, term18727.getClass(), "type", 95);
        setField(term18635, term18635.getClass(), "first", term18727);
        setIntField(term18635, term18635.getClass(), "type", 95);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18635;
        callMethod(klass, "tryReduceVoid", argTypes, term18463, args);
    }

};


