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

public class FunctionTypeBuilder_inferParameterTypes_212883572195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89590;
     Object term89764;
     Object term89914;

    public FunctionTypeBuilder_inferParameterTypes_212883572195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89590 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term89694 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term89590, term89590.getClass(), "typeRegistry", term89694);
        term89764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term89764, term89764.getClass(), "first", term89834);
        term89914 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term89914, term89914.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term89764;
        args[1] = term89914;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term89590, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


