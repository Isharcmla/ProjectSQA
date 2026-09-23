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

public class FunctionType_isSubtype_21010021581632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2194680;
     Object term2195130;
     Object term2198207;
     Object term2198213;

    public FunctionType_isSubtype_21010021581632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2198221 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2198220 = ((Class) term2198221).getDeclaredField((String) "ORDINARY");
        ((Field) term2198220).setAccessible(true);
        Object enum4095 = ((Field) term2198220).get((Object) null);
        term2194680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2194928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2195022 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2194680, term2194680.getClass(), "kind", enum4095);
        setField(term2194680, term2194680.getClass(), "typeOfThis", term2194928);
        setField(term2194680, term2194680.getClass(), "call", term2195022);
        term2195130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2195292 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term2195386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2195130, term2195130.getClass(), "kind", enum4095);
        setField(term2195130, term2195130.getClass(), "typeOfThis", term2195292);
        setField(term2195130, term2195130.getClass(), "call", term2195386);
        Class<? extends Object> term2198512 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2198511 = ((Class) term2198512).getDeclaredField((String) "ORDINARY");
        ((Field) term2198511).setAccessible(true);
        Object enum4096 = ((Field) term2198511).get((Object) null);
        term2198207 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2198208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2198212 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2198207, term2198207.getClass(), "this$0", null);
        setField(term2198208, term2198208.getClass(), "parameters", null);
        setField(term2198208, term2198208.getClass(), "returnType", null);
        setBooleanField(term2198208, term2198208.getClass(), "resolved", false);
        setField(term2198208, term2198208.getClass(), "resolveResult", null);
        setField(term2198208, term2198208.getClass(), "registry", null);
        setField(term2198207, term2198207.getClass(), "call", term2198208);
        setField(term2198207, term2198207.getClass(), "prototype", null);
        setField(term2198207, term2198207.getClass(), "kind", enum4096);
        setField(term2198212, term2198212.getClass(), "call", null);
        setField(term2198212, term2198212.getClass(), "prototype", null);
        setField(term2198212, term2198212.getClass(), "kind", null);
        setField(term2198212, term2198212.getClass(), "typeOfThis", null);
        setField(term2198212, term2198212.getClass(), "source", null);
        setField(term2198212, term2198212.getClass(), "implementedInterfaces", null);
        setField(term2198212, term2198212.getClass(), "subTypes", null);
        setField(term2198212, term2198212.getClass(), "templateTypeName", null);
        setField(term2198212, term2198212.getClass(), "className", null);
        setField(term2198212, term2198212.getClass(), "properties", null);
        setField(term2198212, term2198212.getClass(), "implicitPrototype", null);
        setBooleanField(term2198212, term2198212.getClass(), "nativeType", false);
        setBooleanField(term2198212, term2198212.getClass(), "visited", false);
        setField(term2198212, term2198212.getClass(), "docInfo", null);
        setBooleanField(term2198212, term2198212.getClass(), "unknown", false);
        setBooleanField(term2198212, term2198212.getClass(), "resolved", false);
        setField(term2198212, term2198212.getClass(), "resolveResult", null);
        setField(term2198212, term2198212.getClass(), "registry", null);
        setField(term2198207, term2198207.getClass(), "typeOfThis", term2198212);
        setField(term2198207, term2198207.getClass(), "source", null);
        setField(term2198207, term2198207.getClass(), "implementedInterfaces", null);
        setField(term2198207, term2198207.getClass(), "subTypes", null);
        setField(term2198207, term2198207.getClass(), "templateTypeName", null);
        setField(term2198207, term2198207.getClass(), "className", null);
        setField(term2198207, term2198207.getClass(), "properties", null);
        setField(term2198207, term2198207.getClass(), "implicitPrototype", null);
        setBooleanField(term2198207, term2198207.getClass(), "nativeType", false);
        setBooleanField(term2198207, term2198207.getClass(), "visited", false);
        setField(term2198207, term2198207.getClass(), "docInfo", null);
        setBooleanField(term2198207, term2198207.getClass(), "unknown", false);
        setBooleanField(term2198207, term2198207.getClass(), "resolved", false);
        setField(term2198207, term2198207.getClass(), "resolveResult", null);
        setField(term2198207, term2198207.getClass(), "registry", null);
        Class<? extends Object> term2198803 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2198802 = ((Class) term2198803).getDeclaredField((String) "ORDINARY");
        ((Field) term2198802).setAccessible(true);
        Object enum4097 = ((Field) term2198802).get((Object) null);
        term2198213 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2198214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2198218 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term2198213, term2198213.getClass(), "this$0", null);
        setField(term2198214, term2198214.getClass(), "parameters", null);
        setField(term2198214, term2198214.getClass(), "returnType", null);
        setBooleanField(term2198214, term2198214.getClass(), "resolved", false);
        setField(term2198214, term2198214.getClass(), "resolveResult", null);
        setField(term2198214, term2198214.getClass(), "registry", null);
        setField(term2198213, term2198213.getClass(), "call", term2198214);
        setField(term2198213, term2198213.getClass(), "prototype", null);
        setField(term2198213, term2198213.getClass(), "kind", enum4097);
        setField(term2198218, term2198218.getClass(), "leastSupertypeVisitor", null);
        setField(term2198218, term2198218.getClass(), "greatestSubtypeVisitor", null);
        setField(term2198218, term2198218.getClass(), "call", null);
        setField(term2198218, term2198218.getClass(), "prototype", null);
        setField(term2198218, term2198218.getClass(), "kind", null);
        setField(term2198218, term2198218.getClass(), "typeOfThis", null);
        setField(term2198218, term2198218.getClass(), "source", null);
        setField(term2198218, term2198218.getClass(), "implementedInterfaces", null);
        setField(term2198218, term2198218.getClass(), "subTypes", null);
        setField(term2198218, term2198218.getClass(), "templateTypeName", null);
        setField(term2198218, term2198218.getClass(), "className", null);
        setField(term2198218, term2198218.getClass(), "properties", null);
        setField(term2198218, term2198218.getClass(), "implicitPrototype", null);
        setBooleanField(term2198218, term2198218.getClass(), "nativeType", false);
        setBooleanField(term2198218, term2198218.getClass(), "visited", false);
        setField(term2198218, term2198218.getClass(), "docInfo", null);
        setBooleanField(term2198218, term2198218.getClass(), "unknown", false);
        setBooleanField(term2198218, term2198218.getClass(), "resolved", false);
        setField(term2198218, term2198218.getClass(), "resolveResult", null);
        setField(term2198218, term2198218.getClass(), "registry", null);
        setField(term2198213, term2198213.getClass(), "typeOfThis", term2198218);
        setField(term2198213, term2198213.getClass(), "source", null);
        setField(term2198213, term2198213.getClass(), "implementedInterfaces", null);
        setField(term2198213, term2198213.getClass(), "subTypes", null);
        setField(term2198213, term2198213.getClass(), "templateTypeName", null);
        setField(term2198213, term2198213.getClass(), "className", null);
        setField(term2198213, term2198213.getClass(), "properties", null);
        setField(term2198213, term2198213.getClass(), "implicitPrototype", null);
        setBooleanField(term2198213, term2198213.getClass(), "nativeType", false);
        setBooleanField(term2198213, term2198213.getClass(), "visited", false);
        setField(term2198213, term2198213.getClass(), "docInfo", null);
        setBooleanField(term2198213, term2198213.getClass(), "unknown", false);
        setBooleanField(term2198213, term2198213.getClass(), "resolved", false);
        setField(term2198213, term2198213.getClass(), "resolveResult", null);
        setField(term2198213, term2198213.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2195130;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2194680, args);
        assertTrue(recursiveEquals(term2194680, term2198207));
        assertTrue(recursiveEquals(term2195130, term2198213));
        assertTrue(recursiveEquals(retValue, true));
    }

};


