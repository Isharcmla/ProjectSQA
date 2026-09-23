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

public class FunctionTypeBuilder_inferParameterTypes_212883572144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61269;
     Object term61443;

    public FunctionTypeBuilder_inferParameterTypes_212883572144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61269 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term61373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term61269, term61269.getClass(), "parametersNode", null);
        setField(term61269, term61269.getClass(), "typeRegistry", term61373);
        term61443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term61443, term61443.getClass(), "first", term61513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term61443;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term61269, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


