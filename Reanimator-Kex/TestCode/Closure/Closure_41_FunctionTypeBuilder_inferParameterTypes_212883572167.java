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

public class FunctionTypeBuilder_inferParameterTypes_212883572167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49460;
     Object term49708;

    public FunctionTypeBuilder_inferParameterTypes_212883572167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49460 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term49530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49530, term49530.getClass(), "first", term49600);
        setField(term49460, term49460.getClass(), "parametersNode", term49530);
        setField(term49460, term49460.getClass(), "typeRegistry", null);
        setField(term49460, term49460.getClass(), "templateTypeName", "");
        term49708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49708, term49708.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term49708;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term49460, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


