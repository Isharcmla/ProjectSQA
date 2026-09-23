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

public class FunctionType_getPropertyType_1217838194215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109188;
     Object term109385;
     Object term109363;

    public FunctionType_getPropertyType_1217838194215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109188 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term109306 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term109188, term109188.getClass(), "prototype", term109306);
        term109385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term109386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term109385, term109385.getClass(), "call", null);
        setField(term109386, term109386.getClass(), "ownerFunction", null);
        setField(term109386, term109386.getClass(), "className", null);
        setField(term109386, term109386.getClass(), "properties", null);
        setBooleanField(term109386, term109386.getClass(), "nativeType", false);
        setField(term109386, term109386.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term109386, term109386.getClass(), "prettyPrint", false);
        setBooleanField(term109386, term109386.getClass(), "visited", false);
        setField(term109386, term109386.getClass(), "docInfo", null);
        setBooleanField(term109386, term109386.getClass(), "unknown", false);
        setBooleanField(term109386, term109386.getClass(), "resolved", false);
        setField(term109386, term109386.getClass(), "resolveResult", null);
        setField(term109386, term109386.getClass(), "registry", null);
        setField(term109385, term109385.getClass(), "prototype", term109386);
        setField(term109385, term109385.getClass(), "kind", null);
        setField(term109385, term109385.getClass(), "typeOfThis", null);
        setField(term109385, term109385.getClass(), "source", null);
        setField(term109385, term109385.getClass(), "implementedInterfaces", null);
        setField(term109385, term109385.getClass(), "subTypes", null);
        setField(term109385, term109385.getClass(), "templateTypeName", null);
        setField(term109385, term109385.getClass(), "className", null);
        setField(term109385, term109385.getClass(), "properties", null);
        setBooleanField(term109385, term109385.getClass(), "nativeType", false);
        setField(term109385, term109385.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term109385, term109385.getClass(), "prettyPrint", false);
        setBooleanField(term109385, term109385.getClass(), "visited", false);
        setField(term109385, term109385.getClass(), "docInfo", null);
        setBooleanField(term109385, term109385.getClass(), "unknown", false);
        setBooleanField(term109385, term109385.getClass(), "resolved", false);
        setField(term109385, term109385.getClass(), "resolveResult", null);
        setField(term109385, term109385.getClass(), "registry", null);
        term109363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term109363, term109363.getClass(), "ownerFunction", null);
        setField(term109363, term109363.getClass(), "className", null);
        setField(term109363, term109363.getClass(), "properties", null);
        setBooleanField(term109363, term109363.getClass(), "nativeType", false);
        setField(term109363, term109363.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term109363, term109363.getClass(), "prettyPrint", false);
        setBooleanField(term109363, term109363.getClass(), "visited", false);
        setField(term109363, term109363.getClass(), "docInfo", null);
        setBooleanField(term109363, term109363.getClass(), "unknown", false);
        setBooleanField(term109363, term109363.getClass(), "resolved", false);
        setField(term109363, term109363.getClass(), "resolveResult", null);
        setField(term109363, term109363.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "prototype";
        Object retValue = callMethod(klass, "getPropertyType", argTypes, term109188, args);
        assertTrue(recursiveEquals(term109188, term109385));
        assertTrue(recursiveEquals(retValue, term109363));
    }

};


