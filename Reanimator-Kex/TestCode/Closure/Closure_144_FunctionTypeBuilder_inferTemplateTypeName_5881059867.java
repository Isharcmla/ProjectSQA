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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class FunctionTypeBuilder_inferTemplateTypeName_5881059867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46939;
     Object term47013;

    public FunctionTypeBuilder_inferTemplateTypeName_5881059867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46939 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term47013 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term47013, term47013.getClass(), "fnName", null);
        setField(term47013, term47013.getClass(), "compiler", null);
        setField(term47013, term47013.getClass(), "codingConvention", null);
        setField(term47013, term47013.getClass(), "typeRegistry", null);
        setField(term47013, term47013.getClass(), "errorRoot", null);
        setField(term47013, term47013.getClass(), "sourceName", null);
        setField(term47013, term47013.getClass(), "scope", null);
        setField(term47013, term47013.getClass(), "returnType", null);
        setField(term47013, term47013.getClass(), "implementedInterfaces", null);
        setField(term47013, term47013.getClass(), "baseType", null);
        setField(term47013, term47013.getClass(), "thisType", null);
        setBooleanField(term47013, term47013.getClass(), "isConstructor", false);
        setBooleanField(term47013, term47013.getClass(), "isInterface", false);
        setField(term47013, term47013.getClass(), "parametersNode", null);
        setField(term47013, term47013.getClass(), "sourceNode", null);
        setField(term47013, term47013.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "inferTemplateTypeName", argTypes, term46939, args);
        assertTrue(recursiveEquals(term46939, term47013));
    }

};


