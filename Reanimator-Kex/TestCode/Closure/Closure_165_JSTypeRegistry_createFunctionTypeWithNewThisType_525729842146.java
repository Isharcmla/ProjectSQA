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

public class JSTypeRegistry_createFunctionTypeWithNewThisType_525729842146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10992;
     Object term11085;

    public JSTypeRegistry_createFunctionTypeWithNewThisType_525729842146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10994 = new HashMap();
        HashMap term11004 = new HashMap();
        Set<Object> term503590 =  ((Map) term11004).keySet();
        HashSet term11003 = new HashSet((Collection<? extends Object>) term503590);
        HashMap term11013 = new HashMap();
        Set<Object> term503591 =  ((Map) term11013).keySet();
        HashSet term11012 = new HashSet((Collection<? extends Object>) term503591);
        HashMap term11034 = new HashMap();
        Set<Object> term503592 =  ((Map) term11034).keySet();
        HashSet term11033 = new HashSet((Collection<? extends Object>) term503592);
        HashMap term11054 = new HashMap();
        HashMap term11069 = new HashMap();
        HashMap term11074 = new HashMap();
        term10992 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10993 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        setField(term10992, term10992.getClass(), "reporter", null);
        setField(term10992, term10992.getClass(), "nativeTypes", term10993);
        setField(term10992, term10992.getClass(), "namesToTypes", term10994);
        setField(term10992, term10992.getClass(), "namespaces", term11003);
        setField(term10992, term10992.getClass(), "nonNullableTypeNames", term11012);
        setField(term10992, term10992.getClass(), "forwardDeclaredTypes", term11033);
        setField(term10992, term10992.getClass(), "typesIndexedByProperty", term11054);
        setField(term10992, term10992.getClass(), "eachRefTypeIndexedByProperty", term11069);
        setField(term10992, term10992.getClass(), "greatestSubtypeByProperty", term11074);
        setField(term10992, term10992.getClass(), "interfaceToImplementors", null);
        setField(term10992, term10992.getClass(), "unresolvedNamedTypes", null);
        setField(term10992, term10992.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10992, term10992.getClass(), "lastGeneration", false);
        setField(term10992, term10992.getClass(), "templateTypeName", null);
        setField(term10992, term10992.getClass(), "templateType", null);
        setBooleanField(term10992, term10992.getClass(), "tolerateUndefinedValues", false);
        setField(term10992, term10992.getClass(), "resolveMode", null);
        Class<? extends Object> term503594 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term503593 = ((Class) term503594).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term503593).setAccessible(true);
        Object enum34 = ((Field) term503593).get((Object) null);
        term11085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term11086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term11087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11113 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term11087, term11087.getClass(), "type", 765731371);
        setIntField(term11089, term11089.getClass(), "type", -1703035419);
        setIntField(term11091, term11091.getClass(), "type", 765766290);
        setField(term11091, term11091.getClass(), "next", null);
        setField(term11091, term11091.getClass(), "first", null);
        setField(term11091, term11091.getClass(), "last", null);
        setField(term11091, term11091.getClass(), "propListHead", null);
        setIntField(term11091, term11091.getClass(), "sourcePosition", 0);
        setField(term11091, term11091.getClass(), "jsType", null);
        setField(term11091, term11091.getClass(), "parent", null);
        setField(term11089, term11089.getClass(), "next", term11091);
        setIntField(term11094, term11094.getClass(), "type", 0);
        setField(term11094, term11094.getClass(), "next", null);
        setField(term11094, term11094.getClass(), "first", null);
        setField(term11094, term11094.getClass(), "last", null);
        setField(term11094, term11094.getClass(), "propListHead", null);
        setIntField(term11094, term11094.getClass(), "sourcePosition", 0);
        setField(term11094, term11094.getClass(), "jsType", null);
        setField(term11094, term11094.getClass(), "parent", null);
        setField(term11089, term11089.getClass(), "first", term11094);
        setIntField(term11097, term11097.getClass(), "type", -1748391876);
        setField(term11097, term11097.getClass(), "next", null);
        setField(term11097, term11097.getClass(), "first", term11094);
        setField(term11097, term11097.getClass(), "last", term11097);
        setField(term11097, term11097.getClass(), "propListHead", null);
        setIntField(term11097, term11097.getClass(), "sourcePosition", 0);
        setField(term11097, term11097.getClass(), "jsType", null);
        setField(term11097, term11097.getClass(), "parent", null);
        setField(term11089, term11089.getClass(), "last", term11097);
        setField(term11089, term11089.getClass(), "propListHead", null);
        setIntField(term11089, term11089.getClass(), "sourcePosition", 0);
        setField(term11089, term11089.getClass(), "jsType", null);
        setField(term11089, term11089.getClass(), "parent", null);
        setField(term11087, term11087.getClass(), "next", term11089);
        setIntField(term11101, term11101.getClass(), "type", 947897214);
        setIntField(term11103, term11103.getClass(), "type", 1496340209);
        setField(term11103, term11103.getClass(), "next", term11097);
        setField(term11103, term11103.getClass(), "first", null);
        setField(term11103, term11103.getClass(), "last", term11087);
        setField(term11103, term11103.getClass(), "propListHead", null);
        setIntField(term11103, term11103.getClass(), "sourcePosition", 0);
        setField(term11103, term11103.getClass(), "jsType", null);
        setField(term11103, term11103.getClass(), "parent", null);
        setField(term11101, term11101.getClass(), "next", term11103);
        setField(term11101, term11101.getClass(), "first", term11101);
        setIntField(term11106, term11106.getClass(), "type", -1284825282);
        setField(term11106, term11106.getClass(), "next", null);
        setField(term11106, term11106.getClass(), "first", term11094);
        setField(term11106, term11106.getClass(), "last", term11097);
        setField(term11106, term11106.getClass(), "propListHead", null);
        setIntField(term11106, term11106.getClass(), "sourcePosition", 0);
        setField(term11106, term11106.getClass(), "jsType", null);
        setField(term11106, term11106.getClass(), "parent", null);
        setField(term11101, term11101.getClass(), "last", term11106);
        setField(term11101, term11101.getClass(), "propListHead", null);
        setIntField(term11101, term11101.getClass(), "sourcePosition", 0);
        setField(term11101, term11101.getClass(), "jsType", null);
        setField(term11101, term11101.getClass(), "parent", null);
        setField(term11087, term11087.getClass(), "first", term11101);
        setField(term11087, term11087.getClass(), "last", term11091);
        setField(term11087, term11087.getClass(), "propListHead", null);
        setIntField(term11087, term11087.getClass(), "sourcePosition", 0);
        setField(term11087, term11087.getClass(), "jsType", null);
        setField(term11087, term11087.getClass(), "parent", null);
        setField(term11086, term11086.getClass(), "parameters", term11087);
        setField(term11086, term11086.getClass(), "returnType", null);
        setBooleanField(term11086, term11086.getClass(), "returnTypeInferred", false);
        setBooleanField(term11086, term11086.getClass(), "resolved", false);
        setField(term11086, term11086.getClass(), "resolveResult", null);
        setField(term11086, term11086.getClass(), "registry", null);
        setField(term11085, term11085.getClass(), "call", term11086);
        setField(term11113, term11113.getClass(), "name", null);
        setField(term11113, term11113.getClass(), "type", null);
        setBooleanField(term11113, term11113.getClass(), "inferred", false);
        setField(term11113, term11113.getClass(), "propertyNode", null);
        setField(term11113, term11113.getClass(), "docInfo", null);
        setField(term11085, term11085.getClass(), "prototypeSlot", term11113);
        setField(term11085, term11085.getClass(), "kind", enum34);
        setField(term11085, term11085.getClass(), "typeOfThis", null);
        setField(term11085, term11085.getClass(), "source", null);
        setField(term11085, term11085.getClass(), "implementedInterfaces", null);
        setField(term11085, term11085.getClass(), "extendedInterfaces", null);
        setField(term11085, term11085.getClass(), "subTypes", null);
        setField(term11085, term11085.getClass(), "templateTypeName", null);
        setField(term11085, term11085.getClass(), "className", null);
        setField(term11085, term11085.getClass(), "properties", null);
        setBooleanField(term11085, term11085.getClass(), "nativeType", false);
        setField(term11085, term11085.getClass(), "implicitPrototypeFallback", null);
        setField(term11085, term11085.getClass(), "ownerFunction", null);
        setBooleanField(term11085, term11085.getClass(), "prettyPrint", false);
        setBooleanField(term11085, term11085.getClass(), "visited", false);
        setField(term11085, term11085.getClass(), "docInfo", null);
        setBooleanField(term11085, term11085.getClass(), "unknown", false);
        setBooleanField(term11085, term11085.getClass(), "resolved", false);
        setField(term11085, term11085.getClass(), "resolveResult", null);
        setField(term11085, term11085.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[2];
        args[0] = term11085;
        args[1] = null;
        try {
            callMethod(klass, "createFunctionTypeWithNewThisType", argTypes, term10992, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


