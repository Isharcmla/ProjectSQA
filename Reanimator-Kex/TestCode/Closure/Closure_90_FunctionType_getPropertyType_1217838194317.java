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

public class FunctionType_getPropertyType_1217838194317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209992;
     Object term210189;
     Object term210167;

    public FunctionType_getPropertyType_1217838194317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209992 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term210110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term209992, term209992.getClass(), "prototype", term210110);
        term210189 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term210190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term210189, term210189.getClass(), "call", null);
        setField(term210190, term210190.getClass(), "ownerFunction", null);
        setField(term210190, term210190.getClass(), "className", null);
        setField(term210190, term210190.getClass(), "properties", null);
        setBooleanField(term210190, term210190.getClass(), "nativeType", false);
        setField(term210190, term210190.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term210190, term210190.getClass(), "prettyPrint", false);
        setBooleanField(term210190, term210190.getClass(), "visited", false);
        setField(term210190, term210190.getClass(), "docInfo", null);
        setBooleanField(term210190, term210190.getClass(), "unknown", false);
        setBooleanField(term210190, term210190.getClass(), "resolved", false);
        setField(term210190, term210190.getClass(), "resolveResult", null);
        setField(term210190, term210190.getClass(), "registry", null);
        setField(term210189, term210189.getClass(), "prototype", term210190);
        setField(term210189, term210189.getClass(), "kind", null);
        setField(term210189, term210189.getClass(), "typeOfThis", null);
        setField(term210189, term210189.getClass(), "source", null);
        setField(term210189, term210189.getClass(), "implementedInterfaces", null);
        setField(term210189, term210189.getClass(), "subTypes", null);
        setField(term210189, term210189.getClass(), "templateTypeName", null);
        setField(term210189, term210189.getClass(), "className", null);
        setField(term210189, term210189.getClass(), "properties", null);
        setBooleanField(term210189, term210189.getClass(), "nativeType", false);
        setField(term210189, term210189.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term210189, term210189.getClass(), "prettyPrint", false);
        setBooleanField(term210189, term210189.getClass(), "visited", false);
        setField(term210189, term210189.getClass(), "docInfo", null);
        setBooleanField(term210189, term210189.getClass(), "unknown", false);
        setBooleanField(term210189, term210189.getClass(), "resolved", false);
        setField(term210189, term210189.getClass(), "resolveResult", null);
        setField(term210189, term210189.getClass(), "registry", null);
        term210167 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term210167, term210167.getClass(), "ownerFunction", null);
        setField(term210167, term210167.getClass(), "className", null);
        setField(term210167, term210167.getClass(), "properties", null);
        setBooleanField(term210167, term210167.getClass(), "nativeType", false);
        setField(term210167, term210167.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term210167, term210167.getClass(), "prettyPrint", false);
        setBooleanField(term210167, term210167.getClass(), "visited", false);
        setField(term210167, term210167.getClass(), "docInfo", null);
        setBooleanField(term210167, term210167.getClass(), "unknown", false);
        setBooleanField(term210167, term210167.getClass(), "resolved", false);
        setField(term210167, term210167.getClass(), "resolveResult", null);
        setField(term210167, term210167.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "prototype";
        Object retValue = callMethod(klass, "getPropertyType", argTypes, term209992, args);
        assertTrue(recursiveEquals(term209992, term210189));
        assertTrue(recursiveEquals(retValue, term210167));
    }

};


