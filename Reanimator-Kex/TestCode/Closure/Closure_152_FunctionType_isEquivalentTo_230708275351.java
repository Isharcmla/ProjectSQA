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

public class FunctionType_isEquivalentTo_230708275351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241437;
     Object term242099;
     Object term243315;
     Object term243323;

    public FunctionType_isEquivalentTo_230708275351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term243330 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term243329 = ((Class) term243330).getDeclaredField((String) "ORDINARY");
        ((Field) term243329).setAccessible(true);
        Object enum424 = ((Field) term243329).get((Object) null);
        Class<? extends Object> term243621 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term243620 = ((Class) term243621).getDeclaredField((String) "INTERFACE");
        ((Field) term243620).setAccessible(true);
        Object enum425 = ((Field) term243620).get((Object) null);
        term241437 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term241989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term241437, term241437.getClass(), "kind", enum424);
        setField(term241989, term241989.getClass(), "kind", enum425);
        setField(term241437, term241437.getClass(), "typeOfThis", term241989);
        Class<? extends Object> term243915 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term243914 = ((Class) term243915).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term243914).setAccessible(true);
        Object enum426 = ((Field) term243914).get((Object) null);
        term242099 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term242281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term242099, term242099.getClass(), "kind", enum426);
        setField(term242099, term242099.getClass(), "typeOfThis", term242281);
        Class<? extends Object> term244215 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term244214 = ((Class) term244215).getDeclaredField((String) "ORDINARY");
        ((Field) term244214).setAccessible(true);
        Object enum427 = ((Field) term244214).get((Object) null);
        Class<? extends Object> term244506 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term244505 = ((Class) term244506).getDeclaredField((String) "INTERFACE");
        ((Field) term244505).setAccessible(true);
        Object enum428 = ((Field) term244505).get((Object) null);
        term243315 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term243319 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term243315, term243315.getClass(), "call", null);
        setField(term243315, term243315.getClass(), "prototype", null);
        setField(term243315, term243315.getClass(), "kind", enum427);
        setField(term243319, term243319.getClass(), "this$0", null);
        setField(term243319, term243319.getClass(), "call", null);
        setField(term243319, term243319.getClass(), "prototype", null);
        setField(term243319, term243319.getClass(), "kind", enum428);
        setField(term243319, term243319.getClass(), "typeOfThis", null);
        setField(term243319, term243319.getClass(), "source", null);
        setField(term243319, term243319.getClass(), "implementedInterfaces", null);
        setField(term243319, term243319.getClass(), "subTypes", null);
        setField(term243319, term243319.getClass(), "templateTypeName", null);
        setField(term243319, term243319.getClass(), "className", null);
        setField(term243319, term243319.getClass(), "properties", null);
        setBooleanField(term243319, term243319.getClass(), "nativeType", false);
        setField(term243319, term243319.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term243319, term243319.getClass(), "prettyPrint", false);
        setBooleanField(term243319, term243319.getClass(), "visited", false);
        setField(term243319, term243319.getClass(), "docInfo", null);
        setBooleanField(term243319, term243319.getClass(), "unknown", false);
        setBooleanField(term243319, term243319.getClass(), "resolved", false);
        setField(term243319, term243319.getClass(), "resolveResult", null);
        setField(term243319, term243319.getClass(), "registry", null);
        setField(term243315, term243315.getClass(), "typeOfThis", term243319);
        setField(term243315, term243315.getClass(), "source", null);
        setField(term243315, term243315.getClass(), "implementedInterfaces", null);
        setField(term243315, term243315.getClass(), "subTypes", null);
        setField(term243315, term243315.getClass(), "templateTypeName", null);
        setField(term243315, term243315.getClass(), "className", null);
        setField(term243315, term243315.getClass(), "properties", null);
        setBooleanField(term243315, term243315.getClass(), "nativeType", false);
        setField(term243315, term243315.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term243315, term243315.getClass(), "prettyPrint", false);
        setBooleanField(term243315, term243315.getClass(), "visited", false);
        setField(term243315, term243315.getClass(), "docInfo", null);
        setBooleanField(term243315, term243315.getClass(), "unknown", false);
        setBooleanField(term243315, term243315.getClass(), "resolved", false);
        setField(term243315, term243315.getClass(), "resolveResult", null);
        setField(term243315, term243315.getClass(), "registry", null);
        Class<? extends Object> term244800 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term244799 = ((Class) term244800).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term244799).setAccessible(true);
        Object enum429 = ((Field) term244799).get((Object) null);
        term243323 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term243327 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term243323, term243323.getClass(), "call", null);
        setField(term243323, term243323.getClass(), "prototype", null);
        setField(term243323, term243323.getClass(), "kind", enum429);
        setField(term243327, term243327.getClass(), "this$0", null);
        setField(term243327, term243327.getClass(), "call", null);
        setField(term243327, term243327.getClass(), "prototype", null);
        setField(term243327, term243327.getClass(), "kind", null);
        setField(term243327, term243327.getClass(), "typeOfThis", null);
        setField(term243327, term243327.getClass(), "source", null);
        setField(term243327, term243327.getClass(), "implementedInterfaces", null);
        setField(term243327, term243327.getClass(), "subTypes", null);
        setField(term243327, term243327.getClass(), "templateTypeName", null);
        setField(term243327, term243327.getClass(), "className", null);
        setField(term243327, term243327.getClass(), "properties", null);
        setBooleanField(term243327, term243327.getClass(), "nativeType", false);
        setField(term243327, term243327.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term243327, term243327.getClass(), "prettyPrint", false);
        setBooleanField(term243327, term243327.getClass(), "visited", false);
        setField(term243327, term243327.getClass(), "docInfo", null);
        setBooleanField(term243327, term243327.getClass(), "unknown", false);
        setBooleanField(term243327, term243327.getClass(), "resolved", false);
        setField(term243327, term243327.getClass(), "resolveResult", null);
        setField(term243327, term243327.getClass(), "registry", null);
        setField(term243323, term243323.getClass(), "typeOfThis", term243327);
        setField(term243323, term243323.getClass(), "source", null);
        setField(term243323, term243323.getClass(), "implementedInterfaces", null);
        setField(term243323, term243323.getClass(), "subTypes", null);
        setField(term243323, term243323.getClass(), "templateTypeName", null);
        setField(term243323, term243323.getClass(), "className", null);
        setField(term243323, term243323.getClass(), "properties", null);
        setBooleanField(term243323, term243323.getClass(), "nativeType", false);
        setField(term243323, term243323.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term243323, term243323.getClass(), "prettyPrint", false);
        setBooleanField(term243323, term243323.getClass(), "visited", false);
        setField(term243323, term243323.getClass(), "docInfo", null);
        setBooleanField(term243323, term243323.getClass(), "unknown", false);
        setBooleanField(term243323, term243323.getClass(), "resolved", false);
        setField(term243323, term243323.getClass(), "resolveResult", null);
        setField(term243323, term243323.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term242099;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term241437, args);
        assertTrue(recursiveEquals(term241437, term243315));
        assertTrue(recursiveEquals(term242099, term243323));
        assertTrue(recursiveEquals(retValue, false));
    }

};


