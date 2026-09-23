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

public class FunctionTypeBuilder_inferParameterTypes_212883572306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118494;
     Object term118708;
     Object term118788;

    public FunctionTypeBuilder_inferParameterTypes_212883572306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118494 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term118580 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term118580, term118580.getClass(), "first", null);
        setField(term118494, term118494.getClass(), "parametersNode", term118580);
        setField(term118494, term118494.getClass(), "typeRegistry", null);
        setField(term118494, term118494.getClass(), "templateTypeName", "");
        term118708 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term118708, term118708.getClass(), "first", null);
        term118788 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term118788, term118788.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term118708;
        args[1] = term118788;
        callMethod(klass, "inferParameterTypes", argTypes, term118494, args);
    }

};


