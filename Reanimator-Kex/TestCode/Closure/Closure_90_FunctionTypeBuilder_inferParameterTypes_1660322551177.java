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

public class FunctionTypeBuilder_inferParameterTypes_1660322551177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70632;
     Object term70938;

    public FunctionTypeBuilder_inferParameterTypes_1660322551177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70632 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term70702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70820 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term70702, term70702.getClass(), "first", null);
        setField(term70632, term70632.getClass(), "parametersNode", term70702);
        setField(term70632, term70632.getClass(), "typeRegistry", null);
        setField(term70632, term70632.getClass(), "templateTypeName", "");
        setField(term70632, term70632.getClass(), "fnName", null);
        setField(term70632, term70632.getClass(), "compiler", term70820);
        setField(term70632, term70632.getClass(), "sourceName", "");
        setField(term70632, term70632.getClass(), "errorRoot", null);
        term70938 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term70938, term70938.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term70938;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term70632, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


