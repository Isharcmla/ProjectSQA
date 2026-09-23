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

public class FunctionType_getMinArguments_929645872133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68178;
     Object term68286;

    public FunctionType_getMinArguments_929645872133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term68272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term68272, term68272.getClass(), "parameters", null);
        setField(term68178, term68178.getClass(), "call", term68272);
        term68286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term68287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term68287, term68287.getClass(), "parameters", null);
        setField(term68287, term68287.getClass(), "returnType", null);
        setBooleanField(term68287, term68287.getClass(), "returnTypeInferred", false);
        setBooleanField(term68287, term68287.getClass(), "resolved", false);
        setField(term68287, term68287.getClass(), "resolveResult", null);
        setField(term68287, term68287.getClass(), "registry", null);
        setField(term68286, term68286.getClass(), "call", term68287);
        setField(term68286, term68286.getClass(), "prototype", null);
        setField(term68286, term68286.getClass(), "prototypeSlot", null);
        setField(term68286, term68286.getClass(), "kind", null);
        setField(term68286, term68286.getClass(), "typeOfThis", null);
        setField(term68286, term68286.getClass(), "source", null);
        setField(term68286, term68286.getClass(), "implementedInterfaces", null);
        setField(term68286, term68286.getClass(), "extendedInterfaces", null);
        setField(term68286, term68286.getClass(), "subTypes", null);
        setField(term68286, term68286.getClass(), "templateTypeName", null);
        setField(term68286, term68286.getClass(), "className", null);
        setField(term68286, term68286.getClass(), "properties", null);
        setBooleanField(term68286, term68286.getClass(), "nativeType", false);
        setField(term68286, term68286.getClass(), "implicitPrototypeFallback", null);
        setField(term68286, term68286.getClass(), "ownerFunction", null);
        setBooleanField(term68286, term68286.getClass(), "prettyPrint", false);
        setBooleanField(term68286, term68286.getClass(), "visited", false);
        setField(term68286, term68286.getClass(), "docInfo", null);
        setBooleanField(term68286, term68286.getClass(), "unknown", false);
        setBooleanField(term68286, term68286.getClass(), "resolved", false);
        setField(term68286, term68286.getClass(), "resolveResult", null);
        setField(term68286, term68286.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMinArguments", argTypes, term68178, args);
        assertTrue(recursiveEquals(term68178, term68286));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


