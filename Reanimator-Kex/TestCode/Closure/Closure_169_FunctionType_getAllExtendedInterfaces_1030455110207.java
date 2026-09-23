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
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class FunctionType_getAllExtendedInterfaces_1030455110207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105198;
     Object term227200;
     Object term227193;

    public FunctionType_getAllExtendedInterfaces_1030455110207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term105250 = new ArrayList();
        term105198 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term105198, term105198.getClass(), "extendedInterfaces", term105250);
        ArrayList term227201 = new ArrayList();
        term227200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term227200, term227200.getClass(), "call", null);
        setField(term227200, term227200.getClass(), "prototypeSlot", null);
        setField(term227200, term227200.getClass(), "kind", null);
        setField(term227200, term227200.getClass(), "propAccess", null);
        setField(term227200, term227200.getClass(), "typeOfThis", null);
        setField(term227200, term227200.getClass(), "source", null);
        setField(term227200, term227200.getClass(), "implementedInterfaces", null);
        setField(term227200, term227200.getClass(), "extendedInterfaces", term227201);
        setField(term227200, term227200.getClass(), "subTypes", null);
        setField(term227200, term227200.getClass(), "templateTypeNames", null);
        setField(term227200, term227200.getClass(), "className", null);
        setField(term227200, term227200.getClass(), "properties", null);
        setBooleanField(term227200, term227200.getClass(), "nativeType", false);
        setField(term227200, term227200.getClass(), "implicitPrototypeFallback", null);
        setField(term227200, term227200.getClass(), "ownerFunction", null);
        setBooleanField(term227200, term227200.getClass(), "prettyPrint", false);
        setBooleanField(term227200, term227200.getClass(), "visited", false);
        setField(term227200, term227200.getClass(), "docInfo", null);
        setBooleanField(term227200, term227200.getClass(), "unknown", false);
        setBooleanField(term227200, term227200.getClass(), "resolved", false);
        setField(term227200, term227200.getClass(), "resolveResult", null);
        setBooleanField(term227200, term227200.getClass(), "inTemplatedCheckVisit", false);
        setField(term227200, term227200.getClass(), "registry", null);
        LinkedHashMap term227194 = new LinkedHashMap();
        Set<Object> term227203 =  ((Map) term227194).keySet();
        term227193 = new LinkedHashSet((Collection<? extends Object>) term227203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllExtendedInterfaces", argTypes, term105198, args);
        assertTrue(recursiveEquals(term105198, term227200));
        assertTrue(recursiveEquals(retValue, term227193));
    }

};


