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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114169;
     Object term114373;
     Object term114677;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114169 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term114273 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term114169, term114169.getClass(), "returnType", null);
        setBooleanField(term114169, term114169.getClass(), "returnTypeInferred", false);
        setField(term114169, term114169.getClass(), "typeRegistry", term114273);
        term114373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term114467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term114537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term114467, term114467.getClass(), "returnType", null);
        setBooleanField(term114467, term114467.getClass(), "returnTypeInferred", false);
        setField(term114804, term114804.getClass(), "next", term114804);
        setField(term114804, term114804.getClass(), "jsType", null);
        setField(term114804, term114804.getClass(), "propListHead", null);
        setField(term114537, term114537.getClass(), "first", term114804);
        setField(term114467, term114467.getClass(), "parameters", term114537);
        setField(term114373, term114373.getClass(), "call", term114467);
        term114677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114769 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term114769, term114769.getClass(), "next", term114804);
        setField(term114677, term114677.getClass(), "first", term114769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term114373;
        args[1] = term114677;
        callMethod(klass, "inferFromOverriddenFunction", argTypes, term114169, args);
    }

};


