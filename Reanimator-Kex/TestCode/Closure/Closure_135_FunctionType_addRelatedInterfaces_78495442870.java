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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionType_addRelatedInterfaces_78495442870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8444;
     Object term8498;

    public FunctionType_addRelatedInterfaces_78495442870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34681 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term34680 = ((Class) term34681).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term34680).setAccessible(true);
        Object enum87 = ((Field) term34680).get((Object) null);
        term8444 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8445 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term8446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8459 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8469 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term8446, term8446.getClass(), "type", -1656687479);
        setIntField(term8448, term8448.getClass(), "type", -680920524);
        setIntField(term8450, term8450.getClass(), "type", 0);
        setField(term8450, term8450.getClass(), "next", null);
        setField(term8450, term8450.getClass(), "first", null);
        setField(term8450, term8450.getClass(), "last", null);
        setField(term8450, term8450.getClass(), "propListHead", null);
        setIntField(term8450, term8450.getClass(), "sourcePosition", 0);
        setField(term8450, term8450.getClass(), "jsType", null);
        setField(term8450, term8450.getClass(), "parent", null);
        setField(term8448, term8448.getClass(), "next", term8450);
        setIntField(term8453, term8453.getClass(), "type", 0);
        setField(term8453, term8453.getClass(), "next", null);
        setField(term8453, term8453.getClass(), "first", null);
        setField(term8453, term8453.getClass(), "last", null);
        setField(term8453, term8453.getClass(), "propListHead", null);
        setIntField(term8453, term8453.getClass(), "sourcePosition", 0);
        setField(term8453, term8453.getClass(), "jsType", null);
        setField(term8453, term8453.getClass(), "parent", null);
        setField(term8448, term8448.getClass(), "first", term8453);
        setIntField(term8456, term8456.getClass(), "type", 0);
        setField(term8456, term8456.getClass(), "next", null);
        setField(term8456, term8456.getClass(), "first", null);
        setField(term8456, term8456.getClass(), "last", null);
        setField(term8456, term8456.getClass(), "propListHead", null);
        setIntField(term8456, term8456.getClass(), "sourcePosition", 0);
        setField(term8456, term8456.getClass(), "jsType", null);
        setField(term8456, term8456.getClass(), "parent", null);
        setField(term8448, term8448.getClass(), "last", term8456);
        setField(term8459, term8459.getClass(), "next", null);
        setIntField(term8459, term8459.getClass(), "type", 0);
        setIntField(term8459, term8459.getClass(), "intValue", 0);
        setField(term8459, term8459.getClass(), "objectValue", null);
        setField(term8448, term8448.getClass(), "propListHead", term8459);
        setIntField(term8448, term8448.getClass(), "sourcePosition", -916335264);
        setField(term8448, term8448.getClass(), "jsType", null);
        setField(term8448, term8448.getClass(), "parent", null);
        setField(term8446, term8446.getClass(), "next", term8448);
        setIntField(term8463, term8463.getClass(), "type", 0);
        setField(term8463, term8463.getClass(), "next", null);
        setField(term8463, term8463.getClass(), "first", null);
        setField(term8463, term8463.getClass(), "last", null);
        setField(term8463, term8463.getClass(), "propListHead", null);
        setIntField(term8463, term8463.getClass(), "sourcePosition", 0);
        setField(term8463, term8463.getClass(), "jsType", null);
        setField(term8463, term8463.getClass(), "parent", null);
        setField(term8446, term8446.getClass(), "first", term8463);
        setIntField(term8466, term8466.getClass(), "type", 0);
        setField(term8466, term8466.getClass(), "next", null);
        setField(term8466, term8466.getClass(), "first", null);
        setField(term8466, term8466.getClass(), "last", null);
        setField(term8466, term8466.getClass(), "propListHead", null);
        setIntField(term8466, term8466.getClass(), "sourcePosition", 0);
        setField(term8466, term8466.getClass(), "jsType", null);
        setField(term8466, term8466.getClass(), "parent", null);
        setField(term8446, term8446.getClass(), "last", term8466);
        setField(term8469, term8469.getClass(), "next", null);
        setIntField(term8469, term8469.getClass(), "type", 0);
        setIntField(term8469, term8469.getClass(), "intValue", 0);
        setField(term8469, term8469.getClass(), "objectValue", null);
        setField(term8446, term8446.getClass(), "propListHead", term8469);
        setIntField(term8446, term8446.getClass(), "sourcePosition", -919416536);
        setField(term8446, term8446.getClass(), "jsType", null);
        setField(term8446, term8446.getClass(), "parent", null);
        setField(term8445, term8445.getClass(), "parameters", term8446);
        setField(term8445, term8445.getClass(), "returnType", null);
        setBooleanField(term8445, term8445.getClass(), "resolved", false);
        setField(term8445, term8445.getClass(), "resolveResult", null);
        setField(term8445, term8445.getClass(), "registry", null);
        setField(term8444, term8444.getClass(), "call", term8445);
        setField(term8474, term8474.getClass(), "ownerFunction", null);
        setField(term8474, term8474.getClass(), "className", null);
        setField(term8474, term8474.getClass(), "properties", null);
        setField(term8474, term8474.getClass(), "implicitPrototype", null);
        setBooleanField(term8474, term8474.getClass(), "nativeType", false);
        setBooleanField(term8474, term8474.getClass(), "visited", false);
        setField(term8474, term8474.getClass(), "docInfo", null);
        setBooleanField(term8474, term8474.getClass(), "unknown", false);
        setBooleanField(term8474, term8474.getClass(), "resolved", false);
        setField(term8474, term8474.getClass(), "resolveResult", null);
        setField(term8474, term8474.getClass(), "registry", null);
        setField(term8444, term8444.getClass(), "prototype", term8474);
        setField(term8444, term8444.getClass(), "kind", enum87);
        setField(term8444, term8444.getClass(), "typeOfThis", null);
        setField(term8444, term8444.getClass(), "source", null);
        setField(term8444, term8444.getClass(), "implementedInterfaces", null);
        setField(term8444, term8444.getClass(), "subTypes", null);
        setField(term8444, term8444.getClass(), "templateTypeName", null);
        setField(term8444, term8444.getClass(), "className", null);
        setField(term8444, term8444.getClass(), "properties", null);
        setField(term8444, term8444.getClass(), "implicitPrototype", null);
        setBooleanField(term8444, term8444.getClass(), "nativeType", false);
        setBooleanField(term8444, term8444.getClass(), "visited", false);
        setField(term8444, term8444.getClass(), "docInfo", null);
        setBooleanField(term8444, term8444.getClass(), "unknown", false);
        setBooleanField(term8444, term8444.getClass(), "resolved", false);
        setField(term8444, term8444.getClass(), "resolveResult", null);
        setField(term8444, term8444.getClass(), "registry", null);
        HashMap term8499 = new HashMap();
        Set<Object> term34980 =  ((Map) term8499).keySet();
        term8498 = new HashSet((Collection<? extends Object>) term34980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term8498;
        try {
            callMethod(klass, "addRelatedInterfaces", argTypes, term8444, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


