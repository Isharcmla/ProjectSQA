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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ClosureCodingConvention_getObjectLiteralCast_148496234453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151738;
     Object term151830;

    public ClosureCodingConvention_getObjectLiteralCast_148496234453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151738 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term151830 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term151830, term151830.getClass(), "type", -38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term151830;
        try {
            callMethod(klass, "getObjectLiteralCast", argTypes, term151738, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


