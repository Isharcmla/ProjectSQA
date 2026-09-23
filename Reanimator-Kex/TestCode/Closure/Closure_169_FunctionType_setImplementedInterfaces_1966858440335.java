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

public class FunctionType_setImplementedInterfaces_1966858440335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306874;
     Object term307074;
     Object term307412;
     Object term307417;

    public FunctionType_setImplementedInterfaces_1966858440335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term307420 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term307419 = ((Class) term307420).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term307419).setAccessible(true);
        Object enum543 = ((Field) term307419).get((Object) null);
        term306874 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term306874, term306874.getClass(), "kind", enum543);
        term307074 = new ArrayList();
        Class<? extends Object> term307720 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term307719 = ((Class) term307720).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term307719).setAccessible(true);
        Object enum544 = ((Field) term307719).get((Object) null);
        term307412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term307416 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableList"));
        setField(term307412, term307412.getClass(), "call", null);
        setField(term307412, term307412.getClass(), "prototypeSlot", null);
        setField(term307412, term307412.getClass(), "kind", enum544);
        setField(term307412, term307412.getClass(), "propAccess", null);
        setField(term307412, term307412.getClass(), "typeOfThis", null);
        setField(term307412, term307412.getClass(), "source", null);
        setField(term307416, term307416.getClass(), "asList", null);
        setField(term307412, term307412.getClass(), "implementedInterfaces", term307416);
        setField(term307412, term307412.getClass(), "extendedInterfaces", null);
        setField(term307412, term307412.getClass(), "subTypes", null);
        setField(term307412, term307412.getClass(), "templateTypeNames", null);
        setField(term307412, term307412.getClass(), "className", null);
        setField(term307412, term307412.getClass(), "properties", null);
        setBooleanField(term307412, term307412.getClass(), "nativeType", false);
        setField(term307412, term307412.getClass(), "implicitPrototypeFallback", null);
        setField(term307412, term307412.getClass(), "ownerFunction", null);
        setBooleanField(term307412, term307412.getClass(), "prettyPrint", false);
        setBooleanField(term307412, term307412.getClass(), "visited", false);
        setField(term307412, term307412.getClass(), "docInfo", null);
        setBooleanField(term307412, term307412.getClass(), "unknown", false);
        setBooleanField(term307412, term307412.getClass(), "resolved", false);
        setField(term307412, term307412.getClass(), "resolveResult", null);
        setBooleanField(term307412, term307412.getClass(), "inTemplatedCheckVisit", false);
        setField(term307412, term307412.getClass(), "registry", null);
        term307417 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term307074;
        callMethod(klass, "setImplementedInterfaces", argTypes, term306874, args);
        assertTrue(recursiveEquals(term306874, term307412));
        assertTrue(recursiveEquals(term307074, term307417));
    }

};


