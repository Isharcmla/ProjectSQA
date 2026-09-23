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

public class PeepholeFoldConstants_tryReduceVoid_942546715149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24101;
     Object term24251;

    public PeepholeFoldConstants_tryReduceVoid_942546715149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24101 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term24181 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term24101, term24101.getClass(), "compiler", term24181);
        term24251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24321, term24321.getClass(), "type", 33);
        setField(term24251, term24251.getClass(), "first", term24321);
        setIntField(term24251, term24251.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24251;
        callMethod(klass, "tryReduceVoid", argTypes, term24101, args);
    }

};


