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

public class FunctionType_setPrototype_1918602805367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222356;
     Object term222622;
     Object term223105;
     Object term223111;

    public FunctionType_setPrototype_1918602805367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term223115 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term223114 = ((Class) term223115).getDeclaredField((String) "INTERFACE");
        ((Field) term223114).setAccessible(true);
        Object enum403 = ((Field) term223114).get((Object) null);
        term222356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term222356, term222356.getClass(), "kind", enum403);
        setField(term222356, term222356.getClass(), "prototype", null);
        term222622 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term222730 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term222622, term222622.getClass(), "implicitPrototype", term222730);
        Class<? extends Object> term223409 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term223408 = ((Class) term223409).getDeclaredField((String) "INTERFACE");
        ((Field) term223408).setAccessible(true);
        Object enum404 = ((Field) term223408).get((Object) null);
        term223105 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term223106 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term223107 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term223105, term223105.getClass(), "call", null);
        setField(term223106, term223106.getClass(), "ownerFunction", null);
        setField(term223106, term223106.getClass(), "className", null);
        setField(term223106, term223106.getClass(), "properties", null);
        setField(term223107, term223107.getClass(), "this$0", null);
        setField(term223107, term223107.getClass(), "call", null);
        setField(term223107, term223107.getClass(), "prototype", null);
        setField(term223107, term223107.getClass(), "kind", null);
        setField(term223107, term223107.getClass(), "typeOfThis", null);
        setField(term223107, term223107.getClass(), "source", null);
        setField(term223107, term223107.getClass(), "implementedInterfaces", null);
        setField(term223107, term223107.getClass(), "subTypes", null);
        setField(term223107, term223107.getClass(), "templateTypeName", null);
        setField(term223107, term223107.getClass(), "className", null);
        setField(term223107, term223107.getClass(), "properties", null);
        setField(term223107, term223107.getClass(), "implicitPrototype", null);
        setBooleanField(term223107, term223107.getClass(), "nativeType", false);
        setBooleanField(term223107, term223107.getClass(), "visited", false);
        setField(term223107, term223107.getClass(), "docInfo", null);
        setBooleanField(term223107, term223107.getClass(), "unknown", false);
        setBooleanField(term223107, term223107.getClass(), "resolved", false);
        setField(term223107, term223107.getClass(), "resolveResult", null);
        setField(term223107, term223107.getClass(), "registry", null);
        setField(term223106, term223106.getClass(), "implicitPrototype", term223107);
        setBooleanField(term223106, term223106.getClass(), "nativeType", false);
        setBooleanField(term223106, term223106.getClass(), "visited", false);
        setField(term223106, term223106.getClass(), "docInfo", null);
        setBooleanField(term223106, term223106.getClass(), "unknown", false);
        setBooleanField(term223106, term223106.getClass(), "resolved", false);
        setField(term223106, term223106.getClass(), "resolveResult", null);
        setField(term223106, term223106.getClass(), "registry", null);
        setField(term223105, term223105.getClass(), "prototype", term223106);
        setField(term223105, term223105.getClass(), "kind", enum404);
        setField(term223105, term223105.getClass(), "typeOfThis", null);
        setField(term223105, term223105.getClass(), "source", null);
        setField(term223105, term223105.getClass(), "implementedInterfaces", null);
        setField(term223105, term223105.getClass(), "subTypes", null);
        setField(term223105, term223105.getClass(), "templateTypeName", null);
        setField(term223105, term223105.getClass(), "className", null);
        setField(term223105, term223105.getClass(), "properties", null);
        setField(term223105, term223105.getClass(), "implicitPrototype", null);
        setBooleanField(term223105, term223105.getClass(), "nativeType", false);
        setBooleanField(term223105, term223105.getClass(), "visited", false);
        setField(term223105, term223105.getClass(), "docInfo", null);
        setBooleanField(term223105, term223105.getClass(), "unknown", false);
        setBooleanField(term223105, term223105.getClass(), "resolved", false);
        setField(term223105, term223105.getClass(), "resolveResult", null);
        setField(term223105, term223105.getClass(), "registry", null);
        term223111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term223112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term223111, term223111.getClass(), "ownerFunction", null);
        setField(term223111, term223111.getClass(), "className", null);
        setField(term223111, term223111.getClass(), "properties", null);
        setField(term223112, term223112.getClass(), "this$0", null);
        setField(term223112, term223112.getClass(), "call", null);
        setField(term223112, term223112.getClass(), "prototype", null);
        setField(term223112, term223112.getClass(), "kind", null);
        setField(term223112, term223112.getClass(), "typeOfThis", null);
        setField(term223112, term223112.getClass(), "source", null);
        setField(term223112, term223112.getClass(), "implementedInterfaces", null);
        setField(term223112, term223112.getClass(), "subTypes", null);
        setField(term223112, term223112.getClass(), "templateTypeName", null);
        setField(term223112, term223112.getClass(), "className", null);
        setField(term223112, term223112.getClass(), "properties", null);
        setField(term223112, term223112.getClass(), "implicitPrototype", null);
        setBooleanField(term223112, term223112.getClass(), "nativeType", false);
        setBooleanField(term223112, term223112.getClass(), "visited", false);
        setField(term223112, term223112.getClass(), "docInfo", null);
        setBooleanField(term223112, term223112.getClass(), "unknown", false);
        setBooleanField(term223112, term223112.getClass(), "resolved", false);
        setField(term223112, term223112.getClass(), "resolveResult", null);
        setField(term223112, term223112.getClass(), "registry", null);
        setField(term223111, term223111.getClass(), "implicitPrototype", term223112);
        setBooleanField(term223111, term223111.getClass(), "nativeType", false);
        setBooleanField(term223111, term223111.getClass(), "visited", false);
        setField(term223111, term223111.getClass(), "docInfo", null);
        setBooleanField(term223111, term223111.getClass(), "unknown", false);
        setBooleanField(term223111, term223111.getClass(), "resolved", false);
        setField(term223111, term223111.getClass(), "resolveResult", null);
        setField(term223111, term223111.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term222622;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term222356, args);
        assertTrue(recursiveEquals(term222356, term223105));
        assertTrue(recursiveEquals(term222622, term223111));
        assertTrue(recursiveEquals(retValue, true));
    }

};


