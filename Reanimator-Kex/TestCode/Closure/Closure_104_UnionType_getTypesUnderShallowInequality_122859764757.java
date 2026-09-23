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

public class UnionType_getTypesUnderShallowInequality_122859764757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3424;

    public UnionType_getTypesUnderShallowInequality_122859764757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3426 = new HashMap();
        Set<Object> term11297 =  ((Map) term3426).keySet();
        HashSet term3425 = new HashSet((Collection<? extends Object>) term11297);
        HashMap term3437 = new HashMap();
        HashMap term3446 = new HashMap();
        Set<Object> term11298 =  ((Map) term3446).keySet();
        HashSet term3445 = new HashSet((Collection<? extends Object>) term11298);
        HashMap term3453 = new HashMap();
        Set<Object> term11299 =  ((Map) term3453).keySet();
        HashSet term3452 = new HashSet((Collection<? extends Object>) term11299);
        HashMap term3460 = new HashMap();
        Set<Object> term11300 =  ((Map) term3460).keySet();
        HashSet term3459 = new HashSet((Collection<? extends Object>) term11300);
        HashMap term3466 = new HashMap();
        HashMap term3471 = new HashMap();
        term3424 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term3435 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3436 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term3492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term3506 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term3424, term3424.getClass(), "alternates", term3425);
        setBooleanField(term3424, term3424.getClass(), "resolved", false);
        setField(term3424, term3424.getClass(), "resolveResult", null);
        setField(term3435, term3435.getClass(), "reporter", null);
        setField(term3435, term3435.getClass(), "nativeTypes", term3436);
        setField(term3435, term3435.getClass(), "namesToTypes", term3437);
        setField(term3435, term3435.getClass(), "namespaces", term3445);
        setField(term3435, term3435.getClass(), "enumTypeNames", term3452);
        setField(term3435, term3435.getClass(), "forwardDeclaredTypes", term3459);
        setField(term3435, term3435.getClass(), "typesIndexedByProperty", term3466);
        setField(term3435, term3435.getClass(), "greatestSubtypeByProperty", term3471);
        setField(term3435, term3435.getClass(), "interfaceToImplementors", null);
        setField(term3435, term3435.getClass(), "unresolvedNamedTypes", null);
        setField(term3435, term3435.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3435, term3435.getClass(), "lastGeneration", false);
        setField(term3435, term3435.getClass(), "templateTypeName", "iiHBhsNFgk");
        setField(term3492, term3492.getClass(), "name", "HknsTajwxJ");
        setField(term3492, term3492.getClass(), "referencedType", null);
        setBooleanField(term3492, term3492.getClass(), "visited", true);
        setField(term3506, term3506.getClass(), "info", null);
        setField(term3506, term3506.getClass(), "documentation", null);
        setField(term3506, term3506.getClass(), "sourceName", null);
        setField(term3506, term3506.getClass(), "visibility", null);
        setIntField(term3506, term3506.getClass(), "bitset", 0);
        setField(term3506, term3506.getClass(), "type", null);
        setField(term3506, term3506.getClass(), "thisType", null);
        setBooleanField(term3506, term3506.getClass(), "includeDocumentation", false);
        setField(term3492, term3492.getClass(), "docInfo", term3506);
        setBooleanField(term3492, term3492.getClass(), "unknown", true);
        setBooleanField(term3492, term3492.getClass(), "resolved", true);
        setField(term3492, term3492.getClass(), "resolveResult", null);
        setField(term3492, term3492.getClass(), "registry", null);
        setField(term3435, term3435.getClass(), "templateType", term3492);
        setField(term3424, term3424.getClass(), "registry", term3435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getTypesUnderShallowInequality", argTypes, term3424, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


