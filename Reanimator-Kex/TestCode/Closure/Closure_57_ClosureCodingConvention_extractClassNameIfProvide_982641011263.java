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

public class ClosureCodingConvention_extractClassNameIfProvide_982641011263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115069;
     Object term115161;

    public ClosureCodingConvention_extractClassNameIfProvide_982641011263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115069 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term115161 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term115161, term115161.getClass(), "type", 130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term115161;
        try {
            callMethod(klass, "extractClassNameIfProvide", argTypes, term115069, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


