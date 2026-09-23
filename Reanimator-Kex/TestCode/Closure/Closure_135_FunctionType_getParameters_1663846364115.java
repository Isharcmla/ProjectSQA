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

public class FunctionType_getParameters_1663846364115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60952;
     Object term60961;
     Object term60960;

    public FunctionType_getParameters_1663846364115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60952 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        term60961 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term60961, term60961.getClass(), "this$0", null);
        setField(term60961, term60961.getClass(), "call", null);
        setField(term60961, term60961.getClass(), "prototype", null);
        setField(term60961, term60961.getClass(), "kind", null);
        setField(term60961, term60961.getClass(), "typeOfThis", null);
        setField(term60961, term60961.getClass(), "source", null);
        setField(term60961, term60961.getClass(), "implementedInterfaces", null);
        setField(term60961, term60961.getClass(), "subTypes", null);
        setField(term60961, term60961.getClass(), "templateTypeName", null);
        setField(term60961, term60961.getClass(), "className", null);
        setField(term60961, term60961.getClass(), "properties", null);
        setField(term60961, term60961.getClass(), "implicitPrototype", null);
        setBooleanField(term60961, term60961.getClass(), "nativeType", false);
        setBooleanField(term60961, term60961.getClass(), "visited", false);
        setField(term60961, term60961.getClass(), "docInfo", null);
        setBooleanField(term60961, term60961.getClass(), "unknown", false);
        setBooleanField(term60961, term60961.getClass(), "resolved", false);
        setField(term60961, term60961.getClass(), "resolveResult", null);
        setField(term60961, term60961.getClass(), "registry", null);
        term60960 = newInstance(Class.forName("java.util.Collections$EmptySet"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getParameters", argTypes, term60952, args);
        assertTrue(recursiveEquals(term60952, term60961));
        assertTrue(recursiveEquals(retValue, term60960));
    }

};


