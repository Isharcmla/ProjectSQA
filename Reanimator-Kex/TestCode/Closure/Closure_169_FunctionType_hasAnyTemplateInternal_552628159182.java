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

public class FunctionType_hasAnyTemplateInternal_552628159182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48641;

    public FunctionType_hasAnyTemplateInternal_552628159182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term214712 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term214711 = ((Class) term214712).getDeclaredField((String) "ORDINARY");
        ((Field) term214711).setAccessible(true);
        Object enum403 = ((Field) term214711).get((Object) null);
        Class<? extends Object> term215020 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term215019 = ((Class) term215020).getDeclaredField((String) "ANY");
        ((Field) term215019).setAccessible(true);
        Object enum404 = ((Field) term215019).get((Object) null);
        term48641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term48642 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term48643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48670 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term48643, term48643.getClass(), "type", 452088587);
        setIntField(term48645, term48645.getClass(), "type", -1630069454);
        setIntField(term48647, term48647.getClass(), "type", 1499735894);
        setField(term48647, term48647.getClass(), "next", null);
        setField(term48647, term48647.getClass(), "first", null);
        setField(term48647, term48647.getClass(), "last", null);
        setField(term48647, term48647.getClass(), "propListHead", null);
        setIntField(term48647, term48647.getClass(), "sourcePosition", 0);
        setField(term48647, term48647.getClass(), "jsType", null);
        setField(term48647, term48647.getClass(), "parent", null);
        setField(term48645, term48645.getClass(), "next", term48647);
        setIntField(term48650, term48650.getClass(), "type", 0);
        setField(term48650, term48650.getClass(), "next", null);
        setField(term48650, term48650.getClass(), "first", null);
        setField(term48650, term48650.getClass(), "last", null);
        setField(term48650, term48650.getClass(), "propListHead", null);
        setIntField(term48650, term48650.getClass(), "sourcePosition", 0);
        setField(term48650, term48650.getClass(), "jsType", null);
        setField(term48650, term48650.getClass(), "parent", null);
        setField(term48645, term48645.getClass(), "first", term48650);
        setIntField(term48653, term48653.getClass(), "type", -100681578);
        setField(term48653, term48653.getClass(), "next", null);
        setField(term48653, term48653.getClass(), "first", term48650);
        setField(term48653, term48653.getClass(), "last", term48653);
        setField(term48653, term48653.getClass(), "propListHead", null);
        setIntField(term48653, term48653.getClass(), "sourcePosition", 0);
        setField(term48653, term48653.getClass(), "jsType", null);
        setField(term48653, term48653.getClass(), "parent", null);
        setField(term48645, term48645.getClass(), "last", term48653);
        setField(term48645, term48645.getClass(), "propListHead", null);
        setIntField(term48645, term48645.getClass(), "sourcePosition", 0);
        setField(term48645, term48645.getClass(), "jsType", null);
        setField(term48645, term48645.getClass(), "parent", null);
        setField(term48643, term48643.getClass(), "next", term48645);
        setIntField(term48657, term48657.getClass(), "type", 1038029515);
        setIntField(term48659, term48659.getClass(), "type", 1137154606);
        setField(term48659, term48659.getClass(), "next", term48653);
        setField(term48659, term48659.getClass(), "first", null);
        setField(term48659, term48659.getClass(), "last", term48643);
        setField(term48659, term48659.getClass(), "propListHead", null);
        setIntField(term48659, term48659.getClass(), "sourcePosition", 0);
        setField(term48659, term48659.getClass(), "jsType", null);
        setField(term48659, term48659.getClass(), "parent", null);
        setField(term48657, term48657.getClass(), "next", term48659);
        setField(term48657, term48657.getClass(), "first", term48657);
        setIntField(term48662, term48662.getClass(), "type", 716486048);
        setField(term48662, term48662.getClass(), "next", null);
        setField(term48662, term48662.getClass(), "first", term48650);
        setField(term48662, term48662.getClass(), "last", term48653);
        setField(term48662, term48662.getClass(), "propListHead", null);
        setIntField(term48662, term48662.getClass(), "sourcePosition", 0);
        setField(term48662, term48662.getClass(), "jsType", null);
        setField(term48662, term48662.getClass(), "parent", null);
        setField(term48657, term48657.getClass(), "last", term48662);
        setField(term48657, term48657.getClass(), "propListHead", null);
        setIntField(term48657, term48657.getClass(), "sourcePosition", 0);
        setField(term48657, term48657.getClass(), "jsType", null);
        setField(term48657, term48657.getClass(), "parent", null);
        setField(term48643, term48643.getClass(), "first", term48657);
        setField(term48643, term48643.getClass(), "last", term48647);
        setField(term48643, term48643.getClass(), "propListHead", null);
        setIntField(term48643, term48643.getClass(), "sourcePosition", 0);
        setField(term48643, term48643.getClass(), "jsType", null);
        setField(term48643, term48643.getClass(), "parent", null);
        setField(term48642, term48642.getClass(), "parameters", term48643);
        setField(term48642, term48642.getClass(), "returnType", null);
        setBooleanField(term48642, term48642.getClass(), "returnTypeInferred", false);
        setBooleanField(term48642, term48642.getClass(), "resolved", false);
        setField(term48642, term48642.getClass(), "resolveResult", null);
        setBooleanField(term48642, term48642.getClass(), "inTemplatedCheckVisit", false);
        setField(term48642, term48642.getClass(), "registry", null);
        setField(term48641, term48641.getClass(), "call", term48642);
        setField(term48670, term48670.getClass(), "name", null);
        setField(term48670, term48670.getClass(), "type", null);
        setBooleanField(term48670, term48670.getClass(), "inferred", false);
        setField(term48670, term48670.getClass(), "propertyNode", null);
        setField(term48670, term48670.getClass(), "docInfo", null);
        setField(term48641, term48641.getClass(), "prototypeSlot", term48670);
        setField(term48641, term48641.getClass(), "kind", enum403);
        setField(term48641, term48641.getClass(), "propAccess", enum404);
        setField(term48641, term48641.getClass(), "typeOfThis", null);
        setField(term48641, term48641.getClass(), "source", null);
        setField(term48641, term48641.getClass(), "implementedInterfaces", null);
        setField(term48641, term48641.getClass(), "extendedInterfaces", null);
        setField(term48641, term48641.getClass(), "subTypes", null);
        setField(term48641, term48641.getClass(), "templateTypeNames", null);
        setField(term48641, term48641.getClass(), "className", null);
        setField(term48641, term48641.getClass(), "properties", null);
        setBooleanField(term48641, term48641.getClass(), "nativeType", false);
        setField(term48641, term48641.getClass(), "implicitPrototypeFallback", null);
        setField(term48641, term48641.getClass(), "ownerFunction", null);
        setBooleanField(term48641, term48641.getClass(), "prettyPrint", false);
        setBooleanField(term48641, term48641.getClass(), "visited", false);
        setField(term48641, term48641.getClass(), "docInfo", null);
        setBooleanField(term48641, term48641.getClass(), "unknown", false);
        setBooleanField(term48641, term48641.getClass(), "resolved", false);
        setField(term48641, term48641.getClass(), "resolveResult", null);
        setBooleanField(term48641, term48641.getClass(), "inTemplatedCheckVisit", false);
        setField(term48641, term48641.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasAnyTemplateInternal", argTypes, term48641, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


