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

public class FunctionTypeBuilder_inferParameterTypes_212883572221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70411;
     Object term70585;

    public FunctionTypeBuilder_inferParameterTypes_212883572221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70411 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term70515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term70411, term70411.getClass(), "parametersNode", null);
        setField(term70411, term70411.getClass(), "typeRegistry", term70515);
        term70585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70585, term70585.getClass(), "first", term70655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term70585;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term70411, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


