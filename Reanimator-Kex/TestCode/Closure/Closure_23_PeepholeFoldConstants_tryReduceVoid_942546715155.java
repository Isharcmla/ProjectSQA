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

public class PeepholeFoldConstants_tryReduceVoid_942546715155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25467;
     Object term25617;

    public PeepholeFoldConstants_tryReduceVoid_942546715155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25467 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term25547 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term25467, term25467.getClass(), "compiler", term25547);
        term25617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25687, term25687.getClass(), "type", 87);
        setField(term25617, term25617.getClass(), "first", term25687);
        setIntField(term25617, term25617.getClass(), "type", 87);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25617;
        callMethod(klass, "tryReduceVoid", argTypes, term25467, args);
    }

};


