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

public class FunctionType_setPrototypeBasedOn_1012666130267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158054;
     Object term158205;

    public FunctionType_setPrototypeBasedOn_1012666130267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158054 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term158172 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term158172, term158172.getClass(), "unknown", true);
        setField(term158054, term158054.getClass(), "prototype", term158172);
        term158205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term158206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term158205, term158205.getClass(), "call", null);
        setField(term158206, term158206.getClass(), "ownerFunction", null);
        setField(term158206, term158206.getClass(), "className", null);
        setField(term158206, term158206.getClass(), "properties", null);
        setBooleanField(term158206, term158206.getClass(), "nativeType", false);
        setField(term158206, term158206.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term158206, term158206.getClass(), "prettyPrint", false);
        setBooleanField(term158206, term158206.getClass(), "visited", false);
        setField(term158206, term158206.getClass(), "docInfo", null);
        setBooleanField(term158206, term158206.getClass(), "unknown", true);
        setBooleanField(term158206, term158206.getClass(), "resolved", false);
        setField(term158206, term158206.getClass(), "resolveResult", null);
        setField(term158206, term158206.getClass(), "registry", null);
        setField(term158205, term158205.getClass(), "prototype", term158206);
        setField(term158205, term158205.getClass(), "kind", null);
        setField(term158205, term158205.getClass(), "typeOfThis", null);
        setField(term158205, term158205.getClass(), "source", null);
        setField(term158205, term158205.getClass(), "implementedInterfaces", null);
        setField(term158205, term158205.getClass(), "subTypes", null);
        setField(term158205, term158205.getClass(), "templateTypeName", null);
        setField(term158205, term158205.getClass(), "className", null);
        setField(term158205, term158205.getClass(), "properties", null);
        setBooleanField(term158205, term158205.getClass(), "nativeType", false);
        setField(term158205, term158205.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term158205, term158205.getClass(), "prettyPrint", false);
        setBooleanField(term158205, term158205.getClass(), "visited", false);
        setField(term158205, term158205.getClass(), "docInfo", null);
        setBooleanField(term158205, term158205.getClass(), "unknown", false);
        setBooleanField(term158205, term158205.getClass(), "resolved", false);
        setField(term158205, term158205.getClass(), "resolveResult", null);
        setField(term158205, term158205.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term158054, args);
        assertTrue(recursiveEquals(term158054, term158205));
    }

};


