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

public class FunctionTypeBuilder_inferParameterTypes_212883572237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77947;
     Object term78191;
     Object term78271;

    public FunctionTypeBuilder_inferParameterTypes_212883572237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77947 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term78017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78121 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term78017, term78017.getClass(), "first", null);
        setField(term77947, term77947.getClass(), "parametersNode", term78017);
        setField(term77947, term77947.getClass(), "typeRegistry", term78121);
        term78191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term78191, term78191.getClass(), "first", term78191);
        term78271 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term78271, term78271.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term78191;
        args[1] = term78271;
        callMethod(klass, "inferParameterTypes", argTypes, term77947, args);
    }

};


