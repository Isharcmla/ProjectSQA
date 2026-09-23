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

public class FunctionTypeBuilder_inferParameterTypes_212883572233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75703;
     Object term76047;

    public FunctionTypeBuilder_inferParameterTypes_212883572233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75703 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term75773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75929 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term75773, term75773.getClass(), "first", null);
        setField(term75703, term75703.getClass(), "parametersNode", term75773);
        setField(term75703, term75703.getClass(), "typeRegistry", null);
        setField(term75703, term75703.getClass(), "templateTypeName", "");
        setField(term75703, term75703.getClass(), "fnName", "");
        setField(term75703, term75703.getClass(), "compiler", term75929);
        setField(term75703, term75703.getClass(), "sourceName", "");
        setField(term75703, term75703.getClass(), "errorRoot", null);
        term76047 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term76047, term76047.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term76047;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term75703, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


