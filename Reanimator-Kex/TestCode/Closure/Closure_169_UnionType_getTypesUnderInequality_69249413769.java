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

public class UnionType_getTypesUnderInequality_69249413769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1997;

    public UnionType_getTypesUnderInequality_69249413769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1998 = new ArrayList();
        ((ArrayList) term1998).add((Object)null);
        ((ArrayList) term1998).add((Object)null);
        ((ArrayList) term1998).add((Object)null);
        ((ArrayList) term1998).add((Object)null);
        HashMap term2007 = new HashMap();
        HashMap term2016 = new HashMap();
        Set<Object> term10213 =  ((Map) term2016).keySet();
        HashSet term2015 = new HashSet((Collection<? extends Object>) term10213);
        HashMap term2023 = new HashMap();
        Set<Object> term10214 =  ((Map) term2023).keySet();
        HashSet term2022 = new HashSet((Collection<? extends Object>) term10214);
        HashMap term2030 = new HashMap();
        Set<Object> term10215 =  ((Map) term2030).keySet();
        HashSet term2029 = new HashSet((Collection<? extends Object>) term10215);
        HashMap term2036 = new HashMap();
        HashMap term2044 = new HashMap();
        HashMap term2049 = new HashMap();
        term1997 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2005 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2006 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term1997, term1997.getClass(), "alternates", term1998);
        setIntField(term1997, term1997.getClass(), "hashcode", -1970452551);
        setBooleanField(term1997, term1997.getClass(), "resolved", false);
        setField(term1997, term1997.getClass(), "resolveResult", null);
        setBooleanField(term1997, term1997.getClass(), "inTemplatedCheckVisit", true);
        setField(term2005, term2005.getClass(), "reporter", null);
        setField(term2005, term2005.getClass(), "nativeTypes", term2006);
        setField(term2005, term2005.getClass(), "namesToTypes", term2007);
        setField(term2005, term2005.getClass(), "namespaces", term2015);
        setField(term2005, term2005.getClass(), "nonNullableTypeNames", term2022);
        setField(term2005, term2005.getClass(), "forwardDeclaredTypes", term2029);
        setField(term2005, term2005.getClass(), "typesIndexedByProperty", term2036);
        setField(term2005, term2005.getClass(), "eachRefTypeIndexedByProperty", term2044);
        setField(term2005, term2005.getClass(), "greatestSubtypeByProperty", term2049);
        setField(term2005, term2005.getClass(), "interfaceToImplementors", null);
        setField(term2005, term2005.getClass(), "unresolvedNamedTypes", null);
        setField(term2005, term2005.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2005, term2005.getClass(), "lastGeneration", false);
        setField(term2005, term2005.getClass(), "templateTypes", null);
        setBooleanField(term2005, term2005.getClass(), "tolerateUndefinedValues", false);
        setField(term2005, term2005.getClass(), "resolveMode", null);
        setField(term1997, term1997.getClass(), "registry", term2005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getTypesUnderInequality", argTypes, term1997, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


