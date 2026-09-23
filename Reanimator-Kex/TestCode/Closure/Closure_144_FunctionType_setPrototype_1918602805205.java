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
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class FunctionType_setPrototype_1918602805205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103122;
     Object term103388;
     Object term104498;
     Object term104504;

    public FunctionType_setPrototype_1918602805205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term104508 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term104507 = ((Class) term104508).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term104507).setAccessible(true);
        Object enum219 = ((Field) term104507).get((Object) null);
        term103122 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term103122, term103122.getClass(), "kind", enum219);
        setField(term103122, term103122.getClass(), "typeOfThis", null);
        setField(term103122, term103122.getClass(), "prototype", null);
        term103388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term103494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term103388, term103388.getClass(), "implicitPrototype", term103494);
        Class<? extends Object> term104808 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term104807 = ((Class) term104808).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term104807).setAccessible(true);
        Object enum220 = ((Field) term104807).get((Object) null);
        term104498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term104499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term104500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term104498, term104498.getClass(), "call", null);
        setField(term104499, term104499.getClass(), "ownerFunction", null);
        setField(term104499, term104499.getClass(), "className", null);
        setField(term104499, term104499.getClass(), "properties", null);
        setField(term104500, term104500.getClass(), "primitiveType", null);
        setField(term104500, term104500.getClass(), "primitiveObjectType", null);
        setField(term104500, term104500.getClass(), "name", null);
        setBooleanField(term104500, term104500.getClass(), "visited", false);
        setField(term104500, term104500.getClass(), "docInfo", null);
        setBooleanField(term104500, term104500.getClass(), "unknown", false);
        setBooleanField(term104500, term104500.getClass(), "resolved", false);
        setField(term104500, term104500.getClass(), "resolveResult", null);
        setField(term104500, term104500.getClass(), "registry", null);
        setField(term104499, term104499.getClass(), "implicitPrototype", term104500);
        setBooleanField(term104499, term104499.getClass(), "nativeType", false);
        setBooleanField(term104499, term104499.getClass(), "prettyPrint", false);
        setBooleanField(term104499, term104499.getClass(), "visited", false);
        setField(term104499, term104499.getClass(), "docInfo", null);
        setBooleanField(term104499, term104499.getClass(), "unknown", false);
        setBooleanField(term104499, term104499.getClass(), "resolved", false);
        setField(term104499, term104499.getClass(), "resolveResult", null);
        setField(term104499, term104499.getClass(), "registry", null);
        setField(term104498, term104498.getClass(), "prototype", term104499);
        setField(term104498, term104498.getClass(), "kind", enum220);
        setField(term104498, term104498.getClass(), "typeOfThis", null);
        setField(term104498, term104498.getClass(), "source", null);
        setField(term104498, term104498.getClass(), "implementedInterfaces", null);
        setField(term104498, term104498.getClass(), "subTypes", null);
        setField(term104498, term104498.getClass(), "templateTypeName", null);
        setField(term104498, term104498.getClass(), "className", null);
        setField(term104498, term104498.getClass(), "properties", null);
        setField(term104498, term104498.getClass(), "implicitPrototype", null);
        setBooleanField(term104498, term104498.getClass(), "nativeType", false);
        setBooleanField(term104498, term104498.getClass(), "prettyPrint", false);
        setBooleanField(term104498, term104498.getClass(), "visited", false);
        setField(term104498, term104498.getClass(), "docInfo", null);
        setBooleanField(term104498, term104498.getClass(), "unknown", false);
        setBooleanField(term104498, term104498.getClass(), "resolved", false);
        setField(term104498, term104498.getClass(), "resolveResult", null);
        setField(term104498, term104498.getClass(), "registry", null);
        term104504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term104505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term104504, term104504.getClass(), "ownerFunction", null);
        setField(term104504, term104504.getClass(), "className", null);
        setField(term104504, term104504.getClass(), "properties", null);
        setField(term104505, term104505.getClass(), "primitiveType", null);
        setField(term104505, term104505.getClass(), "primitiveObjectType", null);
        setField(term104505, term104505.getClass(), "name", null);
        setBooleanField(term104505, term104505.getClass(), "visited", false);
        setField(term104505, term104505.getClass(), "docInfo", null);
        setBooleanField(term104505, term104505.getClass(), "unknown", false);
        setBooleanField(term104505, term104505.getClass(), "resolved", false);
        setField(term104505, term104505.getClass(), "resolveResult", null);
        setField(term104505, term104505.getClass(), "registry", null);
        setField(term104504, term104504.getClass(), "implicitPrototype", term104505);
        setBooleanField(term104504, term104504.getClass(), "nativeType", false);
        setBooleanField(term104504, term104504.getClass(), "prettyPrint", false);
        setBooleanField(term104504, term104504.getClass(), "visited", false);
        setField(term104504, term104504.getClass(), "docInfo", null);
        setBooleanField(term104504, term104504.getClass(), "unknown", false);
        setBooleanField(term104504, term104504.getClass(), "resolved", false);
        setField(term104504, term104504.getClass(), "resolveResult", null);
        setField(term104504, term104504.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term103388;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term103122, args);
        assertTrue(recursiveEquals(term103122, term104498));
        assertTrue(recursiveEquals(term103388, term104504));
        assertTrue(recursiveEquals(retValue, true));
    }

};


