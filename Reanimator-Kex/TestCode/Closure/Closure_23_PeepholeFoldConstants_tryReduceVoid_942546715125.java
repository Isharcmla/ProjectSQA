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

public class PeepholeFoldConstants_tryReduceVoid_942546715125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17914;
     Object term18064;

    public PeepholeFoldConstants_tryReduceVoid_942546715125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17914 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term17994 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17914, term17914.getClass(), "compiler", term17994);
        term18064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18134, term18134.getClass(), "type", 62);
        setField(term18064, term18064.getClass(), "first", term18134);
        setIntField(term18064, term18064.getClass(), "type", 62);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18064;
        callMethod(klass, "tryReduceVoid", argTypes, term17914, args);
    }

};


