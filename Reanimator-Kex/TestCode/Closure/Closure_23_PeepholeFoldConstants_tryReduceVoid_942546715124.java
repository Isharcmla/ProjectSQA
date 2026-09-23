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

public class PeepholeFoldConstants_tryReduceVoid_942546715124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17562;
     Object term17712;

    public PeepholeFoldConstants_tryReduceVoid_942546715124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17562 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term17642 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17562, term17562.getClass(), "compiler", term17642);
        term17712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17782, term17782.getClass(), "type", 151);
        setField(term17712, term17712.getClass(), "first", term17782);
        setIntField(term17712, term17712.getClass(), "type", 151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17712;
        callMethod(klass, "tryReduceVoid", argTypes, term17562, args);
    }

};


