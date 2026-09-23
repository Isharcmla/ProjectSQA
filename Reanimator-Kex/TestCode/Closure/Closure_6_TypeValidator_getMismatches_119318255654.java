package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeValidator_getMismatches_119318255654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term9986;

    public TypeValidator_getMismatches_119318255654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4 = new HashMap();
        HashMap term13 = new HashMap();
        Set<Object> term9999 =  ((Map) term13).keySet();
        HashSet term12 = new HashSet((Collection<? extends Object>) term9999);
        HashMap term20 = new HashMap();
        Set<Object> term10000 =  ((Map) term20).keySet();
        HashSet term19 = new HashSet((Collection<? extends Object>) term10000);
        HashMap term27 = new HashMap();
        Set<Object> term10001 =  ((Map) term27).keySet();
        HashSet term26 = new HashSet((Collection<? extends Object>) term10001);
        HashMap term33 = new HashMap();
        HashMap term41 = new HashMap();
        HashMap term46 = new HashMap();
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1, term1.getClass(), "compiler", null);
        setField(term2, term2.getClass(), "reporter", null);
        setField(term2, term2.getClass(), "nativeTypes", term3);
        setField(term2, term2.getClass(), "namesToTypes", term4);
        setField(term2, term2.getClass(), "namespaces", term12);
        setField(term2, term2.getClass(), "nonNullableTypeNames", term19);
        setField(term2, term2.getClass(), "forwardDeclaredTypes", term26);
        setField(term2, term2.getClass(), "typesIndexedByProperty", term33);
        setField(term2, term2.getClass(), "eachRefTypeIndexedByProperty", term41);
        setField(term2, term2.getClass(), "greatestSubtypeByProperty", term46);
        setField(term2, term2.getClass(), "interfaceToImplementors", null);
        setField(term2, term2.getClass(), "unresolvedNamedTypes", null);
        setField(term2, term2.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2, term2.getClass(), "lastGeneration", false);
        setField(term2, term2.getClass(), "templateTypes", null);
        setBooleanField(term2, term2.getClass(), "tolerateUndefinedValues", false);
        setField(term2, term2.getClass(), "resolveMode", null);
        setField(term1, term1.getClass(), "typeRegistry", term2);
        setField(term1, term1.getClass(), "allValueTypes", null);
        setBooleanField(term1, term1.getClass(), "shouldReport", false);
        setField(term1, term1.getClass(), "nullOrUndefined", null);
        setField(term1, term1.getClass(), "mismatches", null);
        HashMap term9989 = new HashMap();
        HashMap term9991 = new HashMap();
        Set<Object> term10002 =  ((Map) term9991).keySet();
        HashSet term9990 = new HashSet((Collection<? extends Object>) term10002);
        HashMap term9993 = new HashMap();
        Set<Object> term10003 =  ((Map) term9993).keySet();
        HashSet term9992 = new HashSet((Collection<? extends Object>) term10003);
        HashMap term9995 = new HashMap();
        Set<Object> term10004 =  ((Map) term9995).keySet();
        HashSet term9994 = new HashSet((Collection<? extends Object>) term10004);
        HashMap term9996 = new HashMap();
        HashMap term9997 = new HashMap();
        HashMap term9998 = new HashMap();
        term9986 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term9987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term9988 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term9986, term9986.getClass(), "compiler", null);
        setField(term9987, term9987.getClass(), "reporter", null);
        setField(term9987, term9987.getClass(), "nativeTypes", term9988);
        setField(term9987, term9987.getClass(), "namesToTypes", term9989);
        setField(term9987, term9987.getClass(), "namespaces", term9990);
        setField(term9987, term9987.getClass(), "nonNullableTypeNames", term9992);
        setField(term9987, term9987.getClass(), "forwardDeclaredTypes", term9994);
        setField(term9987, term9987.getClass(), "typesIndexedByProperty", term9996);
        setField(term9987, term9987.getClass(), "eachRefTypeIndexedByProperty", term9997);
        setField(term9987, term9987.getClass(), "greatestSubtypeByProperty", term9998);
        setField(term9987, term9987.getClass(), "interfaceToImplementors", null);
        setField(term9987, term9987.getClass(), "unresolvedNamedTypes", null);
        setField(term9987, term9987.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9987, term9987.getClass(), "lastGeneration", false);
        setField(term9987, term9987.getClass(), "templateTypes", null);
        setBooleanField(term9987, term9987.getClass(), "tolerateUndefinedValues", false);
        setField(term9987, term9987.getClass(), "resolveMode", null);
        setField(term9986, term9986.getClass(), "typeRegistry", term9987);
        setField(term9986, term9986.getClass(), "allValueTypes", null);
        setBooleanField(term9986, term9986.getClass(), "shouldReport", false);
        setField(term9986, term9986.getClass(), "nullOrUndefined", null);
        setField(term9986, term9986.getClass(), "mismatches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMismatches", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term9986));
        assertTrue(recursiveEquals(retValue, null));
    }

};


