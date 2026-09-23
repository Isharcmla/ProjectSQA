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
import java.lang.Boolean;

public class UnionType_hasAlternate_17488775157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1192;
     Object term1252;

    public UnionType_hasAlternate_17488775157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1193 = new ArrayList();
        ((ArrayList) term1193).add((Object)null);
        ((ArrayList) term1193).add((Object)null);
        HashMap term1202 = new HashMap();
        HashMap term1211 = new HashMap();
        Set<Object> term7325 =  ((Map) term1211).keySet();
        HashSet term1210 = new HashSet((Collection<? extends Object>) term7325);
        HashMap term1218 = new HashMap();
        Set<Object> term7326 =  ((Map) term1218).keySet();
        HashSet term1217 = new HashSet((Collection<? extends Object>) term7326);
        HashMap term1224 = new HashMap();
        Set<Object> term7327 =  ((Map) term1224).keySet();
        HashSet term1223 = new HashSet((Collection<? extends Object>) term7327);
        HashMap term1229 = new HashMap();
        HashMap term1237 = new HashMap();
        HashMap term1242 = new HashMap();
        term1192 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1201 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term1192, term1192.getClass(), "alternates", term1193);
        setIntField(term1192, term1192.getClass(), "hashcode", 890669485);
        setBooleanField(term1192, term1192.getClass(), "resolved", false);
        setField(term1192, term1192.getClass(), "resolveResult", null);
        setBooleanField(term1192, term1192.getClass(), "inTemplatedCheckVisit", false);
        setField(term1200, term1200.getClass(), "reporter", null);
        setField(term1200, term1200.getClass(), "nativeTypes", term1201);
        setField(term1200, term1200.getClass(), "namesToTypes", term1202);
        setField(term1200, term1200.getClass(), "namespaces", term1210);
        setField(term1200, term1200.getClass(), "nonNullableTypeNames", term1217);
        setField(term1200, term1200.getClass(), "forwardDeclaredTypes", term1223);
        setField(term1200, term1200.getClass(), "typesIndexedByProperty", term1229);
        setField(term1200, term1200.getClass(), "eachRefTypeIndexedByProperty", term1237);
        setField(term1200, term1200.getClass(), "greatestSubtypeByProperty", term1242);
        setField(term1200, term1200.getClass(), "interfaceToImplementors", null);
        setField(term1200, term1200.getClass(), "unresolvedNamedTypes", null);
        setField(term1200, term1200.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1200, term1200.getClass(), "lastGeneration", false);
        setField(term1200, term1200.getClass(), "templateTypes", null);
        setBooleanField(term1200, term1200.getClass(), "tolerateUndefinedValues", false);
        setField(term1200, term1200.getClass(), "resolveMode", null);
        setField(term1192, term1192.getClass(), "registry", term1200);
        term1252 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1252;
        try {
            callMethod(klass, "hasAlternate", argTypes, term1192, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


