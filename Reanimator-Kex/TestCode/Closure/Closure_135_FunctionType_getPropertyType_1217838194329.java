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

public class FunctionType_getPropertyType_1217838194329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188473;
     Object term188667;
     Object term188647;

    public FunctionType_getPropertyType_1217838194329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term188591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term188473, term188473.getClass(), "prototype", term188591);
        term188667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term188668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term188667, term188667.getClass(), "call", null);
        setField(term188668, term188668.getClass(), "ownerFunction", null);
        setField(term188668, term188668.getClass(), "className", null);
        setField(term188668, term188668.getClass(), "properties", null);
        setField(term188668, term188668.getClass(), "implicitPrototype", null);
        setBooleanField(term188668, term188668.getClass(), "nativeType", false);
        setBooleanField(term188668, term188668.getClass(), "visited", false);
        setField(term188668, term188668.getClass(), "docInfo", null);
        setBooleanField(term188668, term188668.getClass(), "unknown", false);
        setBooleanField(term188668, term188668.getClass(), "resolved", false);
        setField(term188668, term188668.getClass(), "resolveResult", null);
        setField(term188668, term188668.getClass(), "registry", null);
        setField(term188667, term188667.getClass(), "prototype", term188668);
        setField(term188667, term188667.getClass(), "kind", null);
        setField(term188667, term188667.getClass(), "typeOfThis", null);
        setField(term188667, term188667.getClass(), "source", null);
        setField(term188667, term188667.getClass(), "implementedInterfaces", null);
        setField(term188667, term188667.getClass(), "subTypes", null);
        setField(term188667, term188667.getClass(), "templateTypeName", null);
        setField(term188667, term188667.getClass(), "className", null);
        setField(term188667, term188667.getClass(), "properties", null);
        setField(term188667, term188667.getClass(), "implicitPrototype", null);
        setBooleanField(term188667, term188667.getClass(), "nativeType", false);
        setBooleanField(term188667, term188667.getClass(), "visited", false);
        setField(term188667, term188667.getClass(), "docInfo", null);
        setBooleanField(term188667, term188667.getClass(), "unknown", false);
        setBooleanField(term188667, term188667.getClass(), "resolved", false);
        setField(term188667, term188667.getClass(), "resolveResult", null);
        setField(term188667, term188667.getClass(), "registry", null);
        term188647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term188647, term188647.getClass(), "ownerFunction", null);
        setField(term188647, term188647.getClass(), "className", null);
        setField(term188647, term188647.getClass(), "properties", null);
        setField(term188647, term188647.getClass(), "implicitPrototype", null);
        setBooleanField(term188647, term188647.getClass(), "nativeType", false);
        setBooleanField(term188647, term188647.getClass(), "visited", false);
        setField(term188647, term188647.getClass(), "docInfo", null);
        setBooleanField(term188647, term188647.getClass(), "unknown", false);
        setBooleanField(term188647, term188647.getClass(), "resolved", false);
        setField(term188647, term188647.getClass(), "resolveResult", null);
        setField(term188647, term188647.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "prototype";
        Object retValue = callMethod(klass, "getPropertyType", argTypes, term188473, args);
        assertTrue(recursiveEquals(term188473, term188667));
        assertTrue(recursiveEquals(retValue, term188647));
    }

};


