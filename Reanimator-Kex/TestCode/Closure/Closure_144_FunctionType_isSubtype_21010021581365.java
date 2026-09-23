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

public class FunctionType_isSubtype_21010021581365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1923482;
     Object term1924080;
     Object term1925787;
     Object term1925796;

    public FunctionType_isSubtype_21010021581365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1925806 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1925805 = ((Class) term1925806).getDeclaredField((String) "ORDINARY");
        ((Field) term1925805).setAccessible(true);
        Object enum3411 = ((Field) term1925805).get((Object) null);
        Class<? extends Object> term1926097 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1926096 = ((Class) term1926097).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1926096).setAccessible(true);
        Object enum3412 = ((Field) term1926096).get((Object) null);
        term1923482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1923730 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1923972 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1923482, term1923482.getClass(), "kind", enum3411);
        setField(term1923730, term1923730.getClass(), "kind", enum3412);
        setField(term1923482, term1923482.getClass(), "typeOfThis", term1923730);
        setField(term1923482, term1923482.getClass(), "call", term1923972);
        Class<? extends Object> term1926397 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1926396 = ((Class) term1926397).getDeclaredField((String) "INTERFACE");
        ((Field) term1926396).setAccessible(true);
        Object enum3413 = ((Field) term1926396).get((Object) null);
        term1924080 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1924262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1924080, term1924080.getClass(), "kind", enum3411);
        setField(term1924262, term1924262.getClass(), "kind", enum3413);
        setField(term1924080, term1924080.getClass(), "typeOfThis", term1924262);
        setField(term1924080, term1924080.getClass(), "call", null);
        Class<? extends Object> term1926691 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1926690 = ((Class) term1926691).getDeclaredField((String) "ORDINARY");
        ((Field) term1926690).setAccessible(true);
        Object enum3414 = ((Field) term1926690).get((Object) null);
        Class<? extends Object> term1926982 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1926981 = ((Class) term1926982).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1926981).setAccessible(true);
        Object enum3415 = ((Field) term1926981).get((Object) null);
        term1925787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1925788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1925792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1925787, term1925787.getClass(), "this$0", null);
        setField(term1925788, term1925788.getClass(), "parameters", null);
        setField(term1925788, term1925788.getClass(), "returnType", null);
        setBooleanField(term1925788, term1925788.getClass(), "returnTypeInferred", false);
        setBooleanField(term1925788, term1925788.getClass(), "resolved", false);
        setField(term1925788, term1925788.getClass(), "resolveResult", null);
        setField(term1925788, term1925788.getClass(), "registry", null);
        setField(term1925787, term1925787.getClass(), "call", term1925788);
        setField(term1925787, term1925787.getClass(), "prototype", null);
        setField(term1925787, term1925787.getClass(), "kind", enum3414);
        setField(term1925792, term1925792.getClass(), "call", null);
        setField(term1925792, term1925792.getClass(), "prototype", null);
        setField(term1925792, term1925792.getClass(), "kind", enum3415);
        setField(term1925792, term1925792.getClass(), "typeOfThis", null);
        setField(term1925792, term1925792.getClass(), "source", null);
        setField(term1925792, term1925792.getClass(), "implementedInterfaces", null);
        setField(term1925792, term1925792.getClass(), "subTypes", null);
        setField(term1925792, term1925792.getClass(), "templateTypeName", null);
        setField(term1925792, term1925792.getClass(), "className", null);
        setField(term1925792, term1925792.getClass(), "properties", null);
        setField(term1925792, term1925792.getClass(), "implicitPrototype", null);
        setBooleanField(term1925792, term1925792.getClass(), "nativeType", false);
        setBooleanField(term1925792, term1925792.getClass(), "prettyPrint", false);
        setBooleanField(term1925792, term1925792.getClass(), "visited", false);
        setField(term1925792, term1925792.getClass(), "docInfo", null);
        setBooleanField(term1925792, term1925792.getClass(), "unknown", false);
        setBooleanField(term1925792, term1925792.getClass(), "resolved", false);
        setField(term1925792, term1925792.getClass(), "resolveResult", null);
        setField(term1925792, term1925792.getClass(), "registry", null);
        setField(term1925787, term1925787.getClass(), "typeOfThis", term1925792);
        setField(term1925787, term1925787.getClass(), "source", null);
        setField(term1925787, term1925787.getClass(), "implementedInterfaces", null);
        setField(term1925787, term1925787.getClass(), "subTypes", null);
        setField(term1925787, term1925787.getClass(), "templateTypeName", null);
        setField(term1925787, term1925787.getClass(), "className", null);
        setField(term1925787, term1925787.getClass(), "properties", null);
        setField(term1925787, term1925787.getClass(), "implicitPrototype", null);
        setBooleanField(term1925787, term1925787.getClass(), "nativeType", false);
        setBooleanField(term1925787, term1925787.getClass(), "prettyPrint", false);
        setBooleanField(term1925787, term1925787.getClass(), "visited", false);
        setField(term1925787, term1925787.getClass(), "docInfo", null);
        setBooleanField(term1925787, term1925787.getClass(), "unknown", false);
        setBooleanField(term1925787, term1925787.getClass(), "resolved", false);
        setField(term1925787, term1925787.getClass(), "resolveResult", null);
        setField(term1925787, term1925787.getClass(), "registry", null);
        Class<? extends Object> term1927282 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1927281 = ((Class) term1927282).getDeclaredField((String) "ORDINARY");
        ((Field) term1927281).setAccessible(true);
        Object enum3416 = ((Field) term1927281).get((Object) null);
        Class<? extends Object> term1927573 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1927572 = ((Class) term1927573).getDeclaredField((String) "INTERFACE");
        ((Field) term1927572).setAccessible(true);
        Object enum3417 = ((Field) term1927572).get((Object) null);
        term1925796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1925800 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1925796, term1925796.getClass(), "this$0", null);
        setField(term1925796, term1925796.getClass(), "call", null);
        setField(term1925796, term1925796.getClass(), "prototype", null);
        setField(term1925796, term1925796.getClass(), "kind", enum3416);
        setField(term1925800, term1925800.getClass(), "this$0", null);
        setField(term1925800, term1925800.getClass(), "call", null);
        setField(term1925800, term1925800.getClass(), "prototype", null);
        setField(term1925800, term1925800.getClass(), "kind", enum3417);
        setField(term1925800, term1925800.getClass(), "typeOfThis", null);
        setField(term1925800, term1925800.getClass(), "source", null);
        setField(term1925800, term1925800.getClass(), "implementedInterfaces", null);
        setField(term1925800, term1925800.getClass(), "subTypes", null);
        setField(term1925800, term1925800.getClass(), "templateTypeName", null);
        setField(term1925800, term1925800.getClass(), "className", null);
        setField(term1925800, term1925800.getClass(), "properties", null);
        setField(term1925800, term1925800.getClass(), "implicitPrototype", null);
        setBooleanField(term1925800, term1925800.getClass(), "nativeType", false);
        setBooleanField(term1925800, term1925800.getClass(), "prettyPrint", false);
        setBooleanField(term1925800, term1925800.getClass(), "visited", false);
        setField(term1925800, term1925800.getClass(), "docInfo", null);
        setBooleanField(term1925800, term1925800.getClass(), "unknown", false);
        setBooleanField(term1925800, term1925800.getClass(), "resolved", false);
        setField(term1925800, term1925800.getClass(), "resolveResult", null);
        setField(term1925800, term1925800.getClass(), "registry", null);
        setField(term1925796, term1925796.getClass(), "typeOfThis", term1925800);
        setField(term1925796, term1925796.getClass(), "source", null);
        setField(term1925796, term1925796.getClass(), "implementedInterfaces", null);
        setField(term1925796, term1925796.getClass(), "subTypes", null);
        setField(term1925796, term1925796.getClass(), "templateTypeName", null);
        setField(term1925796, term1925796.getClass(), "className", null);
        setField(term1925796, term1925796.getClass(), "properties", null);
        setField(term1925796, term1925796.getClass(), "implicitPrototype", null);
        setBooleanField(term1925796, term1925796.getClass(), "nativeType", false);
        setBooleanField(term1925796, term1925796.getClass(), "prettyPrint", false);
        setBooleanField(term1925796, term1925796.getClass(), "visited", false);
        setField(term1925796, term1925796.getClass(), "docInfo", null);
        setBooleanField(term1925796, term1925796.getClass(), "unknown", false);
        setBooleanField(term1925796, term1925796.getClass(), "resolved", false);
        setField(term1925796, term1925796.getClass(), "resolveResult", null);
        setField(term1925796, term1925796.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1924080;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1923482, args);
        assertTrue(recursiveEquals(term1923482, term1925787));
        assertTrue(recursiveEquals(term1924080, term1925796));
        assertTrue(recursiveEquals(retValue, false));
    }

};


