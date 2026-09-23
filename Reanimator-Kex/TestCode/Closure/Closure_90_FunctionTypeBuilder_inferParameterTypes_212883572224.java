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

public class FunctionTypeBuilder_inferParameterTypes_212883572224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86753;
     Object term86927;
     Object term87077;

    public FunctionTypeBuilder_inferParameterTypes_212883572224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86753 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term86857 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term86753, term86753.getClass(), "parametersNode", null);
        setField(term86753, term86753.getClass(), "typeRegistry", term86857);
        term86927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term86927, term86927.getClass(), "first", term86997);
        term87077 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term87077, term87077.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term86927;
        args[1] = term87077;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term86753, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


