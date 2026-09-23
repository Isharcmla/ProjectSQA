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

public class FunctionBuilder_build_175921649079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60531;

    public FunctionBuilder_build_175921649079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60531 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term60635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term60068 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        Object term60743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term60635, term60635.getClass(), "nativeTypes", term60068);
        setField(term60531, term60531.getClass(), "registry", term60635);
        setField(term60531, term60531.getClass(), "name", "U2U_CONSTRUCTOR_TYPE");
        setField(term60531, term60531.getClass(), "sourceNode", null);
        setField(term60531, term60531.getClass(), "parametersNode", term60743);
        setField(term60531, term60531.getClass(), "returnType", term60837);
        setBooleanField(term60531, term60531.getClass(), "inferredReturnType", false);
        setField(term60531, term60531.getClass(), "typeOfThis", null);
        setField(term60531, term60531.getClass(), "templateTypeName", "NUMBER_STRING");
        setBooleanField(term60531, term60531.getClass(), "isConstructor", false);
        setBooleanField(term60531, term60531.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "build", argTypes, term60531, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


