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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_getTypesUnderInequality_69249413756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3313;

    public UnionType_getTypesUnderInequality_69249413756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3315 = new HashMap();
        Set<Object> term10801 =  ((Map) term3315).keySet();
        HashSet term3314 = new HashSet((Collection<? extends Object>) term10801);
        HashMap term3326 = new HashMap();
        HashMap term3335 = new HashMap();
        Set<Object> term10802 =  ((Map) term3335).keySet();
        HashSet term3334 = new HashSet((Collection<? extends Object>) term10802);
        HashMap term3342 = new HashMap();
        Set<Object> term10803 =  ((Map) term3342).keySet();
        HashSet term3341 = new HashSet((Collection<? extends Object>) term10803);
        HashMap term3349 = new HashMap();
        Set<Object> term10804 =  ((Map) term3349).keySet();
        HashSet term3348 = new HashSet((Collection<? extends Object>) term10804);
        HashMap term3355 = new HashMap();
        HashMap term3360 = new HashMap();
        term3313 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term3324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3325 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term3381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term3395 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term3313, term3313.getClass(), "alternates", term3314);
        setBooleanField(term3313, term3313.getClass(), "resolved", false);
        setField(term3313, term3313.getClass(), "resolveResult", null);
        setField(term3324, term3324.getClass(), "reporter", null);
        setField(term3324, term3324.getClass(), "nativeTypes", term3325);
        setField(term3324, term3324.getClass(), "namesToTypes", term3326);
        setField(term3324, term3324.getClass(), "namespaces", term3334);
        setField(term3324, term3324.getClass(), "enumTypeNames", term3341);
        setField(term3324, term3324.getClass(), "forwardDeclaredTypes", term3348);
        setField(term3324, term3324.getClass(), "typesIndexedByProperty", term3355);
        setField(term3324, term3324.getClass(), "greatestSubtypeByProperty", term3360);
        setField(term3324, term3324.getClass(), "interfaceToImplementors", null);
        setField(term3324, term3324.getClass(), "unresolvedNamedTypes", null);
        setField(term3324, term3324.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3324, term3324.getClass(), "lastGeneration", false);
        setField(term3324, term3324.getClass(), "templateTypeName", "MqICFYzDJj");
        setField(term3381, term3381.getClass(), "name", "YgQvdcBQKw");
        setField(term3381, term3381.getClass(), "referencedType", null);
        setBooleanField(term3381, term3381.getClass(), "visited", true);
        setField(term3395, term3395.getClass(), "info", null);
        setField(term3395, term3395.getClass(), "documentation", null);
        setField(term3395, term3395.getClass(), "sourceName", null);
        setField(term3395, term3395.getClass(), "visibility", null);
        setIntField(term3395, term3395.getClass(), "bitset", 0);
        setField(term3395, term3395.getClass(), "type", null);
        setField(term3395, term3395.getClass(), "thisType", null);
        setBooleanField(term3395, term3395.getClass(), "includeDocumentation", false);
        setField(term3381, term3381.getClass(), "docInfo", term3395);
        setBooleanField(term3381, term3381.getClass(), "unknown", false);
        setBooleanField(term3381, term3381.getClass(), "resolved", true);
        setField(term3381, term3381.getClass(), "resolveResult", null);
        setField(term3381, term3381.getClass(), "registry", null);
        setField(term3324, term3324.getClass(), "templateType", term3381);
        setField(term3313, term3313.getClass(), "registry", term3324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getTypesUnderInequality", argTypes, term3313, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


