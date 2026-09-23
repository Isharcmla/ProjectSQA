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

public class JSTypeRegistry_createAnonymousObjectType_762441346152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11986;

    public JSTypeRegistry_createAnonymousObjectType_762441346152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11988 = new HashMap();
        HashMap term11998 = new HashMap();
        Set<Object> term506716 =  ((Map) term11998).keySet();
        HashSet term11997 = new HashSet((Collection<? extends Object>) term506716);
        HashMap term12023 = new HashMap();
        Set<Object> term506717 =  ((Map) term12023).keySet();
        HashSet term12022 = new HashSet((Collection<? extends Object>) term506717);
        HashMap term12034 = new HashMap();
        Set<Object> term506718 =  ((Map) term12034).keySet();
        HashSet term12033 = new HashSet((Collection<? extends Object>) term506718);
        HashMap term12048 = new HashMap();
        HashMap term12063 = new HashMap();
        HashMap term12068 = new HashMap();
        term11986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term11987 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term11986, term11986.getClass(), "reporter", null);
        setField(term11986, term11986.getClass(), "nativeTypes", term11987);
        setField(term11986, term11986.getClass(), "namesToTypes", term11988);
        setField(term11986, term11986.getClass(), "namespaces", term11997);
        setField(term11986, term11986.getClass(), "nonNullableTypeNames", term12022);
        setField(term11986, term11986.getClass(), "forwardDeclaredTypes", term12033);
        setField(term11986, term11986.getClass(), "typesIndexedByProperty", term12048);
        setField(term11986, term11986.getClass(), "eachRefTypeIndexedByProperty", term12063);
        setField(term11986, term11986.getClass(), "greatestSubtypeByProperty", term12068);
        setField(term11986, term11986.getClass(), "interfaceToImplementors", null);
        setField(term11986, term11986.getClass(), "unresolvedNamedTypes", null);
        setField(term11986, term11986.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11986, term11986.getClass(), "lastGeneration", false);
        setField(term11986, term11986.getClass(), "templateTypeName", null);
        setField(term11986, term11986.getClass(), "templateType", null);
        setBooleanField(term11986, term11986.getClass(), "tolerateUndefinedValues", false);
        setField(term11986, term11986.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createAnonymousObjectType", argTypes, term11986, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


