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

public class FunctionType_toString_199218226585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14133;

    public FunctionType_toString_199218226585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46135 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term46134 = ((Class) term46135).getDeclaredField((String) "ORDINARY");
        ((Field) term46134).setAccessible(true);
        Object enum114 = ((Field) term46134).get((Object) null);
        term14133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term14134 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term14135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14148 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14158 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14163 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term14135, term14135.getClass(), "type", -97742366);
        setIntField(term14137, term14137.getClass(), "type", -423900705);
        setIntField(term14139, term14139.getClass(), "type", 0);
        setField(term14139, term14139.getClass(), "next", null);
        setField(term14139, term14139.getClass(), "first", null);
        setField(term14139, term14139.getClass(), "last", null);
        setField(term14139, term14139.getClass(), "propListHead", null);
        setIntField(term14139, term14139.getClass(), "sourcePosition", 0);
        setField(term14139, term14139.getClass(), "jsType", null);
        setField(term14139, term14139.getClass(), "parent", null);
        setField(term14137, term14137.getClass(), "next", term14139);
        setIntField(term14142, term14142.getClass(), "type", 0);
        setField(term14142, term14142.getClass(), "next", null);
        setField(term14142, term14142.getClass(), "first", null);
        setField(term14142, term14142.getClass(), "last", null);
        setField(term14142, term14142.getClass(), "propListHead", null);
        setIntField(term14142, term14142.getClass(), "sourcePosition", 0);
        setField(term14142, term14142.getClass(), "jsType", null);
        setField(term14142, term14142.getClass(), "parent", null);
        setField(term14137, term14137.getClass(), "first", term14142);
        setIntField(term14145, term14145.getClass(), "type", 0);
        setField(term14145, term14145.getClass(), "next", null);
        setField(term14145, term14145.getClass(), "first", null);
        setField(term14145, term14145.getClass(), "last", null);
        setField(term14145, term14145.getClass(), "propListHead", null);
        setIntField(term14145, term14145.getClass(), "sourcePosition", 0);
        setField(term14145, term14145.getClass(), "jsType", null);
        setField(term14145, term14145.getClass(), "parent", null);
        setField(term14137, term14137.getClass(), "last", term14145);
        setField(term14148, term14148.getClass(), "next", null);
        setIntField(term14148, term14148.getClass(), "type", 0);
        setIntField(term14148, term14148.getClass(), "intValue", 0);
        setField(term14148, term14148.getClass(), "objectValue", null);
        setField(term14137, term14137.getClass(), "propListHead", term14148);
        setIntField(term14137, term14137.getClass(), "sourcePosition", -525570815);
        setField(term14137, term14137.getClass(), "jsType", null);
        setField(term14137, term14137.getClass(), "parent", null);
        setField(term14135, term14135.getClass(), "next", term14137);
        setIntField(term14152, term14152.getClass(), "type", 0);
        setField(term14152, term14152.getClass(), "next", null);
        setField(term14152, term14152.getClass(), "first", null);
        setField(term14152, term14152.getClass(), "last", null);
        setField(term14152, term14152.getClass(), "propListHead", null);
        setIntField(term14152, term14152.getClass(), "sourcePosition", 0);
        setField(term14152, term14152.getClass(), "jsType", null);
        setField(term14152, term14152.getClass(), "parent", null);
        setField(term14135, term14135.getClass(), "first", term14152);
        setIntField(term14155, term14155.getClass(), "type", 0);
        setField(term14155, term14155.getClass(), "next", null);
        setField(term14155, term14155.getClass(), "first", null);
        setField(term14155, term14155.getClass(), "last", null);
        setField(term14155, term14155.getClass(), "propListHead", null);
        setIntField(term14155, term14155.getClass(), "sourcePosition", 0);
        setField(term14155, term14155.getClass(), "jsType", null);
        setField(term14155, term14155.getClass(), "parent", null);
        setField(term14135, term14135.getClass(), "last", term14155);
        setField(term14158, term14158.getClass(), "next", null);
        setIntField(term14158, term14158.getClass(), "type", 0);
        setIntField(term14158, term14158.getClass(), "intValue", 0);
        setField(term14158, term14158.getClass(), "objectValue", null);
        setField(term14135, term14135.getClass(), "propListHead", term14158);
        setIntField(term14135, term14135.getClass(), "sourcePosition", 754055848);
        setField(term14135, term14135.getClass(), "jsType", null);
        setField(term14135, term14135.getClass(), "parent", null);
        setField(term14134, term14134.getClass(), "parameters", term14135);
        setField(term14134, term14134.getClass(), "returnType", null);
        setBooleanField(term14134, term14134.getClass(), "resolved", false);
        setField(term14134, term14134.getClass(), "resolveResult", null);
        setField(term14134, term14134.getClass(), "registry", null);
        setField(term14133, term14133.getClass(), "call", term14134);
        setField(term14163, term14163.getClass(), "ownerFunction", null);
        setField(term14163, term14163.getClass(), "className", null);
        setField(term14163, term14163.getClass(), "properties", null);
        setField(term14163, term14163.getClass(), "implicitPrototype", null);
        setBooleanField(term14163, term14163.getClass(), "nativeType", false);
        setBooleanField(term14163, term14163.getClass(), "visited", false);
        setField(term14163, term14163.getClass(), "docInfo", null);
        setBooleanField(term14163, term14163.getClass(), "unknown", false);
        setBooleanField(term14163, term14163.getClass(), "resolved", false);
        setField(term14163, term14163.getClass(), "resolveResult", null);
        setField(term14163, term14163.getClass(), "registry", null);
        setField(term14133, term14133.getClass(), "prototype", term14163);
        setField(term14133, term14133.getClass(), "kind", enum114);
        setField(term14133, term14133.getClass(), "typeOfThis", null);
        setField(term14133, term14133.getClass(), "source", null);
        setField(term14133, term14133.getClass(), "implementedInterfaces", null);
        setField(term14133, term14133.getClass(), "subTypes", null);
        setField(term14133, term14133.getClass(), "templateTypeName", null);
        setField(term14133, term14133.getClass(), "className", null);
        setField(term14133, term14133.getClass(), "properties", null);
        setField(term14133, term14133.getClass(), "implicitPrototype", null);
        setBooleanField(term14133, term14133.getClass(), "nativeType", false);
        setBooleanField(term14133, term14133.getClass(), "visited", false);
        setField(term14133, term14133.getClass(), "docInfo", null);
        setBooleanField(term14133, term14133.getClass(), "unknown", false);
        setBooleanField(term14133, term14133.getClass(), "resolved", false);
        setField(term14133, term14133.getClass(), "resolveResult", null);
        setField(term14133, term14133.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term14133, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


