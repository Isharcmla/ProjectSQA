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
import java.lang.Object;
import java.lang.String;

public class FunctionType_getInstanceType_1940487563167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37942;

    public FunctionType_getInstanceType_1940487563167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term193666 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term193665 = ((Class) term193666).getDeclaredField((String) "ORDINARY");
        ((Field) term193665).setAccessible(true);
        Object enum343 = ((Field) term193665).get((Object) null);
        Class<? extends Object> term193957 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term193956 = ((Class) term193957).getDeclaredField((String) "ANY");
        ((Field) term193956).setAccessible(true);
        Object enum344 = ((Field) term193956).get((Object) null);
        term37942 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term37943 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term37944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37971 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term37944, term37944.getClass(), "type", 1973060703);
        setIntField(term37946, term37946.getClass(), "type", -138239905);
        setIntField(term37948, term37948.getClass(), "type", 1709474063);
        setField(term37948, term37948.getClass(), "next", null);
        setField(term37948, term37948.getClass(), "first", null);
        setField(term37948, term37948.getClass(), "last", null);
        setField(term37948, term37948.getClass(), "propListHead", null);
        setIntField(term37948, term37948.getClass(), "sourcePosition", 0);
        setField(term37948, term37948.getClass(), "jsType", null);
        setField(term37948, term37948.getClass(), "parent", null);
        setField(term37946, term37946.getClass(), "next", term37948);
        setIntField(term37951, term37951.getClass(), "type", 0);
        setField(term37951, term37951.getClass(), "next", null);
        setField(term37951, term37951.getClass(), "first", null);
        setField(term37951, term37951.getClass(), "last", null);
        setField(term37951, term37951.getClass(), "propListHead", null);
        setIntField(term37951, term37951.getClass(), "sourcePosition", 0);
        setField(term37951, term37951.getClass(), "jsType", null);
        setField(term37951, term37951.getClass(), "parent", null);
        setField(term37946, term37946.getClass(), "first", term37951);
        setIntField(term37954, term37954.getClass(), "type", -1224443634);
        setField(term37954, term37954.getClass(), "next", null);
        setField(term37954, term37954.getClass(), "first", term37951);
        setField(term37954, term37954.getClass(), "last", term37954);
        setField(term37954, term37954.getClass(), "propListHead", null);
        setIntField(term37954, term37954.getClass(), "sourcePosition", 0);
        setField(term37954, term37954.getClass(), "jsType", null);
        setField(term37954, term37954.getClass(), "parent", null);
        setField(term37946, term37946.getClass(), "last", term37954);
        setField(term37946, term37946.getClass(), "propListHead", null);
        setIntField(term37946, term37946.getClass(), "sourcePosition", 0);
        setField(term37946, term37946.getClass(), "jsType", null);
        setField(term37946, term37946.getClass(), "parent", null);
        setField(term37944, term37944.getClass(), "next", term37946);
        setIntField(term37958, term37958.getClass(), "type", 590451710);
        setIntField(term37960, term37960.getClass(), "type", -1999787419);
        setField(term37960, term37960.getClass(), "next", term37954);
        setField(term37960, term37960.getClass(), "first", null);
        setField(term37960, term37960.getClass(), "last", term37944);
        setField(term37960, term37960.getClass(), "propListHead", null);
        setIntField(term37960, term37960.getClass(), "sourcePosition", 0);
        setField(term37960, term37960.getClass(), "jsType", null);
        setField(term37960, term37960.getClass(), "parent", null);
        setField(term37958, term37958.getClass(), "next", term37960);
        setField(term37958, term37958.getClass(), "first", term37958);
        setIntField(term37963, term37963.getClass(), "type", 1406617209);
        setField(term37963, term37963.getClass(), "next", null);
        setField(term37963, term37963.getClass(), "first", term37951);
        setField(term37963, term37963.getClass(), "last", term37954);
        setField(term37963, term37963.getClass(), "propListHead", null);
        setIntField(term37963, term37963.getClass(), "sourcePosition", 0);
        setField(term37963, term37963.getClass(), "jsType", null);
        setField(term37963, term37963.getClass(), "parent", null);
        setField(term37958, term37958.getClass(), "last", term37963);
        setField(term37958, term37958.getClass(), "propListHead", null);
        setIntField(term37958, term37958.getClass(), "sourcePosition", 0);
        setField(term37958, term37958.getClass(), "jsType", null);
        setField(term37958, term37958.getClass(), "parent", null);
        setField(term37944, term37944.getClass(), "first", term37958);
        setField(term37944, term37944.getClass(), "last", term37948);
        setField(term37944, term37944.getClass(), "propListHead", null);
        setIntField(term37944, term37944.getClass(), "sourcePosition", 0);
        setField(term37944, term37944.getClass(), "jsType", null);
        setField(term37944, term37944.getClass(), "parent", null);
        setField(term37943, term37943.getClass(), "parameters", term37944);
        setField(term37943, term37943.getClass(), "returnType", null);
        setBooleanField(term37943, term37943.getClass(), "returnTypeInferred", false);
        setBooleanField(term37943, term37943.getClass(), "resolved", false);
        setField(term37943, term37943.getClass(), "resolveResult", null);
        setBooleanField(term37943, term37943.getClass(), "inTemplatedCheckVisit", false);
        setField(term37943, term37943.getClass(), "registry", null);
        setField(term37942, term37942.getClass(), "call", term37943);
        setField(term37971, term37971.getClass(), "name", null);
        setField(term37971, term37971.getClass(), "type", null);
        setBooleanField(term37971, term37971.getClass(), "inferred", false);
        setField(term37971, term37971.getClass(), "propertyNode", null);
        setField(term37971, term37971.getClass(), "docInfo", null);
        setField(term37942, term37942.getClass(), "prototypeSlot", term37971);
        setField(term37942, term37942.getClass(), "kind", enum343);
        setField(term37942, term37942.getClass(), "propAccess", enum344);
        setField(term37942, term37942.getClass(), "typeOfThis", null);
        setField(term37942, term37942.getClass(), "source", null);
        setField(term37942, term37942.getClass(), "implementedInterfaces", null);
        setField(term37942, term37942.getClass(), "extendedInterfaces", null);
        setField(term37942, term37942.getClass(), "subTypes", null);
        setField(term37942, term37942.getClass(), "templateTypeNames", null);
        setField(term37942, term37942.getClass(), "className", null);
        setField(term37942, term37942.getClass(), "properties", null);
        setBooleanField(term37942, term37942.getClass(), "nativeType", false);
        setField(term37942, term37942.getClass(), "implicitPrototypeFallback", null);
        setField(term37942, term37942.getClass(), "ownerFunction", null);
        setBooleanField(term37942, term37942.getClass(), "prettyPrint", false);
        setBooleanField(term37942, term37942.getClass(), "visited", false);
        setField(term37942, term37942.getClass(), "docInfo", null);
        setBooleanField(term37942, term37942.getClass(), "unknown", false);
        setBooleanField(term37942, term37942.getClass(), "resolved", false);
        setField(term37942, term37942.getClass(), "resolveResult", null);
        setBooleanField(term37942, term37942.getClass(), "inTemplatedCheckVisit", false);
        setField(term37942, term37942.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getInstanceType", argTypes, term37942, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


