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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionTypeBuilder_inferParameterTypes_212883572305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118042;
     Object term118214;
     Object term118294;

    public FunctionTypeBuilder_inferParameterTypes_212883572305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118042 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term118128 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term118128, term118128.getClass(), "first", null);
        setField(term118042, term118042.getClass(), "parametersNode", term118128);
        setField(term118042, term118042.getClass(), "typeRegistry", null);
        term118214 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term118214, term118214.getClass(), "first", null);
        term118294 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term118294, term118294.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term118214;
        args[1] = term118294;
        callMethod(klass, "inferParameterTypes", argTypes, term118042, args);
    }

};


