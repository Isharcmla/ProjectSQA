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

public class FunctionType_resolveInternal_580742699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19103;

    public FunctionType_resolveInternal_580742699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55834 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term55833 = ((Class) term55834).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term55833).setAccessible(true);
        Object enum139 = ((Field) term55833).get((Object) null);
        term19103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term19104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term19105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19118 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term19122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19128 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term19133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term19105, term19105.getClass(), "type", 732174235);
        setIntField(term19107, term19107.getClass(), "type", -255317272);
        setIntField(term19109, term19109.getClass(), "type", 0);
        setField(term19109, term19109.getClass(), "next", null);
        setField(term19109, term19109.getClass(), "first", null);
        setField(term19109, term19109.getClass(), "last", null);
        setField(term19109, term19109.getClass(), "propListHead", null);
        setIntField(term19109, term19109.getClass(), "sourcePosition", 0);
        setField(term19109, term19109.getClass(), "jsType", null);
        setField(term19109, term19109.getClass(), "parent", null);
        setField(term19107, term19107.getClass(), "next", term19109);
        setIntField(term19112, term19112.getClass(), "type", 0);
        setField(term19112, term19112.getClass(), "next", null);
        setField(term19112, term19112.getClass(), "first", null);
        setField(term19112, term19112.getClass(), "last", null);
        setField(term19112, term19112.getClass(), "propListHead", null);
        setIntField(term19112, term19112.getClass(), "sourcePosition", 0);
        setField(term19112, term19112.getClass(), "jsType", null);
        setField(term19112, term19112.getClass(), "parent", null);
        setField(term19107, term19107.getClass(), "first", term19112);
        setIntField(term19115, term19115.getClass(), "type", 0);
        setField(term19115, term19115.getClass(), "next", null);
        setField(term19115, term19115.getClass(), "first", null);
        setField(term19115, term19115.getClass(), "last", null);
        setField(term19115, term19115.getClass(), "propListHead", null);
        setIntField(term19115, term19115.getClass(), "sourcePosition", 0);
        setField(term19115, term19115.getClass(), "jsType", null);
        setField(term19115, term19115.getClass(), "parent", null);
        setField(term19107, term19107.getClass(), "last", term19115);
        setField(term19118, term19118.getClass(), "next", null);
        setIntField(term19118, term19118.getClass(), "type", 0);
        setIntField(term19118, term19118.getClass(), "intValue", 0);
        setField(term19118, term19118.getClass(), "objectValue", null);
        setField(term19107, term19107.getClass(), "propListHead", term19118);
        setIntField(term19107, term19107.getClass(), "sourcePosition", -706253892);
        setField(term19107, term19107.getClass(), "jsType", null);
        setField(term19107, term19107.getClass(), "parent", null);
        setField(term19105, term19105.getClass(), "next", term19107);
        setIntField(term19122, term19122.getClass(), "type", 0);
        setField(term19122, term19122.getClass(), "next", null);
        setField(term19122, term19122.getClass(), "first", null);
        setField(term19122, term19122.getClass(), "last", null);
        setField(term19122, term19122.getClass(), "propListHead", null);
        setIntField(term19122, term19122.getClass(), "sourcePosition", 0);
        setField(term19122, term19122.getClass(), "jsType", null);
        setField(term19122, term19122.getClass(), "parent", null);
        setField(term19105, term19105.getClass(), "first", term19122);
        setIntField(term19125, term19125.getClass(), "type", 0);
        setField(term19125, term19125.getClass(), "next", null);
        setField(term19125, term19125.getClass(), "first", null);
        setField(term19125, term19125.getClass(), "last", null);
        setField(term19125, term19125.getClass(), "propListHead", null);
        setIntField(term19125, term19125.getClass(), "sourcePosition", 0);
        setField(term19125, term19125.getClass(), "jsType", null);
        setField(term19125, term19125.getClass(), "parent", null);
        setField(term19105, term19105.getClass(), "last", term19125);
        setField(term19128, term19128.getClass(), "next", null);
        setIntField(term19128, term19128.getClass(), "type", 0);
        setIntField(term19128, term19128.getClass(), "intValue", 0);
        setField(term19128, term19128.getClass(), "objectValue", null);
        setField(term19105, term19105.getClass(), "propListHead", term19128);
        setIntField(term19105, term19105.getClass(), "sourcePosition", -1341439819);
        setField(term19105, term19105.getClass(), "jsType", null);
        setField(term19105, term19105.getClass(), "parent", null);
        setField(term19104, term19104.getClass(), "parameters", term19105);
        setField(term19104, term19104.getClass(), "returnType", null);
        setBooleanField(term19104, term19104.getClass(), "resolved", false);
        setField(term19104, term19104.getClass(), "resolveResult", null);
        setField(term19104, term19104.getClass(), "registry", null);
        setField(term19103, term19103.getClass(), "call", term19104);
        setField(term19133, term19133.getClass(), "ownerFunction", null);
        setField(term19133, term19133.getClass(), "className", null);
        setField(term19133, term19133.getClass(), "properties", null);
        setField(term19133, term19133.getClass(), "implicitPrototype", null);
        setBooleanField(term19133, term19133.getClass(), "nativeType", false);
        setBooleanField(term19133, term19133.getClass(), "visited", false);
        setField(term19133, term19133.getClass(), "docInfo", null);
        setBooleanField(term19133, term19133.getClass(), "unknown", false);
        setBooleanField(term19133, term19133.getClass(), "resolved", false);
        setField(term19133, term19133.getClass(), "resolveResult", null);
        setField(term19133, term19133.getClass(), "registry", null);
        setField(term19103, term19103.getClass(), "prototype", term19133);
        setField(term19103, term19103.getClass(), "kind", enum139);
        setField(term19103, term19103.getClass(), "typeOfThis", null);
        setField(term19103, term19103.getClass(), "source", null);
        setField(term19103, term19103.getClass(), "implementedInterfaces", null);
        setField(term19103, term19103.getClass(), "subTypes", null);
        setField(term19103, term19103.getClass(), "templateTypeName", null);
        setField(term19103, term19103.getClass(), "className", null);
        setField(term19103, term19103.getClass(), "properties", null);
        setField(term19103, term19103.getClass(), "implicitPrototype", null);
        setBooleanField(term19103, term19103.getClass(), "nativeType", false);
        setBooleanField(term19103, term19103.getClass(), "visited", false);
        setField(term19103, term19103.getClass(), "docInfo", null);
        setBooleanField(term19103, term19103.getClass(), "unknown", false);
        setBooleanField(term19103, term19103.getClass(), "resolved", false);
        setField(term19103, term19103.getClass(), "resolveResult", null);
        setField(term19103, term19103.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "resolveInternal", argTypes, term19103, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


