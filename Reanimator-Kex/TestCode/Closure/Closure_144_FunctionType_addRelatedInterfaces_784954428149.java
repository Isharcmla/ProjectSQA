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

public class FunctionType_addRelatedInterfaces_784954428149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75063;
     Object term75163;
     Object term75177;
     Object term75178;

    public FunctionType_addRelatedInterfaces_784954428149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75063 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term75163 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term75177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term75177, term75177.getClass(), "call", null);
        setField(term75177, term75177.getClass(), "prototype", null);
        setField(term75177, term75177.getClass(), "kind", null);
        setField(term75177, term75177.getClass(), "typeOfThis", null);
        setField(term75177, term75177.getClass(), "source", null);
        setField(term75177, term75177.getClass(), "implementedInterfaces", null);
        setField(term75177, term75177.getClass(), "subTypes", null);
        setField(term75177, term75177.getClass(), "templateTypeName", null);
        setField(term75177, term75177.getClass(), "className", null);
        setField(term75177, term75177.getClass(), "properties", null);
        setField(term75177, term75177.getClass(), "implicitPrototype", null);
        setBooleanField(term75177, term75177.getClass(), "nativeType", false);
        setBooleanField(term75177, term75177.getClass(), "prettyPrint", false);
        setBooleanField(term75177, term75177.getClass(), "visited", false);
        setField(term75177, term75177.getClass(), "docInfo", null);
        setBooleanField(term75177, term75177.getClass(), "unknown", false);
        setBooleanField(term75177, term75177.getClass(), "resolved", false);
        setField(term75177, term75177.getClass(), "resolveResult", null);
        setField(term75177, term75177.getClass(), "registry", null);
        term75178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term75178, term75178.getClass(), "call", null);
        setField(term75178, term75178.getClass(), "prototype", null);
        setField(term75178, term75178.getClass(), "kind", null);
        setField(term75178, term75178.getClass(), "typeOfThis", null);
        setField(term75178, term75178.getClass(), "source", null);
        setField(term75178, term75178.getClass(), "implementedInterfaces", null);
        setField(term75178, term75178.getClass(), "subTypes", null);
        setField(term75178, term75178.getClass(), "templateTypeName", null);
        setField(term75178, term75178.getClass(), "className", null);
        setField(term75178, term75178.getClass(), "properties", null);
        setField(term75178, term75178.getClass(), "implicitPrototype", null);
        setBooleanField(term75178, term75178.getClass(), "nativeType", false);
        setBooleanField(term75178, term75178.getClass(), "prettyPrint", false);
        setBooleanField(term75178, term75178.getClass(), "visited", false);
        setField(term75178, term75178.getClass(), "docInfo", null);
        setBooleanField(term75178, term75178.getClass(), "unknown", false);
        setBooleanField(term75178, term75178.getClass(), "resolved", false);
        setField(term75178, term75178.getClass(), "resolveResult", null);
        setField(term75178, term75178.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term75163;
        args[1] = null;
        callMethod(klass, "addRelatedInterfaces", argTypes, term75063, args);
        assertTrue(recursiveEquals(term75063, term75177));
        assertTrue(recursiveEquals(term75163, term75178));
    }

};


