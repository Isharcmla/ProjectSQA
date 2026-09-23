package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionBuilder_copyFromOtherFunction_842235135235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169885;
     Object term170103;

    public FunctionBuilder_copyFromOtherFunction_842235135235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term169993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term169885, term169885.getClass(), "name", "");
        setField(term169885, term169885.getClass(), "sourceNode", null);
        setField(term169885, term169885.getClass(), "parametersNode", term169993);
        setField(term169885, term169885.getClass(), "returnType", null);
        term170103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term170197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term170307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term170407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term170511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term170103, term170103.getClass(), "className", null);
        setField(term170103, term170103.getClass(), "source", null);
        setField(term170197, term170197.getClass(), "parameters", null);
        setField(term170197, term170197.getClass(), "returnType", term170307);
        setField(term170103, term170103.getClass(), "call", term170197);
        setField(term170103, term170103.getClass(), "typeOfThis", term170407);
        setField(term170103, term170103.getClass(), "registry", term170511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term170103;
        try {
            callMethod(klass, "copyFromOtherFunction", argTypes, term169885, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


