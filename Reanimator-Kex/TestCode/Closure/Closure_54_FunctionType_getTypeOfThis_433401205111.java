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

public class FunctionType_getTypeOfThis_433401205111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17369;

    public FunctionType_getTypeOfThis_433401205111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54986 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term54985 = ((Class) term54986).getDeclaredField((String) "ORDINARY");
        ((Field) term54985).setAccessible(true);
        Object enum138 = ((Field) term54985).get((Object) null);
        term17369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term17370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term17371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term17400 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term17371, term17371.getClass(), "type", 952869601);
        setIntField(term17373, term17373.getClass(), "type", 644154104);
        setIntField(term17375, term17375.getClass(), "type", 0);
        setField(term17375, term17375.getClass(), "next", null);
        setField(term17375, term17375.getClass(), "first", null);
        setField(term17375, term17375.getClass(), "last", null);
        setField(term17375, term17375.getClass(), "propListHead", null);
        setIntField(term17375, term17375.getClass(), "sourcePosition", 0);
        setField(term17375, term17375.getClass(), "jsType", null);
        setField(term17375, term17375.getClass(), "parent", null);
        setField(term17373, term17373.getClass(), "next", term17375);
        setIntField(term17378, term17378.getClass(), "type", 0);
        setField(term17378, term17378.getClass(), "next", null);
        setField(term17378, term17378.getClass(), "first", null);
        setField(term17378, term17378.getClass(), "last", null);
        setField(term17378, term17378.getClass(), "propListHead", null);
        setIntField(term17378, term17378.getClass(), "sourcePosition", 0);
        setField(term17378, term17378.getClass(), "jsType", null);
        setField(term17378, term17378.getClass(), "parent", null);
        setField(term17373, term17373.getClass(), "first", term17378);
        setIntField(term17381, term17381.getClass(), "type", 0);
        setField(term17381, term17381.getClass(), "next", null);
        setField(term17381, term17381.getClass(), "first", null);
        setField(term17381, term17381.getClass(), "last", null);
        setField(term17381, term17381.getClass(), "propListHead", null);
        setIntField(term17381, term17381.getClass(), "sourcePosition", 0);
        setField(term17381, term17381.getClass(), "jsType", null);
        setField(term17381, term17381.getClass(), "parent", null);
        setField(term17373, term17373.getClass(), "last", term17381);
        setField(term17373, term17373.getClass(), "propListHead", null);
        setIntField(term17373, term17373.getClass(), "sourcePosition", 0);
        setField(term17373, term17373.getClass(), "jsType", null);
        setField(term17373, term17373.getClass(), "parent", null);
        setField(term17371, term17371.getClass(), "next", term17373);
        setIntField(term17385, term17385.getClass(), "type", 0);
        setField(term17385, term17385.getClass(), "next", null);
        setField(term17385, term17385.getClass(), "first", null);
        setField(term17385, term17385.getClass(), "last", null);
        setField(term17385, term17385.getClass(), "propListHead", null);
        setIntField(term17385, term17385.getClass(), "sourcePosition", 0);
        setField(term17385, term17385.getClass(), "jsType", null);
        setField(term17385, term17385.getClass(), "parent", null);
        setField(term17371, term17371.getClass(), "first", term17385);
        setIntField(term17388, term17388.getClass(), "type", 0);
        setField(term17388, term17388.getClass(), "next", null);
        setField(term17388, term17388.getClass(), "first", null);
        setField(term17388, term17388.getClass(), "last", null);
        setField(term17388, term17388.getClass(), "propListHead", null);
        setIntField(term17388, term17388.getClass(), "sourcePosition", 0);
        setField(term17388, term17388.getClass(), "jsType", null);
        setField(term17388, term17388.getClass(), "parent", null);
        setField(term17371, term17371.getClass(), "last", term17388);
        setField(term17371, term17371.getClass(), "propListHead", null);
        setIntField(term17371, term17371.getClass(), "sourcePosition", 0);
        setField(term17371, term17371.getClass(), "jsType", null);
        setField(term17371, term17371.getClass(), "parent", null);
        setField(term17370, term17370.getClass(), "parameters", term17371);
        setField(term17370, term17370.getClass(), "returnType", null);
        setBooleanField(term17370, term17370.getClass(), "returnTypeInferred", false);
        setBooleanField(term17370, term17370.getClass(), "resolved", false);
        setField(term17370, term17370.getClass(), "resolveResult", null);
        setField(term17370, term17370.getClass(), "registry", null);
        setField(term17369, term17369.getClass(), "call", term17370);
        setField(term17394, term17394.getClass(), "className", null);
        setField(term17394, term17394.getClass(), "properties", null);
        setBooleanField(term17394, term17394.getClass(), "nativeType", false);
        setField(term17394, term17394.getClass(), "implicitPrototypeFallback", null);
        setField(term17394, term17394.getClass(), "ownerFunction", null);
        setBooleanField(term17394, term17394.getClass(), "prettyPrint", false);
        setBooleanField(term17394, term17394.getClass(), "visited", false);
        setField(term17394, term17394.getClass(), "docInfo", null);
        setBooleanField(term17394, term17394.getClass(), "unknown", false);
        setBooleanField(term17394, term17394.getClass(), "resolved", false);
        setField(term17394, term17394.getClass(), "resolveResult", null);
        setField(term17394, term17394.getClass(), "registry", null);
        setField(term17369, term17369.getClass(), "prototype", term17394);
        setField(term17400, term17400.getClass(), "name", null);
        setField(term17400, term17400.getClass(), "type", null);
        setBooleanField(term17400, term17400.getClass(), "inferred", false);
        setField(term17369, term17369.getClass(), "prototypeSlot", term17400);
        setField(term17369, term17369.getClass(), "kind", enum138);
        setField(term17369, term17369.getClass(), "typeOfThis", null);
        setField(term17369, term17369.getClass(), "source", null);
        setField(term17369, term17369.getClass(), "implementedInterfaces", null);
        setField(term17369, term17369.getClass(), "extendedInterfaces", null);
        setField(term17369, term17369.getClass(), "subTypes", null);
        setField(term17369, term17369.getClass(), "templateTypeName", null);
        setField(term17369, term17369.getClass(), "className", null);
        setField(term17369, term17369.getClass(), "properties", null);
        setBooleanField(term17369, term17369.getClass(), "nativeType", false);
        setField(term17369, term17369.getClass(), "implicitPrototypeFallback", null);
        setField(term17369, term17369.getClass(), "ownerFunction", null);
        setBooleanField(term17369, term17369.getClass(), "prettyPrint", false);
        setBooleanField(term17369, term17369.getClass(), "visited", false);
        setField(term17369, term17369.getClass(), "docInfo", null);
        setBooleanField(term17369, term17369.getClass(), "unknown", false);
        setBooleanField(term17369, term17369.getClass(), "resolved", false);
        setField(term17369, term17369.getClass(), "resolveResult", null);
        setField(term17369, term17369.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getTypeOfThis", argTypes, term17369, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


