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

public class TypeValidator_getReadableJSTypeName_850599436492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256715;
     Object term256801;

    public TypeValidator_getReadableJSTypeName_850599436492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256715 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term256801 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term256887 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term256987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term257073 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term256801, term256801.getClass(), "type", 33);
        setField(term256887, term256887.getClass(), "jsType", term256987);
        setField(term256801, term256801.getClass(), "first", term256887);
        setField(term256801, term256801.getClass(), "last", term257073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term256801;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term256715, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


