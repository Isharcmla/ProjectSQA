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

public class ClosureCodingConvention_typeofClassDefiningName_1978408985122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59965;
     Object term60051;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59965 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term60051 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term60137 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term60051, term60051.getClass(), "type", 33);
        setField(term60051, term60051.getClass(), "last", term60137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term60051;
        try {
            callMethod(klass, "typeofClassDefiningName", argTypes, term59965, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


