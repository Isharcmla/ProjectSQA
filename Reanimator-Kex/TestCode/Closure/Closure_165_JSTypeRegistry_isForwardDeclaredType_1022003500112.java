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

public class JSTypeRegistry_isForwardDeclaredType_1022003500112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4851;
     Object term486402;

    public JSTypeRegistry_isForwardDeclaredType_1022003500112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4853 = new HashMap();
        HashMap term4863 = new HashMap();
        Set<Object> term486416 =  ((Map) term4863).keySet();
        HashSet term4862 = new HashSet((Collection<? extends Object>) term486416);
        HashMap term4874 = new HashMap();
        Set<Object> term486417 =  ((Map) term4874).keySet();
        HashSet term4873 = new HashSet((Collection<? extends Object>) term486417);
        HashMap term4891 = new HashMap();
        Set<Object> term486418 =  ((Map) term4891).keySet();
        HashSet term4890 = new HashSet((Collection<? extends Object>) term486418);
        HashMap term4903 = new HashMap();
        HashMap term4918 = new HashMap();
        HashMap term4923 = new HashMap();
        term4851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4852 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term4851, term4851.getClass(), "reporter", null);
        setField(term4851, term4851.getClass(), "nativeTypes", term4852);
        setField(term4851, term4851.getClass(), "namesToTypes", term4853);
        setField(term4851, term4851.getClass(), "namespaces", term4862);
        setField(term4851, term4851.getClass(), "nonNullableTypeNames", term4873);
        setField(term4851, term4851.getClass(), "forwardDeclaredTypes", term4890);
        setField(term4851, term4851.getClass(), "typesIndexedByProperty", term4903);
        setField(term4851, term4851.getClass(), "eachRefTypeIndexedByProperty", term4918);
        setField(term4851, term4851.getClass(), "greatestSubtypeByProperty", term4923);
        setField(term4851, term4851.getClass(), "interfaceToImplementors", null);
        setField(term4851, term4851.getClass(), "unresolvedNamedTypes", null);
        setField(term4851, term4851.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4851, term4851.getClass(), "lastGeneration", false);
        setField(term4851, term4851.getClass(), "templateTypeName", null);
        setField(term4851, term4851.getClass(), "templateType", null);
        setBooleanField(term4851, term4851.getClass(), "tolerateUndefinedValues", false);
        setField(term4851, term4851.getClass(), "resolveMode", null);
        HashMap term486404 = new HashMap();
        HashMap term486406 = new HashMap();
        Set<Object> term486429 =  ((Map) term486406).keySet();
        HashSet term486405 = new HashSet((Collection<? extends Object>) term486429);
        HashMap term486408 = new HashMap();
        Set<Object> term486430 =  ((Map) term486408).keySet();
        HashSet term486407 = new HashSet((Collection<? extends Object>) term486430);
        HashMap term486410 = new HashMap();
        Set<Object> term486431 =  ((Map) term486410).keySet();
        HashSet term486409 = new HashSet((Collection<? extends Object>) term486431);
        HashMap term486411 = new HashMap();
        HashMap term486412 = new HashMap();
        HashMap term486413 = new HashMap();
        term486402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term486403 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term486402, term486402.getClass(), "reporter", null);
        setField(term486402, term486402.getClass(), "nativeTypes", term486403);
        setField(term486402, term486402.getClass(), "namesToTypes", term486404);
        setField(term486402, term486402.getClass(), "namespaces", term486405);
        setField(term486402, term486402.getClass(), "nonNullableTypeNames", term486407);
        setField(term486402, term486402.getClass(), "forwardDeclaredTypes", term486409);
        setField(term486402, term486402.getClass(), "typesIndexedByProperty", term486411);
        setField(term486402, term486402.getClass(), "eachRefTypeIndexedByProperty", term486412);
        setField(term486402, term486402.getClass(), "greatestSubtypeByProperty", term486413);
        setField(term486402, term486402.getClass(), "interfaceToImplementors", null);
        setField(term486402, term486402.getClass(), "unresolvedNamedTypes", null);
        setField(term486402, term486402.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term486402, term486402.getClass(), "lastGeneration", false);
        setField(term486402, term486402.getClass(), "templateTypeName", null);
        setField(term486402, term486402.getClass(), "templateType", null);
        setBooleanField(term486402, term486402.getClass(), "tolerateUndefinedValues", false);
        setField(term486402, term486402.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mgeIhswNtk";
        callMethod(klass, "isForwardDeclaredType", argTypes, term4851, args);
        assertTrue(recursiveEquals(term4851, term486402));
    }

};


