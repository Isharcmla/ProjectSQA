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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionBuilder_copyFromOtherFunction_842235135241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176758;
     Object term176904;

    public FunctionBuilder_copyFromOtherFunction_842235135241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term176758, term176758.getClass(), "name", "");
        setField(term176758, term176758.getClass(), "sourceNode", null);
        setField(term176758, term176758.getClass(), "parametersNode", null);
        setField(term176758, term176758.getClass(), "returnType", null);
        term176904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term177036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term177136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term177240 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term176287 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term176904, term176904.getClass(), "className", "");
        setField(term176904, term176904.getClass(), "source", null);
        setField(term177036, term177036.getClass(), "parameters", null);
        setField(term177036, term177036.getClass(), "returnType", null);
        setField(term176904, term176904.getClass(), "call", term177036);
        setField(term176904, term176904.getClass(), "typeOfThis", term177136);
        setField(term177240, term177240.getClass(), "nativeTypes", term176287);
        setField(term176904, term176904.getClass(), "registry", term177240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term176904;
        try {
            callMethod(klass, "copyFromOtherFunction", argTypes, term176758, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


