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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryReduceVoid_942546715114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18654;
     Object term18814;

    public PeepholeFoldConstants_tryReduceVoid_942546715114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18654 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term18744 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term18744, term18744.getClass(), "compiler", null);
        setField(term18654, term18654.getClass(), "currentTraversal", term18744);
        term18814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18884, term18884.getClass(), "type", 88);
        setField(term18814, term18814.getClass(), "first", term18884);
        setIntField(term18814, term18814.getClass(), "type", 88);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18814;
        try {
            callMethod(klass, "tryReduceVoid", argTypes, term18654, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


