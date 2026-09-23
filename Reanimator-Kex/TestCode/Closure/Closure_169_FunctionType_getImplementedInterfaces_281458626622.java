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

public class FunctionType_getImplementedInterfaces_281458626622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term598950;
     Object term599825;

    public FunctionType_getImplementedInterfaces_281458626622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term599833 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term599832 = ((Class) term599833).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term599832).setAccessible(true);
        Object enum974 = ((Field) term599832).get((Object) null);
        term598950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term599212 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term599322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term599428 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term598950, term598950.getClass(), "kind", enum974);
        setField(term599322, term599322.getClass(), "implicitPrototypeFallback", term599428);
        setField(term599212, term599212.getClass(), "type", term599322);
        setField(term598950, term598950.getClass(), "prototypeSlot", term599212);
        Class<? extends Object> term600133 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term600132 = ((Class) term600133).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term600132).setAccessible(true);
        Object enum975 = ((Field) term600132).get((Object) null);
        term599825 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term599826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term599827 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term599828 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term599825, term599825.getClass(), "call", null);
        setField(term599826, term599826.getClass(), "name", null);
        setField(term599827, term599827.getClass(), "call", null);
        setField(term599827, term599827.getClass(), "prototypeSlot", null);
        setField(term599827, term599827.getClass(), "kind", null);
        setField(term599827, term599827.getClass(), "propAccess", null);
        setField(term599827, term599827.getClass(), "typeOfThis", null);
        setField(term599827, term599827.getClass(), "source", null);
        setField(term599827, term599827.getClass(), "implementedInterfaces", null);
        setField(term599827, term599827.getClass(), "extendedInterfaces", null);
        setField(term599827, term599827.getClass(), "subTypes", null);
        setField(term599827, term599827.getClass(), "templateTypeNames", null);
        setField(term599827, term599827.getClass(), "className", null);
        setField(term599827, term599827.getClass(), "properties", null);
        setBooleanField(term599827, term599827.getClass(), "nativeType", false);
        setField(term599828, term599828.getClass(), "primitiveType", null);
        setField(term599828, term599828.getClass(), "primitiveObjectType", null);
        setField(term599828, term599828.getClass(), "name", null);
        setBooleanField(term599828, term599828.getClass(), "visited", false);
        setField(term599828, term599828.getClass(), "docInfo", null);
        setBooleanField(term599828, term599828.getClass(), "unknown", false);
        setBooleanField(term599828, term599828.getClass(), "resolved", false);
        setField(term599828, term599828.getClass(), "resolveResult", null);
        setBooleanField(term599828, term599828.getClass(), "inTemplatedCheckVisit", false);
        setField(term599828, term599828.getClass(), "registry", null);
        setField(term599827, term599827.getClass(), "implicitPrototypeFallback", term599828);
        setField(term599827, term599827.getClass(), "ownerFunction", null);
        setBooleanField(term599827, term599827.getClass(), "prettyPrint", false);
        setBooleanField(term599827, term599827.getClass(), "visited", false);
        setField(term599827, term599827.getClass(), "docInfo", null);
        setBooleanField(term599827, term599827.getClass(), "unknown", false);
        setBooleanField(term599827, term599827.getClass(), "resolved", false);
        setField(term599827, term599827.getClass(), "resolveResult", null);
        setBooleanField(term599827, term599827.getClass(), "inTemplatedCheckVisit", false);
        setField(term599827, term599827.getClass(), "registry", null);
        setField(term599826, term599826.getClass(), "type", term599827);
        setBooleanField(term599826, term599826.getClass(), "inferred", false);
        setField(term599826, term599826.getClass(), "propertyNode", null);
        setField(term599826, term599826.getClass(), "docInfo", null);
        setField(term599825, term599825.getClass(), "prototypeSlot", term599826);
        setField(term599825, term599825.getClass(), "kind", enum975);
        setField(term599825, term599825.getClass(), "propAccess", null);
        setField(term599825, term599825.getClass(), "typeOfThis", null);
        setField(term599825, term599825.getClass(), "source", null);
        setField(term599825, term599825.getClass(), "implementedInterfaces", null);
        setField(term599825, term599825.getClass(), "extendedInterfaces", null);
        setField(term599825, term599825.getClass(), "subTypes", null);
        setField(term599825, term599825.getClass(), "templateTypeNames", null);
        setField(term599825, term599825.getClass(), "className", null);
        setField(term599825, term599825.getClass(), "properties", null);
        setBooleanField(term599825, term599825.getClass(), "nativeType", false);
        setField(term599825, term599825.getClass(), "implicitPrototypeFallback", null);
        setField(term599825, term599825.getClass(), "ownerFunction", null);
        setBooleanField(term599825, term599825.getClass(), "prettyPrint", false);
        setBooleanField(term599825, term599825.getClass(), "visited", false);
        setField(term599825, term599825.getClass(), "docInfo", null);
        setBooleanField(term599825, term599825.getClass(), "unknown", false);
        setBooleanField(term599825, term599825.getClass(), "resolved", false);
        setField(term599825, term599825.getClass(), "resolveResult", null);
        setBooleanField(term599825, term599825.getClass(), "inTemplatedCheckVisit", false);
        setField(term599825, term599825.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplementedInterfaces", argTypes, term598950, args);
        assertTrue(recursiveEquals(term598950, term599825));
        assertTrue(recursiveEquals(retValue, null));
    }

};


