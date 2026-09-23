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

public class TypeValidator_getReadableJSTypeName_850599436400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178525;
     Object term178611;

    public TypeValidator_getReadableJSTypeName_850599436400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178525 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term178611 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term178697 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term178797 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term178883 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term178611, term178611.getClass(), "type", 33);
        setField(term178697, term178697.getClass(), "jsType", term178797);
        setField(term178611, term178611.getClass(), "first", term178697);
        setField(term178611, term178611.getClass(), "last", term178883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term178611;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term178525, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


