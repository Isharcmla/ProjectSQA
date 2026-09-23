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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryReduceVoid_942546715344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79446;
     Object term79628;

    public PeepholeFoldConstants_tryReduceVoid_942546715344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79446 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term79536 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term79536, term79536.getClass(), "compiler", null);
        setField(term79446, term79446.getClass(), "currentTraversal", term79536);
        term79628 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term79628, term79628.getClass(), "first", term79628);
        setIntField(term79628, term79628.getClass(), "type", 90);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term79628;
        try {
            callMethod(klass, "tryReduceVoid", argTypes, term79446, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


