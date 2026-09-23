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

public class ClosureCodingConvention_typeofClassDefiningName_1978408985231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103554;
     Object term103640;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103554 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term103640 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term103732 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term103640, term103640.getClass(), "type", 33);
        setField(term103640, term103640.getClass(), "last", term103732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term103640;
        try {
            callMethod(klass, "typeofClassDefiningName", argTypes, term103554, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


