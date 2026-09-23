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

public class FunctionTypeBuilder_inferParameterTypes_212883572154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64201;
     Object term64427;

    public FunctionTypeBuilder_inferParameterTypes_212883572154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64201 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term64319 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term64201, term64201.getClass(), "parametersNode", null);
        setField(term64201, term64201.getClass(), "typeRegistry", null);
        setField(term64201, term64201.getClass(), "templateTypeName", "");
        setField(term64201, term64201.getClass(), "fnName", null);
        setField(term64201, term64201.getClass(), "compiler", term64319);
        setField(term64201, term64201.getClass(), "sourceName", "");
        setField(term64201, term64201.getClass(), "errorRoot", null);
        term64427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term64427, term64427.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term64427;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term64201, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


