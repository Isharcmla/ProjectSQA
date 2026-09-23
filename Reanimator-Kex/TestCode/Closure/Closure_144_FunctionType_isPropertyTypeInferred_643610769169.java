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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;

public class FunctionType_isPropertyTypeInferred_643610769169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85669;
     Object term85736;

    public FunctionType_isPropertyTypeInferred_643610769169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85669 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term85736 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term85736, term85736.getClass(), "call", null);
        setField(term85736, term85736.getClass(), "prototype", null);
        setField(term85736, term85736.getClass(), "kind", null);
        setField(term85736, term85736.getClass(), "typeOfThis", null);
        setField(term85736, term85736.getClass(), "source", null);
        setField(term85736, term85736.getClass(), "implementedInterfaces", null);
        setField(term85736, term85736.getClass(), "subTypes", null);
        setField(term85736, term85736.getClass(), "templateTypeName", null);
        setField(term85736, term85736.getClass(), "className", null);
        setField(term85736, term85736.getClass(), "properties", null);
        setField(term85736, term85736.getClass(), "implicitPrototype", null);
        setBooleanField(term85736, term85736.getClass(), "nativeType", false);
        setBooleanField(term85736, term85736.getClass(), "prettyPrint", false);
        setBooleanField(term85736, term85736.getClass(), "visited", false);
        setField(term85736, term85736.getClass(), "docInfo", null);
        setBooleanField(term85736, term85736.getClass(), "unknown", false);
        setBooleanField(term85736, term85736.getClass(), "resolved", false);
        setField(term85736, term85736.getClass(), "resolveResult", null);
        setField(term85736, term85736.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "prototype";
        Object retValue = callMethod(klass, "isPropertyTypeInferred", argTypes, term85669, args);
        assertTrue(recursiveEquals(term85669, term85736));
        assertTrue(recursiveEquals(retValue, true));
    }

};


