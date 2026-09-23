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

public class FunctionType_addRelatedInterfaces_784954428189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86439;
     Object term86539;
     Object term86814;
     Object term86815;

    public FunctionType_addRelatedInterfaces_784954428189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86439 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term86539 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term86814 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term86814, term86814.getClass(), "call", null);
        setField(term86814, term86814.getClass(), "prototype", null);
        setField(term86814, term86814.getClass(), "kind", null);
        setField(term86814, term86814.getClass(), "typeOfThis", null);
        setField(term86814, term86814.getClass(), "source", null);
        setField(term86814, term86814.getClass(), "implementedInterfaces", null);
        setField(term86814, term86814.getClass(), "subTypes", null);
        setField(term86814, term86814.getClass(), "templateTypeName", null);
        setField(term86814, term86814.getClass(), "className", null);
        setField(term86814, term86814.getClass(), "properties", null);
        setField(term86814, term86814.getClass(), "implicitPrototype", null);
        setBooleanField(term86814, term86814.getClass(), "nativeType", false);
        setBooleanField(term86814, term86814.getClass(), "visited", false);
        setField(term86814, term86814.getClass(), "docInfo", null);
        setBooleanField(term86814, term86814.getClass(), "unknown", false);
        setBooleanField(term86814, term86814.getClass(), "resolved", false);
        setField(term86814, term86814.getClass(), "resolveResult", null);
        setField(term86814, term86814.getClass(), "registry", null);
        term86815 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term86815, term86815.getClass(), "call", null);
        setField(term86815, term86815.getClass(), "prototype", null);
        setField(term86815, term86815.getClass(), "kind", null);
        setField(term86815, term86815.getClass(), "typeOfThis", null);
        setField(term86815, term86815.getClass(), "source", null);
        setField(term86815, term86815.getClass(), "implementedInterfaces", null);
        setField(term86815, term86815.getClass(), "subTypes", null);
        setField(term86815, term86815.getClass(), "templateTypeName", null);
        setField(term86815, term86815.getClass(), "className", null);
        setField(term86815, term86815.getClass(), "properties", null);
        setField(term86815, term86815.getClass(), "implicitPrototype", null);
        setBooleanField(term86815, term86815.getClass(), "nativeType", false);
        setBooleanField(term86815, term86815.getClass(), "visited", false);
        setField(term86815, term86815.getClass(), "docInfo", null);
        setBooleanField(term86815, term86815.getClass(), "unknown", false);
        setBooleanField(term86815, term86815.getClass(), "resolved", false);
        setField(term86815, term86815.getClass(), "resolveResult", null);
        setField(term86815, term86815.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term86539;
        args[1] = null;
        callMethod(klass, "addRelatedInterfaces", argTypes, term86439, args);
        assertTrue(recursiveEquals(term86439, term86814));
        assertTrue(recursiveEquals(term86539, term86815));
    }

};


