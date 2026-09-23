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
import java.lang.Object;

public class FunctionType_getPropertyType_1217838194261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149896;
     Object term151315;
     Object term151293;

    public FunctionType_getPropertyType_1217838194261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149896 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term150014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term149896, term149896.getClass(), "prototype", term150014);
        term151315 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term151316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term151315, term151315.getClass(), "call", null);
        setField(term151316, term151316.getClass(), "ownerFunction", null);
        setField(term151316, term151316.getClass(), "className", null);
        setField(term151316, term151316.getClass(), "properties", null);
        setField(term151316, term151316.getClass(), "implicitPrototype", null);
        setBooleanField(term151316, term151316.getClass(), "nativeType", false);
        setBooleanField(term151316, term151316.getClass(), "prettyPrint", false);
        setBooleanField(term151316, term151316.getClass(), "visited", false);
        setField(term151316, term151316.getClass(), "docInfo", null);
        setBooleanField(term151316, term151316.getClass(), "unknown", false);
        setBooleanField(term151316, term151316.getClass(), "resolved", false);
        setField(term151316, term151316.getClass(), "resolveResult", null);
        setField(term151316, term151316.getClass(), "registry", null);
        setField(term151315, term151315.getClass(), "prototype", term151316);
        setField(term151315, term151315.getClass(), "kind", null);
        setField(term151315, term151315.getClass(), "typeOfThis", null);
        setField(term151315, term151315.getClass(), "source", null);
        setField(term151315, term151315.getClass(), "implementedInterfaces", null);
        setField(term151315, term151315.getClass(), "subTypes", null);
        setField(term151315, term151315.getClass(), "templateTypeName", null);
        setField(term151315, term151315.getClass(), "className", null);
        setField(term151315, term151315.getClass(), "properties", null);
        setField(term151315, term151315.getClass(), "implicitPrototype", null);
        setBooleanField(term151315, term151315.getClass(), "nativeType", false);
        setBooleanField(term151315, term151315.getClass(), "prettyPrint", false);
        setBooleanField(term151315, term151315.getClass(), "visited", false);
        setField(term151315, term151315.getClass(), "docInfo", null);
        setBooleanField(term151315, term151315.getClass(), "unknown", false);
        setBooleanField(term151315, term151315.getClass(), "resolved", false);
        setField(term151315, term151315.getClass(), "resolveResult", null);
        setField(term151315, term151315.getClass(), "registry", null);
        term151293 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term151293, term151293.getClass(), "ownerFunction", null);
        setField(term151293, term151293.getClass(), "className", null);
        setField(term151293, term151293.getClass(), "properties", null);
        setField(term151293, term151293.getClass(), "implicitPrototype", null);
        setBooleanField(term151293, term151293.getClass(), "nativeType", false);
        setBooleanField(term151293, term151293.getClass(), "prettyPrint", false);
        setBooleanField(term151293, term151293.getClass(), "visited", false);
        setField(term151293, term151293.getClass(), "docInfo", null);
        setBooleanField(term151293, term151293.getClass(), "unknown", false);
        setBooleanField(term151293, term151293.getClass(), "resolved", false);
        setField(term151293, term151293.getClass(), "resolveResult", null);
        setField(term151293, term151293.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "prototype";
        Object retValue = callMethod(klass, "getPropertyType", argTypes, term149896, args);
        assertTrue(recursiveEquals(term149896, term151315));
        assertTrue(recursiveEquals(retValue, term151293));
    }

};


