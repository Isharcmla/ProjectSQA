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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;

public class UnionType_toStringHelper_131985412664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1668;
     Object term1730;
     Object term8651;

    public UnionType_toStringHelper_131985412664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1669 = new ArrayList();
        HashMap term1678 = new HashMap();
        HashMap term1687 = new HashMap();
        Set<Object> term8666 =  ((Map) term1687).keySet();
        HashSet term1686 = new HashSet((Collection<? extends Object>) term8666);
        HashMap term1694 = new HashMap();
        Set<Object> term8667 =  ((Map) term1694).keySet();
        HashSet term1693 = new HashSet((Collection<? extends Object>) term8667);
        HashMap term1701 = new HashMap();
        Set<Object> term8668 =  ((Map) term1701).keySet();
        HashSet term1700 = new HashSet((Collection<? extends Object>) term8668);
        HashMap term1707 = new HashMap();
        HashMap term1715 = new HashMap();
        HashMap term1720 = new HashMap();
        term1668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1676 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1677 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term1668, term1668.getClass(), "alternates", term1669);
        setIntField(term1668, term1668.getClass(), "hashcode", 1830648570);
        setBooleanField(term1668, term1668.getClass(), "resolved", false);
        setField(term1668, term1668.getClass(), "resolveResult", null);
        setBooleanField(term1668, term1668.getClass(), "inTemplatedCheckVisit", false);
        setField(term1676, term1676.getClass(), "reporter", null);
        setField(term1676, term1676.getClass(), "nativeTypes", term1677);
        setField(term1676, term1676.getClass(), "namesToTypes", term1678);
        setField(term1676, term1676.getClass(), "namespaces", term1686);
        setField(term1676, term1676.getClass(), "nonNullableTypeNames", term1693);
        setField(term1676, term1676.getClass(), "forwardDeclaredTypes", term1700);
        setField(term1676, term1676.getClass(), "typesIndexedByProperty", term1707);
        setField(term1676, term1676.getClass(), "eachRefTypeIndexedByProperty", term1715);
        setField(term1676, term1676.getClass(), "greatestSubtypeByProperty", term1720);
        setField(term1676, term1676.getClass(), "interfaceToImplementors", null);
        setField(term1676, term1676.getClass(), "unresolvedNamedTypes", null);
        setField(term1676, term1676.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1676, term1676.getClass(), "lastGeneration", false);
        setField(term1676, term1676.getClass(), "templateTypes", null);
        setBooleanField(term1676, term1676.getClass(), "tolerateUndefinedValues", false);
        setField(term1676, term1676.getClass(), "resolveMode", null);
        setField(term1668, term1668.getClass(), "registry", term1676);
        term1730 = new Boolean(false);
        ArrayList term8652 = new ArrayList();
        HashMap term8656 = new HashMap();
        HashMap term8658 = new HashMap();
        Set<Object> term8669 =  ((Map) term8658).keySet();
        HashSet term8657 = new HashSet((Collection<? extends Object>) term8669);
        HashMap term8660 = new HashMap();
        Set<Object> term8670 =  ((Map) term8660).keySet();
        HashSet term8659 = new HashSet((Collection<? extends Object>) term8670);
        HashMap term8662 = new HashMap();
        Set<Object> term8671 =  ((Map) term8662).keySet();
        HashSet term8661 = new HashSet((Collection<? extends Object>) term8671);
        HashMap term8663 = new HashMap();
        HashMap term8664 = new HashMap();
        HashMap term8665 = new HashMap();
        term8651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term8654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8655 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term8651, term8651.getClass(), "alternates", term8652);
        setIntField(term8651, term8651.getClass(), "hashcode", 1830648570);
        setBooleanField(term8651, term8651.getClass(), "resolved", false);
        setField(term8651, term8651.getClass(), "resolveResult", null);
        setBooleanField(term8651, term8651.getClass(), "inTemplatedCheckVisit", false);
        setField(term8654, term8654.getClass(), "reporter", null);
        setField(term8654, term8654.getClass(), "nativeTypes", term8655);
        setField(term8654, term8654.getClass(), "namesToTypes", term8656);
        setField(term8654, term8654.getClass(), "namespaces", term8657);
        setField(term8654, term8654.getClass(), "nonNullableTypeNames", term8659);
        setField(term8654, term8654.getClass(), "forwardDeclaredTypes", term8661);
        setField(term8654, term8654.getClass(), "typesIndexedByProperty", term8663);
        setField(term8654, term8654.getClass(), "eachRefTypeIndexedByProperty", term8664);
        setField(term8654, term8654.getClass(), "greatestSubtypeByProperty", term8665);
        setField(term8654, term8654.getClass(), "interfaceToImplementors", null);
        setField(term8654, term8654.getClass(), "unresolvedNamedTypes", null);
        setField(term8654, term8654.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8654, term8654.getClass(), "lastGeneration", false);
        setField(term8654, term8654.getClass(), "templateTypes", null);
        setBooleanField(term8654, term8654.getClass(), "tolerateUndefinedValues", false);
        setField(term8654, term8654.getClass(), "resolveMode", null);
        setField(term8651, term8651.getClass(), "registry", term8654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1730;
        Object retValue = callMethod(klass, "toStringHelper", argTypes, term1668, args);
        assertTrue(recursiveEquals(term1668, term8651));
        assertTrue(recursiveEquals(term1730, false));
        assertTrue(recursiveEquals(retValue, "()"));
    }

};


