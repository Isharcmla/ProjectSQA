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

public class TypeValidator_getReadableJSTypeName_850599436434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207099;
     Object term207185;

    public TypeValidator_getReadableJSTypeName_850599436434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207099 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term207185 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term207271 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term207367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term207437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term207185, term207185.getClass(), "type", 33);
        setField(term207271, term207271.getClass(), "jsType", term207367);
        setField(term207185, term207185.getClass(), "first", term207271);
        setField(term207185, term207185.getClass(), "last", term207437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term207185;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term207099, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


