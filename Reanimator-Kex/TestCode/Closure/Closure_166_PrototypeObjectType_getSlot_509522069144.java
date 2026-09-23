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
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class PrototypeObjectType_getSlot_509522069144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25863;
     Object term26276;

    public PrototypeObjectType_getSlot_509522069144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26001 = newInstance(Class.forName("java.lang.Object"));
        HashMap term25911 = new HashMap();
        ((HashMap) term25911).put(term26001, term26001);
        ArrayList term26205 = new ArrayList();
        term25863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term26153 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term25863, term25863.getClass(), "properties", term25911);
        setField(term25863, term25863.getClass(), "implicitPrototypeFallback", null);
        setField(term26153, term26153.getClass(), "extendedInterfaces", term26205);
        setField(term25863, term25863.getClass(), "ownerFunction", term26153);
        HashMap term26277 = new HashMap();
        ArrayList term26282 = new ArrayList();
        term26276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term26281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term26276, term26276.getClass(), "className", null);
        setField(term26276, term26276.getClass(), "properties", term26277);
        setBooleanField(term26276, term26276.getClass(), "nativeType", false);
        setField(term26276, term26276.getClass(), "implicitPrototypeFallback", null);
        setField(term26281, term26281.getClass(), "call", null);
        setField(term26281, term26281.getClass(), "prototypeSlot", null);
        setField(term26281, term26281.getClass(), "kind", null);
        setField(term26281, term26281.getClass(), "typeOfThis", null);
        setField(term26281, term26281.getClass(), "source", null);
        setField(term26281, term26281.getClass(), "implementedInterfaces", null);
        setField(term26281, term26281.getClass(), "extendedInterfaces", term26282);
        setField(term26281, term26281.getClass(), "subTypes", null);
        setField(term26281, term26281.getClass(), "templateTypeNames", null);
        setField(term26281, term26281.getClass(), "className", null);
        setField(term26281, term26281.getClass(), "properties", null);
        setBooleanField(term26281, term26281.getClass(), "nativeType", false);
        setField(term26281, term26281.getClass(), "implicitPrototypeFallback", null);
        setField(term26281, term26281.getClass(), "ownerFunction", null);
        setBooleanField(term26281, term26281.getClass(), "prettyPrint", false);
        setBooleanField(term26281, term26281.getClass(), "visited", false);
        setField(term26281, term26281.getClass(), "docInfo", null);
        setBooleanField(term26281, term26281.getClass(), "unknown", false);
        setBooleanField(term26281, term26281.getClass(), "resolved", false);
        setField(term26281, term26281.getClass(), "resolveResult", null);
        setBooleanField(term26281, term26281.getClass(), "inTemplatedCheckVisit", false);
        setField(term26281, term26281.getClass(), "registry", null);
        setField(term26276, term26276.getClass(), "ownerFunction", term26281);
        setBooleanField(term26276, term26276.getClass(), "prettyPrint", false);
        setBooleanField(term26276, term26276.getClass(), "visited", false);
        setField(term26276, term26276.getClass(), "docInfo", null);
        setBooleanField(term26276, term26276.getClass(), "unknown", false);
        setBooleanField(term26276, term26276.getClass(), "resolved", false);
        setField(term26276, term26276.getClass(), "resolveResult", null);
        setBooleanField(term26276, term26276.getClass(), "inTemplatedCheckVisit", false);
        setField(term26276, term26276.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getSlot", argTypes, term25863, args);
        assertTrue(recursiveEquals(term25863, term26276));
        assertTrue(recursiveEquals(retValue, null));
    }

};


