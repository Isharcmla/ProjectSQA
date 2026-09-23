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
import java.lang.String;

public class FunctionType_hasOwnProperty_54494952479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10261;

    public FunctionType_hasOwnProperty_54494952479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39702 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term39701 = ((Class) term39702).getDeclaredField((String) "ORDINARY");
        ((Field) term39701).setAccessible(true);
        Object enum104 = ((Field) term39701).get((Object) null);
        term10261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term10263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10276 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10286 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10292 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term10263, term10263.getClass(), "type", 1745276158);
        setIntField(term10265, term10265.getClass(), "type", 1050765721);
        setIntField(term10267, term10267.getClass(), "type", 0);
        setField(term10267, term10267.getClass(), "next", null);
        setField(term10267, term10267.getClass(), "first", null);
        setField(term10267, term10267.getClass(), "last", null);
        setField(term10267, term10267.getClass(), "propListHead", null);
        setIntField(term10267, term10267.getClass(), "sourcePosition", 0);
        setField(term10267, term10267.getClass(), "jsType", null);
        setField(term10267, term10267.getClass(), "parent", null);
        setField(term10265, term10265.getClass(), "next", term10267);
        setIntField(term10270, term10270.getClass(), "type", 0);
        setField(term10270, term10270.getClass(), "next", null);
        setField(term10270, term10270.getClass(), "first", null);
        setField(term10270, term10270.getClass(), "last", null);
        setField(term10270, term10270.getClass(), "propListHead", null);
        setIntField(term10270, term10270.getClass(), "sourcePosition", 0);
        setField(term10270, term10270.getClass(), "jsType", null);
        setField(term10270, term10270.getClass(), "parent", null);
        setField(term10265, term10265.getClass(), "first", term10270);
        setIntField(term10273, term10273.getClass(), "type", 0);
        setField(term10273, term10273.getClass(), "next", null);
        setField(term10273, term10273.getClass(), "first", null);
        setField(term10273, term10273.getClass(), "last", null);
        setField(term10273, term10273.getClass(), "propListHead", null);
        setIntField(term10273, term10273.getClass(), "sourcePosition", 0);
        setField(term10273, term10273.getClass(), "jsType", null);
        setField(term10273, term10273.getClass(), "parent", null);
        setField(term10265, term10265.getClass(), "last", term10273);
        setField(term10276, term10276.getClass(), "next", null);
        setIntField(term10276, term10276.getClass(), "type", 0);
        setIntField(term10276, term10276.getClass(), "intValue", 0);
        setField(term10276, term10276.getClass(), "objectValue", null);
        setField(term10265, term10265.getClass(), "propListHead", term10276);
        setIntField(term10265, term10265.getClass(), "sourcePosition", 474518942);
        setField(term10265, term10265.getClass(), "jsType", null);
        setField(term10265, term10265.getClass(), "parent", null);
        setField(term10263, term10263.getClass(), "next", term10265);
        setIntField(term10280, term10280.getClass(), "type", 0);
        setField(term10280, term10280.getClass(), "next", null);
        setField(term10280, term10280.getClass(), "first", null);
        setField(term10280, term10280.getClass(), "last", null);
        setField(term10280, term10280.getClass(), "propListHead", null);
        setIntField(term10280, term10280.getClass(), "sourcePosition", 0);
        setField(term10280, term10280.getClass(), "jsType", null);
        setField(term10280, term10280.getClass(), "parent", null);
        setField(term10263, term10263.getClass(), "first", term10280);
        setIntField(term10283, term10283.getClass(), "type", 0);
        setField(term10283, term10283.getClass(), "next", null);
        setField(term10283, term10283.getClass(), "first", null);
        setField(term10283, term10283.getClass(), "last", null);
        setField(term10283, term10283.getClass(), "propListHead", null);
        setIntField(term10283, term10283.getClass(), "sourcePosition", 0);
        setField(term10283, term10283.getClass(), "jsType", null);
        setField(term10283, term10283.getClass(), "parent", null);
        setField(term10263, term10263.getClass(), "last", term10283);
        setField(term10286, term10286.getClass(), "next", null);
        setIntField(term10286, term10286.getClass(), "type", 0);
        setIntField(term10286, term10286.getClass(), "intValue", 0);
        setField(term10286, term10286.getClass(), "objectValue", null);
        setField(term10263, term10263.getClass(), "propListHead", term10286);
        setIntField(term10263, term10263.getClass(), "sourcePosition", -1656687479);
        setField(term10263, term10263.getClass(), "jsType", null);
        setField(term10263, term10263.getClass(), "parent", null);
        setField(term10262, term10262.getClass(), "parameters", term10263);
        setField(term10262, term10262.getClass(), "returnType", null);
        setBooleanField(term10262, term10262.getClass(), "returnTypeInferred", false);
        setBooleanField(term10262, term10262.getClass(), "resolved", false);
        setField(term10262, term10262.getClass(), "resolveResult", null);
        setField(term10262, term10262.getClass(), "registry", null);
        setField(term10261, term10261.getClass(), "call", term10262);
        setField(term10292, term10292.getClass(), "ownerFunction", null);
        setField(term10292, term10292.getClass(), "className", null);
        setField(term10292, term10292.getClass(), "properties", null);
        setField(term10292, term10292.getClass(), "implicitPrototype", null);
        setBooleanField(term10292, term10292.getClass(), "nativeType", false);
        setBooleanField(term10292, term10292.getClass(), "prettyPrint", false);
        setBooleanField(term10292, term10292.getClass(), "visited", false);
        setField(term10292, term10292.getClass(), "docInfo", null);
        setBooleanField(term10292, term10292.getClass(), "unknown", false);
        setBooleanField(term10292, term10292.getClass(), "resolved", false);
        setField(term10292, term10292.getClass(), "resolveResult", null);
        setField(term10292, term10292.getClass(), "registry", null);
        setField(term10261, term10261.getClass(), "prototype", term10292);
        setField(term10261, term10261.getClass(), "kind", enum104);
        setField(term10261, term10261.getClass(), "typeOfThis", null);
        setField(term10261, term10261.getClass(), "source", null);
        setField(term10261, term10261.getClass(), "implementedInterfaces", null);
        setField(term10261, term10261.getClass(), "subTypes", null);
        setField(term10261, term10261.getClass(), "templateTypeName", null);
        setField(term10261, term10261.getClass(), "className", null);
        setField(term10261, term10261.getClass(), "properties", null);
        setField(term10261, term10261.getClass(), "implicitPrototype", null);
        setBooleanField(term10261, term10261.getClass(), "nativeType", false);
        setBooleanField(term10261, term10261.getClass(), "prettyPrint", false);
        setBooleanField(term10261, term10261.getClass(), "visited", false);
        setField(term10261, term10261.getClass(), "docInfo", null);
        setBooleanField(term10261, term10261.getClass(), "unknown", false);
        setBooleanField(term10261, term10261.getClass(), "resolved", false);
        setField(term10261, term10261.getClass(), "resolveResult", null);
        setField(term10261, term10261.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WHcwFgsGFC";
        try {
            callMethod(klass, "hasOwnProperty", argTypes, term10261, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


