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

public class FunctionTypeBuilder_inferParameterTypes_212883572238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78466;
     Object term78644;
     Object term78724;

    public FunctionTypeBuilder_inferParameterTypes_212883572238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78466 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term78536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term78536, term78536.getClass(), "first", null);
        setField(term78466, term78466.getClass(), "parametersNode", term78536);
        setField(term78466, term78466.getClass(), "typeRegistry", null);
        setField(term78466, term78466.getClass(), "templateTypeName", "");
        term78644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term78644, term78644.getClass(), "first", null);
        term78724 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term78724, term78724.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term78644;
        args[1] = term78724;
        callMethod(klass, "inferParameterTypes", argTypes, term78466, args);
    }

};


