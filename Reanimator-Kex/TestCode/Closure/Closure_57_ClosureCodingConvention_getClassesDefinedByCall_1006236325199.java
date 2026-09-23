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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91482;
     Object term91568;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91482 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term91568 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term91654 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term91568, term91568.getClass(), "first", term91568);
        setIntField(term91568, term91568.getClass(), "type", 33);
        setField(term91568, term91568.getClass(), "last", term91654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term91568;
        try {
            callMethod(klass, "getClassesDefinedByCall", argTypes, term91482, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


