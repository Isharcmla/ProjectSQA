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

public class FunctionType_isEquivalentTo_230708275333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222242;
     Object term222500;
     Object term222934;
     Object term222938;

    public FunctionType_isEquivalentTo_230708275333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term222944 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term222943 = ((Class) term222944).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term222943).setAccessible(true);
        Object enum388 = ((Field) term222943).get((Object) null);
        term222242 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term222242, term222242.getClass(), "kind", enum388);
        term222500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term222500, term222500.getClass(), "kind", enum388);
        Class<? extends Object> term223244 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term223243 = ((Class) term223244).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term223243).setAccessible(true);
        Object enum389 = ((Field) term223243).get((Object) null);
        term222934 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term222934, term222934.getClass(), "call", null);
        setField(term222934, term222934.getClass(), "prototype", null);
        setField(term222934, term222934.getClass(), "kind", enum389);
        setField(term222934, term222934.getClass(), "typeOfThis", null);
        setField(term222934, term222934.getClass(), "source", null);
        setField(term222934, term222934.getClass(), "implementedInterfaces", null);
        setField(term222934, term222934.getClass(), "subTypes", null);
        setField(term222934, term222934.getClass(), "templateTypeName", null);
        setField(term222934, term222934.getClass(), "className", null);
        setField(term222934, term222934.getClass(), "properties", null);
        setBooleanField(term222934, term222934.getClass(), "nativeType", false);
        setField(term222934, term222934.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term222934, term222934.getClass(), "prettyPrint", false);
        setBooleanField(term222934, term222934.getClass(), "visited", false);
        setField(term222934, term222934.getClass(), "docInfo", null);
        setBooleanField(term222934, term222934.getClass(), "unknown", false);
        setBooleanField(term222934, term222934.getClass(), "resolved", false);
        setField(term222934, term222934.getClass(), "resolveResult", null);
        setField(term222934, term222934.getClass(), "registry", null);
        Class<? extends Object> term223544 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term223543 = ((Class) term223544).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term223543).setAccessible(true);
        Object enum390 = ((Field) term223543).get((Object) null);
        term222938 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term222938, term222938.getClass(), "call", null);
        setField(term222938, term222938.getClass(), "prototype", null);
        setField(term222938, term222938.getClass(), "kind", enum390);
        setField(term222938, term222938.getClass(), "typeOfThis", null);
        setField(term222938, term222938.getClass(), "source", null);
        setField(term222938, term222938.getClass(), "implementedInterfaces", null);
        setField(term222938, term222938.getClass(), "subTypes", null);
        setField(term222938, term222938.getClass(), "templateTypeName", null);
        setField(term222938, term222938.getClass(), "className", null);
        setField(term222938, term222938.getClass(), "properties", null);
        setBooleanField(term222938, term222938.getClass(), "nativeType", false);
        setField(term222938, term222938.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term222938, term222938.getClass(), "prettyPrint", false);
        setBooleanField(term222938, term222938.getClass(), "visited", false);
        setField(term222938, term222938.getClass(), "docInfo", null);
        setBooleanField(term222938, term222938.getClass(), "unknown", false);
        setBooleanField(term222938, term222938.getClass(), "resolved", false);
        setField(term222938, term222938.getClass(), "resolveResult", null);
        setField(term222938, term222938.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term222500;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term222242, args);
        assertTrue(recursiveEquals(term222242, term222934));
        assertTrue(recursiveEquals(term222500, term222938));
        assertTrue(recursiveEquals(retValue, false));
    }

};


