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

public class FunctionType_makesDicts_145559956680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3670;

    public FunctionType_makesDicts_145559956680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term56711 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term56710 = ((Class) term56711).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term56710).setAccessible(true);
        Object enum164 = ((Field) term56710).get((Object) null);
        Class<? extends Object> term57011 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term57010 = ((Class) term57011).getDeclaredField((String) "STRUCT");
        ((Field) term57010).setAccessible(true);
        Object enum165 = ((Field) term57010).get((Object) null);
        term3670 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term3671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term3672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term3672, term3672.getClass(), "type", -1263114719);
        setIntField(term3674, term3674.getClass(), "type", -894662986);
        setIntField(term3676, term3676.getClass(), "type", 304775596);
        setField(term3676, term3676.getClass(), "next", null);
        setField(term3676, term3676.getClass(), "first", null);
        setField(term3676, term3676.getClass(), "last", null);
        setField(term3676, term3676.getClass(), "propListHead", null);
        setIntField(term3676, term3676.getClass(), "sourcePosition", 0);
        setField(term3676, term3676.getClass(), "jsType", null);
        setField(term3676, term3676.getClass(), "parent", null);
        setField(term3674, term3674.getClass(), "next", term3676);
        setIntField(term3679, term3679.getClass(), "type", 0);
        setField(term3679, term3679.getClass(), "next", null);
        setField(term3679, term3679.getClass(), "first", null);
        setField(term3679, term3679.getClass(), "last", null);
        setField(term3679, term3679.getClass(), "propListHead", null);
        setIntField(term3679, term3679.getClass(), "sourcePosition", 0);
        setField(term3679, term3679.getClass(), "jsType", null);
        setField(term3679, term3679.getClass(), "parent", null);
        setField(term3674, term3674.getClass(), "first", term3679);
        setIntField(term3682, term3682.getClass(), "type", -268815336);
        setField(term3682, term3682.getClass(), "next", null);
        setField(term3682, term3682.getClass(), "first", term3679);
        setField(term3682, term3682.getClass(), "last", term3682);
        setField(term3682, term3682.getClass(), "propListHead", null);
        setIntField(term3682, term3682.getClass(), "sourcePosition", 0);
        setField(term3682, term3682.getClass(), "jsType", null);
        setField(term3682, term3682.getClass(), "parent", null);
        setField(term3674, term3674.getClass(), "last", term3682);
        setField(term3674, term3674.getClass(), "propListHead", null);
        setIntField(term3674, term3674.getClass(), "sourcePosition", 0);
        setField(term3674, term3674.getClass(), "jsType", null);
        setField(term3674, term3674.getClass(), "parent", null);
        setField(term3672, term3672.getClass(), "next", term3674);
        setIntField(term3686, term3686.getClass(), "type", 683666002);
        setIntField(term3688, term3688.getClass(), "type", 1596213415);
        setField(term3688, term3688.getClass(), "next", term3682);
        setField(term3688, term3688.getClass(), "first", null);
        setField(term3688, term3688.getClass(), "last", term3672);
        setField(term3688, term3688.getClass(), "propListHead", null);
        setIntField(term3688, term3688.getClass(), "sourcePosition", 0);
        setField(term3688, term3688.getClass(), "jsType", null);
        setField(term3688, term3688.getClass(), "parent", null);
        setField(term3686, term3686.getClass(), "next", term3688);
        setField(term3686, term3686.getClass(), "first", term3686);
        setIntField(term3691, term3691.getClass(), "type", -1347665717);
        setField(term3691, term3691.getClass(), "next", null);
        setField(term3691, term3691.getClass(), "first", term3679);
        setField(term3691, term3691.getClass(), "last", term3682);
        setField(term3691, term3691.getClass(), "propListHead", null);
        setIntField(term3691, term3691.getClass(), "sourcePosition", 0);
        setField(term3691, term3691.getClass(), "jsType", null);
        setField(term3691, term3691.getClass(), "parent", null);
        setField(term3686, term3686.getClass(), "last", term3691);
        setField(term3686, term3686.getClass(), "propListHead", null);
        setIntField(term3686, term3686.getClass(), "sourcePosition", 0);
        setField(term3686, term3686.getClass(), "jsType", null);
        setField(term3686, term3686.getClass(), "parent", null);
        setField(term3672, term3672.getClass(), "first", term3686);
        setField(term3672, term3672.getClass(), "last", term3676);
        setField(term3672, term3672.getClass(), "propListHead", null);
        setIntField(term3672, term3672.getClass(), "sourcePosition", 0);
        setField(term3672, term3672.getClass(), "jsType", null);
        setField(term3672, term3672.getClass(), "parent", null);
        setField(term3671, term3671.getClass(), "parameters", term3672);
        setField(term3671, term3671.getClass(), "returnType", null);
        setBooleanField(term3671, term3671.getClass(), "returnTypeInferred", false);
        setBooleanField(term3671, term3671.getClass(), "resolved", false);
        setField(term3671, term3671.getClass(), "resolveResult", null);
        setBooleanField(term3671, term3671.getClass(), "inTemplatedCheckVisit", false);
        setField(term3671, term3671.getClass(), "registry", null);
        setField(term3670, term3670.getClass(), "call", term3671);
        setField(term3699, term3699.getClass(), "name", null);
        setField(term3699, term3699.getClass(), "type", null);
        setBooleanField(term3699, term3699.getClass(), "inferred", false);
        setField(term3699, term3699.getClass(), "propertyNode", null);
        setField(term3699, term3699.getClass(), "docInfo", null);
        setField(term3670, term3670.getClass(), "prototypeSlot", term3699);
        setField(term3670, term3670.getClass(), "kind", enum164);
        setField(term3670, term3670.getClass(), "propAccess", enum165);
        setField(term3670, term3670.getClass(), "typeOfThis", null);
        setField(term3670, term3670.getClass(), "source", null);
        setField(term3670, term3670.getClass(), "implementedInterfaces", null);
        setField(term3670, term3670.getClass(), "extendedInterfaces", null);
        setField(term3670, term3670.getClass(), "subTypes", null);
        setField(term3670, term3670.getClass(), "templateTypeNames", null);
        setField(term3670, term3670.getClass(), "className", null);
        setField(term3670, term3670.getClass(), "properties", null);
        setBooleanField(term3670, term3670.getClass(), "nativeType", false);
        setField(term3670, term3670.getClass(), "implicitPrototypeFallback", null);
        setField(term3670, term3670.getClass(), "ownerFunction", null);
        setBooleanField(term3670, term3670.getClass(), "prettyPrint", false);
        setBooleanField(term3670, term3670.getClass(), "visited", false);
        setField(term3670, term3670.getClass(), "docInfo", null);
        setBooleanField(term3670, term3670.getClass(), "unknown", false);
        setBooleanField(term3670, term3670.getClass(), "resolved", false);
        setField(term3670, term3670.getClass(), "resolveResult", null);
        setBooleanField(term3670, term3670.getClass(), "inTemplatedCheckVisit", false);
        setField(term3670, term3670.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "makesDicts", argTypes, term3670, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


