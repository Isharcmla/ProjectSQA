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

public class FunctionType_addRelatedInterfaces_784954428251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144066;
     Object term144176;
     Object term145191;
     Object term145192;

    public FunctionType_addRelatedInterfaces_784954428251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term144176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term145191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term145191, term145191.getClass(), "call", null);
        setField(term145191, term145191.getClass(), "prototype", null);
        setField(term145191, term145191.getClass(), "kind", null);
        setField(term145191, term145191.getClass(), "typeOfThis", null);
        setField(term145191, term145191.getClass(), "source", null);
        setField(term145191, term145191.getClass(), "implementedInterfaces", null);
        setField(term145191, term145191.getClass(), "subTypes", null);
        setField(term145191, term145191.getClass(), "templateTypeName", null);
        setField(term145191, term145191.getClass(), "className", null);
        setField(term145191, term145191.getClass(), "properties", null);
        setBooleanField(term145191, term145191.getClass(), "nativeType", false);
        setField(term145191, term145191.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term145191, term145191.getClass(), "prettyPrint", false);
        setBooleanField(term145191, term145191.getClass(), "visited", false);
        setField(term145191, term145191.getClass(), "docInfo", null);
        setBooleanField(term145191, term145191.getClass(), "unknown", false);
        setBooleanField(term145191, term145191.getClass(), "resolved", false);
        setField(term145191, term145191.getClass(), "resolveResult", null);
        setField(term145191, term145191.getClass(), "registry", null);
        term145192 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term145192, term145192.getClass(), "call", null);
        setField(term145192, term145192.getClass(), "prototype", null);
        setField(term145192, term145192.getClass(), "kind", null);
        setField(term145192, term145192.getClass(), "typeOfThis", null);
        setField(term145192, term145192.getClass(), "source", null);
        setField(term145192, term145192.getClass(), "implementedInterfaces", null);
        setField(term145192, term145192.getClass(), "subTypes", null);
        setField(term145192, term145192.getClass(), "templateTypeName", null);
        setField(term145192, term145192.getClass(), "className", null);
        setField(term145192, term145192.getClass(), "properties", null);
        setBooleanField(term145192, term145192.getClass(), "nativeType", false);
        setField(term145192, term145192.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term145192, term145192.getClass(), "prettyPrint", false);
        setBooleanField(term145192, term145192.getClass(), "visited", false);
        setField(term145192, term145192.getClass(), "docInfo", null);
        setBooleanField(term145192, term145192.getClass(), "unknown", false);
        setBooleanField(term145192, term145192.getClass(), "resolved", false);
        setField(term145192, term145192.getClass(), "resolveResult", null);
        setField(term145192, term145192.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term144176;
        args[1] = null;
        callMethod(klass, "addRelatedInterfaces", argTypes, term144066, args);
        assertTrue(recursiveEquals(term144066, term145191));
        assertTrue(recursiveEquals(term144176, term145192));
    }

};


