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
import java.lang.Boolean;

public class FunctionType_supAndInfHelper_160397710485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12447;
     Object term12504;

    public FunctionType_supAndInfHelper_160397710485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43803 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term43802 = ((Class) term43803).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term43802).setAccessible(true);
        Object enum112 = ((Field) term43802).get((Object) null);
        term12447 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term12448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term12449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12462 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12472 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term12449, term12449.getClass(), "type", -220791533);
        setIntField(term12451, term12451.getClass(), "type", 1074848808);
        setIntField(term12453, term12453.getClass(), "type", 0);
        setField(term12453, term12453.getClass(), "next", null);
        setField(term12453, term12453.getClass(), "first", null);
        setField(term12453, term12453.getClass(), "last", null);
        setField(term12453, term12453.getClass(), "propListHead", null);
        setIntField(term12453, term12453.getClass(), "sourcePosition", 0);
        setField(term12453, term12453.getClass(), "jsType", null);
        setField(term12453, term12453.getClass(), "parent", null);
        setField(term12451, term12451.getClass(), "next", term12453);
        setIntField(term12456, term12456.getClass(), "type", 0);
        setField(term12456, term12456.getClass(), "next", null);
        setField(term12456, term12456.getClass(), "first", null);
        setField(term12456, term12456.getClass(), "last", null);
        setField(term12456, term12456.getClass(), "propListHead", null);
        setIntField(term12456, term12456.getClass(), "sourcePosition", 0);
        setField(term12456, term12456.getClass(), "jsType", null);
        setField(term12456, term12456.getClass(), "parent", null);
        setField(term12451, term12451.getClass(), "first", term12456);
        setIntField(term12459, term12459.getClass(), "type", 0);
        setField(term12459, term12459.getClass(), "next", null);
        setField(term12459, term12459.getClass(), "first", null);
        setField(term12459, term12459.getClass(), "last", null);
        setField(term12459, term12459.getClass(), "propListHead", null);
        setIntField(term12459, term12459.getClass(), "sourcePosition", 0);
        setField(term12459, term12459.getClass(), "jsType", null);
        setField(term12459, term12459.getClass(), "parent", null);
        setField(term12451, term12451.getClass(), "last", term12459);
        setField(term12462, term12462.getClass(), "next", null);
        setIntField(term12462, term12462.getClass(), "type", 0);
        setIntField(term12462, term12462.getClass(), "intValue", 0);
        setField(term12462, term12462.getClass(), "objectValue", null);
        setField(term12451, term12451.getClass(), "propListHead", term12462);
        setIntField(term12451, term12451.getClass(), "sourcePosition", -146054762);
        setField(term12451, term12451.getClass(), "jsType", null);
        setField(term12451, term12451.getClass(), "parent", null);
        setField(term12449, term12449.getClass(), "next", term12451);
        setIntField(term12466, term12466.getClass(), "type", 0);
        setField(term12466, term12466.getClass(), "next", null);
        setField(term12466, term12466.getClass(), "first", null);
        setField(term12466, term12466.getClass(), "last", null);
        setField(term12466, term12466.getClass(), "propListHead", null);
        setIntField(term12466, term12466.getClass(), "sourcePosition", 0);
        setField(term12466, term12466.getClass(), "jsType", null);
        setField(term12466, term12466.getClass(), "parent", null);
        setField(term12449, term12449.getClass(), "first", term12466);
        setIntField(term12469, term12469.getClass(), "type", 0);
        setField(term12469, term12469.getClass(), "next", null);
        setField(term12469, term12469.getClass(), "first", null);
        setField(term12469, term12469.getClass(), "last", null);
        setField(term12469, term12469.getClass(), "propListHead", null);
        setIntField(term12469, term12469.getClass(), "sourcePosition", 0);
        setField(term12469, term12469.getClass(), "jsType", null);
        setField(term12469, term12469.getClass(), "parent", null);
        setField(term12449, term12449.getClass(), "last", term12469);
        setField(term12472, term12472.getClass(), "next", null);
        setIntField(term12472, term12472.getClass(), "type", 0);
        setIntField(term12472, term12472.getClass(), "intValue", 0);
        setField(term12472, term12472.getClass(), "objectValue", null);
        setField(term12449, term12449.getClass(), "propListHead", term12472);
        setIntField(term12449, term12449.getClass(), "sourcePosition", 798043553);
        setField(term12449, term12449.getClass(), "jsType", null);
        setField(term12449, term12449.getClass(), "parent", null);
        setField(term12448, term12448.getClass(), "parameters", term12449);
        setField(term12448, term12448.getClass(), "returnType", null);
        setBooleanField(term12448, term12448.getClass(), "returnTypeInferred", false);
        setBooleanField(term12448, term12448.getClass(), "resolved", false);
        setField(term12448, term12448.getClass(), "resolveResult", null);
        setField(term12448, term12448.getClass(), "registry", null);
        setField(term12447, term12447.getClass(), "call", term12448);
        setField(term12478, term12478.getClass(), "ownerFunction", null);
        setField(term12478, term12478.getClass(), "className", null);
        setField(term12478, term12478.getClass(), "properties", null);
        setField(term12478, term12478.getClass(), "implicitPrototype", null);
        setBooleanField(term12478, term12478.getClass(), "nativeType", false);
        setBooleanField(term12478, term12478.getClass(), "prettyPrint", false);
        setBooleanField(term12478, term12478.getClass(), "visited", false);
        setField(term12478, term12478.getClass(), "docInfo", null);
        setBooleanField(term12478, term12478.getClass(), "unknown", false);
        setBooleanField(term12478, term12478.getClass(), "resolved", false);
        setField(term12478, term12478.getClass(), "resolveResult", null);
        setField(term12478, term12478.getClass(), "registry", null);
        setField(term12447, term12447.getClass(), "prototype", term12478);
        setField(term12447, term12447.getClass(), "kind", enum112);
        setField(term12447, term12447.getClass(), "typeOfThis", null);
        setField(term12447, term12447.getClass(), "source", null);
        setField(term12447, term12447.getClass(), "implementedInterfaces", null);
        setField(term12447, term12447.getClass(), "subTypes", null);
        setField(term12447, term12447.getClass(), "templateTypeName", null);
        setField(term12447, term12447.getClass(), "className", null);
        setField(term12447, term12447.getClass(), "properties", null);
        setField(term12447, term12447.getClass(), "implicitPrototype", null);
        setBooleanField(term12447, term12447.getClass(), "nativeType", false);
        setBooleanField(term12447, term12447.getClass(), "prettyPrint", false);
        setBooleanField(term12447, term12447.getClass(), "visited", false);
        setField(term12447, term12447.getClass(), "docInfo", null);
        setBooleanField(term12447, term12447.getClass(), "unknown", false);
        setBooleanField(term12447, term12447.getClass(), "resolved", false);
        setField(term12447, term12447.getClass(), "resolveResult", null);
        setField(term12447, term12447.getClass(), "registry", null);
        term12504 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12504;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term12447, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


