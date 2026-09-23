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

public class FunctionType_getDebugHashCodeStringOf_167476349121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21189;

    public FunctionType_getDebugHashCodeStringOf_167476349121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62558 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term62557 = ((Class) term62558).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term62557).setAccessible(true);
        Object enum159 = ((Field) term62557).get((Object) null);
        term21189 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term21190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term21191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term21220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term21191, term21191.getClass(), "type", 1200440315);
        setIntField(term21193, term21193.getClass(), "type", 279384872);
        setIntField(term21195, term21195.getClass(), "type", 0);
        setField(term21195, term21195.getClass(), "next", null);
        setField(term21195, term21195.getClass(), "first", null);
        setField(term21195, term21195.getClass(), "last", null);
        setField(term21195, term21195.getClass(), "propListHead", null);
        setIntField(term21195, term21195.getClass(), "sourcePosition", 0);
        setField(term21195, term21195.getClass(), "jsType", null);
        setField(term21195, term21195.getClass(), "parent", null);
        setField(term21193, term21193.getClass(), "next", term21195);
        setIntField(term21198, term21198.getClass(), "type", 0);
        setField(term21198, term21198.getClass(), "next", null);
        setField(term21198, term21198.getClass(), "first", null);
        setField(term21198, term21198.getClass(), "last", null);
        setField(term21198, term21198.getClass(), "propListHead", null);
        setIntField(term21198, term21198.getClass(), "sourcePosition", 0);
        setField(term21198, term21198.getClass(), "jsType", null);
        setField(term21198, term21198.getClass(), "parent", null);
        setField(term21193, term21193.getClass(), "first", term21198);
        setIntField(term21201, term21201.getClass(), "type", 0);
        setField(term21201, term21201.getClass(), "next", null);
        setField(term21201, term21201.getClass(), "first", null);
        setField(term21201, term21201.getClass(), "last", null);
        setField(term21201, term21201.getClass(), "propListHead", null);
        setIntField(term21201, term21201.getClass(), "sourcePosition", 0);
        setField(term21201, term21201.getClass(), "jsType", null);
        setField(term21201, term21201.getClass(), "parent", null);
        setField(term21193, term21193.getClass(), "last", term21201);
        setField(term21193, term21193.getClass(), "propListHead", null);
        setIntField(term21193, term21193.getClass(), "sourcePosition", 0);
        setField(term21193, term21193.getClass(), "jsType", null);
        setField(term21193, term21193.getClass(), "parent", null);
        setField(term21191, term21191.getClass(), "next", term21193);
        setIntField(term21205, term21205.getClass(), "type", 0);
        setField(term21205, term21205.getClass(), "next", null);
        setField(term21205, term21205.getClass(), "first", null);
        setField(term21205, term21205.getClass(), "last", null);
        setField(term21205, term21205.getClass(), "propListHead", null);
        setIntField(term21205, term21205.getClass(), "sourcePosition", 0);
        setField(term21205, term21205.getClass(), "jsType", null);
        setField(term21205, term21205.getClass(), "parent", null);
        setField(term21191, term21191.getClass(), "first", term21205);
        setIntField(term21208, term21208.getClass(), "type", 0);
        setField(term21208, term21208.getClass(), "next", null);
        setField(term21208, term21208.getClass(), "first", null);
        setField(term21208, term21208.getClass(), "last", null);
        setField(term21208, term21208.getClass(), "propListHead", null);
        setIntField(term21208, term21208.getClass(), "sourcePosition", 0);
        setField(term21208, term21208.getClass(), "jsType", null);
        setField(term21208, term21208.getClass(), "parent", null);
        setField(term21191, term21191.getClass(), "last", term21208);
        setField(term21191, term21191.getClass(), "propListHead", null);
        setIntField(term21191, term21191.getClass(), "sourcePosition", 0);
        setField(term21191, term21191.getClass(), "jsType", null);
        setField(term21191, term21191.getClass(), "parent", null);
        setField(term21190, term21190.getClass(), "parameters", term21191);
        setField(term21190, term21190.getClass(), "returnType", null);
        setBooleanField(term21190, term21190.getClass(), "returnTypeInferred", false);
        setBooleanField(term21190, term21190.getClass(), "resolved", false);
        setField(term21190, term21190.getClass(), "resolveResult", null);
        setField(term21190, term21190.getClass(), "registry", null);
        setField(term21189, term21189.getClass(), "call", term21190);
        setField(term21214, term21214.getClass(), "className", null);
        setField(term21214, term21214.getClass(), "properties", null);
        setBooleanField(term21214, term21214.getClass(), "nativeType", false);
        setField(term21214, term21214.getClass(), "implicitPrototypeFallback", null);
        setField(term21214, term21214.getClass(), "ownerFunction", null);
        setBooleanField(term21214, term21214.getClass(), "prettyPrint", false);
        setBooleanField(term21214, term21214.getClass(), "visited", false);
        setField(term21214, term21214.getClass(), "docInfo", null);
        setBooleanField(term21214, term21214.getClass(), "unknown", false);
        setBooleanField(term21214, term21214.getClass(), "resolved", false);
        setField(term21214, term21214.getClass(), "resolveResult", null);
        setField(term21214, term21214.getClass(), "registry", null);
        setField(term21189, term21189.getClass(), "prototype", term21214);
        setField(term21220, term21220.getClass(), "name", null);
        setField(term21220, term21220.getClass(), "type", null);
        setBooleanField(term21220, term21220.getClass(), "inferred", false);
        setField(term21189, term21189.getClass(), "prototypeSlot", term21220);
        setField(term21189, term21189.getClass(), "kind", enum159);
        setField(term21189, term21189.getClass(), "typeOfThis", null);
        setField(term21189, term21189.getClass(), "source", null);
        setField(term21189, term21189.getClass(), "implementedInterfaces", null);
        setField(term21189, term21189.getClass(), "extendedInterfaces", null);
        setField(term21189, term21189.getClass(), "subTypes", null);
        setField(term21189, term21189.getClass(), "templateTypeName", null);
        setField(term21189, term21189.getClass(), "className", null);
        setField(term21189, term21189.getClass(), "properties", null);
        setBooleanField(term21189, term21189.getClass(), "nativeType", false);
        setField(term21189, term21189.getClass(), "implicitPrototypeFallback", null);
        setField(term21189, term21189.getClass(), "ownerFunction", null);
        setBooleanField(term21189, term21189.getClass(), "prettyPrint", false);
        setBooleanField(term21189, term21189.getClass(), "visited", false);
        setField(term21189, term21189.getClass(), "docInfo", null);
        setBooleanField(term21189, term21189.getClass(), "unknown", false);
        setBooleanField(term21189, term21189.getClass(), "resolved", false);
        setField(term21189, term21189.getClass(), "resolveResult", null);
        setField(term21189, term21189.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getDebugHashCodeStringOf", argTypes, term21189, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


