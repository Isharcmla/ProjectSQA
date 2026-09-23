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

public class FunctionType_isSubtype_21010021581473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1923856;
     Object term1924516;
     Object term1925350;
     Object term1925355;

    public FunctionType_isSubtype_21010021581473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1925363 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1925362 = ((Class) term1925363).getDeclaredField((String) "ORDINARY");
        ((Field) term1925362).setAccessible(true);
        Object enum3583 = ((Field) term1925362).get((Object) null);
        term1923856 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1924408 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1923856, term1923856.getClass(), "kind", enum3583);
        setField(term1924408, term1924408.getClass(), "kind", enum3583);
        setField(term1924408, term1924408.getClass(), "typeOfThis", null);
        setField(term1923856, term1923856.getClass(), "typeOfThis", term1924408);
        term1924516 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1924846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1924940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1924516, term1924516.getClass(), "kind", enum3583);
        setField(term1924846, term1924846.getClass(), "kind", enum3583);
        setField(term1924846, term1924846.getClass(), "typeOfThis", term1924940);
        setField(term1924516, term1924516.getClass(), "typeOfThis", term1924846);
        Class<? extends Object> term1925654 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1925653 = ((Class) term1925654).getDeclaredField((String) "INTERFACE");
        ((Field) term1925653).setAccessible(true);
        Object enum3584 = ((Field) term1925653).get((Object) null);
        term1925350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1925354 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1925350, term1925350.getClass(), "this$0", null);
        setField(term1925350, term1925350.getClass(), "call", null);
        setField(term1925350, term1925350.getClass(), "prototype", null);
        setField(term1925350, term1925350.getClass(), "kind", enum3584);
        setField(term1925354, term1925354.getClass(), "this$0", null);
        setField(term1925354, term1925354.getClass(), "call", null);
        setField(term1925354, term1925354.getClass(), "prototype", null);
        setField(term1925354, term1925354.getClass(), "kind", enum3584);
        setField(term1925354, term1925354.getClass(), "typeOfThis", null);
        setField(term1925354, term1925354.getClass(), "source", null);
        setField(term1925354, term1925354.getClass(), "implementedInterfaces", null);
        setField(term1925354, term1925354.getClass(), "subTypes", null);
        setField(term1925354, term1925354.getClass(), "templateTypeName", null);
        setField(term1925354, term1925354.getClass(), "className", null);
        setField(term1925354, term1925354.getClass(), "properties", null);
        setField(term1925354, term1925354.getClass(), "implicitPrototype", null);
        setBooleanField(term1925354, term1925354.getClass(), "nativeType", false);
        setBooleanField(term1925354, term1925354.getClass(), "visited", false);
        setField(term1925354, term1925354.getClass(), "docInfo", null);
        setBooleanField(term1925354, term1925354.getClass(), "unknown", false);
        setBooleanField(term1925354, term1925354.getClass(), "resolved", false);
        setField(term1925354, term1925354.getClass(), "resolveResult", null);
        setField(term1925354, term1925354.getClass(), "registry", null);
        setField(term1925350, term1925350.getClass(), "typeOfThis", term1925354);
        setField(term1925350, term1925350.getClass(), "source", null);
        setField(term1925350, term1925350.getClass(), "implementedInterfaces", null);
        setField(term1925350, term1925350.getClass(), "subTypes", null);
        setField(term1925350, term1925350.getClass(), "templateTypeName", null);
        setField(term1925350, term1925350.getClass(), "className", null);
        setField(term1925350, term1925350.getClass(), "properties", null);
        setField(term1925350, term1925350.getClass(), "implicitPrototype", null);
        setBooleanField(term1925350, term1925350.getClass(), "nativeType", false);
        setBooleanField(term1925350, term1925350.getClass(), "visited", false);
        setField(term1925350, term1925350.getClass(), "docInfo", null);
        setBooleanField(term1925350, term1925350.getClass(), "unknown", false);
        setBooleanField(term1925350, term1925350.getClass(), "resolved", false);
        setField(term1925350, term1925350.getClass(), "resolveResult", null);
        setField(term1925350, term1925350.getClass(), "registry", null);
        Class<? extends Object> term1925948 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1925947 = ((Class) term1925948).getDeclaredField((String) "INTERFACE");
        ((Field) term1925947).setAccessible(true);
        Object enum3585 = ((Field) term1925947).get((Object) null);
        term1925355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1925359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1925360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1925355, term1925355.getClass(), "this$0", null);
        setField(term1925355, term1925355.getClass(), "call", null);
        setField(term1925355, term1925355.getClass(), "prototype", null);
        setField(term1925355, term1925355.getClass(), "kind", enum3585);
        setField(term1925359, term1925359.getClass(), "this$0", null);
        setField(term1925359, term1925359.getClass(), "call", null);
        setField(term1925359, term1925359.getClass(), "prototype", null);
        setField(term1925359, term1925359.getClass(), "kind", enum3585);
        setField(term1925360, term1925360.getClass(), "reference", null);
        setField(term1925360, term1925360.getClass(), "sourceName", null);
        setIntField(term1925360, term1925360.getClass(), "lineno", 0);
        setIntField(term1925360, term1925360.getClass(), "charno", 0);
        setBooleanField(term1925360, term1925360.getClass(), "forgiving", false);
        setField(term1925360, term1925360.getClass(), "referencedType", null);
        setBooleanField(term1925360, term1925360.getClass(), "visited", false);
        setField(term1925360, term1925360.getClass(), "docInfo", null);
        setBooleanField(term1925360, term1925360.getClass(), "unknown", false);
        setBooleanField(term1925360, term1925360.getClass(), "resolved", false);
        setField(term1925360, term1925360.getClass(), "resolveResult", null);
        setField(term1925360, term1925360.getClass(), "registry", null);
        setField(term1925359, term1925359.getClass(), "typeOfThis", term1925360);
        setField(term1925359, term1925359.getClass(), "source", null);
        setField(term1925359, term1925359.getClass(), "implementedInterfaces", null);
        setField(term1925359, term1925359.getClass(), "subTypes", null);
        setField(term1925359, term1925359.getClass(), "templateTypeName", null);
        setField(term1925359, term1925359.getClass(), "className", null);
        setField(term1925359, term1925359.getClass(), "properties", null);
        setField(term1925359, term1925359.getClass(), "implicitPrototype", null);
        setBooleanField(term1925359, term1925359.getClass(), "nativeType", false);
        setBooleanField(term1925359, term1925359.getClass(), "visited", false);
        setField(term1925359, term1925359.getClass(), "docInfo", null);
        setBooleanField(term1925359, term1925359.getClass(), "unknown", false);
        setBooleanField(term1925359, term1925359.getClass(), "resolved", false);
        setField(term1925359, term1925359.getClass(), "resolveResult", null);
        setField(term1925359, term1925359.getClass(), "registry", null);
        setField(term1925355, term1925355.getClass(), "typeOfThis", term1925359);
        setField(term1925355, term1925355.getClass(), "source", null);
        setField(term1925355, term1925355.getClass(), "implementedInterfaces", null);
        setField(term1925355, term1925355.getClass(), "subTypes", null);
        setField(term1925355, term1925355.getClass(), "templateTypeName", null);
        setField(term1925355, term1925355.getClass(), "className", null);
        setField(term1925355, term1925355.getClass(), "properties", null);
        setField(term1925355, term1925355.getClass(), "implicitPrototype", null);
        setBooleanField(term1925355, term1925355.getClass(), "nativeType", false);
        setBooleanField(term1925355, term1925355.getClass(), "visited", false);
        setField(term1925355, term1925355.getClass(), "docInfo", null);
        setBooleanField(term1925355, term1925355.getClass(), "unknown", false);
        setBooleanField(term1925355, term1925355.getClass(), "resolved", false);
        setField(term1925355, term1925355.getClass(), "resolveResult", null);
        setField(term1925355, term1925355.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1924516;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1923856, args);
        assertTrue(recursiveEquals(term1923856, term1925350));
        assertTrue(recursiveEquals(term1924516, term1925355));
        assertTrue(recursiveEquals(retValue, true));
    }

};


