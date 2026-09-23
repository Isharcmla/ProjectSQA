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

public class FunctionType_defineProperty_1349755729217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114289;
     Object term114421;
     Object term115371;
     Object term115372;

    public FunctionType_defineProperty_1349755729217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114289 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term114421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        term115371 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term115371, term115371.getClass(), "call", null);
        setField(term115371, term115371.getClass(), "prototype", null);
        setField(term115371, term115371.getClass(), "kind", null);
        setField(term115371, term115371.getClass(), "typeOfThis", null);
        setField(term115371, term115371.getClass(), "source", null);
        setField(term115371, term115371.getClass(), "implementedInterfaces", null);
        setField(term115371, term115371.getClass(), "subTypes", null);
        setField(term115371, term115371.getClass(), "templateTypeName", null);
        setField(term115371, term115371.getClass(), "className", null);
        setField(term115371, term115371.getClass(), "properties", null);
        setField(term115371, term115371.getClass(), "implicitPrototype", null);
        setBooleanField(term115371, term115371.getClass(), "nativeType", false);
        setBooleanField(term115371, term115371.getClass(), "prettyPrint", false);
        setBooleanField(term115371, term115371.getClass(), "visited", false);
        setField(term115371, term115371.getClass(), "docInfo", null);
        setBooleanField(term115371, term115371.getClass(), "unknown", false);
        setBooleanField(term115371, term115371.getClass(), "resolved", false);
        setField(term115371, term115371.getClass(), "resolveResult", null);
        setField(term115371, term115371.getClass(), "registry", null);
        term115372 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term115372, term115372.getClass(), "parameters", null);
        setField(term115372, term115372.getClass(), "returnType", null);
        setBooleanField(term115372, term115372.getClass(), "returnTypeInferred", false);
        setBooleanField(term115372, term115372.getClass(), "resolved", false);
        setField(term115372, term115372.getClass(), "resolveResult", null);
        setField(term115372, term115372.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "prototype";
        args[1] = term114421;
        args[2] = false;
        args[3] = false;
        Object retValue = callMethod(klass, "defineProperty", argTypes, term114289, args);
        assertTrue(recursiveEquals(term114289, term115371));
        assertTrue(recursiveEquals(term114421, "prototype"));
        assertTrue(recursiveEquals(retValue, false));
    }

};


