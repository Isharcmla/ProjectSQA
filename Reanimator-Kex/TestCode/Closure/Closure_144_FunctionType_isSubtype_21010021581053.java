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

public class FunctionType_isSubtype_21010021581053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1359484;
     Object term1359936;
     Object term1362757;
     Object term1362763;

    public FunctionType_isSubtype_21010021581053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1362773 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1362772 = ((Class) term1362773).getDeclaredField((String) "ORDINARY");
        ((Field) term1362772).setAccessible(true);
        Object enum2439 = ((Field) term1362772).get((Object) null);
        term1359484 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1359732 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1359826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1359484, term1359484.getClass(), "kind", enum2439);
        setField(term1359732, term1359732.getClass(), "kind", enum2439);
        setField(term1359484, term1359484.getClass(), "typeOfThis", term1359732);
        setField(term1359484, term1359484.getClass(), "call", term1359826);
        Class<? extends Object> term1363064 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1363063 = ((Class) term1363064).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1363063).setAccessible(true);
        Object enum2440 = ((Field) term1363063).get((Object) null);
        Class<? extends Object> term1363364 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1363363 = ((Class) term1363364).getDeclaredField((String) "INTERFACE");
        ((Field) term1363363).setAccessible(true);
        Object enum2441 = ((Field) term1363363).get((Object) null);
        term1359936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1360194 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1359936, term1359936.getClass(), "kind", enum2440);
        setField(term1360194, term1360194.getClass(), "kind", enum2441);
        setField(term1359936, term1359936.getClass(), "typeOfThis", term1360194);
        setField(term1359936, term1359936.getClass(), "call", null);
        Class<? extends Object> term1363658 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1363657 = ((Class) term1363658).getDeclaredField((String) "ORDINARY");
        ((Field) term1363657).setAccessible(true);
        Object enum2442 = ((Field) term1363657).get((Object) null);
        term1362757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1362758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1362762 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1362757, term1362757.getClass(), "this$0", null);
        setField(term1362758, term1362758.getClass(), "parameters", null);
        setField(term1362758, term1362758.getClass(), "returnType", null);
        setBooleanField(term1362758, term1362758.getClass(), "returnTypeInferred", false);
        setBooleanField(term1362758, term1362758.getClass(), "resolved", false);
        setField(term1362758, term1362758.getClass(), "resolveResult", null);
        setField(term1362758, term1362758.getClass(), "registry", null);
        setField(term1362757, term1362757.getClass(), "call", term1362758);
        setField(term1362757, term1362757.getClass(), "prototype", null);
        setField(term1362757, term1362757.getClass(), "kind", enum2442);
        setField(term1362762, term1362762.getClass(), "call", null);
        setField(term1362762, term1362762.getClass(), "prototype", null);
        setField(term1362762, term1362762.getClass(), "kind", enum2442);
        setField(term1362762, term1362762.getClass(), "typeOfThis", null);
        setField(term1362762, term1362762.getClass(), "source", null);
        setField(term1362762, term1362762.getClass(), "implementedInterfaces", null);
        setField(term1362762, term1362762.getClass(), "subTypes", null);
        setField(term1362762, term1362762.getClass(), "templateTypeName", null);
        setField(term1362762, term1362762.getClass(), "className", null);
        setField(term1362762, term1362762.getClass(), "properties", null);
        setField(term1362762, term1362762.getClass(), "implicitPrototype", null);
        setBooleanField(term1362762, term1362762.getClass(), "nativeType", false);
        setBooleanField(term1362762, term1362762.getClass(), "prettyPrint", false);
        setBooleanField(term1362762, term1362762.getClass(), "visited", false);
        setField(term1362762, term1362762.getClass(), "docInfo", null);
        setBooleanField(term1362762, term1362762.getClass(), "unknown", false);
        setBooleanField(term1362762, term1362762.getClass(), "resolved", false);
        setField(term1362762, term1362762.getClass(), "resolveResult", null);
        setField(term1362762, term1362762.getClass(), "registry", null);
        setField(term1362757, term1362757.getClass(), "typeOfThis", term1362762);
        setField(term1362757, term1362757.getClass(), "source", null);
        setField(term1362757, term1362757.getClass(), "implementedInterfaces", null);
        setField(term1362757, term1362757.getClass(), "subTypes", null);
        setField(term1362757, term1362757.getClass(), "templateTypeName", null);
        setField(term1362757, term1362757.getClass(), "className", null);
        setField(term1362757, term1362757.getClass(), "properties", null);
        setField(term1362757, term1362757.getClass(), "implicitPrototype", null);
        setBooleanField(term1362757, term1362757.getClass(), "nativeType", false);
        setBooleanField(term1362757, term1362757.getClass(), "prettyPrint", false);
        setBooleanField(term1362757, term1362757.getClass(), "visited", false);
        setField(term1362757, term1362757.getClass(), "docInfo", null);
        setBooleanField(term1362757, term1362757.getClass(), "unknown", false);
        setBooleanField(term1362757, term1362757.getClass(), "resolved", false);
        setField(term1362757, term1362757.getClass(), "resolveResult", null);
        setField(term1362757, term1362757.getClass(), "registry", null);
        Class<? extends Object> term1363949 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1363948 = ((Class) term1363949).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1363948).setAccessible(true);
        Object enum2443 = ((Field) term1363948).get((Object) null);
        Class<? extends Object> term1364249 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1364248 = ((Class) term1364249).getDeclaredField((String) "INTERFACE");
        ((Field) term1364248).setAccessible(true);
        Object enum2444 = ((Field) term1364248).get((Object) null);
        term1362763 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1362767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1362763, term1362763.getClass(), "call", null);
        setField(term1362763, term1362763.getClass(), "prototype", null);
        setField(term1362763, term1362763.getClass(), "kind", enum2443);
        setField(term1362767, term1362767.getClass(), "call", null);
        setField(term1362767, term1362767.getClass(), "prototype", null);
        setField(term1362767, term1362767.getClass(), "kind", enum2444);
        setField(term1362767, term1362767.getClass(), "typeOfThis", null);
        setField(term1362767, term1362767.getClass(), "source", null);
        setField(term1362767, term1362767.getClass(), "implementedInterfaces", null);
        setField(term1362767, term1362767.getClass(), "subTypes", null);
        setField(term1362767, term1362767.getClass(), "templateTypeName", null);
        setField(term1362767, term1362767.getClass(), "className", null);
        setField(term1362767, term1362767.getClass(), "properties", null);
        setField(term1362767, term1362767.getClass(), "implicitPrototype", null);
        setBooleanField(term1362767, term1362767.getClass(), "nativeType", false);
        setBooleanField(term1362767, term1362767.getClass(), "prettyPrint", false);
        setBooleanField(term1362767, term1362767.getClass(), "visited", false);
        setField(term1362767, term1362767.getClass(), "docInfo", null);
        setBooleanField(term1362767, term1362767.getClass(), "unknown", false);
        setBooleanField(term1362767, term1362767.getClass(), "resolved", false);
        setField(term1362767, term1362767.getClass(), "resolveResult", null);
        setField(term1362767, term1362767.getClass(), "registry", null);
        setField(term1362763, term1362763.getClass(), "typeOfThis", term1362767);
        setField(term1362763, term1362763.getClass(), "source", null);
        setField(term1362763, term1362763.getClass(), "implementedInterfaces", null);
        setField(term1362763, term1362763.getClass(), "subTypes", null);
        setField(term1362763, term1362763.getClass(), "templateTypeName", null);
        setField(term1362763, term1362763.getClass(), "className", null);
        setField(term1362763, term1362763.getClass(), "properties", null);
        setField(term1362763, term1362763.getClass(), "implicitPrototype", null);
        setBooleanField(term1362763, term1362763.getClass(), "nativeType", false);
        setBooleanField(term1362763, term1362763.getClass(), "prettyPrint", false);
        setBooleanField(term1362763, term1362763.getClass(), "visited", false);
        setField(term1362763, term1362763.getClass(), "docInfo", null);
        setBooleanField(term1362763, term1362763.getClass(), "unknown", false);
        setBooleanField(term1362763, term1362763.getClass(), "resolved", false);
        setField(term1362763, term1362763.getClass(), "resolveResult", null);
        setField(term1362763, term1362763.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1359936;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1359484, args);
        assertTrue(recursiveEquals(term1359484, term1362757));
        assertTrue(recursiveEquals(term1359936, term1362763));
        assertTrue(recursiveEquals(retValue, false));
    }

};


