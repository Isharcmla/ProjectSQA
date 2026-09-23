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

public class FunctionTypeBuilder_inferParameterTypes_212883572185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85942;
     Object term86140;

    public FunctionTypeBuilder_inferParameterTypes_212883572185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85942 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term86060 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term85942, term85942.getClass(), "typeRegistry", null);
        setField(term85942, term85942.getClass(), "templateTypeName", "");
        setField(term85942, term85942.getClass(), "fnName", null);
        setField(term85942, term85942.getClass(), "compiler", term86060);
        setField(term85942, term85942.getClass(), "sourceName", null);
        setField(term85942, term85942.getClass(), "errorRoot", null);
        term86140 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term86264 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term86264, term86264.getClass(), "parameters", null);
        setField(term86140, term86140.getClass(), "info", term86264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term86140;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term85942, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


