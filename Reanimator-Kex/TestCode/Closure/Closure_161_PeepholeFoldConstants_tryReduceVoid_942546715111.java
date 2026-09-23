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

public class PeepholeFoldConstants_tryReduceVoid_942546715111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17959;
     Object term18119;

    public PeepholeFoldConstants_tryReduceVoid_942546715111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17959 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term18049 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term18049, term18049.getClass(), "compiler", null);
        setField(term17959, term17959.getClass(), "currentTraversal", term18049);
        term18119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18189, term18189.getClass(), "type", 90);
        setField(term18119, term18119.getClass(), "first", term18189);
        setIntField(term18119, term18119.getClass(), "type", 90);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18119;
        try {
            callMethod(klass, "tryReduceVoid", argTypes, term17959, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


