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

public class ClosureCodingConvention_extractClassNameIfProvide_982641011536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169165;
     Object term169257;

    public ClosureCodingConvention_extractClassNameIfProvide_982641011536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169165 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term169257 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term169349 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term169257, term169257.getClass(), "type", 130);
        setIntField(term169349, term169349.getClass(), "type", 37);
        setField(term169257, term169257.getClass(), "first", term169349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term169257;
        try {
            callMethod(klass, "extractClassNameIfProvide", argTypes, term169165, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


