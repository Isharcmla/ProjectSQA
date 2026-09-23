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

public class FunctionTypeBuilder_inferReturnType_2137249201236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77435;
     Object term77771;

    public FunctionTypeBuilder_inferReturnType_2137249201236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77435 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term77573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term77691 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term77435, term77435.getClass(), "templateTypeName", "");
        setField(term77435, term77435.getClass(), "returnType", term77573);
        setField(term77435, term77435.getClass(), "fnName", "");
        setField(term77435, term77435.getClass(), "compiler", term77691);
        setField(term77435, term77435.getClass(), "sourceName", null);
        setField(term77435, term77435.getClass(), "errorRoot", null);
        term77771 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term77771, term77771.getClass(), "bitset", -1610612736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term77771;
        callMethod(klass, "inferReturnType", argTypes, term77435, args);
    }

};


