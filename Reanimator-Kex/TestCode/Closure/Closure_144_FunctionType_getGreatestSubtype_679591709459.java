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

public class FunctionType_getGreatestSubtype_679591709459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382457;
     Object term382910;
     Object term382914;
     Object term382833;

    public FunctionType_getGreatestSubtype_679591709459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term382919 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term382918 = ((Class) term382919).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term382918).setAccessible(true);
        Object enum692 = ((Field) term382918).get((Object) null);
        term382457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term382457, term382457.getClass(), "kind", enum692);
        Class<? extends Object> term383219 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term383218 = ((Class) term383219).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term383218).setAccessible(true);
        Object enum693 = ((Field) term383218).get((Object) null);
        term382910 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term382910, term382910.getClass(), "call", null);
        setField(term382910, term382910.getClass(), "prototype", null);
        setField(term382910, term382910.getClass(), "kind", enum693);
        setField(term382910, term382910.getClass(), "typeOfThis", null);
        setField(term382910, term382910.getClass(), "source", null);
        setField(term382910, term382910.getClass(), "implementedInterfaces", null);
        setField(term382910, term382910.getClass(), "subTypes", null);
        setField(term382910, term382910.getClass(), "templateTypeName", null);
        setField(term382910, term382910.getClass(), "className", null);
        setField(term382910, term382910.getClass(), "properties", null);
        setField(term382910, term382910.getClass(), "implicitPrototype", null);
        setBooleanField(term382910, term382910.getClass(), "nativeType", false);
        setBooleanField(term382910, term382910.getClass(), "prettyPrint", false);
        setBooleanField(term382910, term382910.getClass(), "visited", false);
        setField(term382910, term382910.getClass(), "docInfo", null);
        setBooleanField(term382910, term382910.getClass(), "unknown", false);
        setBooleanField(term382910, term382910.getClass(), "resolved", false);
        setField(term382910, term382910.getClass(), "resolveResult", null);
        setField(term382910, term382910.getClass(), "registry", null);
        Class<? extends Object> term383519 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term383518 = ((Class) term383519).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term383518).setAccessible(true);
        Object enum694 = ((Field) term383518).get((Object) null);
        term382914 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term382914, term382914.getClass(), "call", null);
        setField(term382914, term382914.getClass(), "prototype", null);
        setField(term382914, term382914.getClass(), "kind", enum694);
        setField(term382914, term382914.getClass(), "typeOfThis", null);
        setField(term382914, term382914.getClass(), "source", null);
        setField(term382914, term382914.getClass(), "implementedInterfaces", null);
        setField(term382914, term382914.getClass(), "subTypes", null);
        setField(term382914, term382914.getClass(), "templateTypeName", null);
        setField(term382914, term382914.getClass(), "className", null);
        setField(term382914, term382914.getClass(), "properties", null);
        setField(term382914, term382914.getClass(), "implicitPrototype", null);
        setBooleanField(term382914, term382914.getClass(), "nativeType", false);
        setBooleanField(term382914, term382914.getClass(), "prettyPrint", false);
        setBooleanField(term382914, term382914.getClass(), "visited", false);
        setField(term382914, term382914.getClass(), "docInfo", null);
        setBooleanField(term382914, term382914.getClass(), "unknown", false);
        setBooleanField(term382914, term382914.getClass(), "resolved", false);
        setField(term382914, term382914.getClass(), "resolveResult", null);
        setField(term382914, term382914.getClass(), "registry", null);
        Class<? extends Object> term383819 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term383818 = ((Class) term383819).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term383818).setAccessible(true);
        Object enum695 = ((Field) term383818).get((Object) null);
        term382833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term382833, term382833.getClass(), "call", null);
        setField(term382833, term382833.getClass(), "prototype", null);
        setField(term382833, term382833.getClass(), "kind", enum695);
        setField(term382833, term382833.getClass(), "typeOfThis", null);
        setField(term382833, term382833.getClass(), "source", null);
        setField(term382833, term382833.getClass(), "implementedInterfaces", null);
        setField(term382833, term382833.getClass(), "subTypes", null);
        setField(term382833, term382833.getClass(), "templateTypeName", null);
        setField(term382833, term382833.getClass(), "className", null);
        setField(term382833, term382833.getClass(), "properties", null);
        setField(term382833, term382833.getClass(), "implicitPrototype", null);
        setBooleanField(term382833, term382833.getClass(), "nativeType", false);
        setBooleanField(term382833, term382833.getClass(), "prettyPrint", false);
        setBooleanField(term382833, term382833.getClass(), "visited", false);
        setField(term382833, term382833.getClass(), "docInfo", null);
        setBooleanField(term382833, term382833.getClass(), "unknown", false);
        setBooleanField(term382833, term382833.getClass(), "resolved", false);
        setField(term382833, term382833.getClass(), "resolveResult", null);
        setField(term382833, term382833.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term382457;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, term382457, args);
        assertTrue(recursiveEquals(term382457, term382910));
        assertTrue(recursiveEquals(term382457, term382914));
        assertTrue(recursiveEquals(retValue, term382833));
    }

};


