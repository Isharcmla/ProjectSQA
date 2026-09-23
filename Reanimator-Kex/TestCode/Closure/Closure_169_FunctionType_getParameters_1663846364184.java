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

public class FunctionType_getParameters_1663846364184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94608;
     Object term215974;
     Object term215938;

    public FunctionType_getParameters_1663846364184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term94702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term94702, term94702.getClass(), "parameters", null);
        setField(term94608, term94608.getClass(), "call", term94702);
        term215974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term215975 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term215975, term215975.getClass(), "parameters", null);
        setField(term215975, term215975.getClass(), "returnType", null);
        setBooleanField(term215975, term215975.getClass(), "returnTypeInferred", false);
        setBooleanField(term215975, term215975.getClass(), "resolved", false);
        setField(term215975, term215975.getClass(), "resolveResult", null);
        setBooleanField(term215975, term215975.getClass(), "inTemplatedCheckVisit", false);
        setField(term215975, term215975.getClass(), "registry", null);
        setField(term215974, term215974.getClass(), "call", term215975);
        setField(term215974, term215974.getClass(), "prototypeSlot", null);
        setField(term215974, term215974.getClass(), "kind", null);
        setField(term215974, term215974.getClass(), "propAccess", null);
        setField(term215974, term215974.getClass(), "typeOfThis", null);
        setField(term215974, term215974.getClass(), "source", null);
        setField(term215974, term215974.getClass(), "implementedInterfaces", null);
        setField(term215974, term215974.getClass(), "extendedInterfaces", null);
        setField(term215974, term215974.getClass(), "subTypes", null);
        setField(term215974, term215974.getClass(), "templateTypeNames", null);
        setField(term215974, term215974.getClass(), "className", null);
        setField(term215974, term215974.getClass(), "properties", null);
        setBooleanField(term215974, term215974.getClass(), "nativeType", false);
        setField(term215974, term215974.getClass(), "implicitPrototypeFallback", null);
        setField(term215974, term215974.getClass(), "ownerFunction", null);
        setBooleanField(term215974, term215974.getClass(), "prettyPrint", false);
        setBooleanField(term215974, term215974.getClass(), "visited", false);
        setField(term215974, term215974.getClass(), "docInfo", null);
        setBooleanField(term215974, term215974.getClass(), "unknown", false);
        setBooleanField(term215974, term215974.getClass(), "resolved", false);
        setField(term215974, term215974.getClass(), "resolveResult", null);
        setBooleanField(term215974, term215974.getClass(), "inTemplatedCheckVisit", false);
        setField(term215974, term215974.getClass(), "registry", null);
        term215938 = newInstance(Class.forName("java.util.Collections$EmptySet"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getParameters", argTypes, term94608, args);
        assertTrue(recursiveEquals(term94608, term215974));
        assertTrue(recursiveEquals(retValue, term215938));
    }

};


