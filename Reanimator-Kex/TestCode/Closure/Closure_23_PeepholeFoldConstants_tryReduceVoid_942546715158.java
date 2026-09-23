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

public class PeepholeFoldConstants_tryReduceVoid_942546715158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26361;
     Object term26511;

    public PeepholeFoldConstants_tryReduceVoid_942546715158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26361 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term26441 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term26361, term26361.getClass(), "compiler", term26441);
        term26511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26581, term26581.getClass(), "type", 136);
        setField(term26511, term26511.getClass(), "first", term26581);
        setIntField(term26511, term26511.getClass(), "type", 136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26511;
        callMethod(klass, "tryReduceVoid", argTypes, term26361, args);
    }

};


