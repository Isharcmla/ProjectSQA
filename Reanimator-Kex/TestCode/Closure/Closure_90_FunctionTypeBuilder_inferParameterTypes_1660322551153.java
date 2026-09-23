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

public class FunctionTypeBuilder_inferParameterTypes_1660322551153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63661;
     Object term63859;

    public FunctionTypeBuilder_inferParameterTypes_1660322551153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63661 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term63779 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term63661, term63661.getClass(), "parametersNode", null);
        setField(term63661, term63661.getClass(), "typeRegistry", null);
        setField(term63661, term63661.getClass(), "templateTypeName", "");
        setField(term63661, term63661.getClass(), "fnName", null);
        setField(term63661, term63661.getClass(), "compiler", term63779);
        setField(term63661, term63661.getClass(), "sourceName", null);
        setField(term63661, term63661.getClass(), "errorRoot", null);
        term63859 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term63859, term63859.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term63859;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term63661, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


