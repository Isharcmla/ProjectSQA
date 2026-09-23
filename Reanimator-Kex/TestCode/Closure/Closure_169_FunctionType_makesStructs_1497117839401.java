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

public class FunctionType_makesStructs_1497117839401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369205;
     Object term370408;

    public FunctionType_makesStructs_1497117839401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term370419 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term370418 = ((Class) term370419).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term370418).setAccessible(true);
        Object enum623 = ((Field) term370418).get((Object) null);
        Class<? extends Object> term370719 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term370718 = ((Class) term370719).getDeclaredField((String) "ANY");
        ((Field) term370718).setAccessible(true);
        Object enum624 = ((Field) term370718).get((Object) null);
        term369205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term369627 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term369727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term369205, term369205.getClass(), "kind", enum623);
        setField(term369205, term369205.getClass(), "propAccess", enum624);
        setField(term369627, term369627.getClass(), "type", term369727);
        setField(term369205, term369205.getClass(), "prototypeSlot", term369627);
        Class<? extends Object> term371025 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term371024 = ((Class) term371025).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term371024).setAccessible(true);
        Object enum625 = ((Field) term371024).get((Object) null);
        Class<? extends Object> term371325 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term371324 = ((Class) term371325).getDeclaredField((String) "ANY");
        ((Field) term371324).setAccessible(true);
        Object enum626 = ((Field) term371324).get((Object) null);
        term370408 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term370409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term370410 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term370408, term370408.getClass(), "call", null);
        setField(term370409, term370409.getClass(), "name", null);
        setField(term370410, term370410.getClass(), "call", null);
        setField(term370410, term370410.getClass(), "prototypeSlot", null);
        setField(term370410, term370410.getClass(), "kind", null);
        setField(term370410, term370410.getClass(), "propAccess", null);
        setField(term370410, term370410.getClass(), "typeOfThis", null);
        setField(term370410, term370410.getClass(), "source", null);
        setField(term370410, term370410.getClass(), "implementedInterfaces", null);
        setField(term370410, term370410.getClass(), "extendedInterfaces", null);
        setField(term370410, term370410.getClass(), "subTypes", null);
        setField(term370410, term370410.getClass(), "templateTypeNames", null);
        setField(term370410, term370410.getClass(), "className", null);
        setField(term370410, term370410.getClass(), "properties", null);
        setBooleanField(term370410, term370410.getClass(), "nativeType", false);
        setField(term370410, term370410.getClass(), "implicitPrototypeFallback", null);
        setField(term370410, term370410.getClass(), "ownerFunction", null);
        setBooleanField(term370410, term370410.getClass(), "prettyPrint", false);
        setBooleanField(term370410, term370410.getClass(), "visited", false);
        setField(term370410, term370410.getClass(), "docInfo", null);
        setBooleanField(term370410, term370410.getClass(), "unknown", false);
        setBooleanField(term370410, term370410.getClass(), "resolved", false);
        setField(term370410, term370410.getClass(), "resolveResult", null);
        setBooleanField(term370410, term370410.getClass(), "inTemplatedCheckVisit", false);
        setField(term370410, term370410.getClass(), "registry", null);
        setField(term370409, term370409.getClass(), "type", term370410);
        setBooleanField(term370409, term370409.getClass(), "inferred", false);
        setField(term370409, term370409.getClass(), "propertyNode", null);
        setField(term370409, term370409.getClass(), "docInfo", null);
        setField(term370408, term370408.getClass(), "prototypeSlot", term370409);
        setField(term370408, term370408.getClass(), "kind", enum625);
        setField(term370408, term370408.getClass(), "propAccess", enum626);
        setField(term370408, term370408.getClass(), "typeOfThis", null);
        setField(term370408, term370408.getClass(), "source", null);
        setField(term370408, term370408.getClass(), "implementedInterfaces", null);
        setField(term370408, term370408.getClass(), "extendedInterfaces", null);
        setField(term370408, term370408.getClass(), "subTypes", null);
        setField(term370408, term370408.getClass(), "templateTypeNames", null);
        setField(term370408, term370408.getClass(), "className", null);
        setField(term370408, term370408.getClass(), "properties", null);
        setBooleanField(term370408, term370408.getClass(), "nativeType", false);
        setField(term370408, term370408.getClass(), "implicitPrototypeFallback", null);
        setField(term370408, term370408.getClass(), "ownerFunction", null);
        setBooleanField(term370408, term370408.getClass(), "prettyPrint", false);
        setBooleanField(term370408, term370408.getClass(), "visited", false);
        setField(term370408, term370408.getClass(), "docInfo", null);
        setBooleanField(term370408, term370408.getClass(), "unknown", false);
        setBooleanField(term370408, term370408.getClass(), "resolved", false);
        setField(term370408, term370408.getClass(), "resolveResult", null);
        setBooleanField(term370408, term370408.getClass(), "inTemplatedCheckVisit", false);
        setField(term370408, term370408.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "makesStructs", argTypes, term369205, args);
        assertTrue(recursiveEquals(term369205, term370408));
        assertTrue(recursiveEquals(retValue, false));
    }

};


