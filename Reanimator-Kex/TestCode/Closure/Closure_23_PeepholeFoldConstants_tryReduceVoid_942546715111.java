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

public class PeepholeFoldConstants_tryReduceVoid_942546715111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14752;
     Object term14902;

    public PeepholeFoldConstants_tryReduceVoid_942546715111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14752 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term14832 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term14752, term14752.getClass(), "compiler", term14832);
        term14902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14972, term14972.getClass(), "type", 116);
        setField(term14902, term14902.getClass(), "first", term14972);
        setIntField(term14902, term14902.getClass(), "type", 116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14902;
        callMethod(klass, "tryReduceVoid", argTypes, term14752, args);
    }

};


