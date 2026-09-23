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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_forwardDeclareType_1620009912111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4721;
     Object term486360;

    public JSTypeRegistry_forwardDeclareType_1620009912111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4723 = new HashMap();
        HashMap term4733 = new HashMap();
        Set<Object> term486376 =  ((Map) term4733).keySet();
        HashSet term4732 = new HashSet((Collection<? extends Object>) term486376);
        HashMap term4752 = new HashMap();
        Set<Object> term486377 =  ((Map) term4752).keySet();
        HashSet term4751 = new HashSet((Collection<? extends Object>) term486377);
        HashMap term4773 = new HashMap();
        Set<Object> term486378 =  ((Map) term4773).keySet();
        HashSet term4772 = new HashSet((Collection<? extends Object>) term486378);
        HashMap term4795 = new HashMap();
        HashMap term4810 = new HashMap();
        HashMap term4815 = new HashMap();
        term4721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4722 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term4721, term4721.getClass(), "reporter", null);
        setField(term4721, term4721.getClass(), "nativeTypes", term4722);
        setField(term4721, term4721.getClass(), "namesToTypes", term4723);
        setField(term4721, term4721.getClass(), "namespaces", term4732);
        setField(term4721, term4721.getClass(), "nonNullableTypeNames", term4751);
        setField(term4721, term4721.getClass(), "forwardDeclaredTypes", term4772);
        setField(term4721, term4721.getClass(), "typesIndexedByProperty", term4795);
        setField(term4721, term4721.getClass(), "eachRefTypeIndexedByProperty", term4810);
        setField(term4721, term4721.getClass(), "greatestSubtypeByProperty", term4815);
        setField(term4721, term4721.getClass(), "interfaceToImplementors", null);
        setField(term4721, term4721.getClass(), "unresolvedNamedTypes", null);
        setField(term4721, term4721.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4721, term4721.getClass(), "lastGeneration", false);
        setField(term4721, term4721.getClass(), "templateTypeName", null);
        setField(term4721, term4721.getClass(), "templateType", null);
        setBooleanField(term4721, term4721.getClass(), "tolerateUndefinedValues", false);
        setField(term4721, term4721.getClass(), "resolveMode", null);
        HashMap term486362 = new HashMap();
        HashMap term486364 = new HashMap();
        Set<Object> term486389 =  ((Map) term486364).keySet();
        HashSet term486363 = new HashSet((Collection<? extends Object>) term486389);
        HashMap term486366 = new HashMap();
        Set<Object> term486390 =  ((Map) term486366).keySet();
        HashSet term486365 = new HashSet((Collection<? extends Object>) term486390);
        HashMap term486368 = new HashMap();
        Set<Object> term486391 =  ((Map) term486368).keySet();
        HashSet term486367 = new HashSet((Collection<? extends Object>) term486391);
        HashMap term486371 = new HashMap();
        HashMap term486372 = new HashMap();
        HashMap term486373 = new HashMap();
        term486360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term486361 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term486360, term486360.getClass(), "reporter", null);
        setField(term486360, term486360.getClass(), "nativeTypes", term486361);
        setField(term486360, term486360.getClass(), "namesToTypes", term486362);
        setField(term486360, term486360.getClass(), "namespaces", term486363);
        setField(term486360, term486360.getClass(), "nonNullableTypeNames", term486365);
        setField(term486360, term486360.getClass(), "forwardDeclaredTypes", term486367);
        setField(term486360, term486360.getClass(), "typesIndexedByProperty", term486371);
        setField(term486360, term486360.getClass(), "eachRefTypeIndexedByProperty", term486372);
        setField(term486360, term486360.getClass(), "greatestSubtypeByProperty", term486373);
        setField(term486360, term486360.getClass(), "interfaceToImplementors", null);
        setField(term486360, term486360.getClass(), "unresolvedNamedTypes", null);
        setField(term486360, term486360.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term486360, term486360.getClass(), "lastGeneration", false);
        setField(term486360, term486360.getClass(), "templateTypeName", null);
        setField(term486360, term486360.getClass(), "templateType", null);
        setBooleanField(term486360, term486360.getClass(), "tolerateUndefinedValues", false);
        setField(term486360, term486360.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qUWDhAeFJY";
        callMethod(klass, "forwardDeclareType", argTypes, term4721, args);
        assertTrue(recursiveEquals(term4721, term486360));
    }

};


