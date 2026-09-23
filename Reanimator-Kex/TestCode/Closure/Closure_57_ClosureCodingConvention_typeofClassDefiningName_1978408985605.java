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

public class ClosureCodingConvention_typeofClassDefiningName_1978408985605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209060;
     Object term209152;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209060 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term209152 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term209238 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term209152, term209152.getClass(), "type", 33);
        setField(term209152, term209152.getClass(), "last", term209238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term209152;
        try {
            callMethod(klass, "typeofClassDefiningName", argTypes, term209060, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


