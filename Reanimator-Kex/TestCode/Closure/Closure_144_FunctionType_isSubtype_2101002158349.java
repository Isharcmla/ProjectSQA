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

public class FunctionType_isSubtype_2101002158349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244077;
     Object term244335;
     Object term245172;
     Object term245176;

    public FunctionType_isSubtype_2101002158349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term245182 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term245181 = ((Class) term245182).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term245181).setAccessible(true);
        Object enum456 = ((Field) term245181).get((Object) null);
        term244077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term244077, term244077.getClass(), "kind", enum456);
        Class<? extends Object> term245482 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term245481 = ((Class) term245482).getDeclaredField((String) "INTERFACE");
        ((Field) term245481).setAccessible(true);
        Object enum457 = ((Field) term245481).get((Object) null);
        term244335 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term244335, term244335.getClass(), "kind", enum457);
        Class<? extends Object> term245776 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term245775 = ((Class) term245776).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term245775).setAccessible(true);
        Object enum458 = ((Field) term245775).get((Object) null);
        term245172 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term245172, term245172.getClass(), "call", null);
        setField(term245172, term245172.getClass(), "prototype", null);
        setField(term245172, term245172.getClass(), "kind", enum458);
        setField(term245172, term245172.getClass(), "typeOfThis", null);
        setField(term245172, term245172.getClass(), "source", null);
        setField(term245172, term245172.getClass(), "implementedInterfaces", null);
        setField(term245172, term245172.getClass(), "subTypes", null);
        setField(term245172, term245172.getClass(), "templateTypeName", null);
        setField(term245172, term245172.getClass(), "className", null);
        setField(term245172, term245172.getClass(), "properties", null);
        setField(term245172, term245172.getClass(), "implicitPrototype", null);
        setBooleanField(term245172, term245172.getClass(), "nativeType", false);
        setBooleanField(term245172, term245172.getClass(), "prettyPrint", false);
        setBooleanField(term245172, term245172.getClass(), "visited", false);
        setField(term245172, term245172.getClass(), "docInfo", null);
        setBooleanField(term245172, term245172.getClass(), "unknown", false);
        setBooleanField(term245172, term245172.getClass(), "resolved", false);
        setField(term245172, term245172.getClass(), "resolveResult", null);
        setField(term245172, term245172.getClass(), "registry", null);
        Class<? extends Object> term246076 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term246075 = ((Class) term246076).getDeclaredField((String) "INTERFACE");
        ((Field) term246075).setAccessible(true);
        Object enum459 = ((Field) term246075).get((Object) null);
        term245176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term245176, term245176.getClass(), "call", null);
        setField(term245176, term245176.getClass(), "prototype", null);
        setField(term245176, term245176.getClass(), "kind", enum459);
        setField(term245176, term245176.getClass(), "typeOfThis", null);
        setField(term245176, term245176.getClass(), "source", null);
        setField(term245176, term245176.getClass(), "implementedInterfaces", null);
        setField(term245176, term245176.getClass(), "subTypes", null);
        setField(term245176, term245176.getClass(), "templateTypeName", null);
        setField(term245176, term245176.getClass(), "className", null);
        setField(term245176, term245176.getClass(), "properties", null);
        setField(term245176, term245176.getClass(), "implicitPrototype", null);
        setBooleanField(term245176, term245176.getClass(), "nativeType", false);
        setBooleanField(term245176, term245176.getClass(), "prettyPrint", false);
        setBooleanField(term245176, term245176.getClass(), "visited", false);
        setField(term245176, term245176.getClass(), "docInfo", null);
        setBooleanField(term245176, term245176.getClass(), "unknown", false);
        setBooleanField(term245176, term245176.getClass(), "resolved", false);
        setField(term245176, term245176.getClass(), "resolveResult", null);
        setField(term245176, term245176.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term244335;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term244077, args);
        assertTrue(recursiveEquals(term244077, term245172));
        assertTrue(recursiveEquals(term244335, term245176));
        assertTrue(recursiveEquals(retValue, true));
    }

};


