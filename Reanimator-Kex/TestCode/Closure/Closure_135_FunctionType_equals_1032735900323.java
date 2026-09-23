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
import java.lang.String;
import java.lang.Object;

public class FunctionType_equals_1032735900323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184804;
     Object term185052;
     Object term185393;
     Object term185397;

    public FunctionType_equals_1032735900323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term185400 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term185399 = ((Class) term185400).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term185399).setAccessible(true);
        Object enum340 = ((Field) term185399).get((Object) null);
        term184804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term184804, term184804.getClass(), "kind", enum340);
        term185052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Class<? extends Object> term185700 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term185699 = ((Class) term185700).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term185699).setAccessible(true);
        Object enum341 = ((Field) term185699).get((Object) null);
        term185393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term185393, term185393.getClass(), "call", null);
        setField(term185393, term185393.getClass(), "prototype", null);
        setField(term185393, term185393.getClass(), "kind", enum341);
        setField(term185393, term185393.getClass(), "typeOfThis", null);
        setField(term185393, term185393.getClass(), "source", null);
        setField(term185393, term185393.getClass(), "implementedInterfaces", null);
        setField(term185393, term185393.getClass(), "subTypes", null);
        setField(term185393, term185393.getClass(), "templateTypeName", null);
        setField(term185393, term185393.getClass(), "className", null);
        setField(term185393, term185393.getClass(), "properties", null);
        setField(term185393, term185393.getClass(), "implicitPrototype", null);
        setBooleanField(term185393, term185393.getClass(), "nativeType", false);
        setBooleanField(term185393, term185393.getClass(), "visited", false);
        setField(term185393, term185393.getClass(), "docInfo", null);
        setBooleanField(term185393, term185393.getClass(), "unknown", false);
        setBooleanField(term185393, term185393.getClass(), "resolved", false);
        setField(term185393, term185393.getClass(), "resolveResult", null);
        setField(term185393, term185393.getClass(), "registry", null);
        term185397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term185397, term185397.getClass(), "call", null);
        setField(term185397, term185397.getClass(), "prototype", null);
        setField(term185397, term185397.getClass(), "kind", null);
        setField(term185397, term185397.getClass(), "typeOfThis", null);
        setField(term185397, term185397.getClass(), "source", null);
        setField(term185397, term185397.getClass(), "implementedInterfaces", null);
        setField(term185397, term185397.getClass(), "subTypes", null);
        setField(term185397, term185397.getClass(), "templateTypeName", null);
        setField(term185397, term185397.getClass(), "className", null);
        setField(term185397, term185397.getClass(), "properties", null);
        setField(term185397, term185397.getClass(), "implicitPrototype", null);
        setBooleanField(term185397, term185397.getClass(), "nativeType", false);
        setBooleanField(term185397, term185397.getClass(), "visited", false);
        setField(term185397, term185397.getClass(), "docInfo", null);
        setBooleanField(term185397, term185397.getClass(), "unknown", false);
        setBooleanField(term185397, term185397.getClass(), "resolved", false);
        setField(term185397, term185397.getClass(), "resolveResult", null);
        setField(term185397, term185397.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term185052;
        Object retValue = callMethod(klass, "equals", argTypes, term184804, args);
        assertTrue(recursiveEquals(term184804, term185393));
        assertTrue(recursiveEquals(term185052, term185397));
        assertTrue(recursiveEquals(retValue, false));
    }

};


