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

public class FunctionType_isEquivalentTo_230708275235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129765;
     Object term130023;
     Object term131870;
     Object term131874;

    public FunctionType_isEquivalentTo_230708275235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term131877 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term131876 = ((Class) term131877).getDeclaredField((String) "INTERFACE");
        ((Field) term131876).setAccessible(true);
        Object enum252 = ((Field) term131876).get((Object) null);
        term129765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term129765, term129765.getClass(), "kind", enum252);
        term130023 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term132171 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term132170 = ((Class) term132171).getDeclaredField((String) "INTERFACE");
        ((Field) term132170).setAccessible(true);
        Object enum253 = ((Field) term132170).get((Object) null);
        term131870 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term131870, term131870.getClass(), "call", null);
        setField(term131870, term131870.getClass(), "prototype", null);
        setField(term131870, term131870.getClass(), "kind", enum253);
        setField(term131870, term131870.getClass(), "typeOfThis", null);
        setField(term131870, term131870.getClass(), "source", null);
        setField(term131870, term131870.getClass(), "implementedInterfaces", null);
        setField(term131870, term131870.getClass(), "subTypes", null);
        setField(term131870, term131870.getClass(), "templateTypeName", null);
        setField(term131870, term131870.getClass(), "className", null);
        setField(term131870, term131870.getClass(), "properties", null);
        setBooleanField(term131870, term131870.getClass(), "nativeType", false);
        setField(term131870, term131870.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term131870, term131870.getClass(), "prettyPrint", false);
        setBooleanField(term131870, term131870.getClass(), "visited", false);
        setField(term131870, term131870.getClass(), "docInfo", null);
        setBooleanField(term131870, term131870.getClass(), "unknown", false);
        setBooleanField(term131870, term131870.getClass(), "resolved", false);
        setField(term131870, term131870.getClass(), "resolveResult", null);
        setField(term131870, term131870.getClass(), "registry", null);
        term131874 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term131874, term131874.getClass(), "call", null);
        setField(term131874, term131874.getClass(), "prototype", null);
        setField(term131874, term131874.getClass(), "kind", null);
        setField(term131874, term131874.getClass(), "typeOfThis", null);
        setField(term131874, term131874.getClass(), "source", null);
        setField(term131874, term131874.getClass(), "implementedInterfaces", null);
        setField(term131874, term131874.getClass(), "subTypes", null);
        setField(term131874, term131874.getClass(), "templateTypeName", null);
        setField(term131874, term131874.getClass(), "className", null);
        setField(term131874, term131874.getClass(), "properties", null);
        setBooleanField(term131874, term131874.getClass(), "nativeType", false);
        setField(term131874, term131874.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term131874, term131874.getClass(), "prettyPrint", false);
        setBooleanField(term131874, term131874.getClass(), "visited", false);
        setField(term131874, term131874.getClass(), "docInfo", null);
        setBooleanField(term131874, term131874.getClass(), "unknown", false);
        setBooleanField(term131874, term131874.getClass(), "resolved", false);
        setField(term131874, term131874.getClass(), "resolveResult", null);
        setField(term131874, term131874.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term130023;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term129765, args);
        assertTrue(recursiveEquals(term129765, term131870));
        assertTrue(recursiveEquals(term130023, term131874));
        assertTrue(recursiveEquals(retValue, false));
    }

};


