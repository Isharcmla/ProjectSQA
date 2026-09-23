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

public class FunctionTypeBuilder_inferParameterTypes_212883572241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79444;
     Object term79618;
     Object term79768;

    public FunctionTypeBuilder_inferParameterTypes_212883572241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79444 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term79548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term79444, term79444.getClass(), "parametersNode", null);
        setField(term79444, term79444.getClass(), "typeRegistry", term79548);
        term79618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term79618, term79618.getClass(), "first", term79688);
        term79768 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term79768, term79768.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term79618;
        args[1] = term79768;
        callMethod(klass, "inferParameterTypes", argTypes, term79444, args);
    }

};


