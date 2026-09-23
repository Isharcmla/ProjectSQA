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

public class FunctionType_isSubtype_21010021581664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2248596;
     Object term2249256;
     Object term2250297;
     Object term2250305;

    public FunctionType_isSubtype_21010021581664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2250312 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2250311 = ((Class) term2250312).getDeclaredField((String) "INTERFACE");
        ((Field) term2250311).setAccessible(true);
        Object enum4198 = ((Field) term2250311).get((Object) null);
        Class<? extends Object> term2250606 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2250605 = ((Class) term2250606).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2250605).setAccessible(true);
        Object enum4199 = ((Field) term2250605).get((Object) null);
        term2248596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2249148 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2248596, term2248596.getClass(), "kind", enum4198);
        setField(term2249148, term2249148.getClass(), "kind", enum4199);
        setField(term2248596, term2248596.getClass(), "typeOfThis", term2249148);
        term2249256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2249586 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2249256, term2249256.getClass(), "kind", enum4198);
        setField(term2249586, term2249586.getClass(), "kind", enum4198);
        setField(term2249256, term2249256.getClass(), "typeOfThis", term2249586);
        Class<? extends Object> term2250906 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2250905 = ((Class) term2250906).getDeclaredField((String) "INTERFACE");
        ((Field) term2250905).setAccessible(true);
        Object enum4200 = ((Field) term2250905).get((Object) null);
        Class<? extends Object> term2251200 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2251199 = ((Class) term2251200).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2251199).setAccessible(true);
        Object enum4201 = ((Field) term2251199).get((Object) null);
        term2250297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2250301 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2250297, term2250297.getClass(), "call", null);
        setField(term2250297, term2250297.getClass(), "prototype", null);
        setField(term2250297, term2250297.getClass(), "kind", enum4200);
        setField(term2250301, term2250301.getClass(), "this$0", null);
        setField(term2250301, term2250301.getClass(), "call", null);
        setField(term2250301, term2250301.getClass(), "prototype", null);
        setField(term2250301, term2250301.getClass(), "kind", enum4201);
        setField(term2250301, term2250301.getClass(), "typeOfThis", null);
        setField(term2250301, term2250301.getClass(), "source", null);
        setField(term2250301, term2250301.getClass(), "implementedInterfaces", null);
        setField(term2250301, term2250301.getClass(), "subTypes", null);
        setField(term2250301, term2250301.getClass(), "templateTypeName", null);
        setField(term2250301, term2250301.getClass(), "className", null);
        setField(term2250301, term2250301.getClass(), "properties", null);
        setField(term2250301, term2250301.getClass(), "implicitPrototype", null);
        setBooleanField(term2250301, term2250301.getClass(), "nativeType", false);
        setBooleanField(term2250301, term2250301.getClass(), "visited", false);
        setField(term2250301, term2250301.getClass(), "docInfo", null);
        setBooleanField(term2250301, term2250301.getClass(), "unknown", false);
        setBooleanField(term2250301, term2250301.getClass(), "resolved", false);
        setField(term2250301, term2250301.getClass(), "resolveResult", null);
        setField(term2250301, term2250301.getClass(), "registry", null);
        setField(term2250297, term2250297.getClass(), "typeOfThis", term2250301);
        setField(term2250297, term2250297.getClass(), "source", null);
        setField(term2250297, term2250297.getClass(), "implementedInterfaces", null);
        setField(term2250297, term2250297.getClass(), "subTypes", null);
        setField(term2250297, term2250297.getClass(), "templateTypeName", null);
        setField(term2250297, term2250297.getClass(), "className", null);
        setField(term2250297, term2250297.getClass(), "properties", null);
        setField(term2250297, term2250297.getClass(), "implicitPrototype", null);
        setBooleanField(term2250297, term2250297.getClass(), "nativeType", false);
        setBooleanField(term2250297, term2250297.getClass(), "visited", false);
        setField(term2250297, term2250297.getClass(), "docInfo", null);
        setBooleanField(term2250297, term2250297.getClass(), "unknown", false);
        setBooleanField(term2250297, term2250297.getClass(), "resolved", false);
        setField(term2250297, term2250297.getClass(), "resolveResult", null);
        setField(term2250297, term2250297.getClass(), "registry", null);
        Class<? extends Object> term2251500 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2251499 = ((Class) term2251500).getDeclaredField((String) "INTERFACE");
        ((Field) term2251499).setAccessible(true);
        Object enum4202 = ((Field) term2251499).get((Object) null);
        term2250305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2250309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2250305, term2250305.getClass(), "this$0", null);
        setField(term2250305, term2250305.getClass(), "call", null);
        setField(term2250305, term2250305.getClass(), "prototype", null);
        setField(term2250305, term2250305.getClass(), "kind", enum4202);
        setField(term2250309, term2250309.getClass(), "this$0", null);
        setField(term2250309, term2250309.getClass(), "call", null);
        setField(term2250309, term2250309.getClass(), "prototype", null);
        setField(term2250309, term2250309.getClass(), "kind", enum4202);
        setField(term2250309, term2250309.getClass(), "typeOfThis", null);
        setField(term2250309, term2250309.getClass(), "source", null);
        setField(term2250309, term2250309.getClass(), "implementedInterfaces", null);
        setField(term2250309, term2250309.getClass(), "subTypes", null);
        setField(term2250309, term2250309.getClass(), "templateTypeName", null);
        setField(term2250309, term2250309.getClass(), "className", null);
        setField(term2250309, term2250309.getClass(), "properties", null);
        setField(term2250309, term2250309.getClass(), "implicitPrototype", null);
        setBooleanField(term2250309, term2250309.getClass(), "nativeType", false);
        setBooleanField(term2250309, term2250309.getClass(), "visited", false);
        setField(term2250309, term2250309.getClass(), "docInfo", null);
        setBooleanField(term2250309, term2250309.getClass(), "unknown", false);
        setBooleanField(term2250309, term2250309.getClass(), "resolved", false);
        setField(term2250309, term2250309.getClass(), "resolveResult", null);
        setField(term2250309, term2250309.getClass(), "registry", null);
        setField(term2250305, term2250305.getClass(), "typeOfThis", term2250309);
        setField(term2250305, term2250305.getClass(), "source", null);
        setField(term2250305, term2250305.getClass(), "implementedInterfaces", null);
        setField(term2250305, term2250305.getClass(), "subTypes", null);
        setField(term2250305, term2250305.getClass(), "templateTypeName", null);
        setField(term2250305, term2250305.getClass(), "className", null);
        setField(term2250305, term2250305.getClass(), "properties", null);
        setField(term2250305, term2250305.getClass(), "implicitPrototype", null);
        setBooleanField(term2250305, term2250305.getClass(), "nativeType", false);
        setBooleanField(term2250305, term2250305.getClass(), "visited", false);
        setField(term2250305, term2250305.getClass(), "docInfo", null);
        setBooleanField(term2250305, term2250305.getClass(), "unknown", false);
        setBooleanField(term2250305, term2250305.getClass(), "resolved", false);
        setField(term2250305, term2250305.getClass(), "resolveResult", null);
        setField(term2250305, term2250305.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2249256;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2248596, args);
        assertTrue(recursiveEquals(term2248596, term2250297));
        assertTrue(recursiveEquals(term2249256, term2250305));
        assertTrue(recursiveEquals(retValue, true));
    }

};


