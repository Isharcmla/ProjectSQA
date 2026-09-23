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

public class FunctionType_getAllImplementedInterfaces_572683533235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238947;
     Object term239489;
     Object term239482;

    public FunctionType_getAllImplementedInterfaces_572683533235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term239496 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term239495 = ((Class) term239496).getDeclaredField((String) "INTERFACE");
        ((Field) term239495).setAccessible(true);
        Object enum446 = ((Field) term239495).get((Object) null);
        ArrayList term239147 = new ArrayList();
        term238947 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term238947, term238947.getClass(), "kind", enum446);
        setField(term238947, term238947.getClass(), "implementedInterfaces", term239147);
        Class<? extends Object> term239790 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term239789 = ((Class) term239790).getDeclaredField((String) "INTERFACE");
        ((Field) term239789).setAccessible(true);
        Object enum447 = ((Field) term239789).get((Object) null);
        ArrayList term239493 = new ArrayList();
        term239489 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term239489, term239489.getClass(), "call", null);
        setField(term239489, term239489.getClass(), "prototypeSlot", null);
        setField(term239489, term239489.getClass(), "kind", enum447);
        setField(term239489, term239489.getClass(), "propAccess", null);
        setField(term239489, term239489.getClass(), "typeOfThis", null);
        setField(term239489, term239489.getClass(), "source", null);
        setField(term239489, term239489.getClass(), "implementedInterfaces", term239493);
        setField(term239489, term239489.getClass(), "extendedInterfaces", null);
        setField(term239489, term239489.getClass(), "subTypes", null);
        setField(term239489, term239489.getClass(), "templateTypeNames", null);
        setField(term239489, term239489.getClass(), "className", null);
        setField(term239489, term239489.getClass(), "properties", null);
        setBooleanField(term239489, term239489.getClass(), "nativeType", false);
        setField(term239489, term239489.getClass(), "implicitPrototypeFallback", null);
        setField(term239489, term239489.getClass(), "ownerFunction", null);
        setBooleanField(term239489, term239489.getClass(), "prettyPrint", false);
        setBooleanField(term239489, term239489.getClass(), "visited", false);
        setField(term239489, term239489.getClass(), "docInfo", null);
        setBooleanField(term239489, term239489.getClass(), "unknown", false);
        setBooleanField(term239489, term239489.getClass(), "resolved", false);
        setField(term239489, term239489.getClass(), "resolveResult", null);
        setBooleanField(term239489, term239489.getClass(), "inTemplatedCheckVisit", false);
        setField(term239489, term239489.getClass(), "registry", null);
        LinkedHashMap term239483 = new LinkedHashMap();
        Set<Object> term240083 =  ((Map) term239483).keySet();
        term239482 = new LinkedHashSet((Collection<? extends Object>) term240083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term238947, args);
        assertTrue(recursiveEquals(term238947, term239489));
        assertTrue(recursiveEquals(retValue, term239482));
    }

};


