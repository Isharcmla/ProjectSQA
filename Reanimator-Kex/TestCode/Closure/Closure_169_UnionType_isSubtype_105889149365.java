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

public class UnionType_isSubtype_105889149365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1735;

    public UnionType_isSubtype_105889149365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1736 = new ArrayList();
        HashMap term1745 = new HashMap();
        HashMap term1754 = new HashMap();
        Set<Object> term8922 =  ((Map) term1754).keySet();
        HashSet term1753 = new HashSet((Collection<? extends Object>) term8922);
        HashMap term1761 = new HashMap();
        Set<Object> term8923 =  ((Map) term1761).keySet();
        HashSet term1760 = new HashSet((Collection<? extends Object>) term8923);
        HashMap term1768 = new HashMap();
        Set<Object> term8924 =  ((Map) term1768).keySet();
        HashSet term1767 = new HashSet((Collection<? extends Object>) term8924);
        HashMap term1774 = new HashMap();
        HashMap term1782 = new HashMap();
        HashMap term1787 = new HashMap();
        term1735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1744 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1735, term1735.getClass(), "alternates", term1736);
        setIntField(term1735, term1735.getClass(), "hashcode", 1398204340);
        setBooleanField(term1735, term1735.getClass(), "resolved", false);
        setField(term1735, term1735.getClass(), "resolveResult", null);
        setBooleanField(term1735, term1735.getClass(), "inTemplatedCheckVisit", false);
        setField(term1743, term1743.getClass(), "reporter", null);
        setField(term1743, term1743.getClass(), "nativeTypes", term1744);
        setField(term1743, term1743.getClass(), "namesToTypes", term1745);
        setField(term1743, term1743.getClass(), "namespaces", term1753);
        setField(term1743, term1743.getClass(), "nonNullableTypeNames", term1760);
        setField(term1743, term1743.getClass(), "forwardDeclaredTypes", term1767);
        setField(term1743, term1743.getClass(), "typesIndexedByProperty", term1774);
        setField(term1743, term1743.getClass(), "eachRefTypeIndexedByProperty", term1782);
        setField(term1743, term1743.getClass(), "greatestSubtypeByProperty", term1787);
        setField(term1743, term1743.getClass(), "interfaceToImplementors", null);
        setField(term1743, term1743.getClass(), "unresolvedNamedTypes", null);
        setField(term1743, term1743.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1743, term1743.getClass(), "lastGeneration", false);
        setField(term1743, term1743.getClass(), "templateTypes", null);
        setBooleanField(term1743, term1743.getClass(), "tolerateUndefinedValues", false);
        setField(term1743, term1743.getClass(), "resolveMode", null);
        setField(term1735, term1735.getClass(), "registry", term1743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isSubtype", argTypes, term1735, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


