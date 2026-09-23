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

public class FunctionType_getParameters_1663846364117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61074;
     Object term61083;
     Object term61082;

    public FunctionType_getParameters_1663846364117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term61074, term61074.getClass(), "call", null);
        term61083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term61083, term61083.getClass(), "call", null);
        setField(term61083, term61083.getClass(), "prototype", null);
        setField(term61083, term61083.getClass(), "kind", null);
        setField(term61083, term61083.getClass(), "typeOfThis", null);
        setField(term61083, term61083.getClass(), "source", null);
        setField(term61083, term61083.getClass(), "implementedInterfaces", null);
        setField(term61083, term61083.getClass(), "subTypes", null);
        setField(term61083, term61083.getClass(), "templateTypeName", null);
        setField(term61083, term61083.getClass(), "className", null);
        setField(term61083, term61083.getClass(), "properties", null);
        setField(term61083, term61083.getClass(), "implicitPrototype", null);
        setBooleanField(term61083, term61083.getClass(), "nativeType", false);
        setBooleanField(term61083, term61083.getClass(), "visited", false);
        setField(term61083, term61083.getClass(), "docInfo", null);
        setBooleanField(term61083, term61083.getClass(), "unknown", false);
        setBooleanField(term61083, term61083.getClass(), "resolved", false);
        setField(term61083, term61083.getClass(), "resolveResult", null);
        setField(term61083, term61083.getClass(), "registry", null);
        term61082 = newInstance(Class.forName("java.util.Collections$EmptySet"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getParameters", argTypes, term61074, args);
        assertTrue(recursiveEquals(term61074, term61083));
        assertTrue(recursiveEquals(retValue, term61082));
    }

};


