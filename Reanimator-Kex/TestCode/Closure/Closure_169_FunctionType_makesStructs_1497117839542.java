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

public class FunctionType_makesStructs_1497117839542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term515482;
     Object term516841;

    public FunctionType_makesStructs_1497117839542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term516853 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term516852 = ((Class) term516853).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term516852).setAccessible(true);
        Object enum846 = ((Field) term516852).get((Object) null);
        Class<? extends Object> term517153 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term517152 = ((Class) term517153).getDeclaredField((String) "DICT");
        ((Field) term517152).setAccessible(true);
        Object enum847 = ((Field) term517152).get((Object) null);
        term515482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term515904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term516004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term516114 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term515482, term515482.getClass(), "kind", enum846);
        setField(term515482, term515482.getClass(), "propAccess", enum847);
        setField(term516004, term516004.getClass(), "implicitPrototypeFallback", term516114);
        setField(term515904, term515904.getClass(), "type", term516004);
        setField(term515482, term515482.getClass(), "prototypeSlot", term515904);
        Class<? extends Object> term517462 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term517461 = ((Class) term517462).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term517461).setAccessible(true);
        Object enum848 = ((Field) term517461).get((Object) null);
        Class<? extends Object> term517762 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term517761 = ((Class) term517762).getDeclaredField((String) "DICT");
        ((Field) term517761).setAccessible(true);
        Object enum849 = ((Field) term517761).get((Object) null);
        term516841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term516842 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term516843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term516844 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term516841, term516841.getClass(), "call", null);
        setField(term516842, term516842.getClass(), "name", null);
        setField(term516843, term516843.getClass(), "call", null);
        setField(term516843, term516843.getClass(), "prototypeSlot", null);
        setField(term516843, term516843.getClass(), "kind", null);
        setField(term516843, term516843.getClass(), "propAccess", null);
        setField(term516843, term516843.getClass(), "typeOfThis", null);
        setField(term516843, term516843.getClass(), "source", null);
        setField(term516843, term516843.getClass(), "implementedInterfaces", null);
        setField(term516843, term516843.getClass(), "extendedInterfaces", null);
        setField(term516843, term516843.getClass(), "subTypes", null);
        setField(term516843, term516843.getClass(), "templateTypeNames", null);
        setField(term516843, term516843.getClass(), "className", null);
        setField(term516843, term516843.getClass(), "properties", null);
        setBooleanField(term516843, term516843.getClass(), "nativeType", false);
        setField(term516844, term516844.getClass(), "call", null);
        setField(term516844, term516844.getClass(), "prototypeSlot", null);
        setField(term516844, term516844.getClass(), "kind", null);
        setField(term516844, term516844.getClass(), "propAccess", null);
        setField(term516844, term516844.getClass(), "typeOfThis", null);
        setField(term516844, term516844.getClass(), "source", null);
        setField(term516844, term516844.getClass(), "implementedInterfaces", null);
        setField(term516844, term516844.getClass(), "extendedInterfaces", null);
        setField(term516844, term516844.getClass(), "subTypes", null);
        setField(term516844, term516844.getClass(), "templateTypeNames", null);
        setField(term516844, term516844.getClass(), "className", null);
        setField(term516844, term516844.getClass(), "properties", null);
        setBooleanField(term516844, term516844.getClass(), "nativeType", false);
        setField(term516844, term516844.getClass(), "implicitPrototypeFallback", null);
        setField(term516844, term516844.getClass(), "ownerFunction", null);
        setBooleanField(term516844, term516844.getClass(), "prettyPrint", false);
        setBooleanField(term516844, term516844.getClass(), "visited", false);
        setField(term516844, term516844.getClass(), "docInfo", null);
        setBooleanField(term516844, term516844.getClass(), "unknown", false);
        setBooleanField(term516844, term516844.getClass(), "resolved", false);
        setField(term516844, term516844.getClass(), "resolveResult", null);
        setBooleanField(term516844, term516844.getClass(), "inTemplatedCheckVisit", false);
        setField(term516844, term516844.getClass(), "registry", null);
        setField(term516843, term516843.getClass(), "implicitPrototypeFallback", term516844);
        setField(term516843, term516843.getClass(), "ownerFunction", null);
        setBooleanField(term516843, term516843.getClass(), "prettyPrint", false);
        setBooleanField(term516843, term516843.getClass(), "visited", false);
        setField(term516843, term516843.getClass(), "docInfo", null);
        setBooleanField(term516843, term516843.getClass(), "unknown", false);
        setBooleanField(term516843, term516843.getClass(), "resolved", false);
        setField(term516843, term516843.getClass(), "resolveResult", null);
        setBooleanField(term516843, term516843.getClass(), "inTemplatedCheckVisit", false);
        setField(term516843, term516843.getClass(), "registry", null);
        setField(term516842, term516842.getClass(), "type", term516843);
        setBooleanField(term516842, term516842.getClass(), "inferred", false);
        setField(term516842, term516842.getClass(), "propertyNode", null);
        setField(term516842, term516842.getClass(), "docInfo", null);
        setField(term516841, term516841.getClass(), "prototypeSlot", term516842);
        setField(term516841, term516841.getClass(), "kind", enum848);
        setField(term516841, term516841.getClass(), "propAccess", enum849);
        setField(term516841, term516841.getClass(), "typeOfThis", null);
        setField(term516841, term516841.getClass(), "source", null);
        setField(term516841, term516841.getClass(), "implementedInterfaces", null);
        setField(term516841, term516841.getClass(), "extendedInterfaces", null);
        setField(term516841, term516841.getClass(), "subTypes", null);
        setField(term516841, term516841.getClass(), "templateTypeNames", null);
        setField(term516841, term516841.getClass(), "className", null);
        setField(term516841, term516841.getClass(), "properties", null);
        setBooleanField(term516841, term516841.getClass(), "nativeType", false);
        setField(term516841, term516841.getClass(), "implicitPrototypeFallback", null);
        setField(term516841, term516841.getClass(), "ownerFunction", null);
        setBooleanField(term516841, term516841.getClass(), "prettyPrint", false);
        setBooleanField(term516841, term516841.getClass(), "visited", false);
        setField(term516841, term516841.getClass(), "docInfo", null);
        setBooleanField(term516841, term516841.getClass(), "unknown", false);
        setBooleanField(term516841, term516841.getClass(), "resolved", false);
        setField(term516841, term516841.getClass(), "resolveResult", null);
        setBooleanField(term516841, term516841.getClass(), "inTemplatedCheckVisit", false);
        setField(term516841, term516841.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "makesStructs", argTypes, term515482, args);
        assertTrue(recursiveEquals(term515482, term516841));
        assertTrue(recursiveEquals(retValue, false));
    }

};


