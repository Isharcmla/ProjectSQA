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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionTypeBuilder_inferParameterTypes_212883572198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78713;
     Object term78891;
     Object term78971;

    public FunctionTypeBuilder_inferParameterTypes_212883572198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78713 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term78783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term78783, term78783.getClass(), "first", null);
        setField(term78713, term78713.getClass(), "parametersNode", term78783);
        setField(term78713, term78713.getClass(), "typeRegistry", null);
        setField(term78713, term78713.getClass(), "templateTypeName", "");
        term78891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term78891, term78891.getClass(), "first", null);
        term78971 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term78971, term78971.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term78891;
        args[1] = term78971;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term78713, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


