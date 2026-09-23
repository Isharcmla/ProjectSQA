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

public class FunctionType_hasUnknownSupertype_259494629345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234108;
     Object term234893;

    public FunctionType_hasUnknownSupertype_259494629345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term234901 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term234900 = ((Class) term234901).getDeclaredField((String) "INTERFACE");
        ((Field) term234900).setAccessible(true);
        Object enum410 = ((Field) term234900).get((Object) null);
        term234108 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term234374 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term234492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term234108, term234108.getClass(), "kind", enum410);
        setBooleanField(term234108, term234108.getClass(), "unknown", false);
        setField(term234374, term234374.getClass(), "implicitPrototypeFallback", term234492);
        setField(term234108, term234108.getClass(), "prototype", term234374);
        Class<? extends Object> term235195 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term235194 = ((Class) term235195).getDeclaredField((String) "INTERFACE");
        ((Field) term235194).setAccessible(true);
        Object enum411 = ((Field) term235194).get((Object) null);
        term234893 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term234894 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term234895 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term234893, term234893.getClass(), "call", null);
        setField(term234894, term234894.getClass(), "ownerFunction", null);
        setField(term234894, term234894.getClass(), "className", null);
        setField(term234894, term234894.getClass(), "properties", null);
        setBooleanField(term234894, term234894.getClass(), "nativeType", false);
        setField(term234895, term234895.getClass(), "ownerFunction", null);
        setField(term234895, term234895.getClass(), "className", null);
        setField(term234895, term234895.getClass(), "properties", null);
        setBooleanField(term234895, term234895.getClass(), "nativeType", false);
        setField(term234895, term234895.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term234895, term234895.getClass(), "prettyPrint", false);
        setBooleanField(term234895, term234895.getClass(), "visited", false);
        setField(term234895, term234895.getClass(), "docInfo", null);
        setBooleanField(term234895, term234895.getClass(), "unknown", false);
        setBooleanField(term234895, term234895.getClass(), "resolved", false);
        setField(term234895, term234895.getClass(), "resolveResult", null);
        setField(term234895, term234895.getClass(), "registry", null);
        setField(term234894, term234894.getClass(), "implicitPrototypeFallback", term234895);
        setBooleanField(term234894, term234894.getClass(), "prettyPrint", false);
        setBooleanField(term234894, term234894.getClass(), "visited", false);
        setField(term234894, term234894.getClass(), "docInfo", null);
        setBooleanField(term234894, term234894.getClass(), "unknown", false);
        setBooleanField(term234894, term234894.getClass(), "resolved", false);
        setField(term234894, term234894.getClass(), "resolveResult", null);
        setField(term234894, term234894.getClass(), "registry", null);
        setField(term234893, term234893.getClass(), "prototype", term234894);
        setField(term234893, term234893.getClass(), "kind", enum411);
        setField(term234893, term234893.getClass(), "typeOfThis", null);
        setField(term234893, term234893.getClass(), "source", null);
        setField(term234893, term234893.getClass(), "implementedInterfaces", null);
        setField(term234893, term234893.getClass(), "subTypes", null);
        setField(term234893, term234893.getClass(), "templateTypeName", null);
        setField(term234893, term234893.getClass(), "className", null);
        setField(term234893, term234893.getClass(), "properties", null);
        setBooleanField(term234893, term234893.getClass(), "nativeType", false);
        setField(term234893, term234893.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term234893, term234893.getClass(), "prettyPrint", false);
        setBooleanField(term234893, term234893.getClass(), "visited", false);
        setField(term234893, term234893.getClass(), "docInfo", null);
        setBooleanField(term234893, term234893.getClass(), "unknown", false);
        setBooleanField(term234893, term234893.getClass(), "resolved", false);
        setField(term234893, term234893.getClass(), "resolveResult", null);
        setField(term234893, term234893.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasUnknownSupertype", argTypes, term234108, args);
        assertTrue(recursiveEquals(term234108, term234893));
        assertTrue(recursiveEquals(retValue, false));
    }

};


