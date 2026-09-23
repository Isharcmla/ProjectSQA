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

public class ClosureCodingConvention_extractClassNameIfRequire_262514769533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168243;
     Object term168313;

    public ClosureCodingConvention_extractClassNameIfRequire_262514769533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168243 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term168313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term168313, term168313.getClass(), "type", 130);
        setIntField(term168383, term168383.getClass(), "type", 37);
        setField(term168313, term168313.getClass(), "first", term168383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term168313;
        try {
            callMethod(klass, "extractClassNameIfRequire", argTypes, term168243, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


