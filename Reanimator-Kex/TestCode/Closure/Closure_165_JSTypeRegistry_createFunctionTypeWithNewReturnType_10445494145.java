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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class JSTypeRegistry_createFunctionTypeWithNewReturnType_10445494145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10562;
     Object term10647;

    public JSTypeRegistry_createFunctionTypeWithNewReturnType_10445494145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10564 = new HashMap();
        HashMap term10574 = new HashMap();
        Set<Object> term502596 =  ((Map) term10574).keySet();
        HashSet term10573 = new HashSet((Collection<? extends Object>) term502596);
        HashMap term10583 = new HashMap();
        Set<Object> term502597 =  ((Map) term10583).keySet();
        HashSet term10582 = new HashSet((Collection<? extends Object>) term502597);
        HashMap term10600 = new HashMap();
        Set<Object> term502598 =  ((Map) term10600).keySet();
        HashSet term10599 = new HashSet((Collection<? extends Object>) term502598);
        HashMap term10616 = new HashMap();
        HashMap term10631 = new HashMap();
        HashMap term10636 = new HashMap();
        term10562 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10563 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term10562, term10562.getClass(), "reporter", null);
        setField(term10562, term10562.getClass(), "nativeTypes", term10563);
        setField(term10562, term10562.getClass(), "namesToTypes", term10564);
        setField(term10562, term10562.getClass(), "namespaces", term10573);
        setField(term10562, term10562.getClass(), "nonNullableTypeNames", term10582);
        setField(term10562, term10562.getClass(), "forwardDeclaredTypes", term10599);
        setField(term10562, term10562.getClass(), "typesIndexedByProperty", term10616);
        setField(term10562, term10562.getClass(), "eachRefTypeIndexedByProperty", term10631);
        setField(term10562, term10562.getClass(), "greatestSubtypeByProperty", term10636);
        setField(term10562, term10562.getClass(), "interfaceToImplementors", null);
        setField(term10562, term10562.getClass(), "unresolvedNamedTypes", null);
        setField(term10562, term10562.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10562, term10562.getClass(), "lastGeneration", false);
        setField(term10562, term10562.getClass(), "templateTypeName", null);
        setField(term10562, term10562.getClass(), "templateType", null);
        setBooleanField(term10562, term10562.getClass(), "tolerateUndefinedValues", false);
        setField(term10562, term10562.getClass(), "resolveMode", null);
        Class<? extends Object> term502600 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term502599 = ((Class) term502600).getDeclaredField((String) "INTERFACE");
        ((Field) term502599).setAccessible(true);
        Object enum32 = ((Field) term502599).get((Object) null);
        term10647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term10649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10675 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term10649, term10649.getClass(), "type", -544382127);
        setIntField(term10651, term10651.getClass(), "type", -1830198043);
        setIntField(term10653, term10653.getClass(), "type", -439048495);
        setField(term10653, term10653.getClass(), "next", null);
        setField(term10653, term10653.getClass(), "first", null);
        setField(term10653, term10653.getClass(), "last", null);
        setField(term10653, term10653.getClass(), "propListHead", null);
        setIntField(term10653, term10653.getClass(), "sourcePosition", 0);
        setField(term10653, term10653.getClass(), "jsType", null);
        setField(term10653, term10653.getClass(), "parent", null);
        setField(term10651, term10651.getClass(), "next", term10653);
        setIntField(term10656, term10656.getClass(), "type", 0);
        setField(term10656, term10656.getClass(), "next", null);
        setField(term10656, term10656.getClass(), "first", null);
        setField(term10656, term10656.getClass(), "last", null);
        setField(term10656, term10656.getClass(), "propListHead", null);
        setIntField(term10656, term10656.getClass(), "sourcePosition", 0);
        setField(term10656, term10656.getClass(), "jsType", null);
        setField(term10656, term10656.getClass(), "parent", null);
        setField(term10651, term10651.getClass(), "first", term10656);
        setIntField(term10659, term10659.getClass(), "type", -2063843486);
        setField(term10659, term10659.getClass(), "next", null);
        setField(term10659, term10659.getClass(), "first", term10656);
        setField(term10659, term10659.getClass(), "last", term10659);
        setField(term10659, term10659.getClass(), "propListHead", null);
        setIntField(term10659, term10659.getClass(), "sourcePosition", 0);
        setField(term10659, term10659.getClass(), "jsType", null);
        setField(term10659, term10659.getClass(), "parent", null);
        setField(term10651, term10651.getClass(), "last", term10659);
        setField(term10651, term10651.getClass(), "propListHead", null);
        setIntField(term10651, term10651.getClass(), "sourcePosition", 0);
        setField(term10651, term10651.getClass(), "jsType", null);
        setField(term10651, term10651.getClass(), "parent", null);
        setField(term10649, term10649.getClass(), "next", term10651);
        setIntField(term10663, term10663.getClass(), "type", 917513193);
        setIntField(term10665, term10665.getClass(), "type", 787278105);
        setField(term10665, term10665.getClass(), "next", term10659);
        setField(term10665, term10665.getClass(), "first", null);
        setField(term10665, term10665.getClass(), "last", term10649);
        setField(term10665, term10665.getClass(), "propListHead", null);
        setIntField(term10665, term10665.getClass(), "sourcePosition", 0);
        setField(term10665, term10665.getClass(), "jsType", null);
        setField(term10665, term10665.getClass(), "parent", null);
        setField(term10663, term10663.getClass(), "next", term10665);
        setField(term10663, term10663.getClass(), "first", term10663);
        setIntField(term10668, term10668.getClass(), "type", -1849105286);
        setField(term10668, term10668.getClass(), "next", null);
        setField(term10668, term10668.getClass(), "first", term10656);
        setField(term10668, term10668.getClass(), "last", term10659);
        setField(term10668, term10668.getClass(), "propListHead", null);
        setIntField(term10668, term10668.getClass(), "sourcePosition", 0);
        setField(term10668, term10668.getClass(), "jsType", null);
        setField(term10668, term10668.getClass(), "parent", null);
        setField(term10663, term10663.getClass(), "last", term10668);
        setField(term10663, term10663.getClass(), "propListHead", null);
        setIntField(term10663, term10663.getClass(), "sourcePosition", 0);
        setField(term10663, term10663.getClass(), "jsType", null);
        setField(term10663, term10663.getClass(), "parent", null);
        setField(term10649, term10649.getClass(), "first", term10663);
        setField(term10649, term10649.getClass(), "last", term10653);
        setField(term10649, term10649.getClass(), "propListHead", null);
        setIntField(term10649, term10649.getClass(), "sourcePosition", 0);
        setField(term10649, term10649.getClass(), "jsType", null);
        setField(term10649, term10649.getClass(), "parent", null);
        setField(term10648, term10648.getClass(), "parameters", term10649);
        setField(term10648, term10648.getClass(), "returnType", null);
        setBooleanField(term10648, term10648.getClass(), "returnTypeInferred", false);
        setBooleanField(term10648, term10648.getClass(), "resolved", false);
        setField(term10648, term10648.getClass(), "resolveResult", null);
        setField(term10648, term10648.getClass(), "registry", null);
        setField(term10647, term10647.getClass(), "call", term10648);
        setField(term10675, term10675.getClass(), "name", null);
        setField(term10675, term10675.getClass(), "type", null);
        setBooleanField(term10675, term10675.getClass(), "inferred", false);
        setField(term10675, term10675.getClass(), "propertyNode", null);
        setField(term10675, term10675.getClass(), "docInfo", null);
        setField(term10647, term10647.getClass(), "prototypeSlot", term10675);
        setField(term10647, term10647.getClass(), "kind", enum32);
        setField(term10647, term10647.getClass(), "typeOfThis", null);
        setField(term10647, term10647.getClass(), "source", null);
        setField(term10647, term10647.getClass(), "implementedInterfaces", null);
        setField(term10647, term10647.getClass(), "extendedInterfaces", null);
        setField(term10647, term10647.getClass(), "subTypes", null);
        setField(term10647, term10647.getClass(), "templateTypeName", null);
        setField(term10647, term10647.getClass(), "className", null);
        setField(term10647, term10647.getClass(), "properties", null);
        setBooleanField(term10647, term10647.getClass(), "nativeType", false);
        setField(term10647, term10647.getClass(), "implicitPrototypeFallback", null);
        setField(term10647, term10647.getClass(), "ownerFunction", null);
        setBooleanField(term10647, term10647.getClass(), "prettyPrint", false);
        setBooleanField(term10647, term10647.getClass(), "visited", false);
        setField(term10647, term10647.getClass(), "docInfo", null);
        setBooleanField(term10647, term10647.getClass(), "unknown", false);
        setBooleanField(term10647, term10647.getClass(), "resolved", false);
        setField(term10647, term10647.getClass(), "resolveResult", null);
        setField(term10647, term10647.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term10647;
        args[1] = null;
        try {
            callMethod(klass, "createFunctionTypeWithNewReturnType", argTypes, term10562, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


