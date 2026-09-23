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

public class FunctionTypeBuilder_inferParameterTypes_1660322551165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78488;
     Object term78724;

    public FunctionTypeBuilder_inferParameterTypes_1660322551165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78488 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term78644 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term78488, term78488.getClass(), "typeRegistry", null);
        setField(term78488, term78488.getClass(), "templateTypeName", "");
        setField(term78488, term78488.getClass(), "fnName", "");
        setField(term78488, term78488.getClass(), "compiler", term78644);
        setField(term78488, term78488.getClass(), "sourceName", "");
        setField(term78488, term78488.getClass(), "errorRoot", null);
        term78724 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term78724, term78724.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term78724;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term78488, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


