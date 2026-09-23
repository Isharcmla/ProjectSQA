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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68264;
     Object term68334;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68264 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term68334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68404, term68404.getClass(), "type", 33);
        setIntField(term68474, term68474.getClass(), "type", 40);
        setField(term68404, term68404.getClass(), "last", term68474);
        setField(term68334, term68334.getClass(), "first", term68404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term68334;
        try {
            callMethod(klass, "getClassesDefinedByCall", argTypes, term68264, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


