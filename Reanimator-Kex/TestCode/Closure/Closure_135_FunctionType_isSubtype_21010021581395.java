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

public class FunctionType_isSubtype_21010021581395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1797076;
     Object term1797684;
     Object term1799462;
     Object term1799471;

    public FunctionType_isSubtype_21010021581395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1799482 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1799481 = ((Class) term1799482).getDeclaredField((String) "ORDINARY");
        ((Field) term1799481).setAccessible(true);
        Object enum3351 = ((Field) term1799481).get((Object) null);
        Class<? extends Object> term1799773 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1799772 = ((Class) term1799773).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1799772).setAccessible(true);
        Object enum3352 = ((Field) term1799772).get((Object) null);
        term1797076 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1797334 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1797576 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1797076, term1797076.getClass(), "kind", enum3351);
        setField(term1797334, term1797334.getClass(), "kind", enum3352);
        setField(term1797076, term1797076.getClass(), "typeOfThis", term1797334);
        setField(term1797076, term1797076.getClass(), "call", term1797576);
        Class<? extends Object> term1800073 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1800072 = ((Class) term1800073).getDeclaredField((String) "INTERFACE");
        ((Field) term1800072).setAccessible(true);
        Object enum3353 = ((Field) term1800072).get((Object) null);
        term1797684 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1797866 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1798108 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1797684, term1797684.getClass(), "kind", enum3351);
        setField(term1797866, term1797866.getClass(), "kind", enum3353);
        setField(term1797684, term1797684.getClass(), "typeOfThis", term1797866);
        setField(term1797684, term1797684.getClass(), "call", term1798108);
        Class<? extends Object> term1800367 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1800366 = ((Class) term1800367).getDeclaredField((String) "ORDINARY");
        ((Field) term1800366).setAccessible(true);
        Object enum3354 = ((Field) term1800366).get((Object) null);
        Class<? extends Object> term1800658 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1800657 = ((Class) term1800658).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1800657).setAccessible(true);
        Object enum3355 = ((Field) term1800657).get((Object) null);
        term1799462 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1799463 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1799467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1799462, term1799462.getClass(), "this$0", null);
        setField(term1799463, term1799463.getClass(), "parameters", null);
        setField(term1799463, term1799463.getClass(), "returnType", null);
        setBooleanField(term1799463, term1799463.getClass(), "resolved", false);
        setField(term1799463, term1799463.getClass(), "resolveResult", null);
        setField(term1799463, term1799463.getClass(), "registry", null);
        setField(term1799462, term1799462.getClass(), "call", term1799463);
        setField(term1799462, term1799462.getClass(), "prototype", null);
        setField(term1799462, term1799462.getClass(), "kind", enum3354);
        setField(term1799467, term1799467.getClass(), "call", null);
        setField(term1799467, term1799467.getClass(), "prototype", null);
        setField(term1799467, term1799467.getClass(), "kind", enum3355);
        setField(term1799467, term1799467.getClass(), "typeOfThis", null);
        setField(term1799467, term1799467.getClass(), "source", null);
        setField(term1799467, term1799467.getClass(), "implementedInterfaces", null);
        setField(term1799467, term1799467.getClass(), "subTypes", null);
        setField(term1799467, term1799467.getClass(), "templateTypeName", null);
        setField(term1799467, term1799467.getClass(), "className", null);
        setField(term1799467, term1799467.getClass(), "properties", null);
        setField(term1799467, term1799467.getClass(), "implicitPrototype", null);
        setBooleanField(term1799467, term1799467.getClass(), "nativeType", false);
        setBooleanField(term1799467, term1799467.getClass(), "visited", false);
        setField(term1799467, term1799467.getClass(), "docInfo", null);
        setBooleanField(term1799467, term1799467.getClass(), "unknown", false);
        setBooleanField(term1799467, term1799467.getClass(), "resolved", false);
        setField(term1799467, term1799467.getClass(), "resolveResult", null);
        setField(term1799467, term1799467.getClass(), "registry", null);
        setField(term1799462, term1799462.getClass(), "typeOfThis", term1799467);
        setField(term1799462, term1799462.getClass(), "source", null);
        setField(term1799462, term1799462.getClass(), "implementedInterfaces", null);
        setField(term1799462, term1799462.getClass(), "subTypes", null);
        setField(term1799462, term1799462.getClass(), "templateTypeName", null);
        setField(term1799462, term1799462.getClass(), "className", null);
        setField(term1799462, term1799462.getClass(), "properties", null);
        setField(term1799462, term1799462.getClass(), "implicitPrototype", null);
        setBooleanField(term1799462, term1799462.getClass(), "nativeType", false);
        setBooleanField(term1799462, term1799462.getClass(), "visited", false);
        setField(term1799462, term1799462.getClass(), "docInfo", null);
        setBooleanField(term1799462, term1799462.getClass(), "unknown", false);
        setBooleanField(term1799462, term1799462.getClass(), "resolved", false);
        setField(term1799462, term1799462.getClass(), "resolveResult", null);
        setField(term1799462, term1799462.getClass(), "registry", null);
        Class<? extends Object> term1800958 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1800957 = ((Class) term1800958).getDeclaredField((String) "ORDINARY");
        ((Field) term1800957).setAccessible(true);
        Object enum3356 = ((Field) term1800957).get((Object) null);
        Class<? extends Object> term1801249 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1801248 = ((Class) term1801249).getDeclaredField((String) "INTERFACE");
        ((Field) term1801248).setAccessible(true);
        Object enum3357 = ((Field) term1801248).get((Object) null);
        term1799471 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1799472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1799476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1799471, term1799471.getClass(), "this$0", null);
        setField(term1799472, term1799472.getClass(), "parameters", null);
        setField(term1799472, term1799472.getClass(), "returnType", null);
        setBooleanField(term1799472, term1799472.getClass(), "resolved", false);
        setField(term1799472, term1799472.getClass(), "resolveResult", null);
        setField(term1799472, term1799472.getClass(), "registry", null);
        setField(term1799471, term1799471.getClass(), "call", term1799472);
        setField(term1799471, term1799471.getClass(), "prototype", null);
        setField(term1799471, term1799471.getClass(), "kind", enum3356);
        setField(term1799476, term1799476.getClass(), "this$0", null);
        setField(term1799476, term1799476.getClass(), "call", null);
        setField(term1799476, term1799476.getClass(), "prototype", null);
        setField(term1799476, term1799476.getClass(), "kind", enum3357);
        setField(term1799476, term1799476.getClass(), "typeOfThis", null);
        setField(term1799476, term1799476.getClass(), "source", null);
        setField(term1799476, term1799476.getClass(), "implementedInterfaces", null);
        setField(term1799476, term1799476.getClass(), "subTypes", null);
        setField(term1799476, term1799476.getClass(), "templateTypeName", null);
        setField(term1799476, term1799476.getClass(), "className", null);
        setField(term1799476, term1799476.getClass(), "properties", null);
        setField(term1799476, term1799476.getClass(), "implicitPrototype", null);
        setBooleanField(term1799476, term1799476.getClass(), "nativeType", false);
        setBooleanField(term1799476, term1799476.getClass(), "visited", false);
        setField(term1799476, term1799476.getClass(), "docInfo", null);
        setBooleanField(term1799476, term1799476.getClass(), "unknown", false);
        setBooleanField(term1799476, term1799476.getClass(), "resolved", false);
        setField(term1799476, term1799476.getClass(), "resolveResult", null);
        setField(term1799476, term1799476.getClass(), "registry", null);
        setField(term1799471, term1799471.getClass(), "typeOfThis", term1799476);
        setField(term1799471, term1799471.getClass(), "source", null);
        setField(term1799471, term1799471.getClass(), "implementedInterfaces", null);
        setField(term1799471, term1799471.getClass(), "subTypes", null);
        setField(term1799471, term1799471.getClass(), "templateTypeName", null);
        setField(term1799471, term1799471.getClass(), "className", null);
        setField(term1799471, term1799471.getClass(), "properties", null);
        setField(term1799471, term1799471.getClass(), "implicitPrototype", null);
        setBooleanField(term1799471, term1799471.getClass(), "nativeType", false);
        setBooleanField(term1799471, term1799471.getClass(), "visited", false);
        setField(term1799471, term1799471.getClass(), "docInfo", null);
        setBooleanField(term1799471, term1799471.getClass(), "unknown", false);
        setBooleanField(term1799471, term1799471.getClass(), "resolved", false);
        setField(term1799471, term1799471.getClass(), "resolveResult", null);
        setField(term1799471, term1799471.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1797684;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1797076, args);
        assertTrue(recursiveEquals(term1797076, term1799462));
        assertTrue(recursiveEquals(term1797684, term1799471));
        assertTrue(recursiveEquals(retValue, true));
    }

};


