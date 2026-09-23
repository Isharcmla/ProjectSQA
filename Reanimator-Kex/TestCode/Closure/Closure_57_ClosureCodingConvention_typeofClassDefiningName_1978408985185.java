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

public class ClosureCodingConvention_typeofClassDefiningName_1978408985185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83950;
     Object term84036;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83950 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term84036 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term84122 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term84036, term84036.getClass(), "type", 33);
        setField(term84036, term84036.getClass(), "last", term84122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term84036;
        try {
            callMethod(klass, "typeofClassDefiningName", argTypes, term83950, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


