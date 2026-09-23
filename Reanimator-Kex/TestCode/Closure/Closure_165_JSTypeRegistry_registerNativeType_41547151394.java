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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class JSTypeRegistry_registerNativeType_41547151394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1237;
     Object enum22;

    public JSTypeRegistry_registerNativeType_41547151394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1239 = new HashMap();
        HashMap term1249 = new HashMap();
        Set<Object> term480972 =  ((Map) term1249).keySet();
        HashSet term1248 = new HashSet((Collection<? extends Object>) term480972);
        HashMap term1262 = new HashMap();
        Set<Object> term480973 =  ((Map) term1262).keySet();
        HashSet term1261 = new HashSet((Collection<? extends Object>) term480973);
        HashMap term1273 = new HashMap();
        Set<Object> term480974 =  ((Map) term1273).keySet();
        HashSet term1272 = new HashSet((Collection<? extends Object>) term480974);
        HashMap term1287 = new HashMap();
        HashMap term1302 = new HashMap();
        HashMap term1307 = new HashMap();
        term1237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1238 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term1237, term1237.getClass(), "reporter", null);
        setField(term1237, term1237.getClass(), "nativeTypes", term1238);
        setField(term1237, term1237.getClass(), "namesToTypes", term1239);
        setField(term1237, term1237.getClass(), "namespaces", term1248);
        setField(term1237, term1237.getClass(), "nonNullableTypeNames", term1261);
        setField(term1237, term1237.getClass(), "forwardDeclaredTypes", term1272);
        setField(term1237, term1237.getClass(), "typesIndexedByProperty", term1287);
        setField(term1237, term1237.getClass(), "eachRefTypeIndexedByProperty", term1302);
        setField(term1237, term1237.getClass(), "greatestSubtypeByProperty", term1307);
        setField(term1237, term1237.getClass(), "interfaceToImplementors", null);
        setField(term1237, term1237.getClass(), "unresolvedNamedTypes", null);
        setField(term1237, term1237.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1237, term1237.getClass(), "lastGeneration", false);
        setField(term1237, term1237.getClass(), "templateTypeName", null);
        setField(term1237, term1237.getClass(), "templateType", null);
        setBooleanField(term1237, term1237.getClass(), "tolerateUndefinedValues", false);
        setField(term1237, term1237.getClass(), "resolveMode", null);
        Class<? extends Object> term480976 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term480975 = ((Class) term480976).getDeclaredField((String) "SYNTAX_ERROR_TYPE");
        ((Field) term480975).setAccessible(true);
        enum22 = ((Field) term480975).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = enum22;
        args[1] = null;
        try {
            callMethod(klass, "registerNativeType", argTypes, term1237, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


