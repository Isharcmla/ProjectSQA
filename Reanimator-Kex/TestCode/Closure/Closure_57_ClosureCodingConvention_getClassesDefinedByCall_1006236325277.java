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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119418;
     Object term119510;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119418 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term119510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term119510, term119510.getClass(), "first", term119510);
        setIntField(term119510, term119510.getClass(), "type", 38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term119510;
        try {
            callMethod(klass, "getClassesDefinedByCall", argTypes, term119418, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


