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

public class UnionType_isDict_91087022153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term865;

    public UnionType_isDict_91087022153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term866 = new ArrayList();
        ((ArrayList) term866).add((Object)null);
        HashMap term875 = new HashMap();
        HashMap term884 = new HashMap();
        Set<Object> term6253 =  ((Map) term884).keySet();
        HashSet term883 = new HashSet((Collection<? extends Object>) term6253);
        HashMap term891 = new HashMap();
        Set<Object> term6254 =  ((Map) term891).keySet();
        HashSet term890 = new HashSet((Collection<? extends Object>) term6254);
        HashMap term898 = new HashMap();
        Set<Object> term6255 =  ((Map) term898).keySet();
        HashSet term897 = new HashSet((Collection<? extends Object>) term6255);
        HashMap term904 = new HashMap();
        HashMap term912 = new HashMap();
        HashMap term917 = new HashMap();
        term865 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term873 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term874 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term865, term865.getClass(), "alternates", term866);
        setIntField(term865, term865.getClass(), "hashcode", -1465035361);
        setBooleanField(term865, term865.getClass(), "resolved", false);
        setField(term865, term865.getClass(), "resolveResult", null);
        setBooleanField(term865, term865.getClass(), "inTemplatedCheckVisit", false);
        setField(term873, term873.getClass(), "reporter", null);
        setField(term873, term873.getClass(), "nativeTypes", term874);
        setField(term873, term873.getClass(), "namesToTypes", term875);
        setField(term873, term873.getClass(), "namespaces", term883);
        setField(term873, term873.getClass(), "nonNullableTypeNames", term890);
        setField(term873, term873.getClass(), "forwardDeclaredTypes", term897);
        setField(term873, term873.getClass(), "typesIndexedByProperty", term904);
        setField(term873, term873.getClass(), "eachRefTypeIndexedByProperty", term912);
        setField(term873, term873.getClass(), "greatestSubtypeByProperty", term917);
        setField(term873, term873.getClass(), "interfaceToImplementors", null);
        setField(term873, term873.getClass(), "unresolvedNamedTypes", null);
        setField(term873, term873.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term873, term873.getClass(), "lastGeneration", false);
        setField(term873, term873.getClass(), "templateTypes", null);
        setBooleanField(term873, term873.getClass(), "tolerateUndefinedValues", false);
        setField(term873, term873.getClass(), "resolveMode", null);
        setField(term865, term865.getClass(), "registry", term873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isDict", argTypes, term865, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


