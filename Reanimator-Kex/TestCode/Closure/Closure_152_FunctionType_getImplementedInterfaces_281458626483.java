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

public class FunctionType_getImplementedInterfaces_281458626483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418428;
     Object term419045;

    public FunctionType_getImplementedInterfaces_281458626483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term419051 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term419050 = ((Class) term419051).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term419050).setAccessible(true);
        Object enum689 = ((Field) term419050).get((Object) null);
        term418428 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term418694 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term418428, term418428.getClass(), "kind", enum689);
        setField(term418428, term418428.getClass(), "prototype", term418694);
        Class<? extends Object> term419351 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term419350 = ((Class) term419351).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term419350).setAccessible(true);
        Object enum690 = ((Field) term419350).get((Object) null);
        term419045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term419046 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term419045, term419045.getClass(), "call", null);
        setField(term419046, term419046.getClass(), "ownerFunction", null);
        setField(term419046, term419046.getClass(), "className", null);
        setField(term419046, term419046.getClass(), "properties", null);
        setBooleanField(term419046, term419046.getClass(), "nativeType", false);
        setField(term419046, term419046.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term419046, term419046.getClass(), "prettyPrint", false);
        setBooleanField(term419046, term419046.getClass(), "visited", false);
        setField(term419046, term419046.getClass(), "docInfo", null);
        setBooleanField(term419046, term419046.getClass(), "unknown", false);
        setBooleanField(term419046, term419046.getClass(), "resolved", false);
        setField(term419046, term419046.getClass(), "resolveResult", null);
        setField(term419046, term419046.getClass(), "registry", null);
        setField(term419045, term419045.getClass(), "prototype", term419046);
        setField(term419045, term419045.getClass(), "kind", enum690);
        setField(term419045, term419045.getClass(), "typeOfThis", null);
        setField(term419045, term419045.getClass(), "source", null);
        setField(term419045, term419045.getClass(), "implementedInterfaces", null);
        setField(term419045, term419045.getClass(), "subTypes", null);
        setField(term419045, term419045.getClass(), "templateTypeName", null);
        setField(term419045, term419045.getClass(), "className", null);
        setField(term419045, term419045.getClass(), "properties", null);
        setBooleanField(term419045, term419045.getClass(), "nativeType", false);
        setField(term419045, term419045.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term419045, term419045.getClass(), "prettyPrint", false);
        setBooleanField(term419045, term419045.getClass(), "visited", false);
        setField(term419045, term419045.getClass(), "docInfo", null);
        setBooleanField(term419045, term419045.getClass(), "unknown", false);
        setBooleanField(term419045, term419045.getClass(), "resolved", false);
        setField(term419045, term419045.getClass(), "resolveResult", null);
        setField(term419045, term419045.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplementedInterfaces", argTypes, term418428, args);
        assertTrue(recursiveEquals(term418428, term419045));
        assertTrue(recursiveEquals(retValue, null));
    }

};


