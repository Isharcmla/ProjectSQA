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

public class FunctionType_clearCachedValues_1343537339327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299749;
     Object term300371;

    public FunctionType_clearCachedValues_1343537339327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term300377 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term300376 = ((Class) term300377).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term300376).setAccessible(true);
        Object enum529 = ((Field) term300376).get((Object) null);
        term299749 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term300011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setBooleanField(term299749, term299749.getClass(), "unknown", false);
        setField(term299749, term299749.getClass(), "subTypes", null);
        setBooleanField(term299749, term299749.getClass(), "nativeType", false);
        setField(term299749, term299749.getClass(), "kind", enum529);
        setField(term299749, term299749.getClass(), "typeOfThis", term300011);
        Class<? extends Object> term300677 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term300676 = ((Class) term300677).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term300676).setAccessible(true);
        Object enum530 = ((Field) term300676).get((Object) null);
        term300371 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term300375 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term300371, term300371.getClass(), "call", null);
        setField(term300371, term300371.getClass(), "prototypeSlot", null);
        setField(term300371, term300371.getClass(), "kind", enum530);
        setField(term300371, term300371.getClass(), "propAccess", null);
        setField(term300375, term300375.getClass(), "className", null);
        setField(term300375, term300375.getClass(), "properties", null);
        setBooleanField(term300375, term300375.getClass(), "nativeType", false);
        setField(term300375, term300375.getClass(), "implicitPrototypeFallback", null);
        setField(term300375, term300375.getClass(), "ownerFunction", null);
        setBooleanField(term300375, term300375.getClass(), "prettyPrint", false);
        setBooleanField(term300375, term300375.getClass(), "visited", false);
        setField(term300375, term300375.getClass(), "docInfo", null);
        setBooleanField(term300375, term300375.getClass(), "unknown", true);
        setBooleanField(term300375, term300375.getClass(), "resolved", false);
        setField(term300375, term300375.getClass(), "resolveResult", null);
        setBooleanField(term300375, term300375.getClass(), "inTemplatedCheckVisit", false);
        setField(term300375, term300375.getClass(), "registry", null);
        setField(term300371, term300371.getClass(), "typeOfThis", term300375);
        setField(term300371, term300371.getClass(), "source", null);
        setField(term300371, term300371.getClass(), "implementedInterfaces", null);
        setField(term300371, term300371.getClass(), "extendedInterfaces", null);
        setField(term300371, term300371.getClass(), "subTypes", null);
        setField(term300371, term300371.getClass(), "templateTypeNames", null);
        setField(term300371, term300371.getClass(), "className", null);
        setField(term300371, term300371.getClass(), "properties", null);
        setBooleanField(term300371, term300371.getClass(), "nativeType", false);
        setField(term300371, term300371.getClass(), "implicitPrototypeFallback", null);
        setField(term300371, term300371.getClass(), "ownerFunction", null);
        setBooleanField(term300371, term300371.getClass(), "prettyPrint", false);
        setBooleanField(term300371, term300371.getClass(), "visited", false);
        setField(term300371, term300371.getClass(), "docInfo", null);
        setBooleanField(term300371, term300371.getClass(), "unknown", true);
        setBooleanField(term300371, term300371.getClass(), "resolved", false);
        setField(term300371, term300371.getClass(), "resolveResult", null);
        setBooleanField(term300371, term300371.getClass(), "inTemplatedCheckVisit", false);
        setField(term300371, term300371.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term299749, args);
        assertTrue(recursiveEquals(term299749, term300371));
    }

};


