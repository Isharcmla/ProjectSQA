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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class FunctionType_clearCachedValues_1343537339628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602548;
     Object term603225;

    public FunctionType_clearCachedValues_1343537339628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term602600 = new ArrayList();
        Class<? extends Object> term603233 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term603232 = ((Class) term603233).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term603232).setAccessible(true);
        Object enum980 = ((Field) term603232).get((Object) null);
        term602548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term602856 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setBooleanField(term602548, term602548.getClass(), "unknown", false);
        setField(term602548, term602548.getClass(), "subTypes", term602600);
        setBooleanField(term602548, term602548.getClass(), "nativeType", false);
        setField(term602548, term602548.getClass(), "kind", enum980);
        setBooleanField(term602856, term602856.getClass(), "unknown", false);
        setField(term602856, term602856.getClass(), "subTypes", null);
        setBooleanField(term602856, term602856.getClass(), "nativeType", true);
        setField(term602548, term602548.getClass(), "typeOfThis", term602856);
        Class<? extends Object> term603533 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term603532 = ((Class) term603533).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term603532).setAccessible(true);
        Object enum981 = ((Field) term603532).get((Object) null);
        ArrayList term603230 = new ArrayList();
        term603225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term603229 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term603225, term603225.getClass(), "this$0", null);
        setField(term603225, term603225.getClass(), "call", null);
        setField(term603225, term603225.getClass(), "prototypeSlot", null);
        setField(term603225, term603225.getClass(), "kind", enum981);
        setField(term603225, term603225.getClass(), "propAccess", null);
        setField(term603229, term603229.getClass(), "this$0", null);
        setField(term603229, term603229.getClass(), "call", null);
        setField(term603229, term603229.getClass(), "prototypeSlot", null);
        setField(term603229, term603229.getClass(), "kind", null);
        setField(term603229, term603229.getClass(), "propAccess", null);
        setField(term603229, term603229.getClass(), "typeOfThis", null);
        setField(term603229, term603229.getClass(), "source", null);
        setField(term603229, term603229.getClass(), "implementedInterfaces", null);
        setField(term603229, term603229.getClass(), "extendedInterfaces", null);
        setField(term603229, term603229.getClass(), "subTypes", null);
        setField(term603229, term603229.getClass(), "templateTypeNames", null);
        setField(term603229, term603229.getClass(), "className", null);
        setField(term603229, term603229.getClass(), "properties", null);
        setBooleanField(term603229, term603229.getClass(), "nativeType", true);
        setField(term603229, term603229.getClass(), "implicitPrototypeFallback", null);
        setField(term603229, term603229.getClass(), "ownerFunction", null);
        setBooleanField(term603229, term603229.getClass(), "prettyPrint", false);
        setBooleanField(term603229, term603229.getClass(), "visited", false);
        setField(term603229, term603229.getClass(), "docInfo", null);
        setBooleanField(term603229, term603229.getClass(), "unknown", true);
        setBooleanField(term603229, term603229.getClass(), "resolved", false);
        setField(term603229, term603229.getClass(), "resolveResult", null);
        setBooleanField(term603229, term603229.getClass(), "inTemplatedCheckVisit", false);
        setField(term603229, term603229.getClass(), "registry", null);
        setField(term603225, term603225.getClass(), "typeOfThis", term603229);
        setField(term603225, term603225.getClass(), "source", null);
        setField(term603225, term603225.getClass(), "implementedInterfaces", null);
        setField(term603225, term603225.getClass(), "extendedInterfaces", null);
        setField(term603225, term603225.getClass(), "subTypes", term603230);
        setField(term603225, term603225.getClass(), "templateTypeNames", null);
        setField(term603225, term603225.getClass(), "className", null);
        setField(term603225, term603225.getClass(), "properties", null);
        setBooleanField(term603225, term603225.getClass(), "nativeType", false);
        setField(term603225, term603225.getClass(), "implicitPrototypeFallback", null);
        setField(term603225, term603225.getClass(), "ownerFunction", null);
        setBooleanField(term603225, term603225.getClass(), "prettyPrint", false);
        setBooleanField(term603225, term603225.getClass(), "visited", false);
        setField(term603225, term603225.getClass(), "docInfo", null);
        setBooleanField(term603225, term603225.getClass(), "unknown", true);
        setBooleanField(term603225, term603225.getClass(), "resolved", false);
        setField(term603225, term603225.getClass(), "resolveResult", null);
        setBooleanField(term603225, term603225.getClass(), "inTemplatedCheckVisit", false);
        setField(term603225, term603225.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term602548, args);
        assertTrue(recursiveEquals(term602548, term603225));
    }

};


