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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_isNullable_176165855250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term671;

    public UnionType_isNullable_176165855250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term672 = new ArrayList();
        ((ArrayList) term672).add((Object)null);
        ((ArrayList) term672).add((Object)null);
        ((ArrayList) term672).add((Object)null);
        ((ArrayList) term672).add((Object)null);
        ((ArrayList) term672).add((Object)null);
        HashMap term681 = new HashMap();
        HashMap term690 = new HashMap();
        Set<Object> term5364 =  ((Map) term690).keySet();
        HashSet term689 = new HashSet((Collection<? extends Object>) term5364);
        HashMap term697 = new HashMap();
        Set<Object> term5365 =  ((Map) term697).keySet();
        HashSet term696 = new HashSet((Collection<? extends Object>) term5365);
        HashMap term703 = new HashMap();
        Set<Object> term5366 =  ((Map) term703).keySet();
        HashSet term702 = new HashSet((Collection<? extends Object>) term5366);
        HashMap term709 = new HashMap();
        HashMap term717 = new HashMap();
        HashMap term722 = new HashMap();
        term671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term679 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term680 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term671, term671.getClass(), "alternates", term672);
        setIntField(term671, term671.getClass(), "hashcode", -1588772968);
        setBooleanField(term671, term671.getClass(), "resolved", true);
        setField(term671, term671.getClass(), "resolveResult", null);
        setBooleanField(term671, term671.getClass(), "inTemplatedCheckVisit", true);
        setField(term679, term679.getClass(), "reporter", null);
        setField(term679, term679.getClass(), "nativeTypes", term680);
        setField(term679, term679.getClass(), "namesToTypes", term681);
        setField(term679, term679.getClass(), "namespaces", term689);
        setField(term679, term679.getClass(), "nonNullableTypeNames", term696);
        setField(term679, term679.getClass(), "forwardDeclaredTypes", term702);
        setField(term679, term679.getClass(), "typesIndexedByProperty", term709);
        setField(term679, term679.getClass(), "eachRefTypeIndexedByProperty", term717);
        setField(term679, term679.getClass(), "greatestSubtypeByProperty", term722);
        setField(term679, term679.getClass(), "interfaceToImplementors", null);
        setField(term679, term679.getClass(), "unresolvedNamedTypes", null);
        setField(term679, term679.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term679, term679.getClass(), "lastGeneration", false);
        setField(term679, term679.getClass(), "templateTypes", null);
        setBooleanField(term679, term679.getClass(), "tolerateUndefinedValues", false);
        setField(term679, term679.getClass(), "resolveMode", null);
        setField(term671, term671.getClass(), "registry", term679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isNullable", argTypes, term671, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


