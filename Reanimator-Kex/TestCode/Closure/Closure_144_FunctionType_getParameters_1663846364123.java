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

public class FunctionType_getParameters_1663846364123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65500;
     Object term66617;
     Object term66616;

    public FunctionType_getParameters_1663846364123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term65594 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term65594, term65594.getClass(), "parameters", null);
        setField(term65500, term65500.getClass(), "call", term65594);
        term66617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term66618 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term66618, term66618.getClass(), "parameters", null);
        setField(term66618, term66618.getClass(), "returnType", null);
        setBooleanField(term66618, term66618.getClass(), "returnTypeInferred", false);
        setBooleanField(term66618, term66618.getClass(), "resolved", false);
        setField(term66618, term66618.getClass(), "resolveResult", null);
        setField(term66618, term66618.getClass(), "registry", null);
        setField(term66617, term66617.getClass(), "call", term66618);
        setField(term66617, term66617.getClass(), "prototype", null);
        setField(term66617, term66617.getClass(), "kind", null);
        setField(term66617, term66617.getClass(), "typeOfThis", null);
        setField(term66617, term66617.getClass(), "source", null);
        setField(term66617, term66617.getClass(), "implementedInterfaces", null);
        setField(term66617, term66617.getClass(), "subTypes", null);
        setField(term66617, term66617.getClass(), "templateTypeName", null);
        setField(term66617, term66617.getClass(), "className", null);
        setField(term66617, term66617.getClass(), "properties", null);
        setField(term66617, term66617.getClass(), "implicitPrototype", null);
        setBooleanField(term66617, term66617.getClass(), "nativeType", false);
        setBooleanField(term66617, term66617.getClass(), "prettyPrint", false);
        setBooleanField(term66617, term66617.getClass(), "visited", false);
        setField(term66617, term66617.getClass(), "docInfo", null);
        setBooleanField(term66617, term66617.getClass(), "unknown", false);
        setBooleanField(term66617, term66617.getClass(), "resolved", false);
        setField(term66617, term66617.getClass(), "resolveResult", null);
        setField(term66617, term66617.getClass(), "registry", null);
        term66616 = newInstance(Class.forName("java.util.Collections$EmptySet"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getParameters", argTypes, term65500, args);
        assertTrue(recursiveEquals(term65500, term66617));
        assertTrue(recursiveEquals(retValue, term66616));
    }

};


