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

public class FunctionType_isEquivalentTo_230708275270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151350;
     Object term151608;
     Object term152684;
     Object term152688;

    public FunctionType_isEquivalentTo_230708275270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term152691 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term152690 = ((Class) term152691).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term152690).setAccessible(true);
        Object enum279 = ((Field) term152690).get((Object) null);
        term151350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term151350, term151350.getClass(), "kind", enum279);
        term151608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term152991 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term152990 = ((Class) term152991).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term152990).setAccessible(true);
        Object enum280 = ((Field) term152990).get((Object) null);
        term152684 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term152684, term152684.getClass(), "call", null);
        setField(term152684, term152684.getClass(), "prototype", null);
        setField(term152684, term152684.getClass(), "kind", enum280);
        setField(term152684, term152684.getClass(), "typeOfThis", null);
        setField(term152684, term152684.getClass(), "source", null);
        setField(term152684, term152684.getClass(), "implementedInterfaces", null);
        setField(term152684, term152684.getClass(), "subTypes", null);
        setField(term152684, term152684.getClass(), "templateTypeName", null);
        setField(term152684, term152684.getClass(), "className", null);
        setField(term152684, term152684.getClass(), "properties", null);
        setBooleanField(term152684, term152684.getClass(), "nativeType", false);
        setField(term152684, term152684.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term152684, term152684.getClass(), "prettyPrint", false);
        setBooleanField(term152684, term152684.getClass(), "visited", false);
        setField(term152684, term152684.getClass(), "docInfo", null);
        setBooleanField(term152684, term152684.getClass(), "unknown", false);
        setBooleanField(term152684, term152684.getClass(), "resolved", false);
        setField(term152684, term152684.getClass(), "resolveResult", null);
        setField(term152684, term152684.getClass(), "registry", null);
        term152688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term152688, term152688.getClass(), "call", null);
        setField(term152688, term152688.getClass(), "prototype", null);
        setField(term152688, term152688.getClass(), "kind", null);
        setField(term152688, term152688.getClass(), "typeOfThis", null);
        setField(term152688, term152688.getClass(), "source", null);
        setField(term152688, term152688.getClass(), "implementedInterfaces", null);
        setField(term152688, term152688.getClass(), "subTypes", null);
        setField(term152688, term152688.getClass(), "templateTypeName", null);
        setField(term152688, term152688.getClass(), "className", null);
        setField(term152688, term152688.getClass(), "properties", null);
        setBooleanField(term152688, term152688.getClass(), "nativeType", false);
        setField(term152688, term152688.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term152688, term152688.getClass(), "prettyPrint", false);
        setBooleanField(term152688, term152688.getClass(), "visited", false);
        setField(term152688, term152688.getClass(), "docInfo", null);
        setBooleanField(term152688, term152688.getClass(), "unknown", false);
        setBooleanField(term152688, term152688.getClass(), "resolved", false);
        setField(term152688, term152688.getClass(), "resolveResult", null);
        setField(term152688, term152688.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term151608;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term151350, args);
        assertTrue(recursiveEquals(term151350, term152684));
        assertTrue(recursiveEquals(term151608, term152688));
        assertTrue(recursiveEquals(retValue, false));
    }

};


