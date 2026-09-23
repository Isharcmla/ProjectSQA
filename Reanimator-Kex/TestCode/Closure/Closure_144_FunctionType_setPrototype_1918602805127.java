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

public class FunctionType_setPrototype_1918602805127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67631;
     Object term67646;

    public FunctionType_setPrototype_1918602805127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term67646 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term67646, term67646.getClass(), "call", null);
        setField(term67646, term67646.getClass(), "prototype", null);
        setField(term67646, term67646.getClass(), "kind", null);
        setField(term67646, term67646.getClass(), "typeOfThis", null);
        setField(term67646, term67646.getClass(), "source", null);
        setField(term67646, term67646.getClass(), "implementedInterfaces", null);
        setField(term67646, term67646.getClass(), "subTypes", null);
        setField(term67646, term67646.getClass(), "templateTypeName", null);
        setField(term67646, term67646.getClass(), "className", null);
        setField(term67646, term67646.getClass(), "properties", null);
        setField(term67646, term67646.getClass(), "implicitPrototype", null);
        setBooleanField(term67646, term67646.getClass(), "nativeType", false);
        setBooleanField(term67646, term67646.getClass(), "prettyPrint", false);
        setBooleanField(term67646, term67646.getClass(), "visited", false);
        setField(term67646, term67646.getClass(), "docInfo", null);
        setBooleanField(term67646, term67646.getClass(), "unknown", false);
        setBooleanField(term67646, term67646.getClass(), "resolved", false);
        setField(term67646, term67646.getClass(), "resolveResult", null);
        setField(term67646, term67646.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term67631, args);
        assertTrue(recursiveEquals(term67631, term67646));
        assertTrue(recursiveEquals(retValue, false));
    }

};


