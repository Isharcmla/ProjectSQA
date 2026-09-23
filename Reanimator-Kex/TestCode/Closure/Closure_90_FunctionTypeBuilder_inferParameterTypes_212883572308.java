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

public class FunctionTypeBuilder_inferParameterTypes_212883572308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119369;
     Object term119631;
     Object term119711;

    public FunctionTypeBuilder_inferParameterTypes_212883572308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119369 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term119455 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term119541 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term119455, term119455.getClass(), "first", term119541);
        setField(term119369, term119369.getClass(), "parametersNode", term119455);
        setField(term119369, term119369.getClass(), "typeRegistry", null);
        setField(term119369, term119369.getClass(), "templateTypeName", null);
        term119631 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term119631, term119631.getClass(), "first", null);
        term119711 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term119711, term119711.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term119631;
        args[1] = term119711;
        callMethod(klass, "inferParameterTypes", argTypes, term119369, args);
    }

};


