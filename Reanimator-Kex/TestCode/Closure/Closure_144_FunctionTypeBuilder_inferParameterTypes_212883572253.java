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
import java.util.HashMap;

public class FunctionTypeBuilder_inferParameterTypes_212883572253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116912;
     Object term117110;

    public FunctionTypeBuilder_inferParameterTypes_212883572253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116912 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term117030 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term116912, term116912.getClass(), "typeRegistry", null);
        setField(term116912, term116912.getClass(), "templateTypeName", "");
        setField(term116912, term116912.getClass(), "fnName", null);
        setField(term116912, term116912.getClass(), "compiler", term117030);
        setField(term116912, term116912.getClass(), "sourceName", null);
        setField(term116912, term116912.getClass(), "errorRoot", null);
        HashMap term117282 = new HashMap();
        term117110 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term117234 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term117234, term117234.getClass(), "parameters", term117282);
        setField(term117110, term117110.getClass(), "info", term117234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term117110;
        callMethod(klass, "inferParameterTypes", argTypes, term116912, args);
    }

};


