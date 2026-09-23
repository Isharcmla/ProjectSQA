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

public class ClosureCodingConvention_typeofClassDefiningName_1978408985524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164940;
     Object term165032;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164940 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term165032 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term165118 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term165032, term165032.getClass(), "type", 33);
        setField(term165032, term165032.getClass(), "last", term165118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term165032;
        try {
            callMethod(klass, "typeofClassDefiningName", argTypes, term164940, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


