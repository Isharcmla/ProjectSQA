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

public class PeepholeFoldConstants_tryReduceVoid_942546715174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30414;
     Object term30564;

    public PeepholeFoldConstants_tryReduceVoid_942546715174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30414 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term30494 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term30414, term30414.getClass(), "compiler", term30494);
        term30564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30634, term30634.getClass(), "type", 143);
        setField(term30564, term30564.getClass(), "first", term30634);
        setIntField(term30564, term30564.getClass(), "type", 143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30564;
        callMethod(klass, "tryReduceVoid", argTypes, term30414, args);
    }

};


