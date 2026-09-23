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

public class FunctionTypeBuilder_inferParameterTypes_212883572257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118780;
     Object term118954;
     Object term119104;

    public FunctionTypeBuilder_inferParameterTypes_212883572257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118780 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term118884 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term118780, term118780.getClass(), "typeRegistry", term118884);
        term118954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term118954, term118954.getClass(), "first", term119024);
        term119104 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term119228 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term119228, term119228.getClass(), "parameters", null);
        setField(term119104, term119104.getClass(), "info", term119228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term118954;
        args[1] = term119104;
        callMethod(klass, "inferParameterTypes", argTypes, term118780, args);
    }

};


