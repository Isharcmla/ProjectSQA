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

public class UnionType_getAlternates_35218345840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2992;
     Object term2942;

    public UnionType_getAlternates_35218345840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2 = new ArrayList();
        ((ArrayList) term2).add((Object)null);
        HashMap term11 = new HashMap();
        HashMap term20 = new HashMap();
        Set<Object> term3007 =  ((Map) term20).keySet();
        HashSet term19 = new HashSet((Collection<? extends Object>) term3007);
        HashMap term27 = new HashMap();
        Set<Object> term3008 =  ((Map) term27).keySet();
        HashSet term26 = new HashSet((Collection<? extends Object>) term3008);
        HashMap term34 = new HashMap();
        Set<Object> term3009 =  ((Map) term34).keySet();
        HashSet term33 = new HashSet((Collection<? extends Object>) term3009);
        HashMap term40 = new HashMap();
        HashMap term48 = new HashMap();
        HashMap term53 = new HashMap();
        term1 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term9 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term1, term1.getClass(), "alternates", term2);
        setIntField(term1, term1.getClass(), "hashcode", -1955890973);
        setBooleanField(term1, term1.getClass(), "resolved", true);
        setField(term1, term1.getClass(), "resolveResult", null);
        setBooleanField(term1, term1.getClass(), "inTemplatedCheckVisit", false);
        setField(term9, term9.getClass(), "reporter", null);
        setField(term9, term9.getClass(), "nativeTypes", term10);
        setField(term9, term9.getClass(), "namesToTypes", term11);
        setField(term9, term9.getClass(), "namespaces", term19);
        setField(term9, term9.getClass(), "nonNullableTypeNames", term26);
        setField(term9, term9.getClass(), "forwardDeclaredTypes", term33);
        setField(term9, term9.getClass(), "typesIndexedByProperty", term40);
        setField(term9, term9.getClass(), "eachRefTypeIndexedByProperty", term48);
        setField(term9, term9.getClass(), "greatestSubtypeByProperty", term53);
        setField(term9, term9.getClass(), "interfaceToImplementors", null);
        setField(term9, term9.getClass(), "unresolvedNamedTypes", null);
        setField(term9, term9.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9, term9.getClass(), "lastGeneration", false);
        setField(term9, term9.getClass(), "templateTypes", null);
        setBooleanField(term9, term9.getClass(), "tolerateUndefinedValues", false);
        setField(term9, term9.getClass(), "resolveMode", null);
        setField(term1, term1.getClass(), "registry", term9);
        ArrayList term2993 = new ArrayList();
        ((ArrayList) term2993).add((Object)null);
        HashMap term2997 = new HashMap();
        HashMap term2999 = new HashMap();
        Set<Object> term3010 =  ((Map) term2999).keySet();
        HashSet term2998 = new HashSet((Collection<? extends Object>) term3010);
        HashMap term3001 = new HashMap();
        Set<Object> term3011 =  ((Map) term3001).keySet();
        HashSet term3000 = new HashSet((Collection<? extends Object>) term3011);
        HashMap term3003 = new HashMap();
        Set<Object> term3012 =  ((Map) term3003).keySet();
        HashSet term3002 = new HashSet((Collection<? extends Object>) term3012);
        HashMap term3004 = new HashMap();
        HashMap term3005 = new HashMap();
        HashMap term3006 = new HashMap();
        term2992 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2995 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2996 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term2992, term2992.getClass(), "alternates", term2993);
        setIntField(term2992, term2992.getClass(), "hashcode", -1955890973);
        setBooleanField(term2992, term2992.getClass(), "resolved", true);
        setField(term2992, term2992.getClass(), "resolveResult", null);
        setBooleanField(term2992, term2992.getClass(), "inTemplatedCheckVisit", false);
        setField(term2995, term2995.getClass(), "reporter", null);
        setField(term2995, term2995.getClass(), "nativeTypes", term2996);
        setField(term2995, term2995.getClass(), "namesToTypes", term2997);
        setField(term2995, term2995.getClass(), "namespaces", term2998);
        setField(term2995, term2995.getClass(), "nonNullableTypeNames", term3000);
        setField(term2995, term2995.getClass(), "forwardDeclaredTypes", term3002);
        setField(term2995, term2995.getClass(), "typesIndexedByProperty", term3004);
        setField(term2995, term2995.getClass(), "eachRefTypeIndexedByProperty", term3005);
        setField(term2995, term2995.getClass(), "greatestSubtypeByProperty", term3006);
        setField(term2995, term2995.getClass(), "interfaceToImplementors", null);
        setField(term2995, term2995.getClass(), "unresolvedNamedTypes", null);
        setField(term2995, term2995.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2995, term2995.getClass(), "lastGeneration", false);
        setField(term2995, term2995.getClass(), "templateTypes", null);
        setBooleanField(term2995, term2995.getClass(), "tolerateUndefinedValues", false);
        setField(term2995, term2995.getClass(), "resolveMode", null);
        setField(term2992, term2992.getClass(), "registry", term2995);
        term2942 = new ArrayList();
        ((ArrayList) term2942).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAlternates", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term2992));
        assertTrue(recursiveEquals(retValue, term2942));
    }

};


