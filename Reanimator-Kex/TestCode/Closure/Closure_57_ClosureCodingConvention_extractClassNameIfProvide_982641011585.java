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

public class ClosureCodingConvention_extractClassNameIfProvide_982641011585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206512;
     Object term206604;

    public ClosureCodingConvention_extractClassNameIfProvide_982641011585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206512 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term206604 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term206696 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term206604, term206604.getClass(), "type", 130);
        setIntField(term206696, term206696.getClass(), "type", 37);
        setField(term206604, term206604.getClass(), "first", term206696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term206604;
        try {
            callMethod(klass, "extractClassNameIfProvide", argTypes, term206512, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


