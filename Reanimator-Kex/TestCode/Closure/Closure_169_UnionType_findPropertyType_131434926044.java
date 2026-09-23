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

public class UnionType_findPropertyType_131434926044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261;

    public UnionType_findPropertyType_131434926044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term262 = new ArrayList();
        ((ArrayList) term262).add((Object)null);
        ((ArrayList) term262).add((Object)null);
        ((ArrayList) term262).add((Object)null);
        ((ArrayList) term262).add((Object)null);
        ((ArrayList) term262).add((Object)null);
        ((ArrayList) term262).add((Object)null);
        ((ArrayList) term262).add((Object)null);
        HashMap term271 = new HashMap();
        HashMap term280 = new HashMap();
        Set<Object> term4083 =  ((Map) term280).keySet();
        HashSet term279 = new HashSet((Collection<? extends Object>) term4083);
        HashMap term287 = new HashMap();
        Set<Object> term4084 =  ((Map) term287).keySet();
        HashSet term286 = new HashSet((Collection<? extends Object>) term4084);
        HashMap term294 = new HashMap();
        Set<Object> term4085 =  ((Map) term294).keySet();
        HashSet term293 = new HashSet((Collection<? extends Object>) term4085);
        HashMap term300 = new HashMap();
        HashMap term308 = new HashMap();
        HashMap term313 = new HashMap();
        term261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term270 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term261, term261.getClass(), "alternates", term262);
        setIntField(term261, term261.getClass(), "hashcode", -203030934);
        setBooleanField(term261, term261.getClass(), "resolved", false);
        setField(term261, term261.getClass(), "resolveResult", null);
        setBooleanField(term261, term261.getClass(), "inTemplatedCheckVisit", true);
        setField(term269, term269.getClass(), "reporter", null);
        setField(term269, term269.getClass(), "nativeTypes", term270);
        setField(term269, term269.getClass(), "namesToTypes", term271);
        setField(term269, term269.getClass(), "namespaces", term279);
        setField(term269, term269.getClass(), "nonNullableTypeNames", term286);
        setField(term269, term269.getClass(), "forwardDeclaredTypes", term293);
        setField(term269, term269.getClass(), "typesIndexedByProperty", term300);
        setField(term269, term269.getClass(), "eachRefTypeIndexedByProperty", term308);
        setField(term269, term269.getClass(), "greatestSubtypeByProperty", term313);
        setField(term269, term269.getClass(), "interfaceToImplementors", null);
        setField(term269, term269.getClass(), "unresolvedNamedTypes", null);
        setField(term269, term269.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term269, term269.getClass(), "lastGeneration", false);
        setField(term269, term269.getClass(), "templateTypes", null);
        setBooleanField(term269, term269.getClass(), "tolerateUndefinedValues", false);
        setField(term269, term269.getClass(), "resolveMode", null);
        setField(term261, term261.getClass(), "registry", term269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GrqozDKFOk";
        try {
            callMethod(klass, "findPropertyType", argTypes, term261, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


