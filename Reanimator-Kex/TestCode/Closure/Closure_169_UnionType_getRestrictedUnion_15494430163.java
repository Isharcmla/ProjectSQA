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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_getRestrictedUnion_15494430163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1603;

    public UnionType_getRestrictedUnion_15494430163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1604 = new ArrayList();
        HashMap term1613 = new HashMap();
        HashMap term1622 = new HashMap();
        Set<Object> term8592 =  ((Map) term1622).keySet();
        HashSet term1621 = new HashSet((Collection<? extends Object>) term8592);
        HashMap term1629 = new HashMap();
        Set<Object> term8593 =  ((Map) term1629).keySet();
        HashSet term1628 = new HashSet((Collection<? extends Object>) term8593);
        HashMap term1636 = new HashMap();
        Set<Object> term8594 =  ((Map) term1636).keySet();
        HashSet term1635 = new HashSet((Collection<? extends Object>) term8594);
        HashMap term1642 = new HashMap();
        HashMap term1650 = new HashMap();
        HashMap term1655 = new HashMap();
        term1603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1611 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1612 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1603, term1603.getClass(), "alternates", term1604);
        setIntField(term1603, term1603.getClass(), "hashcode", -1697741339);
        setBooleanField(term1603, term1603.getClass(), "resolved", true);
        setField(term1603, term1603.getClass(), "resolveResult", null);
        setBooleanField(term1603, term1603.getClass(), "inTemplatedCheckVisit", true);
        setField(term1611, term1611.getClass(), "reporter", null);
        setField(term1611, term1611.getClass(), "nativeTypes", term1612);
        setField(term1611, term1611.getClass(), "namesToTypes", term1613);
        setField(term1611, term1611.getClass(), "namespaces", term1621);
        setField(term1611, term1611.getClass(), "nonNullableTypeNames", term1628);
        setField(term1611, term1611.getClass(), "forwardDeclaredTypes", term1635);
        setField(term1611, term1611.getClass(), "typesIndexedByProperty", term1642);
        setField(term1611, term1611.getClass(), "eachRefTypeIndexedByProperty", term1650);
        setField(term1611, term1611.getClass(), "greatestSubtypeByProperty", term1655);
        setField(term1611, term1611.getClass(), "interfaceToImplementors", null);
        setField(term1611, term1611.getClass(), "unresolvedNamedTypes", null);
        setField(term1611, term1611.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1611, term1611.getClass(), "lastGeneration", false);
        setField(term1611, term1611.getClass(), "templateTypes", null);
        setBooleanField(term1611, term1611.getClass(), "tolerateUndefinedValues", false);
        setField(term1611, term1611.getClass(), "resolveMode", null);
        setField(term1603, term1603.getClass(), "registry", term1611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getRestrictedUnion", argTypes, term1603, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


