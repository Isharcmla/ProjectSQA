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

public class TypeValidator_getReadableJSTypeName_850599436480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247489;
     Object term247575;

    public TypeValidator_getReadableJSTypeName_850599436480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247489 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term247575 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term247661 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term247757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term247843 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term247575, term247575.getClass(), "type", 33);
        setField(term247661, term247661.getClass(), "jsType", term247757);
        setField(term247575, term247575.getClass(), "first", term247661);
        setField(term247575, term247575.getClass(), "last", term247843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term247575;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term247489, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


