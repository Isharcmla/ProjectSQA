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

public class ClosureCodingConvention_getClassesDefinedByCall_100623632576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44897;
     Object term44967;

    public ClosureCodingConvention_getClassesDefinedByCall_100623632576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44897 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term44967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44967, term44967.getClass(), "first", term44967);
        setIntField(term44967, term44967.getClass(), "type", 33);
        setField(term44967, term44967.getClass(), "last", term44967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44967;
        try {
            callMethod(klass, "getClassesDefinedByCall", argTypes, term44897, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


