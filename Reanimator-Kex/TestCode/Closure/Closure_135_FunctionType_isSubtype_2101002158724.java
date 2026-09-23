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

public class FunctionType_isSubtype_2101002158724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673821;
     Object term674473;
     Object term677268;
     Object term677273;

    public FunctionType_isSubtype_2101002158724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term677279 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term677278 = ((Class) term677279).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term677278).setAccessible(true);
        Object enum1253 = ((Field) term677278).get((Object) null);
        term673821 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term674363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term673821, term673821.getClass(), "kind", enum1253);
        setField(term673821, term673821.getClass(), "typeOfThis", term674363);
        Class<? extends Object> term677579 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term677578 = ((Class) term677579).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term677578).setAccessible(true);
        Object enum1254 = ((Field) term677578).get((Object) null);
        term674473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term674473, term674473.getClass(), "kind", enum1254);
        setField(term674473, term674473.getClass(), "typeOfThis", null);
        Class<? extends Object> term677879 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term677878 = ((Class) term677879).getDeclaredField((String) "INTERFACE");
        ((Field) term677878).setAccessible(true);
        Object enum1255 = ((Field) term677878).get((Object) null);
        term677268 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term677272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term677268, term677268.getClass(), "this$0", null);
        setField(term677268, term677268.getClass(), "call", null);
        setField(term677268, term677268.getClass(), "prototype", null);
        setField(term677268, term677268.getClass(), "kind", enum1255);
        setField(term677272, term677272.getClass(), "indexType", null);
        setField(term677272, term677272.getClass(), "referencedType", null);
        setBooleanField(term677272, term677272.getClass(), "visited", false);
        setField(term677272, term677272.getClass(), "docInfo", null);
        setBooleanField(term677272, term677272.getClass(), "unknown", false);
        setBooleanField(term677272, term677272.getClass(), "resolved", false);
        setField(term677272, term677272.getClass(), "resolveResult", null);
        setField(term677272, term677272.getClass(), "registry", null);
        setField(term677268, term677268.getClass(), "typeOfThis", term677272);
        setField(term677268, term677268.getClass(), "source", null);
        setField(term677268, term677268.getClass(), "implementedInterfaces", null);
        setField(term677268, term677268.getClass(), "subTypes", null);
        setField(term677268, term677268.getClass(), "templateTypeName", null);
        setField(term677268, term677268.getClass(), "className", null);
        setField(term677268, term677268.getClass(), "properties", null);
        setField(term677268, term677268.getClass(), "implicitPrototype", null);
        setBooleanField(term677268, term677268.getClass(), "nativeType", false);
        setBooleanField(term677268, term677268.getClass(), "visited", false);
        setField(term677268, term677268.getClass(), "docInfo", null);
        setBooleanField(term677268, term677268.getClass(), "unknown", false);
        setBooleanField(term677268, term677268.getClass(), "resolved", false);
        setField(term677268, term677268.getClass(), "resolveResult", null);
        setField(term677268, term677268.getClass(), "registry", null);
        Class<? extends Object> term678173 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term678172 = ((Class) term678173).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term678172).setAccessible(true);
        Object enum1256 = ((Field) term678172).get((Object) null);
        term677273 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term677273, term677273.getClass(), "call", null);
        setField(term677273, term677273.getClass(), "prototype", null);
        setField(term677273, term677273.getClass(), "kind", enum1256);
        setField(term677273, term677273.getClass(), "typeOfThis", null);
        setField(term677273, term677273.getClass(), "source", null);
        setField(term677273, term677273.getClass(), "implementedInterfaces", null);
        setField(term677273, term677273.getClass(), "subTypes", null);
        setField(term677273, term677273.getClass(), "templateTypeName", null);
        setField(term677273, term677273.getClass(), "className", null);
        setField(term677273, term677273.getClass(), "properties", null);
        setField(term677273, term677273.getClass(), "implicitPrototype", null);
        setBooleanField(term677273, term677273.getClass(), "nativeType", false);
        setBooleanField(term677273, term677273.getClass(), "visited", false);
        setField(term677273, term677273.getClass(), "docInfo", null);
        setBooleanField(term677273, term677273.getClass(), "unknown", false);
        setBooleanField(term677273, term677273.getClass(), "resolved", false);
        setField(term677273, term677273.getClass(), "resolveResult", null);
        setField(term677273, term677273.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term674473;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term673821, args);
        assertTrue(recursiveEquals(term673821, term677268));
        assertTrue(recursiveEquals(term674473, term677273));
        assertTrue(recursiveEquals(retValue, false));
    }

};


