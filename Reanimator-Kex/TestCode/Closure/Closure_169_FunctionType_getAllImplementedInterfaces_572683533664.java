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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class FunctionType_getAllImplementedInterfaces_572683533664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652658;
     Object term653465;
     Object term653458;

    public FunctionType_getAllImplementedInterfaces_572683533664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term653474 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term653473 = ((Class) term653474).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term653473).setAccessible(true);
        Object enum1071 = ((Field) term653473).get((Object) null);
        ArrayList term653076 = new ArrayList();
        term652658 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term652920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term653024 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term652658, term652658.getClass(), "kind", enum1071);
        setField(term653024, term653024.getClass(), "implicitPrototypeFallback", null);
        setField(term652920, term652920.getClass(), "type", term653024);
        setField(term652658, term652658.getClass(), "prototypeSlot", term652920);
        setField(term652658, term652658.getClass(), "implementedInterfaces", term653076);
        Class<? extends Object> term653774 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term653773 = ((Class) term653774).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term653773).setAccessible(true);
        Object enum1072 = ((Field) term653773).get((Object) null);
        ArrayList term653471 = new ArrayList();
        term653465 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term653466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term653467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term653465, term653465.getClass(), "call", null);
        setField(term653466, term653466.getClass(), "name", null);
        setField(term653467, term653467.getClass(), "call", null);
        setField(term653467, term653467.getClass(), "prototypeSlot", null);
        setField(term653467, term653467.getClass(), "kind", null);
        setField(term653467, term653467.getClass(), "propAccess", null);
        setField(term653467, term653467.getClass(), "typeOfThis", null);
        setField(term653467, term653467.getClass(), "source", null);
        setField(term653467, term653467.getClass(), "implementedInterfaces", null);
        setField(term653467, term653467.getClass(), "extendedInterfaces", null);
        setField(term653467, term653467.getClass(), "subTypes", null);
        setField(term653467, term653467.getClass(), "templateTypeNames", null);
        setField(term653467, term653467.getClass(), "className", null);
        setField(term653467, term653467.getClass(), "properties", null);
        setBooleanField(term653467, term653467.getClass(), "nativeType", false);
        setField(term653467, term653467.getClass(), "implicitPrototypeFallback", null);
        setField(term653467, term653467.getClass(), "ownerFunction", null);
        setBooleanField(term653467, term653467.getClass(), "prettyPrint", false);
        setBooleanField(term653467, term653467.getClass(), "visited", false);
        setField(term653467, term653467.getClass(), "docInfo", null);
        setBooleanField(term653467, term653467.getClass(), "unknown", false);
        setBooleanField(term653467, term653467.getClass(), "resolved", false);
        setField(term653467, term653467.getClass(), "resolveResult", null);
        setBooleanField(term653467, term653467.getClass(), "inTemplatedCheckVisit", false);
        setField(term653467, term653467.getClass(), "registry", null);
        setField(term653466, term653466.getClass(), "type", term653467);
        setBooleanField(term653466, term653466.getClass(), "inferred", false);
        setField(term653466, term653466.getClass(), "propertyNode", null);
        setField(term653466, term653466.getClass(), "docInfo", null);
        setField(term653465, term653465.getClass(), "prototypeSlot", term653466);
        setField(term653465, term653465.getClass(), "kind", enum1072);
        setField(term653465, term653465.getClass(), "propAccess", null);
        setField(term653465, term653465.getClass(), "typeOfThis", null);
        setField(term653465, term653465.getClass(), "source", null);
        setField(term653465, term653465.getClass(), "implementedInterfaces", term653471);
        setField(term653465, term653465.getClass(), "extendedInterfaces", null);
        setField(term653465, term653465.getClass(), "subTypes", null);
        setField(term653465, term653465.getClass(), "templateTypeNames", null);
        setField(term653465, term653465.getClass(), "className", null);
        setField(term653465, term653465.getClass(), "properties", null);
        setBooleanField(term653465, term653465.getClass(), "nativeType", false);
        setField(term653465, term653465.getClass(), "implicitPrototypeFallback", null);
        setField(term653465, term653465.getClass(), "ownerFunction", null);
        setBooleanField(term653465, term653465.getClass(), "prettyPrint", false);
        setBooleanField(term653465, term653465.getClass(), "visited", false);
        setField(term653465, term653465.getClass(), "docInfo", null);
        setBooleanField(term653465, term653465.getClass(), "unknown", false);
        setBooleanField(term653465, term653465.getClass(), "resolved", false);
        setField(term653465, term653465.getClass(), "resolveResult", null);
        setBooleanField(term653465, term653465.getClass(), "inTemplatedCheckVisit", false);
        setField(term653465, term653465.getClass(), "registry", null);
        LinkedHashMap term653459 = new LinkedHashMap();
        Set<Object> term654073 =  ((Map) term653459).keySet();
        term653458 = new LinkedHashSet((Collection<? extends Object>) term654073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term652658, args);
        assertTrue(recursiveEquals(term652658, term653465));
        assertTrue(recursiveEquals(retValue, term653458));
    }

};


