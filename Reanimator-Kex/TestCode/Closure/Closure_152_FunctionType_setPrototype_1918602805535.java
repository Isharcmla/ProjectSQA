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

public class FunctionType_setPrototype_1918602805535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490528;
     Object term490794;
     Object term491148;
     Object term491153;

    public FunctionType_setPrototype_1918602805535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term491156 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term491155 = ((Class) term491156).getDeclaredField((String) "INTERFACE");
        ((Field) term491155).setAccessible(true);
        Object enum790 = ((Field) term491155).get((Object) null);
        term490528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term490528, term490528.getClass(), "kind", enum790);
        setField(term490528, term490528.getClass(), "prototype", null);
        term490794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Class<? extends Object> term491450 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term491449 = ((Class) term491450).getDeclaredField((String) "INTERFACE");
        ((Field) term491449).setAccessible(true);
        Object enum791 = ((Field) term491449).get((Object) null);
        term491148 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term491149 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term491148, term491148.getClass(), "call", null);
        setField(term491149, term491149.getClass(), "ownerFunction", null);
        setField(term491149, term491149.getClass(), "className", null);
        setField(term491149, term491149.getClass(), "properties", null);
        setBooleanField(term491149, term491149.getClass(), "nativeType", false);
        setField(term491149, term491149.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term491149, term491149.getClass(), "prettyPrint", false);
        setBooleanField(term491149, term491149.getClass(), "visited", false);
        setField(term491149, term491149.getClass(), "docInfo", null);
        setBooleanField(term491149, term491149.getClass(), "unknown", false);
        setBooleanField(term491149, term491149.getClass(), "resolved", false);
        setField(term491149, term491149.getClass(), "resolveResult", null);
        setField(term491149, term491149.getClass(), "registry", null);
        setField(term491148, term491148.getClass(), "prototype", term491149);
        setField(term491148, term491148.getClass(), "kind", enum791);
        setField(term491148, term491148.getClass(), "typeOfThis", null);
        setField(term491148, term491148.getClass(), "source", null);
        setField(term491148, term491148.getClass(), "implementedInterfaces", null);
        setField(term491148, term491148.getClass(), "subTypes", null);
        setField(term491148, term491148.getClass(), "templateTypeName", null);
        setField(term491148, term491148.getClass(), "className", null);
        setField(term491148, term491148.getClass(), "properties", null);
        setBooleanField(term491148, term491148.getClass(), "nativeType", false);
        setField(term491148, term491148.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term491148, term491148.getClass(), "prettyPrint", false);
        setBooleanField(term491148, term491148.getClass(), "visited", false);
        setField(term491148, term491148.getClass(), "docInfo", null);
        setBooleanField(term491148, term491148.getClass(), "unknown", false);
        setBooleanField(term491148, term491148.getClass(), "resolved", false);
        setField(term491148, term491148.getClass(), "resolveResult", null);
        setField(term491148, term491148.getClass(), "registry", null);
        term491153 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term491153, term491153.getClass(), "ownerFunction", null);
        setField(term491153, term491153.getClass(), "className", null);
        setField(term491153, term491153.getClass(), "properties", null);
        setBooleanField(term491153, term491153.getClass(), "nativeType", false);
        setField(term491153, term491153.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term491153, term491153.getClass(), "prettyPrint", false);
        setBooleanField(term491153, term491153.getClass(), "visited", false);
        setField(term491153, term491153.getClass(), "docInfo", null);
        setBooleanField(term491153, term491153.getClass(), "unknown", false);
        setBooleanField(term491153, term491153.getClass(), "resolved", false);
        setField(term491153, term491153.getClass(), "resolveResult", null);
        setField(term491153, term491153.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term490794;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term490528, args);
        assertTrue(recursiveEquals(term490528, term491148));
        assertTrue(recursiveEquals(term490794, term491153));
        assertTrue(recursiveEquals(retValue, true));
    }

};


