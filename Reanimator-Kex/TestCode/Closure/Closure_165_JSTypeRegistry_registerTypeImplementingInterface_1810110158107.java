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

public class JSTypeRegistry_registerTypeImplementingInterface_1810110158107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3954;
     Object term4033;

    public JSTypeRegistry_registerTypeImplementingInterface_1810110158107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3956 = new HashMap();
        HashMap term3966 = new HashMap();
        Set<Object> term484303 =  ((Map) term3966).keySet();
        HashSet term3965 = new HashSet((Collection<? extends Object>) term484303);
        HashMap term3977 = new HashMap();
        Set<Object> term484304 =  ((Map) term3977).keySet();
        HashSet term3976 = new HashSet((Collection<? extends Object>) term484304);
        HashMap term3992 = new HashMap();
        Set<Object> term484305 =  ((Map) term3992).keySet();
        HashSet term3991 = new HashSet((Collection<? extends Object>) term484305);
        HashMap term4002 = new HashMap();
        HashMap term4017 = new HashMap();
        HashMap term4022 = new HashMap();
        term3954 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3955 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term3954, term3954.getClass(), "reporter", null);
        setField(term3954, term3954.getClass(), "nativeTypes", term3955);
        setField(term3954, term3954.getClass(), "namesToTypes", term3956);
        setField(term3954, term3954.getClass(), "namespaces", term3965);
        setField(term3954, term3954.getClass(), "nonNullableTypeNames", term3976);
        setField(term3954, term3954.getClass(), "forwardDeclaredTypes", term3991);
        setField(term3954, term3954.getClass(), "typesIndexedByProperty", term4002);
        setField(term3954, term3954.getClass(), "eachRefTypeIndexedByProperty", term4017);
        setField(term3954, term3954.getClass(), "greatestSubtypeByProperty", term4022);
        setField(term3954, term3954.getClass(), "interfaceToImplementors", null);
        setField(term3954, term3954.getClass(), "unresolvedNamedTypes", null);
        setField(term3954, term3954.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3954, term3954.getClass(), "lastGeneration", false);
        setField(term3954, term3954.getClass(), "templateTypeName", null);
        setField(term3954, term3954.getClass(), "templateType", null);
        setBooleanField(term3954, term3954.getClass(), "tolerateUndefinedValues", false);
        setField(term3954, term3954.getClass(), "resolveMode", null);
        Class<? extends Object> term484307 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term484306 = ((Class) term484307).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term484306).setAccessible(true);
        Object enum23 = ((Field) term484306).get((Object) null);
        term4033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term4034 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term4035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4061 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term4035, term4035.getClass(), "type", 96566506);
        setIntField(term4037, term4037.getClass(), "type", -343325701);
        setIntField(term4039, term4039.getClass(), "type", 107945604);
        setField(term4039, term4039.getClass(), "next", null);
        setField(term4039, term4039.getClass(), "first", null);
        setField(term4039, term4039.getClass(), "last", null);
        setField(term4039, term4039.getClass(), "propListHead", null);
        setIntField(term4039, term4039.getClass(), "sourcePosition", 0);
        setField(term4039, term4039.getClass(), "jsType", null);
        setField(term4039, term4039.getClass(), "parent", null);
        setField(term4037, term4037.getClass(), "next", term4039);
        setIntField(term4042, term4042.getClass(), "type", 0);
        setField(term4042, term4042.getClass(), "next", null);
        setField(term4042, term4042.getClass(), "first", null);
        setField(term4042, term4042.getClass(), "last", null);
        setField(term4042, term4042.getClass(), "propListHead", null);
        setIntField(term4042, term4042.getClass(), "sourcePosition", 0);
        setField(term4042, term4042.getClass(), "jsType", null);
        setField(term4042, term4042.getClass(), "parent", null);
        setField(term4037, term4037.getClass(), "first", term4042);
        setIntField(term4045, term4045.getClass(), "type", -2063457669);
        setField(term4045, term4045.getClass(), "next", null);
        setField(term4045, term4045.getClass(), "first", term4042);
        setField(term4045, term4045.getClass(), "last", term4045);
        setField(term4045, term4045.getClass(), "propListHead", null);
        setIntField(term4045, term4045.getClass(), "sourcePosition", 0);
        setField(term4045, term4045.getClass(), "jsType", null);
        setField(term4045, term4045.getClass(), "parent", null);
        setField(term4037, term4037.getClass(), "last", term4045);
        setField(term4037, term4037.getClass(), "propListHead", null);
        setIntField(term4037, term4037.getClass(), "sourcePosition", 0);
        setField(term4037, term4037.getClass(), "jsType", null);
        setField(term4037, term4037.getClass(), "parent", null);
        setField(term4035, term4035.getClass(), "next", term4037);
        setIntField(term4049, term4049.getClass(), "type", 1202361360);
        setIntField(term4051, term4051.getClass(), "type", -2015048153);
        setField(term4051, term4051.getClass(), "next", term4045);
        setField(term4051, term4051.getClass(), "first", null);
        setField(term4051, term4051.getClass(), "last", term4035);
        setField(term4051, term4051.getClass(), "propListHead", null);
        setIntField(term4051, term4051.getClass(), "sourcePosition", 0);
        setField(term4051, term4051.getClass(), "jsType", null);
        setField(term4051, term4051.getClass(), "parent", null);
        setField(term4049, term4049.getClass(), "next", term4051);
        setField(term4049, term4049.getClass(), "first", term4049);
        setIntField(term4054, term4054.getClass(), "type", -1963464809);
        setField(term4054, term4054.getClass(), "next", null);
        setField(term4054, term4054.getClass(), "first", term4042);
        setField(term4054, term4054.getClass(), "last", term4045);
        setField(term4054, term4054.getClass(), "propListHead", null);
        setIntField(term4054, term4054.getClass(), "sourcePosition", 0);
        setField(term4054, term4054.getClass(), "jsType", null);
        setField(term4054, term4054.getClass(), "parent", null);
        setField(term4049, term4049.getClass(), "last", term4054);
        setField(term4049, term4049.getClass(), "propListHead", null);
        setIntField(term4049, term4049.getClass(), "sourcePosition", 0);
        setField(term4049, term4049.getClass(), "jsType", null);
        setField(term4049, term4049.getClass(), "parent", null);
        setField(term4035, term4035.getClass(), "first", term4049);
        setField(term4035, term4035.getClass(), "last", term4039);
        setField(term4035, term4035.getClass(), "propListHead", null);
        setIntField(term4035, term4035.getClass(), "sourcePosition", 0);
        setField(term4035, term4035.getClass(), "jsType", null);
        setField(term4035, term4035.getClass(), "parent", null);
        setField(term4034, term4034.getClass(), "parameters", term4035);
        setField(term4034, term4034.getClass(), "returnType", null);
        setBooleanField(term4034, term4034.getClass(), "returnTypeInferred", false);
        setBooleanField(term4034, term4034.getClass(), "resolved", false);
        setField(term4034, term4034.getClass(), "resolveResult", null);
        setField(term4034, term4034.getClass(), "registry", null);
        setField(term4033, term4033.getClass(), "call", term4034);
        setField(term4061, term4061.getClass(), "name", null);
        setField(term4061, term4061.getClass(), "type", null);
        setBooleanField(term4061, term4061.getClass(), "inferred", false);
        setField(term4061, term4061.getClass(), "propertyNode", null);
        setField(term4061, term4061.getClass(), "docInfo", null);
        setField(term4033, term4033.getClass(), "prototypeSlot", term4061);
        setField(term4033, term4033.getClass(), "kind", enum23);
        setField(term4033, term4033.getClass(), "typeOfThis", null);
        setField(term4033, term4033.getClass(), "source", null);
        setField(term4033, term4033.getClass(), "implementedInterfaces", null);
        setField(term4033, term4033.getClass(), "extendedInterfaces", null);
        setField(term4033, term4033.getClass(), "subTypes", null);
        setField(term4033, term4033.getClass(), "templateTypeName", null);
        setField(term4033, term4033.getClass(), "className", null);
        setField(term4033, term4033.getClass(), "properties", null);
        setBooleanField(term4033, term4033.getClass(), "nativeType", false);
        setField(term4033, term4033.getClass(), "implicitPrototypeFallback", null);
        setField(term4033, term4033.getClass(), "ownerFunction", null);
        setBooleanField(term4033, term4033.getClass(), "prettyPrint", false);
        setBooleanField(term4033, term4033.getClass(), "visited", false);
        setField(term4033, term4033.getClass(), "docInfo", null);
        setBooleanField(term4033, term4033.getClass(), "unknown", false);
        setBooleanField(term4033, term4033.getClass(), "resolved", false);
        setField(term4033, term4033.getClass(), "resolveResult", null);
        setField(term4033, term4033.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[2];
        args[0] = term4033;
        args[1] = null;
        try {
            callMethod(klass, "registerTypeImplementingInterface", argTypes, term3954, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


