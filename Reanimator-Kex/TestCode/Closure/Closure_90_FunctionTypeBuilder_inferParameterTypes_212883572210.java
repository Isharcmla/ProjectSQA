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

public class FunctionTypeBuilder_inferParameterTypes_212883572210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82650;
     Object term82894;

    public FunctionTypeBuilder_inferParameterTypes_212883572210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82650 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term82929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term82929, term82929.getClass(), "first", null);
        setIntField(term82929, term82929.getClass(), "type", 0);
        setField(term82929, term82929.getClass(), "parent", null);
        setIntField(term82929, term82929.getClass(), "sourcePosition", 0);
        setField(term82650, term82650.getClass(), "parametersNode", term82929);
        setField(term82650, term82650.getClass(), "typeRegistry", term82824);
        term82894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term82894, term82894.getClass(), "first", term82929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term82894;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term82650, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


