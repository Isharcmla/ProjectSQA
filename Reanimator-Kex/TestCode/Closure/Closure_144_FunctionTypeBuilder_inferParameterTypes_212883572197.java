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

public class FunctionTypeBuilder_inferParameterTypes_212883572197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90607;
     Object term90833;
     Object term90913;

    public FunctionTypeBuilder_inferParameterTypes_212883572197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90607 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term90763 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term90607, term90607.getClass(), "typeRegistry", null);
        setField(term90607, term90607.getClass(), "templateTypeName", "");
        setField(term90607, term90607.getClass(), "fnName", "");
        setField(term90607, term90607.getClass(), "compiler", term90763);
        setField(term90607, term90607.getClass(), "sourceName", null);
        setField(term90607, term90607.getClass(), "errorRoot", null);
        term90833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term90833, term90833.getClass(), "first", null);
        term90913 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term90913, term90913.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term90833;
        args[1] = term90913;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term90607, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


