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

public class FunctionType_setPrototype_1918602805629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term627331;
     Object term627597;
     Object term628095;
     Object term628101;

    public FunctionType_setPrototype_1918602805629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term628105 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term628104 = ((Class) term628105).getDeclaredField((String) "INTERFACE");
        ((Field) term628104).setAccessible(true);
        Object enum966 = ((Field) term628104).get((Object) null);
        term627331 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term627331, term627331.getClass(), "kind", enum966);
        setField(term627331, term627331.getClass(), "prototype", null);
        term627597 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term627711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term627597, term627597.getClass(), "implicitPrototypeFallback", term627711);
        Class<? extends Object> term628399 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term628398 = ((Class) term628399).getDeclaredField((String) "INTERFACE");
        ((Field) term628398).setAccessible(true);
        Object enum967 = ((Field) term628398).get((Object) null);
        term628095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term628096 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term628097 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term628095, term628095.getClass(), "call", null);
        setField(term628096, term628096.getClass(), "ownerFunction", null);
        setField(term628096, term628096.getClass(), "className", null);
        setField(term628096, term628096.getClass(), "properties", null);
        setBooleanField(term628096, term628096.getClass(), "nativeType", false);
        setField(term628097, term628097.getClass(), "className", null);
        setField(term628097, term628097.getClass(), "properties", null);
        setBooleanField(term628097, term628097.getClass(), "nativeType", false);
        setField(term628097, term628097.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term628097, term628097.getClass(), "prettyPrint", false);
        setBooleanField(term628097, term628097.getClass(), "visited", false);
        setField(term628097, term628097.getClass(), "docInfo", null);
        setBooleanField(term628097, term628097.getClass(), "unknown", false);
        setBooleanField(term628097, term628097.getClass(), "resolved", false);
        setField(term628097, term628097.getClass(), "resolveResult", null);
        setField(term628097, term628097.getClass(), "registry", null);
        setField(term628096, term628096.getClass(), "implicitPrototypeFallback", term628097);
        setBooleanField(term628096, term628096.getClass(), "prettyPrint", false);
        setBooleanField(term628096, term628096.getClass(), "visited", false);
        setField(term628096, term628096.getClass(), "docInfo", null);
        setBooleanField(term628096, term628096.getClass(), "unknown", false);
        setBooleanField(term628096, term628096.getClass(), "resolved", false);
        setField(term628096, term628096.getClass(), "resolveResult", null);
        setField(term628096, term628096.getClass(), "registry", null);
        setField(term628095, term628095.getClass(), "prototype", term628096);
        setField(term628095, term628095.getClass(), "kind", enum967);
        setField(term628095, term628095.getClass(), "typeOfThis", null);
        setField(term628095, term628095.getClass(), "source", null);
        setField(term628095, term628095.getClass(), "implementedInterfaces", null);
        setField(term628095, term628095.getClass(), "subTypes", null);
        setField(term628095, term628095.getClass(), "templateTypeName", null);
        setField(term628095, term628095.getClass(), "className", null);
        setField(term628095, term628095.getClass(), "properties", null);
        setBooleanField(term628095, term628095.getClass(), "nativeType", false);
        setField(term628095, term628095.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term628095, term628095.getClass(), "prettyPrint", false);
        setBooleanField(term628095, term628095.getClass(), "visited", false);
        setField(term628095, term628095.getClass(), "docInfo", null);
        setBooleanField(term628095, term628095.getClass(), "unknown", false);
        setBooleanField(term628095, term628095.getClass(), "resolved", false);
        setField(term628095, term628095.getClass(), "resolveResult", null);
        setField(term628095, term628095.getClass(), "registry", null);
        term628101 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term628102 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term628101, term628101.getClass(), "ownerFunction", null);
        setField(term628101, term628101.getClass(), "className", null);
        setField(term628101, term628101.getClass(), "properties", null);
        setBooleanField(term628101, term628101.getClass(), "nativeType", false);
        setField(term628102, term628102.getClass(), "className", null);
        setField(term628102, term628102.getClass(), "properties", null);
        setBooleanField(term628102, term628102.getClass(), "nativeType", false);
        setField(term628102, term628102.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term628102, term628102.getClass(), "prettyPrint", false);
        setBooleanField(term628102, term628102.getClass(), "visited", false);
        setField(term628102, term628102.getClass(), "docInfo", null);
        setBooleanField(term628102, term628102.getClass(), "unknown", false);
        setBooleanField(term628102, term628102.getClass(), "resolved", false);
        setField(term628102, term628102.getClass(), "resolveResult", null);
        setField(term628102, term628102.getClass(), "registry", null);
        setField(term628101, term628101.getClass(), "implicitPrototypeFallback", term628102);
        setBooleanField(term628101, term628101.getClass(), "prettyPrint", false);
        setBooleanField(term628101, term628101.getClass(), "visited", false);
        setField(term628101, term628101.getClass(), "docInfo", null);
        setBooleanField(term628101, term628101.getClass(), "unknown", false);
        setBooleanField(term628101, term628101.getClass(), "resolved", false);
        setField(term628101, term628101.getClass(), "resolveResult", null);
        setField(term628101, term628101.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term627597;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term627331, args);
        assertTrue(recursiveEquals(term627331, term628095));
        assertTrue(recursiveEquals(term627597, term628101));
        assertTrue(recursiveEquals(retValue, true));
    }

};


