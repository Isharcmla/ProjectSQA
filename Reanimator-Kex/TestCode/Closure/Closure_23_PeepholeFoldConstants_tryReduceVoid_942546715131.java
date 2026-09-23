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

public class PeepholeFoldConstants_tryReduceVoid_942546715131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19590;
     Object term19740;

    public PeepholeFoldConstants_tryReduceVoid_942546715131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19590 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term19670 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term19590, term19590.getClass(), "compiler", term19670);
        term19740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19810, term19810.getClass(), "type", 103);
        setField(term19740, term19740.getClass(), "first", term19810);
        setIntField(term19740, term19740.getClass(), "type", 103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19740;
        callMethod(klass, "tryReduceVoid", argTypes, term19590, args);
    }

};


