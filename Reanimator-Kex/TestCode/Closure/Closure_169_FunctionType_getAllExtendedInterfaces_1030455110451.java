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
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class FunctionType_getAllExtendedInterfaces_1030455110451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414267;
     Object term414468;
     Object term414460;

    public FunctionType_getAllExtendedInterfaces_1030455110451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term414413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        ArrayList term414319 = new ArrayList();
        ((ArrayList) term414319).add(term414413);
        term414267 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term414267, term414267.getClass(), "extendedInterfaces", term414319);
        Object term414471 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term414471, term414471.getClass(), "reference", null);
        setField(term414471, term414471.getClass(), "sourceName", null);
        setIntField(term414471, term414471.getClass(), "lineno", 0);
        setIntField(term414471, term414471.getClass(), "charno", 0);
        setField(term414471, term414471.getClass(), "validator", null);
        setField(term414471, term414471.getClass(), "propertyContinuations", null);
        setField(term414471, term414471.getClass(), "referencedType", null);
        setField(term414471, term414471.getClass(), "referencedObjType", null);
        setBooleanField(term414471, term414471.getClass(), "visited", false);
        setField(term414471, term414471.getClass(), "docInfo", null);
        setBooleanField(term414471, term414471.getClass(), "unknown", false);
        setBooleanField(term414471, term414471.getClass(), "resolved", false);
        setField(term414471, term414471.getClass(), "resolveResult", null);
        setBooleanField(term414471, term414471.getClass(), "inTemplatedCheckVisit", false);
        setField(term414471, term414471.getClass(), "registry", null);
        ArrayList term414469 = new ArrayList();
        ((ArrayList) term414469).add(term414471);
        term414468 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term414468, term414468.getClass(), "call", null);
        setField(term414468, term414468.getClass(), "prototypeSlot", null);
        setField(term414468, term414468.getClass(), "kind", null);
        setField(term414468, term414468.getClass(), "propAccess", null);
        setField(term414468, term414468.getClass(), "typeOfThis", null);
        setField(term414468, term414468.getClass(), "source", null);
        setField(term414468, term414468.getClass(), "implementedInterfaces", null);
        setField(term414468, term414468.getClass(), "extendedInterfaces", term414469);
        setField(term414468, term414468.getClass(), "subTypes", null);
        setField(term414468, term414468.getClass(), "templateTypeNames", null);
        setField(term414468, term414468.getClass(), "className", null);
        setField(term414468, term414468.getClass(), "properties", null);
        setBooleanField(term414468, term414468.getClass(), "nativeType", false);
        setField(term414468, term414468.getClass(), "implicitPrototypeFallback", null);
        setField(term414468, term414468.getClass(), "ownerFunction", null);
        setBooleanField(term414468, term414468.getClass(), "prettyPrint", false);
        setBooleanField(term414468, term414468.getClass(), "visited", false);
        setField(term414468, term414468.getClass(), "docInfo", null);
        setBooleanField(term414468, term414468.getClass(), "unknown", false);
        setBooleanField(term414468, term414468.getClass(), "resolved", false);
        setField(term414468, term414468.getClass(), "resolveResult", null);
        setBooleanField(term414468, term414468.getClass(), "inTemplatedCheckVisit", false);
        setField(term414468, term414468.getClass(), "registry", null);
        LinkedHashMap term414461 = new LinkedHashMap();
        Set<Object> term414472 =  ((Map) term414461).keySet();
        term414460 = new LinkedHashSet((Collection<? extends Object>) term414472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllExtendedInterfaces", argTypes, term414267, args);
        assertTrue(recursiveEquals(term414267, term414468));
        assertTrue(recursiveEquals(retValue, term414460));
    }

};


