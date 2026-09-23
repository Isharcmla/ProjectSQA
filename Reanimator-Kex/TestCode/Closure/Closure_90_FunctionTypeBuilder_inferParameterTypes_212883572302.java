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

public class FunctionTypeBuilder_inferParameterTypes_212883572302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116174;
     Object term116580;

    public FunctionTypeBuilder_inferParameterTypes_212883572302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116174 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term116244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116400 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term116510 = newInstance(Class.forName("com.google.javascript.jscomp.PrintStreamErrorManager"));
        setField(term116244, term116244.getClass(), "first", null);
        setField(term116174, term116174.getClass(), "parametersNode", term116244);
        setField(term116174, term116174.getClass(), "typeRegistry", null);
        setField(term116174, term116174.getClass(), "templateTypeName", "");
        setField(term116174, term116174.getClass(), "fnName", "");
        setField(term116400, term116400.getClass(), "warningsGuard", null);
        setField(term116400, term116400.getClass(), "errorManager", term116510);
        setField(term116174, term116174.getClass(), "compiler", term116400);
        setField(term116174, term116174.getClass(), "sourceName", null);
        setField(term116174, term116174.getClass(), "errorRoot", null);
        term116580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term116580, term116580.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term116580;
        args[1] = null;
        callMethod(klass, "inferParameterTypes", argTypes, term116174, args);
    }

};


