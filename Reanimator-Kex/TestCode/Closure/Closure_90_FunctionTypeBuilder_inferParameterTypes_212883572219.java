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

public class FunctionTypeBuilder_inferParameterTypes_212883572219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85118;
     Object term85226;
     Object term85306;

    public FunctionTypeBuilder_inferParameterTypes_212883572219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85118 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term85118, term85118.getClass(), "parametersNode", null);
        setField(term85118, term85118.getClass(), "typeRegistry", null);
        setField(term85118, term85118.getClass(), "templateTypeName", "");
        term85226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term85226, term85226.getClass(), "first", null);
        term85306 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term85306, term85306.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term85226;
        args[1] = term85306;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term85118, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


