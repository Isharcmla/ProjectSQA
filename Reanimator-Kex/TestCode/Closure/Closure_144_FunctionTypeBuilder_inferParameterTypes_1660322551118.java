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
import java.util.HashMap;

public class FunctionTypeBuilder_inferParameterTypes_1660322551118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62245;
     Object term62443;

    public FunctionTypeBuilder_inferParameterTypes_1660322551118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62245 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term62363 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term62245, term62245.getClass(), "typeRegistry", null);
        setField(term62245, term62245.getClass(), "templateTypeName", "");
        setField(term62245, term62245.getClass(), "fnName", null);
        setField(term62245, term62245.getClass(), "compiler", term62363);
        setField(term62245, term62245.getClass(), "sourceName", null);
        setField(term62245, term62245.getClass(), "errorRoot", null);
        HashMap term62615 = new HashMap();
        term62443 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term62567 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term62567, term62567.getClass(), "parameters", term62615);
        setField(term62443, term62443.getClass(), "info", term62567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term62443;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term62245, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


