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

public class FunctionBuilder_copyFromOtherFunction_842235135189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131175;
     Object term131391;

    public FunctionBuilder_copyFromOtherFunction_842235135189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term131283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term131175, term131175.getClass(), "name", "");
        setField(term131175, term131175.getClass(), "sourceNode", null);
        setField(term131175, term131175.getClass(), "parametersNode", term131283);
        setField(term131175, term131175.getClass(), "returnType", null);
        term131391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term131485 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term131593 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term131693 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term131797 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term131391, term131391.getClass(), "className", null);
        setField(term131391, term131391.getClass(), "source", null);
        setField(term131485, term131485.getClass(), "parameters", null);
        setField(term131485, term131485.getClass(), "returnType", term131593);
        setField(term131391, term131391.getClass(), "call", term131485);
        setField(term131391, term131391.getClass(), "typeOfThis", term131693);
        setField(term131391, term131391.getClass(), "registry", term131797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term131391;
        try {
            callMethod(klass, "copyFromOtherFunction", argTypes, term131175, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


