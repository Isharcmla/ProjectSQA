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

public class FunctionTypeBuilder_inferParameterTypes_212883572195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60324;
     Object term60686;

    public FunctionTypeBuilder_inferParameterTypes_212883572195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60324 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term60394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term60394, term60394.getClass(), "first", term60464);
        setField(term60324, term60324.getClass(), "parametersNode", term60394);
        setField(term60324, term60324.getClass(), "typeRegistry", term60568);
        setField(term60324, term60324.getClass(), "templateTypeName", "");
        term60686 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term60686, term60686.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term60686;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term60324, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


