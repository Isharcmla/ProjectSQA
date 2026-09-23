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

public class ClosureCodingConvention_extractClassNameIfProvide_982641011503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163448;
     Object term163540;

    public ClosureCodingConvention_extractClassNameIfProvide_982641011503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163448 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term163540 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term163632 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term163540, term163540.getClass(), "type", 130);
        setIntField(term163632, term163632.getClass(), "type", 37);
        setField(term163540, term163540.getClass(), "first", term163632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term163540;
        try {
            callMethod(klass, "extractClassNameIfProvide", argTypes, term163448, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


