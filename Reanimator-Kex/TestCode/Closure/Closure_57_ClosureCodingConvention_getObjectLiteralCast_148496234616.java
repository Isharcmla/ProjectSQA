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

public class ClosureCodingConvention_getObjectLiteralCast_148496234616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211531;
     Object term211601;

    public ClosureCodingConvention_getObjectLiteralCast_148496234616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211531 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term211601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term211601, term211601.getClass(), "type", 37);
        setIntField(term211671, term211671.getClass(), "type", 33);
        setField(term211601, term211601.getClass(), "first", term211671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term211601;
        try {
            callMethod(klass, "getObjectLiteralCast", argTypes, term211531, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


