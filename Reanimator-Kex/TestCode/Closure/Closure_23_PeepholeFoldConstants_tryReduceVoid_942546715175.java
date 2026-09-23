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

public class PeepholeFoldConstants_tryReduceVoid_942546715175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30766;
     Object term30916;

    public PeepholeFoldConstants_tryReduceVoid_942546715175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30766 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term30846 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term30766, term30766.getClass(), "compiler", term30846);
        term30916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30986, term30986.getClass(), "type", 67);
        setField(term30916, term30916.getClass(), "first", term30986);
        setIntField(term30916, term30916.getClass(), "type", 67);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30916;
        callMethod(klass, "tryReduceVoid", argTypes, term30766, args);
    }

};


