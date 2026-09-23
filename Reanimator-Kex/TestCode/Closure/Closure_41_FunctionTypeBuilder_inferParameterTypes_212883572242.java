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

public class FunctionTypeBuilder_inferParameterTypes_212883572242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79958;
     Object term80168;
     Object term80248;

    public FunctionTypeBuilder_inferParameterTypes_212883572242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79958 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term80028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term80028, term80028.getClass(), "first", term80098);
        setField(term79958, term79958.getClass(), "parametersNode", term80028);
        setField(term79958, term79958.getClass(), "typeRegistry", null);
        term80168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term80168, term80168.getClass(), "first", null);
        term80248 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term80248, term80248.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term80168;
        args[1] = term80248;
        callMethod(klass, "inferParameterTypes", argTypes, term79958, args);
    }

};


