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

public class FunctionType_isSubtype_21010021581657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2236238;
     Object term2236892;
     Object term2239483;
     Object term2239488;

    public FunctionType_isSubtype_21010021581657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2239495 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2239494 = ((Class) term2239495).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2239494).setAccessible(true);
        Object enum4174 = ((Field) term2239494).get((Object) null);
        Class<? extends Object> term2239795 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2239794 = ((Class) term2239795).getDeclaredField((String) "INTERFACE");
        ((Field) term2239794).setAccessible(true);
        Object enum4175 = ((Field) term2239794).get((Object) null);
        term2236238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2236782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2236238, term2236238.getClass(), "kind", enum4174);
        setField(term2236782, term2236782.getClass(), "kind", enum4175);
        setField(term2236238, term2236238.getClass(), "typeOfThis", term2236782);
        Class<? extends Object> term2240089 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2240088 = ((Class) term2240089).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2240088).setAccessible(true);
        Object enum4176 = ((Field) term2240088).get((Object) null);
        term2236892 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2237074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2236892, term2236892.getClass(), "kind", enum4176);
        setField(term2236892, term2236892.getClass(), "typeOfThis", term2237074);
        Class<? extends Object> term2240389 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2240388 = ((Class) term2240389).getDeclaredField((String) "INTERFACE");
        ((Field) term2240388).setAccessible(true);
        Object enum4177 = ((Field) term2240388).get((Object) null);
        term2239483 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2239487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2239483, term2239483.getClass(), "this$0", null);
        setField(term2239483, term2239483.getClass(), "call", null);
        setField(term2239483, term2239483.getClass(), "prototype", null);
        setField(term2239483, term2239483.getClass(), "kind", enum4177);
        setField(term2239487, term2239487.getClass(), "call", null);
        setField(term2239487, term2239487.getClass(), "prototype", null);
        setField(term2239487, term2239487.getClass(), "kind", enum4177);
        setField(term2239487, term2239487.getClass(), "typeOfThis", null);
        setField(term2239487, term2239487.getClass(), "source", null);
        setField(term2239487, term2239487.getClass(), "implementedInterfaces", null);
        setField(term2239487, term2239487.getClass(), "subTypes", null);
        setField(term2239487, term2239487.getClass(), "templateTypeName", null);
        setField(term2239487, term2239487.getClass(), "className", null);
        setField(term2239487, term2239487.getClass(), "properties", null);
        setField(term2239487, term2239487.getClass(), "implicitPrototype", null);
        setBooleanField(term2239487, term2239487.getClass(), "nativeType", false);
        setBooleanField(term2239487, term2239487.getClass(), "visited", false);
        setField(term2239487, term2239487.getClass(), "docInfo", null);
        setBooleanField(term2239487, term2239487.getClass(), "unknown", false);
        setBooleanField(term2239487, term2239487.getClass(), "resolved", false);
        setField(term2239487, term2239487.getClass(), "resolveResult", null);
        setField(term2239487, term2239487.getClass(), "registry", null);
        setField(term2239483, term2239483.getClass(), "typeOfThis", term2239487);
        setField(term2239483, term2239483.getClass(), "source", null);
        setField(term2239483, term2239483.getClass(), "implementedInterfaces", null);
        setField(term2239483, term2239483.getClass(), "subTypes", null);
        setField(term2239483, term2239483.getClass(), "templateTypeName", null);
        setField(term2239483, term2239483.getClass(), "className", null);
        setField(term2239483, term2239483.getClass(), "properties", null);
        setField(term2239483, term2239483.getClass(), "implicitPrototype", null);
        setBooleanField(term2239483, term2239483.getClass(), "nativeType", false);
        setBooleanField(term2239483, term2239483.getClass(), "visited", false);
        setField(term2239483, term2239483.getClass(), "docInfo", null);
        setBooleanField(term2239483, term2239483.getClass(), "unknown", false);
        setBooleanField(term2239483, term2239483.getClass(), "resolved", false);
        setField(term2239483, term2239483.getClass(), "resolveResult", null);
        setField(term2239483, term2239483.getClass(), "registry", null);
        Class<? extends Object> term2240683 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2240682 = ((Class) term2240683).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2240682).setAccessible(true);
        Object enum4178 = ((Field) term2240682).get((Object) null);
        term2239488 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2239492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2239488, term2239488.getClass(), "call", null);
        setField(term2239488, term2239488.getClass(), "prototype", null);
        setField(term2239488, term2239488.getClass(), "kind", enum4178);
        setField(term2239492, term2239492.getClass(), "this$0", null);
        setField(term2239492, term2239492.getClass(), "call", null);
        setField(term2239492, term2239492.getClass(), "prototype", null);
        setField(term2239492, term2239492.getClass(), "kind", null);
        setField(term2239492, term2239492.getClass(), "typeOfThis", null);
        setField(term2239492, term2239492.getClass(), "source", null);
        setField(term2239492, term2239492.getClass(), "implementedInterfaces", null);
        setField(term2239492, term2239492.getClass(), "subTypes", null);
        setField(term2239492, term2239492.getClass(), "templateTypeName", null);
        setField(term2239492, term2239492.getClass(), "className", null);
        setField(term2239492, term2239492.getClass(), "properties", null);
        setField(term2239492, term2239492.getClass(), "implicitPrototype", null);
        setBooleanField(term2239492, term2239492.getClass(), "nativeType", false);
        setBooleanField(term2239492, term2239492.getClass(), "visited", false);
        setField(term2239492, term2239492.getClass(), "docInfo", null);
        setBooleanField(term2239492, term2239492.getClass(), "unknown", false);
        setBooleanField(term2239492, term2239492.getClass(), "resolved", false);
        setField(term2239492, term2239492.getClass(), "resolveResult", null);
        setField(term2239492, term2239492.getClass(), "registry", null);
        setField(term2239488, term2239488.getClass(), "typeOfThis", term2239492);
        setField(term2239488, term2239488.getClass(), "source", null);
        setField(term2239488, term2239488.getClass(), "implementedInterfaces", null);
        setField(term2239488, term2239488.getClass(), "subTypes", null);
        setField(term2239488, term2239488.getClass(), "templateTypeName", null);
        setField(term2239488, term2239488.getClass(), "className", null);
        setField(term2239488, term2239488.getClass(), "properties", null);
        setField(term2239488, term2239488.getClass(), "implicitPrototype", null);
        setBooleanField(term2239488, term2239488.getClass(), "nativeType", false);
        setBooleanField(term2239488, term2239488.getClass(), "visited", false);
        setField(term2239488, term2239488.getClass(), "docInfo", null);
        setBooleanField(term2239488, term2239488.getClass(), "unknown", false);
        setBooleanField(term2239488, term2239488.getClass(), "resolved", false);
        setField(term2239488, term2239488.getClass(), "resolveResult", null);
        setField(term2239488, term2239488.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2236892;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2236238, args);
        assertTrue(recursiveEquals(term2236238, term2239483));
        assertTrue(recursiveEquals(term2236892, term2239488));
        assertTrue(recursiveEquals(retValue, false));
    }

};


