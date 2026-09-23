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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class JSTypeRegistry_createRecordType_140818423150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11715;
     Object term11789;

    public JSTypeRegistry_createRecordType_140818423150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11717 = new HashMap();
        HashMap term11727 = new HashMap();
        Set<Object> term505990 =  ((Map) term11727).keySet();
        HashSet term11726 = new HashSet((Collection<? extends Object>) term505990);
        HashMap term11733 = new HashMap();
        Set<Object> term505991 =  ((Map) term11733).keySet();
        HashSet term11732 = new HashSet((Collection<? extends Object>) term505991);
        HashMap term11742 = new HashMap();
        Set<Object> term505992 =  ((Map) term11742).keySet();
        HashSet term11741 = new HashSet((Collection<? extends Object>) term505992);
        HashMap term11758 = new HashMap();
        HashMap term11773 = new HashMap();
        HashMap term11778 = new HashMap();
        term11715 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term11716 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term11715, term11715.getClass(), "reporter", null);
        setField(term11715, term11715.getClass(), "nativeTypes", term11716);
        setField(term11715, term11715.getClass(), "namesToTypes", term11717);
        setField(term11715, term11715.getClass(), "namespaces", term11726);
        setField(term11715, term11715.getClass(), "nonNullableTypeNames", term11732);
        setField(term11715, term11715.getClass(), "forwardDeclaredTypes", term11741);
        setField(term11715, term11715.getClass(), "typesIndexedByProperty", term11758);
        setField(term11715, term11715.getClass(), "eachRefTypeIndexedByProperty", term11773);
        setField(term11715, term11715.getClass(), "greatestSubtypeByProperty", term11778);
        setField(term11715, term11715.getClass(), "interfaceToImplementors", null);
        setField(term11715, term11715.getClass(), "unresolvedNamedTypes", null);
        setField(term11715, term11715.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11715, term11715.getClass(), "lastGeneration", false);
        setField(term11715, term11715.getClass(), "templateTypeName", null);
        setField(term11715, term11715.getClass(), "templateType", null);
        setBooleanField(term11715, term11715.getClass(), "tolerateUndefinedValues", false);
        setField(term11715, term11715.getClass(), "resolveMode", null);
        term11789 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term11789;
        try {
            callMethod(klass, "createRecordType", argTypes, term11715, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


