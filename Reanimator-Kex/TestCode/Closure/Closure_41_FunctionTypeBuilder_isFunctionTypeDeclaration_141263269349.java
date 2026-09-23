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

public class FunctionTypeBuilder_isFunctionTypeDeclaration_141263269349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9944;

    public FunctionTypeBuilder_isFunctionTypeDeclaration_141263269349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9944 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term9944, term9944.getClass(), "fnName", null);
        setField(term9944, term9944.getClass(), "compiler", null);
        setField(term9944, term9944.getClass(), "codingConvention", null);
        setField(term9944, term9944.getClass(), "typeRegistry", null);
        setField(term9944, term9944.getClass(), "errorRoot", null);
        setField(term9944, term9944.getClass(), "sourceName", null);
        setField(term9944, term9944.getClass(), "scope", null);
        setField(term9944, term9944.getClass(), "contents", null);
        setField(term9944, term9944.getClass(), "returnType", null);
        setBooleanField(term9944, term9944.getClass(), "returnTypeInferred", false);
        setField(term9944, term9944.getClass(), "implementedInterfaces", null);
        setField(term9944, term9944.getClass(), "extendedInterfaces", null);
        setField(term9944, term9944.getClass(), "baseType", null);
        setField(term9944, term9944.getClass(), "thisType", null);
        setBooleanField(term9944, term9944.getClass(), "isConstructor", false);
        setBooleanField(term9944, term9944.getClass(), "isInterface", false);
        setField(term9944, term9944.getClass(), "parametersNode", null);
        setField(term9944, term9944.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isFunctionTypeDeclaration", argTypes, term9944, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


