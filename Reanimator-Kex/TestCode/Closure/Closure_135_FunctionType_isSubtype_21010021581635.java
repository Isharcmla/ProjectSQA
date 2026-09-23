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

public class FunctionType_isSubtype_21010021581635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2199374;
     Object term2200034;
     Object term2203100;
     Object term2203108;

    public FunctionType_isSubtype_21010021581635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2203119 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2203118 = ((Class) term2203119).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2203118).setAccessible(true);
        Object enum4102 = ((Field) term2203118).get((Object) null);
        Class<? extends Object> term2203419 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2203418 = ((Class) term2203419).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2203418).setAccessible(true);
        Object enum4103 = ((Field) term2203418).get((Object) null);
        term2199374 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2199926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2199374, term2199374.getClass(), "kind", enum4102);
        setField(term2199926, term2199926.getClass(), "kind", enum4103);
        setField(term2199926, term2199926.getClass(), "call", null);
        setField(term2199374, term2199374.getClass(), "typeOfThis", term2199926);
        term2200034 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2200364 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2200458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2200034, term2200034.getClass(), "kind", enum4102);
        setField(term2200364, term2200364.getClass(), "kind", enum4103);
        setField(term2200364, term2200364.getClass(), "call", term2200458);
        setField(term2200034, term2200034.getClass(), "typeOfThis", term2200364);
        Class<? extends Object> term2203719 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2203718 = ((Class) term2203719).getDeclaredField((String) "INTERFACE");
        ((Field) term2203718).setAccessible(true);
        Object enum4104 = ((Field) term2203718).get((Object) null);
        Class<? extends Object> term2204013 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2204012 = ((Class) term2204013).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2204012).setAccessible(true);
        Object enum4105 = ((Field) term2204012).get((Object) null);
        term2203100 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2203104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2203100, term2203100.getClass(), "this$0", null);
        setField(term2203100, term2203100.getClass(), "call", null);
        setField(term2203100, term2203100.getClass(), "prototype", null);
        setField(term2203100, term2203100.getClass(), "kind", enum4104);
        setField(term2203104, term2203104.getClass(), "this$0", null);
        setField(term2203104, term2203104.getClass(), "call", null);
        setField(term2203104, term2203104.getClass(), "prototype", null);
        setField(term2203104, term2203104.getClass(), "kind", enum4105);
        setField(term2203104, term2203104.getClass(), "typeOfThis", null);
        setField(term2203104, term2203104.getClass(), "source", null);
        setField(term2203104, term2203104.getClass(), "implementedInterfaces", null);
        setField(term2203104, term2203104.getClass(), "subTypes", null);
        setField(term2203104, term2203104.getClass(), "templateTypeName", null);
        setField(term2203104, term2203104.getClass(), "className", null);
        setField(term2203104, term2203104.getClass(), "properties", null);
        setField(term2203104, term2203104.getClass(), "implicitPrototype", null);
        setBooleanField(term2203104, term2203104.getClass(), "nativeType", false);
        setBooleanField(term2203104, term2203104.getClass(), "visited", false);
        setField(term2203104, term2203104.getClass(), "docInfo", null);
        setBooleanField(term2203104, term2203104.getClass(), "unknown", false);
        setBooleanField(term2203104, term2203104.getClass(), "resolved", false);
        setField(term2203104, term2203104.getClass(), "resolveResult", null);
        setField(term2203104, term2203104.getClass(), "registry", null);
        setField(term2203100, term2203100.getClass(), "typeOfThis", term2203104);
        setField(term2203100, term2203100.getClass(), "source", null);
        setField(term2203100, term2203100.getClass(), "implementedInterfaces", null);
        setField(term2203100, term2203100.getClass(), "subTypes", null);
        setField(term2203100, term2203100.getClass(), "templateTypeName", null);
        setField(term2203100, term2203100.getClass(), "className", null);
        setField(term2203100, term2203100.getClass(), "properties", null);
        setField(term2203100, term2203100.getClass(), "implicitPrototype", null);
        setBooleanField(term2203100, term2203100.getClass(), "nativeType", false);
        setBooleanField(term2203100, term2203100.getClass(), "visited", false);
        setField(term2203100, term2203100.getClass(), "docInfo", null);
        setBooleanField(term2203100, term2203100.getClass(), "unknown", false);
        setBooleanField(term2203100, term2203100.getClass(), "resolved", false);
        setField(term2203100, term2203100.getClass(), "resolveResult", null);
        setField(term2203100, term2203100.getClass(), "registry", null);
        Class<? extends Object> term2204313 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2204312 = ((Class) term2204313).getDeclaredField((String) "INTERFACE");
        ((Field) term2204312).setAccessible(true);
        Object enum4106 = ((Field) term2204312).get((Object) null);
        Class<? extends Object> term2204607 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2204606 = ((Class) term2204607).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2204606).setAccessible(true);
        Object enum4107 = ((Field) term2204606).get((Object) null);
        term2203108 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2203112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2203113 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2203108, term2203108.getClass(), "this$0", null);
        setField(term2203108, term2203108.getClass(), "call", null);
        setField(term2203108, term2203108.getClass(), "prototype", null);
        setField(term2203108, term2203108.getClass(), "kind", enum4106);
        setField(term2203112, term2203112.getClass(), "this$0", null);
        setField(term2203113, term2203113.getClass(), "parameters", null);
        setField(term2203113, term2203113.getClass(), "returnType", null);
        setBooleanField(term2203113, term2203113.getClass(), "resolved", false);
        setField(term2203113, term2203113.getClass(), "resolveResult", null);
        setField(term2203113, term2203113.getClass(), "registry", null);
        setField(term2203112, term2203112.getClass(), "call", term2203113);
        setField(term2203112, term2203112.getClass(), "prototype", null);
        setField(term2203112, term2203112.getClass(), "kind", enum4107);
        setField(term2203112, term2203112.getClass(), "typeOfThis", null);
        setField(term2203112, term2203112.getClass(), "source", null);
        setField(term2203112, term2203112.getClass(), "implementedInterfaces", null);
        setField(term2203112, term2203112.getClass(), "subTypes", null);
        setField(term2203112, term2203112.getClass(), "templateTypeName", null);
        setField(term2203112, term2203112.getClass(), "className", null);
        setField(term2203112, term2203112.getClass(), "properties", null);
        setField(term2203112, term2203112.getClass(), "implicitPrototype", null);
        setBooleanField(term2203112, term2203112.getClass(), "nativeType", false);
        setBooleanField(term2203112, term2203112.getClass(), "visited", false);
        setField(term2203112, term2203112.getClass(), "docInfo", null);
        setBooleanField(term2203112, term2203112.getClass(), "unknown", false);
        setBooleanField(term2203112, term2203112.getClass(), "resolved", false);
        setField(term2203112, term2203112.getClass(), "resolveResult", null);
        setField(term2203112, term2203112.getClass(), "registry", null);
        setField(term2203108, term2203108.getClass(), "typeOfThis", term2203112);
        setField(term2203108, term2203108.getClass(), "source", null);
        setField(term2203108, term2203108.getClass(), "implementedInterfaces", null);
        setField(term2203108, term2203108.getClass(), "subTypes", null);
        setField(term2203108, term2203108.getClass(), "templateTypeName", null);
        setField(term2203108, term2203108.getClass(), "className", null);
        setField(term2203108, term2203108.getClass(), "properties", null);
        setField(term2203108, term2203108.getClass(), "implicitPrototype", null);
        setBooleanField(term2203108, term2203108.getClass(), "nativeType", false);
        setBooleanField(term2203108, term2203108.getClass(), "visited", false);
        setField(term2203108, term2203108.getClass(), "docInfo", null);
        setBooleanField(term2203108, term2203108.getClass(), "unknown", false);
        setBooleanField(term2203108, term2203108.getClass(), "resolved", false);
        setField(term2203108, term2203108.getClass(), "resolveResult", null);
        setField(term2203108, term2203108.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2200034;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2199374, args);
        assertTrue(recursiveEquals(term2199374, term2203100));
        assertTrue(recursiveEquals(term2200034, term2203108));
        assertTrue(recursiveEquals(retValue, true));
    }

};


