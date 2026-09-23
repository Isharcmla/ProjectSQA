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

public class ClosureCodingConvention_getObjectLiteralCast_148496234271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118144;
     Object term118230;

    public ClosureCodingConvention_getObjectLiteralCast_148496234271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118144 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term118230 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term118316 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term118230, term118230.getClass(), "type", 37);
        setIntField(term118316, term118316.getClass(), "type", 33);
        setField(term118230, term118230.getClass(), "first", term118316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term118230;
        try {
            callMethod(klass, "getObjectLiteralCast", argTypes, term118144, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


