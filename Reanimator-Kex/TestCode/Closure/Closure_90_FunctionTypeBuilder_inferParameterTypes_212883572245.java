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

public class FunctionTypeBuilder_inferParameterTypes_212883572245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93343;
     Object term93705;

    public FunctionTypeBuilder_inferParameterTypes_212883572245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93343 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term93429 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term93515 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term93619 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term93429, term93429.getClass(), "first", term93515);
        setField(term93343, term93343.getClass(), "parametersNode", term93429);
        setField(term93343, term93343.getClass(), "typeRegistry", term93619);
        term93705 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term93775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93705, term93705.getClass(), "first", term93775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term93705;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term93343, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


