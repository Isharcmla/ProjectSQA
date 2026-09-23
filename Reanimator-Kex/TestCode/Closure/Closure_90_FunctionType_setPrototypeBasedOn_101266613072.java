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

public class FunctionType_setPrototypeBasedOn_101266613072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7647;

    public FunctionType_setPrototypeBasedOn_101266613072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34406 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term34405 = ((Class) term34406).getDeclaredField((String) "INTERFACE");
        ((Field) term34405).setAccessible(true);
        Object enum92 = ((Field) term34405).get((Object) null);
        term7647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term7648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term7649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7662 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7672 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7678 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term7649, term7649.getClass(), "type", 389427431);
        setIntField(term7651, term7651.getClass(), "type", -1214628358);
        setIntField(term7653, term7653.getClass(), "type", 0);
        setField(term7653, term7653.getClass(), "next", null);
        setField(term7653, term7653.getClass(), "first", null);
        setField(term7653, term7653.getClass(), "last", null);
        setField(term7653, term7653.getClass(), "propListHead", null);
        setIntField(term7653, term7653.getClass(), "sourcePosition", 0);
        setField(term7653, term7653.getClass(), "jsType", null);
        setField(term7653, term7653.getClass(), "parent", null);
        setField(term7651, term7651.getClass(), "next", term7653);
        setIntField(term7656, term7656.getClass(), "type", 0);
        setField(term7656, term7656.getClass(), "next", null);
        setField(term7656, term7656.getClass(), "first", null);
        setField(term7656, term7656.getClass(), "last", null);
        setField(term7656, term7656.getClass(), "propListHead", null);
        setIntField(term7656, term7656.getClass(), "sourcePosition", 0);
        setField(term7656, term7656.getClass(), "jsType", null);
        setField(term7656, term7656.getClass(), "parent", null);
        setField(term7651, term7651.getClass(), "first", term7656);
        setIntField(term7659, term7659.getClass(), "type", 0);
        setField(term7659, term7659.getClass(), "next", null);
        setField(term7659, term7659.getClass(), "first", null);
        setField(term7659, term7659.getClass(), "last", null);
        setField(term7659, term7659.getClass(), "propListHead", null);
        setIntField(term7659, term7659.getClass(), "sourcePosition", 0);
        setField(term7659, term7659.getClass(), "jsType", null);
        setField(term7659, term7659.getClass(), "parent", null);
        setField(term7651, term7651.getClass(), "last", term7659);
        setField(term7662, term7662.getClass(), "next", null);
        setIntField(term7662, term7662.getClass(), "type", 0);
        setIntField(term7662, term7662.getClass(), "intValue", 0);
        setField(term7662, term7662.getClass(), "objectValue", null);
        setField(term7651, term7651.getClass(), "propListHead", term7662);
        setIntField(term7651, term7651.getClass(), "sourcePosition", 1102721075);
        setField(term7651, term7651.getClass(), "jsType", null);
        setField(term7651, term7651.getClass(), "parent", null);
        setField(term7649, term7649.getClass(), "next", term7651);
        setIntField(term7666, term7666.getClass(), "type", 0);
        setField(term7666, term7666.getClass(), "next", null);
        setField(term7666, term7666.getClass(), "first", null);
        setField(term7666, term7666.getClass(), "last", null);
        setField(term7666, term7666.getClass(), "propListHead", null);
        setIntField(term7666, term7666.getClass(), "sourcePosition", 0);
        setField(term7666, term7666.getClass(), "jsType", null);
        setField(term7666, term7666.getClass(), "parent", null);
        setField(term7649, term7649.getClass(), "first", term7666);
        setIntField(term7669, term7669.getClass(), "type", 0);
        setField(term7669, term7669.getClass(), "next", null);
        setField(term7669, term7669.getClass(), "first", null);
        setField(term7669, term7669.getClass(), "last", null);
        setField(term7669, term7669.getClass(), "propListHead", null);
        setIntField(term7669, term7669.getClass(), "sourcePosition", 0);
        setField(term7669, term7669.getClass(), "jsType", null);
        setField(term7669, term7669.getClass(), "parent", null);
        setField(term7649, term7649.getClass(), "last", term7669);
        setField(term7672, term7672.getClass(), "next", null);
        setIntField(term7672, term7672.getClass(), "type", 0);
        setIntField(term7672, term7672.getClass(), "intValue", 0);
        setField(term7672, term7672.getClass(), "objectValue", null);
        setField(term7649, term7649.getClass(), "propListHead", term7672);
        setIntField(term7649, term7649.getClass(), "sourcePosition", -426764678);
        setField(term7649, term7649.getClass(), "jsType", null);
        setField(term7649, term7649.getClass(), "parent", null);
        setField(term7648, term7648.getClass(), "parameters", term7649);
        setField(term7648, term7648.getClass(), "returnType", null);
        setBooleanField(term7648, term7648.getClass(), "returnTypeInferred", false);
        setBooleanField(term7648, term7648.getClass(), "resolved", false);
        setField(term7648, term7648.getClass(), "resolveResult", null);
        setField(term7648, term7648.getClass(), "registry", null);
        setField(term7647, term7647.getClass(), "call", term7648);
        setField(term7678, term7678.getClass(), "ownerFunction", null);
        setField(term7678, term7678.getClass(), "className", null);
        setField(term7678, term7678.getClass(), "properties", null);
        setBooleanField(term7678, term7678.getClass(), "nativeType", false);
        setField(term7678, term7678.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term7678, term7678.getClass(), "prettyPrint", false);
        setBooleanField(term7678, term7678.getClass(), "visited", false);
        setField(term7678, term7678.getClass(), "docInfo", null);
        setBooleanField(term7678, term7678.getClass(), "unknown", false);
        setBooleanField(term7678, term7678.getClass(), "resolved", false);
        setField(term7678, term7678.getClass(), "resolveResult", null);
        setField(term7678, term7678.getClass(), "registry", null);
        setField(term7647, term7647.getClass(), "prototype", term7678);
        setField(term7647, term7647.getClass(), "kind", enum92);
        setField(term7647, term7647.getClass(), "typeOfThis", null);
        setField(term7647, term7647.getClass(), "source", null);
        setField(term7647, term7647.getClass(), "implementedInterfaces", null);
        setField(term7647, term7647.getClass(), "subTypes", null);
        setField(term7647, term7647.getClass(), "templateTypeName", null);
        setField(term7647, term7647.getClass(), "className", null);
        setField(term7647, term7647.getClass(), "properties", null);
        setBooleanField(term7647, term7647.getClass(), "nativeType", false);
        setField(term7647, term7647.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term7647, term7647.getClass(), "prettyPrint", false);
        setBooleanField(term7647, term7647.getClass(), "visited", false);
        setField(term7647, term7647.getClass(), "docInfo", null);
        setBooleanField(term7647, term7647.getClass(), "unknown", false);
        setBooleanField(term7647, term7647.getClass(), "resolved", false);
        setField(term7647, term7647.getClass(), "resolveResult", null);
        setField(term7647, term7647.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term7647, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


