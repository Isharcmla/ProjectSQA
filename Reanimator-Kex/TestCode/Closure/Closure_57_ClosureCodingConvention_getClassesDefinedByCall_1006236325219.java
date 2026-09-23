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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98615;
     Object term98701;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98615 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term98701 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term98787 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term98873 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term98787, term98787.getClass(), "type", 33);
        setField(term98787, term98787.getClass(), "last", term98873);
        setField(term98701, term98701.getClass(), "first", term98787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term98701;
        try {
            callMethod(klass, "getClassesDefinedByCall", argTypes, term98615, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


